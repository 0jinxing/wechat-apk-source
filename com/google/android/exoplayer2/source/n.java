package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.w.a;
import com.google.android.exoplayer2.w.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends w
{
  private static final Object bhU;
  private final long aPk;
  private final long aPl;
  private final boolean aPm;
  private final boolean aPn;
  private final long bhV;
  private final long bhW;
  private final long bhX;
  private final long bhY;

  static
  {
    AppMethodBeat.i(95551);
    bhU = new Object();
    AppMethodBeat.o(95551);
  }

  public n(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.aPk = paramLong1;
    this.aPl = paramLong2;
    this.bhV = paramLong3;
    this.bhW = paramLong4;
    this.bhX = paramLong5;
    this.bhY = paramLong6;
    this.aPm = paramBoolean1;
    this.aPn = paramBoolean2;
  }

  private n(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    this(-9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, 0L, 0L, paramBoolean, false);
  }

  public n(long paramLong, boolean paramBoolean)
  {
    this(paramLong, paramLong, paramBoolean);
    AppMethodBeat.i(95547);
    AppMethodBeat.o(95547);
  }

  public final w.a a(int paramInt, w.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(95549);
    a.bh(paramInt, 1);
    if (paramBoolean);
    for (Object localObject = bhU; ; localObject = null)
    {
      long l1 = this.bhV;
      long l2 = -this.bhX;
      parama.aPc = localObject;
      parama.aNH = localObject;
      parama.aNV = 0;
      parama.aOz = l1;
      parama.aPd = l2;
      parama.aPe = null;
      parama.aPf = null;
      parama.aPg = null;
      parama.aPh = null;
      parama.aPi = null;
      parama.aPj = -9223372036854775807L;
      AppMethodBeat.o(95549);
      return parama;
    }
  }

  public final w.b a(int paramInt, w.b paramb, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(95548);
    a.bh(paramInt, 1);
    if (paramBoolean);
    for (Object localObject = bhU; ; localObject = null)
    {
      long l1 = this.bhY;
      long l2 = l1;
      if (this.aPn)
      {
        paramLong = l1 + paramLong;
        l2 = paramLong;
        if (paramLong > this.bhW)
          l2 = -9223372036854775807L;
      }
      l1 = this.aPk;
      long l3 = this.aPl;
      paramBoolean = this.aPm;
      boolean bool = this.aPn;
      paramLong = this.bhW;
      long l4 = this.bhX;
      paramb.aPc = localObject;
      paramb.aPk = l1;
      paramb.aPl = l3;
      paramb.aPm = paramBoolean;
      paramb.aPn = bool;
      paramb.aPq = l2;
      paramb.aOz = paramLong;
      paramb.aPo = 0;
      paramb.aPp = 0;
      paramb.aPr = l4;
      AppMethodBeat.o(95548);
      return paramb;
    }
  }

  public final int ac(Object paramObject)
  {
    AppMethodBeat.i(95550);
    int i;
    if (bhU.equals(paramObject))
    {
      i = 0;
      AppMethodBeat.o(95550);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(95550);
    }
  }

  public final int qg()
  {
    return 1;
  }

  public final int qh()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.n
 * JD-Core Version:    0.6.2
 */