package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.List;

final class AppBrandProfileUI$22
  implements MMActivity.a
{
  AppBrandProfileUI$22(AppBrandProfileUI paramAppBrandProfileUI, u paramu, View paramView)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(133047);
    Object localObject1;
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1)
        break label451;
      if (paramIntent == null)
      {
        localObject1 = null;
        if ((localObject1 != null) && (((String)localObject1).length() != 0))
          break label59;
        ab.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "mmOnActivityResult fail, toUser is null");
        AppMethodBeat.o(133047);
      }
    }
    while (true)
    {
      return;
      localObject1 = paramIntent.getStringExtra("Select_Conv_User");
      break;
      label59: ab.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "result success toUser : %s ", new Object[] { localObject1 });
      String str1 = paramIntent.getStringExtra("custom_send_text");
      paramIntent = this.iIh.appId;
      Object localObject2 = com.tencent.mm.model.v.nW("wxapp_".concat(String.valueOf(paramIntent)));
      com.tencent.mm.model.v.Zp().y((String)localObject2, true).j("prePublishId", "wxapp_".concat(String.valueOf(paramIntent)));
      localObject2 = new j.b();
      ((j.b)localObject2).title = this.iIh.nickname;
      ((j.b)localObject2).type = 33;
      ((j.b)localObject2).fiP = AppBrandProfileUI.d(this.iIf);
      ((j.b)localObject2).fiQ = paramIntent;
      ((j.b)localObject2).fiR = 1;
      ((j.b)localObject2).cMm = "wxapp_".concat(String.valueOf(paramIntent));
      ((j.b)localObject2).thumburl = this.iIh.hix;
      ((j.b)localObject2).url = com.tencent.mm.plugin.appbrand.v.xh(paramIntent);
      ((j.b)localObject2).cMg = AppBrandProfileUI.d(this.iIf);
      ((j.b)localObject2).cMh = this.iIh.nickname;
      Iterator localIterator = bo.P(((String)localObject1).split(",")).iterator();
      if (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        ((com.tencent.mm.plugin.appbrand.compat.a.a)g.K(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a((j.b)localObject2, paramIntent, this.iIh.nickname, str2, null);
        if (!bo.isNullOrNil(str1))
        {
          localObject1 = new qb();
          ((qb)localObject1).cMq.cMr = str2;
          ((qb)localObject1).cMq.content = str1;
          ((qb)localObject1).cMq.type = t.nK(str2);
          ((qb)localObject1).cMq.flags = 0;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
        }
        if (str2.endsWith("@chatroom"));
        for (paramInt1 = 9; ; paramInt1 = 8)
        {
          AppBrandProfileUI.a(this.iIf, paramInt1, bo.anT());
          break;
        }
      }
      h.bQ(this.val$view.getContext(), this.val$view.getContext().getResources().getString(2131297050));
      AppMethodBeat.o(133047);
      continue;
      AppBrandProfileUI.a(this.iIf, 8, 2);
      label451: AppMethodBeat.o(133047);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.22
 * JD-Core Version:    0.6.2
 */