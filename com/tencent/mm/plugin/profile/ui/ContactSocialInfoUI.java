package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactSocialInfoUI extends MMPreference
{
  private String cIS;
  private f iFE;
  private ad ldh;
  private long pmc;
  private String pmd;
  private com.tencent.mm.plugin.account.friend.a.a pmm;
  private String pmn;
  private String pmo;
  private String pmp;
  private String pmq;
  private String pmr;
  private String pms;
  private String pmt;
  private JSONObject pmu;

  private void UP(String paramString)
  {
    AppMethodBeat.i(23450);
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setFlags(268435456);
    localIntent.setData(Uri.parse("tel:".concat(String.valueOf(paramString))));
    startActivity(localIntent);
    AppMethodBeat.o(23450);
  }

  private void caS()
  {
    AppMethodBeat.i(23451);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.pmu.optString("ShopUrl"));
    localIntent.putExtra("geta8key_username", r.Yz());
    d.b(this.mController.ylL, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(23451);
  }

  private static ao jx(long paramLong)
  {
    AppMethodBeat.i(23446);
    ao localao = com.tencent.mm.plugin.account.a.getQQListStg().ge(paramLong);
    if (localao == null)
    {
      localao = null;
      AppMethodBeat.o(23446);
    }
    while (true)
    {
      return localao;
      AppMethodBeat.o(23446);
    }
  }

  private boolean q(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(23449);
    boolean bool;
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      bool = l.a(paramString, this.mController.ylL, localByteArrayOutputStream.toByteArray());
      AppMethodBeat.o(23449);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23449);
    }
  }

  private void s(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(23447);
    if ((!bo.isNullOrNil(paramString2)) && (!bo.isNullOrNil(paramString1)))
    {
      paramString1 = (KeyValuePreference)this.iFE.aqO(paramString1);
      if (paramString1 != null)
      {
        paramString1.dAB();
        if (paramBoolean)
          paramString1.ksd = getResources().getColor(2131690208);
        paramString1.setSummary(paramString2);
        paramString1.qi(false);
      }
      AppMethodBeat.o(23447);
    }
    while (true)
    {
      return;
      this.iFE.aqP(paramString1);
      AppMethodBeat.o(23447);
    }
  }

  public final int JC()
  {
    return 2131165231;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(23448);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.ContactSocialInfoUI", paramf + " item has been clicked!");
    if (paramf.equals("contact_info_social_mobile"))
      if ((this.pmm != null) && (this.ldh != null));
    while (true)
    {
      AppMethodBeat.o(23448);
      return false;
      aw.ZK();
      if (c.XM().aoJ(this.pmm.getUsername()))
      {
        if ((this.pmm != null) && (!bo.isNullOrNil(this.pmm.frQ)));
        for (paramf = getResources().getStringArray(2131755043); ; paramf = getResources().getStringArray(2131755044))
        {
          paramPreference = paramf;
          if (com.tencent.mm.plugin.profile.b.gkF.BX())
          {
            paramf = bo.P(paramf);
            paramf.add(getResources().getString(2131298197));
            paramPreference = (String[])paramf.toArray(new String[paramf.size()]);
            com.tencent.mm.plugin.report.service.h.pYm.e(11621, new Object[] { Integer.valueOf(2), Integer.valueOf(3) });
          }
          com.tencent.mm.ui.base.h.a(this, null, paramPreference, null, new ContactSocialInfoUI.2(this, paramPreference));
          break;
        }
      }
      if ((this.pmo != null) && (this.pmo.length() != 0))
      {
        int i = this.pmo.lastIndexOf(' ') + 1;
        if (i > 0)
        {
          UP(this.pmo.substring(i));
          continue;
          if (!paramf.equals("contact_info_social_qq"))
            if (paramf.equals("contact_info_social_linkedin"))
            {
              paramPreference = this.ldh.dup;
              if (bo.isNullOrNil(paramPreference))
              {
                ab.e("MicroMsg.ContactSocialInfoUI", "this liurl is null!");
              }
              else
              {
                paramf = new Intent();
                paramf.putExtra("rawUrl", paramPreference);
                paramf.putExtra("geta8key_username", r.Yz());
                d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramf);
              }
            }
            else if ((!paramf.equals("contact_info_social_facebook")) && (!paramf.equals("contact_info_social_googlecontacts")) && (paramf.equals("contact_info_social_weishop")) && (this.pmu != null))
            {
              aw.ZK();
              if (c.Ry().get(ac.a.xMw, null) == null)
                com.tencent.mm.ui.base.h.a(this, 2131298688, 2131297061, new ContactSocialInfoUI.4(this), null);
              else
                caS();
            }
        }
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(23445);
    setMMTitle(2131298686);
    setBackBtn(new ContactSocialInfoUI.1(this));
    this.iFE = this.yCw;
    Object localObject1 = getIntent().getStringExtra("Contact_Mobile_MD5");
    Object localObject2 = getIntent().getStringExtra("Contact_full_Mobile_MD5");
    if ((bo.isNullOrNil((String)localObject1)) && (bo.isNullOrNil((String)localObject2)))
      if (bo.isNullOrNil(this.ldh.field_username))
        this.pmm = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.cIS);
    while (true)
    {
      label152: int i;
      if ((this.pmm == null) || (this.pmm.Aq() == null) || (this.pmm.Aq().length() <= 0))
      {
        ab.e("MicroMsg.ContactSocialInfoUI", "error : this is not the mobile contact, MD5 = " + this.pmn);
        s("contact_info_social_mobile", this.pmo, true);
        aw.ZK();
        i = bo.h((Integer)c.Ry().get(9, null));
        this.pmc = getIntent().getLongExtra("Contact_Uin", 0L);
        this.pmd = getIntent().getStringExtra("Contact_QQNick");
        if ((this.pmc != 0L) && (i != 0))
        {
          if ((this.pmd == null) || (this.pmd.length() == 0))
          {
            localObject1 = jx(this.pmc);
            if (localObject1 != null)
              this.pmd = ((ao)localObject1).getDisplayName();
          }
          this.pmp = bo.nullAsNil(this.pmd);
          this.pmp = (this.pmp + " " + new p(this.pmc).longValue());
        }
        s("contact_info_social_qq", this.pmp, true);
        localObject1 = g.Nu().getValue("LinkedinPluginClose");
        if ((!bo.isNullOrNil((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() != 0))
          break label799;
        i = 1;
        label359: if ((i == 0) || (bo.isNullOrNil(this.ldh.dun)))
          break label804;
        this.pmq = this.ldh.duo;
        label387: s("contact_info_social_linkedin", this.pmq, true);
        s("contact_info_social_facebook", this.pmr, false);
        this.pmt = bo.bc(getIntent().getStringExtra("verify_gmail"), "");
        this.pms = bo.bc(getIntent().getStringExtra("profileName"), bo.anu(this.pmt));
        if ((bo.isNullOrNil(this.pmt)) || (bo.isNullOrNil(this.pms)))
          break label814;
        s("contact_info_social_googlecontacts", this.pms + '\n' + this.pmt, false);
        label512: if (!r.Yz().equals(this.ldh.field_username))
          break label828;
        aw.ZK();
        localObject1 = (String)c.Ry().get(ac.a.xLU, null);
        ab.i("MicroMsg.ContactSocialInfoUI", "in self social info page, weishop info:%s", new Object[] { localObject1 });
        if (bo.isNullOrNil((String)localObject1));
      }
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        this.pmu = ((JSONObject)localObject2);
        if (this.pmu != null)
        {
          s("contact_info_social_weishop", this.pmu.optString("ShopName"), true);
          AppMethodBeat.o(23445);
          return;
          this.pmm = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.ldh.field_username);
          continue;
          if (((localObject1 == null) || (((String)localObject1).length() <= 0)) && ((localObject2 == null) || (((String)localObject2).length() <= 0)))
            continue;
          this.pmm = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject1);
          if ((this.pmm != null) && (this.pmm.Aq() != null) && (this.pmm.Aq().length() > 0))
            continue;
          this.pmm = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject2);
          if ((this.pmm == null) || (this.pmm.Aq() == null))
            continue;
          this.pmm.Aq().length();
          continue;
          this.pmo = (bo.nullAsNil(this.pmm.apA()) + " " + bo.nullAsNil(this.pmm.apG()).replace(" ", ""));
          break label152;
          label799: i = 0;
          break label359;
          label804: this.pmq = "";
          break label387;
          label814: s("contact_info_social_googlecontacts", "", false);
          break label512;
          label828: localObject1 = this.ldh.duq;
          ab.i("MicroMsg.ContactSocialInfoUI", "weiShopInfo:%s", new Object[] { localObject1 });
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.ContactSocialInfoUI", localJSONException, "", new Object[0]);
          this.pmu = null;
          continue;
          s("contact_info_social_weishop", "", false);
          AppMethodBeat.o(23445);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23444);
    super.onCreate(paramBundle);
    this.cIS = bo.nullAsNil(getIntent().getStringExtra("Contact_User"));
    aw.ZK();
    this.ldh = c.XM().aoO(this.cIS);
    initView();
    AppMethodBeat.o(23444);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI
 * JD-Core Version:    0.6.2
 */