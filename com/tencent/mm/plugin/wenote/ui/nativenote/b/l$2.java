package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.al;

final class l$2
  implements Runnable
{
  l$2(l paraml, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27177);
    l.a(this.uUW).setRichTextEditing(this.uUY.content);
    l.a(this.uUW).deL();
    l.a(this.uUW).deN();
    j.l(l.a(this.uUW));
    l.a(this.uUW).deO();
    l.a(this.uUW).deM();
    if (this.uUY.uNT)
      if ((this.uUY.uNV != -1) && (this.uUY.uNV < l.a(this.uUW).getText().toString().length()))
      {
        l.a(this.uUW).setSelection(this.uUY.uNV);
        l.a(this.uUW).requestFocus();
        al.n(new l.2.1(this), 500L);
      }
    while (true)
    {
      if (this.uUY.uOb)
      {
        this.uUY.uOb = false;
        l.a(this.uUW).uOb = true;
        l.a(this.uUW).onTextContextMenuItem(16908322);
      }
      AppMethodBeat.o(27177);
      return;
      l.a(this.uUW).setSelection(l.a(this.uUW).getText().toString().length());
      break;
      if (l.a(this.uUW).hasFocus())
        l.a(this.uUW).clearFocus();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.l.2
 * JD-Core Version:    0.6.2
 */