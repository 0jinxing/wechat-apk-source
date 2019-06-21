package com.tencent.mm.plugin.voip.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5138);
    ab.i("MicroMsg.Voip.TalkingSmallView", "on mShowLocalView");
    if (a.a(this.tcn).tbe)
      a.b(this.tcn).mD(false);
    a.a(this.tcn).setVisibility(0);
    AppMethodBeat.o(5138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.a.2
 * JD-Core Version:    0.6.2
 */