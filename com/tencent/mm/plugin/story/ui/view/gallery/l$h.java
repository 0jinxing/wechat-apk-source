package com.tencent.mm.plugin.story.ui.view.gallery;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.e.c;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "bOk", "", "<anonymous parameter 1>", "", "kotlin.jvm.PlatformType", "onDialogClick"})
final class l$h
  implements e.c
{
  l$h(l paraml, j paramj)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(110808);
    paramString = l.spJ;
    ab.i(l.access$getTAG$cp(), "delete click and click ok it " + l.g(this.spK) + ' ' + l.m(this.spK));
    int i;
    if (paramBoolean)
    {
      paramString = this.spQ;
      paramBoolean = bool;
      if (paramString != null)
      {
        if (paramString.field_storyID == 0L)
          break label190;
        i = 1;
        if (i == 0)
          break label196;
        label86: paramBoolean = bool;
        if (paramString != null)
          paramBoolean = true;
      }
      l locall = this.spK;
      paramString = this.spK.getContext();
      this.spK.getContext().getString(2131297061);
      l.a(locall, com.tencent.mm.ui.base.h.b(paramString, this.spK.getContext().getString(2131303924), paramBoolean, (DialogInterface.OnCancelListener)new l.h.1(this)));
      paramString = l.l(this.spK);
      if (paramString != null)
      {
        paramString.fM(l.g(this.spK), l.m(this.spK));
        AppMethodBeat.o(110808);
      }
    }
    while (true)
    {
      return;
      label190: i = 0;
      break;
      label196: paramString = null;
      break label86;
      AppMethodBeat.o(110808);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.h
 * JD-Core Version:    0.6.2
 */