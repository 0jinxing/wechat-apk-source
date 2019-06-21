package com.tencent.mm.plugin.sport.ui.a;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.ai.f, com.tencent.mm.pluginsdk.b.a
{
  Context context;
  private com.tencent.mm.ui.base.preference.f ehK;
  ad ehM;
  private com.tencent.mm.ui.base.p iGY;
  private CheckBoxPreference kRm;
  private CheckBoxPreference rQo;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(25148);
    if ("contact_info_record_data".equals(paramString))
    {
      paramString = new Intent(this.context, ExdeviceRankDataSourceUI.class);
      this.context.startActivity(paramString);
    }
    while (true)
    {
      AppMethodBeat.o(25148);
      while (true)
      {
        return false;
        if ("contact_info_top_sport".equals(paramString))
        {
          if (this.rQo.isChecked())
          {
            com.tencent.mm.plugin.sport.a.d.kT(20);
            t.w(this.ehM.field_username, true);
            break;
          }
          com.tencent.mm.plugin.sport.a.d.kT(21);
          t.x(this.ehM.field_username, true);
          break;
        }
        if ("contact_info_not_disturb".equals(paramString))
        {
          if (this.kRm.isChecked())
          {
            com.tencent.mm.plugin.sport.a.d.kT(22);
            t.o(this.ehM);
            break;
          }
          com.tencent.mm.plugin.sport.a.d.kT(23);
          t.p(this.ehM);
          break;
        }
        if ("contact_info_go_to_sport".equals(paramString))
        {
          paramString = new Intent();
          paramString.putExtra("Chat_User", this.ehM.field_username);
          paramString.putExtra("finish_direct", true);
          com.tencent.mm.bp.d.f(this.context, ".ui.chatting.ChattingUI", paramString);
          com.tencent.mm.plugin.sport.a.d.kT(19);
          break;
        }
        if (!"contact_info_go_to_my_profile".equals(paramString))
          break label279;
        paramString = r.Yz();
        if (!bo.isNullOrNil(paramString))
          break label244;
        ab.e("MicroMsg.Sport.ContactWidgetSport", "Get username from UserInfo return null or nil.");
        AppMethodBeat.o(25148);
      }
      label244: Object localObject = new Intent();
      ((Intent)localObject).putExtra("username", paramString);
      com.tencent.mm.bp.d.b(this.context, "exdevice", ".ui.ExdeviceProfileUI", (Intent)localObject);
      com.tencent.mm.plugin.sport.a.d.kT(3);
      continue;
      label279: if ("contact_info_invite_friend".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("Select_Talker_Name", this.ehM.field_username);
        paramString.putExtra("Select_block_List", this.ehM.field_username);
        paramString.putExtra("Select_Conv_Type", 3);
        paramString.putExtra("Select_Send_Card", true);
        paramString.putExtra("mutil_select_is_ret", true);
        com.tencent.mm.bp.d.b(this.context, ".ui.transmit.SelectConversationUI", paramString, 1);
        com.tencent.mm.plugin.sport.a.d.kT(4);
      }
      else if ("contact_info_common_problem".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("KPublisherId", "custom_menu");
        paramString.putExtra("pre_username", this.ehM.field_username);
        paramString.putExtra("prePublishId", "custom_menu");
        paramString.putExtra("preUsername", this.ehM.field_username);
        paramString.putExtra("preChatName", this.ehM.field_username);
        paramString.putExtra("preChatTYPE", u.ad(this.ehM.field_username, this.ehM.field_username));
        paramString.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");
        paramString.putExtra("geta8key_username", this.ehM.field_username);
        paramString.putExtra("from_scence", 1);
        com.tencent.mm.bp.d.b(this.context, "webview", ".ui.tools.WebViewUI", paramString);
        com.tencent.mm.plugin.sport.a.d.kT(5);
      }
      else if ("contact_info_privacy_and_notification".equals(paramString))
      {
        com.tencent.mm.bp.d.H(this.context, "exdevice", ".ui.ExdeviceSettingUI");
      }
      else if ("contact_info_sport_install".equals(paramString))
      {
        com.tencent.mm.plugin.sport.a.d.kT(13);
        paramString = this.context;
        this.context.getString(2131297061);
        this.iGY = com.tencent.mm.ui.base.h.b(paramString, this.context.getString(2131303213), true, null);
        this.iGY.show();
        aw.Rg().a(30, this);
        paramString = new LinkedList();
        paramString.add("gh_43f2581f6fd6");
        localObject = new LinkedList();
        ((LinkedList)localObject).add(Integer.valueOf(1));
        paramString = new com.tencent.mm.pluginsdk.model.m(1, paramString, (List)localObject, "", "");
        aw.Rg().a(paramString, 0);
        com.tencent.mm.plugin.sport.model.h.lp(true);
      }
      else if ("contact_info_sport_uninstall".equals(paramString))
      {
        com.tencent.mm.plugin.sport.a.d.kT(14);
        com.tencent.mm.ui.base.h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.2(this), null);
      }
      else if ("contact_info_clear_data".equals(paramString))
      {
        com.tencent.mm.ui.base.h.d(this.context, this.context.getString(2131298491), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.1(this), null);
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(25147);
    this.ehK = paramf;
    this.ehM = paramad;
    paramf.addPreferencesFromResource(2131165223);
    this.rQo = ((CheckBoxPreference)paramf.aqO("contact_info_top_sport"));
    this.kRm = ((CheckBoxPreference)paramf.aqO("contact_info_not_disturb"));
    biW();
    AppMethodBeat.o(25147);
    return true;
  }

  public final boolean biV()
  {
    return true;
  }

  final void biW()
  {
    AppMethodBeat.i(25150);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    localHelperHeaderPreference.ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298731));
    if (com.tencent.mm.n.a.jh(this.ehM.field_type))
    {
      localHelperHeaderPreference.sd(1);
      this.ehK.ce("contact_info_sport_install", true);
      this.ehK.ce("contact_info_sport_uninstall", false);
      this.ehK.ce("contact_info_go_to_sport", false);
      this.ehK.ce("contact_info_go_to_my_profile", false);
      this.ehK.ce("contact_info_invite_friend", false);
      this.ehK.ce("contact_info_common_problem", false);
      this.ehK.ce("contact_info_record_data", false);
      this.ehK.ce("contact_info_privacy_and_notification", false);
      this.ehK.ce("contact_info_top_sport", false);
      this.ehK.ce("contact_info_not_disturb", false);
      aw.ZK();
      if (c.XR().aph(this.ehM.field_username))
      {
        this.rQo.uOT = true;
        if (!this.ehM.DX())
          break label255;
        this.kRm.uOT = true;
        AppMethodBeat.o(25150);
      }
    }
    while (true)
    {
      return;
      this.rQo.uOT = false;
      break;
      label255: this.kRm.uOT = false;
      AppMethodBeat.o(25150);
      continue;
      localHelperHeaderPreference.sd(0);
      this.ehK.ce("contact_info_sport_install", false);
      this.ehK.ce("contact_info_sport_uninstall", true);
      this.ehK.ce("contact_info_go_to_sport", true);
      this.ehK.ce("contact_info_go_to_my_profile", true);
      this.ehK.ce("contact_info_invite_friend", true);
      this.ehK.ce("contact_info_common_problem", true);
      this.ehK.ce("contact_info_record_data", true);
      this.ehK.ce("contact_info_privacy_and_notification", true);
      this.ehK.ce("contact_info_top_sport", true);
      this.ehK.ce("contact_info_not_disturb", true);
      AppMethodBeat.o(25150);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(25149);
    if (paramInt2 == -1)
      switch (paramInt1)
      {
      default:
      case 1:
      }
    while (true)
    {
      AppMethodBeat.o(25149);
      return;
      if (paramIntent != null)
      {
        Object localObject = bo.P(paramIntent.getStringExtra("received_card_name").split(","));
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          g.bOk().q("gh_43f2581f6fd6", str, t.kH(str));
          if (!bo.isNullOrNil(paramIntent))
          {
            qb localqb = new qb();
            localqb.cMq.cMr = str;
            localqb.cMq.content = paramIntent;
            localqb.cMq.type = t.nK(str);
            localqb.cMq.flags = 0;
            com.tencent.mm.sdk.b.a.xxA.m(localqb);
          }
        }
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(25151);
    if ((paramm instanceof com.tencent.mm.pluginsdk.model.m))
    {
      aw.Rg().b(30, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.Sport.ContactWidgetSport", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
          Toast.makeText(ah.getContext(), paramString, 1).show();
        if (this.iGY != null)
          this.iGY.dismiss();
        biW();
      }
    }
    else
    {
      AppMethodBeat.o(25151);
      return;
    }
    Object localObject = ((com.tencent.mm.pluginsdk.model.m)paramm).dhl();
    ab.i("MicroMsg.Sport.ContactWidgetSport", "bind fitness contact %s success", new Object[] { localObject });
    aw.ZK();
    paramm = c.XM().aoO("gh_43f2581f6fd6");
    if ((paramm == null) || (bo.isNullOrNil((String)localObject)))
      ab.e("MicroMsg.Sport.ContactWidgetSport", "respUsername == " + (String)localObject + ", contact = " + paramm);
    while (true)
    {
      paramString = com.tencent.mm.aj.z.aeR().qP(paramm.field_username);
      com.tencent.mm.aj.z.aeR().e(paramString);
      aw.ZK();
      c.Ry().set(327825, Boolean.TRUE);
      com.tencent.mm.plugin.r.a.bVt();
      paramInt1 = com.tencent.mm.ax.b.fKF;
      com.tencent.mm.ax.d.b(paramInt1, com.tencent.mm.ax.b.fKB, "", null);
      ab.i("MicroMsg.NewTipsManager", "dancy register local newtips, tipsId:%s, tipsVersion:%s, key:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1), "" });
      break;
      paramString = null;
      if (t.mX(paramm.field_username))
      {
        String str = bo.nullAsNil(paramm.field_username);
        paramString = com.tencent.mm.aj.f.qX(str);
        if (paramString != null)
          paramString.field_username = ((String)localObject);
        com.tencent.mm.aj.z.aeR().delete(str);
        paramm.iH(str);
      }
      paramm.setUsername((String)localObject);
      if ((int)paramm.ewQ == 0)
      {
        aw.ZK();
        c.XM().aa(paramm);
      }
      if ((int)paramm.ewQ <= 0)
      {
        ab.e("MicroMsg.Sport.ContactWidgetSport", "addContact : insert contact failed");
      }
      else
      {
        t.q(paramm);
        aw.ZK();
        localObject = c.XM().aoO(paramm.field_username);
        if (paramString != null)
        {
          com.tencent.mm.aj.z.aeR().d(paramString);
        }
        else
        {
          paramString = com.tencent.mm.aj.f.qX(((ap)localObject).field_username);
          if ((paramString == null) || (paramString.adJ()))
          {
            ab.d("MicroMsg.Sport.ContactWidgetSport", "shouldUpdate");
            ao.a.flu.ai(((ap)localObject).field_username, "");
            com.tencent.mm.ah.b.pY(((ap)localObject).field_username);
          }
          else if (((ad)localObject).dsi())
          {
            ab.d("MicroMsg.Sport.ContactWidgetSport", "update contact, last check time=%d", new Object[] { Integer.valueOf(((ap)localObject).duj) });
            ao.a.flu.ai(((ap)localObject).field_username, "");
            com.tencent.mm.ah.b.pY(((ap)localObject).field_username);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.ui.a.a
 * JD-Core Version:    0.6.2
 */