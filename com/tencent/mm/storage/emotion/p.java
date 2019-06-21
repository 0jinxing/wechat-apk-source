package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.protocal.protobuf.GetEmotionListResponse;
import com.tencent.mm.protocal.protobuf.aii;
import com.tencent.mm.protocal.protobuf.aml;
import com.tencent.mm.protocal.protobuf.cab;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

public final class p extends j<o>
  implements g.a
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(62878);
    fnj = new String[] { j.a(o.ccO, "GetEmotionListCache") };
    AppMethodBeat.o(62878);
  }

  public p(e parame)
  {
    this(parame, o.ccO, "GetEmotionListCache");
  }

  private p(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.bSd = parame;
  }

  private boolean aqr(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(62869);
    if (this.bSd.delete("GetEmotionListCache", "reqType=?", new String[] { paramString }) > 0)
      AppMethodBeat.o(62869);
    while (true)
    {
      return bool;
      AppMethodBeat.o(62869);
      bool = false;
    }
  }

  public final GetEmotionListResponse ME(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(62871);
    Cursor localCursor = this.bSd.a("GetEmotionListCache", null, "reqType=?", new String[] { String.valueOf(paramInt) }, null, null, null, 2);
    Object localObject2 = localObject1;
    o localo;
    if (localCursor != null)
    {
      localObject2 = localObject1;
      if (localCursor.moveToFirst())
        localo = new o(localCursor);
    }
    try
    {
      localObject2 = new com/tencent/mm/protocal/protobuf/GetEmotionListResponse;
      ((GetEmotionListResponse)localObject2).<init>();
      ((GetEmotionListResponse)localObject2).parseFrom(localo.field_cache);
      ab.d("MicroMsg.emoji.Storage", "succed get cache: %d", new Object[] { Integer.valueOf(paramInt) });
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(62871);
      return localObject2;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bo.l(localIOException) });
        Object localObject3 = localObject1;
      }
    }
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean a(int paramInt, GetEmotionListResponse paramGetEmotionListResponse)
  {
    boolean bool1 = false;
    AppMethodBeat.i(62870);
    boolean bool2;
    if (paramGetEmotionListResponse == null)
    {
      AppMethodBeat.o(62870);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        this.bSd.delete("GetEmotionListCache", "reqType=?", new String[] { String.valueOf(paramInt) });
        o localo = new com/tencent/mm/storage/emotion/o;
        localo.<init>(String.valueOf(paramInt), paramGetEmotionListResponse.toByteArray());
        ab.d("MicroMsg.emoji.Storage", "insert cache: %d", new Object[] { Integer.valueOf(paramInt) });
        bool2 = b(localo);
        AppMethodBeat.o(62870);
      }
      catch (Exception paramGetEmotionListResponse)
      {
        ab.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bo.l(paramGetEmotionListResponse) });
        AppMethodBeat.o(62870);
        bool2 = bool1;
      }
    }
  }

  public final boolean a(String paramString, aii paramaii)
  {
    boolean bool1 = false;
    AppMethodBeat.i(62877);
    boolean bool2;
    if (paramaii == null)
    {
      AppMethodBeat.o(62877);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        aqr(paramString);
        o localo = new com/tencent/mm/storage/emotion/o;
        localo.<init>(paramString, paramaii.toByteArray());
        bool2 = b(localo);
        AppMethodBeat.o(62877);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(62877);
        bool2 = bool1;
      }
    }
  }

  public final boolean a(String paramString, aml paramaml)
  {
    boolean bool1 = false;
    AppMethodBeat.i(62872);
    boolean bool2;
    if (paramaml == null)
    {
      AppMethodBeat.o(62872);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        aqr(paramString);
        o localo = new com/tencent/mm/storage/emotion/o;
        localo.<init>(paramString, paramaml.toByteArray());
        bool2 = b(localo);
        AppMethodBeat.o(62872);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(62872);
        bool2 = bool1;
      }
    }
  }

  public final aml aqs(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(62873);
    Cursor localCursor = this.bSd.a("GetEmotionListCache", null, "reqType=?", new String[] { paramString }, null, null, null, 2);
    Object localObject2 = localObject1;
    o localo;
    if (localCursor != null)
    {
      localObject2 = localObject1;
      if (localCursor.moveToFirst())
        localo = new o(localCursor);
    }
    try
    {
      localObject2 = new com/tencent/mm/protocal/protobuf/aml;
      ((aml)localObject2).<init>();
      ((aml)localObject2).parseFrom(localo.field_cache);
      ab.d("MicroMsg.emoji.Storage", "succed get designerID cache: %s", new Object[] { paramString });
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(62873);
      return localObject2;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bo.l(paramString) });
        localObject2 = localObject1;
      }
    }
  }

  // ERROR //
  public final aii aqt(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 165
    //   4: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +19 -> 30
    //   14: ldc 96
    //   16: ldc 170
    //   18: invokestatic 174	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc 165
    //   23: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: aload_2
    //   27: astore_1
    //   28: aload_1
    //   29: areturn
    //   30: aload_0
    //   31: getfield 50	com/tencent/mm/storage/emotion/p:bSd	Lcom/tencent/mm/sdk/e/e;
    //   34: ldc 30
    //   36: aconst_null
    //   37: ldc 55
    //   39: iconst_1
    //   40: anewarray 22	java/lang/String
    //   43: dup
    //   44: iconst_0
    //   45: aload_1
    //   46: aastore
    //   47: aconst_null
    //   48: aconst_null
    //   49: aconst_null
    //   50: invokeinterface 178 8 0
    //   55: astore_2
    //   56: aload_2
    //   57: ifnull +159 -> 216
    //   60: aload_2
    //   61: astore_1
    //   62: aload_2
    //   63: invokeinterface 79 1 0
    //   68: ifeq +148 -> 216
    //   71: aload_2
    //   72: astore_1
    //   73: new 24	com/tencent/mm/storage/emotion/o
    //   76: astore_3
    //   77: aload_2
    //   78: astore_1
    //   79: aload_3
    //   80: aload_2
    //   81: invokespecial 82	com/tencent/mm/storage/emotion/o:<init>	(Landroid/database/Cursor;)V
    //   84: aload_2
    //   85: astore_1
    //   86: new 149	com/tencent/mm/protocal/protobuf/aii
    //   89: astore 4
    //   91: aload_2
    //   92: astore_1
    //   93: aload 4
    //   95: invokespecial 179	com/tencent/mm/protocal/protobuf/aii:<init>	()V
    //   98: aload_2
    //   99: astore_1
    //   100: aload 4
    //   102: aload_3
    //   103: getfield 90	com/tencent/mm/storage/emotion/o:field_cache	[B
    //   106: invokevirtual 180	com/tencent/mm/protocal/protobuf/aii:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   109: pop
    //   110: aload 4
    //   112: astore_1
    //   113: aload_2
    //   114: ifnull +12 -> 126
    //   117: aload_2
    //   118: invokeinterface 114 1 0
    //   123: aload 4
    //   125: astore_1
    //   126: ldc 165
    //   128: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: goto -103 -> 28
    //   134: astore 4
    //   136: aconst_null
    //   137: astore_2
    //   138: aload_2
    //   139: astore_1
    //   140: ldc 96
    //   142: ldc 116
    //   144: iconst_1
    //   145: anewarray 100	java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: aload 4
    //   152: invokestatic 122	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   155: aastore
    //   156: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload_2
    //   160: ifnull +51 -> 211
    //   163: aload_2
    //   164: invokeinterface 114 1 0
    //   169: aconst_null
    //   170: astore_1
    //   171: goto -45 -> 126
    //   174: astore_1
    //   175: aconst_null
    //   176: astore 4
    //   178: aload_1
    //   179: astore_2
    //   180: aload 4
    //   182: ifnull +10 -> 192
    //   185: aload 4
    //   187: invokeinterface 114 1 0
    //   192: ldc 165
    //   194: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: aload_2
    //   198: athrow
    //   199: astore_2
    //   200: aload_1
    //   201: astore 4
    //   203: goto -23 -> 180
    //   206: astore 4
    //   208: goto -70 -> 138
    //   211: aconst_null
    //   212: astore_1
    //   213: goto -87 -> 126
    //   216: aconst_null
    //   217: astore 4
    //   219: goto -109 -> 110
    //
    // Exception table:
    //   from	to	target	type
    //   30	56	134	java/io/IOException
    //   30	56	174	finally
    //   62	71	199	finally
    //   73	77	199	finally
    //   79	84	199	finally
    //   86	91	199	finally
    //   93	98	199	finally
    //   100	110	199	finally
    //   140	159	199	finally
    //   62	71	206	java/io/IOException
    //   73	77	206	java/io/IOException
    //   79	84	206	java/io/IOException
    //   86	91	206	java/io/IOException
    //   93	98	206	java/io/IOException
    //   100	110	206	java/io/IOException
  }

  public final boolean b(cab paramcab)
  {
    boolean bool1 = false;
    AppMethodBeat.i(62875);
    boolean bool2;
    if (paramcab == null)
    {
      AppMethodBeat.o(62875);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        aqr("Smiley_panel_req_type");
        o localo = new com/tencent/mm/storage/emotion/o;
        localo.<init>("Smiley_panel_req_type", paramcab.toByteArray());
        bool2 = b(localo);
        AppMethodBeat.o(62875);
      }
      catch (Exception paramcab)
      {
        ab.e("MicroMsg.emoji.Storage", "exception:%s", new Object[] { bo.l(paramcab) });
        AppMethodBeat.o(62875);
        bool2 = bool1;
      }
    }
  }

  // ERROR //
  public final cab bjU()
  {
    // Byte code:
    //   0: ldc 190
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 50	com/tencent/mm/storage/emotion/p:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 30
    //   11: aconst_null
    //   12: ldc 55
    //   14: iconst_1
    //   15: anewarray 22	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc 184
    //   22: aastore
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: invokeinterface 178 8 0
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +150 -> 183
    //   36: aload_1
    //   37: astore_2
    //   38: aload_1
    //   39: invokeinterface 79 1 0
    //   44: ifeq +139 -> 183
    //   47: aload_1
    //   48: astore_2
    //   49: new 24	com/tencent/mm/storage/emotion/o
    //   52: astore_3
    //   53: aload_1
    //   54: astore_2
    //   55: aload_3
    //   56: aload_1
    //   57: invokespecial 82	com/tencent/mm/storage/emotion/o:<init>	(Landroid/database/Cursor;)V
    //   60: aload_1
    //   61: astore_2
    //   62: new 186	com/tencent/mm/protocal/protobuf/cab
    //   65: astore 4
    //   67: aload_1
    //   68: astore_2
    //   69: aload 4
    //   71: invokespecial 191	com/tencent/mm/protocal/protobuf/cab:<init>	()V
    //   74: aload_1
    //   75: astore_2
    //   76: aload 4
    //   78: aload_3
    //   79: getfield 90	com/tencent/mm/storage/emotion/o:field_cache	[B
    //   82: invokevirtual 192	com/tencent/mm/protocal/protobuf/cab:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   85: pop
    //   86: aload 4
    //   88: astore_2
    //   89: aload_1
    //   90: ifnull +12 -> 102
    //   93: aload_1
    //   94: invokeinterface 114 1 0
    //   99: aload 4
    //   101: astore_2
    //   102: ldc 190
    //   104: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: aload_2
    //   108: areturn
    //   109: astore 4
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: astore_2
    //   115: ldc 96
    //   117: ldc 116
    //   119: iconst_1
    //   120: anewarray 100	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: aload 4
    //   127: invokestatic 122	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   130: aastore
    //   131: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: aload_1
    //   135: ifnull +43 -> 178
    //   138: aload_1
    //   139: invokeinterface 114 1 0
    //   144: aconst_null
    //   145: astore_2
    //   146: goto -44 -> 102
    //   149: astore_1
    //   150: aconst_null
    //   151: astore_2
    //   152: aload_2
    //   153: ifnull +9 -> 162
    //   156: aload_2
    //   157: invokeinterface 114 1 0
    //   162: ldc 190
    //   164: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: aload_1
    //   168: athrow
    //   169: astore_1
    //   170: goto -18 -> 152
    //   173: astore 4
    //   175: goto -62 -> 113
    //   178: aconst_null
    //   179: astore_2
    //   180: goto -78 -> 102
    //   183: aconst_null
    //   184: astore 4
    //   186: goto -100 -> 86
    //
    // Exception table:
    //   from	to	target	type
    //   5	32	109	java/lang/Exception
    //   5	32	149	finally
    //   38	47	169	finally
    //   49	53	169	finally
    //   55	60	169	finally
    //   62	67	169	finally
    //   69	74	169	finally
    //   76	86	169	finally
    //   115	134	169	finally
    //   38	47	173	java/lang/Exception
    //   49	53	173	java/lang/Exception
    //   55	60	173	java/lang/Exception
    //   62	67	173	java/lang/Exception
    //   69	74	173	java/lang/Exception
    //   76	86	173	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.p
 * JD-Core Version:    0.6.2
 */