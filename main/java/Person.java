import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person ( String name , String surname , int age , String address ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge () {
        if ( getAge ( ) < 0 ) {
            return false;
        }
        return true;
    }

    public boolean hasAddress () {
        if ( getAddress ( ) == null ) {
            return false;
        }
        return true;
    }

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public void happyBirthday () {
        int ageTemp = getAge ( ) + 1;
        setAge ( ageTemp );
    }

    public PersonBuilder newChildBuilder () {
        return new PersonBuilder ( )
                .setSurname ( getSurname ( ) )
                .setAddress ( getAddress ( ) )
                .setAge ( 5 );
    }


    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", Address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals ( person.name ) &&
                surname.equals ( person.surname ) &&
                Objects.equals ( address , person.address );
    }

    @Override
    public int hashCode () {
        return Objects.hash ( name , surname , age , address );
    }
}