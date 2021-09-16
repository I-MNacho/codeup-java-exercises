package interfacesAbstractClassesLecture;
 class Developer extends Employee {

     @Override
    public String doWork(){
        return "Writing code...";
    }

    @Override
    public void quit(){
        System.out.println("Here is my 2 weeks notice.");
    }
}
