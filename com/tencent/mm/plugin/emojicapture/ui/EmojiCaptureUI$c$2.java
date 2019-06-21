package com.tencent.mm.plugin.emojicapture.ui;

import a.f.b.j;
import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"})
final class EmojiCaptureUI$c$2
  implements DialogInterface.OnClickListener
{
  EmojiCaptureUI$c$2(EmojiCaptureUI.c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(2865);
    j.p(paramDialogInterface, "dialog");
    paramDialogInterface.dismiss();
    this.lll.llk.finish();
    AppMethodBeat.o(2865);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.c.2
 * JD-Core Version:    0.6.2
 */