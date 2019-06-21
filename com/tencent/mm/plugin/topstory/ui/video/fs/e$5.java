package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.b.a;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.protocal.protobuf.chw;

final class e$5
  implements f.a
{
  e$5(e parame)
  {
  }

  public final void cHb()
  {
    AppMethodBeat.i(1888);
    e.Q(this.sFU).setVisibility(8);
    AppMethodBeat.o(1888);
  }

  public final void cHc()
  {
    AppMethodBeat.i(1889);
    if ((this.sFU.getFSVideoUIComponent().cFV().sFw) && ((this.sFU.getFSVideoUIComponent().cFV().cGZ()) || (this.sFU.getFSVideoUIComponent().cFV().sFx)))
    {
      e.R(this.sFU).setVisibility(0);
      AppMethodBeat.o(1889);
    }
    while (true)
    {
      return;
      e.S(this.sFU).setVisibility(8);
      AppMethodBeat.o(1889);
    }
  }

  public final void update(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1887);
    if (paramInt2 > 0);
    for (int i = e.I(this.sFU).getWidth() * paramInt1 / paramInt2; ; i = 0)
    {
      Object localObject = this.sFU.getFSVideoUIComponent().cFR().sFp;
      if ((localObject != null) && (((a)localObject).sAH < this.sFU.getFSVideoUIComponent().cFV().getCurrPosMs()))
        ((a)localObject).sAH = this.sFU.getFSVideoUIComponent().cFV().getCurrPosMs();
      localObject = (FrameLayout.LayoutParams)e.J(this.sFU).getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = i;
      e.K(this.sFU).setLayoutParams((ViewGroup.LayoutParams)localObject);
      e.L(this.sFU).requestLayout();
      if ((e.M(this.sFU).xhf <= 0) && ((e.N(this.sFU).xhd & 0x100) <= 0) && (e.O(this.sFU).fS(paramInt1, paramInt2)))
        e.P(this.sFU).xhf = 1;
      AppMethodBeat.o(1887);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.5
 * JD-Core Version:    0.6.2
 */