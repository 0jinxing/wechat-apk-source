package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FreeWifiMIGNoAuthStateUI extends FreeWifiNoAuthStateUI
{
  protected final String bzA()
  {
    AppMethodBeat.i(21007);
    String str = getString(2131301439);
    AppMethodBeat.o(21007);
    return str;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiMIGNoAuthStateUI
 * JD-Core Version:    0.6.2
 */