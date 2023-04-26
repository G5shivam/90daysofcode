//package inheritanceEx;

    class ACS {
        String company;
        String model;
        Float capacity;
       ACS(String company, String model, Float capacity) {
            this.company = company;
            this.model = model;
            this.capacity = capacity;
        }
    
        String getDisplay() {
            return "AC [company=" + company + ", model=" + model + ", "
                    + "capacity=" + capacity + "]";
                    
        }
    
    
    }
    public class AC {
    
        public static void main(String[] args) {
           
            ACS a1=new ACS("LG","2023",1.5f);
            a1.getDisplay();
            
        }
    
    }
    

