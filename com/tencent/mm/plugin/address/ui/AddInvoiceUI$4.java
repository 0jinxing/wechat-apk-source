package com.tencent.mm.plugin.address.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.j.a.b;

final class AddInvoiceUI$4
  implements MenuItem.OnMenuItemClickListener
{
  AddInvoiceUI$4(AddInvoiceUI paramAddInvoiceUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(16790);
    if (AddInvoiceUI.f(this.gJA) == 0)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(14199, new Object[] { Integer.valueOf(3) });
      if ((AddInvoiceUI.a(this.gJA) == null) || (!AddInvoiceUI.a(this.gJA).isActivated()) || (AddInvoiceUI.g(this.gJA).getText().length() != 0))
        break label115;
      this.gJA.arZ();
      AppMethodBeat.o(16790);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.report.service.h.pYm.e(14199, new Object[] { Integer.valueOf(4) });
      break;
      label115: if ((AddInvoiceUI.b(this.gJA) != null) && (AddInvoiceUI.b(this.gJA).isActivated()) && (AddInvoiceUI.h(this.gJA).getText().length() == 0))
      {
        this.gJA.arZ();
        AppMethodBeat.o(16790);
      }
      else if ((AddInvoiceUI.f(this.gJA) != 0) && (AddInvoiceUI.h(this.gJA).getText().length() == 0) && (AddInvoiceUI.g(this.gJA).getText().length() == 0))
      {
        this.gJA.arZ();
        AppMethodBeat.o(16790);
      }
      else if (AddInvoiceUI.i(this.gJA).getText().length() > 100)
      {
        paramMenuItem = this.gJA;
        com.tencent.mm.ui.base.h.a(paramMenuItem, paramMenuItem.getString(2131300674), paramMenuItem.getString(2131297061), false, null);
        AppMethodBeat.o(16790);
      }
      else
      {
        if (AddInvoiceUI.d(this.gJA))
          break label438;
        if (((AddInvoiceUI.a(this.gJA) != null) && (AddInvoiceUI.a(this.gJA).isActivated())) || ((AddInvoiceUI.j(this.gJA) != null) && (AddInvoiceUI.j(this.gJA).type != null) && (AddInvoiceUI.j(this.gJA).type.equals("0"))))
        {
          if (!AddInvoiceUI.k(this.gJA).asa())
          {
            paramMenuItem = this.gJA;
            com.tencent.mm.ui.base.h.a(paramMenuItem, paramMenuItem.getString(2131300685), paramMenuItem.getString(2131297061), false, null);
          }
          if (!AddInvoiceUI.l(this.gJA).asa())
          {
            paramMenuItem = this.gJA;
            com.tencent.mm.ui.base.h.a(paramMenuItem, paramMenuItem.getString(2131300671), paramMenuItem.getString(2131297061), false, null);
          }
        }
        AppMethodBeat.o(16790);
        bool = true;
      }
    }
    label438: if (AddInvoiceUI.a(this.gJA).isActivated())
      AddInvoiceUI.c(this.gJA).type = "0";
    while (true)
    {
      if (AddInvoiceUI.j(this.gJA) != null)
        AddInvoiceUI.c(this.gJA).type = AddInvoiceUI.j(this.gJA).type;
      AddInvoiceUI.c(this.gJA).title = AddInvoiceUI.g(this.gJA).getText();
      AddInvoiceUI.c(this.gJA).nuI = AddInvoiceUI.h(this.gJA).getText();
      AddInvoiceUI.c(this.gJA).nuJ = AddInvoiceUI.i(this.gJA).getText();
      AddInvoiceUI.c(this.gJA).nuH = AddInvoiceUI.f(this.gJA);
      AddInvoiceUI.c(this.gJA).nuN = AddInvoiceUI.k(this.gJA).getText();
      AddInvoiceUI.c(this.gJA).nuL = AddInvoiceUI.m(this.gJA).getText();
      AddInvoiceUI.c(this.gJA).nuK = AddInvoiceUI.l(this.gJA).getText();
      AddInvoiceUI.c(this.gJA).nuP = AddInvoiceUI.n(this.gJA).getText();
      AddInvoiceUI.o(this.gJA);
      AppMethodBeat.o(16790);
      bool = true;
      break;
      if (AddInvoiceUI.b(this.gJA).isActivated())
        AddInvoiceUI.c(this.gJA).type = "1";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddInvoiceUI.4
 * JD-Core Version:    0.6.2
 */