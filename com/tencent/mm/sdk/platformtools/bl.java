package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.d;

public final class bl
{
  private final d xBP;
  private ae<String, String> xBQ;

  public bl(String paramString)
  {
    AppMethodBeat.i(52281);
    this.xBQ = new ae(256);
    this.xBP = new d(paramString);
    AppMethodBeat.o(52281);
  }

  // ERROR //
  public final String decryptTag(String paramString)
  {
    // Byte code:
    //   0: ldc 42
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: astore_2
    //   7: aload_1
    //   8: ldc 44
    //   10: invokevirtual 50	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   13: ifeq +183 -> 196
    //   16: aload_0
    //   17: getfield 27	com/tencent/mm/sdk/platformtools/bl:xBQ	Lcom/tencent/mm/sdk/platformtools/ae;
    //   20: aload_1
    //   21: invokevirtual 54	com/tencent/mm/sdk/platformtools/ae:aj	(Ljava/lang/Object;)Z
    //   24: ifeq +24 -> 48
    //   27: aload_0
    //   28: getfield 27	com/tencent/mm/sdk/platformtools/bl:xBQ	Lcom/tencent/mm/sdk/platformtools/ae;
    //   31: aload_1
    //   32: invokevirtual 58	com/tencent/mm/sdk/platformtools/ae:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   35: checkcast 46	java/lang/String
    //   38: astore_2
    //   39: ldc 42
    //   41: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aload_2
    //   45: astore_1
    //   46: aload_1
    //   47: areturn
    //   48: aload_1
    //   49: iconst_1
    //   50: invokevirtual 62	java/lang/String:substring	(I)Ljava/lang/String;
    //   53: astore_2
    //   54: aload_2
    //   55: ldc 64
    //   57: invokevirtual 68	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   60: astore_3
    //   61: aload_3
    //   62: arraylength
    //   63: iconst_1
    //   64: if_icmple +150 -> 214
    //   67: aload_3
    //   68: iconst_0
    //   69: aaload
    //   70: astore 4
    //   72: aload_3
    //   73: iconst_0
    //   74: aaload
    //   75: invokestatic 74	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   78: invokevirtual 78	java/lang/Integer:intValue	()I
    //   81: istore 5
    //   83: aload_2
    //   84: aload 4
    //   86: invokevirtual 81	java/lang/String:length	()I
    //   89: iconst_1
    //   90: iadd
    //   91: aload 4
    //   93: invokevirtual 81	java/lang/String:length	()I
    //   96: iconst_1
    //   97: iadd
    //   98: iload 5
    //   100: iadd
    //   101: invokevirtual 84	java/lang/String:substring	(II)Ljava/lang/String;
    //   104: astore_3
    //   105: aload_2
    //   106: iload 5
    //   108: aload 4
    //   110: invokevirtual 81	java/lang/String:length	()I
    //   113: iconst_1
    //   114: iadd
    //   115: iadd
    //   116: invokevirtual 62	java/lang/String:substring	(I)Ljava/lang/String;
    //   119: astore 4
    //   121: new 86	java/lang/StringBuilder
    //   124: astore 6
    //   126: aload 6
    //   128: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   131: aload 6
    //   133: aload_0
    //   134: getfield 33	com/tencent/mm/sdk/platformtools/bl:xBP	Lcom/tencent/mm/a/d;
    //   137: aload_3
    //   138: invokevirtual 90	com/tencent/mm/a/d:cr	(Ljava/lang/String;)Ljava/lang/String;
    //   141: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload 4
    //   146: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: astore_3
    //   153: aload_0
    //   154: getfield 27	com/tencent/mm/sdk/platformtools/bl:xBQ	Lcom/tencent/mm/sdk/platformtools/ae;
    //   157: aload_1
    //   158: aload_3
    //   159: invokevirtual 102	com/tencent/mm/sdk/platformtools/ae:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   162: pop
    //   163: ldc 42
    //   165: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: aload_3
    //   169: astore_1
    //   170: goto -124 -> 46
    //   173: astore_2
    //   174: ldc 104
    //   176: aload_2
    //   177: ldc 106
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 112	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: ldc 114
    //   188: aload_1
    //   189: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual 120	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   195: astore_2
    //   196: ldc 42
    //   198: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: aload_2
    //   202: astore_1
    //   203: goto -157 -> 46
    //   206: astore_3
    //   207: aload_2
    //   208: astore_1
    //   209: aload_3
    //   210: astore_2
    //   211: goto -37 -> 174
    //   214: goto -18 -> 196
    //
    // Exception table:
    //   from	to	target	type
    //   7	39	173	java/lang/Exception
    //   48	54	173	java/lang/Exception
    //   54	67	206	java/lang/Exception
    //   72	163	206	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bl
 * JD-Core Version:    0.6.2
 */