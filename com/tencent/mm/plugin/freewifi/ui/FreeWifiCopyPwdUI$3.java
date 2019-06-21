package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m.a;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;

final class FreeWifiCopyPwdUI$3
  implements m.a
{
  FreeWifiCopyPwdUI$3(FreeWifiCopyPwdUI paramFreeWifiCopyPwdUI)
  {
  }

  public final void h(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20938);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (!(paramm instanceof a))
        AppMethodBeat.o(20938);
    while (true)
    {
      return;
      paramString = ((a)paramm).bzj();
      if (paramString != null)
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { paramString.vEn, paramString.jCH, paramString.jBB, Integer.valueOf(paramString.vID), paramString.vIE, paramString.guQ, paramString.vIF });
        FreeWifiCopyPwdUI.a(this.myE, new FreeWifiCopyPwdUI.b(this.myE, FreeWifiCopyPwdUI.b(this.myE), paramString));
        AppMethodBeat.o(20938);
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "backPageInfo is null");
        paramString = this.myE;
        Object localObject = this.myE;
        paramInt1 = FreeWifiCopyPwdUI.c(this.myE);
        paramm = new FreeWifiCopyPwdUI.a();
        paramm.myI = com.tencent.mm.plugin.freewifi.m.a(FreeWifiCopyPwdUI.d(this.myE), k.b.mus, 21);
        FreeWifiCopyPwdUI.a(paramString, new FreeWifiCopyPwdUI.b((FreeWifiCopyPwdUI)localObject, paramInt1, paramm));
        AppMethodBeat.o(20938);
        continue;
        if ((com.tencent.mm.plugin.freewifi.m.eh(paramInt1, paramInt2)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(paramString)))
        {
          FreeWifiCopyPwdUI localFreeWifiCopyPwdUI = this.myE;
          paramm = this.myE;
          paramInt1 = FreeWifiCopyPwdUI.c(this.myE);
          localObject = new FreeWifiCopyPwdUI.a();
          ((FreeWifiCopyPwdUI.a)localObject).text = paramString;
          ((FreeWifiCopyPwdUI.a)localObject).myI = com.tencent.mm.plugin.freewifi.m.a(FreeWifiCopyPwdUI.d(this.myE), k.b.mus, paramInt2);
          FreeWifiCopyPwdUI.a(localFreeWifiCopyPwdUI, new FreeWifiCopyPwdUI.b(paramm, paramInt1, localObject));
          AppMethodBeat.o(20938);
        }
        else
        {
          localObject = this.myE;
          paramString = this.myE;
          paramInt1 = FreeWifiCopyPwdUI.c(this.myE);
          paramm = new FreeWifiCopyPwdUI.a();
          paramm.myI = com.tencent.mm.plugin.freewifi.m.a(FreeWifiCopyPwdUI.d(this.myE), k.b.mus, paramInt2);
          FreeWifiCopyPwdUI.a((FreeWifiCopyPwdUI)localObject, new FreeWifiCopyPwdUI.b(paramString, paramInt1, paramm));
          AppMethodBeat.o(20938);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI.3
 * JD-Core Version:    0.6.2
 */