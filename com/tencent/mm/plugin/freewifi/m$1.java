package com.tencent.mm.plugin.freewifi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;

final class m$1
  implements m.a
{
  m$1(String paramString, FreeWifiFrontPageUI paramFreeWifiFrontPageUI, int paramInt)
  {
  }

  public final void h(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20624);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (!(paramm instanceof a))
        AppMethodBeat.o(20624);
    while (true)
    {
      return;
      Object localObject1 = ((a)paramm).bzj();
      Object localObject2;
      if (localObject1 != null)
      {
        ab.i(this.muT, "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { ((gj)localObject1).vEn, ((gj)localObject1).jCH, ((gj)localObject1).jBB, Integer.valueOf(((gj)localObject1).vID), ((gj)localObject1).vIE, ((gj)localObject1).guQ, ((gj)localObject1).vIF });
        localObject2 = this.muU;
        paramString = FreeWifiFrontPageUI.d.mzl;
        paramm = new FreeWifiFrontPageUI.b();
        paramm.mzh = ((gj)localObject1);
        ((FreeWifiFrontPageUI)localObject2).a(paramString, paramm);
        AppMethodBeat.o(20624);
      }
      else
      {
        ab.i(this.muT, "backPageInfo is null");
        paramm = this.muU;
        paramString = FreeWifiFrontPageUI.d.mzk;
        localObject2 = new FreeWifiFrontPageUI.a();
        ((FreeWifiFrontPageUI.a)localObject2).myI = m.a(this.muj, k.b.mus, 21);
        paramm.a(paramString, localObject2);
        AppMethodBeat.o(20624);
        continue;
        if ((m.eh(paramInt1, paramInt2)) && (!m.isEmpty(paramString)))
        {
          localObject2 = this.muU;
          paramm = FreeWifiFrontPageUI.d.mzk;
          localObject1 = new FreeWifiFrontPageUI.a();
          ((FreeWifiFrontPageUI.a)localObject1).text = paramString;
          ((FreeWifiFrontPageUI.a)localObject1).myI = m.a(this.muj, k.b.mus, paramInt2);
          ((FreeWifiFrontPageUI)localObject2).a(paramm, localObject1);
          AppMethodBeat.o(20624);
        }
        else
        {
          paramString = this.muU;
          paramm = FreeWifiFrontPageUI.d.mzk;
          localObject2 = new FreeWifiFrontPageUI.a();
          ((FreeWifiFrontPageUI.a)localObject2).myI = m.a(this.muj, k.b.mus, paramInt2);
          paramString.a(paramm, localObject2);
          AppMethodBeat.o(20624);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.m.1
 * JD-Core Version:    0.6.2
 */