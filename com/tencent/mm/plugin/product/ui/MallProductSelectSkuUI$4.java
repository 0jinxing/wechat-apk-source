package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.product.b.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

final class MallProductSelectSkuUI$4
  implements View.OnClickListener
{
  MallProductSelectSkuUI$4(MallProductSelectSkuUI paramMallProductSelectSkuUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44109);
    f localf = MallProductSelectSkuUI.d(this.pju);
    if (localf.piI)
    {
      t.makeText(localf.gNy, 2131301349, 1).show();
      AppMethodBeat.o(44109);
    }
    while (true)
    {
      return;
      if (!localf.piK.bZQ())
        break;
      if (localf.piK.pgU != null)
      {
        g.RQ();
        g.RO().eJo.a(new j(localf.piK.bZS(), f.gOW), 0);
        AppMethodBeat.o(44109);
      }
      else
      {
        d.c(localf.gNy, "address", ".ui.WalletAddAddressUI", 2);
        AppMethodBeat.o(44109);
      }
    }
    com.tencent.mm.plugin.product.b.c localc = localf.piK;
    if ((localc.pha != null) && (localc.pha.size() < localc.pgY) && (localc.pgY > 0))
    {
      Iterator localIterator = localc.pgO.phs.phM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        paramView = (com.tencent.mm.plugin.product.c.m)localIterator.next();
      }
      while (localc.pha.containsKey(paramView.phX));
    }
    for (paramView = paramView.phY; ; paramView = null)
    {
      if (!bo.isNullOrNil(paramView))
        t.makeText(localf.gNy, localf.gNy.getString(2131301358, new Object[] { paramView }), 0).show();
      AppMethodBeat.o(44109);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI.4
 * JD-Core Version:    0.6.2
 */