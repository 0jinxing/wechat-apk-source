package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMPullDownView.f;

final class SnsTimeLineUI$38
  implements MMPullDownView.f
{
  SnsTimeLineUI$38(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void ba(float paramFloat)
  {
    AppMethodBeat.i(39511);
    SnsTimeLineUI.J(this.rzs);
    if (SnsTimeLineUI.rza.booleanValue())
      ab.i("MicroMsg.SnsTimeLineUI", "mUIAction.header.getTop %s originalHeaderTop %s distanceY %s", new Object[] { Integer.valueOf(SnsTimeLineUI.j(this.rzs).qQt.getTop()), Integer.valueOf(SnsTimeLineUI.h(this.rzs).rzX), Float.valueOf(paramFloat) });
    if ((SnsTimeLineUI.j(this.rzs).qQt.getTop() >= SnsTimeLineUI.h(this.rzs).rzX) || (paramFloat > 0.0F))
      SnsTimeLineUI.h(this.rzs).bb(paramFloat);
    SnsTimeLineUI.g(this.rzs).crD();
    this.rzs.crO();
    SnsTimeLineUI.g(this.rzs).rhr.cuL();
    AppMethodBeat.o(39511);
  }

  public final void cuq()
  {
    AppMethodBeat.i(39512);
    SnsTimeLineUI.h(this.rzs).cut();
    AppMethodBeat.o(39512);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.38
 * JD-Core Version:    0.6.2
 */