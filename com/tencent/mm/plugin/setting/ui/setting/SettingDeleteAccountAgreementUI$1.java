package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingDeleteAccountAgreementUI$1
  implements View.OnClickListener
{
  SettingDeleteAccountAgreementUI$1(SettingDeleteAccountAgreementUI paramSettingDeleteAccountAgreementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127061);
    this.qlK.startActivity(new Intent(this.qlK, SettingDeleteAccountInputPassUI.class));
    AppMethodBeat.o(127061);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountAgreementUI.1
 * JD-Core Version:    0.6.2
 */