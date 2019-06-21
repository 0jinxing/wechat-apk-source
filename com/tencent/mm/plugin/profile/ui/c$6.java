package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class c$6
  implements a.a
{
  c$6(c paramc)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(23462);
    ad localad;
    if (paramBoolean1)
    {
      h.bQ(this.pmK.crP, this.pmK.crP.getString(2131298451));
      this.pmK.ehK.ce("contact_info_time_expired", true);
      localad = this.pmK.ehM;
      if ((localad == null) || (bo.isNullOrNil(paramString1)))
      {
        ab.e("MicroMsg.ContactWidgetBizInfo", "respUsername == " + paramString1 + ", contact = " + localad);
        this.pmK.pmC = true;
        if (this.pmK.pmI != null)
        {
          paramString1 = new of();
          this.pmK.pmI.fPZ = 4;
          paramString1.cKy.cKz = this.pmK.pmI;
          com.tencent.mm.sdk.b.a.xxA.m(paramString1);
        }
        paramString1 = z.aeR().qP(this.pmK.ehM.field_username);
        paramString1.field_status = 1;
        if ((!bo.isNullOrNil(paramString1.field_extInfo)) || (bo.isNullOrNil(paramString1.field_username)) || (this.pmK.pkW == null) || (!paramString1.field_username.equals(bo.nullAsNil(this.pmK.pkW.field_username))))
          break label674;
        z.aeR().e(this.pmK.pkW);
        label248: paramBoolean1 = this.pmK.crP.getIntent().getBooleanExtra("key_biz_profile_stay_after_follow_op", false);
        paramBoolean2 = this.pmK.crP.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false);
        if (!paramString1.adP())
          break label685;
        paramString1 = new Intent();
        paramString1.putExtra("enterprise_biz_name", this.pmK.ehM.field_username);
        paramString1.putExtra("enterprise_biz_display_name", s.mJ(this.pmK.ehM.field_username));
        paramString1.putExtra("enterprise_from_scene", 7);
        paramString1.addFlags(67108864);
        com.tencent.mm.bp.d.f(this.pmK.crP, ".ui.conversation.EnterpriseConversationUI", paramString1);
        label363: this.pmK.crP.finish();
        label373: this.pmK.aV(3, null);
      }
    }
    else
    {
      AppMethodBeat.o(23462);
      return;
    }
    if (t.mX(localad.field_username))
    {
      String str = bo.nullAsNil(localad.field_username);
      paramString2 = com.tencent.mm.aj.f.qX(str);
      if (paramString2 != null)
        paramString2.field_username = paramString1;
      z.aeR().delete(str);
      localad.iH(str);
    }
    while (true)
    {
      localad.setUsername(paramString1);
      if ((int)localad.ewQ == 0)
      {
        aw.ZK();
        com.tencent.mm.model.c.XM().aa(localad);
      }
      if ((int)localad.ewQ <= 0)
      {
        ab.e("MicroMsg.ContactWidgetBizInfo", "addContact : insert contact failed");
        break;
      }
      t.q(localad);
      aw.ZK();
      paramString1 = com.tencent.mm.model.c.XM().aoO(localad.field_username);
      if (paramString2 != null)
      {
        z.aeR().d(paramString2);
        break;
      }
      paramString2 = com.tencent.mm.aj.f.qX(paramString1.field_username);
      if ((paramString1.dsf()) && (com.tencent.mm.aj.a.adG()));
      for (int i = 1; ; i = 0)
      {
        if ((paramString2 != null) && ((!paramString2.adJ()) || (i != 0)))
          break label615;
        ab.d("MicroMsg.ContactWidgetBizInfo", "shouldUpdate");
        ao.a.flu.ai(paramString1.field_username, "");
        com.tencent.mm.ah.b.pY(paramString1.field_username);
        break;
      }
      label615: if ((!paramString1.dsi()) || (i != 0))
        break;
      ab.d("MicroMsg.ContactWidgetBizInfo", "update contact, last check time=%d", new Object[] { Integer.valueOf(paramString1.duj) });
      ao.a.flu.ai(paramString1.field_username, "");
      com.tencent.mm.ah.b.pY(paramString1.field_username);
      break;
      label674: z.aeR().e(paramString1);
      break label248;
      label685: paramString1 = new Intent();
      paramString1.putExtra("Chat_User", this.pmK.ehM.field_username);
      paramString1.putExtra("key_has_add_contact", true);
      paramString1.putExtra("finish_direct", true);
      if (paramBoolean2)
        paramString1.addFlags(268435456);
      com.tencent.mm.plugin.profile.b.gkE.d(paramString1, this.pmK.crP);
      if (paramBoolean1)
        break label363;
      if (!paramBoolean2)
        break label373;
      break label363;
      paramString2 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.6
 * JD-Core Version:    0.6.2
 */