package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;

final class c$10
  implements View.OnClickListener
{
  c$10(c paramc, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(27124);
    h.pYm.e(14547, new Object[] { Integer.valueOf(11) });
    this.uUc.uTR.setPressed(false);
    this.uUc.uTS.setPressed(false);
    if ((this.uUc.uTZ) || (this.uUc.uTY))
      this.uUc.uUa = false;
    Object localObject = u.uSA;
    if (!this.uUc.uUa)
    {
      bool2 = true;
      c.c((t)localObject, Boolean.valueOf(bool2));
      localObject = this.uUc;
      if (this.uUc.uUa)
        break label180;
    }
    label180: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((c)localObject).uUa = bool2;
      c.a(this.uUc, paramView, this.uUc.uUa);
      c.b(this.uUb);
      this.uUc.uTZ = false;
      this.uUc.uTY = false;
      AppMethodBeat.o(27124);
      return;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.c.10
 * JD-Core Version:    0.6.2
 */