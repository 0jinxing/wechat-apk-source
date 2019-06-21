package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130970623;
  }

  public final void initView()
  {
    AppMethodBeat.i(127072);
    setBackBtn(new SettingDeleteAccountUI.1(this));
    ((TextView)findViewById(2131827369)).setOnClickListener(new SettingDeleteAccountUI.2(this));
    AppMethodBeat.o(127072);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127071);
    super.onCreate(paramBundle);
    setMMTitle(2131302978);
    initView();
    AppMethodBeat.o(127071);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI
 * JD-Core Version:    0.6.2
 */