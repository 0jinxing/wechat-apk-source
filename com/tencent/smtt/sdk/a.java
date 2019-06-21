package com.tencent.smtt.sdk;

public class a
{
  public static int a = 600;
  private static int b = 0;

  // ERROR //
  public static int a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: iconst_0
    //   3: istore_1
    //   4: ldc 20
    //   6: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: getstatic 11	com/tencent/smtt/sdk/a:b	I
    //   12: ifle +14 -> 26
    //   15: getstatic 11	com/tencent/smtt/sdk/a:b	I
    //   18: istore_2
    //   19: ldc 20
    //   21: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: iload_2
    //   25: ireturn
    //   26: new 31	java/io/FileReader
    //   29: astore_3
    //   30: aload_3
    //   31: ldc 33
    //   33: invokespecial 37	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   36: new 39	java/io/BufferedReader
    //   39: astore 4
    //   41: aload 4
    //   43: aload_3
    //   44: sipush 8192
    //   47: invokespecial 42	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   50: aload 4
    //   52: invokevirtual 46	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   55: astore_3
    //   56: iload_1
    //   57: istore_2
    //   58: aload_3
    //   59: ifnull +75 -> 134
    //   62: aload_3
    //   63: ldc 48
    //   65: invokevirtual 54	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   68: istore_2
    //   69: iconst_m1
    //   70: iload_2
    //   71: if_icmpeq -21 -> 50
    //   74: aload_3
    //   75: iload_2
    //   76: bipush 9
    //   78: iadd
    //   79: invokevirtual 58	java/lang/String:substring	(I)Ljava/lang/String;
    //   82: invokevirtual 61	java/lang/String:trim	()Ljava/lang/String;
    //   85: astore_3
    //   86: iload_1
    //   87: istore_2
    //   88: aload_3
    //   89: ifnull +45 -> 134
    //   92: iload_1
    //   93: istore_2
    //   94: aload_3
    //   95: invokevirtual 64	java/lang/String:length	()I
    //   98: ifeq +36 -> 134
    //   101: iload_1
    //   102: istore_2
    //   103: aload_3
    //   104: ldc 66
    //   106: invokevirtual 70	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   109: ifeq +25 -> 134
    //   112: aload_3
    //   113: iconst_0
    //   114: aload_3
    //   115: ldc 66
    //   117: invokevirtual 54	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   120: invokevirtual 73	java/lang/String:substring	(II)Ljava/lang/String;
    //   123: invokevirtual 61	java/lang/String:trim	()Ljava/lang/String;
    //   126: invokestatic 78	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   129: sipush 1024
    //   132: idiv
    //   133: istore_2
    //   134: aload 4
    //   136: invokevirtual 81	java/io/BufferedReader:close	()V
    //   139: iload_2
    //   140: putstatic 11	com/tencent/smtt/sdk/a:b	I
    //   143: ldc 20
    //   145: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -124 -> 24
    //   151: astore 4
    //   153: aconst_null
    //   154: astore 4
    //   156: iload_0
    //   157: istore_2
    //   158: aload 4
    //   160: ifnull -21 -> 139
    //   163: aload 4
    //   165: invokevirtual 81	java/io/BufferedReader:close	()V
    //   168: iload_0
    //   169: istore_2
    //   170: goto -31 -> 139
    //   173: astore 4
    //   175: iload_0
    //   176: istore_2
    //   177: goto -38 -> 139
    //   180: astore 4
    //   182: aconst_null
    //   183: astore 4
    //   185: iload_0
    //   186: istore_2
    //   187: aload 4
    //   189: ifnull -50 -> 139
    //   192: aload 4
    //   194: invokevirtual 81	java/io/BufferedReader:close	()V
    //   197: iload_0
    //   198: istore_2
    //   199: goto -60 -> 139
    //   202: astore 4
    //   204: iload_0
    //   205: istore_2
    //   206: goto -67 -> 139
    //   209: astore_3
    //   210: aconst_null
    //   211: astore 4
    //   213: aload 4
    //   215: ifnull +8 -> 223
    //   218: aload 4
    //   220: invokevirtual 81	java/io/BufferedReader:close	()V
    //   223: ldc 20
    //   225: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_3
    //   229: athrow
    //   230: astore 4
    //   232: goto -93 -> 139
    //   235: astore 4
    //   237: goto -14 -> 223
    //   240: astore_3
    //   241: goto -28 -> 213
    //   244: astore_3
    //   245: goto -60 -> 185
    //   248: astore_3
    //   249: goto -93 -> 156
    //
    // Exception table:
    //   from	to	target	type
    //   26	50	151	java/io/IOException
    //   163	168	173	java/io/IOException
    //   26	50	180	java/lang/Throwable
    //   192	197	202	java/io/IOException
    //   26	50	209	finally
    //   134	139	230	java/io/IOException
    //   218	223	235	java/io/IOException
    //   50	56	240	finally
    //   62	69	240	finally
    //   74	86	240	finally
    //   94	101	240	finally
    //   103	134	240	finally
    //   50	56	244	java/lang/Throwable
    //   62	69	244	java/lang/Throwable
    //   74	86	244	java/lang/Throwable
    //   94	101	244	java/lang/Throwable
    //   103	134	244	java/lang/Throwable
    //   50	56	248	java/io/IOException
    //   62	69	248	java/io/IOException
    //   74	86	248	java/io/IOException
    //   94	101	248	java/io/IOException
    //   103	134	248	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a
 * JD-Core Version:    0.6.2
 */