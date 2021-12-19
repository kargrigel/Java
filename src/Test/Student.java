package Test;


    public class Student {
        private String firstName;
        private String lastName;
        private Integer age;
        private String email;

        Student() {
        }

        public void setFirstName(String firstName) {
            char first = firstName.charAt(0);
            if (first >= 'A' && first <= 'Z') {
                this.firstName = firstName;
            }
        }

        public String getFirstName() {
            return firstName;
        }

        public void setAge(int age) {
            if (age >= 0 && age <= 100) {
                this.age = age;
            } else {
                System.out.println("incorrect age");
            }
        }

        public Integer getAge() {
            return age;
        }

        public void getEmail(String email){

            this.email = email;
        }


    }


