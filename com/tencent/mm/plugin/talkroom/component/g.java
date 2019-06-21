package com.tencent.mm.plugin.talkroom.component;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bj;

class g extends a.a
{
  private final ak handler;
  private final v2engine sxg;

  static
  {
    AppMethodBeat.i(25735);
    k.a("voipMain", g.class.getClassLoader());
    AppMethodBeat.o(25735);
  }

  public g()
  {
    AppMethodBeat.i(25726);
    this.handler = new ak(Looper.getMainLooper());
    this.sxg = new v2engine();
    AppMethodBeat.o(25726);
  }

  public final int Close()
  {
    // Byte code:
    //   0: sipush 25729
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 10	com/tencent/mm/plugin/talkroom/component/g$3
    //   9: dup
    //   10: aload_0
    //   11: ldc 67
    //   13: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   16: invokespecial 76	com/tencent/mm/plugin/talkroom/component/g$3:<init>	(Lcom/tencent/mm/plugin/talkroom/component/g;Ljava/lang/Integer;)V
    //   19: aload_0
    //   20: getfield 58	com/tencent/mm/plugin/talkroom/component/g:handler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   23: invokevirtual 82	com/tencent/mm/sdk/platformtools/bj:b	(Lcom/tencent/mm/sdk/platformtools/ak;)Ljava/lang/Object;
    //   26: checkcast 69	java/lang/Integer
    //   29: invokevirtual 85	java/lang/Integer:intValue	()I
    //   32: istore_1
    //   33: sipush 25729
    //   36: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: iload_1
    //   40: ireturn
  }

  public final int SetCurrentMicId(final int paramInt)
  {
    // Byte code:
    //   0: sipush 25728
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 8	com/tencent/mm/plugin/talkroom/component/g$2
    //   9: dup
    //   10: aload_0
    //   11: ldc 67
    //   13: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   16: iload_1
    //   17: invokespecial 90	com/tencent/mm/plugin/talkroom/component/g$2:<init>	(Lcom/tencent/mm/plugin/talkroom/component/g;Ljava/lang/Integer;I)V
    //   20: aload_0
    //   21: getfield 58	com/tencent/mm/plugin/talkroom/component/g:handler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   24: invokevirtual 82	com/tencent/mm/sdk/platformtools/bj:b	(Lcom/tencent/mm/sdk/platformtools/ak;)Ljava/lang/Object;
    //   27: checkcast 69	java/lang/Integer
    //   30: invokevirtual 85	java/lang/Integer:intValue	()I
    //   33: istore_1
    //   34: sipush 25728
    //   37: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload_1
    //   41: ireturn
  }

  public final int a(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt4)
  {
    AppMethodBeat.i(25731);
    short[] arrayOfShort = new short[paramArrayOfInt2.length];
    for (int i = 0; i < paramArrayOfInt2.length; i++)
      arrayOfShort[i] = ((short)(short)paramArrayOfInt2[i]);
    paramInt1 = ((Integer)new g.5(this, Integer.valueOf(-99999), paramb, paramInt1, paramInt2, paramInt3, paramLong, paramArrayOfInt1, arrayOfShort, paramInt4).b(this.handler)).intValue();
    AppMethodBeat.o(25731);
    return paramInt1;
  }

  public final e a(c paramc)
  {
    AppMethodBeat.i(25733);
    paramc = (e)new g.7(this, paramc).b(this.handler);
    AppMethodBeat.o(25733);
    return paramc;
  }

  public final int cEb()
  {
    AppMethodBeat.i(25730);
    int i = ((Integer)new g.4(this, Integer.valueOf(-99999)).b(this.handler)).intValue();
    AppMethodBeat.o(25730);
    return i;
  }

  public final d cEc()
  {
    // Byte code:
    //   0: sipush 25734
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 12	com/tencent/mm/plugin/talkroom/component/g$8
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 113	com/tencent/mm/plugin/talkroom/component/g$8:<init>	(Lcom/tencent/mm/plugin/talkroom/component/g;)V
    //   14: aload_0
    //   15: getfield 58	com/tencent/mm/plugin/talkroom/component/g:handler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   18: invokevirtual 82	com/tencent/mm/sdk/platformtools/bj:b	(Lcom/tencent/mm/sdk/platformtools/ak;)Ljava/lang/Object;
    //   21: checkcast 115	com/tencent/mm/plugin/talkroom/component/d
    //   24: astore_1
    //   25: sipush 25734
    //   28: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: aload_1
    //   32: areturn
  }

  public final byte[] e(int[] paramArrayOfInt, String paramString)
  {
    AppMethodBeat.i(25732);
    paramArrayOfInt = (byte[])new g.6(this, paramArrayOfInt, paramString).b(this.handler);
    AppMethodBeat.o(25732);
    return paramArrayOfInt;
  }

  public final int uninitLive()
  {
    // Byte code:
    //   0: sipush 25727
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 6	com/tencent/mm/plugin/talkroom/component/g$1
    //   9: dup
    //   10: aload_0
    //   11: ldc 67
    //   13: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   16: invokespecial 126	com/tencent/mm/plugin/talkroom/component/g$1:<init>	(Lcom/tencent/mm/plugin/talkroom/component/g;Ljava/lang/Integer;)V
    //   19: aload_0
    //   20: getfield 58	com/tencent/mm/plugin/talkroom/component/g:handler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   23: invokevirtual 82	com/tencent/mm/sdk/platformtools/bj:b	(Lcom/tencent/mm/sdk/platformtools/ak;)Ljava/lang/Object;
    //   26: checkcast 69	java/lang/Integer
    //   29: invokevirtual 85	java/lang/Integer:intValue	()I
    //   32: istore_1
    //   33: sipush 25727
    //   36: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: iload_1
    //   40: ireturn
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.g
 * JD-Core Version:    0.6.2
 */