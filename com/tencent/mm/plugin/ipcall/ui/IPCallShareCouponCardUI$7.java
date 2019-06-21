package com.tencent.mm.plugin.ipcall.ui;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class IPCallShareCouponCardUI$7
  implements q.a
{
  IPCallShareCouponCardUI$7(IPCallShareCouponCardUI paramIPCallShareCouponCardUI, String paramString)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(22289);
    if (paramBoolean)
    {
      Object localObject = new j.b();
      ((j.b)localObject).title = IPCallShareCouponCardUI.d(this.nFb);
      ((j.b)localObject).url = IPCallShareCouponCardUI.e(this.nFb);
      ((j.b)localObject).description = IPCallShareCouponCardUI.f(this.nFb);
      ((j.b)localObject).thumburl = IPCallShareCouponCardUI.g(this.nFb);
      ((j.b)localObject).type = 5;
      l.a((j.b)localObject, null, null, this.fwC, "", null, null);
      if (!bo.isNullOrNil(paramString))
      {
        localObject = new qb();
        ((qb)localObject).cMq.cMr = this.fwC;
        ((qb)localObject).cMq.content = paramString;
        ((qb)localObject).cMq.type = t.nK(this.fwC);
        ((qb)localObject).cMq.flags = 0;
        a.xxA.m((b)localObject);
      }
      h.bQ(this.nFb.mController.ylL, this.nFb.getResources().getString(2131297050));
      AppMethodBeat.o(22289);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(22289);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.7
 * JD-Core Version:    0.6.2
 */