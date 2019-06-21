package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class s extends j<r>
  implements g.a
{
  public static final String[] fnj;
  private static final String[] ybf;
  public e bSd;

  static
  {
    AppMethodBeat.i(62890);
    fnj = new String[] { j.a(r.ccO, "SmileyPanelConfigInfo") };
    ybf = new String[] { "position", "key" };
    AppMethodBeat.o(62890);
  }

  public s(e parame)
  {
    this(parame, r.ccO, "SmileyPanelConfigInfo");
  }

  private s(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  // ERROR //
  public final java.util.ArrayList<r> bjP()
  {
    // Byte code:
    //   0: ldc 63
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 65	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 67	java/util/ArrayList:<init>	()V
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 57	com/tencent/mm/storage/emotion/s:bSd	Lcom/tencent/mm/sdk/e/e;
    //   17: ldc 31
    //   19: getstatic 43	com/tencent/mm/storage/emotion/s:ybf	[Ljava/lang/String;
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: iconst_2
    //   28: invokeinterface 72 9 0
    //   33: astore_2
    //   34: aload_2
    //   35: ifnull +60 -> 95
    //   38: aload_2
    //   39: astore_3
    //   40: aload_2
    //   41: invokeinterface 78 1 0
    //   46: ifeq +49 -> 95
    //   49: aload_2
    //   50: astore_3
    //   51: new 25	com/tencent/mm/storage/emotion/r
    //   54: astore 4
    //   56: aload_2
    //   57: astore_3
    //   58: aload 4
    //   60: invokespecial 79	com/tencent/mm/storage/emotion/r:<init>	()V
    //   63: aload_2
    //   64: astore_3
    //   65: aload 4
    //   67: aload_2
    //   68: invokevirtual 83	com/tencent/mm/storage/emotion/r:d	(Landroid/database/Cursor;)V
    //   71: aload_2
    //   72: astore_3
    //   73: aload_1
    //   74: aload 4
    //   76: invokevirtual 87	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   79: pop
    //   80: aload_2
    //   81: astore_3
    //   82: aload_2
    //   83: invokeinterface 90 1 0
    //   88: istore 5
    //   90: iload 5
    //   92: ifne -43 -> 49
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokeinterface 93 1 0
    //   105: ldc 63
    //   107: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: aload_1
    //   111: areturn
    //   112: astore 4
    //   114: aconst_null
    //   115: astore_2
    //   116: aload_2
    //   117: astore_3
    //   118: ldc 95
    //   120: aload 4
    //   122: invokestatic 101	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   125: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload_2
    //   129: ifnull -24 -> 105
    //   132: aload_2
    //   133: invokeinterface 93 1 0
    //   138: goto -33 -> 105
    //   141: astore_3
    //   142: aconst_null
    //   143: astore_2
    //   144: aload_3
    //   145: astore 4
    //   147: aload_2
    //   148: ifnull +9 -> 157
    //   151: aload_2
    //   152: invokeinterface 93 1 0
    //   157: ldc 63
    //   159: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: aload 4
    //   164: athrow
    //   165: astore 4
    //   167: aload_3
    //   168: astore_2
    //   169: goto -22 -> 147
    //   172: astore 4
    //   174: goto -58 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   13	34	112	java/lang/Exception
    //   13	34	141	finally
    //   40	49	165	finally
    //   51	56	165	finally
    //   58	63	165	finally
    //   65	71	165	finally
    //   73	80	165	finally
    //   82	90	165	finally
    //   118	128	165	finally
    //   40	49	172	java/lang/Exception
    //   51	56	172	java/lang/Exception
    //   58	63	172	java/lang/Exception
    //   65	71	172	java/lang/Exception
    //   73	80	172	java/lang/Exception
    //   82	90	172	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.s
 * JD-Core Version:    0.6.2
 */