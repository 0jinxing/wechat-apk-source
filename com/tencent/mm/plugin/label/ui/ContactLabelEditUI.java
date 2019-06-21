package com.tencent.mm.plugin.label.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.plugin.label.b.a;
import com.tencent.mm.plugin.label.e;
import com.tencent.mm.plugin.label.ui.widget.InputClearablePreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.protocal.protobuf.axj;
import com.tencent.mm.protocal.protobuf.cd;
import com.tencent.mm.protocal.protobuf.cmh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactLabelEditUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private ProgressDialog gqo;
  private ak mHandler;
  private boolean nBj;
  private String nHB;
  private String nHC;
  private String nHD;
  private af nHE;
  private boolean nHF;
  private boolean nHG;
  private String nHH;
  private com.tencent.mm.ui.base.preference.f nHI;
  private ContactListExpandPreference nHJ;
  private InputClearablePreference nHK;
  private Preference nHL;
  private PreferenceTitleCategory nHM;
  private boolean nHN;
  private ArrayList<String> nHO;
  private ArrayList<String> nHP;
  private HashSet<String> nHQ;
  private HashSet<String> nHR;
  private HashSet<String> nHS;
  private String nHT;
  private String nHU;
  private boolean nHV;

  public ContactLabelEditUI()
  {
    AppMethodBeat.i(22556);
    this.nHG = false;
    this.nHN = true;
    this.nBj = true;
    this.nHO = new ArrayList();
    this.nHP = new ArrayList();
    this.nHQ = new HashSet();
    this.nHR = new HashSet();
    this.nHS = new HashSet();
    this.mHandler = new ContactLabelEditUI.1(this, Looper.getMainLooper());
    AppMethodBeat.o(22556);
  }

  private void JN(String paramString)
  {
    AppMethodBeat.i(22573);
    com.tencent.mm.ui.base.h.a(this, paramString, "", new ContactLabelEditUI.4(this));
    AppMethodBeat.o(22573);
  }

  private void PI(String paramString)
  {
    AppMethodBeat.i(22571);
    getString(2131297061);
    this.gqo = com.tencent.mm.ui.base.h.b(this, paramString, true, new ContactLabelEditUI.3(this));
    AppMethodBeat.o(22571);
  }

  private void PJ(String paramString)
  {
    AppMethodBeat.i(22566);
    if (bo.isNullOrNil(paramString));
    for (boolean bool = false; ; bool = true)
    {
      enableOptionMenu(bool);
      AppMethodBeat.o(22566);
      return;
    }
  }

  private static boolean PK(String paramString)
  {
    AppMethodBeat.i(22569);
    boolean bool;
    if (!bo.isNullOrNil(e.bIZ().PE(paramString)))
    {
      bool = true;
      AppMethodBeat.o(22569);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22569);
    }
  }

  private void a(af paramaf)
  {
    AppMethodBeat.i(22575);
    if (!e.bIZ().a(paramaf, new String[] { "labelID" }))
    {
      ab.w("MicroMsg.Label.ContactLabelEditUI", "cpan[doDeleteContactLabel] fail.");
      bJh();
      AppMethodBeat.o(22575);
    }
    while (true)
    {
      return;
      bJi();
      AppMethodBeat.o(22575);
    }
  }

  private void bJc()
  {
    AppMethodBeat.i(22572);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(22572);
  }

  private void bJd()
  {
    AppMethodBeat.i(22565);
    if (this.nHJ != null)
    {
      this.nHJ.u(null, this.nHO);
      if ((this.nHO == null) || (this.nHO.size() <= 0))
        this.nHJ.djD();
    }
    if (this.nHK != null)
      this.nHK.setText(this.nHC);
    AppMethodBeat.o(22565);
  }

  private void bJe()
  {
    AppMethodBeat.i(22567);
    ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[savaSuccess]");
    bJc();
    if (this.nHQ != null);
    for (int i = this.nHQ.size(); ; i = 0)
    {
      if (this.nHS != null);
      for (int j = this.nHS.size(); ; j = 0)
      {
        ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList]addnum:%d", new Object[] { Integer.valueOf(i) });
        Object localObject;
        int n;
        if (i > 0)
        {
          int k = this.nHR.size();
          int m = Math.max(0, i - k);
          localObject = com.tencent.mm.plugin.report.service.h.pYm;
          String str = r.Yz();
          if (this.nHF)
          {
            n = 1;
            ((com.tencent.mm.plugin.report.service.h)localObject).e(11220, new Object[] { str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(n), Integer.valueOf(k), Integer.valueOf(m) });
          }
        }
        else
        {
          if (!this.nHN)
            break label299;
          localObject = getIntent();
          ((Intent)localObject).putExtra("k_sns_label_add_label", this.nHC);
          setResult(0, (Intent)localObject);
          if (!this.nHV)
            break label262;
          com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2) });
        }
        while (true)
        {
          finish();
          AppMethodBeat.o(22567);
          return;
          n = 2;
          break;
          label262: com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(3) });
        }
        label299: if (i > 0)
        {
          if (this.nHV)
            com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(2) });
        }
        else
          label344: if (j > 0)
          {
            if (!this.nHV)
              break label434;
            com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(2) });
          }
        while (true)
        {
          setResult(0);
          break;
          com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(3) });
          break label344;
          label434: com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(3) });
        }
      }
    }
  }

  private void bJf()
  {
    AppMethodBeat.i(22568);
    ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveFailed]");
    bJc();
    JN(getString(2131296405));
    AppMethodBeat.o(22568);
  }

  private void bJg()
  {
    AppMethodBeat.i(22570);
    int i;
    if (this.nHQ == null)
    {
      i = 0;
      if (this.nHS != null)
        break label227;
    }
    Object localObject1;
    Object localObject2;
    String str;
    Object localObject3;
    Object localObject4;
    label227: for (int j = 0; ; j = this.nHS.size())
    {
      ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList] addcount:%d,delcount:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      localObject1 = new LinkedList();
      if ((this.nHQ == null) || (this.nHQ.size() <= 0))
        break label238;
      this.nHQ.size();
      localObject2 = this.nHQ.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        str = (String)((Iterator)localObject2).next();
        aw.ZK();
        localObject3 = com.tencent.mm.model.c.XM().aoO(str);
        localObject4 = ((ap)localObject3).field_contactLabelIds;
        str = com.tencent.mm.plugin.label.c.eR((String)localObject4, this.nHD);
        ab.i("MicroMsg.Label.ContactLabelEditUI", "labels:%s mixLabelIds:%s", new Object[] { localObject4, str });
        if (!str.equalsIgnoreCase((String)localObject4))
        {
          localObject4 = new cmh();
          ((cmh)localObject4).jBB = ((ap)localObject3).field_username;
          ((cmh)localObject4).wcD = str;
          ((LinkedList)localObject1).add(localObject4);
        }
      }
      i = this.nHQ.size();
      break;
    }
    label238: if ((this.nHS != null) && (this.nHS.size() > 0))
    {
      this.nHS.size();
      localObject3 = this.nHS.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (String)((Iterator)localObject3).next();
        aw.ZK();
        localObject4 = com.tencent.mm.model.c.XM().aoO((String)localObject2).field_contactLabelIds;
        str = com.tencent.mm.plugin.label.c.eS((String)localObject4, this.nHD);
        ab.i("MicroMsg.Label.ContactLabelEditUI", "username:%s labels:%s mixLabelIds:%s", new Object[] { localObject2, localObject4, str });
        if (!str.equalsIgnoreCase((String)localObject4))
        {
          localObject4 = new cmh();
          ((cmh)localObject4).jBB = ((String)localObject2);
          ((cmh)localObject4).wcD = str;
          ((LinkedList)localObject1).add(localObject4);
        }
      }
    }
    if (((LinkedList)localObject1).size() > 0)
    {
      localObject1 = new com.tencent.mm.plugin.label.b.d((LinkedList)localObject1);
      aw.Rg().a((m)localObject1, 0);
      AppMethodBeat.o(22570);
    }
    while (true)
    {
      return;
      bJe();
      AppMethodBeat.o(22570);
    }
  }

  private void bJh()
  {
    AppMethodBeat.i(22576);
    JN(getString(2131298856));
    AppMethodBeat.o(22576);
  }

  private void bJi()
  {
    AppMethodBeat.i(22577);
    setResult(-1);
    finish();
    AppMethodBeat.o(22577);
  }

  public final int JC()
  {
    return 2131165246;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(22563);
    paramf = paramPreference.mKey;
    if (bo.isNullOrNil(paramf))
    {
      ab.w("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is null.");
      AppMethodBeat.o(22563);
    }
    while (true)
    {
      return false;
      if (paramf.equals("contact_label_delete"))
        com.tencent.mm.ui.base.h.d(this, getString(2131300884), "", getString(2131296881), getString(2131296868), new ContactLabelEditUI.14(this), new ContactLabelEditUI.2(this));
      ab.d("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is %s:", new Object[] { paramf });
      AppMethodBeat.o(22563);
    }
  }

  public final String bJj()
  {
    if (this.nHN);
    for (String str = "_New"; ; str = "_Edit")
      return str;
  }

  public final void initView()
  {
    AppMethodBeat.i(22561);
    if (this.nHV)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
      if (!bo.isNullOrNil(this.nHD))
        break label560;
      this.nHN = true;
      this.nHH = getString(2131302015);
      label73: setMMTitle(this.nHH);
      setBackBtn(new ContactLabelEditUI.7(this));
      a(0, getString(2131297038), new ContactLabelEditUI.8(this), q.b.ymu);
      this.nHI = this.yCw;
      this.nHJ = ((ContactListExpandPreference)this.nHI.aqO("contact_label_contact_list"));
      this.nHJ.a(this.nHI, this.nHJ.mKey);
      this.nHJ.oD(true);
      this.nHJ.oE(true);
      this.nHJ.djF();
      this.nHJ.djz();
      this.nHJ.a(new ContactLabelEditUI.9(this));
      this.nHJ.a(new ContactLabelEditUI.10(this));
      this.nHK = ((InputClearablePreference)this.nHI.aqO("contact_label_name"));
      InputClearablePreference localInputClearablePreference = this.nHK;
      localInputClearablePreference.nJe = getString(2131300886);
      if (localInputClearablePreference.nJj != null)
        localInputClearablePreference.nJj.setHint(localInputClearablePreference.nJe);
      this.nHK.hAa = getString(2131300895);
      localInputClearablePreference = this.nHK;
      localInputClearablePreference.nJf = getString(2131296406);
      if (localInputClearablePreference.nJl != null)
        localInputClearablePreference.nJl.setText(localInputClearablePreference.nJf);
      this.nHK.nJg = 36;
      this.nHK.nJi = this.nHN;
      this.nHK.nJn = new ContactLabelEditUI.11(this);
      this.nHK.setText(this.nHC);
      if (this.mHandler != null)
        this.mHandler.sendEmptyMessage(6001);
      if (!this.nHN)
        break label610;
      if ((this.nHO == null) || (this.nHO.size() <= 0))
        break label593;
      this.nHJ.u(null, this.nHO);
      label424: if (this.nDp != null)
        this.nDp.setOnScrollListener(new ContactLabelEditUI.13(this));
      this.nHL = this.nHI.aqO("contact_label_delete");
      this.nHM = ((PreferenceTitleCategory)this.nHI.aqO("contact_label_empty_category"));
      if (!this.nHN)
        break label628;
      this.nHI.d(this.nHL);
      this.nHI.d(this.nHM);
      AppMethodBeat.o(22561);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(3) });
      break;
      label560: this.nHN = false;
      this.nHE = e.bIZ().aoF(this.nHD);
      this.nHH = getString(2131302014);
      break label73;
      label593: this.nHJ.ag(new ArrayList());
      break label424;
      label610: aw.RS().aa(new ContactLabelEditUI.12(this));
      break label424;
      label628: if (!this.nHG)
        this.nHI.d(this.nHL);
      AppMethodBeat.o(22561);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22562);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] requestCode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(22562);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 7001:
    }
    while (true)
    {
      AppMethodBeat.o(22562);
      break;
      String str = paramIntent.getStringExtra("Select_Contact");
      boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
      ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] %s", new Object[] { String.valueOf(str) });
      if (!bo.isNullOrNil(str))
      {
        paramIntent = bo.P(str.split(","));
        if ((paramIntent != null) && (paramIntent.size() > 0))
        {
          paramInt2 = paramIntent.size();
          paramInt1 = 0;
          if (paramInt1 < paramInt2)
          {
            str = (String)paramIntent.get(paramInt1);
            if (!bo.isNullOrNil(str))
            {
              if ((!t.mY(str)) || (this.nHO.contains(str)) || (str.equals(this.nHT)))
                break label313;
              this.nHO.add(str);
              if ((this.nHP != null) && (!this.nHP.contains(paramIntent.get(paramInt1))))
                this.nHQ.add(str);
              if (bool)
                this.nHR.add(str);
              if ((this.nHS != null) && (this.nHS.contains(str)))
                this.nHS.remove(str);
            }
            while (true)
            {
              paramInt1++;
              break;
              label313: ab.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", new Object[] { str });
            }
          }
        }
        if (this.mHandler != null)
          this.mHandler.sendEmptyMessage(6001);
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(22574);
    if (((!bo.isNullOrNil(this.nHC)) && (!this.nHC.equals(this.nHB))) || ((this.nHQ != null) && (this.nHQ.size() > 0)) || ((this.nHS != null) && (this.nHS.size() > 0)))
    {
      com.tencent.mm.ui.base.h.d(this, getString(2131302710), "", getString(2131297761), getString(2131297762), new ContactLabelEditUI.5(this), new ContactLabelEditUI.6(this));
      AppMethodBeat.o(22574);
    }
    while (true)
    {
      return;
      setResult(0);
      finish();
      AppMethodBeat.o(22574);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22557);
    super.onCreate(paramBundle);
    this.nHT = r.Yz();
    this.nHD = getIntent().getStringExtra("label_id");
    this.nHB = getIntent().getStringExtra("label_name");
    this.nHC = getIntent().getStringExtra("label_name");
    this.nHF = getIntent().getBooleanExtra("Is_Chatroom", false);
    this.nHU = getIntent().getStringExtra("label_source");
    boolean bool;
    int j;
    if ((this.nHU != null) && (this.nHU.equals("label_source_Address")))
    {
      bool = true;
      this.nHV = bool;
      this.nHG = getIntent().getBooleanExtra("is_show_delete", true);
      paramBundle = getIntent().getStringExtra("Select_Contact");
      if (bo.isNullOrNil(paramBundle))
        break label314;
      ArrayList localArrayList = bo.P(paramBundle.split(","));
      this.nHO = new ArrayList();
      if ((localArrayList == null) || (localArrayList.size() <= 0))
        break label314;
      int i = localArrayList.size();
      j = 0;
      label195: if (j >= i)
        break label314;
      paramBundle = (String)localArrayList.get(j);
      if (!bo.isNullOrNil(paramBundle))
      {
        if ((!t.mY(paramBundle)) || (this.nHO.contains(paramBundle)) || (paramBundle.equals(this.nHT)))
          break label295;
        this.nHO.add(paramBundle);
        this.nHQ.add(paramBundle);
        if (this.nHF)
          this.nHR.add(paramBundle);
      }
    }
    while (true)
    {
      j++;
      break label195;
      bool = false;
      break;
      label295: ab.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", new Object[] { paramBundle });
    }
    label314: aw.Rg().a(635, this);
    aw.Rg().a(637, this);
    aw.Rg().a(638, this);
    initView();
    AppMethodBeat.o(22557);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22560);
    aw.Rg().b(635, this);
    aw.Rg().b(637, this);
    aw.Rg().b(638, this);
    super.onDestroy();
    AppMethodBeat.o(22560);
  }

  public void onPause()
  {
    AppMethodBeat.i(22559);
    com.tencent.mm.modelstat.d.b(4, "ContactLabelEditUI" + bJj(), hashCode());
    aw.Rg().b(636, this);
    super.onPause();
    AppMethodBeat.o(22559);
  }

  public void onResume()
  {
    AppMethodBeat.i(22558);
    com.tencent.mm.modelstat.d.b(3, "ContactLabelEditUI" + bJj(), hashCode());
    aw.Rg().a(636, this);
    PJ(this.nHC);
    bJd();
    super.onResume();
    AppMethodBeat.o(22558);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22564);
    ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramm.getType())
    {
    default:
    case 635:
    case 637:
    case 638:
    case 636:
    }
    while (true)
    {
      AppMethodBeat.o(22564);
      while (true)
      {
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = ((a)paramm).bJb().vEm;
          if ((paramString != null) && (paramString.size() > 0))
          {
            paramString = (axj)paramString.get(0);
            ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", new Object[] { paramString.wBr, paramString.wBq });
            this.nHD = paramString.wBr;
            bJg();
            AppMethodBeat.o(22564);
          }
          else
          {
            bJf();
            AppMethodBeat.o(22564);
          }
        }
        else
        {
          bJf();
          AppMethodBeat.o(22564);
          continue;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramm = this.nHD;
            String str = this.nHC;
            ab.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doInsertOrUpdateLable]");
            try
            {
              paramInt1 = Integer.valueOf(paramm).intValue();
              if (paramInt1 != -1)
              {
                paramm = e.bIZ().aoF(paramm);
                paramString = paramm;
                if (paramm == null)
                  paramString = new af();
                paramString.field_labelID = paramInt1;
                paramString.field_labelName = str;
                paramString.field_labelPYFull = g.vo(str);
                paramString.field_labelPYShort = g.vp(str);
                e.bIZ().b(true, paramString, new String[] { "labelID" });
                bJg();
                AppMethodBeat.o(22564);
              }
            }
            catch (Exception paramString)
            {
              while (true)
              {
                ab.e("MicroMsg.Label.ContactLabelEditUI", "id is not integer type:%s", new Object[] { String.valueOf(paramm) });
                paramInt1 = -1;
                continue;
                bJf();
              }
            }
          }
          else
          {
            bJf();
            AppMethodBeat.o(22564);
            continue;
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              bJe();
              if (this.mHandler == null)
                break;
              this.mHandler.sendEmptyMessageDelayed(6002, 300L);
              AppMethodBeat.o(22564);
              continue;
            }
            bJf();
            AppMethodBeat.o(22564);
            continue;
            if ((paramInt1 != 0) || (paramInt2 != 0))
              break label493;
            a(this.nHE);
            if (this.mHandler == null)
              break;
            this.mHandler.sendEmptyMessageDelayed(6002, 300L);
            AppMethodBeat.o(22564);
          }
        }
      }
      label493: ab.w("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] delete fail.");
      bJh();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI
 * JD-Core Version:    0.6.2
 */