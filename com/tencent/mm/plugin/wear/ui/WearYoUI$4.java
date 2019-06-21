package com.tencent.mm.plugin.wear.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WearYoUI$4 extends BroadcastReceiver
{
  WearYoUI$4(WearYoUI paramWearYoUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(26466);
    if (paramIntent.getAction() == "android.intent.action.CLOSE_SYSTEM_DIALOGS")
      this.tYZ.finish();
    AppMethodBeat.o(26466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.ui.WearYoUI.4
 * JD-Core Version:    0.6.2
 */