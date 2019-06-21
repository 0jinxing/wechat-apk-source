package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.i.a;

public abstract class w
{
  public static final w aPb = new w.1();

  public final int a(int paramInt1, w.a parama, w.b paramb, int paramInt2)
  {
    int i = -1;
    int j = a(paramInt1, parama, false).aNV;
    if (a(j, paramb).aPp == paramInt1)
    {
      paramInt1 = aZ(j, paramInt2);
      if (paramInt1 == -1)
        paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = a(paramInt1, paramb).aPo;
      continue;
      paramInt1++;
    }
  }

  public final Pair<Integer, Long> a(w.b paramb, w.a parama, int paramInt, long paramLong)
  {
    return a(paramb, parama, paramInt, paramLong, 0L);
  }

  public final Pair<Integer, Long> a(w.b paramb, w.a parama, int paramInt, long paramLong1, long paramLong2)
  {
    a.bh(paramInt, qg());
    a(paramInt, paramb, false, paramLong2);
    paramLong2 = paramLong1;
    if (paramLong1 == -9223372036854775807L)
    {
      paramLong1 = paramb.aPq;
      paramLong2 = paramLong1;
      if (paramLong1 != -9223372036854775807L);
    }
    for (paramb = null; ; paramb = Pair.create(Integer.valueOf(paramInt), Long.valueOf(paramLong2)))
    {
      return paramb;
      paramInt = paramb.aPo;
      paramLong2 = paramb.aPr + paramLong2;
      for (paramLong1 = a(paramInt, parama, false).aOz; (paramLong1 != -9223372036854775807L) && (paramLong2 >= paramLong1) && (paramInt < paramb.aPp); paramLong1 = a(paramInt, parama, false).aOz)
      {
        paramLong2 -= paramLong1;
        paramInt++;
      }
    }
  }

  public abstract w.a a(int paramInt, w.a parama, boolean paramBoolean);

  public final w.b a(int paramInt, w.b paramb)
  {
    return a(paramInt, paramb, false, 0L);
  }

  public abstract w.b a(int paramInt, w.b paramb, boolean paramBoolean, long paramLong);

  public int aZ(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    switch (paramInt2)
    {
    default:
      throw new IllegalStateException();
    case 0:
      if (paramInt1 == qg() - 1)
        i = -1;
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      return i;
      i = paramInt1 + 1;
      continue;
      if (paramInt1 == qg() - 1)
        i = 0;
      else
        i = paramInt1 + 1;
    }
  }

  public abstract int ac(Object paramObject);

  public final boolean b(int paramInt1, w.a parama, w.b paramb, int paramInt2)
  {
    if (a(paramInt1, parama, paramb, paramInt2) == -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isEmpty()
  {
    if (qg() == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract int qg();

  public abstract int qh();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.w
 * JD-Core Version:    0.6.2
 */