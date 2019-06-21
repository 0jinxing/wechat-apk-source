package com.google.android.exoplayer2.h;

import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class j
  implements b
{
  private int aMH;
  private final boolean bpR;
  private final int bpS;
  private final byte[] bpT;
  private final a[] bpU;
  private int bpV;
  private int bpW;
  private a[] bpX;

  public j()
  {
    this((byte)0);
  }

  private j(byte paramByte)
  {
    AppMethodBeat.i(95806);
    com.google.android.exoplayer2.i.a.checkArgument(true);
    com.google.android.exoplayer2.i.a.checkArgument(true);
    this.bpR = true;
    this.bpS = 65536;
    this.bpW = 0;
    this.bpX = new a[100];
    this.bpT = null;
    this.bpU = new a[1];
    AppMethodBeat.o(95806);
  }

  public final void a(a parama)
  {
    try
    {
      AppMethodBeat.i(95810);
      this.bpU[0] = parama;
      a(this.bpU);
      AppMethodBeat.o(95810);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final void a(a[] paramArrayOfa)
  {
    try
    {
      AppMethodBeat.i(95811);
      if (this.bpW + paramArrayOfa.length >= this.bpX.length)
        this.bpX = ((a[])Arrays.copyOf(this.bpX, Math.max(this.bpX.length * 2, this.bpW + paramArrayOfa.length)));
      int i = paramArrayOfa.length;
      int j = 0;
      if (j < i)
      {
        a locala = paramArrayOfa[j];
        if ((locala.data == this.bpT) || (locala.data.length == this.bpS));
        for (boolean bool = true; ; bool = false)
        {
          com.google.android.exoplayer2.i.a.checkArgument(bool);
          a[] arrayOfa = this.bpX;
          int k = this.bpW;
          this.bpW = (k + 1);
          arrayOfa[k] = locala;
          j++;
          break;
        }
      }
      this.bpV -= paramArrayOfa.length;
      notifyAll();
      AppMethodBeat.o(95811);
      return;
    }
    finally
    {
    }
    throw paramArrayOfa;
  }

  public final void eJ(int paramInt)
  {
    try
    {
      AppMethodBeat.i(95808);
      if (paramInt < this.aMH);
      for (int i = 1; ; i = 0)
      {
        this.aMH = paramInt;
        if (i != 0)
          trim();
        AppMethodBeat.o(95808);
        return;
      }
    }
    finally
    {
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(95807);
      if (this.bpR)
        eJ(0);
      AppMethodBeat.o(95807);
      return;
    }
    finally
    {
    }
  }

  public final a tj()
  {
    try
    {
      AppMethodBeat.i(95809);
      this.bpV += 1;
      Object localObject1;
      if (this.bpW > 0)
      {
        localObject1 = this.bpX;
        int i = this.bpW - 1;
        this.bpW = i;
        localObject1 = localObject1[i];
        this.bpX[this.bpW] = null;
      }
      while (true)
      {
        AppMethodBeat.o(95809);
        return localObject1;
        localObject1 = new a(new byte[this.bpS]);
      }
    }
    finally
    {
    }
  }

  public final int tk()
  {
    return this.bpS;
  }

  public final int tp()
  {
    try
    {
      int i = this.bpV;
      int j = this.bpS;
      return i * j;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void trim()
  {
    while (true)
    {
      int j;
      try
      {
        AppMethodBeat.i(95812);
        int i = Math.max(0, v.bi(this.aMH, this.bpS) - this.bpV);
        if (i >= this.bpW)
        {
          AppMethodBeat.o(95812);
          return;
        }
        j = i;
        if (this.bpT != null)
        {
          int k = this.bpW - 1;
          j = 0;
          if (j <= k)
          {
            a locala1 = this.bpX[j];
            if (locala1.data == this.bpT)
            {
              j++;
              continue;
            }
            a locala2 = this.bpX[k];
            if (locala2.data != this.bpT)
            {
              k--;
              continue;
            }
            this.bpX[j] = locala2;
            this.bpX[k] = locala1;
            k--;
            j++;
            continue;
          }
          k = Math.max(i, j);
          j = k;
          if (k >= this.bpW)
          {
            AppMethodBeat.o(95812);
            continue;
          }
        }
      }
      finally
      {
      }
      Arrays.fill(this.bpX, j, this.bpW, null);
      this.bpW = j;
      AppMethodBeat.o(95812);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.j
 * JD-Core Version:    0.6.2
 */