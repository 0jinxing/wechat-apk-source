package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.h;

public class g extends h
  implements a
{
  public e sGq;
  public FrameLayout sGr;

  public g(View paramView, b paramb)
  {
    super(paramView, paramb);
  }

  public final void FN(int paramInt)
  {
    AppMethodBeat.i(1950);
    a(this.sDN, this.sDN.bKU(), this.sGq, paramInt);
    AppMethodBeat.o(1950);
  }

  public final int cFP()
  {
    AppMethodBeat.i(138400);
    int i = kj();
    AppMethodBeat.o(138400);
    return i;
  }

  public final com.tencent.mm.plugin.topstory.ui.video.f cGA()
  {
    return this.sGq;
  }

  public void cGz()
  {
    AppMethodBeat.i(1947);
    if (this.sGq == null)
    {
      this.sGq = new e(this.sDN.bKU(), this.sDN, this);
      this.sGr.removeAllViews();
      if (!this.sDN.cGb())
        break label123;
    }
    label123: for (FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.sDN.cFW().x, this.sDN.cFW().y); ; localLayoutParams = new FrameLayout.LayoutParams(this.sDN.cFW().y, this.sDN.cFW().x))
    {
      this.sGr.addView(this.sGq, localLayoutParams);
      this.sGq.a(this.sAX, cFP());
      AppMethodBeat.o(1947);
      return;
    }
  }

  public final void ej(View paramView)
  {
    AppMethodBeat.i(1945);
    this.sGr = ((FrameLayout)paramView.findViewById(2131828298));
    AppMethodBeat.o(1945);
  }

  public final View getWowView()
  {
    AppMethodBeat.i(1949);
    View localView = this.sGq.getControlBar().getWowView();
    AppMethodBeat.o(1949);
    return localView;
  }

  public final void mc(boolean paramBoolean)
  {
    AppMethodBeat.i(1946);
    super.mc(paramBoolean);
    this.sDN.FD(kj());
    if (this.sGq.O(paramBoolean, false))
    {
      cFO();
      cFN();
    }
    AppMethodBeat.o(1946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.g
 * JD-Core Version:    0.6.2
 */