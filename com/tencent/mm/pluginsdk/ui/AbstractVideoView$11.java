package com.tencent.mm.pluginsdk.ui;

import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AbstractVideoView$11
  implements Runnable
{
  AbstractVideoView$11(AbstractVideoView paramAbstractVideoView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117944);
    if ((this.vgH.vgm != null) && (this.vgH.vgm.getVisibility() != 8))
      this.vgH.vgm.setVisibility(8);
    AppMethodBeat.o(117944);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AbstractVideoView.11
 * JD-Core Version:    0.6.2
 */