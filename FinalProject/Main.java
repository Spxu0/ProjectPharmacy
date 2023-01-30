public class Main {
    public static void main(String[] args) {
        Pharmacy<String>pharamcy=new Pharmacy<String>();
        Medicine<String>medicine1=new Medicine<String>("1","Paracetamol","ABC",158.7f);
        Medicine<String>medicine2=new Medicine<String>("2","Ibuprofen","XYZ",154.8f);
		Medicine<String>medicine3=new Medicine<String>("3","Aspirin","MNO",149.7f);
        Medicine<String>medicine4=new Medicine<String>("4","superAspirin","NBM",149.7f);
        Medicine<String>medicine5=new Medicine<String>("5","miniAspirin","ips",149.7f);

        pharamcy.addMedicine(medicine3);
        pharamcy.addMedicine(medicine2);
		pharamcy.addMedicine(medicine5);
        pharamcy.addMedicine(medicine4);
        pharamcy.addMedicine(medicine1);
        pharamcy.printAllMedicines();
        System.out.println("\nafter sorting: \n ");
        pharamcy.sortList();
        pharamcy.printAllMedicines();
        System.out.println("\n after updating : \n ");
        pharamcy.updateMedicineUsingTheID("4", "lowAspirin", "DSP", 0.0f);
        pharamcy.printAllMedicines();
        System.out.println("\n after searching : \n ");
        pharamcy.searchForMedicineUsingGivenID("3");
        System.out.println("\n after deltion: \n");
        pharamcy.deleteMedicineByNameAndId("Ibuprofen", "2");
        pharamcy.printAllMedicines();

        

    }
}