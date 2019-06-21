package com.tencent.mm.plugin.story.ui.view.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.f.h;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"})
final class l$l
  implements DialogInterface.OnClickListener
{
  l$l(l paraml)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(110812);
    h localh = l.l(this.spK);
    boolean bool;
    if (localh != null)
    {
      int i = l.g(this.spK);
      paramInt = l.m(this.spK);
      paramDialogInterface = l.o(this.spK);
      if (paramDialogInterface != null)
      {
        bool = paramDialogInterface.rvv;
        localh.n(i, paramInt, bool);
        AppMethodBeat.o(110812);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      AppMethodBeat.o(110812);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.l
 * JD-Core Version:    0.6.2
 */