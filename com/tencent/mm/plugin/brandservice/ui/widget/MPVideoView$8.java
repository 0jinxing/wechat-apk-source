package com.tencent.mm.plugin.brandservice.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MPVideoView$8
  implements View.OnClickListener
{
  MPVideoView$8(MPVideoView paramMPVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14513);
    if (!this.jZz.aFb());
    for (boolean bool = true; ; bool = false)
    {
      paramView = this.jZz;
      paramView.j(bool, MPVideoView.C(paramView));
      AppMethodBeat.o(14513);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.8
 * JD-Core Version:    0.6.2
 */