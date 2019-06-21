package com.tencent.mm.plugin.story.ui.view.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.f.h;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"})
final class l$k
  implements DialogInterface.OnClickListener
{
  l$k(l paraml)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(138951);
    paramDialogInterface = l.l(this.spK);
    boolean bool;
    if (paramDialogInterface != null)
    {
      paramInt = l.g(this.spK);
      int i = l.m(this.spK);
      a locala = l.o(this.spK);
      if (locala != null)
      {
        bool = locala.rYr;
        paramDialogInterface.o(paramInt, i, bool);
        AppMethodBeat.o(138951);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      AppMethodBeat.o(138951);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.k
 * JD-Core Version:    0.6.2
 */