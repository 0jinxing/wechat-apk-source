package com.google.android.exoplayer2;

import com.google.android.exoplayer2.g.g;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.h.j;
import com.google.android.exoplayer2.i.o;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.PriorityQueue;

public final class c
  implements m
{
  private final j aMB;
  private final long aMC;
  private final long aMD;
  private final long aME;
  private final long aMF;
  private final o aMG;
  private int aMH;
  private boolean aMI;

  public c()
  {
    this(new j());
    AppMethodBeat.i(94746);
    AppMethodBeat.o(94746);
  }

  private c(j paramj)
  {
    this(paramj, (byte)0);
  }

  private c(j paramj, byte paramByte)
  {
    this(paramj, '\000');
  }

  private c(j paramj, char paramChar)
  {
    this.aMB = paramj;
    this.aMC = 15000000L;
    this.aMD = 30000000L;
    this.aME = 2500000L;
    this.aMF = 5000000L;
    this.aMG = null;
  }

  private void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(94752);
    this.aMH = 0;
    if ((this.aMG != null) && (this.aMI))
      this.aMG.tP();
    this.aMI = false;
    if (paramBoolean)
      this.aMB.reset();
    AppMethodBeat.o(94752);
  }

  public final void a(r[] paramArrayOfr, g paramg)
  {
    int i = 0;
    AppMethodBeat.i(94748);
    this.aMH = 0;
    while (i < paramArrayOfr.length)
    {
      if (paramg.bpE[i] != null)
        this.aMH += v.eT(paramArrayOfr[i].getTrackType());
      i++;
    }
    this.aMB.eJ(this.aMH);
    AppMethodBeat.o(94748);
  }

  public final boolean c(long paramLong, boolean paramBoolean)
  {
    long l;
    if (paramBoolean)
    {
      l = this.aMF;
      if ((l > 0L) && (paramLong < l))
        break label37;
    }
    label37: for (paramBoolean = true; ; paramBoolean = false)
    {
      return paramBoolean;
      l = this.aME;
      break;
    }
  }

  public final void onStopped()
  {
    AppMethodBeat.i(94749);
    reset(true);
    AppMethodBeat.o(94749);
  }

  public final void pL()
  {
    AppMethodBeat.i(94747);
    reset(false);
    AppMethodBeat.o(94747);
  }

  public final void pM()
  {
    AppMethodBeat.i(94750);
    reset(true);
    AppMethodBeat.o(94750);
  }

  public final b pN()
  {
    return this.aMB;
  }

  public final boolean y(long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(94751);
    int i;
    int j;
    boolean bool3;
    o localo;
    if (paramLong > this.aMD)
    {
      i = 0;
      if (this.aMB.tp() < this.aMH)
        break label188;
      j = 1;
      boolean bool2 = this.aMI;
      if (i != 2)
      {
        bool3 = bool1;
        if (i == 1)
        {
          bool3 = bool1;
          if (this.aMI)
          {
            bool3 = bool1;
            if (j != 0);
          }
        }
      }
      else
      {
        bool3 = true;
      }
      this.aMI = bool3;
      if ((this.aMG != null) && (this.aMI != bool2))
      {
        if (!this.aMI)
          break label207;
        localo = this.aMG;
      }
    }
    while (true)
    {
      synchronized (localo.lock)
      {
        localo.brx.add(Integer.valueOf(0));
        localo.bry = Math.max(localo.bry, 0);
        bool3 = this.aMI;
        AppMethodBeat.o(94751);
        return bool3;
        if (paramLong < this.aMC)
        {
          i = 2;
          break;
        }
        i = 1;
        break;
        label188: j = 0;
      }
      label207: this.aMG.tP();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c
 * JD-Core Version:    0.6.2
 */