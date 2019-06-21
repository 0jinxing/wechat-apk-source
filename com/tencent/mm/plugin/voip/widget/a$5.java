package com.tencent.mm.plugin.voip.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.ui.base.MMTextureView;

final class a$5
  implements Runnable
{
  a$5(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5143);
    this.tcn.sXQ.setVisibility(4);
    if (d.iW(21))
      a.a(this.tcn).setVisibility(0);
    a.c(this.tcn).setVisibility(0);
    AppMethodBeat.o(5143);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.a.5
 * JD-Core Version:    0.6.2
 */