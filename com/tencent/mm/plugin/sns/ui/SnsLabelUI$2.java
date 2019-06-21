package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.a.b;
import java.util.ArrayList;

final class SnsLabelUI$2
  implements Runnable
{
  SnsLabelUI$2(SnsLabelUI paramSnsLabelUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39012);
    a.bJa().ahw();
    SnsLabelUI.a(this.rtz, (ArrayList)a.bJa().bIV());
    SnsLabelUI.a(this.rtz).T(SnsLabelUI.j(this.rtz));
    SnsLabelUI.k(this.rtz);
    if (((SnsLabelUI.j(this.rtz) == null) || (SnsLabelUI.j(this.rtz).size() == 0)) && ((SnsLabelUI.p(this.rtz) == null) || (SnsLabelUI.p(this.rtz).length() == 0)) && (SnsLabelUI.a(this.rtz).rtF != 0) && (SnsLabelUI.a(this.rtz).rtF != 1))
      SnsLabelUI.a(this.rtz).rtF = 0;
    SnsLabelUI.a(this.rtz).notifyDataSetChanged();
    SnsLabelUI.m(this.rtz);
    AppMethodBeat.o(39012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI.2
 * JD-Core Version:    0.6.2
 */