package com.tencent.mm.plugin.emojicapture.model;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.api.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"})
final class PluginEmojiCapture$b
  implements DialogInterface.OnDismissListener
{
  PluginEmojiCapture$b(b.a parama)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(2617);
    this.lhF.gA(true);
    AppMethodBeat.o(2617);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.PluginEmojiCapture.b
 * JD-Core Version:    0.6.2
 */