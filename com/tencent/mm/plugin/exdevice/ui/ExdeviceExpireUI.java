package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class ExdeviceExpireUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130969419;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(19967);
    super.onCreate(paramBundle);
    setMMTitle(2131299371);
    setBackBtn(new ExdeviceExpireUI.1(this));
    AppMethodBeat.o(19967);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceExpireUI
 * JD-Core Version:    0.6.2
 */