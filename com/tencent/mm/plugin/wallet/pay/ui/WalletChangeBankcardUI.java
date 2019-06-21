package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.ut;
import com.tencent.mm.g.a.vd;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.pay.a.c.f;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.ui.d;
import com.tencent.mm.plugin.wallet_core.ui.i;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.z;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletChangeBankcardUI extends WalletBaseUI
  implements a.a
{
  public static int toB = 1;
  protected int cIf;
  public String gHr;
  protected TextView klD;
  protected Button pTi;
  private com.tencent.mm.sdk.b.c pUc;
  protected PayInfo pVL;
  protected Orders pWy;
  public ArrayList<Bankcard> tgB;
  protected Bankcard tgC;
  protected Authen tms;
  protected ListView toC;
  public q toD;
  protected int toE;
  public i toF;
  protected String toG;
  public FavorPayInfo toH;
  private a toI;
  d toJ;
  private boolean toK;

  public WalletChangeBankcardUI()
  {
    AppMethodBeat.i(45965);
    this.cIf = 0;
    this.tgC = null;
    this.toF = null;
    this.tms = null;
    this.pWy = null;
    this.pVL = null;
    this.toG = null;
    this.toJ = null;
    this.pUc = new WalletChangeBankcardUI.1(this);
    this.toK = false;
    AppMethodBeat.o(45965);
  }

  private void cNN()
  {
    AppMethodBeat.i(45966);
    Object localObject = com.tencent.mm.wallet_core.a.aE(this);
    if (localObject != null)
      ((com.tencent.mm.wallet_core.c)localObject).c(this, 1);
    while (true)
    {
      localObject = new vd();
      ((vd)localObject).cSa.result = -1;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(45966);
      return;
      finish();
    }
  }

  private ArrayList<Bankcard> cNO()
  {
    AppMethodBeat.i(45969);
    ArrayList localArrayList;
    if (this.cIf == 8)
    {
      localArrayList = (ArrayList)ac.ne(true);
      AppMethodBeat.o(45969);
    }
    while (true)
    {
      return localArrayList;
      localArrayList = (ArrayList)ac.ne(false);
      AppMethodBeat.o(45969);
    }
  }

  protected void Hf(int paramInt)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(45974);
    int k;
    if (this.tgB != null)
    {
      k = this.tgB.size();
      ab.i("MicroMsg.WalletChangeBankcardUI", "on select bankcard: %s, %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(k) });
      if ((this.tgB == null) || (paramInt >= k))
        break label184;
      Bankcard localBankcard = (Bankcard)this.tgB.get(paramInt);
      this.tgC = localBankcard;
      if (this.pVL != null)
        break label161;
      paramInt = j;
      label92: if (this.pVL != null)
        break label172;
      localObject = "";
      label103: ad.e(paramInt, (String)localObject, 13, this.tgC.field_bindSerial);
      this.toF.tGL = localBankcard.field_bindSerial;
      this.pTi.setEnabled(true);
      this.toF.notifyDataSetChanged();
      cNQ();
      AppMethodBeat.o(45974);
    }
    while (true)
    {
      return;
      k = 0;
      break;
      label161: paramInt = this.pVL.cIf;
      break label92;
      label172: localObject = this.pVL.czZ;
      break label103;
      label184: if (k != paramInt)
        break label290;
      localObject = com.tencent.mm.plugin.wallet_core.model.g.cPl();
      if (!((com.tencent.mm.plugin.wallet_core.model.g)localObject).aFF())
        break label228;
      com.tencent.mm.ui.base.h.b(this, ((com.tencent.mm.plugin.wallet_core.model.g)localObject).pbp, getString(2131297061), true);
      AppMethodBeat.o(45974);
    }
    label228: if (this.pVL == null)
    {
      paramInt = i;
      label237: if (this.pVL != null)
        break label309;
    }
    label290: label309: for (Object localObject = ""; ; localObject = this.pVL.czZ)
    {
      ad.e(paramInt, (String)localObject, 14, "");
      this.mBundle.putInt("key_err_code", -1003);
      this.mBundle.putBoolean("key_has_click_bind_new_card", true);
      com.tencent.mm.wallet_core.a.j(this, this.mBundle);
      AppMethodBeat.o(45974);
      break;
      paramInt = this.pVL.cIf;
      break label237;
    }
  }

  protected void acs(String paramString)
  {
    AppMethodBeat.i(45980);
    this.tms.twc = paramString;
    boolean bool = this.mBundle.getBoolean("key_has_click_bind_new_card", false);
    int i = this.mBundle.getInt("key_pay_flag");
    if ((bool) && (i == 3))
    {
      ab.i("MicroMsg.WalletChangeBankcardUI", "fix authen flag after bind card fail");
      this.tms.bJt = 3;
    }
    if (this.tgC != null)
    {
      this.mBundle.putString("key_mobile", this.tgC.field_mobile);
      this.mBundle.putParcelable("key_bankcard", this.tgC);
      this.tms.pbo = this.tgC.field_bindSerial;
      this.tms.pbn = this.tgC.field_bankcardType;
      if (this.toH == null)
        break label340;
      this.tms.two = this.toH.tzb;
      if (this.pWy.tAr != null)
        this.tms.twn = this.pWy.tAr.tmU;
      if ((this.pWy != null) && (this.pWy.tuo == 3))
      {
        if (!this.tgC.cPf())
          break label351;
        this.tms.bJt = 3;
        label212: Bundle localBundle = this.mBundle;
        if (this.tgC.cPf())
          break label363;
        bool = true;
        label230: localBundle.putBoolean("key_is_oversea", bool);
      }
    }
    this.mBundle.putString("key_pwd1", paramString);
    this.mBundle.putParcelable("key_authen", this.tms);
    paramString = com.tencent.mm.plugin.wallet.pay.a.a.a(this.tms, this.pWy, false);
    if (paramString != null)
    {
      paramString.eHT = "PayProcess";
      paramString.mBundle = this.mBundle;
      if ((this.pVL.cIf != 6) || (this.pVL.vwe != 100))
        break label368;
    }
    label340: label351: label363: label368: for (paramString.gOW = 100; ; paramString.gOW = this.pVL.cIf)
    {
      a(paramString, true, true);
      AppMethodBeat.o(45980);
      return;
      this.tms.two = null;
      break;
      this.tms.bJt = 6;
      break label212;
      bool = false;
      break label230;
    }
  }

  public final boolean bwP()
  {
    boolean bool = true;
    AppMethodBeat.i(45976);
    if (super.bwP())
      AppMethodBeat.o(45976);
    while (true)
    {
      return bool;
      if ((this.pVL == null) || (!this.pVL.mXg))
      {
        AppMethodBeat.o(45976);
        bool = false;
      }
      else if (this.pVL.mXg)
      {
        AppMethodBeat.o(45976);
      }
      else
      {
        s.cNC();
        if (!s.cND().cQg())
        {
          AppMethodBeat.o(45976);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(45976);
          bool = false;
        }
      }
    }
  }

  public final boolean bwQ()
  {
    return true;
  }

  public final void bwW()
  {
    AppMethodBeat.i(45982);
    dOy();
    com.tencent.mm.wallet_core.c localc = com.tencent.mm.wallet_core.a.aE(this);
    if (localc != null)
    {
      localc.b(this, this.mBundle);
      AppMethodBeat.o(45982);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(45982);
    }
  }

  public final void c(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(45984);
    ab.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback");
    if (paramBoolean)
    {
      ab.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is true");
      this.pVL.cBU = paramString1;
      this.pVL.cBV = paramString2;
      acs(this.gHr);
      AppMethodBeat.o(45984);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is false");
      acs(this.gHr);
      AppMethodBeat.o(45984);
    }
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = false;
    int i = 0;
    boolean bool2 = true;
    AppMethodBeat.i(45978);
    boolean bool3;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof f))
      {
        AppMethodBeat.o(45978);
        bool3 = bool2;
      }
    while (true)
    {
      label41: return bool3;
      if ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
      {
        paramString = this.mBundle;
        paramm = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramm;
        if (!bo.isNullOrNil(this.gHr))
          paramString.putString("key_pwd1", this.gHr);
        paramString.putString("kreq_token", paramm.token);
        paramString.putParcelable("key_authen", paramm.toh);
        label120: Object localObject1;
        Object localObject2;
        if (!paramm.tof)
        {
          bool3 = true;
          paramString.putBoolean("key_need_verify_sms", bool3);
          paramString.putParcelable("key_pay_info", this.pVL);
          paramString.putInt("key_pay_flag", 3);
          paramString.putInt("key_can_verify_tail", paramm.tol);
          paramString.putString("key_verify_tail_wording", paramm.tom);
          localObject1 = paramm.oYc;
          localObject2 = this.mBundle;
          if (paramm.ton != 1)
            break label423;
          bool3 = true;
          label197: ((Bundle)localObject2).putBoolean("key_block_bind_new_card", bool3);
          if (!bo.isNullOrNil(paramm.toi))
            break label429;
          paramString.putString("key_mobile", this.tgC.field_mobile);
          label232: paramString.putString("key_QADNA_URL", paramm.toj);
          if (localObject1 != null)
            paramString.putParcelable("key_realname_guide_helper", (Parcelable)localObject1);
          localObject1 = new Bundle();
          ((Bundle)localObject1).putString("pwd", this.gHr);
          localObject2 = (l)com.tencent.mm.kernel.g.K(l.class);
          if (!((l)localObject2).bxe())
            break label444;
          paramInt1 = 1;
        }
        while (true)
        {
          ((Bundle)localObject1).putInt("key_open_biometric_type", paramInt1);
          ((l)localObject2).a(paramm.cNJ(), true, (Bundle)localObject1);
          if (paramm.tpw)
          {
            paramString.putParcelable("key_orders", paramm.tog);
            if ((this.pVL != null) && (this.pVL.cIf == 8))
            {
              paramm = new ut();
              paramm.cRA.cRB = this.tms.pbo;
              com.tencent.mm.sdk.b.a.xxA.m(paramm);
            }
          }
          com.tencent.mm.wallet_core.a.j(this, paramString);
          AppMethodBeat.o(45978);
          bool3 = bool2;
          break;
          bool3 = false;
          break label120;
          label423: bool3 = false;
          break label197;
          label429: paramString.putString("key_mobile", paramm.toi);
          break label232;
          label444: paramInt1 = i;
          if (((l)localObject2).bxh())
            paramInt1 = 2;
        }
        paramString = new Bundle();
        paramString.putString("pwd", this.gHr);
        this.mBundle.putBoolean("key_need_verify_sms", false);
        paramm = (l)com.tencent.mm.kernel.g.K(l.class);
        if (this.tms.pGr.tKd != 1)
          break label596;
      }
      label596: for (bool3 = true; ; bool3 = false)
      {
        paramm.a(bool3, true, paramString);
        switch (paramInt2)
        {
        default:
          AppMethodBeat.o(45978);
          bool3 = false;
          break label41;
        case 100000:
        case 100001:
        case 100102:
        case 100100:
        case 100101:
        }
      }
      this.pVL.vwi = paramInt2;
      cNQ();
      AppMethodBeat.o(45978);
      bool3 = bool2;
      continue;
      this.pVL.vwi = paramInt2;
      bool3 = bool1;
      if (paramInt2 == 100100)
        bool3 = true;
      if (this.toI == null)
        this.toI = new a(this, this);
      this.toI.a(bool3, this.pVL.cBS, this.pVL.czZ);
      ab.i("MicroMsg.WalletChangeBankcardUI", "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is ".concat(String.valueOf(bool3)));
      AppMethodBeat.o(45978);
      bool3 = bool2;
    }
  }

  protected i cNP()
  {
    AppMethodBeat.i(45972);
    i locali = new i(this, this.tgB, this.toE, this.pWy);
    AppMethodBeat.o(45972);
    return locali;
  }

  protected void cNQ()
  {
    AppMethodBeat.i(45979);
    ab.i("MicroMsg.WalletChangeBankcardUI", "pay with old bankcard!");
    this.mBundle.getString("key_pwd1");
    this.toK = false;
    AM(4);
    this.toD = q.a(this, this.pWy, this.toH, this.tgC, this.pVL, new WalletChangeBankcardUI.5(this), new WalletChangeBankcardUI.6(this), new WalletChangeBankcardUI.7(this));
    this.toJ = this.toD;
    AppMethodBeat.o(45979);
  }

  public final boolean cNR()
  {
    return true;
  }

  public final void cu()
  {
    AppMethodBeat.i(45973);
    this.klD = ((TextView)findViewById(2131828577));
    if ((this.toH != null) && (!bo.isNullOrNil(this.toH.tzf)))
    {
      this.klD.setVisibility(0);
      this.klD.setText(this.toH.tzf);
      AppMethodBeat.o(45973);
    }
    while (true)
    {
      return;
      if (this.mBundle.getInt("key_main_bankcard_state", 0) != 0)
      {
        this.klD.setVisibility(0);
        this.klD.setText(this.toG);
        AppMethodBeat.o(45973);
      }
      else
      {
        this.klD.setVisibility(8);
        AppMethodBeat.o(45973);
      }
    }
  }

  public int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971079;
  }

  public final void initView()
  {
    AppMethodBeat.i(45971);
    this.pTi = ((Button)findViewById(2131828747));
    this.pTi.setEnabled(false);
    this.pTi.setOnClickListener(new WalletChangeBankcardUI.3(this));
    if (bo.isNullOrNil(this.mBundle.getString("key_pwd1")))
      this.pTi.setText(2131296994);
    while (true)
    {
      this.toC = ((ListView)findViewById(2131828588));
      this.toF = cNP();
      this.toC.setAdapter(this.toF);
      this.toC.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(45961);
          WalletChangeBankcardUI.this.Hf(paramAnonymousInt);
          AppMethodBeat.o(45961);
        }
      });
      cu();
      AppMethodBeat.o(45971);
      return;
      this.pTi.setText(2131305240);
    }
  }

  protected final void mW(boolean paramBoolean)
  {
    AppMethodBeat.i(45983);
    this.tgB = cNO();
    int i;
    if (this.toH != null)
    {
      if (this.toH.tzc != 0)
      {
        i = 1;
        if ((i != 0) && (paramBoolean))
          break label53;
      }
    }
    else
      AppMethodBeat.o(45983);
    while (true)
    {
      return;
      i = 0;
      break;
      label53: String str = this.toH.tzd;
      ArrayList localArrayList = new ArrayList();
      i = 0;
      if (i < this.tgB.size())
      {
        Bankcard localBankcard = (Bankcard)this.tgB.get(i);
        if (bo.isNullOrNil(str))
          if (!localBankcard.field_bankcardType.equalsIgnoreCase("CFT"))
            localArrayList.add(localBankcard);
        while (true)
        {
          i++;
          break;
          if (localBankcard.field_bankcardType.equals(str))
            localArrayList.add(localBankcard);
        }
      }
      this.tgB = localArrayList;
      AppMethodBeat.o(45983);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45967);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.WalletChangeBankcardUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == toB)
      cNN();
    AppMethodBeat.o(45967);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45968);
    super.onCreate(paramBundle);
    setMMTitle(2131305353);
    paramBundle = this.mBundle;
    paramBundle.putInt("key_err_code", 0);
    this.toE = paramBundle.getInt("key_support_bankcard", 1);
    this.tms = ((Authen)paramBundle.getParcelable("key_authen"));
    this.pWy = ((Orders)paramBundle.getParcelable("key_orders"));
    this.pVL = ((PayInfo)paramBundle.getParcelable("key_pay_info"));
    this.toH = ((FavorPayInfo)paramBundle.getParcelable("key_favor_pay_info"));
    int i;
    if (this.pVL == null)
    {
      i = 0;
      this.cIf = i;
      ab.i("MicroMsg.WalletChangeBankcardUI", "pay_scene %d", new Object[] { Integer.valueOf(this.cIf) });
      if (!this.mBundle.getBoolean("key_is_filter_bank_type"))
        break label309;
      mW(true);
    }
    while (true)
    {
      if ((this.pWy != null) && (this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
        this.toG = getString(2131304727, new Object[] { e.e(this.pWy.pTN, this.pWy.pcl), ((Orders.Commodity)this.pWy.tAq.get(0)).desc });
      initView();
      z.hL(7, 0);
      com.tencent.mm.sdk.b.a.xxA.c(this.pUc);
      if ((this.mBundle.getBoolean("key_is_filter_bank_type")) && (this.toF != null))
        this.toF.tGM = false;
      AppMethodBeat.o(45968);
      return;
      i = this.pVL.cIf;
      break;
      label309: this.tgB = cNO();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45970);
    if (this.toI != null)
    {
      this.toI.cNM();
      this.toI.release();
    }
    com.tencent.mm.sdk.b.a.xxA.d(this.pUc);
    this.toJ = null;
    super.onDestroy();
    AppMethodBeat.o(45970);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45977);
    Object localObject;
    int i;
    String str;
    boolean bool;
    if ((paramInt == 4) && (this.toH != null) && (this.tgB.size() == 0))
    {
      localObject = this.toH;
      if ((localObject != null) && (((FavorPayInfo)localObject).tzc != 0))
      {
        i = 1;
        if (i == 0)
          break label248;
        ab.i("MicroMsg.WalletChangeBankcardUI", "favor need bankcard bind but usr cancel");
        str = this.mBundle.getString("key_is_cur_bankcard_bind_serial");
        if (!bo.isNullOrNil(str))
          break label111;
        ab.e("MicroMsg.WalletChangeBankcardUI", "curBankcardBindSerial null & finish");
        bool = super.onKeyUp(paramInt, paramKeyEvent);
        AppMethodBeat.o(45977);
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label111: localObject = cNO();
      if ((localObject != null) && (this.tgC == null))
        for (i = 0; ; i++)
          if (i < ((List)localObject).size())
          {
            if (str.equals(((Bankcard)((List)localObject).get(i)).field_bindSerial))
            {
              ab.i("MicroMsg.WalletChangeBankcardUI", "get cur bankcard, bind_serial:".concat(String.valueOf(str)));
              this.tgC = ((Bankcard)((List)localObject).get(i));
            }
          }
          else
          {
            if (this.tgC != null)
              break label232;
            ab.e("MicroMsg.WalletChangeBankcardUI", "mDefaultBankcard still null & finish");
            bool = super.onKeyUp(paramInt, paramKeyEvent);
            AppMethodBeat.o(45977);
            break;
          }
      label232: cNQ();
      AppMethodBeat.o(45977);
      bool = true;
      continue;
      label248: bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(45977);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(45985);
    super.onPause();
    if (this.toJ != null)
      this.toJ.onActivityPause();
    AppMethodBeat.o(45985);
  }

  public void onResume()
  {
    AppMethodBeat.i(45975);
    this.mBundle.putInt("key_err_code", 0);
    super.onResume();
    if (this.toJ != null)
      this.toJ.cRm();
    AppMethodBeat.o(45975);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(45981);
    if (paramInt == 0)
    {
      bwW();
      AppMethodBeat.o(45981);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        this.mBundle.putString("key_pwd1", "");
        cNQ();
        AppMethodBeat.o(45981);
      }
      else
      {
        ab.w("MicroMsg.WalletChangeBankcardUI", "hy: clean ui data not handled");
        AppMethodBeat.o(45981);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI
 * JD-Core Version:    0.6.2
 */