package com.google.android.exoplayer2.g;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.d;
import com.google.android.exoplayer2.source.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends b
{
  private int biG;
  private final d boT;
  private final int boU;
  private final long boV;
  private final long boW;
  private final long boX;
  private final float boY;
  private int boZ;

  public a(o paramo, int[] paramArrayOfInt, d paramd, int paramInt, long paramLong1, long paramLong2, long paramLong3, float paramFloat)
  {
    super(paramo, paramArrayOfInt);
    AppMethodBeat.i(95758);
    this.boT = paramd;
    this.boU = paramInt;
    this.boV = (1000L * paramLong1);
    this.boW = (1000L * paramLong2);
    this.boX = (1000L * paramLong3);
    this.boY = paramFloat;
    this.biG = al(-9223372036854775808L);
    this.boZ = 1;
    AppMethodBeat.o(95758);
  }

  private int al(long paramLong)
  {
    AppMethodBeat.i(95760);
    long l = this.boT.tl();
    if (l == -1L);
    int i;
    for (l = this.boU; ; l = ()((float)l * this.boY))
    {
      i = 0;
      j = 0;
      if (i >= this.length)
        break label108;
      if ((paramLong != -9223372036854775808L) && (j(i, paramLong)))
        break label120;
      if (this.bhv[i].bitrate > l)
        break;
      AppMethodBeat.o(95760);
      label83: return i;
    }
    int j = i;
    label108: label120: 
    while (true)
    {
      i++;
      break;
      AppMethodBeat.o(95760);
      i = j;
      break label83;
    }
  }

  public final void ag(long paramLong)
  {
    AppMethodBeat.i(95759);
    long l = SystemClock.elapsedRealtime();
    int i = this.biG;
    this.biG = al(l);
    if (this.biG == i)
    {
      AppMethodBeat.o(95759);
      return;
    }
    Format localFormat1;
    Format localFormat2;
    if (!j(i, l))
    {
      localFormat1 = this.bhv[i];
      int j = this.biG;
      localFormat2 = this.bhv[j];
      if ((localFormat2.bitrate <= localFormat1.bitrate) || (paramLong >= this.boV))
        break label123;
    }
    for (this.biG = i; ; this.biG = i)
      label123: 
      do
      {
        if (this.biG != i)
          this.boZ = 3;
        AppMethodBeat.o(95759);
        break;
      }
      while ((localFormat2.bitrate >= localFormat1.bitrate) || (paramLong < this.boW));
  }

  public final int su()
  {
    return this.biG;
  }

  public final int sv()
  {
    return this.boZ;
  }

  public final Object sw()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.a
 * JD-Core Version:    0.6.2
 */