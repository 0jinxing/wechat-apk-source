package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.text.Editable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;

final class l$2$1
  implements Runnable
{
  l$2$1(l.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27176);
    if (this.uUZ.uUY.uOc != 0)
    {
      int i = l.a(this.uUZ.uUW).getSelection().aqm;
      if (i == this.uUZ.uUY.content.length())
      {
        l.a(this.uUZ.uUW).deL();
        l.a(this.uUZ.uUW).getText().append("\n");
        l.a(this.uUZ.uUW).deM();
        l.a(this.uUZ.uUW).setSelection(i);
      }
      this.uUZ.uUY.uOc = 0;
      if (this.uUZ.uUY.uOd == 1)
      {
        l.a(this.uUZ.uUW).a(u.uSB, Boolean.TRUE);
        AppMethodBeat.o(27176);
      }
    }
    while (true)
    {
      return;
      if (this.uUZ.uUY.uOd == 3)
      {
        l.a(this.uUZ.uUW).a(u.uSA, Boolean.TRUE);
        AppMethodBeat.o(27176);
      }
      else
      {
        if (this.uUZ.uUY.uOd == 2)
          l.a(this.uUZ.uUW).a(u.uSC, Boolean.TRUE);
        AppMethodBeat.o(27176);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.l.2.1
 * JD-Core Version:    0.6.2
 */