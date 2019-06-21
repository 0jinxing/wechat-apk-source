package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class r
{
  int ieu;
  int iev;
  int iew;
  int iex;
  h.d rce = h.d.vhD;
  int videoHeight;
  int videoWidth;
  boolean vvq;

  private void ag(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(118047);
    if (!this.vvq)
      if (this.ieu < this.iev)
      {
        this.iex = ((int)(this.ieu / paramFloat1));
        this.iew = this.ieu;
        AppMethodBeat.o(118047);
      }
    while (true)
    {
      return;
      this.iew = ((int)(this.iev * paramFloat1));
      this.iex = this.iev;
      AppMethodBeat.o(118047);
      continue;
      if (Math.abs(paramFloat1 - paramFloat2) > 0.05D)
      {
        if (this.ieu < this.iev)
        {
          this.iex = ((int)(this.ieu / paramFloat1));
          this.iew = this.ieu;
          AppMethodBeat.o(118047);
        }
        else
        {
          this.iew = ((int)(this.iev * paramFloat1));
          this.iex = this.iev;
          AppMethodBeat.o(118047);
        }
      }
      else if (this.ieu > this.iev)
      {
        this.iex = ((int)(this.ieu / paramFloat1));
        this.iew = this.ieu;
        AppMethodBeat.o(118047);
      }
      else
      {
        this.iew = ((int)(this.iev * paramFloat1));
        this.iex = this.iev;
        AppMethodBeat.o(118047);
      }
    }
  }

  private void bk(float paramFloat)
  {
    if (this.ieu < this.iev)
    {
      this.iex = ((int)(this.ieu / paramFloat));
      this.iew = this.ieu;
      if (this.iex > this.iev)
      {
        this.iew = ((int)(this.iev * paramFloat));
        this.iex = this.iev;
      }
    }
    while (true)
    {
      return;
      this.iew = ((int)(this.iev * paramFloat));
      this.iex = this.iev;
      if (this.iew > this.ieu)
      {
        this.iex = ((int)(this.ieu / paramFloat));
        this.iew = this.ieu;
      }
    }
  }

  private void bl(float paramFloat)
  {
    if (this.ieu > this.iev)
    {
      this.iex = ((int)(this.ieu / paramFloat));
      this.iew = this.ieu;
      if (this.iex < this.iev)
      {
        this.iew = ((int)(this.iev * paramFloat));
        this.iex = this.iev;
      }
    }
    while (true)
    {
      return;
      this.iew = ((int)(this.iev * paramFloat));
      this.iex = this.iev;
      if (this.iew < this.ieu)
      {
        this.iex = ((int)(this.ieu / paramFloat));
        this.iew = this.ieu;
      }
    }
  }

  private void dlD()
  {
    this.iex = this.iev;
    this.iew = this.ieu;
  }

  final boolean I(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = true;
    AppMethodBeat.i(118046);
    if ((this.ieu == paramInt1) && (this.iev == paramInt2) && (this.videoWidth == paramInt3) && (this.videoHeight == paramInt4))
    {
      AppMethodBeat.o(118046);
      return bool;
    }
    this.ieu = paramInt1;
    this.iev = paramInt2;
    this.videoWidth = paramInt3;
    this.videoHeight = paramInt4;
    float f1 = this.videoWidth * 1.0F / this.videoHeight;
    float f2 = this.ieu * 1.0F / this.iev;
    if (this.rce != h.d.vhD)
      if (this.rce == h.d.vhF)
        bk(f1);
    while (true)
    {
      ab.d("MicroMsg.ViewSizeCache", "screen[%d, %d], video[%d, %d], measure[%d, %d] scale[%f, %f]", new Object[] { Integer.valueOf(this.ieu), Integer.valueOf(this.iev), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(this.iew), Integer.valueOf(this.iex), Float.valueOf(f2), Float.valueOf(f1) });
      AppMethodBeat.o(118046);
      bool = false;
      break;
      if (this.rce == h.d.vhE)
        dlD();
      else if (this.rce == h.d.vhG)
        bl(f1);
      else
        ag(f1, f2);
    }
  }

  final void reset()
  {
    this.iev = 0;
    this.ieu = 0;
    this.videoHeight = 0;
    this.videoWidth = 0;
    this.iex = 0;
    this.iew = 0;
  }

  public final void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(118045);
    ab.i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", new Object[] { this.rce, paramd });
    this.rce = paramd;
    reset();
    AppMethodBeat.o(118045);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.r
 * JD-Core Version:    0.6.2
 */