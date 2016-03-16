package ASCOM.Astrometry;

/*

                Body or location
            

This numbering convention is used by ephemeris routines; do not confuse with the Body enum, which is used in most 
                other places within NOVAS3.
                
                    The numbering convention for 'target' and'center' is:
                    
                        0  =  Mercury           7 = Neptune
                        1  =  Venus             8 = Pluto
                        2  =  Earth             9 = Moon
                        3  =  Mars             10 = Sun
                        4  =  Jupiter          11 = Solar system bary.
                        5  =  Saturn           12 = Earth-Moon bary.
                        6  =  Uranus           13 = Nutations (long. and obliq.)
                
                
                    If nutations are desired, set 'target' = 14; 'center' will be ignored on that call.
                
            
*/
public class Target{

}
