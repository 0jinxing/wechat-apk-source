package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.scanner.a.r.a;
import com.tencent.mm.plugin.scanner.a.r.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VcardContactUI extends MMPreference
{
  private static ArrayList<String> qgT;
  private static int qgV;
  private static int qgW;
  private f ehK;
  private com.tencent.mm.plugin.scanner.a.r qgS;
  private r qgU;

  static
  {
    AppMethodBeat.i(81359);
    qgT = new ArrayList();
    qgV = 1;
    qgW = 1;
    AppMethodBeat.o(81359);
  }

  private static void a(List<String> paramList, Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(81357);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (paramInt2 == 1)
      {
        paramIntent.putExtra("phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
      else if (paramInt2 == 2)
      {
        paramIntent.putExtra("secondary_phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
      else if (paramInt2 == 3)
      {
        paramIntent.putExtra("tertiary_phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
    }
    AppMethodBeat.o(81357);
  }

  private void aqI()
  {
    AppMethodBeat.i(81352);
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165308);
    Object localObject = (VcardContactUserHeaderPreference)this.ehK.aqO("v_contact_info_header");
    if (localObject != null)
      ((VcardContactUserHeaderPreference)localObject).a(this.qgS);
    this.ehK.aqP("c_contact_info_wx_id");
    if (!bo.isNullOrNil(this.qgS.hHN))
    {
      localObject = (VcardContactLinkPreference)this.ehK.aqO("v_contact_info_photo_uri");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.qgS.hHN);
        ((VcardContactLinkPreference)localObject).qi(false);
        ((KeyValuePreference)localObject).yCj = false;
        qgV += 2;
        qgW += 2;
      }
      chN();
      chM();
      if (bo.isNullOrNil(this.qgS.hHW))
        break label566;
      localObject = (KeyValuePreference)this.ehK.aqO("v_contact_info_org");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.qgS.hHW);
        ((KeyValuePreference)localObject).qi(false);
        ((KeyValuePreference)localObject).yCj = true;
      }
      label194: if (bo.isNullOrNil(this.qgS.qaB))
        break label581;
      localObject = (KeyValuePreference)this.ehK.aqO("v_contact_info_agent");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.qgS.qaB);
        ((KeyValuePreference)localObject).qi(false);
        ((KeyValuePreference)localObject).yCj = true;
      }
      label247: if (bo.isNullOrNil(this.qgS.url))
        break label596;
      localObject = (VcardContactLinkPreference)this.ehK.aqO("v_contact_info_home_page");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.qgS.url);
        ((VcardContactLinkPreference)localObject).qi(false);
        ((KeyValuePreference)localObject).yCj = true;
      }
      label301: if (bo.isNullOrNil(this.qgS.dtV))
        break label625;
      localObject = (VcardContactLinkPreference)this.ehK.aqO("v_contact_info_email");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.qgS.dtV);
        ((VcardContactLinkPreference)localObject).qi(false);
        ((KeyValuePreference)localObject).yCj = true;
      }
      label355: if (bo.isNullOrNil(this.qgS.qaq))
        break label641;
      localObject = (KeyValuePreference)this.ehK.aqO("v_contact_info_birthday");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.qgS.qaq);
        ((KeyValuePreference)localObject).qi(false);
        ((KeyValuePreference)localObject).yCj = true;
      }
      label409: if (bo.isNullOrNil(this.qgS.qaC))
        break label670;
      localObject = (KeyValuePreference)this.ehK.aqO("v_contact_info_remark");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.qgS.qaC);
        ((KeyValuePreference)localObject).qi(false);
        ((KeyValuePreference)localObject).yCj = true;
      }
      label463: if ((this.qgS.qao == null) || (!this.qgS.qao.qaG.contains("uri")))
        break label699;
      localObject = (VcardContactLinkPreference)this.ehK.aqO("v_contact_info_logo");
      ((VcardContactLinkPreference)localObject).setSummary(this.qgS.qao.qaH);
      ((KeyValuePreference)localObject).yCj = false;
      ((VcardContactLinkPreference)localObject).qi(false);
      AppMethodBeat.o(81352);
    }
    while (true)
    {
      return;
      this.ehK.aqP("v_contact_info_photo_uri");
      this.ehK.aqP("v_category_photo_uri");
      break;
      label566: this.ehK.aqP("v_contact_info_org");
      break label194;
      label581: this.ehK.aqP("v_contact_info_agent");
      break label247;
      label596: this.ehK.aqP("v_contact_info_home_page");
      this.ehK.aqP("v_category_home_page");
      break label301;
      label625: this.ehK.aqP("v_contact_info_email");
      break label355;
      label641: this.ehK.aqP("v_contact_info_birthday");
      this.ehK.aqP("v_category_birthday");
      break label409;
      label670: this.ehK.aqP("v_contact_info_remark");
      this.ehK.aqP("v_category_remark");
      break label463;
      label699: this.ehK.aqP("v_contact_info_logo");
      this.ehK.aqP("v_category_logo");
      AppMethodBeat.o(81352);
    }
  }

  private void b(List<String> paramList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(81355);
    if ((paramList != null) && (paramList.size() > 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        VcardContactLinkPreference localVcardContactLinkPreference = new VcardContactLinkPreference(this);
        localVcardContactLinkPreference.setKey(paramString1 + String.valueOf(str));
        if (!qgT.contains(paramString1 + String.valueOf(str)))
          qgT.add(paramString1 + String.valueOf(str));
        localVcardContactLinkPreference.setTitle(paramString2);
        localVcardContactLinkPreference.setLayoutResource(2130970127);
        localVcardContactLinkPreference.setSummary(str);
        localVcardContactLinkPreference.qi(false);
        localVcardContactLinkPreference.yCj = true;
        localVcardContactLinkPreference.dAD();
        this.ehK.a(localVcardContactLinkPreference, qgV);
      }
    }
    AppMethodBeat.o(81355);
  }

  private void chM()
  {
    AppMethodBeat.i(81353);
    List localList = this.qgS.qax;
    if ((localList != null) && (localList.size() > 0))
      b(localList, "WorkTel", this.mController.ylL.getString(2131304221));
    localList = this.qgS.qaw;
    if ((localList != null) && (localList.size() > 0))
      b(localList, "HomeTel", this.mController.ylL.getString(2131304209));
    localList = this.qgS.qay;
    if ((localList != null) && (localList.size() > 0))
      b(localList, "VideoTEL", this.mController.ylL.getString(2131304218));
    localList = this.qgS.qaz;
    if ((localList != null) && (localList.size() > 0))
      b(localList, "NormalTel", this.mController.ylL.getString(2131304212));
    localList = this.qgS.qav;
    if ((localList != null) && (localList.size() > 0))
      b(localList, "CellTel", this.mController.ylL.getString(2131304205));
    AppMethodBeat.o(81353);
  }

  private void chN()
  {
    AppMethodBeat.i(81354);
    r.a locala = this.qgS.qat;
    if ((locala != null) && (locala.aDu().length() > 0))
      fS(locala.aDu(), this.mController.ylL.getString(2131304207));
    locala = this.qgS.qau;
    if ((locala != null) && (locala.aDu().length() > 0))
      fS(locala.aDu(), this.mController.ylL.getString(2131304220));
    locala = this.qgS.qar;
    if ((locala != null) && (locala.aDu().length() > 0))
      fS(locala.aDu(), this.mController.ylL.getString(2131304202));
    locala = this.qgS.qas;
    if ((locala != null) && (locala.aDu().length() > 0))
      fS(locala.aDu(), this.mController.ylL.getString(2131304202));
    AppMethodBeat.o(81354);
  }

  private void fS(String paramString1, String paramString2)
  {
    AppMethodBeat.i(81356);
    KeyValuePreference localKeyValuePreference = new KeyValuePreference(this);
    localKeyValuePreference.setTitle(paramString2);
    localKeyValuePreference.setLayoutResource(2130970127);
    localKeyValuePreference.qi(false);
    localKeyValuePreference.setSummary(paramString1);
    localKeyValuePreference.yCj = false;
    localKeyValuePreference.dAD();
    this.ehK.a(localKeyValuePreference, qgW);
    AppMethodBeat.o(81356);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(81350);
    Object localObject;
    if (paramPreference.mKey.equals("add_vcard_contact"))
    {
      paramPreference = getString(2131304201);
      localObject = getString(2131304200);
      paramf = new h.c()
      {
        public final void iE(int paramAnonymousInt)
        {
          AppMethodBeat.i(81348);
          switch (paramAnonymousInt)
          {
          default:
          case 0:
          case 1:
          }
          while (true)
          {
            AppMethodBeat.o(81348);
            while (true)
            {
              return;
              bv.aaq().c(10238, new Object[] { Integer.valueOf(1) });
              localIntent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
              VcardContactUI.a(VcardContactUI.this, localIntent);
              VcardContactUI.this.startActivity(localIntent);
              AppMethodBeat.o(81348);
            }
            bv.aaq().c(10239, new Object[] { Integer.valueOf(1) });
            Intent localIntent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
            localIntent.setType("vnd.android.cursor.item/person");
            VcardContactUI.a(VcardContactUI.this, localIntent);
            VcardContactUI.this.startActivity(localIntent);
          }
        }
      };
      com.tencent.mm.ui.base.h.a(this, "", new String[] { paramPreference, localObject }, "", paramf);
      AppMethodBeat.o(81350);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramPreference.mKey.equals("v_contact_info_photo_uri")) || (paramPreference.mKey.equals("v_contact_info_home_page")) || (paramPreference.mKey.equals("v_contact_info_logo")))
      {
        paramf = paramPreference.getSummary().toString();
        if ((paramf != null) && (paramf.length() > 0))
        {
          paramPreference = this.qgU;
          if (!paramPreference.ppI.doT())
            ab.e("MicroMsg.scanner.ViewMMURL", "already running, skipped");
          while (true)
          {
            AppMethodBeat.o(81350);
            bool = true;
            break;
            if ((paramf == null) || (paramf.length() == 0))
            {
              ab.e("MicroMsg.scanner.ViewMMURL", "go fail, qqNum is null");
            }
            else
            {
              paramPreference.url = paramf;
              localObject = (String)g.RP().Ry().get(46, null);
              if ((localObject == null) || (((String)localObject).length() == 0))
              {
                paramPreference.c(paramf, (int)System.currentTimeMillis(), new byte[0]);
              }
              else
              {
                g.Rg().a(233, paramPreference);
                paramPreference.qhf = new com.tencent.mm.modelsimple.h(paramf, null, 4, 0, (int)System.currentTimeMillis(), new byte[0]);
                g.Rg().a(paramPreference.qhf, 0);
                paramPreference.ppI.ae(3000L, 3000L);
              }
            }
          }
        }
      }
      else
      {
        if ((qgT.contains(paramPreference.mKey)) && (!paramPreference.mKey.toLowerCase().contains("fax")))
        {
          paramPreference = paramPreference.getSummary().toString().trim();
          if ((paramPreference == null) || (paramPreference.length() <= 0))
            break label500;
          paramf = getString(2131298504);
          paramPreference = new VcardContactUI.1(this, paramPreference);
          com.tencent.mm.ui.base.h.a(this, "", new String[] { paramf }, "", paramPreference);
          AppMethodBeat.o(81350);
          bool = true;
          continue;
        }
        if (paramPreference.mKey.equals("v_contact_info_email"))
        {
          localObject = paramPreference.getSummary().toString();
          paramPreference = this.mController.ylL.getString(2131302943);
          paramf = this.mController.ylL.getString(2131302942);
          localObject = new VcardContactUI.2(this, (String)localObject);
          com.tencent.mm.ui.base.h.a(this, "", new String[] { paramPreference, paramf }, "", (h.c)localObject);
        }
      }
      label500: AppMethodBeat.o(81350);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(81351);
    this.qgU = new r(this);
    this.ehK = this.yCw;
    this.qgS = com.tencent.mm.plugin.scanner.a.r.qaD;
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(81347);
        VcardContactUI.this.finish();
        AppMethodBeat.o(81347);
        return true;
      }
    });
    setMMTitle("");
    aqI();
    AppMethodBeat.o(81351);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(81349);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(81349);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.VcardContactUI
 * JD-Core Version:    0.6.2
 */