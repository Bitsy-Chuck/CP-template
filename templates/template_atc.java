import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.concurrent.TimeUnit;

class Main{
  static class pair{
    int val, idx;
    pair(int a, int b){
      val=a;
      idx=b;
    }
    public String toString(){
      return "(val: "+val+" idx: "+idx+")";
    }
  }


  static class ProblemSolver{
    public void solveTheProblem(InputReader in,OutputWriter out, NumberTheory nt, Debug dbg){
      int test=in.nextInt();
      while(test-- >0){
        int n, k;
        n=in.nextInt();
      }
    }
  }

  public static void main(String[] args){
    int checkTimeELAPSED=0;
    if(checkTimeELAPSED==0){
      InputStream inputStream=System.in;
      OutputStream outputStream=System.out;
      Debug debug= new Debug();
      InputReader in=new InputReader(inputStream);
      OutputWriter out=new OutputWriter(outputStream);
      NumberTheory nt= new NumberTheory();
      ProblemSolver problemSolver=new ProblemSolver();
      problemSolver.solveTheProblem(in,out, nt, debug);
      out.flush();
      out.close();
    }
    else{
      long startTime = System.nanoTime();
      InputStream inputStream=System.in;
      OutputStream outputStream=System.out;
      Debug debug= new Debug();
      InputReader in=new InputReader(inputStream);
      OutputWriter out=new OutputWriter(outputStream);
      NumberTheory nt= new NumberTheory();
      ProblemSolver problemSolver=new ProblemSolver();
      problemSolver.solveTheProblem(in,out,nt,debug);
      long endTime = System.nanoTime();
      long timeElapsed = endTime - startTime;
      out.println("Execution time in nanoseconds  : " + timeElapsed);
  		out.println("Execution time in milliseconds : "+ timeElapsed / 1000000);
      out.println("Execution time in seconds : "+ timeElapsed / 1000000000);
      out.flush();
      out.close();
    }
  }
  @SuppressWarnings({"unchecked", "static-access", "all", "StaticQualifiedUsingExpression"})
  static class Debug {
	//change to System.getProperty("ONLINE_JUDGE")==null; for CodeForces
  	public static final boolean LOCAL = System.getProperty("user.home").toString().equals("C:\\Users\\Hp");
  	private static <T> String ts(T t) {
  		if(t==null) {
  			return "null";
  		}
  		try {
  			return ts((Iterable) t);
  		}catch(ClassCastException e) {
  			if(t instanceof int[]) {
  				String s = Arrays.toString((int[]) t);
  				return "{"+s.substring(1, s.length()-1)+"}";
  			}else if(t instanceof long[]) {
  				String s = Arrays.toString((long[]) t);
  				return "{"+s.substring(1, s.length()-1)+"}";
  			}else if(t instanceof char[]) {
  				String s = Arrays.toString((char[]) t);
  				return "{"+s.substring(1, s.length()-1)+"}";
  			}else if(t instanceof double[]) {
  				String s = Arrays.toString((double[]) t);
  				return "{"+s.substring(1, s.length()-1)+"}";
  			}else if(t instanceof boolean[]) {
  				String s = Arrays.toString((boolean[]) t);
  				return "{"+s.substring(1, s.length()-1)+"}";
  			}
  			try {
  				return ts((Object[]) t);
  			}catch(ClassCastException e1) {
  				return t.toString();
  			}
  		}
  	}
  	private static <T> String ts(T[] arr) {
  		StringBuilder ret = new StringBuilder();
  		ret.append("{");
  		boolean first = true;
  		for(T t: arr) {
  			if(!first) {
  				ret.append(", ");
  			}
  			first = false;
  			ret.append(ts(t));
  		}
  		ret.append("}");
  		return ret.toString();
  	}
  	private static <T> String ts(Iterable<T> iter) {
  		StringBuilder ret = new StringBuilder();
  		ret.append("{");
  		boolean first = true;
  		for(T t: iter) {
  			if(!first) {
  				ret.append(", ");
  			}
  			first = false;
  			ret.append(ts(t));
  		}
  		ret.append("}");
  		return ret.toString();
  	}
  	public void dbg(Object... o) {
  		if(LOCAL) {
  			System.err.print("Line #"+Thread.currentThread().getStackTrace()[2].getLineNumber()+": [");
  			for(int i = 0; i<o.length; i++) {
  				if(i!=0) {
  					System.err.print(", ");
  				}
  				System.err.print(ts(o[i]));
  			}
  			System.err.println("]");
  		}
  	}
  }

