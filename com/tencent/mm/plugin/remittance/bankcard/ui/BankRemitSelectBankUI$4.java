package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.h;
import com.tencent.mm.plugin.remittance.bankcard.model.a;
import com.tencent.mm.plugin.remittance.bankcard.model.b;
import com.tencent.mm.protocal.protobuf.afc;
import com.tencent.mm.protocal.protobuf.hd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.sortview.d;
import com.tencent.mm.wallet_core.c.p.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class BankRemitSelectBankUI$4
  implements p.a
{
  BankRemitSelectBankUI$4(BankRemitSelectBankUI paramBankRemitSelectBankUI, h paramh)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44666);
    paramm = new ArrayList();
    Object localObject1 = this.pOf.pLz.wmC;
    paramString = this.pOf.pLz.wmB;
    Object localObject2 = new b();
    Object localObject3;
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      ab.i("MicroMsg.BankRemitSelectBankUI", "freq card count: %s", new Object[] { Integer.valueOf(paramString.size()) });
      localObject3 = ((List)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (hd)((Iterator)localObject3).next();
        d locald = new d();
        locald.yDG = "☆";
        locald.data = localObject1;
        paramm.add(locald);
      }
    }
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      ab.i("MicroMsg.BankRemitSelectBankUI", "card count: %s", new Object[] { Integer.valueOf(paramString.size()) });
      Collections.sort(paramString, (Comparator)localObject2);
      localObject2 = paramString.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (hd)((Iterator)localObject2).next();
        if (!bo.isNullOrNil(((hd)localObject1).nuL))
        {
          if (!bo.isNullOrNil(((hd)localObject1).vJN))
            ab.i("MicroMsg.BankRemitSelectBankUI", "use sort pingyin: %s", new Object[] { ((hd)localObject1).vJN });
          for (paramString = ((hd)localObject1).vJN.toUpperCase().charAt(0); ; paramString = a.VL(((hd)localObject1).nuL))
          {
            localObject3 = new d();
            ((d)localObject3).yDG = paramString;
            ((d)localObject3).data = localObject1;
            paramm.add(localObject3);
            break;
          }
        }
      }
    }
    BankRemitSelectBankUI.a(this.pOe).dJ(paramm);
    AppMethodBeat.o(44666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI.4
 * JD-Core Version:    0.6.2
 */