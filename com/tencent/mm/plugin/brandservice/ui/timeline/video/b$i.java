package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"})
final class b$i
  implements DialogInterface.OnCancelListener
{
  b$i(b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(15126);
    try
    {
      paramDialogInterface.dismiss();
      AppMethodBeat.o(15126);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e(this.jVN.TAG, "showProgressDlg onCancel exp: %s ", new Object[] { paramDialogInterface.getLocalizedMessage() });
        AppMethodBeat.o(15126);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.b.i
 * JD-Core Version:    0.6.2
 */