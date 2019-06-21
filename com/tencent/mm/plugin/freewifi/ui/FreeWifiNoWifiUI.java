package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiNoWifiUI extends MMActivity
{
  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969595;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21058);
    super.onCreate(paramBundle);
    setBackBtn(new FreeWifiNoWifiUI.1(this));
    AppMethodBeat.o(21058);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNoWifiUI
 * JD-Core Version:    0.6.2
 */