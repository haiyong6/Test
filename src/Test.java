import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {
	static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript"); 
	public static void main(String[] args) {
		
		 //System. out .println( " 内存信息 :" + toMemoryInfo ()); 
		/*String[] title = {"列","22","33"};
		//title = new String[] {"lie","111","444"};
		for(int i = 0; i < title.length; i++) {
			System.out.println(title[i]);
		}*/
		/*String strs = "if(S >= 12 && S < 14) {(14 - S)*1000} else if(S >= 10 && S < 12){(12 - S)*3000 + 2000}";  
		double result = 0;
		try {
			result = (double) jse.eval(strs.replace("S", "11"));
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
            System.out.println(result);  
        } catch (Exception t) {  
        }*/
		System.out.println(Double.parseDouble("1.1E+5"));
		
		System.out.println(String.format("%.1f", (double)91.35));
		System.out.println(new BigDecimal((double)91.35).setScale(1, BigDecimal.ROUND_HALF_UP));
		
		System.out.println(String.format("%.1f", (double)0.85));
		System.out.println(new BigDecimal(Double.toString(0.85)).setScale(1, BigDecimal.ROUND_HALF_UP));
		System.out.println(new BigDecimal(0.85));
		System.out.println(new BigDecimal("100"));
		System.out.println("我修改了一个java文件。");
		System.out.println("我修改了一个java文件2");
		System.out.println("修改3");
		
		System.out.println(String.format("%.1f", (double)0.65));
		System.out.println(new BigDecimal((double)111.65).setScale(-1, BigDecimal.ROUND_HALF_UP));
	}
	
	/**  
     * 获取当前 jvm 的内存信息  
     *  
     * @return  
     */   
   public static String toMemoryInfo() {   
   
      Runtime currRuntime = Runtime.getRuntime ();   
      int nFreeMemory = ( int ) (currRuntime.freeMemory() / 1024 / 1024);   
      int nTotalMemory = ( int ) (currRuntime.totalMemory() / 1024 / 1024);   
      return nFreeMemory + "M/" + nTotalMemory + "M(free/total)" ;   
   }   
}
