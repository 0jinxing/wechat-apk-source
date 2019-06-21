package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.at;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.TextPreference;
import com.tencent.mm.ui.base.t;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;

@com.tencent.mm.sdk.platformtools.h(doa={ContactInfoUI.class})
public final class k
  implements com.tencent.mm.ai.f, h.a, com.tencent.mm.pluginsdk.b.a
{
  MMActivity crP;
  String ctQ;
  private int czs;
  private com.tencent.mm.ui.base.preference.f ehK;
  ad ehM;
  u eih;
  String ejD;
  int gwP;
  private String mGZ;
  private boolean pli;
  private boolean plj;
  private int pmV;
  private String pma;
  private ccl pnb;
  private boolean pnc;
  private String pnd;
  private int pne;
  private boolean pnf;
  private boolean png;
  private String pnh;
  private boolean pni;
  private String pnj;
  private String pnk;
  private int pnl;
  String pnm;
  com.tencent.mm.sdk.b.c<at> pnn;

  private void Bf(int paramInt)
  {
    AppMethodBeat.i(23584);
    KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.ehK.aqO("contact_info_source");
    if (!this.plj)
    {
      if (localKeyValuePreference != null)
        if (paramInt == 10)
        {
          localKeyValuePreference.yCj = false;
          localKeyValuePreference.setTitle(this.crP.getString(2131298730));
          localKeyValuePreference.setSummary(this.crP.getString(2131299902));
          localKeyValuePreference.qi(false);
          AppMethodBeat.o(23584);
        }
      while (true)
      {
        return;
        this.ehK.d(localKeyValuePreference);
        AppMethodBeat.o(23584);
      }
    }
    switch (paramInt)
    {
    default:
      this.ehK.d(localKeyValuePreference);
    case 1:
    case 3:
    case 17:
    case 8:
    case 14:
      label259: 
      do
      {
        do
        {
          do
          {
            do
            {
              AppMethodBeat.o(23584);
              break;
            }
            while (localKeyValuePreference == null);
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(2131298718);
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23584);
            break;
          }
          while (localKeyValuePreference == null);
          localKeyValuePreference.yCj = false;
          localKeyValuePreference.setTitle(this.crP.getString(2131298730));
          localKeyValuePreference.setSummary(2131298721);
          localKeyValuePreference.qi(false);
          AppMethodBeat.o(23584);
          break;
        }
        while (localKeyValuePreference == null);
        localKeyValuePreference.yCj = false;
        localKeyValuePreference.setTitle(this.crP.getString(2131298730));
        localObject1 = s.mJ(this.crP.getIntent().getStringExtra("source_from_user_name"));
        localObject2 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
          localObject2 = this.crP.getIntent().getStringExtra("source_from_nick_name");
        if (bo.isNullOrNil((String)localObject2))
          localKeyValuePreference.setSummary(2131298698);
        while (true)
        {
          localKeyValuePreference.qi(false);
          AppMethodBeat.o(23584);
          break;
          localKeyValuePreference.setSummary(j.b(this.crP, this.crP.getString(2131298697, new Object[] { localObject2 })));
        }
      }
      while (localKeyValuePreference == null);
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localObject2 = com.tencent.mm.bi.d.akO().apw(this.ehM.field_username);
      aw.ZK();
      Object localObject1 = com.tencent.mm.model.c.XM();
      if (localObject2 == null)
      {
        localObject2 = "";
        label528: localObject2 = ((bd)localObject1).aoO((String)localObject2);
        if (localObject2 == null)
          break label970;
      }
      break;
    case 4:
    case 12:
    case 10:
    case 13:
    case 25:
    case 30:
    case 58:
    case 59:
    case 60:
    case 48:
    case 15:
    case 18:
    }
    label970: for (Object localObject2 = ((com.tencent.mm.g.c.ap)localObject2).field_nickname; ; localObject2 = null)
    {
      if (!bo.isNullOrNil((String)localObject2))
        localKeyValuePreference.setSummary(this.crP.getString(2131298704, new Object[] { localObject2 }));
      while (true)
      {
        localKeyValuePreference.qi(false);
        AppMethodBeat.o(23584);
        break;
        localObject2 = ((ax)localObject2).field_chatroomName;
        break label528;
        localKeyValuePreference.setSummary(2131298702);
      }
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(this.crP.getString(2131299903));
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(2131298727);
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(2131298693);
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(2131298711);
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(this.crP.getString(2131300369));
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(this.crP.getString(2131298713));
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(2131298715);
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
      if (localKeyValuePreference == null)
        break label259;
      localKeyValuePreference.yCj = false;
      localKeyValuePreference.setTitle(this.crP.getString(2131298730));
      localKeyValuePreference.setSummary(2131298706);
      localKeyValuePreference.qi(false);
      AppMethodBeat.o(23584);
      break;
    }
  }

  private void caT()
  {
    AppMethodBeat.i(23579);
    biV();
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165214);
    if (com.tencent.mm.plugin.sns.b.n.qFC != null)
      com.tencent.mm.plugin.sns.b.n.qFC.a(3, this.ehM.field_username, this);
    aw.Rg().a(30, this);
    aw.Rg().a(453, this);
    this.pnm = "";
    ab.i("MicroMsg.ContactWidgetNormal", "isCancelMatchPhoneMD5 %s", new Object[] { this.ehM.Of() });
    if (!this.ehM.Of())
    {
      localObject1 = null;
      localObject2 = this.crP.getIntent().getStringExtra("Contact_Mobile_MD5");
      localObject3 = this.crP.getIntent().getStringExtra("Contact_full_Mobile_MD5");
      if ((!bo.isNullOrNil((String)localObject2)) || (!bo.isNullOrNil((String)localObject3)))
        break label709;
      if (!bo.isNullOrNil(this.ehM.field_username))
      {
        localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.ehM.field_username);
        localObject3 = this.ehM.field_username;
        if (localObject2 != null)
          break label702;
        localObject1 = "true";
        ab.i("MicroMsg.ContactWidgetNormal", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject3, localObject1 });
        localObject1 = localObject2;
      }
      label232: if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject1).Aq())))
      {
        this.pnm = bo.nullAsNil(((com.tencent.mm.plugin.account.friend.a.a)localObject1).apG()).replace(" ", "");
        ab.i("MicroMsg.ContactWidgetNormal", "Contact name: %s mMobileByMD5: %s", new Object[] { this.ehM.field_username, this.pnm });
      }
    }
    Object localObject2 = (NormalUserHeaderPreference)this.ehK.aqO("contact_info_header_normal");
    label401: int i;
    if (localObject2 != null)
    {
      ((NormalUserHeaderPreference)localObject2).a(this.ehM, this.gwP, this.mGZ, this.pnm, this.ehM.dur);
      ((NormalUserHeaderPreference)localObject2).bW(this.ehM.field_username, this.pnf);
      ((NormalUserHeaderPreference)localObject2).vri = new k.1(this);
      if (com.tencent.mm.n.a.jh(this.ehM.field_type))
        this.png = false;
      ((NormalUserHeaderPreference)localObject2).bX(this.ehM.field_username, this.png);
      if ((!ad.aox(this.ehM.field_username)) || (this.ehM.duv == 0))
        break label1130;
      i = this.ehK.indexOf("contact_info_category_1");
      localObject1 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).c(this.ehM.field_openImAppid, "openim_custom_info_header", b.a.geR);
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject3 = new PreferenceTitleCategory(this.crP);
        ((Preference)localObject3).setTitle((CharSequence)localObject1);
        this.ehK.a((Preference)localObject3, i);
        ((Preference)localObject3).yCX = new k.4(this);
      }
      localObject1 = new com.tencent.mm.openim.a.c();
      ((com.tencent.mm.openim.a.c)localObject1).vj(this.ehM.duw);
      Iterator localIterator = ((com.tencent.mm.openim.a.c)localObject1).geU.iterator();
      label545: if (localIterator.hasNext())
      {
        localObject3 = (c.a)localIterator.next();
        localObject1 = ((c.a)localObject3).geV.iterator();
        j = i;
      }
    }
    else
    {
      while (true)
      {
        i = j;
        if (!((Iterator)localObject1).hasNext())
          break label545;
        localObject4 = (c.b)((Iterator)localObject1).next();
        i = j + 1;
        k.5 local5 = new k.5(this, this.crP, (c.b)localObject4);
        local5.ylA = ((c.a)localObject3).title;
        local5.setSummary(j.b(this.crP, ((c.b)localObject4).vk(this.ehM.field_openImAppid)));
        this.ehK.a(local5, i);
        if ((((c.b)localObject4).action == 0) || (((c.b)localObject4).action == 1))
        {
          local5.setEnabled(true);
          j = i;
          continue;
          label702: localObject1 = "false";
          break;
          label709: if ((bo.isNullOrNil((String)localObject2)) && (bo.isNullOrNil((String)localObject3)))
            break label232;
          ab.i("MicroMsg.ContactWidgetNormal", "Contact name: %s mMobileByMD5: %s mobileFullMD5:%s", new Object[] { this.ehM.field_username, localObject2, localObject3 });
          localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject2);
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            if (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject2).Aq()));
          }
          else
          {
            localObject1 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject3);
          }
          localObject3 = this.ehM.field_username;
          if (localObject1 == null);
          for (localObject2 = "true"; ; localObject2 = "false")
          {
            ab.i("MicroMsg.ContactWidgetNormal", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject3, localObject2 });
            break;
          }
          this.ehK.d((Preference)localObject2);
          break label401;
        }
        if (((c.b)localObject4).action == 2)
        {
          local5.yCX = new k.6(this, (c.b)localObject4, (c.a)localObject3);
          j = i;
        }
        else if (((c.b)localObject4).action == 3)
        {
          local5.yCX = new k.7(this, (c.b)localObject4, (c.a)localObject3);
          j = i;
        }
        else if (((c.b)localObject4).action == 4)
        {
          local5.yCX = new k.8(this, (c.b)localObject4, (c.a)localObject3);
          j = i;
        }
        else
        {
          j = i;
          if (((c.b)localObject4).action == 5)
          {
            local5.yCX = new k.9(this, (c.b)localObject4, (c.a)localObject3);
            j = i;
          }
        }
      }
    }
    int j = i + 1;
    this.ehK.a(new PreferenceSmallCategory(this.crP), j);
    Object localObject1 = new KeyValuePreference(this.crP);
    ((KeyValuePreference)localObject1).setTitle(2131298509);
    Object localObject3 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).c(this.ehM.field_openImAppid, "openim_intro_desc", b.a.geR);
    ((KeyValuePreference)localObject1).setSummary(j.b(this.crP, (CharSequence)localObject3));
    Object localObject4 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).c(this.ehM.field_openImAppid, "openim_intro_url", b.a.geS);
    if (!TextUtils.isEmpty((CharSequence)localObject4))
      ((Preference)localObject1).yCX = new k.10(this, (String)localObject4, (String)localObject3);
    this.ehK.a((Preference)localObject1, j + 1);
    label1130: if (!bo.isNullOrNil(this.ehM.getProvince()))
    {
      localObject4 = (KeyValuePreference)this.ehK.aqO("contact_info_district");
      if (localObject4 != null)
      {
        ((KeyValuePreference)localObject4).setTitle(this.crP.getString(2131298507));
        localObject3 = new StringBuilder().append(s.mL(this.ehM.getProvince()));
        if (bo.isNullOrNil(this.ehM.getCity()))
        {
          localObject1 = "";
          ((KeyValuePreference)localObject4).setSummary((String)localObject1);
          ((KeyValuePreference)localObject4).qi(false);
          ((KeyValuePreference)localObject4).setEnabled(false);
        }
      }
      else
      {
        if ((this.ehM.signature == null) || (this.ehM.signature.trim().equals("")) || (com.tencent.mm.n.a.jh(this.ehM.field_type)))
          break label1849;
        localObject1 = (KeyValuePreference)this.ehK.aqO("contact_info_signature");
        if (localObject1 != null)
        {
          ((KeyValuePreference)localObject1).yCj = false;
          ((KeyValuePreference)localObject1).setTitle(this.crP.getString(2131298678));
          ((KeyValuePreference)localObject1).setSummary(j.b(this.crP, this.ehM.signature));
          ((KeyValuePreference)localObject1).qi(false);
        }
        this.ehK.aqO("contact_info_facebook");
        this.ehK.aqP("contact_info_facebook");
        if ((this.pnb.guY & 0x1) <= 0)
          break label1865;
        j = 1;
        label1386: if (((j & com.tencent.mm.bp.d.afj("sns")) == 0) || (ad.aov(this.ehM.field_username)) || (this.ehM.Oa()))
          break label1871;
        localObject1 = (com.tencent.mm.ui.base.preference.g)this.ehK.aqO("contact_info_sns");
        if ((localObject1 != null) && (com.tencent.mm.plugin.sns.b.n.qFy != null))
          ((com.tencent.mm.ui.base.preference.g)localObject1).ajO(this.ehM.field_username);
        this.ehK.aqP("contact_info_verifyuser");
        this.ehK.aqP("contact_info_footer_normal");
        new com.tencent.mm.plugin.profile.a.b(this.crP, this.ehM).bKH();
        if (this.gwP == 96)
          this.ehK.aqP("contact_info_footer_normal");
        if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
          break label1887;
        cbf();
        this.ehK.aqP("contact_info_social");
        cbd();
        cbe();
        localObject1 = (NormalUserFooterPreference)this.ehK.aqO("contact_info_footer_normal");
        boolean bool1 = this.crP.getIntent().getBooleanExtra("User_From_Fmessage", false);
        boolean bool2 = this.crP.getIntent().getBooleanExtra("Contact_FMessageCard", false);
        this.crP.getIntent().getBooleanExtra("Contact_KHideExpose", false);
        long l = this.crP.getIntent().getLongExtra("Contact_Uin", -1L);
        if ((this.gwP == 30) || (this.gwP == 45))
          this.pnc = false;
        if ((localObject1 == null) || (!((NormalUserFooterPreference)localObject1).a(this.ehM, this.mGZ, this.pli, this.plj, this.pnc, this.gwP, this.pmV, bool2, bool1, l, this.pnd)))
          break label1907;
        ((NormalUserFooterPreference)localObject1).fry.removeAll();
        ((NormalUserFooterPreference)localObject1).fry.a(new k.11(this), Looper.getMainLooper());
      }
    }
    while (true)
    {
      label1242: this.ehK.aqP("clear_lbs_info");
      label1345: if (this.pni)
      {
        this.ehK.removeAll();
        if (localObject2 != null)
          this.ehK.b((Preference)localObject2);
        if (localObject1 != null)
          this.ehK.b((Preference)localObject1);
      }
      label1460: AppMethodBeat.o(23579);
      label1556: return;
      localObject1 = "  " + this.ehM.getCity();
      break;
      this.ehK.aqP("contact_info_district");
      break label1242;
      label1849: this.ehK.aqP("contact_info_signature");
      break label1345;
      label1865: j = 0;
      break label1386;
      label1871: this.ehK.aqP("contact_info_sns");
      break label1460;
      label1887: cbc();
      this.ehK.aqP("contact_info_more");
      break label1556;
      label1907: this.ehK.aqP("contact_info_footer_normal");
    }
  }

  private void cbc()
  {
    Object localObject1 = null;
    AppMethodBeat.i(23577);
    ContactSocialInfoPreference localContactSocialInfoPreference = (ContactSocialInfoPreference)this.ehK.aqO("contact_info_social");
    if (localContactSocialInfoPreference != null)
    {
      if (bo.isNullOrNil(this.pnm))
        break label416;
      localContactSocialInfoPreference.Bb(0);
      this.pnl = 1;
    }
    while (true)
    {
      aw.ZK();
      int i = bo.h((Integer)com.tencent.mm.model.c.Ry().get(9, null));
      long l = this.crP.getIntent().getLongExtra("Contact_Uin", 0L);
      Object localObject2 = this.crP.getIntent().getStringExtra("Contact_QQNick");
      Object localObject3;
      if ((l != 0L) && (i != 0))
      {
        if ((localObject2 == null) || (((String)localObject2).length() == 0))
        {
          localObject3 = com.tencent.mm.plugin.account.a.getQQListStg().ge(l);
          localObject2 = localObject3;
          if (localObject3 == null)
            localObject2 = null;
          if (localObject2 != null)
            ((ao)localObject2).getDisplayName();
        }
        if ((l != -1L) && (new com.tencent.mm.a.p(l).longValue() > 0L))
        {
          localContactSocialInfoPreference.AX(0);
          this.pnl = 1;
        }
      }
      else
      {
        label192: if ((bo.isNullOrNil(this.pma)) || (bo.isNullOrNil(this.pnh)))
          break label434;
        localContactSocialInfoPreference.AZ(0);
        this.pnl = 1;
        label222: localObject2 = com.tencent.mm.m.g.Nu().getValue("LinkedinPluginClose");
        if ((!bo.isNullOrNil((String)localObject2)) && (Integer.valueOf((String)localObject2).intValue() != 0))
          break label443;
        i = 1;
        label254: if ((i == 0) || (bo.isNullOrNil(this.ehM.dun)))
          break label448;
        localContactSocialInfoPreference.AY(0);
        this.pnl = 1;
        label281: if (!r.Yz().equals(this.ehM.field_username))
          break label457;
        aw.ZK();
        localObject2 = (String)com.tencent.mm.model.c.Ry().get(ac.a.xLU, null);
        localObject3 = localObject1;
        if (bo.isNullOrNil((String)localObject2));
      }
      try
      {
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>((String)localObject2);
        localObject3 = ((JSONObject)localObject3).optString("ShopUrl");
        ab.i("MicroMsg.ContactWidgetNormal", "weiShopInfo:%s, shopUrl:%s", new Object[] { localObject2, localObject3 });
        if (!bo.isNullOrNil((String)localObject3))
        {
          localContactSocialInfoPreference.Ba(0);
          this.pnl = 1;
          if (this.pnl == 0)
            this.ehK.aqP("contact_info_social");
          AppMethodBeat.o(23577);
          return;
          label416: localContactSocialInfoPreference.Bb(8);
          continue;
          localContactSocialInfoPreference.AX(8);
          break label192;
          label434: localContactSocialInfoPreference.AZ(8);
          break label222;
          label443: i = 0;
          break label254;
          label448: localContactSocialInfoPreference.AY(8);
          break label281;
          label457: localObject2 = this.ehM.duq;
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.ContactWidgetNormal", localJSONException, "", new Object[0]);
          Object localObject4 = localObject1;
          continue;
          localContactSocialInfoPreference.Ba(8);
        }
      }
    }
  }

  private void cbd()
  {
    AppMethodBeat.i(23580);
    if (com.tencent.mm.n.a.jh(this.ehM.field_type))
    {
      this.ehK.aqP("contact_info_source");
      AppMethodBeat.o(23580);
    }
    while (true)
    {
      return;
      int i = this.crP.getIntent().getIntExtra("Contact_Source_FMessage", 0);
      ab.d("MicroMsg.ContactWidgetNormal", "initFriendSource, contact source = " + this.ehM.getSource() + ", sourceFMessage = " + i);
      if (i != 0)
      {
        Bf(i);
        AppMethodBeat.o(23580);
      }
      else
      {
        KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.ehK.aqO("contact_info_source");
        if (this.plj)
        {
          switch (this.ehM.getSource())
          {
          default:
            this.ehK.d(localKeyValuePreference);
            AppMethodBeat.o(23580);
            break;
          case 18:
            if (localKeyValuePreference == null)
              break label624;
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(2131298706);
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23580);
            break;
          case 30:
            if (localKeyValuePreference == null)
              break label624;
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(2131298711);
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23580);
            break;
          case 48:
            if (localKeyValuePreference == null)
              break label624;
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(this.crP.getString(2131298713));
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23580);
            break;
          case 22:
          case 23:
          case 24:
          case 26:
          case 27:
          case 28:
          case 29:
            if (localKeyValuePreference == null)
              break label624;
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(2131298724);
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23580);
            break;
          case 34:
            if (localKeyValuePreference == null)
              break label624;
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(this.crP.getString(2131298690));
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23580);
            break;
          case 58:
          case 59:
          case 60:
            if (localKeyValuePreference == null)
              break label624;
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(this.crP.getString(2131300369));
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23580);
            break;
          case 76:
            if (localKeyValuePreference == null)
              break label624;
            localKeyValuePreference.yCj = false;
            localKeyValuePreference.setTitle(this.crP.getString(2131298730));
            localKeyValuePreference.setSummary(this.crP.getString(2131298708));
            localKeyValuePreference.qi(false);
            AppMethodBeat.o(23580);
            break;
          }
        }
        else
        {
          this.ehK.d(localKeyValuePreference);
          label624: AppMethodBeat.o(23580);
        }
      }
    }
  }

  private void cbe()
  {
    AppMethodBeat.i(23581);
    this.ehK.ce("contact_info_invite_source", true);
    boolean bool1;
    boolean bool2;
    if (this.eih == null)
    {
      bool1 = this.crP.getIntent().getBooleanExtra("Is_RoomOwner", false);
      if ((this.gwP == 14) && (bool1) && (this.eih != null) && (!this.ehM.field_username.equals(this.eih.field_roomowner)))
        break label164;
      int i = this.gwP;
      if (this.eih != null)
        break label159;
      bool2 = true;
      label95: ab.i("MicroMsg.ContactWidgetNormal", "[initInviteSource] addContactScene:%s isOwner:%s null == member:%s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      this.ehK.ce("contact_info_invite_source", true);
      AppMethodBeat.o(23581);
    }
    while (true)
    {
      return;
      bool1 = this.eih.JR();
      break;
      label159: bool2 = false;
      break label95;
      label164: this.ctQ = this.crP.getIntent().getStringExtra("inviteer");
      if (bo.isNullOrNil(this.ctQ))
        this.ctQ = this.eih.aop(this.ehM.field_username);
      if (bo.isNullOrNil(this.ctQ))
        this.ctQ = com.tencent.mm.model.n.Z(this.ehM.field_username, this.ejD);
      if (bo.isNullOrNil(this.ctQ))
      {
        ab.w("MicroMsg.ContactWidgetNormal", "mRoomId:%s member:%s , inviteer is null!", new Object[] { this.ejD, this.ehM.field_username });
        this.pnn.dnU();
        ao.a.flu.a(this.ehM.field_username, this.ejD, new k.2(this));
        AppMethodBeat.o(23581);
      }
      else
      {
        this.crP.getIntent().putExtra("inviteer", this.ctQ);
        String str = mJ(this.ctQ);
        if (bo.isNullOrNil(str))
        {
          ao.a.flu.a(this.ehM.field_username, "", new k.3(this));
          AppMethodBeat.o(23581);
        }
        else
        {
          fE(this.ctQ, str);
          AppMethodBeat.o(23581);
        }
      }
    }
  }

  private void cbf()
  {
    int i = 1;
    AppMethodBeat.i(23585);
    int[] arrayOfInt = new int[7];
    ContactMoreInfoPreference localContactMoreInfoPreference = (ContactMoreInfoPreference)this.ehK.aqO("contact_info_more");
    label113: String str;
    int j;
    if (localContactMoreInfoPreference != null)
    {
      long l = this.crP.getIntent().getLongExtra("Contact_Uin", 0L);
      if ((l == -1L) || (new com.tencent.mm.a.p(l).longValue() <= 0L))
        break label317;
      localContactMoreInfoPreference.AX(0);
      arrayOfInt[0] = 0;
      if ((bo.isNullOrNil(this.pma)) || (bo.isNullOrNil(this.pnh)))
        break label331;
      localContactMoreInfoPreference.AZ(0);
      arrayOfInt[1] = 0;
      str = com.tencent.mm.m.g.Nu().getValue("LinkedinPluginClose");
      j = i;
      if (!bo.isNullOrNil(str))
      {
        if (Integer.valueOf(str).intValue() != 0)
          break label345;
        j = i;
      }
      label149: if ((j == 0) || (bo.isNullOrNil(this.ehM.dun)))
        break label351;
      localContactMoreInfoPreference.AY(0);
      arrayOfInt[2] = 0;
      label176: if (!r.Yz().equals(this.ehM.field_username))
        break label365;
      aw.ZK();
      str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xLU, null);
      if (bo.isNullOrNil(str))
        break label392;
    }
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        str = localJSONObject.optString("ShopUrl");
        if (bo.isNullOrNil(str))
          break label398;
        localContactMoreInfoPreference.Ba(0);
        arrayOfInt[3] = 0;
        if (!bo.isNullOrNil(this.ehM.signature))
          break label412;
        arrayOfInt[4] = 8;
        if (this.ehM.getSource() > 0)
          break label419;
        arrayOfInt[5] = 8;
        arrayOfInt[6] = 8;
        this.ehK.ce("contact_info_more", false);
        AppMethodBeat.o(23585);
        return;
        label317: localContactMoreInfoPreference.AX(8);
        arrayOfInt[0] = 8;
        break;
        label331: localContactMoreInfoPreference.AZ(8);
        arrayOfInt[1] = 8;
        break label113;
        label345: j = 0;
        break label149;
        label351: localContactMoreInfoPreference.AY(8);
        arrayOfInt[2] = 8;
        break label176;
        label365: str = this.ehM.duq;
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.ContactWidgetNormal", localJSONException, "", new Object[0]);
      }
      label392: Object localObject = null;
      continue;
      label398: localContactMoreInfoPreference.Ba(8);
      arrayOfInt[3] = 8;
      continue;
      label412: arrayOfInt[4] = 0;
      continue;
      label419: arrayOfInt[5] = 0;
    }
  }

  private String mJ(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(23583);
    if (this.eih == null)
    {
      AppMethodBeat.o(23583);
      paramString = (String)localObject2;
    }
    while (true)
    {
      return paramString;
      aw.ZK();
      ad localad = com.tencent.mm.model.c.XM().aoO(paramString);
      localObject2 = localObject1;
      if (localad != null)
      {
        localObject2 = localObject1;
        if ((int)localad.ewQ > 0)
          localObject2 = localad.field_conRemark;
      }
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
        localObject1 = this.eih.mJ(paramString);
      paramString = (String)localObject1;
      if (bo.isNullOrNil((String)localObject1))
      {
        paramString = (String)localObject1;
        if (localad != null)
          paramString = localad.Oi();
      }
      AppMethodBeat.o(23583);
    }
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(23575);
    Object localObject1;
    Object localObject2;
    label142: long l;
    if (paramString.equals("contact_info_sns"))
    {
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        t.hO(this.crP);
        AppMethodBeat.o(23575);
        return true;
      }
      localObject1 = this.crP.getIntent();
      ((Intent)localObject1).putExtra("sns_source", this.czs);
      ((Intent)localObject1).putExtra("sns_signature", this.ehM.signature);
      ((Intent)localObject1).putExtra("sns_nickName", this.ehM.Oi());
      ((Intent)localObject1).putExtra("sns_title", this.ehM.Oj());
      localObject2 = localObject1;
      if (com.tencent.mm.plugin.sns.b.n.qFC != null)
        localObject2 = com.tencent.mm.plugin.sns.b.n.qFC.e((Intent)localObject1, this.ehM.field_username);
      if (localObject2 == null)
        this.crP.finish();
    }
    else
    {
      if (!paramString.equals("contact_info_more"))
        break label410;
      localObject1 = new Intent();
      ((Intent)localObject1).setClass(this.crP, ContactMoreInfoUI.class);
      ((Intent)localObject1).putExtra("Is_RoomOwner", this.crP.getIntent().getBooleanExtra("Is_RoomOwner", false));
      ((Intent)localObject1).putExtra("Contact_User", this.ehM.field_username);
      ((Intent)localObject1).putExtra("KLinkedInAddFriendNickName", this.pnj);
      ((Intent)localObject1).putExtra("KLinkedInAddFriendPubUrl", this.pnk);
      localObject2 = this.crP.getIntent().getStringExtra("room_name");
      paramString = (String)localObject2;
      if (localObject2 == null)
        paramString = this.crP.getIntent().getStringExtra("Contact_ChatRoomId");
      ((Intent)localObject1).putExtra("Contact_ChatRoomId", paramString);
      ((Intent)localObject1).putExtra("verify_gmail", this.pma);
      ((Intent)localObject1).putExtra("profileName", this.pnh);
      l = this.crP.getIntent().getLongExtra("Contact_Uin", 0L);
      paramString = this.crP.getIntent().getStringExtra("Contact_QQNick");
      ((Intent)localObject1).putExtra("Contact_Uin", l);
      ((Intent)localObject1).putExtra("Contact_QQNick", paramString);
      this.crP.startActivity((Intent)localObject1);
    }
    while (true)
    {
      AppMethodBeat.o(23575);
      break;
      ((Intent)localObject2).putExtra("sns_adapter_type", 1);
      com.tencent.mm.bp.d.b(this.crP, "sns", ".ui.SnsTimeLineUserPagerUI", (Intent)localObject2);
      if ((((Intent)localObject2).getFlags() & 0x4000000) == 0)
        break label142;
      this.crP.finish();
      break label142;
      label410: if (paramString.equals("contact_info_social"))
      {
        paramString = new Intent();
        paramString.setClass(this.crP, ContactSocialInfoUI.class);
        paramString.putExtra("Contact_User", this.ehM.field_username);
        l = this.crP.getIntent().getLongExtra("Contact_Uin", 0L);
        localObject2 = this.crP.getIntent().getStringExtra("Contact_QQNick");
        paramString.putExtra("Contact_Uin", l);
        paramString.putExtra("Contact_QQNick", (String)localObject2);
        paramString.putExtra("profileName", this.pnh);
        paramString.putExtra("verify_gmail", this.pma);
        localObject2 = this.crP.getIntent().getStringExtra("Contact_Mobile_MD5");
        localObject1 = this.crP.getIntent().getStringExtra("Contact_full_Mobile_MD5");
        paramString.putExtra("Contact_Mobile_MD5", (String)localObject2);
        paramString.putExtra("Contact_full_Mobile_MD5", (String)localObject1);
        this.crP.startActivity(paramString);
      }
      else if (paramString.equals("contact_info_invite_source"))
      {
        paramString = ((KeyValuePreference)this.ehK.aqO("contact_info_invite_source")).getExtras().getString("inviteer");
        if (!bo.isNullOrNil(paramString))
        {
          localObject1 = mJ(paramString);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Contact_User", paramString);
          ((Intent)localObject2).putExtra("Contact_RemarkName", (String)localObject1);
          ((Intent)localObject2).putExtra("Contact_RoomNickname", (String)localObject1);
          ((Intent)localObject2).putExtra("Contact_RoomMember", true);
          ((Intent)localObject2).putExtra("room_name", this.ejD);
          aw.ZK();
          ((Intent)localObject2).putExtra("Contact_Nick", com.tencent.mm.model.c.XM().aoO(paramString).field_nickname);
          ((Intent)localObject2).putExtra("Contact_Scene", 14);
          ((Intent)localObject2).putExtra("Is_RoomOwner", true);
          ((Intent)localObject2).putExtra("Contact_ChatRoomId", this.ejD);
          com.tencent.mm.plugin.profile.b.gkE.c((Intent)localObject2, this.crP);
        }
      }
    }
  }

  final void UT(String paramString)
  {
    AppMethodBeat.i(23576);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ContactWidgetNormal", "view stranger remark, username is null");
      AppMethodBeat.o(23576);
    }
    while (true)
    {
      return;
      paramString = new Intent();
      paramString.putExtra("Contact_Scene", this.gwP);
      paramString.putExtra("Contact_mode_name_type", 0);
      paramString.putExtra("Contact_ModStrangerRemark", true);
      paramString.putExtra("Contact_User", this.ehM.field_username);
      paramString.putExtra("Contact_Nick", this.ehM.field_nickname);
      paramString.putExtra("Contact_RemarkName", this.ehM.field_conRemark);
      com.tencent.mm.plugin.profile.b.gkE.n(paramString, this.crP);
      AppMethodBeat.o(23576);
    }
  }

  public final void a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong, String paramString2)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(23588);
    paramString1 = (com.tencent.mm.ui.base.preference.g)this.ehK.aqO("contact_info_sns");
    if ((paramString1 != null) && (com.tencent.mm.plugin.sns.b.n.qFy != null))
      paramString1.ajO(this.ehM.field_username);
    this.pnb = com.tencent.mm.plugin.sns.b.n.qFy.b(this.ehM.field_username, this.pnb);
    this.ehK.notifyDataSetChanged();
    if (paramBoolean3)
    {
      ab.d("MicroMsg.ContactWidgetNormal", "bg Change!");
      if (com.tencent.mm.plugin.sns.b.n.qFC != null)
        com.tencent.mm.plugin.sns.b.n.qFC.WZ(this.ehM.field_username);
    }
    AppMethodBeat.o(23588);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(23578);
    boolean bool;
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label600;
      bool = true;
      label37: Assert.assertTrue(bool);
      if (paramf == null)
        break label606;
      bool = true;
      label49: Assert.assertTrue(bool);
      this.ehK = paramf;
      this.ehM = paramad;
      this.pli = paramBoolean;
      this.gwP = paramInt;
      this.plj = this.crP.getIntent().getBooleanExtra("User_Verify", false);
      this.mGZ = bo.nullAsNil(this.crP.getIntent().getStringExtra("Verify_ticket"));
      this.pnc = this.crP.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
      this.pmV = this.crP.getIntent().getIntExtra("Kdel_from", -1);
      this.pnd = this.crP.getIntent().getStringExtra("Contact_RemarkName");
      this.czs = this.crP.getIntent().getIntExtra("Sns_from_Scene", 0);
      this.pnf = this.crP.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
      this.png = this.crP.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
      this.pne = this.crP.getIntent().getIntExtra("Contact_KSnsIFlag", -1);
      long l = this.crP.getIntent().getLongExtra("Contact_KSnsBgId", -1L);
      paramf = bo.bc(this.crP.getIntent().getStringExtra("Contact_KSnsBgUrl"), "");
      this.pma = bo.bc(this.crP.getIntent().getStringExtra("verify_gmail"), "");
      this.pnh = bo.bc(this.crP.getIntent().getStringExtra("profileName"), bo.anu(this.pma));
      this.pnb.guY = this.pne;
      this.pnb.gva = l;
      this.pnb.guZ = paramf;
      this.pnj = this.crP.getIntent().getStringExtra("KLinkedInAddFriendNickName");
      this.pnk = this.crP.getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
      if (com.tencent.mm.plugin.sns.b.n.qFy != null)
        this.pnb = com.tencent.mm.plugin.sns.b.n.qFy.b(paramad.field_username, this.pnb);
      this.ejD = this.crP.getIntent().getStringExtra("room_name");
      aw.ZK();
      this.eih = com.tencent.mm.model.c.XV().oa(this.ejD);
      if (paramad.field_deleteFlag != 1)
        break label612;
    }
    label600: label606: label612: for (paramBoolean = true; ; paramBoolean = false)
    {
      this.pni = paramBoolean;
      caT();
      aw.ZK();
      com.tencent.mm.model.c.XM().aoJ(paramad.field_username);
      paramBoolean = r.Yz().equals(paramad.field_username);
      ab.v("MicroMsg.ContactWidgetNormal", "get from extinfo %s", new Object[] { Integer.valueOf(this.pnb.guY) });
      paramInt = i;
      if ((this.pnb.guY & 0x1) > 0)
        paramInt = 1;
      if ((!paramad.Oa()) && (!ad.aov(paramad.field_username)) && (paramInt != 0) && (com.tencent.mm.plugin.sns.b.n.qFC != null))
        com.tencent.mm.plugin.sns.b.n.qFC.a(2, paramad.field_username, paramBoolean, this.czs);
      AppMethodBeat.o(23578);
      return true;
      bool = false;
      break;
      bool = false;
      break label37;
      bool = false;
      break label49;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23586);
    if (com.tencent.mm.plugin.sns.b.n.qFC != null)
      com.tencent.mm.plugin.sns.b.n.qFC.a(this, 3);
    aw.Rg().b(30, this);
    aw.Rg().b(453, this);
    Object localObject = (NormalProfileHeaderPreference)this.ehK.aqO("contact_profile_header_normal");
    if (localObject != null)
      ((NormalProfileHeaderPreference)localObject).onDetach();
    localObject = (NormalUserFooterPreference)this.ehK.aqO("contact_info_footer_normal");
    if (localObject != null)
      ((NormalUserFooterPreference)localObject).biV();
    localObject = (FriendPreference)this.ehK.aqO("contact_info_friend_qq");
    if (localObject != null)
      ((FriendPreference)localObject).biV();
    localObject = (FriendPreference)this.ehK.aqO("contact_info_friend_mobile");
    if (localObject != null)
      ((FriendPreference)localObject).biV();
    localObject = (FriendPreference)this.ehK.aqO("contact_info_facebook");
    if (localObject != null)
      ((FriendPreference)localObject).biV();
    this.ehK.aqO("contact_info_sns");
    AppMethodBeat.o(23586);
    return true;
  }

  final void fE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(23582);
    ab.i("MicroMsg.ContactWidgetNormal", "[showInviteerView] inviteer:%s inviteerDisplayName:%s", new Object[] { paramString1, paramString2 });
    KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.ehK.aqO("contact_info_invite_source");
    TextPreference localTextPreference = (TextPreference)this.ehK.aqO("contact_info_hint");
    this.ehK.ce("contact_info_invite_source", false);
    SpannableString localSpannableString = new SpannableString(j.b(this.crP, this.crP.getResources().getString(2131298550, new Object[] { paramString2 })));
    localSpannableString.setSpan(new ForegroundColorSpan(this.crP.getResources().getColor(2131689776)), 0, paramString2.length(), 33);
    localKeyValuePreference.setSummary(localSpannableString);
    localKeyValuePreference.getExtras().putString("inviteer", paramString1);
    this.crP.getIntent().putExtra("inviteer", paramString1);
    if ((this.eih != null) && (!this.eih.afg().contains(this.ehM.field_username)))
    {
      this.ehK.ce("contact_info_footer_normal", true);
      localTextPreference.ae(j.b(this.crP, this.crP.getResources().getString(2131298603, new Object[] { mJ(this.ehM.field_username) })));
      AppMethodBeat.o(23582);
    }
    while (true)
    {
      return;
      this.ehK.ce("contact_info_footer_normal", false);
      AppMethodBeat.o(23582);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(23587);
    if ((paramm.getType() != 30) && (paramm.getType() != 458))
    {
      ab.w("MicroMsg.ContactWidgetNormal", "not expected scene,  type = " + paramm.getType());
      AppMethodBeat.o(23587);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramm.getType() == 30)
        {
          paramString = (com.tencent.mm.pluginsdk.model.m)paramm;
          if ((paramString.cAd != 1) && (paramString.cAd != 3))
          {
            AppMethodBeat.o(23587);
          }
          else if ((paramString.vbm != null) && (!paramString.vbm.contains(this.ehM.field_username)))
          {
            AppMethodBeat.o(23587);
          }
          else
          {
            NormalUserHeaderPreference localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.ehK.aqO("contact_info_header_normal");
            paramString = (NormalUserFooterPreference)this.ehK.aqO("contact_info_footer_normal");
            if ((localNormalUserHeaderPreference != null) && (paramString != null) && (paramString.poQ))
            {
              ab.d("MicroMsg.ContactWidgetNormal", "happy update remark change");
              this.pnf = false;
              this.png = false;
              localNormalUserHeaderPreference.bW(this.ehM.field_username, false);
              localNormalUserHeaderPreference.bX(this.ehM.field_username, false);
              localNormalUserHeaderPreference.qj(this.ehM.field_username);
              this.crP.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.pnf);
              this.crP.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.png);
            }
          }
        }
        else if (paramm.getType() == 453)
        {
          caT();
          AppMethodBeat.o(23587);
        }
      }
      else
      {
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
          Toast.makeText(this.crP, paramString, 1).show();
        AppMethodBeat.o(23587);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.k
 * JD-Core Version:    0.6.2
 */