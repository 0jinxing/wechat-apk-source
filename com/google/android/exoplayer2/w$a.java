package com.google.android.exoplayer2;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w$a
{
  public Object aNH;
  public int aNV;
  public long aOz;
  public Object aPc;
  public long aPd;
  public long[] aPe;
  public int[] aPf;
  public int[] aPg;
  public int[] aPh;
  public long[][] aPi;
  public long aPj;

  public final int F(long paramLong)
  {
    int i = -1;
    AppMethodBeat.i(95755);
    int j;
    if (this.aPe == null)
    {
      AppMethodBeat.o(95755);
      j = i;
    }
    while (true)
    {
      return j;
      for (j = this.aPe.length - 1; (j >= 0) && ((this.aPe[j] == -9223372036854775808L) || (this.aPe[j] > paramLong)); j--);
      if ((j >= 0) && (!dy(j)))
      {
        AppMethodBeat.o(95755);
      }
      else
      {
        AppMethodBeat.o(95755);
        j = i;
      }
    }
  }

  public final int G(long paramLong)
  {
    AppMethodBeat.i(95756);
    int i;
    if (this.aPe == null)
    {
      AppMethodBeat.o(95756);
      i = -1;
    }
    while (true)
    {
      return i;
      for (i = 0; (i < this.aPe.length) && (this.aPe[i] != -9223372036854775808L) && ((paramLong >= this.aPe[i]) || (dy(i))); i++);
      if (i < this.aPe.length)
      {
        AppMethodBeat.o(95756);
      }
      else
      {
        AppMethodBeat.o(95756);
        i = -1;
      }
    }
  }

  public final boolean ba(int paramInt1, int paramInt2)
  {
    if (paramInt2 < this.aPg[paramInt1]);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final long bb(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= this.aPi[paramInt1].length);
    for (long l = -9223372036854775807L; ; l = this.aPi[paramInt1][paramInt2])
      return l;
  }

  public final boolean dy(int paramInt)
  {
    if ((this.aPf[paramInt] != -1) && (this.aPh[paramInt] == this.aPf[paramInt]));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int qi()
  {
    if (this.aPe == null);
    for (int i = 0; ; i = this.aPe.length)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.w.a
 * JD-Core Version:    0.6.2
 */