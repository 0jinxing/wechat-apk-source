package com.tencent.mm.pluginsdk.ui;

import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AbstractVideoView$10
  implements Runnable
{
  AbstractVideoView$10(AbstractVideoView paramAbstractVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117943);
    if ((this.vgH.vgm != null) && (this.vgH.vgm.getVisibility() != 0))
      this.vgH.vgm.setVisibility(0);
    AppMethodBeat.o(117943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.10
 * JD-Core Version:    0.6.2
 */