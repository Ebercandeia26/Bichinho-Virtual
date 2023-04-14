public class Animal{

    private String nome;
    private String classe;
    private String familia;
    private int idade = 0;
    private boolean estado = true;
    private int caloria = 10;
    private int forca = 10;


    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
    }
      


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getClasse() {
        return classe;
    }


    public void setClasse(String classe) {
        this.classe = classe;
    }


    public String getFamilia() {
        return familia;
    }


    public void setFamilia(String familia) {
        this.familia = familia;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public boolean isEstado() {
        return estado;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public int getCaloria() {
        return caloria;
    }


    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }


    public int getForca() {
        return forca;
    }


    public void setForca(int forca) {
        this.forca = forca;
    }

    public void Morrer(){
        this.estado = false;
        this.forca = 0;

        System.out.println("O animal morreu!");
    }

    public void Comer(){
        if(this.caloria <= 100 && this.estado == true){
            this.caloria += 10;
            this.forca -= 2;
            System.out.println("O animal comeu e sua força é de " + this.forca + "e suas calorias valem" + this.caloria);
        }
    }

    public void Correr(){
        if(this.estado == true && this.caloria == 0){
            this.forca -= 5;
            this.caloria -= 5;
            System.out.println("O animal está correndo!! Agora sua força é de " + this.forca + "e suas calorias valem" + this.caloria);
        }
    }
    
    public void Dormir(){
        if(this.estado == true){
            this.forca += 10;
            this.caloria -= 2;
            System.out.println("O animal está dormindo agora! Sua força aumentou para " + forca + " e suas calorias diminuiram para " + caloria);
        }
    }

    
}

