package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;

public final class q extends j<SmileyInfo>
  implements g.a
{
  public static final String[] fnj;
  private static final String[] ybd;
  private static final String[] ybe;
  private e bSd;

  static
  {
    AppMethodBeat.i(62886);
    fnj = new String[] { j.a(SmileyInfo.ccO, "SmileyInfo") };
    ybd = new String[] { "key", "cnValue", "qqValue", "enValue", "twValue", "thValue", "eggIndex", "fileName" };
    ybe = new String[] { "key" };
    AppMethodBeat.o(62886);
  }

  public q(e parame)
  {
    this(parame, SmileyInfo.ccO, "SmileyInfo");
  }

  private q(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean an(ArrayList<SmileyInfo> paramArrayList)
  {
    AppMethodBeat.i(62885);
    boolean bool;
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      ab.i("MicroMsg.emoji.NewSmileyInfoStorage", "insertSmileyInfoList failed. list is null.");
      AppMethodBeat.o(62885);
      bool = false;
      return bool;
    }
    h localh;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
    }
    while (true)
    {
      this.bSd.delete("SmileyInfo", null, null);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
        b((SmileyInfo)paramArrayList.next());
      int i = -1;
      if (localh != null)
        i = localh.mB(l);
      if (i >= 0)
      {
        bool = true;
        AppMethodBeat.o(62885);
        break;
      }
      AppMethodBeat.o(62885);
      bool = false;
      break;
      l = -1L;
      localh = null;
    }
  }

  // ERROR //
  public final ArrayList<SmileyInfo> bjO()
  {
    // Byte code:
    //   0: ldc 144
    //   2: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 78	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 146	java/util/ArrayList:<init>	()V
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 72	com/tencent/mm/storage/emotion/q:bSd	Lcom/tencent/mm/sdk/e/e;
    //   17: ldc 32
    //   19: getstatic 56	com/tencent/mm/storage/emotion/q:ybd	[Ljava/lang/String;
    //   22: ldc 148
    //   24: iconst_1
    //   25: anewarray 24	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: ldc 150
    //   32: aastore
    //   33: aconst_null
    //   34: aconst_null
    //   35: aconst_null
    //   36: iconst_2
    //   37: invokeinterface 153 9 0
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull +68 -> 112
    //   47: aload_2
    //   48: astore_3
    //   49: aload_2
    //   50: invokeinterface 158 1 0
    //   55: ifeq +57 -> 112
    //   58: aload_2
    //   59: astore_3
    //   60: new 26	com/tencent/mm/storage/emotion/SmileyInfo
    //   63: astore 4
    //   65: aload_2
    //   66: astore_3
    //   67: aload 4
    //   69: invokespecial 159	com/tencent/mm/storage/emotion/SmileyInfo:<init>	()V
    //   72: aload_2
    //   73: astore_3
    //   74: aload 4
    //   76: aload_2
    //   77: invokevirtual 163	com/tencent/mm/storage/emotion/SmileyInfo:d	(Landroid/database/Cursor;)V
    //   80: aload_2
    //   81: astore_3
    //   82: aload 4
    //   84: iconst_m1
    //   85: putfield 167	com/tencent/mm/storage/emotion/SmileyInfo:field_position	I
    //   88: aload_2
    //   89: astore_3
    //   90: aload_1
    //   91: aload 4
    //   93: invokevirtual 171	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   96: pop
    //   97: aload_2
    //   98: astore_3
    //   99: aload_2
    //   100: invokeinterface 174 1 0
    //   105: istore 5
    //   107: iload 5
    //   109: ifne -51 -> 58
    //   112: aload_2
    //   113: ifnull +9 -> 122
    //   116: aload_2
    //   117: invokeinterface 177 1 0
    //   122: ldc 144
    //   124: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: aload_1
    //   128: areturn
    //   129: astore 4
    //   131: aconst_null
    //   132: astore_2
    //   133: aload_2
    //   134: astore_3
    //   135: ldc 84
    //   137: aload 4
    //   139: invokestatic 183	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   142: invokestatic 186	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload_2
    //   146: ifnull -24 -> 122
    //   149: aload_2
    //   150: invokeinterface 177 1 0
    //   155: goto -33 -> 122
    //   158: astore_3
    //   159: aconst_null
    //   160: astore 4
    //   162: aload_3
    //   163: astore_2
    //   164: aload 4
    //   166: ifnull +10 -> 176
    //   169: aload 4
    //   171: invokeinterface 177 1 0
    //   176: ldc 144
    //   178: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: aload_2
    //   182: athrow
    //   183: astore_2
    //   184: aload_3
    //   185: astore 4
    //   187: goto -23 -> 164
    //   190: astore 4
    //   192: goto -59 -> 133
    //
    // Exception table:
    //   from	to	target	type
    //   13	43	129	java/lang/Exception
    //   13	43	158	finally
    //   49	58	183	finally
    //   60	65	183	finally
    //   67	72	183	finally
    //   74	80	183	finally
    //   82	88	183	finally
    //   90	97	183	finally
    //   99	107	183	finally
    //   135	145	183	finally
    //   49	58	190	java/lang/Exception
    //   60	65	190	java/lang/Exception
    //   67	72	190	java/lang/Exception
    //   74	80	190	java/lang/Exception
    //   82	88	190	java/lang/Exception
    //   90	97	190	java/lang/Exception
    //   99	107	190	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.q
 * JD-Core Version:    0.6.2
 */