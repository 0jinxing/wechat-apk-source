package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class SelfQRCodeUI$6
  implements View.OnClickListener
{
  SelfQRCodeUI$6(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127018);
    d.H(this.qly, "setting", ".ui.setting.SettingsAddMeUI");
    AppMethodBeat.o(127018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.6
 * JD-Core Version:    0.6.2
 */