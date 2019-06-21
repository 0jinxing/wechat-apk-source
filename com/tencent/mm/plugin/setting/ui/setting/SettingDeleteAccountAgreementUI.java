package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountAgreementUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130970624;
  }

  public final void initView()
  {
    AppMethodBeat.i(127065);
    TextView localTextView = (TextView)findViewById(2131822846);
    localTextView.setOnClickListener(new SettingDeleteAccountAgreementUI.1(this));
    CheckedTextView localCheckedTextView = (CheckedTextView)findViewById(2131827370);
    localCheckedTextView.setOnClickListener(new SettingDeleteAccountAgreementUI.2(this, localTextView, localCheckedTextView));
    localTextView.setEnabled(localCheckedTextView.isChecked());
    setBackBtn(new SettingDeleteAccountAgreementUI.3(this));
    AppMethodBeat.o(127065);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127064);
    super.onCreate(paramBundle);
    setMMTitle(2131302978);
    initView();
    AppMethodBeat.o(127064);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountAgreementUI
 * JD-Core Version:    0.6.2
 */