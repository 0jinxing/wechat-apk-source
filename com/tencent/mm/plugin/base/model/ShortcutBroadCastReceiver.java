package com.tencent.mm.plugin.base.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public class ShortcutBroadCastReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(79060);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.ShortcutBroadCastReceiver", "alvinluo shortcut receiver intent is null");
      AppMethodBeat.o(79060);
    }
    while (true)
    {
      return;
      h.bQ(paramContext, paramContext.getString(2131296524));
      AppMethodBeat.o(79060);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.model.ShortcutBroadCastReceiver
 * JD-Core Version:    0.6.2
 */