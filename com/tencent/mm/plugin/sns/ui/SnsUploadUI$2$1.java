package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sa;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.tools.b.c.a;

final class SnsUploadUI$2$1
  implements c.a
{
  SnsUploadUI$2$1(SnsUploadUI.2 param2)
  {
  }

  public final void JW()
  {
  }

  public final void JX()
  {
    AppMethodBeat.i(39739);
    com.tencent.mm.ui.base.h.g(this.rCQ.rCO, 2131303848, 2131303849);
    AppMethodBeat.o(39739);
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(39738);
    int i = SnsUploadUI.o(this.rCQ.rCO).getSyncFlag();
    g.RQ();
    g.RP().Ry().set(68404, Integer.valueOf(i));
    SnsUploadUI.a(this.rCQ.rCO, SnsUploadUI.f(this.rCQ.rCO).getText().toString());
    i = SnsUploadUI.f(this.rCQ.rCO).getPasterLen();
    int j = SnsUploadUI.o(this.rCQ.rCO).getPrivated();
    int k = SnsUploadUI.o(this.rCQ.rCO).getSyncFlag();
    SnsUploadUI.p(this.rCQ.rCO);
    if (SnsUploadUI.q(this.rCQ.rCO))
      this.rCQ.rCO.setResult(-1, new Intent());
    if ((SnsUploadUI.d(this.rCQ.rCO) instanceof ag))
      ((ag)SnsUploadUI.d(this.rCQ.rCO)).rlV = SnsUploadUI.r(this.rCQ.rCO).getCurLocation();
    if ((SnsUploadUI.d(this.rCQ.rCO) instanceof ad))
      SnsUploadUI.f(this.rCQ.rCO).setText("");
    PInt localPInt = new PInt();
    SnsUploadUI.d(this.rCQ.rCO).a(j, k, SnsUploadUI.o(this.rCQ.rCO).getTwitterAccessToken(), SnsUploadUI.s(this.rCQ.rCO), SnsUploadUI.t(this.rCQ.rCO).getAtList(), SnsUploadUI.r(this.rCQ.rCO).getLocation(), i, SnsUploadUI.u(this.rCQ.rCO), SnsUploadUI.v(this.rCQ.rCO), localPInt, SnsUploadUI.w(this.rCQ.rCO), SnsUploadUI.x(this.rCQ.rCO), SnsUploadUI.y(this.rCQ.rCO));
    paramString = com.tencent.mm.plugin.report.service.h.pYm;
    long l1 = SnsUploadUI.z(this.rCQ.rCO);
    long l2 = bo.anT();
    if (SnsUploadUI.A(this.rCQ.rCO))
    {
      i = 0;
      paramString.e(13303, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(localPInt.value) });
      l1 = SnsUploadUI.z(this.rCQ.rCO);
      l2 = bo.anT();
      if (!SnsUploadUI.A(this.rCQ.rCO))
        break label707;
      i = 0;
      label469: ab.d("MicroMsg.SnsUploadUI", "reprot timelinePostAction(13303), %d, %d, %d, %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(localPInt.value) });
      com.tencent.mm.plugin.report.service.h.pYm.X(10910, "1");
      if (!bo.isNullOrNil(SnsUploadUI.B(this.rCQ.rCO)))
      {
        if (!SnsUploadUI.u(this.rCQ.rCO))
          break label712;
        com.tencent.mm.plugin.report.service.h.pYm.e(11455, new Object[] { "", SnsUploadUI.B(this.rCQ.rCO), Integer.valueOf(-1), Integer.valueOf(-1) });
      }
    }
    while (true)
    {
      if (SnsUploadUI.C(this.rCQ.rCO))
      {
        paramString = new Intent(this.rCQ.rCO, SnsTimeLineUI.class);
        paramString.putExtra("sns_resume_state", false);
        paramString.putExtra("sns_timeline_NeedFirstLoadint", true);
        paramString.addFlags(67108864);
        this.rCQ.rCO.startActivity(paramString);
      }
      l.aG(this.rCQ.rCO.getIntent());
      paramString = new sa();
      a.xxA.m(paramString);
      AppMethodBeat.o(39738);
      return;
      i = 1;
      break;
      label707: i = 1;
      break label469;
      label712: com.tencent.mm.plugin.report.service.h.pYm.e(11455, new Object[] { SnsUploadUI.B(this.rCQ.rCO), "", Integer.valueOf(-1), Integer.valueOf(-1) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.2.1
 * JD-Core Version:    0.6.2
 */