package com.tencent.mm.plugin.brandservice.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MPVideoView$10
  implements View.OnClickListener
{
  MPVideoView$10(MPVideoView paramMPVideoView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14516);
    if (MPVideoView.i(this.jZz).isPlaying())
    {
      this.jZz.pause();
      AppMethodBeat.o(14516);
    }
    while (true)
    {
      return;
      this.jZz.start();
      AppMethodBeat.o(14516);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.10
 * JD-Core Version:    0.6.2
 */