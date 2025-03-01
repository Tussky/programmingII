public class StaffDemo {
    public static void main(String[] args) {
        Executive exec = new Executive("Bob", "Jones", 0123, 25_000);
        Volunteer volun = new Volunteer("Dilan", "Smiths", 0001, 0);
        Hourly hours = new Hourly("Joan", "Smithers", 0234, 13);

        hours.addHours(88);
        exec.addBonus(5000);

        exec.pay();
        volun.pay();
        hours.pay();

        System.out.println(exec);
        System.out.println(volun);
        System.out.println(hours);
    }
}
