import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person implements Comparable<Person> {

    private String name;
    private int docNumber;
    private GregorianCalendar birthday;

    public Person(int day, int month, int year) {
        this.name = "No Name";
        this.docNumber = UniqueNumber.generate();
        this.birthday = new GregorianCalendar();
        createBirthday(day, month, year);
    }

    public Person(String name, int day, int month, int year) {
        if (name == null || name == "") {
            this.name = "No Name";
        }
        else {
            this.name = name;
        }
        this.docNumber = UniqueNumber.generate();
        this.birthday = new GregorianCalendar();
        createBirthday(day, month, year);
    }

    private void createBirthday(int day, int month, int year) {
        if (checkValidityDate(day, month, year)) {
            this.birthday.set(Calendar.DAY_OF_MONTH, day);
            this.birthday.set(Calendar.MONTH, month - 1);
            this.birthday.set(Calendar.YEAR, year);
        } else {
            this.birthday.set(Calendar.DAY_OF_MONTH, 1);
            this.birthday.set(Calendar.MONTH, 0);
            this.birthday.set(Calendar.YEAR, 2015);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public int getYearBirthday() {
        return birthday.get(Calendar.YEAR);
    }

    public int getMonthBirthday() {
        return birthday.get(Calendar.MONTH) + 1;
    }

    public int getDayOfMonthBirthday() {
        return birthday.get(Calendar.DAY_OF_MONTH);
    }

    public String getBirthday() {
        return birthday.get(Calendar.DAY_OF_MONTH) + "." +
                birthday.get(Calendar.MONTH) + "." +
                birthday.get(Calendar.YEAR);
    }

    public int getAge() {
        int curDayOfMonth = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int curMonth = Calendar.getInstance().get(Calendar.MONTH);
        int curYear = Calendar.getInstance().get(Calendar.YEAR);

        if (curMonth < getMonthBirthday()) {
            return curYear - birthday.get(Calendar.YEAR) - 1;
        }
        if (curMonth == getMonthBirthday()) {
            if (curDayOfMonth < getDayOfMonthBirthday()) {
                return curYear - birthday.get(Calendar.YEAR) - 1;
            }
        }
        return curYear - birthday.get(Calendar.YEAR);
    }

    @Override
    public int compareTo(Person entry) {
        int result =  ((Integer)this.getAge()).compareTo((Integer)entry.getAge());
        if (result != 0) {
            return result;
        }

        result = this.docNumber - entry.docNumber;
        if (result != 0) {
            return (int) result / Math.abs(result);
        }
        return result;
    }

    private boolean checkValidityDate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (year < 0) {
            return false;
        }
        if (month == 2) {
            if ((year % 4) == 0) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        }

        if (month >= 1 && month <= 7) {
            if ((month % 2) == 0) {
                if (day > 30) {
                    return false;
                }
            } else {
                if (day > 31) {
                    return false;
                }
            }
        }

        if (month >= 8 && month <= 12) {
            if ((month % 2) == 0) {
                if (day > 31) {
                    return false;
                }
            } else {
                if (day > 30) {
                    return false;
                }
            }
        }
        return  true;
    }
}
