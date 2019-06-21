package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingDeleteAccountAgreementUI$2
  implements View.OnClickListener
{
  SettingDeleteAccountAgreementUI$2(SettingDeleteAccountAgreementUI paramSettingDeleteAccountAgreementUI, TextView paramTextView, CheckedTextView paramCheckedTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127062);
    this.qlL.setEnabled(this.qlM.isChecked());
    AppMethodBeat.o(127062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountAgreementUI.2
 * JD-Core Version:    0.6.2
 */