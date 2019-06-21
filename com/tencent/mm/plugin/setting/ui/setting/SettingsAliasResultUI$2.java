package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SettingsAliasResultUI$2
  implements View.OnClickListener
{
  SettingsAliasResultUI$2(SettingsAliasResultUI paramSettingsAliasResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127178);
    paramView = new Intent(this.qmR.mController.ylL, RegByMobileSetPwdUI.class);
    paramView.putExtra("kintent_hint", this.qmR.getString(2131302299));
    this.qmR.startActivityForResult(paramView, 0);
    AppMethodBeat.o(127178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI.2
 * JD-Core Version:    0.6.2
 */