import Transport.Transport;
import Transport.Racing;

public class Driver<T extends Transport> {
    private String fullName;
    private String category;
    private int experience;


    public Driver(String fullName, String category, int experience) {
        setFullName(fullName);
        setCategory(category);
        setExperience(experience);


    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Неверно ввели ФИО";
        } else {
            this.fullName = fullName;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
            if (category == null || category.isEmpty() || category.isBlank()) {
                this.category = "Неверно ввели категорию ВУ";
            } else {
                this.category = category;
            }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        }
    }

    public void startDriving(T) {

        System.out.println("Водитель поехал");
    }
}
