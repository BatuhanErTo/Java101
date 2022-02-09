package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }
    public double tax(){
        if (this.salary>1000.0){
            double ntax = this.salary*0.03;
            return ntax;
        }
        return 0;
    }
    public int bonus(){
        if (workHours>40) {
            int bonusHours = this.workHours - 40;
            return bonusHours*30;
        }
        return 0;
    }
    public double raiseYear(){
        int workYear = 2021 - hireYear;
        if (workYear<20){
            if (workYear<=9){
                return this.salary*0.05;
            }else{
                return this.salary*0.10;
            }
        }else{
            return this.salary*0.15;
        }
    }
    public void toPrint(){
        double newSalary = this.salary + bonus() - tax() + raiseYear();
        System.out.println("ADI : "+this.name);
        System.out.println("ÇALIŞMA SAATİ : "+this.workHours);
        System.out.println("BAŞLANGIÇ YILI : "+this.hireYear);
        System.out.println("VERGİ : "+tax());
        System.out.println("BONUS : "+bonus());
        System.out.println("MAAŞ ARTIŞI : "+raiseYear());
        System.out.println("TOPLAM MAAŞ : "+newSalary);
    }
}
