package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;

final class c$11
  implements View.OnClickListener
{
  c$11(c paramc, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(27125);
    h.pYm.e(14547, new Object[] { Integer.valueOf(7) });
    Object localObject = u.uSz;
    if (!this.uUc.uTX)
    {
      bool2 = true;
      c.c((t)localObject, Boolean.valueOf(bool2));
      localObject = this.uUc;
      if (this.uUc.uTX)
        break label114;
    }
    label114: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((c)localObject).uTX = bool2;
      c.a(this.uUc, paramView, this.uUc.uTX);
      c.b(this.uUb);
      AppMethodBeat.o(27125);
      return;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.c.11
 * JD-Core Version:    0.6.2
 */