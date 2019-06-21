package com.tencent.mm.plugin.story.ui.view.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.f.h;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"})
final class l$h$1
  implements DialogInterface.OnCancelListener
{
  l$h$1(l.h paramh)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(110807);
    paramDialogInterface = l.spJ;
    ab.i(l.access$getTAG$cp(), "delete click and click cancel it " + l.g(this.spR.spK) + ' ' + l.m(this.spR.spK));
    paramDialogInterface = l.l(this.spR.spK);
    if (paramDialogInterface != null)
    {
      l.g(this.spR.spK);
      l.m(this.spR.spK);
      paramDialogInterface.czB();
      AppMethodBeat.o(110807);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110807);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.h.1
 * JD-Core Version:    0.6.2
 */