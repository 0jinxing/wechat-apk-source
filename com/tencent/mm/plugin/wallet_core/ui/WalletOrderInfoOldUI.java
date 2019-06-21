package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.iy.a;
import com.tencent.mm.g.a.se;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.fingerprint.b.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.wallet_core.c.aa;
import com.tencent.mm.plugin.wallet_core.c.n;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.plugin.wallet_core.model.Orders.a;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoOldUI extends WalletOrderInfoUI
{
  protected boolean ctK;
  protected boolean ctL;
  protected boolean ctM;
  protected String igi;
  protected String mAppId;
  protected String oXY;
  protected PayInfo pVL;
  private String pVl;
  private com.tencent.mm.sdk.b.c pap;
  protected String pdC;
  protected boolean tEC;
  private HashMap<String, WalletOrderInfoOldUI.b> tEH;
  protected String tEI;
  protected LinearLayout tIK;
  protected TextView tIL;
  protected TextView tIM;
  protected WalletOrderInfoOldUI.a tIN;
  protected String tIO;
  protected HashMap<String, TextView> tIP;
  protected WalletOrderInfoOldUI.c tIQ;
  protected Map<Long, String> tIR;
  private WalletOrderInfoOldUI.d tIS;
  private boolean tIT;
  protected ao.b.a tIU;
  private View.OnLongClickListener tIV;
  protected Set<String> tIc;
  protected List<Orders.Commodity> tId;
  private com.tencent.mm.sdk.b.c tIy;
  protected Orders tog;

  public WalletOrderInfoOldUI()
  {
    AppMethodBeat.i(47498);
    this.tIK = null;
    this.tIL = null;
    this.tIM = null;
    this.tId = null;
    this.tIN = null;
    this.igi = null;
    this.pdC = null;
    this.tEC = false;
    this.tIc = null;
    this.mAppId = "";
    this.tIO = null;
    this.ctK = true;
    this.ctL = false;
    this.ctM = false;
    this.tIP = new HashMap();
    this.tIR = new HashMap();
    this.tEH = new HashMap();
    this.tIT = false;
    this.pap = new WalletOrderInfoOldUI.5(this);
    this.tIU = new WalletOrderInfoOldUI.6(this);
    this.tIV = new WalletOrderInfoOldUI.11(this);
    this.tIy = new WalletOrderInfoOldUI.3(this);
    AppMethodBeat.o(47498);
  }

  private void Kh()
  {
    int i = 1;
    AppMethodBeat.i(47499);
    com.tencent.mm.wallet_core.c localc = com.tencent.mm.wallet_core.a.aE(this);
    this.pVL = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
    this.oXY = this.mBundle.getString("key_trans_id");
    this.mBundle.getInt("key_pay_type", -1);
    ab.i("MicroMsg.WalletOrderInfoOldUI", "mTransId %s", new Object[] { this.oXY });
    this.tog = cRD();
    int j;
    boolean bool2;
    if (this.tog != null)
    {
      AM(0);
      d(this.tog);
      if ((localc != null) && (this.tog != null) && (this.pVL != null))
      {
        this.mAppId = this.pVL.appId;
        boolean bool1 = localc.dNG();
        com.tencent.mm.plugin.wallet_core.utils.d.a(this, this.mBundle, 7);
        if (this.mBundle.getInt("key_support_bankcard", 1) == 2)
        {
          j = 2;
          com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
          int k = this.pVL.cIf;
          if (this.pVL.cIf != 3)
            break label436;
          bool2 = true;
          label187: if (!bool1)
            break label442;
          label191: localh.e(10691, new Object[] { Integer.valueOf(k), Boolean.valueOf(bool2), Integer.valueOf(i), Integer.valueOf(com.tencent.mm.wallet_core.c.z.dNX()), Integer.valueOf((int)(this.tog.pTN * 100.0D)), this.tog.pcl, Integer.valueOf(j) });
        }
      }
      else
      {
        if (((!com.tencent.mm.plugin.wallet_core.model.r.cPI().cQg()) && (localc != null) && (localc.dNG())) || (!com.tencent.mm.model.r.YI()))
          com.tencent.mm.model.r.YJ();
        if ((this.tog == null) || (this.tog.tAq == null) || (this.tog.tAq.size() <= 0))
          break label447;
        this.tId = this.tog.tAq;
        this.oXY = ((Orders.Commodity)this.tId.get(0)).cAa;
        if ((this.pVL != null) && (localc != null) && ((localc.dNF()) || (localc.dNG())))
          cRI();
        label394: if (this.oXY != null)
          break label520;
        if (((i)com.tencent.mm.kernel.g.K(i.class)).g(this))
          this.tIT = false;
        AppMethodBeat.o(47499);
      }
    }
    while (true)
    {
      return;
      j = 1;
      break;
      label436: bool2 = false;
      break label187;
      label442: i = 2;
      break label191;
      label447: ab.c("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131305049, 0, new WalletOrderInfoOldUI.1(this));
      break label394;
      ab.c("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131305049, 0, new WalletOrderInfoOldUI.4(this));
      label520: AppMethodBeat.o(47499);
    }
  }

  private void cRK()
  {
    AppMethodBeat.i(47520);
    if ((this.tog != null) && (this.tog.tAq != null) && (this.tog.tAq.size() > 0) && (((Orders.Commodity)this.tog.tAq.get(0)).tBc != null) && (!bo.isNullOrNil(((Orders.Commodity)this.tog.tAq.get(0)).tBc.text)) && (!bo.isNullOrNil(((Orders.Commodity)this.tog.tAq.get(0)).tBc.url)))
    {
      this.tIM.setVisibility(0);
      this.tIM.setText(((Orders.Commodity)this.tog.tAq.get(0)).tBc.text);
      this.tIM.setOnClickListener(new WalletOrderInfoOldUI.10(this));
      AppMethodBeat.o(47520);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletOrderInfoOldUI", "hy: no commodity or no link act or link act is illegal!");
      this.tIM.setVisibility(8);
      AppMethodBeat.o(47520);
    }
  }

  private void d(Orders paramOrders)
  {
    AppMethodBeat.i(47506);
    this.tIc.clear();
    if ((paramOrders == null) || (paramOrders.tAq == null))
    {
      ab.w("MicroMsg.WalletOrderInfoOldUI", "hy: orders is null");
      AppMethodBeat.o(47506);
    }
    while (true)
    {
      return;
      Iterator localIterator = paramOrders.tAq.iterator();
      while (localIterator.hasNext())
      {
        paramOrders = (Orders.Commodity)localIterator.next();
        if ((paramOrders.tAh == 2) && (!bo.isNullOrNil(paramOrders.tAS)))
        {
          ab.d("MicroMsg.WalletOrderInfoOldUI", "hy: has username and is force recommend");
          this.tIc.add(paramOrders.tAS);
        }
      }
      AppMethodBeat.o(47506);
    }
  }

  protected final void S(ad paramad)
  {
    AppMethodBeat.i(47512);
    if ((paramad != null) && ((int)paramad.ewQ != 0))
    {
      String str = paramad.Oi();
      ab.d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer nickName " + str + " username: " + paramad.field_username);
      if ((this.tId != null) && (this.tId.size() > 0))
      {
        Iterator localIterator = this.tId.iterator();
        while (localIterator.hasNext())
          ((Orders.Commodity)localIterator.next()).pcm = str;
        this.tIN.notifyDataSetChanged();
      }
      this.igi = paramad.field_username;
    }
    AppMethodBeat.o(47512);
  }

  protected final void a(Orders.Promotions paramPromotions)
  {
    AppMethodBeat.i(47505);
    a(new n(paramPromotions, cNH(), this.oXY, paramPromotions.tzR), true, false);
    AppMethodBeat.o(47505);
  }

  protected final void a(String paramString, WalletOrderInfoOldUI.d paramd)
  {
    AppMethodBeat.i(47509);
    cRq();
    this.tIS = paramd;
    e.a(this, paramString, false, 1);
    this.tIT = false;
    AppMethodBeat.o(47509);
  }

  protected final void acZ(String paramString)
  {
    AppMethodBeat.i(47510);
    cRq();
    e.n(this, paramString, false);
    this.tIT = false;
    AppMethodBeat.o(47510);
  }

  protected void adb(String paramString)
  {
    AppMethodBeat.i(47503);
    a(new com.tencent.mm.plugin.wallet_core.c.z(paramString), true, true);
    AppMethodBeat.o(47503);
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47521);
    int i;
    label291: boolean bool;
    if (((paramm instanceof aa)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      aa localaa = (aa)paramm;
      WalletOrderInfoOldUI.b localb = new WalletOrderInfoOldUI.b(this, localaa.hwh);
      if ((!bo.isNullOrNil(localb.url)) && (!bo.isNullOrNil(localb.cEh)))
      {
        i = 1;
        if (i != 0)
          this.tEH.put(localaa.tuv, localb);
        this.tIN.notifyDataSetChanged();
      }
    }
    else
    {
      if (!(paramm instanceof com.tencent.mm.plugin.wallet_core.c.z))
        break label360;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        AM(0);
        this.tog = ((com.tencent.mm.plugin.wallet_core.c.z)paramm).tux;
        if (this.tog != null)
          this.tId = this.tog.tAq;
        d(this.tog);
        ab.d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + this.tId);
        if ((this.tId != null) && (this.tId.size() != 0))
        {
          paramm = (Orders.Commodity)this.tId.get(0);
          this.oXY = paramm.cAa;
          ab.d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + paramm.toString());
          paramString = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramm.pcm);
          if ((paramString == null) || ((int)paramString.ewQ == 0))
            break label338;
          S(paramString);
          this.tIN.notifyDataSetChanged();
          cRJ();
        }
      }
      if (this.tIN != null)
        this.tIN.notifyDataSetChanged();
      cRK();
      AppMethodBeat.o(47521);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label338: ao.a.flu.a(paramm.pcm, "", this.tIU);
      break label291;
      label360: if ((paramm instanceof n))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramm = (n)paramm;
          paramString = paramm.tud;
          long l = paramm.tug.ttW;
          this.tIR.put(Long.valueOf(l), paramString);
          paramm.tug.tzS = paramm.ehr;
          if ((!"-1".equals(paramString)) && (!"0".equals(paramString)) && (!bo.isNullOrNil(paramm.tue)))
            com.tencent.mm.ui.base.h.b(this, paramm.tue, "", true);
          while (!"0".equals(paramString))
          {
            this.tIN.notifyDataSetChanged();
            AppMethodBeat.o(47521);
            bool = true;
            break;
          }
          if (!bo.isNullOrNil(paramm.tue));
          for (paramString = paramm.tue; ; paramString = getString(2131305156))
          {
            Toast.makeText(this, paramString, 0).show();
            break;
          }
        }
        if ((paramm instanceof n))
        {
          paramm = paramString;
          if (bo.isNullOrNil(paramString))
            paramm = getString(2131305389);
          com.tencent.mm.ui.base.h.a(this, paramm, null, false, new WalletOrderInfoOldUI.2(this));
          AppMethodBeat.o(47521);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(47521);
        bool = false;
      }
    }
  }

  protected Orders cRD()
  {
    AppMethodBeat.i(47501);
    Orders localOrders = (Orders)this.mBundle.getParcelable("key_orders");
    AppMethodBeat.o(47501);
    return localOrders;
  }

  public final void cRH()
  {
    AppMethodBeat.i(47515);
    cRq();
    this.tIT = false;
    Object localObject1 = new com.tencent.mm.g.a.ap();
    ((com.tencent.mm.g.a.ap)localObject1).ctF.ctG = true;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    Bundle localBundle = new Bundle();
    localBundle.putInt("intent_pay_end_errcode", this.mBundle.getInt("intent_pay_end_errcode"));
    localBundle.putString("intent_pay_app_url", this.mBundle.getString("intent_pay_app_url"));
    localBundle.putBoolean("intent_pay_end", this.mBundle.getBoolean("intent_pay_end"));
    ab.i("MicroMsg.WalletOrderInfoOldUI", "pay done...feedbackData errCode:" + this.mBundle.getInt("intent_pay_end_errcode"));
    Iterator localIterator = this.tIc.iterator();
    Object localObject2;
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (!bo.isNullOrNil(str1))
      {
        ab.i("MicroMsg.WalletOrderInfoOldUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str1 });
        if ((this.tog == null) || (this.pVL == null))
          break label339;
        localObject2 = com.tencent.mm.kernel.g.RO().eJo;
        String str2 = this.tog.czZ;
        if (this.tog.tAq.size() <= 0)
          break label333;
        localObject1 = ((Orders.Commodity)this.tog.tAq.get(0)).cAa;
        label250: ((p)localObject2).a(new com.tencent.mm.wallet_core.c.r(str1, str2, (String)localObject1, this.pVL.cIf, this.pVL.cIb, this.tog.tAh), 0);
      }
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13033, new Object[] { Integer.valueOf(2), str1, "", "", "" });
        break;
        label333: localObject1 = "";
        break label250;
        label339: com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.wallet_core.c.r(str1), 0);
      }
    }
    com.tencent.mm.wallet_core.a.j(this, localBundle);
    if ((this.tog != null) && (!bo.isNullOrNil(this.tog.lvz)))
      if (this.tog.tAq.size() <= 0)
        break label538;
    label538: for (localObject1 = ((Orders.Commodity)this.tog.tAq.get(0)).cAa; ; localObject1 = "")
    {
      localObject2 = d(this.tog.lvz, this.tog.czZ, (String)localObject1, this.pVL.kck, this.pVL.hHV);
      ab.d("MicroMsg.WalletOrderInfoOldUI", "url = ".concat(String.valueOf(localObject2)));
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
      ((Intent)localObject1).putExtra("showShare", false);
      ((Intent)localObject1).putExtra("geta8key_username", com.tencent.mm.model.r.Yz());
      ((Intent)localObject1).putExtra("stastic_scene", 8);
      com.tencent.mm.bp.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject1);
      AppMethodBeat.o(47515);
      return;
    }
  }

  protected void cRI()
  {
    AppMethodBeat.i(47502);
    a(new y(cNH(), 21), true, true);
    AppMethodBeat.o(47502);
  }

  protected final void cRJ()
  {
    AppMethodBeat.i(47508);
    if (this.tog != null)
    {
      this.tId = this.tog.tAq;
      Iterator localIterator = this.tId.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!"1".equals(((Orders.Commodity)localIterator.next()).pce));
    }
    for (int i = 0; ; i = 1)
    {
      this.tIK.setVisibility(0);
      this.tIL.setVisibility(0);
      if (i != 0)
        if ((!bo.isNullOrNil(this.tog.tAj)) && (!bo.isNullOrNil(this.tog.tAj.trim())))
        {
          this.tIL.setText(this.tog.tAj);
          AppMethodBeat.o(47508);
        }
      while (true)
      {
        return;
        if (this.tog.tuo != 1)
        {
          this.tIL.setText(2131305069);
          AppMethodBeat.o(47508);
        }
        else
        {
          this.tIL.setText(2131305068);
          AppMethodBeat.o(47508);
          continue;
          this.tIL.setText(2131305070);
          AppMethodBeat.o(47508);
        }
      }
    }
  }

  protected final void cRq()
  {
    int i = 0;
    AppMethodBeat.i(47511);
    if (!this.tEC)
    {
      iy localiy = new iy();
      localiy.cEc.requestCode = 4;
      iy.a locala = localiy.cEc;
      if (this.mBundle.getBoolean("intent_pay_end", false))
        i = -1;
      locala.bFZ = i;
      com.tencent.mm.sdk.b.a.xxA.m(localiy);
      this.tEC = true;
    }
    AppMethodBeat.o(47511);
  }

  protected final boolean cgg()
  {
    return false;
  }

  public void done()
  {
    AppMethodBeat.i(47514);
    if (this.mBundle.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.mBundle.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoOldUI");
        localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        boolean bool = localRealnameGuideHelper.b(this, localBundle, new WalletOrderInfoOldUI.8(this));
        this.mBundle.remove("key_realname_guide_helper");
        if (!bool)
          cRH();
      }
      AppMethodBeat.o(47514);
    }
    while (true)
    {
      return;
      cRH();
      AppMethodBeat.o(47514);
    }
  }

  protected final void dt(String paramString, int paramInt)
  {
    AppMethodBeat.i(47504);
    a(new com.tencent.mm.plugin.wallet_core.c.z(paramString, paramInt), true, true);
    AppMethodBeat.o(47504);
  }

  public final int getLayoutId()
  {
    return 2130971138;
  }

  public final void initView()
  {
    AppMethodBeat.i(47507);
    setMMTitle(2131305083);
    showHomeBtn(false);
    enableBackMenu(false);
    String str = getString(2131296944);
    Object localObject;
    if ((this.pVL != null) && (this.pVL.cIf == 2))
      if (!bo.isNullOrNil(this.pVL.tRb))
        localObject = getString(2131296530) + this.pVL.tRb;
    while (true)
    {
      addTextOptionMenu(0, (String)localObject, new WalletOrderInfoOldUI.7(this));
      this.tIK = ((LinearLayout)findViewById(2131828919));
      this.tIL = ((TextView)findViewById(2131828920));
      this.tIM = ((TextView)findViewById(2131828922));
      localObject = (MaxListView)findViewById(2131828921);
      this.tIN = new WalletOrderInfoOldUI.a(this);
      ((MaxListView)localObject).setAdapter(this.tIN);
      cRJ();
      cRK();
      ((ScrollView)findViewById(2131823366)).pageScroll(33);
      AppMethodBeat.o(47507);
      return;
      localObject = str;
      if (!bo.isNullOrNil(this.pVL.appId))
      {
        localObject = str;
        if (!bo.isNullOrNil(com.tencent.mm.pluginsdk.model.app.g.t(this, this.pVL.appId)))
        {
          localObject = getString(2131296530) + com.tencent.mm.pluginsdk.model.app.g.t(this, this.pVL.appId);
          continue;
          localObject = str;
          if (this.tog != null)
          {
            localObject = str;
            if (!bo.isNullOrNil(this.tog.tAB))
              localObject = this.tog.tAB;
          }
        }
      }
    }
  }

  public final String lJ(long paramLong)
  {
    AppMethodBeat.i(47522);
    String str;
    if (this.tIR.containsKey(Long.valueOf(paramLong)))
    {
      str = (String)this.tIR.get(Long.valueOf(paramLong));
      AppMethodBeat.o(47522);
    }
    while (true)
    {
      return str;
      str = "-1";
      AppMethodBeat.o(47522);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(47519);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.WalletOrderInfoOldUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
      a(new aa(this.tIS.tuv, this.tIS.tIF, this.tIS.tIG, this.tIS.tIH, this.tIS.cBT, this.tIS.pQe, this.tIS.tBC), true, true);
    AppMethodBeat.o(47519);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47500);
    super.onCreate(paramBundle);
    AM(4);
    this.tIc = new HashSet();
    Kh();
    initView();
    nf(1979);
    com.tencent.mm.sdk.b.a.xxA.c(this.tIy);
    com.tencent.mm.sdk.b.a.xxA.c(this.pap);
    this.tIT = false;
    AppMethodBeat.o(47500);
  }

  @Deprecated
  public Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(47517);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131305064), getResources().getStringArray(2131755065), "", new WalletOrderInfoOldUI.9(this));
    AppMethodBeat.o(47517);
    return localDialog;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47513);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.tIy);
    com.tencent.mm.sdk.b.a.xxA.d(this.pap);
    ng(1979);
    AppMethodBeat.o(47513);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47516);
    boolean bool;
    if (paramInt == 4)
    {
      done();
      bool = true;
      AppMethodBeat.o(47516);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(47516);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(47518);
    super.onResume();
    ab.i("MicroMsg.WalletOrderInfoOldUI", "onResume, isClickActivityTinyApp: %s", new Object[] { Boolean.valueOf(this.tIT) });
    if (this.tIT)
      a(new aa(this.tIS.tuv, this.tIS.tIF, this.tIS.tIG, this.tIS.tIH, this.tIS.cBT, this.tIS.pQe, this.tIS.tBC), true, true);
    AppMethodBeat.o(47518);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI
 * JD-Core Version:    0.6.2
 */