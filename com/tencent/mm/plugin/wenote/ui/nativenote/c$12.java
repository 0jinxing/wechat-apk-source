package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wenote.model.nativenote.b.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;

final class c$12
  implements View.OnClickListener
{
  c$12(c paramc, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(27126);
    h.pYm.e(14547, new Object[] { Integer.valueOf(8) });
    this.uUc.uTU.setPressed(false);
    this.uUc.uTS.setPressed(false);
    if ((this.uUc.uTZ) || (this.uUc.uUa))
      this.uUc.uTY = false;
    Object localObject = u.uSB;
    if (!this.uUc.uTY)
    {
      bool2 = true;
      c.c((t)localObject, Boolean.valueOf(bool2));
      localObject = this.uUc;
      if (this.uUc.uTY)
        break label180;
    }
    label180: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((c)localObject).uTY = bool2;
      c.a(this.uUc, paramView, this.uUc.uTY);
      c.b(this.uUb);
      this.uUc.uTZ = false;
      this.uUc.uUa = false;
      AppMethodBeat.o(27126);
      return;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.c.12
 * JD-Core Version:    0.6.2
 */