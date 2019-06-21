package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.dg;
import com.tencent.mm.g.a.dg.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.base.model.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bbo;
import com.tencent.mm.protocal.protobuf.bxk;
import com.tencent.mm.protocal.protobuf.byj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoSettingUI extends MMPreference
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private ad ehM;
  private SharedPreferences ehZ = null;
  private boolean eif;
  private d.b fuY;
  private bxk fwz;
  private int gwP;
  private boolean isDeleteCancel = false;
  private com.tencent.mm.aj.d pkW;
  com.tencent.mm.ui.widget.a.c pmG = null;
  private p tipDialog = null;

  private static boolean Bd(int paramInt)
  {
    if ((paramInt == 81) || (paramInt == 92) || (paramInt == 93) || (paramInt == 94));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void a(com.tencent.mm.aj.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(23925);
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo");
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.ehK.aqO("contact_info_locate");
    bbo localbbo = new bbo();
    localbbo.gvb = paramd.field_brandFlag;
    localbbo.jBB = this.ehM.field_username;
    if (Bd(this.gwP))
    {
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new j.a(58, localbbo));
    }
    while (true)
    {
      z.aeR().c(paramd, new String[0]);
      localCheckBoxPreference1.uOT = paramd.adH();
      if (localCheckBoxPreference2 != null)
        localCheckBoxPreference2.uOT = paramd.adI();
      if (paramBoolean)
      {
        initView();
        this.ehK.notifyDataSetChanged();
      }
      AppMethodBeat.o(23925);
      return;
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new j.a(47, localbbo));
    }
  }

  private void caU()
  {
    AppMethodBeat.i(23923);
    if ((this.ehM != null) && (com.tencent.mm.n.a.jh(this.ehM.field_type)) && (!t.nl(this.ehM.field_username)) && (!t.nQ(this.ehM.field_username)))
      if ((this.pkW != null) && (this.pkW.adM()))
        this.ehK.ce("contact_is_mute", false);
    while (true)
    {
      this.ehK.ce("contact_info_verifyuser_weibo", true);
      this.ehK.ce("contact_info_subscribe_bizinfo", true);
      this.ehK.ce("contact_info_template_recv", true);
      this.ehK.ce("contact_info_locate", true);
      AppMethodBeat.o(23923);
      return;
      this.ehK.ce("contact_is_mute", true);
      continue;
      this.ehK.ce("contact_is_mute", true);
      if ((this.ehM != null) && (!com.tencent.mm.n.a.jh(this.ehM.field_type)) && (Bd(this.gwP)))
        this.ehK.ce("contact_info_expose_btn", false);
      else
        this.ehK.ce("contact_info_expose_btn", true);
    }
  }

  private boolean caW()
  {
    AppMethodBeat.i(23924);
    boolean bool;
    if (getIntent() == null)
    {
      bool = false;
      AppMethodBeat.o(23924);
    }
    while (true)
    {
      return bool;
      String str1 = getIntent().getStringExtra("device_id");
      String str2 = getIntent().getStringExtra("device_type");
      dg localdg = new dg();
      localdg.cwu.ceI = str1;
      localdg.cwu.cws = str2;
      com.tencent.mm.sdk.b.a.xxA.m(localdg);
      bool = localdg.cwv.cww;
      AppMethodBeat.o(23924);
    }
  }

  private void jO(boolean paramBoolean)
  {
    AppMethodBeat.i(23926);
    CheckBoxPreference localCheckBoxPreference;
    if (this.ehM != null)
    {
      if (this.ehZ == null)
        this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
      localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("contact_is_mute");
      if ((!paramBoolean) || (this.pkW == null) || (!this.pkW.adM()))
        break label145;
      setTitleMuteIconVisibility(0);
      if (localCheckBoxPreference != null)
        this.ehZ.edit().putBoolean("contact_is_mute", true).commit();
    }
    while (true)
    {
      if (localCheckBoxPreference != null)
      {
        localCheckBoxPreference.uOT = paramBoolean;
        this.ehK.notifyDataSetChanged();
      }
      AppMethodBeat.o(23926);
      return;
      label145: setTitleMuteIconVisibility(8);
      if (localCheckBoxPreference != null)
        this.ehZ.edit().putBoolean("contact_is_mute", false).commit();
    }
  }

  private void jT(boolean paramBoolean)
  {
    AppMethodBeat.i(23928);
    if (this.ehM == null)
    {
      AppMethodBeat.o(23928);
      return;
    }
    byj localbyj;
    label57: String str;
    if ((this.pkW != null) && (this.pkW.adM()))
    {
      localbyj = new byj();
      if (!this.ehM.DX())
        break label113;
      i = 1;
      localbyj.wXG = i;
      localbyj.Scene = getIntent().getIntExtra("key_start_biz_profile_setting_from_scene", 0);
      z.afc();
      str = this.ehM.field_username;
      if (!paramBoolean)
        break label118;
    }
    label113: label118: for (int i = 15; ; i = 16)
    {
      k.a(str, localbyj, i);
      AppMethodBeat.o(23928);
      break;
      i = 0;
      break label57;
    }
  }

  public final int JC()
  {
    return 2131165254;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(23927);
    paramPreference = paramPreference.mKey;
    ab.i("MicroMsg.mmui.MMPreference", paramPreference + " item has been clicked!");
    Object localObject;
    boolean bool2;
    if ("contact_info_locate".endsWith(paramPreference))
    {
      localObject = this.pkW;
      if (localObject == null)
      {
        AppMethodBeat.o(23927);
        bool2 = bool1;
        return bool2;
      }
      if (((com.tencent.mm.aj.d)localObject).adI())
      {
        ((com.tencent.mm.aj.d)localObject).field_brandFlag &= -5;
        label92: a((com.tencent.mm.aj.d)localObject, false);
        if (!((CheckBoxPreference)paramf.aqO("contact_info_locate")).isChecked())
          break label635;
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 905);
      }
    }
    else
    {
      label129: if ("contact_info_expose_btn".equals(paramPreference))
      {
        if ((this.ehM != null) && (!bo.isNullOrNil(this.ehM.field_username)))
          break label651;
        label158: com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 908);
      }
      if ("contact_info_add_shortcut_btn".equals(paramPreference))
      {
        ab.d("MicroMsg.mmui.MMPreference", "dealAddShortcut, username = " + this.ehM.field_username);
        b.aa(this, this.ehM.field_username);
        al.n(new NewBizInfoSettingUI.7(this), 1000L);
      }
      if ("contact_info_clear_msg".equals(paramPreference))
      {
        if ((this.pkW != null) && (this.pkW.adM()))
        {
          this.fwz = new bxk();
          this.fwz.wXv = 0;
          localObject = ((j)g.K(j.class)).XR().aoZ(this.ehM.field_username);
          if (localObject != null)
            this.fwz.wXt = ((at)localObject).field_unReadCount;
          localObject = ((j)g.K(j.class)).bOr().Rb(this.ehM.field_username);
          if (localObject != null)
          {
            this.fwz.wXu = ((bi)localObject).getType();
            if (this.fwz.wXt > 0)
              this.fwz.wXs = ((int)(System.currentTimeMillis() - ((cy)localObject).field_createTime) / 1000);
          }
        }
        com.tencent.mm.ui.base.h.d(this, getString(2131298459), "", getString(2131298458), getString(2131296868), new NewBizInfoSettingUI.4(this), null);
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 909);
      }
      if ("contact_is_mute".endsWith(paramPreference))
      {
        if (this.eif)
          break label714;
        bool2 = true;
        label473: this.eif = bool2;
        if (!this.eif)
          break label720;
        t.o(this.ehM);
      }
    }
    while (true)
    {
      jO(this.eif);
      if ("contact_info_template_recv".equals(paramPreference))
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("enterprise_biz_name", this.pkW.field_username);
        com.tencent.mm.bp.d.b(this, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", (Intent)localObject);
      }
      if (!"contact_info_subscribe_bizinfo".endsWith(paramPreference))
        break label898;
      paramPreference = this.pkW;
      if (paramPreference != null)
        break label730;
      AppMethodBeat.o(23927);
      bool2 = bool1;
      break;
      this.pmG = com.tencent.mm.ui.base.h.a(this, getString(2131298076, new Object[] { this.ehM.Oj() }), getString(2131297061), new NewBizInfoSettingUI.2(this, (com.tencent.mm.aj.d)localObject), new NewBizInfoSettingUI.3(this, (com.tencent.mm.aj.d)localObject));
      break label92;
      label635: com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 907);
      break label129;
      label651: localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", new Object[] { this.ehM.field_username }));
      ((Intent)localObject).putExtra("showShare", false);
      com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
      break label158;
      label714: bool2 = false;
      break label473;
      label720: t.p(this.ehM);
    }
    label730: int i;
    if (paramPreference.adH())
    {
      paramPreference.field_brandFlag |= 1;
      if ((this.fuY == null) && (paramPreference != null))
        this.fuY = paramPreference.cJ(false);
      if ((this.fuY != null) && (this.fuY.aeb()) && (com.tencent.mm.bp.d.afj("brandservice")))
      {
        paramf.ce("contact_info_template_recv", false);
        label802: com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
        localObject = paramPreference.field_username;
        if (!paramPreference.adH())
          break label945;
        i = 3;
        label823: localh.e(13307, new Object[] { localObject, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0) });
        a(paramPreference, false);
        if (!((CheckBoxPreference)paramf.aqO("contact_info_subscribe_bizinfo")).isChecked())
          break label951;
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 901);
      }
    }
    while (true)
    {
      label898: AppMethodBeat.o(23927);
      bool2 = false;
      break;
      paramf.ce("contact_info_template_recv", true);
      break label802;
      paramPreference.field_brandFlag &= -2;
      paramf.ce("contact_info_template_recv", true);
      break label802;
      label945: i = 4;
      break label823;
      label951: com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 902);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(23922);
    if (this.pkW != null)
      this.fuY = this.pkW.cJ(false);
    CheckBoxPreference localCheckBoxPreference;
    if (this.pkW != null)
      if (this.pkW.adM())
      {
        this.ehK.ce("contact_is_mute", false);
        this.eif = this.ehM.DX();
        jO(this.eif);
        ab.d("MicroMsg.mmui.MMPreference", "KIsardDevice(%b)", new Object[] { Boolean.valueOf(getIntent().getBooleanExtra("KIsHardDevice", false)) });
        if ((getIntent() == null) || (!getIntent().getBooleanExtra("KIsHardDevice", false)))
          break label593;
        ab.d("MicroMsg.mmui.MMPreference", "Hard device biz...");
        boolean bool = caW();
        ab.d("MicroMsg.mmui.MMPreference", "contact.isContact()(%b), isHardDeviceBound(%b)", new Object[] { Boolean.valueOf(com.tencent.mm.n.a.jh(this.ehM.field_type)), Boolean.valueOf(bool) });
        if ((!com.tencent.mm.n.a.jh(this.ehM.field_type)) || (!bool))
          break label486;
        if (this.pkW == null)
          break label441;
        ((CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo")).uOT = this.pkW.adH();
        localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("contact_info_locate");
        if (!this.pkW.cJ(false).adL())
          break label373;
        localCheckBoxPreference.uOT = this.pkW.adI();
        label262: if (!this.pkW.adH())
          break label420;
        if ((this.fuY == null) && (this.pkW != null))
          this.fuY = this.pkW.cJ(false);
        if ((this.fuY == null) || (!this.fuY.aeb()) || (!com.tencent.mm.bp.d.afj("brandservice")))
          break label399;
        this.ehK.ce("contact_info_template_recv", false);
        AppMethodBeat.o(23922);
      }
    while (true)
    {
      return;
      this.ehK.ce("contact_is_mute", true);
      break;
      this.ehK.ce("contact_is_mute", true);
      break;
      label373: this.ehK.ce("contact_info_locate", true);
      localCheckBoxPreference.uOT = this.pkW.adI();
      break label262;
      label399: this.ehK.ce("contact_info_template_recv", true);
      AppMethodBeat.o(23922);
      continue;
      label420: this.ehK.ce("contact_info_template_recv", true);
      AppMethodBeat.o(23922);
      continue;
      label441: this.ehK.ce("contact_info_subscribe_bizinfo", true);
      this.ehK.ce("contact_info_locate", true);
      this.ehK.ce("contact_info_template_recv", true);
      AppMethodBeat.o(23922);
      continue;
      label486: ab.w("MicroMsg.mmui.MMPreference", "%s is not my hard biz contact", new Object[] { this.ehM.field_username });
      caU();
      label790: if (Bd(this.gwP))
      {
        if (this.pkW == null)
        {
          ab.e("MicroMsg.mmui.MMPreference", "bizinfo is null in temp session");
          AppMethodBeat.o(23922);
        }
        else
        {
          ((CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo")).uOT = this.pkW.adH();
          this.ehK.ce("contact_info_subscribe_bizinfo", false);
        }
      }
      else
      {
        AppMethodBeat.o(23922);
        continue;
        label593: if (com.tencent.mm.n.a.jh(this.ehM.field_type))
        {
          if (this.pkW != null)
          {
            ((CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo")).uOT = this.pkW.adH();
            if (this.pkW.adH())
            {
              if ((this.fuY == null) && (this.pkW != null))
                this.fuY = this.pkW.cJ(false);
              if ((this.fuY != null) && (this.fuY.aeb()) && (com.tencent.mm.bp.d.afj("brandservice")))
                this.ehK.ce("contact_info_template_recv", false);
            }
            while (true)
            {
              localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("contact_info_locate");
              if (!this.pkW.cJ(false).adL())
                break label790;
              localCheckBoxPreference.uOT = this.pkW.adI();
              AppMethodBeat.o(23922);
              break;
              this.ehK.ce("contact_info_template_recv", true);
              continue;
              this.ehK.ce("contact_info_template_recv", true);
            }
            this.ehK.ce("contact_info_locate", true);
            localCheckBoxPreference.uOT = this.pkW.adI();
            AppMethodBeat.o(23922);
          }
        }
        else
        {
          ab.w("MicroMsg.mmui.MMPreference", "%s is not my contact", new Object[] { this.ehM.field_username });
          caU();
          if (Bd(this.gwP))
          {
            if (this.pkW == null)
            {
              ab.e("MicroMsg.mmui.MMPreference", "bizinfo is null in temp session");
              AppMethodBeat.o(23922);
            }
            else
            {
              ((CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo")).uOT = this.pkW.adH();
              this.ehK.ce("contact_info_subscribe_bizinfo", false);
            }
          }
          else
            AppMethodBeat.o(23922);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(23920);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    xE(a.ppL);
    setMMTitle(2131298484);
    ta(-16777216);
    dyb();
    pO(false);
    setBackBtn(new NewBizInfoSettingUI.1(this), 2131230737);
    paramBundle = bo.nullAsNil(getIntent().getStringExtra("Contact_User"));
    aw.ZK();
    this.ehM = com.tencent.mm.model.c.XM().aoO(paramBundle);
    this.pkW = com.tencent.mm.aj.f.qX(paramBundle);
    if (this.ehM != null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      if (this.pkW != null)
        bool1 = true;
      ab.i("MicroMsg.mmui.MMPreference", "user:%s contact:%b, bizInfo:%b", new Object[] { paramBundle, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      this.gwP = getIntent().getIntExtra("Contact_Scene", 9);
      initView();
      jT(true);
      AppMethodBeat.o(23920);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(23921);
    super.onDestroy();
    jT(false);
    AppMethodBeat.o(23921);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI
 * JD-Core Version:    0.6.2
 */