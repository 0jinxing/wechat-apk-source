package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.o;
import com.tencent.mm.wallet_core.ui.e;

final class h$b$1
  implements View.OnClickListener
{
  h$b$1(h.b paramb, as paramas, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42896);
    h.pYm.e(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(this.ogH.nZn) });
    if (this.ogH.nZo != 1)
    {
      ((com.tencent.mm.pluginsdk.g)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.g.class)).a(this.val$context, this.ogH.content, new h.b.1.1(this)).show();
      AppMethodBeat.o(42896);
    }
    while (true)
    {
      return;
      e.ae(this.val$context, this.ogH.content);
      AppMethodBeat.o(42896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.h.b.1
 * JD-Core Version:    0.6.2
 */