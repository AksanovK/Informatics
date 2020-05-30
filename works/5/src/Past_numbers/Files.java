package Past_numbers;

public class Files {
    /*while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        in.close(); */

        /*int s = 0;
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line);
            System.out.println("**LOG**" + line + "****");
            while (st.hasMoreElements()) {
                s += Integer.parseInt(st.nextToken());
            }
            line = in.readLine();
        }
        PrintWriter out = new PrintWriter("D:/hello.txt");
        out.print(s);
        out.close();
        in.close(); */

        /* ===========================================================================
         BufferedReader in = new BufferedReader(new FileReader("D:/cheburashka.txt"));
        //BufferedReader in2 = new BufferedReader(new FileReader("D:/crocodile.txt"));
        Set<String> s = new HashSet<>();
        String line = in.readLine();
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line);
            s.add(line);
            while (st.hasMoreElements()) {
                s.add(st.nextToken());
            }
            line = in.readLine();
        }
        in.close();
        BufferedReader in2 = new BufferedReader(new FileReader("D:/crocodile.txt"));
        line = in2.readLine();
        while (line != null) {
            StringTokenizer st1 = new StringTokenizer(line);
            s.add(line);
            while (st1.hasMoreElements()) {
                s.add(st1.nextToken());
            }
            line = in2.readLine();
        }
        in2.close();
        System.out.println(s.size());
         */


        /*
        BufferedReader read1 = new BufferedReader(new FileReader("D:/1.txt"));
        BufferedReader read2 = new BufferedReader(new FileReader("D:/2.txt"));
        String line11 = read1.readLine();
        String line12 = read1.readLine();
        String line21 = read2.readLine();
        String line22 = read2.readLine();
        boolean b = false;
        while((line12 != null)&&(line22 != null)&& !b) {
            if ((line21.compareTo(line12) == -1)&&(line21.compareTo(line11) == 1)) {
                System.out.println(line21);
                b = true;
            }
            if ((line11.compareTo(line22) == -1)&&(line11.compareTo(line21) == 1)) {
                System.out.println(line21);
                b = true;
            }
            if (line12.compareTo(line21) == -1) {
                line11 = read1.readLine();
                line12 = read1.readLine();
            }
            if (line22.compareTo(line11) == -1) {
                line21 = read2.readLine();
                line22 = read2.readLine();
            }
        }
        read1.close();
        read2.close();
         */

        /*
        public List<Object> getAll(Class aClass) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        StoreInFile z = (StoreInFile) aClass.getAnnotation(StoreInFile.class);
        BufferedReader in = new BufferedReader(new FileReader("D://" +z.name()));
        String line = in.readLine();
        List<Object> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        while (line != null) {
            Object obj = aClass.getDeclaredConstructor().newInstance();
            line = line.trim();
            line = line.substring(1,line.length() - 1);
            StringTokenizer st = new StringTokenizer(line,";");
            while(st.hasMoreElements())  {
                String f = st.nextToken().trim();
                StringTokenizer st1 = new StringTokenizer(f,":");
                String key = st1.nextToken().trim();
                String value = st1.nextToken().trim();
                value = value.substring(1,value.length() - 1);
                map.put(key,value);
            }
            line = in.readLine();
            Field[] field = aClass.getDeclaredFields();
            for (int i = 0; i < field.length; i++) {
                MyField field1 = field[i].getAnnotation(MyField.class);
                if (field1 != null) {
                    field[i].set(obj,map.get(field1.name()));
                }
            }
            list.add(obj);
        }
        return list;
    }
         */
}
