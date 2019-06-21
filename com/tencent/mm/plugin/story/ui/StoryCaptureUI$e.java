package com.tencent.mm.plugin.story.ui;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class StoryCaptureUI$e
  implements DialogInterface.OnClickListener
{
  public static final e seI;

  static
  {
    AppMethodBeat.i(110005);
    seI = new e();
    AppMethodBeat.o(110005);
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(110004);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(110004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCaptureUI.e
 * JD-Core Version:    0.6.2
 */