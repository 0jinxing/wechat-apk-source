package com.tencent.magicbrush.handler.glfont;

import android.graphics.Typeface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class e
{
  HashMap<String, Typeface> bSV;
  public b bSW;

  e(b paramb)
  {
    AppMethodBeat.i(115916);
    this.bSV = new HashMap();
    this.bSW = paramb;
    AppMethodBeat.o(115916);
  }

  // ERROR //
  static String bV(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 39
    //   4: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokestatic 45	com/tencent/magicbrush/c:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +12 -> 23
    //   14: ldc 39
    //   16: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload_1
    //   20: astore_0
    //   21: aload_0
    //   22: areturn
    //   23: aload_0
    //   24: ldc 47
    //   26: invokevirtual 52	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   29: ifne +18 -> 47
    //   32: invokestatic 58	com/tencent/magicbrush/handler/glfont/a:yF	()Lcom/tencent/magicbrush/a/d$a;
    //   35: ifnull +12 -> 47
    //   38: invokestatic 58	com/tencent/magicbrush/handler/glfont/a:yF	()Lcom/tencent/magicbrush/a/d$a;
    //   41: iconst_1
    //   42: invokeinterface 63 2 0
    //   47: new 65	com/tencent/magicbrush/handler/glfont/l
    //   50: dup
    //   51: invokespecial 66	com/tencent/magicbrush/handler/glfont/l:<init>	()V
    //   54: astore_2
    //   55: aload_2
    //   56: getfield 70	com/tencent/magicbrush/handler/glfont/l:bTQ	Ljava/util/Map;
    //   59: invokeinterface 75 1 0
    //   64: new 77	java/io/RandomAccessFile
    //   67: astore_3
    //   68: aload_3
    //   69: aload_0
    //   70: ldc 79
    //   72: invokespecial 82	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: aload_2
    //   76: aload_3
    //   77: invokevirtual 86	com/tencent/magicbrush/handler/glfont/l:b	(Ljava/io/RandomAccessFile;)V
    //   80: aload_3
    //   81: invokevirtual 89	java/io/RandomAccessFile:close	()V
    //   84: aload_2
    //   85: getfield 70	com/tencent/magicbrush/handler/glfont/l:bTQ	Ljava/util/Map;
    //   88: getstatic 93	com/tencent/magicbrush/handler/glfont/l:bTL	I
    //   91: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   94: invokeinterface 103 2 0
    //   99: ifeq +103 -> 202
    //   102: aload_2
    //   103: getfield 70	com/tencent/magicbrush/handler/glfont/l:bTQ	Ljava/util/Map;
    //   106: getstatic 93	com/tencent/magicbrush/handler/glfont/l:bTL	I
    //   109: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: invokeinterface 107 2 0
    //   117: checkcast 49	java/lang/String
    //   120: astore_0
    //   121: ldc 39
    //   123: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: goto -105 -> 21
    //   129: astore_3
    //   130: ldc 109
    //   132: aload_3
    //   133: ldc 111
    //   135: iconst_0
    //   136: anewarray 4	java/lang/Object
    //   139: invokestatic 117	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: goto -58 -> 84
    //   145: astore_2
    //   146: ldc 119
    //   148: aload_2
    //   149: ldc 121
    //   151: iconst_1
    //   152: anewarray 4	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_0
    //   158: aastore
    //   159: invokestatic 117	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: ldc 39
    //   164: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: aload_1
    //   168: astore_0
    //   169: goto -148 -> 21
    //   172: astore_2
    //   173: aconst_null
    //   174: astore_3
    //   175: aload_3
    //   176: invokevirtual 89	java/io/RandomAccessFile:close	()V
    //   179: ldc 39
    //   181: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: aload_2
    //   185: athrow
    //   186: astore_3
    //   187: ldc 109
    //   189: aload_3
    //   190: ldc 111
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: invokestatic 117	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: goto -20 -> 179
    //   202: aload_2
    //   203: getfield 70	com/tencent/magicbrush/handler/glfont/l:bTQ	Ljava/util/Map;
    //   206: getstatic 124	com/tencent/magicbrush/handler/glfont/l:bTP	I
    //   209: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   212: invokeinterface 103 2 0
    //   217: ifeq +30 -> 247
    //   220: aload_2
    //   221: getfield 70	com/tencent/magicbrush/handler/glfont/l:bTQ	Ljava/util/Map;
    //   224: getstatic 124	com/tencent/magicbrush/handler/glfont/l:bTP	I
    //   227: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   230: invokeinterface 107 2 0
    //   235: checkcast 49	java/lang/String
    //   238: astore_0
    //   239: ldc 39
    //   241: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: goto -223 -> 21
    //   247: ldc 39
    //   249: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: aload_1
    //   253: astore_0
    //   254: goto -233 -> 21
    //   257: astore_2
    //   258: goto -83 -> 175
    //
    // Exception table:
    //   from	to	target	type
    //   80	84	129	java/lang/Exception
    //   55	64	145	java/io/IOException
    //   80	84	145	java/io/IOException
    //   130	142	145	java/io/IOException
    //   175	179	145	java/io/IOException
    //   179	186	145	java/io/IOException
    //   187	199	145	java/io/IOException
    //   64	75	172	finally
    //   175	179	186	java/lang/Exception
    //   75	80	257	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.e
 * JD-Core Version:    0.6.2
 */