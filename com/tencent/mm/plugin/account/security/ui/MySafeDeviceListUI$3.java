package com.tencent.mm.plugin.account.security.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.preference.f;

final class MySafeDeviceListUI$3 extends ak
{
  MySafeDeviceListUI$3(MySafeDeviceListUI paramMySafeDeviceListUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(69874);
    MySafeDeviceListUI.b(this.gzC).notifyDataSetChanged();
    super.handleMessage(paramMessage);
    AppMethodBeat.o(69874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI.3
 * JD-Core Version:    0.6.2
 */