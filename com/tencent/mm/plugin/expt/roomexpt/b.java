package com.tencent.mm.plugin.expt.roomexpt;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends j<e>
{
  public static final String[] diI;
  public static final String[] fnj;
  com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(73587);
    fnj = new String[] { j.a(e.ccO, "RoomMuteExpt"), "CREATE UNIQUE INDEX IF NOT EXISTS namedayIndex ON RoomMuteExpt( chatroom,daySec )" };
    diI = new String[0];
    AppMethodBeat.o(73587);
  }

  public b(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.ccO, "RoomMuteExpt", diI);
    this.bSd = parame;
  }

  public final boolean b(e parame)
  {
    AppMethodBeat.i(73583);
    boolean bool = super.a(parame, false);
    AppMethodBeat.o(73583);
    return bool;
  }

  public final Cursor brm()
  {
    Object localObject = null;
    AppMethodBeat.i(73585);
    try
    {
      Cursor localCursor = this.bSd.rawQuery("SELECT chatroom, nickname, isMute, count(daySec), sum(score) FROM RoomMuteExpt group by chatroom", null);
      localObject = localCursor;
      AppMethodBeat.o(73585);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ChatRoomExptStorage", localException, "get calc cursor", new Object[0]);
    }
  }

  // ERROR //
  public final java.util.List<e> brn()
  {
    // Byte code:
    //   0: ldc 84
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 86	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 88	java/util/ArrayList:<init>	()V
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 50	com/tencent/mm/plugin/expt/roomexpt/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   17: ldc 29
    //   19: aconst_null
    //   20: aconst_null
    //   21: aconst_null
    //   22: aconst_null
    //   23: aconst_null
    //   24: ldc 90
    //   26: invokeinterface 94 8 0
    //   31: astore_2
    //   32: aload_2
    //   33: ifnull +84 -> 117
    //   36: aload_2
    //   37: astore_3
    //   38: aload_2
    //   39: invokeinterface 100 1 0
    //   44: ifeq +73 -> 117
    //   47: aload_2
    //   48: astore_3
    //   49: new 23	com/tencent/mm/plugin/expt/roomexpt/e
    //   52: astore 4
    //   54: aload_2
    //   55: astore_3
    //   56: aload 4
    //   58: invokespecial 101	com/tencent/mm/plugin/expt/roomexpt/e:<init>	()V
    //   61: aload_2
    //   62: astore_3
    //   63: aload 4
    //   65: aload_2
    //   66: invokevirtual 105	com/tencent/mm/plugin/expt/roomexpt/e:d	(Landroid/database/Cursor;)V
    //   69: aload_2
    //   70: astore_3
    //   71: aload_1
    //   72: aload 4
    //   74: invokeinterface 111 2 0
    //   79: pop
    //   80: goto -44 -> 36
    //   83: astore 4
    //   85: aload_2
    //   86: astore_3
    //   87: ldc 71
    //   89: aload 4
    //   91: ldc 113
    //   93: iconst_0
    //   94: anewarray 75	java/lang/Object
    //   97: invokestatic 81	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: aload_2
    //   101: ifnull +9 -> 110
    //   104: aload_2
    //   105: invokeinterface 116 1 0
    //   110: ldc 84
    //   112: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: aload_1
    //   116: areturn
    //   117: aload_2
    //   118: ifnull -8 -> 110
    //   121: aload_2
    //   122: invokeinterface 116 1 0
    //   127: goto -17 -> 110
    //   130: astore_2
    //   131: aconst_null
    //   132: astore_3
    //   133: aload_3
    //   134: ifnull +9 -> 143
    //   137: aload_3
    //   138: invokeinterface 116 1 0
    //   143: ldc 84
    //   145: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload_2
    //   149: athrow
    //   150: astore_2
    //   151: goto -18 -> 133
    //   154: astore 4
    //   156: aconst_null
    //   157: astore_2
    //   158: goto -73 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   38	47	83	java/lang/Exception
    //   49	54	83	java/lang/Exception
    //   56	61	83	java/lang/Exception
    //   63	69	83	java/lang/Exception
    //   71	80	83	java/lang/Exception
    //   13	32	130	finally
    //   38	47	150	finally
    //   49	54	150	finally
    //   56	61	150	finally
    //   63	69	150	finally
    //   71	80	150	finally
    //   87	100	150	finally
    //   13	32	154	java/lang/Exception
  }

  public final boolean c(e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(73584);
    if (parame == null)
      AppMethodBeat.o(73584);
    while (true)
    {
      return bool;
      bool = super.b(parame, false, new String[] { "chatroom", "daySec" });
      AppMethodBeat.o(73584);
    }
  }

  // ERROR //
  public final e eh(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 130
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 50	com/tencent/mm/plugin/expt/roomexpt/b:bSd	Lcom/tencent/mm/sdk/e/e;
    //   9: ldc 29
    //   11: aconst_null
    //   12: ldc 132
    //   14: iconst_2
    //   15: anewarray 21	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload_1
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: aload_2
    //   25: aastore
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: invokeinterface 94 8 0
    //   34: astore_2
    //   35: aload_2
    //   36: ifnull +134 -> 170
    //   39: aload_2
    //   40: astore_3
    //   41: aload_2
    //   42: invokeinterface 135 1 0
    //   47: ifeq +123 -> 170
    //   50: aload_2
    //   51: astore_3
    //   52: new 23	com/tencent/mm/plugin/expt/roomexpt/e
    //   55: astore_1
    //   56: aload_2
    //   57: astore_3
    //   58: aload_1
    //   59: invokespecial 101	com/tencent/mm/plugin/expt/roomexpt/e:<init>	()V
    //   62: aload_2
    //   63: astore_3
    //   64: aload_1
    //   65: aload_2
    //   66: invokevirtual 105	com/tencent/mm/plugin/expt/roomexpt/e:d	(Landroid/database/Cursor;)V
    //   69: aload_1
    //   70: astore_3
    //   71: aload_2
    //   72: ifnull +11 -> 83
    //   75: aload_2
    //   76: invokeinterface 116 1 0
    //   81: aload_1
    //   82: astore_3
    //   83: ldc 130
    //   85: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: aload_3
    //   89: areturn
    //   90: astore 4
    //   92: aconst_null
    //   93: astore_2
    //   94: aconst_null
    //   95: astore_1
    //   96: aload_2
    //   97: astore_3
    //   98: ldc 71
    //   100: ldc 137
    //   102: iconst_1
    //   103: anewarray 75	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: aload 4
    //   110: invokevirtual 141	java/lang/Exception:toString	()Ljava/lang/String;
    //   113: aastore
    //   114: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: aload_1
    //   118: astore_3
    //   119: aload_2
    //   120: ifnull -37 -> 83
    //   123: aload_2
    //   124: invokeinterface 116 1 0
    //   129: aload_1
    //   130: astore_3
    //   131: goto -48 -> 83
    //   134: astore_1
    //   135: aconst_null
    //   136: astore_3
    //   137: aload_3
    //   138: ifnull +9 -> 147
    //   141: aload_3
    //   142: invokeinterface 116 1 0
    //   147: ldc 130
    //   149: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aload_1
    //   153: athrow
    //   154: astore_1
    //   155: goto -18 -> 137
    //   158: astore 4
    //   160: aconst_null
    //   161: astore_1
    //   162: goto -66 -> 96
    //   165: astore 4
    //   167: goto -71 -> 96
    //   170: aconst_null
    //   171: astore_1
    //   172: goto -103 -> 69
    //
    // Exception table:
    //   from	to	target	type
    //   5	35	90	java/lang/Exception
    //   5	35	134	finally
    //   41	50	154	finally
    //   52	56	154	finally
    //   58	62	154	finally
    //   64	69	154	finally
    //   98	117	154	finally
    //   41	50	158	java/lang/Exception
    //   52	56	158	java/lang/Exception
    //   58	62	158	java/lang/Exception
    //   64	69	165	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.b
 * JD-Core Version:    0.6.2
 */