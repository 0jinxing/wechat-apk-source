package com.tencent.mm.plugin.brandservice.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MPVideoView$12
  implements View.OnClickListener
{
  MPVideoView$12(MPVideoView paramMPVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14519);
    paramView = this.jZz;
    if (!MPVideoView.G(this.jZz));
    for (boolean bool = true; ; bool = false)
    {
      paramView.setMute(bool);
      AppMethodBeat.o(14519);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.12
 * JD-Core Version:    0.6.2
 */