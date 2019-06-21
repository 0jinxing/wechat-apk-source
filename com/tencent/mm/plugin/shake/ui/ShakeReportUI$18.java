package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.shake.b.l;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class ShakeReportUI$18
  implements View.OnClickListener
{
  public long quz = 0L;

  ShakeReportUI$18(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24796);
    if (bo.isNullOrNil((String)ShakeReportUI.r(this.qwj).getTag()))
      AppMethodBeat.o(24796);
    while (true)
    {
      return;
      if (ShakeReportUI.N(this.qwj) == null)
      {
        AppMethodBeat.o(24796);
      }
      else
      {
        paramView = ShakeReportUI.N(this.qwj);
        Object localObject1 = paramView.field_username;
        if (11 == paramView.field_type)
        {
          if (System.currentTimeMillis() - this.quz > 3000L)
          {
            this.quz = System.currentTimeMillis();
            if ((paramView.field_reserved3 == null) || (paramView.field_reserved3.split(",").length != 3) || (paramView.field_reserved3.split(",")[0] == null) || (paramView.field_reserved3.split(",")[0].equals("")))
              break label263;
            localObject2 = paramView.field_reserved3.split(",");
            localObject1 = new se();
            ((se)localObject1).cOf.userName = localObject2[0];
            ((se)localObject1).cOf.cOh = bo.bc(localObject2[1], "");
            ((se)localObject1).cOf.cOi = bo.getInt(localObject2[2], 0);
            ((se)localObject1).cOf.scene = 1077;
            com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
          }
          while (true)
          {
            localObject1 = ShakeReportUI.E(this.qwj).qrS;
            if ((localObject1 != null) && ((localObject1 instanceof com.tencent.mm.plugin.shake.d.a.h)))
            {
              com.tencent.mm.plugin.shake.d.a.h.a(paramView);
              com.tencent.mm.plugin.shake.d.a.h.b(paramView);
            }
            AppMethodBeat.o(24796);
            break;
            label263: localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", paramView.getCity());
            ((Intent)localObject1).putExtra("scene", 27);
            ((Intent)localObject1).putExtra("stastic_scene", 5);
            com.tencent.mm.bp.d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          }
        }
        aw.ZK();
        Object localObject2 = c.XM().aoO((String)localObject1);
        if (com.tencent.mm.n.a.jh(((ap)localObject2).field_type))
        {
          paramView = new Intent();
          paramView.putExtra("Contact_User", (String)localObject1);
          paramView.putExtra("Sns_from_Scene", 22);
          if ((localObject1 != null) && (((String)localObject1).length() > 0))
          {
            if (((ad)localObject2).dsf())
            {
              com.tencent.mm.plugin.report.service.h.pYm.X(10298, (String)localObject1 + "," + ShakeReportUI.O(this.qwj));
              paramView.putExtra("Contact_Scene", ShakeReportUI.O(this.qwj));
            }
            com.tencent.mm.plugin.shake.a.gkE.c(paramView, this.qwj);
          }
          AppMethodBeat.o(24796);
        }
        else
        {
          if ((paramView.field_reserved1 & 0x8) > 0)
            com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramView.field_username + "," + ShakeReportUI.O(this.qwj));
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("Contact_User", paramView.field_username);
          ((Intent)localObject1).putExtra("Contact_Nick", paramView.field_nickname);
          ((Intent)localObject1).putExtra("Contact_Distance", paramView.field_distance);
          ((Intent)localObject1).putExtra("Contact_Signature", paramView.field_signature);
          ((Intent)localObject1).putExtra("Contact_Province", paramView.getProvince());
          ((Intent)localObject1).putExtra("Contact_City", paramView.getCity());
          ((Intent)localObject1).putExtra("Contact_Sex", paramView.field_sex);
          ((Intent)localObject1).putExtra("Contact_IsLBSFriend", true);
          ((Intent)localObject1).putExtra("Contact_VUser_Info", paramView.field_reserved3);
          ((Intent)localObject1).putExtra("Contact_VUser_Info_Flag", paramView.field_reserved1);
          ((Intent)localObject1).putExtra("Contact_KSnsIFlag", paramView.field_snsFlag);
          ((Intent)localObject1).putExtra("Contact_KSnsBgUrl", paramView.field_sns_bgurl);
          ((Intent)localObject1).putExtra("Contact_Scene", ShakeReportUI.O(this.qwj));
          ((Intent)localObject1).putExtra("Sns_from_Scene", 22);
          com.tencent.mm.plugin.shake.a.gkE.c((Intent)localObject1, this.qwj);
          AppMethodBeat.o(24796);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.18
 * JD-Core Version:    0.6.2
 */