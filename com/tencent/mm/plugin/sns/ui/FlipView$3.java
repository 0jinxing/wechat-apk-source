package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.an;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.widget.a.d.a;

final class FlipView$3
  implements d.a
{
  FlipView$3(FlipView paramFlipView)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(38228);
    an localan = new an();
    localan.ctC.filePath = FlipView.a(this.riK);
    a.xxA.m(localan);
    FlipView.b(this.riK);
    FlipView.c(this.riK);
    FlipView.a(this.riK, "");
    FlipView.d(this.riK);
    FlipView.b(this.riK, null);
    FlipView.a(this.riK, FlipView.b(this.riK, 0));
    AppMethodBeat.o(38228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.FlipView.3
 * JD-Core Version:    0.6.2
 */