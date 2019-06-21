package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b.e;
import com.google.android.exoplayer2.c.m.a;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j
{
  private int[] aSB;
  private long[] aSD;
  private int[] aXW;
  private long bhA;
  private boolean bhB;
  private boolean bhC;
  private Format bhD;
  public int bhE;
  public int[] bht;
  private m.a[] bhu;
  private Format[] bhv;
  private int bhw;
  private int bhx;
  public int bhy;
  private long bhz;
  private int capacity;
  private int length;
  private long[] offsets;

  public j()
  {
    AppMethodBeat.i(95515);
    this.capacity = 1000;
    this.bht = new int[this.capacity];
    this.offsets = new long[this.capacity];
    this.aSD = new long[this.capacity];
    this.aXW = new int[this.capacity];
    this.aSB = new int[this.capacity];
    this.bhu = new m.a[this.capacity];
    this.bhv = new Format[this.capacity];
    this.bhz = -9223372036854775808L;
    this.bhA = -9223372036854775808L;
    this.bhC = true;
    this.bhB = true;
    AppMethodBeat.o(95515);
  }

  private int a(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    int i = -1;
    int j = 0;
    int k = paramInt1;
    for (paramInt1 = j; (paramInt1 < paramInt2) && (this.aSD[k] <= paramLong); paramInt1++)
    {
      if ((!paramBoolean) || ((this.aXW[k] & 0x1) != 0))
        i = paramInt1;
      j = k + 1;
      k = j;
      if (j == this.capacity)
        k = 0;
    }
    return i;
  }

  private void ab(long paramLong)
  {
    try
    {
      AppMethodBeat.i(95524);
      this.bhA = Math.max(this.bhA, paramLong);
      AppMethodBeat.o(95524);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private long en(int paramInt)
  {
    AppMethodBeat.i(95526);
    this.bhz = Math.max(this.bhz, eo(paramInt));
    this.length -= paramInt;
    this.bhw += paramInt;
    this.bhx += paramInt;
    if (this.bhx >= this.capacity)
      this.bhx -= this.capacity;
    this.bhy -= paramInt;
    if (this.bhy < 0)
      this.bhy = 0;
    long l;
    if (this.length == 0)
      if (this.bhx == 0)
      {
        paramInt = this.capacity;
        paramInt--;
        l = this.offsets[paramInt];
        l = this.aSB[paramInt] + l;
        AppMethodBeat.o(95526);
      }
    while (true)
    {
      return l;
      paramInt = this.bhx;
      break;
      l = this.offsets[this.bhx];
      AppMethodBeat.o(95526);
    }
  }

  private long eo(int paramInt)
  {
    long l1 = -9223372036854775808L;
    AppMethodBeat.i(95527);
    if (paramInt == 0)
      AppMethodBeat.o(95527);
    while (true)
    {
      return l1;
      int i = ep(paramInt - 1);
      int j = 0;
      long l2 = -9223372036854775808L;
      while (true)
      {
        l1 = l2;
        if (j >= paramInt)
          break;
        l2 = Math.max(l2, this.aSD[i]);
        l1 = l2;
        if ((this.aXW[i] & 0x1) != 0)
          break;
        int k = i - 1;
        i = k;
        if (k == -1)
          i = this.capacity - 1;
        j++;
      }
      AppMethodBeat.o(95527);
    }
  }

  public final int a(k paramk, e parame, boolean paramBoolean1, boolean paramBoolean2, Format paramFormat, j.a parama)
  {
    int i = -4;
    try
    {
      AppMethodBeat.i(95516);
      int j;
      if (!sk())
        if (paramBoolean2)
        {
          parame.flags = 4;
          AppMethodBeat.o(95516);
          j = i;
        }
      while (true)
      {
        return j;
        if ((this.bhD != null) && ((paramBoolean1) || (this.bhD != paramFormat)))
        {
          paramk.aOv = this.bhD;
          AppMethodBeat.o(95516);
          j = -5;
        }
        else
        {
          AppMethodBeat.o(95516);
          j = -3;
          continue;
          int k = ep(this.bhy);
          if ((paramBoolean1) || (this.bhv[k] != paramFormat))
          {
            paramk.aOv = this.bhv[k];
            AppMethodBeat.o(95516);
            j = -5;
          }
          else
          {
            if ((parame.aEY == null) && (parame.aSl == 0));
            for (j = 1; ; j = 0)
            {
              if (j == 0)
                break label183;
              AppMethodBeat.o(95516);
              j = -3;
              break;
            }
            label183: parame.aSk = this.aSD[k];
            parame.flags = this.aXW[k];
            parama.size = this.aSB[k];
            parama.xb = this.offsets[k];
            parama.aUO = this.bhu[k];
            this.bhy += 1;
            AppMethodBeat.o(95516);
            j = i;
          }
        }
      }
    }
    finally
    {
    }
    throw paramk;
  }

  public final void a(long paramLong1, int paramInt1, long paramLong2, int paramInt2, m.a parama)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(95523);
        if (this.bhB)
        {
          if ((paramInt1 & 0x1) == 0)
          {
            AppMethodBeat.o(95523);
            return;
          }
          this.bhB = false;
        }
        if (!this.bhC)
        {
          bool = true;
          a.checkState(bool);
          ab(paramLong1);
          int i = ep(this.length);
          this.aSD[i] = paramLong1;
          this.offsets[i] = paramLong2;
          this.aSB[i] = paramInt2;
          this.aXW[i] = paramInt1;
          this.bhu[i] = parama;
          this.bhv[i] = this.bhD;
          this.bht[i] = this.bhE;
          this.length += 1;
          if (this.length == this.capacity)
          {
            i = this.capacity + 1000;
            parama = new int[i];
            long[] arrayOfLong1 = new long[i];
            long[] arrayOfLong2 = new long[i];
            int[] arrayOfInt1 = new int[i];
            int[] arrayOfInt2 = new int[i];
            m.a[] arrayOfa = new m.a[i];
            Format[] arrayOfFormat = new Format[i];
            paramInt2 = this.capacity - this.bhx;
            System.arraycopy(this.offsets, this.bhx, arrayOfLong1, 0, paramInt2);
            System.arraycopy(this.aSD, this.bhx, arrayOfLong2, 0, paramInt2);
            System.arraycopy(this.aXW, this.bhx, arrayOfInt1, 0, paramInt2);
            System.arraycopy(this.aSB, this.bhx, arrayOfInt2, 0, paramInt2);
            System.arraycopy(this.bhu, this.bhx, arrayOfa, 0, paramInt2);
            System.arraycopy(this.bhv, this.bhx, arrayOfFormat, 0, paramInt2);
            System.arraycopy(this.bht, this.bhx, parama, 0, paramInt2);
            paramInt1 = this.bhx;
            System.arraycopy(this.offsets, 0, arrayOfLong1, paramInt2, paramInt1);
            System.arraycopy(this.aSD, 0, arrayOfLong2, paramInt2, paramInt1);
            System.arraycopy(this.aXW, 0, arrayOfInt1, paramInt2, paramInt1);
            System.arraycopy(this.aSB, 0, arrayOfInt2, paramInt2, paramInt1);
            System.arraycopy(this.bhu, 0, arrayOfa, paramInt2, paramInt1);
            System.arraycopy(this.bhv, 0, arrayOfFormat, paramInt2, paramInt1);
            System.arraycopy(this.bht, 0, parama, paramInt2, paramInt1);
            this.offsets = arrayOfLong1;
            this.aSD = arrayOfLong2;
            this.aXW = arrayOfInt1;
            this.aSB = arrayOfInt2;
            this.bhu = arrayOfa;
            this.bhv = arrayOfFormat;
            this.bht = parama;
            this.bhx = 0;
            this.length = this.capacity;
            this.capacity = i;
          }
          AppMethodBeat.o(95523);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
    }
  }

  public final boolean ac(long paramLong)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    try
    {
      AppMethodBeat.i(95525);
      boolean bool3;
      if (this.length == 0)
        if (paramLong > this.bhz)
        {
          AppMethodBeat.o(95525);
          bool3 = bool1;
        }
      while (true)
      {
        return bool3;
        AppMethodBeat.o(95525);
        bool3 = false;
        continue;
        if (Math.max(this.bhz, eo(this.bhy)) >= paramLong)
        {
          AppMethodBeat.o(95525);
          bool3 = false;
        }
        else
        {
          int i = this.length;
          int j = ep(this.length - 1);
          while ((i > this.bhy) && (this.aSD[j] >= paramLong))
          {
            int k = i - 1;
            int m = j - 1;
            j = m;
            i = k;
            if (m == -1)
            {
              j = this.capacity - 1;
              i = k;
            }
          }
          j = this.bhw;
          j = si() - (j + i);
          bool3 = bool2;
          if (j >= 0)
          {
            bool3 = bool2;
            if (j <= this.length - this.bhy)
              bool3 = true;
          }
          a.checkArgument(bool3);
          this.length -= j;
          this.bhA = Math.max(this.bhz, eo(this.length));
          AppMethodBeat.o(95525);
          bool3 = bool1;
        }
      }
    }
    finally
    {
    }
  }

  public final int ep(int paramInt)
  {
    paramInt = this.bhx + paramInt;
    if (paramInt < this.capacity);
    while (true)
    {
      return paramInt;
      paramInt -= this.capacity;
    }
  }

  public final boolean g(long paramLong, boolean paramBoolean)
  {
    boolean bool = false;
    while (true)
    {
      int i;
      try
      {
        AppMethodBeat.i(95517);
        i = ep(this.bhy);
        if ((!sk()) || (paramLong < this.aSD[i]) || ((paramLong > this.bhA) && (!paramBoolean)))
        {
          AppMethodBeat.o(95517);
          paramBoolean = bool;
          return paramBoolean;
        }
        i = a(i, this.length - this.bhy, paramLong, true);
        if (i == -1)
        {
          AppMethodBeat.o(95517);
          paramBoolean = bool;
          continue;
        }
      }
      finally
      {
      }
      this.bhy += i;
      AppMethodBeat.o(95517);
      paramBoolean = true;
    }
  }

  public final long h(long paramLong, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(95519);
      if ((this.length == 0) || (paramLong < this.aSD[this.bhx]))
      {
        AppMethodBeat.o(95519);
        paramLong = -1L;
      }
      while (true)
      {
        return paramLong;
        if ((paramBoolean) && (this.bhy != this.length));
        for (int i = this.bhy + 1; ; i = this.length)
        {
          i = a(this.bhx, i, paramLong, false);
          if (i != -1)
            break label105;
          AppMethodBeat.o(95519);
          paramLong = -1L;
          break;
        }
        label105: paramLong = en(i);
        AppMethodBeat.o(95519);
      }
    }
    finally
    {
    }
  }

  public final boolean i(Format paramFormat)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(95522);
        if (paramFormat == null)
        {
          this.bhC = true;
          AppMethodBeat.o(95522);
          return bool;
        }
        this.bhC = false;
        if (v.j(paramFormat, this.bhD))
        {
          AppMethodBeat.o(95522);
          continue;
        }
      }
      finally
      {
      }
      this.bhD = paramFormat;
      AppMethodBeat.o(95522);
      bool = true;
    }
  }

  public final void reset(boolean paramBoolean)
  {
    this.length = 0;
    this.bhw = 0;
    this.bhx = 0;
    this.bhy = 0;
    this.bhB = true;
    this.bhz = -9223372036854775808L;
    this.bhA = -9223372036854775808L;
    if (paramBoolean)
    {
      this.bhD = null;
      this.bhC = true;
    }
  }

  public final void rewind()
  {
    try
    {
      this.bhy = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long sc()
  {
    try
    {
      long l = this.bhA;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int si()
  {
    return this.bhw + this.length;
  }

  public final int sj()
  {
    return this.bhw + this.bhy;
  }

  public final boolean sk()
  {
    try
    {
      int i = this.bhy;
      int j = this.length;
      if (i != j)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final Format sl()
  {
    try
    {
      boolean bool = this.bhC;
      if (bool);
      for (Format localFormat = null; ; localFormat = this.bhD)
        return localFormat;
    }
    finally
    {
    }
  }

  public final void sm()
  {
    try
    {
      AppMethodBeat.i(95518);
      if (!sk())
        AppMethodBeat.o(95518);
      while (true)
      {
        return;
        this.bhy = this.length;
        AppMethodBeat.o(95518);
      }
    }
    finally
    {
    }
  }

  public final long sn()
  {
    try
    {
      AppMethodBeat.i(95520);
      long l;
      if (this.bhy == 0)
      {
        l = -1L;
        AppMethodBeat.o(95520);
      }
      while (true)
      {
        return l;
        l = en(this.bhy);
        AppMethodBeat.o(95520);
      }
    }
    finally
    {
    }
  }

  public final long so()
  {
    try
    {
      AppMethodBeat.i(95521);
      long l;
      if (this.length == 0)
      {
        l = -1L;
        AppMethodBeat.o(95521);
      }
      while (true)
      {
        return l;
        l = en(this.length);
        AppMethodBeat.o(95521);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.j
 * JD-Core Version:    0.6.2
 */