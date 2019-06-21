package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

final class IPCallRechargeUI$1
  implements h.a
{
  IPCallRechargeUI$1(IPCallRechargeUI paramIPCallRechargeUI)
  {
  }

  public final void A(ArrayList<n> paramArrayList)
  {
    AppMethodBeat.i(22251);
    IPCallRechargeUI.a(this.nEu).nzj = bo.anU();
    n localn;
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      IPCallRechargeUI.a(this.nEu, new String[paramArrayList.size()]);
      IPCallRechargeUI.b(this.nEu, new String[paramArrayList.size()]);
      localn = (n)paramArrayList.get(0);
      if (localn.vbt == 10232)
      {
        ab.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product OK size=" + paramArrayList.size());
        paramArrayList = paramArrayList.iterator();
        for (int i = 0; paramArrayList.hasNext(); i++)
        {
          localn = (n)paramArrayList.next();
          BigDecimal localBigDecimal = new BigDecimal(localn.vbs).divide(new BigDecimal(1000000));
          IPCallRechargeUI.b(this.nEu)[i] = localBigDecimal.toString();
          IPCallRechargeUI.c(this.nEu)[i] = localn.vbr;
        }
        if ((IPCallRechargeUI.d(this.nEu) > 0) && (IPCallRechargeUI.c(this.nEu).length > 0))
        {
          paramArrayList = IPCallRechargeUI.c(this.nEu)[0];
          if ((!bo.isNullOrNil(paramArrayList)) && (!paramArrayList.equals(IPCallRechargeUI.e(this.nEu))))
          {
            ab.i("MicroMsg.IPCallRechargeUI", "remote currency:" + IPCallRechargeUI.e(this.nEu) + ",google wallet currency:" + paramArrayList);
            IPCallRechargeUI.a(this.nEu, paramArrayList);
            AppMethodBeat.o(22251);
          }
        }
      }
    }
    while (true)
    {
      return;
      if ((IPCallRechargeUI.f(this.nEu) != null) && (IPCallRechargeUI.f(this.nEu).isShowing()))
        IPCallRechargeUI.f(this.nEu).dismiss();
      this.nEu.bIt();
      AppMethodBeat.o(22251);
      continue;
      if ((IPCallRechargeUI.f(this.nEu) != null) && (IPCallRechargeUI.f(this.nEu).isShowing()))
        IPCallRechargeUI.f(this.nEu).dismiss();
      IPCallRechargeUI.a(this.nEu, localn.vbt);
      ab.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product Failed Status:" + IPCallRechargeUI.g(this.nEu));
      this.nEu.bIt();
      AppMethodBeat.o(22251);
      continue;
      if ((IPCallRechargeUI.f(this.nEu) != null) && (IPCallRechargeUI.f(this.nEu).isShowing()))
        IPCallRechargeUI.f(this.nEu).dismiss();
      ab.i("MicroMsg.IPCallRechargeUI", "[onQueryFinish] result=null");
      IPCallRechargeUI.a(this.nEu, 10236);
      this.nEu.bIt();
      AppMethodBeat.o(22251);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.1
 * JD-Core Version:    0.6.2
 */