  static class InputReader {
    private boolean finished = false;

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (numChars == -1) {
        throw new InputMismatchException();
      }
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (numChars <= 0) {
          return -1;
        }
      }
      return buf[curChar++];
    }

    public int peek() {
      if (numChars == -1) {
        return -1;
      }
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          return -1;
        }
        if (numChars <= 0) {
          return -1;
        }
      }
      return buf[curChar];
    }

    public int nextInt() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public long nextLong() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public String nextLine() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      StringBuilder res = new StringBuilder();
      do {
        if (Character.isValidCodePoint(c)) {
          res.appendCodePoint(c);
        }
        c = read();
      } while (!isSpaceChar(c));
      return res.toString();
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return isWhitespace(c);
    }

    public static boolean isWhitespace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private String readLine0() {
      StringBuilder buf = new StringBuilder();
      int c = read();
      while (c != '\n' && c != -1) {
        if (c != '\r') {
          buf.appendCodePoint(c);
        }
        c = read();
      }
      return buf.toString();
    }

    public String readLine() {
      String s = readLine0();
      while (s.trim().length() == 0) {
        s = readLine0();
      }
      return s;
    }

    public String readLine(boolean ignoreEmptyLines) {
      if (ignoreEmptyLines) {
        return readLine();
      } else {
        return readLine0();
      }
    }

    public BigInteger readBigInteger() {
      try {
        return new BigInteger(nextLine());
      } catch (NumberFormatException e) {
        throw new InputMismatchException();
      }
    }

    public char nextCharacter() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      return (char) c;
    }

    public double nextDouble() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      double res = 0;
      while (!isSpaceChar(c) && c != '.') {
        if (c == 'e' || c == 'E') {
          return res * Math.pow(10, nextInt());
        }
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      }
      if (c == '.') {
        c = read();
        double m = 1;
        while (!isSpaceChar(c)) {
          if (c == 'e' || c == 'E') {
            return res * Math.pow(10, nextInt());
          }
          if (c < '0' || c > '9') {
            throw new InputMismatchException();
          }
          m /= 10;
          res += (c - '0') * m;
          c = read();
        }
      }
      return res * sgn;
    }

    public boolean isExhausted() {
      int value;
      while (isSpaceChar(value = peek()) && value != -1) {
        read();
      }
      return value == -1;
    }

    public String next() {
      return nextLine();
    }

    public SpaceCharFilter getFilter() {
      return filter;
    }

    public void setFilter(SpaceCharFilter filter) {
      this.filter = filter;
    }

    public interface SpaceCharFilter {
      public boolean isSpaceChar(int ch);
    }
    public int[] nextIntArray(int n){
      int[] array=new int[n];
      for(int i=0;i<n;++i)array[i]=nextInt();
      return array;
    }
    public int[] nextSortedIntArray(int n){
      int array[]=nextIntArray(n);
      Arrays.sort(array);
      return array;
    }
    public ArrayList<Integer> nextIntArrayList(int n){
      ArrayList<Integer> ar= new ArrayList<>();
      for(int i=0;i<n;i++)
      ar.add(nextInt());
      return ar;
    }
    public ArrayList<Long> nextLongArrayList(int n){
      ArrayList<Long> ar= new ArrayList<>();
      for(int i=0;i<n;i++)
      ar.add(nextLong());
      return ar;
    }

    public int[] nextSumIntArray(int n){
      int[] array=new int[n];
      array[0]=nextInt();
      for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
      return array;
    }
    public long[] nextLongArray(int n){
      long[] array=new long[n];
      for(int i=0;i<n;++i)array[i]=nextLong();
      return array;
    }
    public long[] nextSumLongArray(int n){
      long[] array=new long[n];
      array[0]=nextInt();
      for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
      return array;
    }
    public long[] nextSortedLongArray(int n){
      long array[]=nextLongArray(n);
      Arrays.sort(array);
      return array;
    }
    public int[][] nextIntMatrix(int n,int m){
      int[][] matrix=new int[n][m];
      for(int i=0;i<n;++i)
      for(int j=0;j<m;++j)
      matrix[i][j]=nextInt();
      return matrix;
    }

    public int[][] nextIntMatrix(int n){
      return nextIntMatrix(n,n);
    }

    public long[][] nextLongMatrix(int n,int m){
      long[][] matrix=new long[n][m];
      for(int i=0;i<n;++i)
      for(int j=0;j<m;++j)
      matrix[i][j]=nextLong();
      return matrix;
    }

    public long[][] nextLongMatrix(int n){
      return nextLongMatrix(n,n);
    }

    public char[][] nextCharMatrix(int n,int m){
      char[][] matrix=new char[n][m];
      for(int i=0;i<n;++i)
      matrix[i]=next().toCharArray();
      return matrix;
    }

    public char[][] nextCharMatrix(int n){
      return nextCharMatrix(n,n);
    }
  }

  static class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    // public void print(char[] array) {
    //     writer.print(array);
    // }

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(objects[i]);
      }
    }

    public void print(int[] array) {
      for (int i = 0; i < array.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(array[i]);
      }
    }

    public void print(double[] array) {
      for (int i = 0; i < array.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(array[i]);
      }
    }

    public void print(long[] array) {
      for (int i = 0; i < array.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(array[i]);
      }
    }

    public void print(char[] array) {
      for (int i = 0; i < array.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(array[i]);
      }
    }

    public void print(String[] array) {
      for (int i = 0; i < array.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(array[i]);
      }
    }

    public void print(int[][] matrix){
      for(int i=0;i<matrix.length;++i){
        println(matrix[i]);
      }
    }

    public void print(double[][] matrix){
      for(int i=0;i<matrix.length;++i){
        println(matrix[i]);
      }
    }

    public void print(long[][] matrix){
      for(int i=0;i<matrix.length;++i){
        println(matrix[i]);
      }
    }

    public void print(char[][] matrix){
      for(int i=0;i<matrix.length;++i){
        println(matrix[i]);
      }
    }

    public void print(String[][] matrix){
      for(int i=0;i<matrix.length;++i){
        println(matrix[i]);
      }
    }

    public void println(int[] array) {
      print(array);
      writer.println();
    }

    public void println(double[] array) {
      print(array);
      writer.println();
    }

    public void println(long[] array) {
      print(array);
      writer.println();
    }

    // public void println(char[] array) {
    //     print(array);
    //     writer.println();
    // }

    public void println(String[] array) {
      print(array);
      writer.println();
    }

    public void println() {
      writer.println();
    }

    public void println(Object... objects) {
      print(objects);
      writer.println();
    }

    public void print(char i) {
      writer.print(i);
    }

    public void println(char i) {
      writer.println(i);
    }

    public void println(char[] array) {
      writer.println(array);
    }

    public void printf(String format, Object... objects) {
      writer.printf(format, objects);
    }

    public void close() {
      writer.close();
    }

    public void flush() {
      writer.flush();
    }

    public void print(long i) {
      writer.print(i);
    }

    public void println(long i) {
      writer.println(i);
    }

    public void print(int i) {
      writer.print(i);
    }

    public void println(int i) {
      writer.println(i);
    }

    public void separateLines(int[] array) {
      for (int i : array) {
        println(i);
      }
    }
  }
  static class NumberTheory{

    /**
    * Modular Arithmetic:
    *  1. (a+b)%c=(a%c+b%c)%c
    *  2. (a*b)%c=(a%c*b%c)%c
    *  3. (a-b)%c=(a%c-b%c+c)%c
    *  4. (a/b)%c=(a%c*(b^-1)%c)%c -- (b^-1 is multiplicative modulo inverse)
    */
    //Modular Addition
    public int modularAddition(int a,int b,int MOD){
      return (a%MOD+b%MOD)%MOD;
    }
    public long modularAddition(long a,long b,long MOD){
      return (a%MOD+b%MOD)%MOD;
    }
    //Modular Multiplication
    public int modularMultiplication(int a,int b,int MOD){
      return ((a%MOD)*(b%MOD))%MOD;
    }
    public long modularMultiplication(long a,long b,long MOD){
      return ((a%MOD)*(b%MOD))%MOD;
    }
    //Modular Subtraction
    public int modularSubtraction(int a,int b,int MOD){
      return (a%MOD-b%MOD+MOD)%MOD;
    }
    public long modularSubtraction(long a,long b,long MOD){
      return (a%MOD-b%MOD+MOD)%MOD;
    }

    /**
    * Binary Exponentiation
    */
    public int binaryExponentiation(int x,int n){
      if(n==0)return 1;
      else if(n%2==0)return binaryExponentiation(x*x,n/2);
      else return x*binaryExponentiation(x*x,(n-1)/2);
    }
    public long binaryExponentiation(long x,long n){
      long result=1;
      while(n>0){
        if(n%2==1)result*=x;
        x=x*x;
        n/=2;
      }
      return result;
    }

    /**
    * Modular Exponentiation
    */
    public int modularExponentiation(int x,int n,int MOD){
      if(n==0)return 1%MOD;
      else if(n%2==0)return modularExponentiation(modularMultiplication(x,x,MOD),n/2,MOD);
      else return modularMultiplication(x,modularExponentiation(modularMultiplication(x,x,MOD),(n-1)/2,MOD),MOD);
    }
    public long modularExponentiation(long x,long n,long MOD){
      long result=1;
      while(n>0){
        if(n%2==1)result=modularMultiplication(result,x,MOD);
        x=modularMultiplication(x,x,MOD);
        n/=2;
      }
      return result;
    }

    /**
    * Factorial of a number
    */
    public long factorials(long n){
      if(n==0)return 1;
      return n*factorials(n-1);
    }

    /**
    * Prime factors of a number
    */
    public ArrayList<Integer> distinctPrimeFactors(int n){
      ArrayList<Integer> factorials=new ArrayList<>();
      int limit=(int)Math.sqrt(n);
      if(n%2==0){
        factorials.add(2);
        while(n%2==0)n/=2;
      }
      for(int i=3;i<=limit;i+=2){
        if(n%i==0){
          factorials.add(i);
          while(n%i==0)n/=i;
        }
      }
      if(n>2)factorials.add(n);
      return factorials;
    }

    public ArrayList<Long> distinctPrimeFactors(long n){
      ArrayList<Long> factorials=new ArrayList<>();
      long limit=(long)Math.sqrt(n);
      if(n%2==0){
        factorials.add((long)2);
        while(n%2==0)n/=2;
      }
      for(long i=3;i<=limit;i+=2){
        if(n%i==0){
          factorials.add(i);
          while(n%i==0)n/=i;
        }
      }
      if(n>2)factorials.add(n);
      return factorials;
    }

    public ArrayList<Integer> primeFactors(int n){
      ArrayList<Integer> factorials=new ArrayList<>();
      int limit=(int)Math.sqrt(n);
      if(n%2==0){
        factorials.add(2);
        while(n%2==0)n/=2;
      }
      for(int i=3;i<=limit;i+=2){
        if(n%i==0){
          factorials.add(i);
          while(n%i==0)n/=i;
        }
      }
      if(n>2)factorials.add(n);
      return factorials;
    }

    public ArrayList<Long> primeFactors(long n){
      ArrayList<Long> factorials=new ArrayList<>();
      long limit=(long)Math.sqrt(n);
      if(n%2==0){
        factorials.add((long)2);
        while(n%2==0)n/=2;
      }
      for(long i=3;i<=limit;i+=2){
        if(n%i==0){
          factorials.add(i);
          while(n%i==0)n/=i;
        }
      }
      if(n>2)factorials.add(n);
      return factorials;
    }

    /**
    * Combination: nCr
    */
    //Naive version
    //(n,r)=(n-1,r-1)+(n-1,r) for r!=0 or r!=n
    //(n,0)=(n,n)=1
    public int binomialCoefficientRecursive(int n,int k){
      if(k==0 || k==n)return 1;//base case
      return binomialCoefficientRecursive(n-1,k-1)+binomialCoefficientRecursive(n-1,k);//recursion
    }

    //Dynamic Programming version(Uses bottom up approach to fill the table)
    //Time complexity: O(n*k)
    //Space complexity: O(n*k)
    public long binomialCoefficientIterative(int n,int k){
      long[][] C=new long[n+1][k+1];
      for(int i=0;i<=n;++i){
        for(int j=0;j<=Math.min(n,k);++j){
          if(j==0 || j==i)C[i][j]=1;
          else C[i][j]=C[i-1][j-1]+C[i-1][j];
        }
      }
      return C[n][k];
    }

    //Pascal's Triangle version(Space efficient program)
    //Time complexity: O(n*k)
    //Space complexity: O(k)
    public long nCr(int n,int r){
      int[] C=new int[r+1];
      C[0]=1;//nC0=1
      for(int i=1;i<=n;++i)
      for(int j=Math.min(i,r);j>0;--j)
      C[j]=C[j]+C[j-1];
      return C[r];
    }

    /**
    * Catlan number:
    *  - Time complexity: O(n*n)
    *  - Auxiliary space: O(n)
    *
    *  NOTE: Time complexity could be reduced to O(n) but it is
    *        possible if and only if n is small or else there is
    *        a chance of getting an overflow. To decrease the time
    *        complexity to O(n) just remember nCr=nCn-r
    */
    public long catlanNumber(int n){
      long[] catlan=new long[n+1];
      catlan[0]=catlan[1]=1;
      for(int i=2;i<=n;++i)
      for(int j=0;j<i;++j)
      catlan[i]+=catlan[j]*catlan[i-1-j];

      return catlan[n];
    }

    /**
    * Greatest Common Divisor(GCD)
    *  - It is also known as Highest Common Factor(HCF)
    *  - Time complexity: log(min(a,b))
    *  - Auxiliary Space: O(1)
    */
    public int gcd(int a,int b){
      if(b==0)return a;
      return gcd(b,a %b);
    }

    public long gcd(long a,long b){
      if(b==0)return a;
      return gcd(b,a%b);
    }

    /**
    * Extended Euclid's Algorithm:
    *  - ax+by=gcd(a,b)
    *  - Time complexity:
    *  -
    */


    /**
    * Least Common Multiple(LCM):
    *  - Time complexity: log(min(a,b))
    *  - Auxiliary Space: O(1)
    */
    public long lcm(long a,long b){
      return (a*b)/gcd(a,b);
    }

  }
}
//
//                       "8,        .m8"
//                        I8Im    ,mI8"
//                        ,8I""I8,mI8m
//             "I8mm,    ,I8    I8 "I8,          ,m"
//                "I88I88I8m ,I8"   "I8""==mm ,mI8"
//        ___    ,mI8"    "8I8"      I8,  ,mI8I8"
//   .,mI8I8I8I8I88,      ,m8"      ,I8I8I8I888"
// "I8Im,       "I88,    ,8"      ,II8"     "88,
//    `"I8,        "I8, ,8"     ,I8"         "I8,
//       "I8m       "I888      ,I8"           "I8,
//         "8m        "I8      88"              "I8,
//          I8,        I8      88                 "I8,
//           88,       I8,     "I8                 "I8
//           "I8,      "I8,     "I8,                I8;.
//            "I8,      "I8,      "I8        .,mmmI8888888m,.
//              I8,      "I8,      I8,  .mI8I88"""". .. "I8888
//              "I8,      "I8      mI8I88"". . . . . .,m8"   "8
//               I8m,  __ ;I8   ,II88" . . . . .,;miI88"
//               "I88I8I88I88,,I88" . . . ,mmiiI8888"
//                ,I8". . ."I8I8". . . mi888888888"
//              ,I8 . . . .,I88I. . .i88888888888"
//             I8. . . .,mII88Ima. .i88888888888"
//            ,8"..,mI88I88I88I8Imi888888888888"
//            I8.,I8I"""        ""II88888888888
//           ;I8I8"                  ""I8888888
//           ""                         "I88888
//                                        "I888
//                                         "I88,
//                                          "I88
//                                           "88,
//                                            I88,              ______   __
//                           ______           "I88__        .mI88I88I88I88I88,
//                      .,mI88I88I88, ,mI88,   I88"""     ,mI8". . . . "I8,..8,
//                    ,I888' . . . "I88.\ "8,  I88      ,I8". . . .  / :;I8 \ 8,
//                  .mI8' . . .  / .:"I8.\ 88  "88,    ,8". . .  / .;mI8I8I8,\ 8
//                 ,I8'. . .  / . .:;,I8I8I888  I88   ,8". .  / .:mI8"'   "I8,:8
//                ,I8'. . . / . .:;,mI8"  `"I88 I88   I8. .  / .m8"         "I8I
//               ,I8 . .  / . .:;,mI8"      "I88888   88,.  / ,m8            "8'
//               I8'. .  / . .;,mI8"          "II888 ,I8I8,.,I8"
//               I8 . . / . .,mI8"              I8888888' """
//               `I8,.  / ;,mI8"                 II888
//                "I8I, /,mI8"                 __I888
//                  "I8888"                   """I88
//                    ""                         I88
//                                               I88__
//                                               I88"""
//                                               I88
//                                               I88
//                                             __I88
//                                            """I88
//                                               I88
//                                               I88
//                                               I88__
//                                               I88"""
//                                               I88
//                                        BITSY  ___  CHUCK
