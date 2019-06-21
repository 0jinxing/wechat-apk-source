package com.tencent.mm.plugin.story.ui;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class StoryCaptureUI$d
  implements DialogInterface.OnClickListener
{
  StoryCaptureUI$d(StoryCaptureUI paramStoryCaptureUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(110003);
    this.seH.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    paramDialogInterface.dismiss();
    AppMethodBeat.o(110003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCaptureUI.d
 * JD-Core Version:    0.6.2
 */