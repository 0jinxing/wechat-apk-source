package com.tencent.mm.plugin.luckymoney.f2f.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class LuckyMoneyF2FQRCodeUI$1
  implements bz.a
{
  LuckyMoneyF2FQRCodeUI$1(LuckyMoneyF2FQRCodeUI paramLuckyMoneyF2FQRCodeUI)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(42170);
    Map localMap = br.z(aa.a(parama.eAB.vED), "sysmsg");
    if (localMap != null)
    {
      String str1 = (String)localMap.get(".sysmsg.sendId");
      String str2 = (String)localMap.get(".sysmsg.username");
      parama = (String)localMap.get(".sysmsg.amount");
      String str3 = (String)localMap.get(".sysmsg.receiveId");
      if (bo.getInt((String)localMap.get(".sysmsg.islucky"), 0) > 0)
        LuckyMoneyF2FQRCodeUI.a(this.nVw, str2);
      if (!bo.Q(new String[] { str1, str2, parama }))
        this.nVw.runOnUiThread(new LuckyMoneyF2FQRCodeUI.1.1(this, str3, str2, parama));
    }
    AppMethodBeat.o(42170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.1
 * JD-Core Version:    0.6.2
 */