package com.tencent.mm.plugin.sight.decode.ui;

import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AdVideoPlayerLoadingBar$2
  implements Runnable
{
  AdVideoPlayerLoadingBar$2(AdVideoPlayerLoadingBar paramAdVideoPlayerLoadingBar)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117916);
    int i = (this.qyz.getBarPointWidth() - this.qyz.qyn.getPaddingLeft() - this.qyz.qyn.getPaddingRight()) / 2;
    int j = ((FrameLayout.LayoutParams)this.qyz.qym.getLayoutParams()).leftMargin;
    int k = this.qyz.qyn.getPaddingLeft();
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyz.qyn.getLayoutParams();
    localLayoutParams.leftMargin = (j - k - i);
    this.qyz.qyn.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(117916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar.2
 * JD-Core Version:    0.6.2
 */