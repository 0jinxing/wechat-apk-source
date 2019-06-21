package com.tencent.mm.ui.widget.sortlist;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

class DragSortListView$m
  implements Runnable
{
  private float mAlpha;
  protected long mStartTime;
  boolean xH;
  private float zWb;
  private float zWc;
  private float zWd;
  private float zWe;
  private float zWf;

  private DragSortListView$m(DragSortListView paramDragSortListView, int paramInt)
  {
    AppMethodBeat.i(113058);
    this.mAlpha = 0.5F;
    this.zWb = paramInt;
    float f = 1.0F / (this.mAlpha * 2.0F * (1.0F - this.mAlpha));
    this.zWf = f;
    this.zWc = f;
    this.zWd = (this.mAlpha / ((this.mAlpha - 1.0F) * 2.0F));
    this.zWe = (1.0F / (1.0F - this.mAlpha));
    AppMethodBeat.o(113058);
  }

  public void bt(float paramFloat)
  {
  }

  public void onStart()
  {
  }

  public void onStop()
  {
  }

  public void run()
  {
    AppMethodBeat.i(113060);
    if (this.xH)
      AppMethodBeat.o(113060);
    float f1;
    while (true)
    {
      return;
      f1 = (float)(SystemClock.uptimeMillis() - this.mStartTime) / this.zWb;
      if (f1 < 1.0F)
        break;
      bt(1.0F);
      onStop();
      AppMethodBeat.o(113060);
    }
    if (f1 < this.mAlpha)
      f1 *= this.zWc * f1;
    while (true)
    {
      bt(f1);
      this.zVC.post(this);
      AppMethodBeat.o(113060);
      break;
      if (f1 < 1.0F - this.mAlpha)
      {
        float f2 = this.zWd;
        f1 = f1 * this.zWe + f2;
      }
      else
      {
        f1 = 1.0F - (f1 - 1.0F) * (this.zWf * (f1 - 1.0F));
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(113059);
    this.mStartTime = SystemClock.uptimeMillis();
    this.xH = false;
    onStart();
    this.zVC.post(this);
    AppMethodBeat.o(113059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView.m
 * JD-Core Version:    0.6.2
 */