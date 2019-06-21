package com.tencent.mm.plugin.messenger;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class PluginMessenger$5$1
  implements DialogInterface.OnCancelListener
{
  PluginMessenger$5$1(PluginMessenger.5 param5)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(136879);
    g.Rg().c(PluginMessenger.access$200(this.opI.opG));
    AppMethodBeat.o(136879);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.PluginMessenger.5.1
 * JD-Core Version:    0.6.2
 */