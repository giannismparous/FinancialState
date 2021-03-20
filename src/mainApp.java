import java.util.ArrayList;
import java.util.Scanner;

		public class mainApp {
			
			static double plhrwteo(ergazomenos a,ArrayList<kinish> lista) {//ypologismos plhrwteou
				double hmeromisthio = (a.misthos/25);//oi metavlhtes exhgountai apo tis System.out.println(X);
				double wromisthio = hmeromisthio/8;
				double STA=0;
				double SEA=0;
				double SPA=0;
				double EF;
				
				for (kinish k: lista) {
					if (a.kwdikose == k.kwdikose) {
						if (k.kwdikos == 1) {
							STA = STA + (hmeromisthio*k.stoixeio*k.syntelesths);
						}
						else if (k.kwdikos== 2) {
							SEA = SEA + (wromisthio*k.stoixeio*k.syntelesths);
						}
						else if (k.kwdikos == 3) {
							SPA = SPA + k.stoixeio;
						}
					}
				}
				System.out.println("Synolikes taktikes apodoxes: " + STA);
				System.out.println("Synolikes ektaktes apodoxes: " + SEA);
				System.out.println("Synolikes prosthetes apodoxes: " + SPA);
				double SA=STA+SEA+SPA;
				System.out.println("Synolikes apodoxes: " + SA);
				double AETA= STA*a.pososto/100;
				double AEEA= SEA*a.pososto/100;
				double AEPA= SPA*a.pososto/100;
				System.out.println("Asfalistikes eisfores taktikwn apodoxwn: " + AETA);
				System.out.println("Asfalistikes eisfores ektaktwn apodoxwn:" + AEEA);
				System.out.println("Asfalistikes eisfores prosthetwn apodoxwn: " + AEPA);
				double SAE=AETA+AEEA+AEPA;
				System.out.println("Synolikes asfalistikes eisfores: " + SAE);
				double FTEA= (STA-AETA)+(SEA-AEEA);
				System.out.println("Forologhteo twn taktikwn kai ektaktwn apodoxwn: " + FTEA);
				double PEF= FTEA*14;
				System.out.println("Provlepomenmo ethsio forologhteo: " + PEF);
				if (PEF <= 10000) {
					EF=PEF*0.1;
				}
				else if (PEF <= 30000) {
					EF=PEF*0.2;
				}
				else {
					EF=PEF*0.3;
				}
				System.out.println("Ethsios foros: " + EF);
				double ForosTEA = EF/14;
				System.out.println("Foros taktikwn kai ektaktwn apodoxwn: " + ForosTEA);
				double FPA=SPA-AEPA;
				System.out.println("Forologhteo prosthetwn apodoxwn: " + FPA);
				double ForosPA=0;
				for (kinish k: lista) {
					if (k.kwdikos == 3 & a.kwdikose == k.kwdikose) {
						ForosPA= ForosPA  + FPA*k.syntelesths/100;
					}
				}
				System.out.println("Foros prosthetwn apodoxwn: " + ForosPA);
				double SForos=ForosPA+ForosTEA;
				System.out.println("Synolikos foros: " + SForos);
				return SA-SAE-SForos;
			}
			
			static void ypoxrewseis(ArrayList<ergazomenos> lista1,ArrayList<kinish> lista2) {//ypologismos ypoxrewsewn epixeirhshs
				double SYNOLOE=0;
				double SYNOLOF=0;
				for (ergazomenos a: lista1) {
						double hmeromisthio = (a.misthos/25);
						double wromisthio = hmeromisthio/8;
						double STA=0;
						double SEA=0;
						double SPA=0;
						double EF;
						
						for (kinish k: lista2) {
							if (a.kwdikose == k.kwdikose) {
								if (k.kwdikos == 1) {
									STA = STA + (hmeromisthio*k.stoixeio*k.syntelesths);
								}
								else if (k.kwdikos== 2) {
									SEA = SEA + (wromisthio*k.stoixeio*k.syntelesths);
								}
								else if (k.kwdikos == 3) {
									SPA = SPA + k.stoixeio;
								}
							}
						}
						double AETA= STA*a.pososto/100;
						double AEEA= SEA*a.pososto/100;
						double AEPA= SPA*a.pososto/100;
						double SAE=AETA+AEEA+AEPA;//
						double FTEA= (STA-AETA)+(SEA-AEEA);
						double PEF= FTEA*14;
						if (PEF <= 10000) {
							EF=PEF*0.1;
						}
						else if (PEF <= 30000) {
							EF=PEF*0.2;
						}
						else {
							EF=PEF*0.3;
						}
						double ForosTEA = EF/14;
						double FPA=SPA-AEPA;
						double ForosPA=0;
						for (kinish k: lista2) {
							if (k.kwdikos == 3 & a.kwdikose == k.kwdikose) {
								ForosPA= ForosPA  + FPA*k.syntelesths/100;
							}
						}
						double SForos=ForosPA+ForosTEA;
						System.out.println("Ergazomenos: " + a.epwnymo + ", asfalistikes eisfores: " + SAE +", foros: " + SForos);
						SYNOLOE=SYNOLOE+SAE;
						SYNOLOF=SYNOLOF+SForos;		
					}
				System.out.println("Synolikes eisfores: " + SYNOLOE + ", synolikos foros:" + SYNOLOF);
			}
			
			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				int intput1;
				int intput2;
				int intput3;
				int intput4;
				String str1;
				String str2;
				double doub1;
				double doub2;//gia arxikopoihsh timwn xrhsth argotera
				ArrayList<misthologika_stoixeia> misthologika_stoixeia1= new ArrayList<misthologika_stoixeia>();//pinakas misthologikwn stoixeiwn
				ArrayList<ergazomenos> ergazomenoi= new ArrayList<ergazomenos>();//pinakas ergazomenwn
				ArrayList<kinish> kiniseis= new ArrayList<kinish>();//pinakas kinisewn ergazomenwn
				String[] epiloges = {"1. Eisagwgh neou misthologikou stoixeiou","2. Eisagwgh neou ergazomenou","3. Eisagwgh neas kinishs ergazomenoy","4. Emfanish misthologikwn stoixeiwn","5. Emfanish kinhsewn ergazomenwn gia ena ergazomeno","6. Ypologismos plhrwteou enos ergazomenou","7. Ypologismos ypoxrewsewn ths etairias","8. Paradeigma","9. Exodos"};
				String[] kwdikoi_misthologikwn_stoixeiwn= {"1. TA","2. EA","3. PA"};
				for (String epilogh: epiloges) {
					System.out.println(epilogh);
				}
				loop: while (true){//UI
					intput1=scan.nextInt();
					while (intput1 >9 | intput1<1) {
						System.out.println("Mh egkyrh epilogh");
						intput1=scan.nextInt();
					}
					switch (intput1) {//apothikeush misthologikou stoixeiou me elegxo stoixeiwn(gia arnhtikes times)
						case 1: 
							for (String epilogh: kwdikoi_misthologikwn_stoixeiwn) {
								System.out.println(epilogh);
							}
							intput1=scan.nextInt();
							while (intput1 >3 | intput1<1) {
								System.out.println("Mh egkyros kwdikos");
								intput1=scan.nextInt();
							}
							System.out.print("Perigrafh:");
							str1=scan.next();
							System.out.println("Syntelesths:");
							doub1=scan.nextDouble();
							while (doub1 <0 | (intput1==2 & doub1 <1) ) {
								System.out.println("My egkyros syntelesths:");
								doub1=scan.nextDouble();
							}
							misthologika_stoixeia1.add(new misthologika_stoixeia(str1,intput1,doub1));
							System.out.println("Epityxhs prosthiki misthologikou stoixeiou\n");
							try//mia kathysterhsh gia na fainetai pio omorfo to ui otan ginetai eisagwgh dedomenwn(yparxei kai se alla shmeia)
					        {
					            Thread.sleep(1000);
					        }
					        catch (InterruptedException e)
					        {
					            e.printStackTrace();
					        }
							break;
						case 2://apothikeush ergazomenou me elegxo steixoiwn(gia arnhtikes times)
							System.out.print("Onoma:");
							str1=scan.next();
							System.out.print("Epwnymo:");
							str2=scan.next();
							System.out.print("Misthos:");
							doub1=scan.nextDouble();
							while (doub1 <0 ) {
								System.out.println("My egkyros misthos:");
								doub1=scan.nextDouble();
							}
							System.out.print("Pososto:");
							doub2=scan.nextDouble();
							while (doub2 <0 ) {
								System.out.println("My egkyros pososto:");
								doub2=scan.nextDouble();
							}
							ergazomenoi.add(new ergazomenos(str1,str2,doub1,doub2));
							System.out.println("Epityxhs prosthiki ergazomenou\n");
							try
					        {
					            Thread.sleep(1000);
					        }
					        catch (InterruptedException e)
					        {
					            e.printStackTrace();
					        }
							break;
						case 3:
							if (ergazomenoi.isEmpty()) {//an den yparxei ergazomenos ginetai erwthsh ston xrhsth an thelei na eisagei kapoion kai an o xrhsths apanthsei nai ginetai to case 2 kai epeita synexizetai to case 3 , alliws ginetai epistrofh sto arxiko menu. An yparxei hdh ergazomenos o xrhsths epilegei kapoion kai synexizei to case 3 gia thn epilogh (h eisagwgh an den yparxei hdh) misthologikou stoixeiou.
								System.out.print("Den yparxei ergazomenos. Thes na prostheseis ergazomeno?\n 1. Nai\n 2. Oxi");
								intput3= scan.nextInt();
								while (intput3<1 | intput3 >2) {
									System.out.println("My egkyrh apanthsh:");
									intput3= scan.nextInt();
								}
								if (intput3==1) {
									System.out.print("Onoma:");
									str1=scan.next();
									System.out.print("Epwnymo:");
									str2=scan.next();
									System.out.print("Misthos:");
									doub1=scan.nextDouble();
									while (doub1 <0 ) {
										System.out.println("My egkyros misthos:");
										doub1=scan.nextDouble();
									}
									System.out.print("Pososto:");
									doub2=scan.nextDouble();
									while (doub2 <0 ) {
										System.out.println("My egkyros pososto:");
										doub2=scan.nextDouble();
									}
									ergazomenoi.add(new ergazomenos(str1,str2,doub1,doub2));
									System.out.println("Epityxhs prosthiki ergazomenou\n");
								}
								else {
								System.out.println("Epistrofh sto arxiko menu\n");
								try
						        {
						            Thread.sleep(1000);
						        }
						        catch (InterruptedException e)
						        {
						            e.printStackTrace();
						        }
								break;
								}
							}
							System.out.print("Epelexe Ergazomeno\n");
							for (int i = 0; i < ergazomenoi.size(); i++) {
							      System.out.println(i+1 + "." + ergazomenoi.get(i));
							    }
							intput4=scan.nextInt();
							while (intput4 <0 | intput4 > ergazomenoi.size() ) {
								System.out.println("My egkyros ergazomenos:");
								intput4=scan.nextInt();//
							}
							if (misthologika_stoixeia1.isEmpty()) {//an den yparxei misthologiko stoixeio ginetai erwthsh ston xrhsth an thelei na eisagei kapoio kai an o xrhsths apanthsei nai ginetai to case 1 kai epeita synexizetai to case 3 , alliws ginetai epistrofh sto arxiko menu. An yparxei hdh misthologiko stoixeio tote o xrhsths epilegei kapoio apo ayta kai ginetai h eisagwgh ths kinishs ergazomenou analoga ayta pou epilexthkan.
								System.out.print("Den yparxei misthologiko stoixeio. Thes na prostheseis misthologiko stoixeio?\n 1. Nai\n 2. Oxi");
								intput3= scan.nextInt();
								while (intput3<1 | intput3 >2) {
									System.out.println("My egkyrh apanthsh:");
									intput3= scan.nextInt();
								}
								if (intput3==1) {
									for (String epilogh: kwdikoi_misthologikwn_stoixeiwn) {
										System.out.println(epilogh);
									}
									intput1=scan.nextInt();
									while (intput1 >3 | intput1<1) {
										System.out.println("Mh egkyros kwdikos");
										intput1=scan.nextInt();
									}
									System.out.print("Perigrafh:");
									str1=scan.next();
									System.out.println("Syntelesths:");
									doub1=scan.nextDouble();
									while (doub1 <0 | (intput1==2 & doub1 <1) ) {
										System.out.println("My egkyros syntelesths:");
										doub1=scan.nextDouble();
									}
									misthologika_stoixeia1.add(new misthologika_stoixeia(str1,intput1,doub1));
									System.out.println("Epityxhs prosthiki misthologikou stoixeiou\n");
								}
								else {
									System.out.println("Epistrofh sto arxiko menu\n");
									try
							        {
							            Thread.sleep(1000);
							        }
							        catch (InterruptedException e)
							        {
							            e.printStackTrace();
							        }
									break;
									}
							}
							System.out.print("Epelexe Misthologiko Stoixeio\n");
							for (int i = 0; i < misthologika_stoixeia1.size(); i++) {
							      System.out.println(i+1 + "." + misthologika_stoixeia1.get(i));
							}
							intput2=scan.nextInt();
							System.out.print("Eisagwgh Stoixeiou");
							doub1=scan.nextDouble();
							kiniseis.add(new kinish(ergazomenoi.get(intput4-1).epwnymo,misthologika_stoixeia1.get(intput2-1).perigrafh,ergazomenoi.get(intput4-1).kwdikose,doub1));
							System.out.println("Epityxhs prosthiki kinishs ergazomenou\n");
							kiniseis.get(kiniseis.size()-1).setRest(misthologika_stoixeia1.get(intput2-1).kwdikos,misthologika_stoixeia1.get(intput2-1).syntelesths,ergazomenoi.get(intput4-1).misthos,ergazomenoi.get(intput4-1).pososto);
							try
					        {
					            Thread.sleep(1000);
					        }
					        catch (InterruptedException e)
					        {
					            e.printStackTrace();
					        }
							break;
						case 4://emfanish misthologikwn stoixeiwn
							for (int i = 0; i < misthologika_stoixeia1.size(); i++) {
							      System.out.println(i+1 + "." + misthologika_stoixeia1.get(i));
							    }
							System.out.print("\n");
							try
					        {
					            Thread.sleep(1000);
					        }
					        catch (InterruptedException e)
					        {
					            e.printStackTrace();
					        }
							break;
						case 5://emfanizontai ergazomenoi, o xrhsths epilegei enan kai emfanizontai oi kiniseis tou
							System.out.print("Epelexe Ergazomeno\n");
							for (int i = 0; i < ergazomenoi.size(); i++) {
							      System.out.println(i+1 + "." + ergazomenoi.get(i));
							    }
							intput1=scan.nextInt();
							while (intput1<1 | intput1>ergazomenoi.size()) {
								System.out.println("My egkyrh apanthsh:");
								intput1= scan.nextInt();
							}
							int erga = ergazomenoi.get(intput1-1).kwdikose;//kwdikos sygkekrimenou ergazomenou
							for (int i = 0; i < kiniseis.size(); i++) {
								if (erga==kiniseis.get(i).kwdikose) {
									System.out.println(kiniseis.get(i));
								}
							 }
							System.out.print("\n");
							try
					        {
					            Thread.sleep(1000);
					        }
					        catch (InterruptedException e)
					        {
					            e.printStackTrace();
					        }
							break;	
						case 6://emfanizontai oi ergazomenoi kai o xrhsths epilegei enan kai emfanizontai analytika ta stoixeia tou me teleytaio to plhrwteo
							System.out.print("Epelexe Ergazomeno\n");
							for (int i = 0; i < ergazomenoi.size(); i++) {
							      System.out.println(i+1 + "." + ergazomenoi.get(i));
							    }
							intput1=scan.nextInt();
							while (intput1 <1 | intput1 > ergazomenoi.size() ) {
								System.out.println("My egkyros ergazomenos:");
								intput1=scan.nextInt();
							}
							System.out.println("Plhrwteo: " + plhrwteo(ergazomenoi.get(intput1-1),kiniseis) + "\n");
							try
					        {
					            Thread.sleep(1000);
					        }
					        catch (InterruptedException e)
					        {
					            e.printStackTrace();
					        }
							break;
						case 7://aytomatos ypologismos ypoxrewsewn epixeirhshs
							ypoxrewseis(ergazomenoi, kiniseis);
							System.out.println("\n");
							try
					        {
					            Thread.sleep(1000);
					        }
					        catch (InterruptedException e)
					        {
					            e.printStackTrace();
					        }
							break;
						case 8://aytomath eisagwgh stoixeiwn opws sto paradeigma pou mas zhteitai
							misthologika_stoixeia1.add(new misthologika_stoixeia("hmeres ergasias",1,1));
							misthologika_stoixeia1.add(new misthologika_stoixeia("hmeres astheneias",1,0.5));
							misthologika_stoixeia1.add(new misthologika_stoixeia("yperwries",2,1.7));
							misthologika_stoixeia1.add(new misthologika_stoixeia("yperergasia",2,1.4));
							misthologika_stoixeia1.add(new misthologika_stoixeia("bonus",3,20));
							ergazomenoi.add(new ergazomenos("ergazomenos a", 1111, 1000,35));
							kiniseis.add(new kinish(ergazomenoi.get(ergazomenoi.size()-1).epwnymo,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-5).perigrafh,ergazomenoi.get(ergazomenoi.size()-1).kwdikose,20));
							kiniseis.get(kiniseis.size()-1).setRest(misthologika_stoixeia1.get(misthologika_stoixeia1.size()-5).kwdikos,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-5).syntelesths,ergazomenoi.get(ergazomenoi.size()-1).misthos,ergazomenoi.get(ergazomenoi.size()-1).pososto);
							kiniseis.add(new kinish(ergazomenoi.get(ergazomenoi.size()-1).epwnymo,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-4).perigrafh,ergazomenoi.get(ergazomenoi.size()-1).kwdikose,5));
							kiniseis.get(kiniseis.size()-1).setRest(misthologika_stoixeia1.get(misthologika_stoixeia1.size()-4).kwdikos,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-4).syntelesths,ergazomenoi.get(ergazomenoi.size()-1).misthos,ergazomenoi.get(ergazomenoi.size()-1).pososto);
							kiniseis.add(new kinish(ergazomenoi.get(ergazomenoi.size()-1).epwnymo,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-3).perigrafh,ergazomenoi.get(ergazomenoi.size()-1).kwdikose,5));
							kiniseis.get(kiniseis.size()-1).setRest(misthologika_stoixeia1.get(misthologika_stoixeia1.size()-3).kwdikos,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-3).syntelesths,ergazomenoi.get(ergazomenoi.size()-1).misthos,ergazomenoi.get(ergazomenoi.size()-1).pososto);
							kiniseis.add(new kinish(ergazomenoi.get(ergazomenoi.size()-1).epwnymo,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-2).perigrafh,ergazomenoi.get(ergazomenoi.size()-1).kwdikose,5));
							kiniseis.get(kiniseis.size()-1).setRest(misthologika_stoixeia1.get(misthologika_stoixeia1.size()-2).kwdikos,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-2).syntelesths,ergazomenoi.get(ergazomenoi.size()-1).misthos,ergazomenoi.get(ergazomenoi.size()-1).pososto);
							kiniseis.add(new kinish(ergazomenoi.get(ergazomenoi.size()-1).epwnymo,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-1).perigrafh,ergazomenoi.get(ergazomenoi.size()-1).kwdikose,500));
							kiniseis.get(kiniseis.size()-1).setRest(misthologika_stoixeia1.get(misthologika_stoixeia1.size()-1).kwdikos,misthologika_stoixeia1.get(misthologika_stoixeia1.size()-1).syntelesths,ergazomenoi.get(ergazomenoi.size()-1).misthos,ergazomenoi.get(ergazomenoi.size()-1).pososto);
							System.out.println("Epityxhs prosthiki paradeigmatos\n");
						break;
						case 9://exodos apthn efarmogh
							scan.close();
							break loop;
					}
					for (String epilogh: epiloges) {//epiloges tou UI
						System.out.println(epilogh);
					}
				}
			}

		}
		