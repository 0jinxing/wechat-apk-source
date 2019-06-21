package com.tencent.mm.plugin.freewifi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g.b;
import com.tencent.mm.plugin.freewifi.model.j;

public final class i
{
  private b mtP;

  private i()
  {
    AppMethodBeat.i(20600);
    this.mtP = j.byX();
    AppMethodBeat.o(20600);
  }

  public final void F(String paramString, long paramLong)
  {
    try
    {
      AppMethodBeat.i(20603);
      this.mtP.et(paramString, String.valueOf(paramLong));
      AppMethodBeat.o(20603);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final void ch(String paramString, int paramInt)
  {
    try
    {
      AppMethodBeat.i(20604);
      this.mtP.et(paramString, String.valueOf(paramInt));
      AppMethodBeat.o(20604);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  // ERROR //
  public final int getInt(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 20602
    //   5: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: invokestatic 61	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   12: ifeq +13 -> 25
    //   15: sipush 20602
    //   18: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_0
    //   22: monitorexit
    //   23: iload_2
    //   24: ireturn
    //   25: aload_0
    //   26: getfield 26	com/tencent/mm/plugin/freewifi/i:mtP	Lcom/tencent/mm/plugin/freewifi/g/b;
    //   29: aload_1
    //   30: invokevirtual 65	com/tencent/mm/plugin/freewifi/g/b:MJ	(Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_1
    //   34: aload_1
    //   35: invokestatic 61	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   38: istore_3
    //   39: iload_3
    //   40: ifeq +17 -> 57
    //   43: sipush 20602
    //   46: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: goto -28 -> 21
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    //   57: aload_1
    //   58: invokestatic 70	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   61: invokevirtual 74	java/lang/Integer:intValue	()I
    //   64: istore 4
    //   66: iload 4
    //   68: istore_2
    //   69: sipush 20602
    //   72: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: goto -54 -> 21
    //   78: astore_1
    //   79: sipush 20602
    //   82: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: goto -64 -> 21
    //
    // Exception table:
    //   from	to	target	type
    //   2	21	52	finally
    //   25	39	52	finally
    //   43	49	52	finally
    //   57	66	52	finally
    //   69	75	52	finally
    //   79	85	52	finally
    //   25	39	78	java/lang/Exception
    //   57	66	78	java/lang/Exception
  }

  // ERROR //
  public final long lb(String paramString)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: sipush 20601
    //   7: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_1
    //   11: invokestatic 61	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   14: ifeq +17 -> 31
    //   17: sipush 20601
    //   20: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: lload_2
    //   24: lstore 4
    //   26: aload_0
    //   27: monitorexit
    //   28: lload 4
    //   30: lreturn
    //   31: aload_0
    //   32: getfield 26	com/tencent/mm/plugin/freewifi/i:mtP	Lcom/tencent/mm/plugin/freewifi/g/b;
    //   35: aload_1
    //   36: invokevirtual 65	com/tencent/mm/plugin/freewifi/g/b:MJ	(Ljava/lang/String;)Ljava/lang/String;
    //   39: astore_1
    //   40: aload_1
    //   41: invokestatic 61	com/tencent/mm/plugin/freewifi/m:isEmpty	(Ljava/lang/String;)Z
    //   44: istore 6
    //   46: iload 6
    //   48: ifeq +20 -> 68
    //   51: sipush 20601
    //   54: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: lload_2
    //   58: lstore 4
    //   60: goto -34 -> 26
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: aload_1
    //   69: invokestatic 81	java/lang/Long:valueOf	(Ljava/lang/String;)Ljava/lang/Long;
    //   72: invokevirtual 85	java/lang/Long:longValue	()J
    //   75: lstore 4
    //   77: sipush 20601
    //   80: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: goto -57 -> 26
    //   86: astore_1
    //   87: sipush 20601
    //   90: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: lload_2
    //   94: lstore 4
    //   96: goto -70 -> 26
    //
    // Exception table:
    //   from	to	target	type
    //   4	23	63	finally
    //   31	46	63	finally
    //   51	57	63	finally
    //   68	77	63	finally
    //   77	83	63	finally
    //   87	93	63	finally
    //   31	46	86	java/lang/Exception
    //   68	77	86	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.i
 * JD-Core Version:    0.6.2
 */