package com.google.android.exoplayer2.g;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.source.o;
import java.util.Arrays;

public abstract class b
  implements f
{
  private int aBR;
  final Format[] bhv;
  protected final o bpd;
  protected final int[] bpe;
  private final long[] bpf;
  protected final int length;

  public b(o paramo, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length > 0);
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      this.bpd = ((o)a.checkNotNull(paramo));
      this.length = paramArrayOfInt.length;
      this.bhv = new Format[this.length];
      for (j = 0; j < paramArrayOfInt.length; j++)
      {
        Format[] arrayOfFormat = this.bhv;
        int k = paramArrayOfInt[j];
        arrayOfFormat[j] = paramo.bhv[k];
      }
    }
    Arrays.sort(this.bhv, new b.a((byte)0));
    this.bpe = new int[this.length];
    for (int j = i; j < this.length; j++)
      this.bpe[j] = paramo.j(this.bhv[j]);
    this.bpf = new long[this.length];
  }

  public final Format eG(int paramInt)
  {
    return this.bhv[paramInt];
  }

  public final int eH(int paramInt)
  {
    return this.bpe[paramInt];
  }

  public final boolean eI(int paramInt)
  {
    boolean bool1 = false;
    long l = SystemClock.elapsedRealtime();
    boolean bool2 = j(paramInt, l);
    int i = 0;
    if ((i < this.length) && (!bool2))
    {
      if ((i != paramInt) && (!j(i, l)));
      for (bool2 = true; ; bool2 = false)
      {
        i++;
        break;
      }
    }
    if (!bool2);
    for (bool2 = bool1; ; bool2 = true)
    {
      return bool2;
      long[] arrayOfLong = this.bpf;
      arrayOfLong[paramInt] = Math.max(arrayOfLong[paramInt], l + 60000L);
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
      }
      else
      {
        paramObject = (b)paramObject;
        if ((this.bpd != paramObject.bpd) || (!Arrays.equals(this.bpe, paramObject.bpe)))
          bool = false;
      }
    }
  }

  public int hashCode()
  {
    if (this.aBR == 0)
      this.aBR = (System.identityHashCode(this.bpd) * 31 + Arrays.hashCode(this.bpe));
    return this.aBR;
  }

  public final int indexOf(int paramInt)
  {
    int i = 0;
    if (i < this.length)
      if (this.bpe[i] != paramInt);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  public final int j(Format paramFormat)
  {
    int i = 0;
    if (i < this.length)
      if (this.bhv[i] != paramFormat);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  protected final boolean j(int paramInt, long paramLong)
  {
    if (this.bpf[paramInt] > paramLong);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int length()
  {
    return this.bpe.length;
  }

  public final o tf()
  {
    return this.bpd;
  }

  public final Format tg()
  {
    return this.bhv[su()];
  }

  public final int th()
  {
    return this.bpe[su()];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.b
 * JD-Core Version:    0.6.2
 */