package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class l extends j<k>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(87848);
    fnj = new String[] { j.a(k.ccO, "CardQrCodeDataInfo") };
    AppMethodBeat.o(87848);
  }

  public l(e parame)
  {
    super(parame, k.ccO, "CardQrCodeDataInfo", k.diI);
    this.bSd = parame;
  }

  public final List<k> Gw(String paramString)
  {
    AppMethodBeat.i(87843);
    ArrayList localArrayList = new ArrayList();
    paramString = this.bSd.rawQuery("select * from CardQrCodeDataInfo where card_id =? AND status=0", new String[] { paramString });
    while (true)
    {
      if (paramString != null);
      try
      {
        if (paramString.moveToNext())
        {
          k localk = new com/tencent/mm/plugin/card/model/k;
          localk.<init>();
          localk.d(paramString);
          localArrayList.add(localk);
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeByCardId error!", new Object[] { localException.getMessage() });
        while (true)
        {
          return localArrayList;
          if (paramString != null)
            paramString.close();
        }
      }
      finally
      {
        if (paramString != null)
          paramString.close();
        AppMethodBeat.o(87843);
      }
    }
  }

  // ERROR //
  public final k Gx(String paramString)
  {
    // Byte code:
    //   0: ldc 106
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/plugin/card/model/l:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 108
    //   11: iconst_1
    //   12: anewarray 20	java/lang/String
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: aastore
    //   19: invokeinterface 65 3 0
    //   24: astore_2
    //   25: aload_2
    //   26: ifnull +78 -> 104
    //   29: aload_2
    //   30: invokeinterface 112 1 0
    //   35: ifle +69 -> 104
    //   38: aload_2
    //   39: iconst_0
    //   40: invokeinterface 116 2 0
    //   45: pop
    //   46: new 22	com/tencent/mm/plugin/card/model/k
    //   49: astore_3
    //   50: aload_3
    //   51: invokespecial 72	com/tencent/mm/plugin/card/model/k:<init>	()V
    //   54: aload_3
    //   55: aload_2
    //   56: invokevirtual 76	com/tencent/mm/plugin/card/model/k:d	(Landroid/database/Cursor;)V
    //   59: ldc 84
    //   61: ldc 118
    //   63: iconst_2
    //   64: anewarray 88	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_1
    //   70: aastore
    //   71: dup
    //   72: iconst_1
    //   73: aload_3
    //   74: getfield 122	com/tencent/mm/plugin/card/model/k:field_code_id	Ljava/lang/String;
    //   77: aastore
    //   78: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: aload_3
    //   82: astore_1
    //   83: aload_1
    //   84: astore_3
    //   85: aload_2
    //   86: ifnull +11 -> 97
    //   89: aload_2
    //   90: invokeinterface 101 1 0
    //   95: aload_1
    //   96: astore_3
    //   97: ldc 106
    //   99: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_3
    //   103: areturn
    //   104: ldc 84
    //   106: ldc 126
    //   108: iconst_1
    //   109: anewarray 88	java/lang/Object
    //   112: dup
    //   113: iconst_0
    //   114: aload_1
    //   115: aastore
    //   116: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aconst_null
    //   120: astore_1
    //   121: goto -38 -> 83
    //   124: astore 4
    //   126: aconst_null
    //   127: astore_1
    //   128: ldc 84
    //   130: ldc 128
    //   132: iconst_1
    //   133: anewarray 88	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: aload 4
    //   140: invokevirtual 92	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   143: aastore
    //   144: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_1
    //   148: astore_3
    //   149: aload_2
    //   150: ifnull -53 -> 97
    //   153: aload_2
    //   154: invokeinterface 101 1 0
    //   159: aload_1
    //   160: astore_3
    //   161: goto -64 -> 97
    //   164: astore_1
    //   165: aload_2
    //   166: ifnull +9 -> 175
    //   169: aload_2
    //   170: invokeinterface 101 1 0
    //   175: ldc 106
    //   177: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: aload_1
    //   181: athrow
    //   182: astore 4
    //   184: aload_3
    //   185: astore_1
    //   186: goto -58 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   29	54	124	java/lang/Exception
    //   104	119	124	java/lang/Exception
    //   29	54	164	finally
    //   54	81	164	finally
    //   104	119	164	finally
    //   128	147	164	finally
    //   54	81	182	java/lang/Exception
  }

  // ERROR //
  public final k Gy(String paramString)
  {
    // Byte code:
    //   0: ldc 130
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 48	com/tencent/mm/plugin/card/model/l:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 132
    //   11: iconst_1
    //   12: anewarray 20	java/lang/String
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: aastore
    //   19: invokeinterface 65 3 0
    //   24: astore_2
    //   25: aload_2
    //   26: ifnull +78 -> 104
    //   29: aload_2
    //   30: invokeinterface 112 1 0
    //   35: ifle +69 -> 104
    //   38: aload_2
    //   39: iconst_0
    //   40: invokeinterface 116 2 0
    //   45: pop
    //   46: new 22	com/tencent/mm/plugin/card/model/k
    //   49: astore_3
    //   50: aload_3
    //   51: invokespecial 72	com/tencent/mm/plugin/card/model/k:<init>	()V
    //   54: aload_3
    //   55: aload_2
    //   56: invokevirtual 76	com/tencent/mm/plugin/card/model/k:d	(Landroid/database/Cursor;)V
    //   59: ldc 84
    //   61: ldc 134
    //   63: iconst_2
    //   64: anewarray 88	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_1
    //   70: aastore
    //   71: dup
    //   72: iconst_1
    //   73: aload_3
    //   74: getfield 122	com/tencent/mm/plugin/card/model/k:field_code_id	Ljava/lang/String;
    //   77: aastore
    //   78: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: aload_3
    //   82: astore_1
    //   83: aload_1
    //   84: astore_3
    //   85: aload_2
    //   86: ifnull +11 -> 97
    //   89: aload_2
    //   90: invokeinterface 101 1 0
    //   95: aload_1
    //   96: astore_3
    //   97: ldc 130
    //   99: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_3
    //   103: areturn
    //   104: ldc 84
    //   106: ldc 136
    //   108: iconst_1
    //   109: anewarray 88	java/lang/Object
    //   112: dup
    //   113: iconst_0
    //   114: aload_1
    //   115: aastore
    //   116: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aconst_null
    //   120: astore_1
    //   121: goto -38 -> 83
    //   124: astore_3
    //   125: aconst_null
    //   126: astore_1
    //   127: ldc 84
    //   129: ldc 138
    //   131: iconst_1
    //   132: anewarray 88	java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: aload_3
    //   138: invokevirtual 92	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   141: aastore
    //   142: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   145: aload_1
    //   146: astore_3
    //   147: aload_2
    //   148: ifnull -51 -> 97
    //   151: aload_2
    //   152: invokeinterface 101 1 0
    //   157: aload_1
    //   158: astore_3
    //   159: goto -62 -> 97
    //   162: astore_1
    //   163: aload_2
    //   164: ifnull +9 -> 173
    //   167: aload_2
    //   168: invokeinterface 101 1 0
    //   173: ldc 130
    //   175: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: aload_1
    //   179: athrow
    //   180: astore 4
    //   182: aload_3
    //   183: astore_1
    //   184: aload 4
    //   186: astore_3
    //   187: goto -60 -> 127
    //
    // Exception table:
    //   from	to	target	type
    //   29	54	124	java/lang/Exception
    //   104	119	124	java/lang/Exception
    //   29	54	162	finally
    //   54	81	162	finally
    //   104	119	162	finally
    //   127	145	162	finally
    //   54	81	180	java/lang/Exception
  }

  public final boolean dm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(87846);
    k localk = new k();
    localk.field_card_id = paramString1;
    localk.field_code_id = paramString2;
    boolean bool = a(localk, new String[] { "card_id", "code_id" });
    if (!bool)
      ab.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  failure! card_id = %s, code_id = %s", new Object[] { localk.field_card_id, localk.field_code_id });
    while (true)
    {
      AppMethodBeat.o(87846);
      return bool;
      ab.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  success! card_id = %s, code_id = %s", new Object[] { localk.field_card_id, localk.field_code_id });
    }
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(87847);
    k localk = new k();
    localk.field_card_id = paramString;
    boolean bool = a(localk, new String[] { "card_id" });
    if (!bool)
      ab.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  failure! card_id = %s", new Object[] { paramString });
    while (true)
    {
      AppMethodBeat.o(87847);
      return bool;
      ab.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  success! card_id = %s", new Object[] { paramString });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.l
 * JD-Core Version:    0.6.2
 */