public abstract class Student {
    private int height=0;
    private int exercises=0;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getExercises() {
        return exercises;
    }

    public void addExercises(int exercises) {
        this.exercises += exercises;
    }
    public abstract void doExercises();
}
