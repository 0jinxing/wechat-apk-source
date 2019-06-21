package com.tencent.mm.plugin.address.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.address.model.a;
import com.tencent.mm.plugin.j.a.b;
import com.tencent.mm.ui.base.h.c;
import java.util.LinkedList;

final class InvoiceListUI$3$1
  implements h.c
{
  InvoiceListUI$3$1(InvoiceListUI.3 param3, int paramInt)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(16859);
    while (true)
    {
      synchronized (InvoiceListUI.b(this.gKk.gKj))
      {
        if (this.sN >= InvoiceListUI.c(this.gKk.gKj).size())
          break label200;
        b localb = (b)InvoiceListUI.c(this.gKk.gKj).get(this.sN);
        if (localb == null)
        {
          AppMethodBeat.o(16859);
          return;
        }
      }
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(16859);
        break;
        InvoiceListUI.a(this.gKk.gKj, localObject2.nuH);
        AppMethodBeat.o(16859);
        break;
        locala = new a(localObject2.nuH);
        InvoiceListUI.a(this.gKk.gKj, null);
        aw.Rg().a(locala, 0);
        AppMethodBeat.o(16859);
        break;
        InvoiceListUI.b(this.gKk.gKj, locala);
      }
      label200: a locala = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceListUI.3.1
 * JD-Core Version:    0.6.2
 */