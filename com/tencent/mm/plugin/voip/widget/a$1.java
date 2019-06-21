package com.tencent.mm.plugin.voip.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5137);
    ab.i("MicroMsg.Voip.TalkingSmallView", "on mDismissLocalView");
    if (a.a(this.tcn).tbe)
    {
      a.b(this.tcn).mD(true);
      AppMethodBeat.o(5137);
    }
    while (true)
    {
      return;
      a.a(this.tcn).setVisibility(4);
      AppMethodBeat.o(5137);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.a.1
 * JD-Core Version:    0.6.2
 */