package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountInputPassUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130970625;
  }

  public final void initView()
  {
    AppMethodBeat.i(127069);
    setBackBtn(new SettingDeleteAccountInputPassUI.1(this));
    addTextOptionMenu(0, getString(2131296944), new SettingDeleteAccountInputPassUI.2(this));
    AppMethodBeat.o(127069);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127068);
    super.onCreate(paramBundle);
    setMMTitle(2131302978);
    initView();
    AppMethodBeat.o(127068);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI
 * JD-Core Version:    0.6.2
 */