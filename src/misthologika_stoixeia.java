class misthologika_stoixeia {
    String perigrafh;//perigrafh misthologikou stoixeiou
    int kwdikos;//Taktikh apodoxh h ektakth apodoxh h prostheth apodoxh
    double syntelesths;//antistoixos syntelesths eite prosauxhshs eite meiwshs eite forou analoga to misthologiko stoixeio

    public misthologika_stoixeia(String perigrafh, int kwdikos, double syntelesths) {
        this.perigrafh=perigrafh;
        this.kwdikos=kwdikos;
        this.syntelesths=syntelesths;
    }
    public misthologika_stoixeia(String perigrafh) {
        this.perigrafh=perigrafh;
    }
    public misthologika_stoixeia(){
        }

    public String toString(){
        if (kwdikos==1) {
        	return "Perigrafh: "+ perigrafh + ", kwdikos: TA" + ", syntelesths: " + syntelesths;
        }
        else if (kwdikos==2) {
        	return "Perigrafh: "+ perigrafh + ", kwdikos: EA"  + ", syntelesths: " + syntelesths;
        }
        else if (kwdikos==3) {
        	return "Perigrafh: "+ perigrafh + ", kwdikos: PA"  + ", syntelesths: " + syntelesths;
        }
        else return "";
    }
}

class ergazomenos extends misthologika_stoixeia{
    String onoma;
    String epwnymo;
    double misthos;
    double pososto;//pososto asfalistikwn eisforwn ergazomenou
    static int counter=0;//gia thn aytomatopoihmenh dhmiourgia xexwristou kwdikou gia kathe ergazomeno
    int kwdikose;//kwdikos sygkekrimenou ergazomenou

    public ergazomenos(String onoma,String epwnymo,double misthos,double pososto) {
    this.onoma=onoma;
    this.epwnymo=epwnymo;
    this.misthos=misthos;
    this.pososto=pososto;
    counter+=1;
    kwdikose=counter;
    if (kwdikose== 1111) {// se periptwsh pou exei hdh ergazomenos kwdiko 1111
    	kwdikose=counter+1;
    }
    }

    public ergazomenos(String epwnymo, String perigrafh, int kwdikose) {
        super(perigrafh); 
        this.epwnymo=epwnymo;
        this.kwdikose=kwdikose;
    }
    
    public ergazomenos(String epwnymo, int kwdikose, double misthos, double pososto) {
    	this.epwnymo=epwnymo;
    	this.kwdikose=kwdikose;
    	this.misthos=misthos;
        this.pososto=pososto;
    }

    public String toString() {
        return "Epwnymo: " + epwnymo + ", misthos: " + misthos + ", pososto asfalistikwn eisforown: " + pososto; 
    }
}

class kinish extends ergazomenos {
    double stoixeio;//px 5 hmeres h 3 wres analoga to misthologiko stoixeio

    public kinish(String epwnymo, String perigrafh, int kwdikose, double stoixeio) {
        super(epwnymo,perigrafh,kwdikose);
        this.stoixeio=stoixeio;
    }
    
    void setRest(int kwdikos,double syntelesths, double misthos, double pososto){//gia na thetei stis kiniseis ta ypoloipa xarakthristika tou ergazomenou kai twn misthologikwn stoixeiwn pou den pairnei apton constructor... profanws kai ginetia na ta pairnei me dhmiourgia tou antistixou constructor alla den exoume katalabei an to thelete me cosntructor h oxi apthn ekfwnhsh..emeis katalabame apto paradeigma oti den ta thelete apton constructor opote to kaname me methodo setRest pou ta thetei ayth anti gia ton constructor...
    	this.kwdikos=kwdikos;
    	this.syntelesths=syntelesths;
    	this.misthos=misthos;
    	this.pososto=pososto;
    }
    
    public String toString() {
        return "Epwnymo: "  + epwnymo +  ", perigrafh: " + perigrafh + ", stoixeio: " + stoixeio;
    }
}