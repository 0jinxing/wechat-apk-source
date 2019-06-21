package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.radar.b.c.e;
import com.tencent.mm.protocal.protobuf.bpb;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class RadarViewController$h$a
  implements Runnable
{
  RadarViewController$h$a(RadarViewController.h paramh, View paramView, bpb parambpb, c.e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(103099);
    RadarViewController.g(this.pEw.pEg).a(this.pEx, this.pCz, this.pEy);
    RadarViewController.f(this.pEw.pEg).cdV();
    AppMethodBeat.o(103099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController.h.a
 * JD-Core Version:    0.6.2
 */