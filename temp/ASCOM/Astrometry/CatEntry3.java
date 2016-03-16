package ASCOM.Astrometry;

/*

                Catalogue entry structure
            

Basic astrometric data for any celestial object located outside the solar system; the catalog data for a star.
                This structure is identical to the NOVAS2 CatEntry structure expect that, for some reason, the StarName and Catalog fields
                    have been swapped in the NOVAS3 structure.
                
                    Please note that some units have changed from those used in NOVAS2 as follows:
                    
                        proper motion in right ascension: from seconds per century to milliarcseconds per year
                        proper motion in declination: from arcseconds per century to milliarcseconds per year
                        parallax: from arcseconds to milliarcseconds
                    
                
            
*/
public class CatEntry3{

}
