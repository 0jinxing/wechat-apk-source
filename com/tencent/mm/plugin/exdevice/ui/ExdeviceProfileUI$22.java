package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sport.ui.SportChartView;
import com.tencent.mm.plugin.sport.ui.SportChartView.a;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class ExdeviceProfileUI$22
  implements MMSwitchBtn.a
{
  ExdeviceProfileUI$22(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(20047);
    if (ExdeviceProfileUI.F(this.lCu) != null)
    {
      if (!paramBoolean)
        break label57;
      ExdeviceProfileUI.G(this.lCu).a(SportChartView.a.rQl);
    }
    while (true)
    {
      ExdeviceProfileUI.G(this.lCu).dD(ExdeviceProfileUI.F(this.lCu));
      AppMethodBeat.o(20047);
      return;
      label57: ExdeviceProfileUI.G(this.lCu).a(SportChartView.a.rQk);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.22
 * JD-Core Version:    0.6.2
 */