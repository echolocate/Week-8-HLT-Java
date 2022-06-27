
public class Task2 {

	public static void main(String[] args) {
		
		// Not sure why this program doesn't work
		// Will return to this later, if I have time
		// String sentence = "Sixty zippers were quickly picked from the woven jute bag"; true
		// Next line is a test for false, TODO find out why this fails
		String sentence = "Jutes were quickly picked from the woven jute bag"; 
		boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
		a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=u=v=w=x=y=z=true;
		
		for (int count=0; count<sentence.length(); count++) {
			char currentLetter = sentence.toLowerCase().charAt(count);
			// Ugly, inelegant and bad. Must be an easier way to do this...
			// On every letter (supposedly) checks current letter in sentence
			// and if it finds a match with any letter in the alphabet, set the 
			// boolean assigned to that letter to true. Added println to debug
			// to see 
			switch(currentLetter) {
			  case 'a':				
			    a = true;
			    System.out.println("a " + a);
			    break;			    
			  case 'b':
				b = true;
				System.out.println("b " + b);
			  	break;			  
			  case 'c':
				c = true;
				System.out.println("c " + c);
				break;
			  case 'd':
				d = true;
				System.out.println("d " + d);
			  	break;
			  case 'e':	
				e = true;
				System.out.println("e " + e);
			    break;
			  case 'f':
				f = true;
				System.out.println("f " + f);
			  	break;
			  case 'g':
			    g = true;
			    System.out.println("g " + g);
			    break;
			  case 'h':
				h = true;
				System.out.println("h " + h);
			  	break;
			  case 'i':
				i = true;
				System.out.println("i " + i);
			    break;
			  case 'j':
				j = true;
				System.out.println("j " + j);
			  	break;
			  case 'k':
			    k = true;
			    System.out.println("k " + k);
			    break;
			  case 'l':
				l = true;
				System.out.println("l " + l);
			  	break;
			  case 'm':
			    m = true;
			    System.out.println("m " + m);
			    break;
			  case 'n':				
				n = true;
				System.out.println("n " + n);
			  	break;
			  case 'o':
			    o = true;
			    System.out.println("o " + o);
			    break;
			  case 'p':
				p = true;
				System.out.println("p " + p);
			  	break;
			  case 'q':
			    q = true;
			    System.out.println("q " + q);
			    break;
			  case 'r':
				r = true;
				System.out.println("r " + r);
			  	break;
			  case 's':
			    s = true;
			    System.out.println("s " + s);
			    break;
			  case 't':
				t = true;
				System.out.println("t " + t);
			  	break;
			  case 'u':
			    u = true;
			    System.out.println("u " + u);
			    break;
			  case 'v':
				v = true;
				System.out.println("v " + v);
			  	break;
			  case 'w':
			    w = true;
			    System.out.println("w " + w);
			    break;
			  case 'x':
				x = true;
				System.out.println("x " + x);
			  	break;
			  case 'y':
			    y = true;
			    System.out.println("y " + y);
			    break;
			  case 'z':
				z = true;
				System.out.println("z " + z);
			  	break;
			  	// could be why this fails, can only have one default,
			  	// compromised on setting an arbitrary boolean to false
			  	// to throw the checkAllTrue flag to false later on, doesn't.
			  	// the whole thing needs to be rewritten into passing a return
			  	// flag to outside of this scope, no time left for the rewrite, bah
			  	default:
			  		a = false;
		
			} // end switch case

			
		} // end for loop
		
		// Flag supposed to AND all booleans, if any one of them false, flag goes to false
		// Not sure if this is the right way to do this, maybe needs another approach, may
		// be the point of failure, maybe could be achieved using a method or a complete rewrite
		// need to start on next part of the assignment now
		boolean checkAllTrue = a && b && c && d && e && f && g && h && i && j && k && l && m
				&& n && o && p && q && r && s && t && u && v && w && x && y && z;
		System.out.println(checkAllTrue);
		if (checkAllTrue == true) {
			System.out.println("The sentence " + sentence + " is a pangram!");
		}
		else if (checkAllTrue == false) { 
			System.out.println("The sentence " + sentence + " is NOT a pangram!");
		}
	}

}
