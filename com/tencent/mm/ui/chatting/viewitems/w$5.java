package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class w$5
  implements View.OnClickListener
{
  w$5(w paramw, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33131);
    paramView = (ay)paramView.getTag();
    ab.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) button1 click", new Object[] { this.zfe });
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.cst = (paramView.cKd.field_msgSvrId + ":" + paramView.userName + ":" + w.b(this.zeW).getTalkerUserName() + ":" + this.hWj);
    if (((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(paramView.userName))
    {
      localAppBrandStatObject.scene = w.arF(this.hWj);
      ((e)g.K(e.class)).a(w.b(this.zeW).yTx.getContext(), this.zfe, null, this.zff, this.zfg, this.zfh, localAppBrandStatObject);
      w.M(9, w.c(this.zeW), w.d(this.zeW));
      h.pYm.e(11608, new Object[] { w.d(this.zeW), this.uHr, Integer.valueOf(2) });
      AppMethodBeat.o(33131);
      return;
    }
    localAppBrandStatObject.scene = 1043;
    paramView = f.qX(paramView.userName);
    e locale = (e)g.K(e.class);
    Activity localActivity = w.b(this.zeW).yTx.getContext();
    String str1 = this.zfe;
    int i = this.zff;
    int j = this.zfg;
    String str2 = this.zfh;
    if (paramView == null);
    for (paramView = null; ; paramView = paramView.field_appId)
    {
      locale.a(localActivity, str1, null, i, j, str2, localAppBrandStatObject, paramView);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.5
 * JD-Core Version:    0.6.2
 */