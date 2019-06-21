package com.tencent.mm.modelvideo;

import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.e;

public final class x
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS VideoPlayHistory ( filename text PRIMARY KEY, starttime int, playduration int, downloadway int );" };
  e bSd;

  public x(h paramh)
  {
    this.bSd = paramh;
  }

  // ERROR //
  public final boolean b(String paramString, com.tencent.mm.pointers.PInt paramPInt1, com.tencent.mm.pointers.PInt paramPInt2)
  {
    // Byte code:
    //   0: ldc 28
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore 4
    //   8: aload_0
    //   9: getfield 23	com/tencent/mm/modelvideo/x:bSd	Lcom/tencent/mm/sdk/e/e;
    //   12: astore 5
    //   14: aload_1
    //   15: invokestatic 40	com/tencent/mm/sdk/platformtools/bo:vA	(Ljava/lang/String;)Ljava/lang/String;
    //   18: astore_1
    //   19: aload 5
    //   21: ldc 42
    //   23: iconst_2
    //   24: anewarray 12	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: ldc 44
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: ldc 46
    //   36: aastore
    //   37: ldc 48
    //   39: iconst_1
    //   40: anewarray 12	java/lang/String
    //   43: dup
    //   44: iconst_0
    //   45: aload_1
    //   46: aastore
    //   47: ldc 50
    //   49: ldc 50
    //   51: ldc 50
    //   53: iconst_2
    //   54: invokeinterface 56 9 0
    //   59: astore_1
    //   60: aload_1
    //   61: astore 4
    //   63: aload 4
    //   65: ifnull +218 -> 283
    //   68: aload 4
    //   70: astore_1
    //   71: aload 4
    //   73: invokeinterface 62 1 0
    //   78: ifeq +205 -> 283
    //   81: aload 4
    //   83: astore_1
    //   84: aload_2
    //   85: aload 4
    //   87: aload 4
    //   89: ldc 44
    //   91: invokeinterface 66 2 0
    //   96: invokeinterface 70 2 0
    //   101: putfield 76	com/tencent/mm/pointers/PInt:value	I
    //   104: aload 4
    //   106: astore_1
    //   107: aload_3
    //   108: aload 4
    //   110: aload 4
    //   112: ldc 46
    //   114: invokeinterface 66 2 0
    //   119: invokeinterface 70 2 0
    //   124: putfield 76	com/tencent/mm/pointers/PInt:value	I
    //   127: iconst_1
    //   128: istore 6
    //   130: iload 6
    //   132: istore 7
    //   134: aload 4
    //   136: ifnull +14 -> 150
    //   139: aload 4
    //   141: invokeinterface 79 1 0
    //   146: iload 6
    //   148: istore 7
    //   150: ldc 81
    //   152: new 83	java/lang/StringBuilder
    //   155: dup
    //   156: ldc 85
    //   158: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: iload 7
    //   163: invokevirtual 92	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   166: ldc 94
    //   168: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload_2
    //   172: getfield 76	com/tencent/mm/pointers/PInt:value	I
    //   175: invokevirtual 100	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   178: ldc 102
    //   180: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload_3
    //   184: getfield 76	com/tencent/mm/pointers/PInt:value	I
    //   187: invokevirtual 100	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   190: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: invokestatic 111	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: ldc 28
    //   198: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: iload 7
    //   203: ireturn
    //   204: astore 5
    //   206: aconst_null
    //   207: astore 4
    //   209: aload 4
    //   211: astore_1
    //   212: ldc 81
    //   214: aload 5
    //   216: ldc 50
    //   218: iconst_0
    //   219: anewarray 4	java/lang/Object
    //   222: invokestatic 118	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: aload 4
    //   227: ifnull +50 -> 277
    //   230: aload 4
    //   232: invokeinterface 79 1 0
    //   237: iconst_0
    //   238: istore 7
    //   240: goto -90 -> 150
    //   243: astore_1
    //   244: aload 4
    //   246: astore_2
    //   247: aload_1
    //   248: astore_3
    //   249: aload_2
    //   250: ifnull +9 -> 259
    //   253: aload_2
    //   254: invokeinterface 79 1 0
    //   259: ldc 28
    //   261: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   264: aload_3
    //   265: athrow
    //   266: astore_3
    //   267: aload_1
    //   268: astore_2
    //   269: goto -20 -> 249
    //   272: astore 5
    //   274: goto -65 -> 209
    //   277: iconst_0
    //   278: istore 7
    //   280: goto -130 -> 150
    //   283: iconst_0
    //   284: istore 6
    //   286: goto -156 -> 130
    //
    // Exception table:
    //   from	to	target	type
    //   8	60	204	java/lang/Exception
    //   8	60	243	finally
    //   71	81	266	finally
    //   84	104	266	finally
    //   107	127	266	finally
    //   212	225	266	finally
    //   71	81	272	java/lang/Exception
    //   84	104	272	java/lang/Exception
    //   107	127	272	java/lang/Exception
  }

  // ERROR //
  public final boolean uB(String paramString)
  {
    // Byte code:
    //   0: ldc 121
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokestatic 124	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   9: ifeq +12 -> 21
    //   12: ldc 121
    //   14: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   17: iconst_0
    //   18: istore_2
    //   19: iload_2
    //   20: ireturn
    //   21: aconst_null
    //   22: astore_3
    //   23: aload_0
    //   24: getfield 23	com/tencent/mm/modelvideo/x:bSd	Lcom/tencent/mm/sdk/e/e;
    //   27: astore 4
    //   29: aload_1
    //   30: invokestatic 40	com/tencent/mm/sdk/platformtools/bo:vA	(Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_1
    //   34: aload 4
    //   36: ldc 42
    //   38: iconst_1
    //   39: anewarray 12	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: ldc 126
    //   46: aastore
    //   47: ldc 48
    //   49: iconst_1
    //   50: anewarray 12	java/lang/String
    //   53: dup
    //   54: iconst_0
    //   55: aload_1
    //   56: aastore
    //   57: ldc 50
    //   59: ldc 50
    //   61: ldc 50
    //   63: invokeinterface 130 8 0
    //   68: astore 4
    //   70: aload 4
    //   72: ifnull +40 -> 112
    //   75: aload 4
    //   77: astore_1
    //   78: aload 4
    //   80: invokeinterface 62 1 0
    //   85: istore_2
    //   86: iload_2
    //   87: ifeq +25 -> 112
    //   90: aload 4
    //   92: ifnull +10 -> 102
    //   95: aload 4
    //   97: invokeinterface 79 1 0
    //   102: ldc 121
    //   104: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: iconst_1
    //   108: istore_2
    //   109: goto -90 -> 19
    //   112: aload 4
    //   114: ifnull +10 -> 124
    //   117: aload 4
    //   119: invokeinterface 79 1 0
    //   124: ldc 121
    //   126: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: iconst_0
    //   130: istore_2
    //   131: goto -112 -> 19
    //   134: astore_3
    //   135: aconst_null
    //   136: astore 4
    //   138: aload 4
    //   140: astore_1
    //   141: ldc 81
    //   143: aload_3
    //   144: ldc 50
    //   146: iconst_0
    //   147: anewarray 4	java/lang/Object
    //   150: invokestatic 118	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: aload 4
    //   155: ifnull -31 -> 124
    //   158: aload 4
    //   160: invokeinterface 79 1 0
    //   165: goto -41 -> 124
    //   168: astore 4
    //   170: aload_3
    //   171: astore_1
    //   172: aload_1
    //   173: ifnull +9 -> 182
    //   176: aload_1
    //   177: invokeinterface 79 1 0
    //   182: ldc 121
    //   184: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: aload 4
    //   189: athrow
    //   190: astore 4
    //   192: goto -20 -> 172
    //   195: astore_3
    //   196: goto -58 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   23	70	134	java/lang/Exception
    //   23	70	168	finally
    //   78	86	190	finally
    //   141	153	190	finally
    //   78	86	195	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.x
 * JD-Core Version:    0.6.2
 */