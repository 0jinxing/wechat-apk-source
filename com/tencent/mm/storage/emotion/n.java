package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class n extends j<m>
  implements g.a
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(62866);
    fnj = new String[] { j.a(m.ccO, "EmotionRewardTipInfo") };
    AppMethodBeat.o(62866);
  }

  public n(e parame)
  {
    this(parame, m.ccO, "EmotionRewardTipInfo");
  }

  private n(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean a(m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(62865);
    if (paramm == null)
    {
      ab.w("MicroMsg.emoji.EmotionRewardTipStorage", "save failed info is null");
      AppMethodBeat.o(62865);
    }
    while (true)
    {
      return bool;
      long l = this.bSd.replace("EmotionRewardTipInfo", "prodcutID", paramm.Hl());
      if (l > 0L)
        ab.i("MicroMsg.emoji.EmotionRewardTipStorage", "save success");
      while (true)
      {
        if (l <= 0L)
          break label82;
        bool = true;
        AppMethodBeat.o(62865);
        break;
        ab.i("MicroMsg.emoji.EmotionRewardTipStorage", "save failed");
      }
      label82: AppMethodBeat.o(62865);
    }
  }

  // ERROR //
  public final m dvk()
  {
    // Byte code:
    //   0: ldc 86
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 50	com/tencent/mm/storage/emotion/n:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 88
    //   11: iconst_0
    //   12: anewarray 22	java/lang/String
    //   15: iconst_2
    //   16: invokeinterface 91 4 0
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +52 -> 75
    //   26: aload_1
    //   27: astore_2
    //   28: aload_1
    //   29: invokeinterface 97 1 0
    //   34: ifeq +41 -> 75
    //   37: aload_1
    //   38: astore_2
    //   39: new 24	com/tencent/mm/storage/emotion/m
    //   42: astore_3
    //   43: aload_1
    //   44: astore_2
    //   45: aload_3
    //   46: invokespecial 99	com/tencent/mm/storage/emotion/m:<init>	()V
    //   49: aload_1
    //   50: astore_2
    //   51: aload_3
    //   52: aload_1
    //   53: invokevirtual 103	com/tencent/mm/storage/emotion/m:d	(Landroid/database/Cursor;)V
    //   56: aload_1
    //   57: ifnull +9 -> 66
    //   60: aload_1
    //   61: invokeinterface 106 1 0
    //   66: ldc 86
    //   68: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: aload_3
    //   72: astore_2
    //   73: aload_2
    //   74: areturn
    //   75: aload_1
    //   76: ifnull +9 -> 85
    //   79: aload_1
    //   80: invokeinterface 106 1 0
    //   85: ldc 86
    //   87: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: aconst_null
    //   91: astore_2
    //   92: goto -19 -> 73
    //   95: astore_3
    //   96: aconst_null
    //   97: astore_1
    //   98: aload_1
    //   99: astore_2
    //   100: ldc 55
    //   102: ldc 108
    //   104: iconst_1
    //   105: anewarray 110	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: aload_3
    //   111: invokestatic 116	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   114: aastore
    //   115: invokestatic 120	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: aload_1
    //   119: ifnull -34 -> 85
    //   122: aload_1
    //   123: invokeinterface 106 1 0
    //   128: goto -43 -> 85
    //   131: astore_1
    //   132: aconst_null
    //   133: astore_2
    //   134: aload_2
    //   135: ifnull +9 -> 144
    //   138: aload_2
    //   139: invokeinterface 106 1 0
    //   144: ldc 86
    //   146: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aload_1
    //   150: athrow
    //   151: astore_1
    //   152: goto -18 -> 134
    //   155: astore_3
    //   156: goto -58 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   5	22	95	java/lang/Exception
    //   5	22	131	finally
    //   28	37	151	finally
    //   39	43	151	finally
    //   45	49	151	finally
    //   51	56	151	finally
    //   100	118	151	finally
    //   28	37	155	java/lang/Exception
    //   39	43	155	java/lang/Exception
    //   45	49	155	java/lang/Exception
    //   51	56	155	java/lang/Exception
  }

  public final boolean eu(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(62864);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmotionRewardTipStorage", "product id is null.");
      AppMethodBeat.o(62864);
    }
    while (true)
    {
      return bool;
      paramString = "UPDATE EmotionRewardTipInfo SET flag=" + paramInt + ",setFlagTime=" + System.currentTimeMillis() + " WHERE prodcutID='" + paramString + "'";
      bool = this.bSd.hY("EmotionRewardTipInfo", paramString);
      ab.i("MicroMsg.emoji.EmotionRewardTipStorage", "updateFlag result:%b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(62864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.n
 * JD-Core Version:    0.6.2
 */