package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.b.a;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.protocal.protobuf.chw;

final class f$7
  implements g.a
{
  f$7(f paramf)
  {
  }

  public final void cHb()
  {
    AppMethodBeat.i(2048);
    f.J(this.sGV).setVisibility(8);
    AppMethodBeat.o(2048);
  }

  public final void cHc()
  {
    AppMethodBeat.i(2049);
    if ((this.sGV.getListVideoUIComponent().cFV().sFw) && ((this.sGV.getListVideoUIComponent().cFV().cGZ()) || (this.sGV.getListVideoUIComponent().cFV().sFx)))
    {
      f.K(this.sGV).setVisibility(0);
      AppMethodBeat.o(2049);
    }
    while (true)
    {
      return;
      f.L(this.sGV).setVisibility(8);
      AppMethodBeat.o(2049);
    }
  }

  public final void update(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2047);
    if (paramInt2 > 0);
    for (int i = f.B(this.sGV).getWidth() * paramInt1 / paramInt2; ; i = 0)
    {
      Object localObject = this.sGV.getListVideoUIComponent().cFR().sFp;
      if ((localObject != null) && (((a)localObject).sAH < this.sGV.getListVideoUIComponent().cFV().getCurrPosMs()))
        ((a)localObject).sAH = this.sGV.getListVideoUIComponent().cFV().getCurrPosMs();
      localObject = (FrameLayout.LayoutParams)f.C(this.sGV).getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).width = i;
      f.D(this.sGV).setLayoutParams((ViewGroup.LayoutParams)localObject);
      f.E(this.sGV).requestLayout();
      if ((f.F(this.sGV).xhf <= 0) && ((f.G(this.sGV).xhd & 0x100) <= 0) && (f.H(this.sGV).fS(paramInt1, paramInt2)))
        f.I(this.sGV).xhf = 1;
      AppMethodBeat.o(2047);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.7
 * JD-Core Version:    0.6.2
 */