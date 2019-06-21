package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.c.1;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

final class IPCallRechargeUI$a$1
  implements View.OnClickListener
{
  IPCallRechargeUI$a$1(IPCallRechargeUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22263);
    Object localObject = IPCallRechargeUI.a.a(this.nEy);
    int i;
    if (!g.dnY())
    {
      localObject = new c.a((Context)localObject);
      ((c.a)localObject).PZ(2131300826);
      ((c.a)localObject).Qc(2131296955).a(new c.1());
      ((c.a)localObject).aMb().show();
      i = 1;
      if (i == 0)
        break label85;
      ab.i("MicroMsg.IPCallRechargeUI", "onClick recharged, non gp version!");
      AppMethodBeat.o(22263);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label85: IPCallRechargeUI.b(IPCallRechargeUI.a.a(this.nEy), ((Integer)paramView.getTag()).intValue());
      AppMethodBeat.o(22263);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.a.1
 * JD-Core Version:    0.6.2
 */