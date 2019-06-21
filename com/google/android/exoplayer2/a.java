package com.google.android.exoplayer2;

import com.google.android.exoplayer2.b.e;
import com.google.android.exoplayer2.i.h;
import com.google.android.exoplayer2.source.l;

public abstract class a
  implements r, s
{
  private final int aMr;
  protected t aMs;
  protected l aMt;
  protected long aMu;
  protected boolean aMv;
  protected boolean aMw;
  protected int index;
  protected int state;

  public a(int paramInt)
  {
    this.aMr = paramInt;
    this.aMv = true;
  }

  protected final int a(k paramk, e parame, boolean paramBoolean)
  {
    int i = -4;
    int j = this.aMt.b(paramk, parame, paramBoolean);
    if (j == -4)
    {
      if (parame.qG())
      {
        this.aMv = true;
        if (this.aMw);
        while (true)
        {
          return i;
          i = -3;
        }
      }
      parame.aSk += this.aMu;
    }
    while (true)
    {
      i = j;
      break;
      if (j == -5)
      {
        parame = paramk.aOv;
        if (parame.aOr != 9223372036854775807L)
          paramk.aOv = parame.E(parame.aOr + this.aMu);
      }
    }
  }

  public final void a(t paramt, Format[] paramArrayOfFormat, l paraml, long paramLong1, boolean paramBoolean, long paramLong2)
  {
    if (this.state == 0);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.aMs = paramt;
      this.state = 1;
      aD(paramBoolean);
      a(paramArrayOfFormat, paraml, paramLong2);
      b(paramLong1, paramBoolean);
      return;
    }
  }

  protected void a(Format[] paramArrayOfFormat, long paramLong)
  {
  }

  public final void a(Format[] paramArrayOfFormat, l paraml, long paramLong)
  {
    if (!this.aMw);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.aMt = paraml;
      this.aMv = false;
      this.aMu = paramLong;
      a(paramArrayOfFormat, paramLong);
      return;
    }
  }

  protected void aD(boolean paramBoolean)
  {
  }

  protected void b(long paramLong, boolean paramBoolean)
  {
  }

  public void c(int paramInt, Object paramObject)
  {
  }

  public final void disable()
  {
    boolean bool = true;
    if (this.state == 1);
    while (true)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.state = 0;
      this.aMt = null;
      this.aMw = false;
      pK();
      return;
      bool = false;
    }
  }

  public final int getState()
  {
    return this.state;
  }

  public final int getTrackType()
  {
    return this.aMr;
  }

  protected void onStarted()
  {
  }

  protected void onStopped()
  {
  }

  public final s pC()
  {
    return this;
  }

  public h pD()
  {
    return null;
  }

  public final l pE()
  {
    return this.aMt;
  }

  public final boolean pF()
  {
    return this.aMv;
  }

  public final void pG()
  {
    this.aMw = true;
  }

  public final boolean pH()
  {
    return this.aMw;
  }

  public final void pI()
  {
    this.aMt.rW();
  }

  public int pJ()
  {
    return 0;
  }

  protected void pK()
  {
  }

  public final void setIndex(int paramInt)
  {
    this.index = paramInt;
  }

  public final void start()
  {
    boolean bool = true;
    if (this.state == 1);
    while (true)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.state = 2;
      onStarted();
      return;
      bool = false;
    }
  }

  public final void stop()
  {
    if (this.state == 2);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.state = 1;
      onStopped();
      return;
    }
  }

  public final void v(long paramLong)
  {
    this.aMw = false;
    this.aMv = false;
    b(paramLong, false);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a
 * JD-Core Version:    0.6.2
 */