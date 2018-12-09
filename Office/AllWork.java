package Office;



public   class AllWork  {

    Task[] tasks = new Task[10];
    int freePlaceForTasks = tasks.length;
    int currentUnassignedTasks ;



   void  addTask(Task newTask){
       if (freePlaceForTasks > 0) {
           tasks[tasks.length - freePlaceForTasks--] = newTask;
       }else {
           System.out.println("няма място за повече задачи");
       }
   }

   void  isAllWorkDone(){
       boolean workDone = false;
       for (int i = 0; i <tasks.length ; i++) {
           if (tasks[i].workingHours ==0 ){
               workDone = true;
           }
           else {
               System.out.println("задача " + i + " е неизпълнена");
               workDone = false;
               currentUnassignedTasks = i;
               break;
           }
       }
       if (workDone){
           System.out.println("Всички задачи са изпълнени");
       }
   }

   Task getNextTask(){
       for (int i =0; i <tasks.length ; i++) {
           if (tasks[i].workingHours > 0){
               currentUnassignedTasks = i;
               break;
           }
       }
       return tasks[currentUnassignedTasks];
   }






}
