package arrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {

		int studen_id[] = new int[5];
		studen_id[0] = 45;
		studen_id[1] = 50;
        studen_id[2] = 70;
        studen_id[3] = 90;
        
        int sizeofArray= studen_id.length;
        System.out.println(sizeofArray);
        for(int i=0; i<sizeofArray;i++) {
        	System.out.println(studen_id[i]);
        }

	}

}
