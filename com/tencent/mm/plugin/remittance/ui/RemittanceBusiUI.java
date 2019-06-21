package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.fv;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.g.a.fw.a;
import com.tencent.mm.g.a.vc;
import com.tencent.mm.g.b.a.bh;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.remittance.model.BusiRemittanceResp;
import com.tencent.mm.plugin.remittance.model.k;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.abv;
import com.tencent.mm.protocal.protobuf.abw;
import com.tencent.mm.protocal.protobuf.bzp;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.protocal.protobuf.cz;
import com.tencent.mm.protocal.protobuf.lp;
import com.tencent.mm.protocal.protobuf.lr;
import com.tencent.mm.protocal.protobuf.lu;
import com.tencent.mm.protocal.protobuf.lv;
import com.tencent.mm.protocal.protobuf.mb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.picker.d.2;
import com.tencent.mm.ui.widget.picker.d.3;
import com.tencent.mm.ui.widget.picker.d.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class RemittanceBusiUI extends WalletBaseUI
{
  private String cEW;
  private int cKs;
  private ScrollView nsk;
  private String oXY;
  private int obL;
  private String pQW;
  private int pQY;
  private String pRC;
  private boolean pRH;
  private bh pRJ;
  private boolean pRM;
  private boolean pRP;
  private com.tencent.mm.sdk.b.c pRR;
  private LinearLayout pRm;
  private String pSD;
  private BusiRemittanceResp pSH;
  private TextView pSY;
  private TextView pSZ;
  private String pSy;
  private String pSz;
  private int pTA;
  private String pTB;
  private chl pTC;
  private String pTD;
  private int pTE;
  private int pTF;
  private int pTG;
  private int pTH;
  private String pTI;
  private b pTJ;
  private String pTK;
  private String pTL;
  boolean pTM;
  private double pTN;
  private boolean pTO;
  com.tencent.mm.plugin.remittance.model.g pTP;
  private RemittanceBusiUI.a pTQ;
  private RemittanceBusiUI.a pTR;
  private Map<String, cz> pTS;
  private Runnable pTT;
  private com.tencent.mm.wallet_core.d.c<com.tencent.mm.plugin.remittance.model.l> pTU;
  private b pTV;
  private boolean pTW;
  private double pTX;
  private String pTY;
  private String pTZ;
  private TextView pTa;
  private TextView pTb;
  private TextView pTc;
  private TextView pTd;
  private TextView pTe;
  private View pTf;
  private CdnImageView pTg;
  private WalletFormView pTh;
  private Button pTi;
  private LinearLayout pTj;
  private LinearLayout pTk;
  private TextView pTl;
  private View pTm;
  private TextView pTn;
  private String pTo;
  private double pTp;
  private String pTq;
  private String pTr;
  private String pTs;
  private String pTt;
  private String pTu;
  private int pTv;
  private String pTw;
  private boolean pTx;
  private String pTy;
  private int pTz;
  private com.tencent.mm.sdk.b.c pUa;
  private com.tencent.mm.sdk.b.c pUb;
  private com.tencent.mm.sdk.b.c pUc;

  public RemittanceBusiUI()
  {
    AppMethodBeat.i(44933);
    this.pTE = 0;
    this.pTF = 0;
    this.pTG = 0;
    this.pTH = 0;
    this.pTJ = new b();
    this.pTK = "";
    this.pTL = "";
    this.pTM = false;
    this.pTN = -1.0D;
    this.pTO = false;
    this.pTP = null;
    this.pRH = false;
    this.pTS = new HashMap();
    this.pTT = new RemittanceBusiUI.9(this);
    this.pTU = new RemittanceBusiUI.14(this);
    this.pTV = new b();
    this.pTW = true;
    this.cKs = 0;
    this.pTX = 0.0D;
    this.pTZ = "";
    this.pRR = new RemittanceBusiUI.19(this);
    this.pUa = new RemittanceBusiUI.20(this);
    this.pUb = new com.tencent.mm.sdk.b.c()
    {
    };
    this.pUc = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(44933);
  }

  private void VU(String paramString)
  {
    AppMethodBeat.i(44958);
    ab.i("MicroMsg.RemittanceBusiUI", "do pay check: %s", new Object[] { paramString });
    paramString = (cz)this.pTS.get(paramString);
    if (paramString == null)
      AppMethodBeat.o(44958);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.oXY))
        paramString.vFc = this.oXY;
      a(new com.tencent.mm.plugin.remittance.model.h(paramString, this.pTK), false, false);
      AppMethodBeat.o(44958);
    }
  }

  private void a(int paramInt, lp paramlp, boolean paramBoolean, fw paramfw, String paramString1, String paramString2)
  {
    AppMethodBeat.i(44949);
    int i = 0;
    int j = 0;
    if (!this.pTW)
    {
      boolean bool1 = bo.C(Double.valueOf(this.pTX), Double.valueOf(this.pTp));
      boolean bool2 = bo.isEqual(this.pTY, this.pSz);
      if (!bool1)
        j = 1;
      i = j;
      if (!bool2)
        i = j | 0x2;
    }
    String str1 = this.pRC;
    String str2 = this.pTo;
    j = this.pQY;
    String str3 = this.pTt;
    String str4 = this.pSz;
    int k = this.obL;
    String str5 = this.pTu;
    String str6 = this.pTy;
    int m = this.pTA;
    int n = this.pTz;
    String str7 = this.pTq;
    abv localabv = this.pTJ.pQG;
    if (paramlp == null)
    {
      paramlp = "";
      paramlp = new com.tencent.mm.plugin.remittance.model.i(str1, str2, j, str3, str4, paramInt, k, str5, str6, m, n, str7, localabv, paramlp, this.pSH.pOA, paramString1, this.pQW, paramString2, this.pTr, this.pTZ, this.cKs, i);
      if (paramBoolean)
      {
        paramlp.pOV = paramfw;
        paramString1 = (lu)paramlp.gme.fsG.fsP;
        if (paramfw.czT.czW != 1)
          break label286;
      }
    }
    label286: for (paramInt = 1; ; paramInt = 0)
    {
      paramString1.vPw = paramInt;
      a(paramlp, true, false);
      AppMethodBeat.o(44949);
      return;
      paramlp = paramlp.vPj;
      break;
    }
  }

  private void a(com.tencent.mm.plugin.remittance.model.c paramc, com.tencent.mm.plugin.remittance.model.d paramd, int paramInt)
  {
    AppMethodBeat.i(44941);
    int i;
    int j;
    int k;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    if (this.pTM)
    {
      this.pTn.setText(com.tencent.mm.wallet_core.ui.e.F(cfR()));
      al.af(this.pTT);
      this.pTp = cfR();
      long l = Math.round(this.pTp * 100.0D);
      if (l <= 0L)
      {
        this.pTJ.cft();
        this.pTe.setTextColor(-7829368);
        this.pTe.setText(this.pSH.pOz);
        if (this.pTP != null)
          this.pTP.pOQ = true;
        AppMethodBeat.o(44941);
        return;
      }
      i = (int)l;
      j = this.obL;
      k = this.pSH.pOA;
      str1 = this.pTt;
      str2 = this.pQW;
      str3 = this.pSH.pOB;
      str4 = this.pRC;
      str5 = this.pTq;
      str6 = this.pSH.pOC;
      if (paramc != null)
        break label235;
    }
    label235: for (int m = 0; ; m = 1)
    {
      this.pTP = new com.tencent.mm.plugin.remittance.model.g(i, j, k, str1, str2, str3, str4, str5, str6, m, paramc, paramd);
      al.n(this.pTT, paramInt);
      AppMethodBeat.o(44941);
      break;
    }
  }

  private void a(lv paramlv)
  {
    AppMethodBeat.i(44957);
    ab.i("MicroMsg.RemittanceBusiUI", "resp.payer_need_auth_flag %s", new Object[] { Integer.valueOf(paramlv.vPG) });
    if (paramlv.vPG == 1)
    {
      paramlv = new Bundle();
      com.tencent.mm.sdk.b.a.xxA.c(this.pUc);
      paramlv.putString("realname_verify_process_jump_activity", ".ui.RemittanceBusiUI");
      paramlv.putString("realname_verify_process_jump_plugin", "remittance");
      paramlv.putInt("real_name_verify_mode", 0);
      paramlv.putInt("entry_scene", this.pQY);
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, paramlv);
      AppMethodBeat.o(44957);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      Object localObject;
      if (!bo.isNullOrNil(this.pTI))
      {
        localObject = this.pTI;
        label132: localIntent.putExtra("INTENT_TITLE", (String)localObject);
        localIntent.putExtra("INTENT_CAN_TOUCH", this.pTE);
        localIntent.putExtra("INTENT_PAYFEE", com.tencent.mm.wallet_core.ui.e.F(0.0D));
        localIntent.putExtra("INTENT_REQKEY", paramlv.cBT);
        paramlv = paramlv.vPH;
      }
      try
      {
        localIntent.putExtra("INTENT_TOKENMESS", paramlv.toByteArray());
        com.tencent.mm.bp.d.b(this.mController.ylL, "wallet", "com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI", localIntent, 2);
        AppMethodBeat.o(44957);
        continue;
        String str = getString(2131305241);
        if (!bo.isNullOrNil(this.pTq))
        {
          com.tencent.mm.kernel.g.RQ();
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM(this.pTq);
          if (localObject != null)
          {
            localObject = ((ad)localObject).Oj();
            StringBuilder localStringBuilder = new StringBuilder().append(com.tencent.mm.wallet_core.ui.e.atA((String)localObject));
            if (bo.isNullOrNil(this.pTr));
            for (localObject = ""; ; localObject = "(" + this.pTr + ")")
            {
              localObject = bo.t(str, new Object[] { (String)localObject });
              break;
            }
          }
          ab.e("MicroMsg.RemittanceBusiUI", "can not found contact for user::" + this.pTq);
          localObject = "";
          break label132;
        }
        ab.e("MicroMsg.RemittanceBusiUI", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
        localObject = "";
      }
      catch (Exception paramlv)
      {
        ab.printErrStackTrace("MicroMsg.RemittanceBusiUI", paramlv, "", new Object[0]);
        AppMethodBeat.o(44957);
      }
    }
  }

  private void a(boolean paramBoolean, Intent paramIntent)
  {
    AppMethodBeat.i(44945);
    if (paramBoolean)
    {
      String str1 = paramIntent.getStringExtra("key_trans_id");
      double d = paramIntent.getDoubleExtra("key_total_fee", -1.0D);
      String str2 = paramIntent.getStringExtra("key_reqKey");
      ab.i("MicroMsg.RemittanceBusiUI", "onActivityResult _transId: %s _totalFee: %s", new Object[] { str1, Double.valueOf(d) });
      if (bo.isNullOrNil(this.oXY))
        this.oXY = str1;
      if (d >= 0.0D)
        this.pTN = d;
      if (this.pRH)
        com.tencent.mm.plugin.report.service.h.pYm.e(15386, new Object[] { Integer.valueOf(3), Integer.valueOf(2) });
      cfU();
      VU(str2);
    }
    while (true)
    {
      c(paramBoolean, paramIntent);
      AppMethodBeat.o(44945);
      while (true)
      {
        return;
        if (com.tencent.mm.plugin.wallet_core.utils.c.aw(paramIntent))
        {
          finish();
          AppMethodBeat.o(44945);
        }
        else
        {
          if (!com.tencent.mm.plugin.wallet_core.utils.c.ax(paramIntent))
            break;
          AppMethodBeat.o(44945);
        }
      }
      ab.i("MicroMsg.RemittanceBusiUI", "do NetSceneBusiF2fUnlockFavor");
      cfT();
    }
  }

  private boolean a(com.tencent.mm.plugin.remittance.model.i parami)
  {
    AppMethodBeat.i(44951);
    boolean bool1 = false;
    if (!this.pRM)
      bool1 = b(parami);
    boolean bool2 = bool1;
    if (!bool1)
      bool2 = c(parami);
    AppMethodBeat.o(44951);
    return bool2;
  }

  private void aY(int paramInt, String paramString)
  {
    AppMethodBeat.i(138551);
    this.pRJ = new bh();
    this.pRJ.cVR = 1L;
    this.pRJ.cVS = paramInt;
    this.pRJ.gd(paramString);
    this.pRJ.ajK();
    AppMethodBeat.o(138551);
  }

  private boolean b(com.tencent.mm.plugin.remittance.model.i parami)
  {
    AppMethodBeat.i(44952);
    boolean bool;
    if (!bo.isNullOrNil(parami.pOT.vPA))
    {
      this.pRM = true;
      aY(1, parami.pOT.vFb);
      e.cfP().a(parami.pOT.vPA, getString(2131297031), getString(2131302363), getString(2131296868), new RemittanceBusiUI.15(this, parami), new RemittanceBusiUI.16(this, parami));
      AppMethodBeat.o(44952);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44952);
    }
  }

  private void c(boolean paramBoolean, Intent paramIntent)
  {
    AppMethodBeat.i(44946);
    this.pTW = false;
    if (paramBoolean)
    {
      ab.i("MicroMsg.RemittanceBusiUI", "savePayInfo isOk = true");
      this.cKs = 1;
    }
    while (true)
    {
      ab.i("MicroMsg.RemittanceBusiUI", "savePayInfo() mLastPayResult:%s mLastTotalAmt:%s mLastPayerDesc:%s mLastF2fId:%s", new Object[] { Double.valueOf(this.pTX), Double.valueOf(this.pTX), this.pTY, this.pTZ });
      AppMethodBeat.o(44946);
      while (true)
      {
        return;
        if (paramIntent != null)
          break;
        AppMethodBeat.o(44946);
      }
      this.cKs = paramIntent.getIntExtra("key_pay_reslut_type", 3);
      this.pTX = this.pTp;
      this.pTY = this.pSz;
      this.pTZ = this.pSy;
    }
  }

  private boolean c(com.tencent.mm.plugin.remittance.model.i parami)
  {
    AppMethodBeat.i(44955);
    boolean bool;
    if (parami.pOT.vPB != null)
    {
      this.pRP = true;
      e.cfP().a(parami.pOT.kdU, "", parami.pOT.vPB.nZc, parami.pOT.vPB.nZb, new RemittanceBusiUI.17(this, parami), new RemittanceBusiUI.18(this));
      AppMethodBeat.o(44955);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44955);
    }
  }

  private void cS(final List<abw> paramList)
  {
    AppMethodBeat.i(44940);
    final com.tencent.mm.ui.widget.picker.d locald = new com.tencent.mm.ui.widget.picker.d(this);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.pTJ.pQG;
    Object localObject2 = new HashSet();
    final HashSet localHashSet = new HashSet();
    if ((this.pTJ.cfx()) && (localObject1 != null))
    {
      localObject1 = ((abv)localObject1).vPg.iterator();
      while (((Iterator)localObject1).hasNext())
        ((HashSet)localObject2).add(Long.valueOf(((abw)((Iterator)localObject1).next()).wjm));
    }
    localObject1 = paramList.iterator();
    for (int i = 0; ((Iterator)localObject1).hasNext(); i++)
      if (((HashSet)localObject2).contains(Long.valueOf(((abw)((Iterator)localObject1).next()).wjm)))
        localArrayList.add(Integer.valueOf(i));
    localObject2 = getString(2131302422);
    if ((localObject2 != null) && (((CharSequence)localObject2).length() > 0))
    {
      locald.zSw.setVisibility(0);
      locald.rMl.setText((CharSequence)localObject2);
    }
    locald.zSx = localArrayList;
    locald.rBl = new RemittanceBusiUI.6(this, paramList, localHashSet);
    locald.rBm = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        int i = 1;
        int j = 0;
        AppMethodBeat.i(44899);
        if (localHashSet.contains(Integer.valueOf(paramAnonymousInt)))
          AppMethodBeat.o(44899);
        while (true)
        {
          return;
          if (paramAnonymousInt < paramList.size())
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(15235, new Object[] { Integer.valueOf(4) });
            Object localObject1 = (abw)paramList.get(paramAnonymousInt);
            paramAnonymousMenuItem = locald;
            boolean bool;
            if (paramAnonymousMenuItem.zSy != null)
            {
              paramAnonymousMenuItem = paramAnonymousMenuItem.zSy.dLn();
              bool = paramAnonymousMenuItem.contains(Integer.valueOf(paramAnonymousInt));
              if (bool)
                break label214;
            }
            while (true)
            {
              localObject2 = new LinkedList();
              paramAnonymousMenuItem = paramAnonymousMenuItem.iterator();
              while (paramAnonymousMenuItem.hasNext())
              {
                int k = ((Integer)paramAnonymousMenuItem.next()).intValue();
                if ((k < paramList.size()) && ((i != 0) || (paramAnonymousInt != k)))
                  ((List)localObject2).add((abw)paramList.get(k));
              }
              paramAnonymousMenuItem = new ArrayList();
              break;
              label214: i = 0;
            }
            if (i != 0)
              ((List)localObject2).add(localObject1);
            b localb = RemittanceBusiUI.A(RemittanceBusiUI.this);
            if (i != 0);
            for (paramAnonymousMenuItem = (MenuItem)localObject1; ; paramAnonymousMenuItem = null)
            {
              localb.a((List)localObject2, paramAnonymousMenuItem);
              localObject1 = RemittanceBusiUI.A(RemittanceBusiUI.this).pQG;
              paramAnonymousMenuItem = new HashSet();
              if (localObject1 == null)
                break;
              localObject1 = ((abv)localObject1).vPg.iterator();
              while (((Iterator)localObject1).hasNext())
                paramAnonymousMenuItem.add(Long.valueOf(((abw)((Iterator)localObject1).next()).wjm));
            }
            localObject1 = new HashMap();
            Object localObject2 = paramList.iterator();
            i = j;
            if (((Iterator)localObject2).hasNext())
            {
              if (paramAnonymousMenuItem.contains(Long.valueOf(((abw)((Iterator)localObject2).next()).wjm)))
                ((HashMap)localObject1).put(Integer.valueOf(i), Boolean.TRUE);
              while (true)
              {
                if (i == paramAnonymousInt)
                  ((HashMap)localObject1).put(Integer.valueOf(i), Boolean.valueOf(bool));
                i++;
                break;
                ((HashMap)localObject1).put(Integer.valueOf(i), Boolean.FALSE);
              }
            }
            paramAnonymousMenuItem = locald;
            if (paramAnonymousMenuItem.zSy != null)
            {
              paramAnonymousMenuItem.zSy.zSB = ((HashMap)localObject1);
              paramAnonymousMenuItem.zSy.notifyDataSetChanged();
            }
          }
          AppMethodBeat.o(44899);
        }
      }
    };
    locald.zSz = new RemittanceBusiUI.8(this);
    if (locald.rBl != null)
      locald.rBl.a(locald.rBn);
    locald.zSy = new d.a(locald, locald.mContext);
    locald.zSy.dLm();
    locald.zSv.setAdapter(locald.zSy);
    locald.grC.setOnClickListener(new d.2(locald));
    locald.jAH.setOnClickListener(new d.3(locald));
    if (locald.zaW != null)
    {
      if ((locald.rBn != null) && (locald.rBn.size() > 3))
      {
        paramList = (FrameLayout.LayoutParams)locald.iym.getLayoutParams();
        paramList.height = locald.zaX;
        locald.iym.setLayoutParams(paramList);
      }
      locald.zaW.show();
    }
    AppMethodBeat.o(44940);
  }

  private void cbv()
  {
    AppMethodBeat.i(44959);
    this.pTp = cfR();
    if (this.pTp <= 0.0D)
    {
      findViewById(2131827010).setClickable(false);
      findViewById(2131827010).setEnabled(false);
      findViewById(2131827010).setOnClickListener(null);
      this.pTi.setClickable(false);
      this.pTi.setEnabled(false);
      this.pTe.setTextColor(getResources().getColor(2131690312));
      AppMethodBeat.o(44959);
    }
    while (true)
    {
      return;
      this.pTe.setTextColor(-7829368);
      findViewById(2131827010).setEnabled(true);
      findViewById(2131827010).setClickable(true);
      this.pTi.setClickable(true);
      this.pTi.setEnabled(true);
      findViewById(2131827010).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(44918);
          com.tencent.mm.plugin.report.service.h.pYm.e(15235, new Object[] { Integer.valueOf(3) });
          RemittanceBusiUI.z(RemittanceBusiUI.this);
          AppMethodBeat.o(44918);
        }
      });
      AppMethodBeat.o(44959);
    }
  }

  private void cfI()
  {
    AppMethodBeat.i(44938);
    al.d(new RemittanceBusiUI.30(this));
    AppMethodBeat.o(44938);
  }

  private double cfR()
  {
    AppMethodBeat.i(44934);
    double d;
    if ((this.pTx) || (this.pQY == 33))
    {
      d = this.pTp;
      AppMethodBeat.o(44934);
    }
    while (true)
    {
      return d;
      this.pTp = bo.getDouble(this.pTh.getText(), 0.0D);
      d = this.pTp;
      AppMethodBeat.o(44934);
    }
  }

  private boolean cfS()
  {
    boolean bool = false;
    AppMethodBeat.i(44939);
    if (this.pTf == null)
    {
      AppMethodBeat.o(44939);
      return bool;
    }
    if (this.pSH != null)
    {
      ab.i("MicroMsg.RemittanceBusiUI", "tryShowFavor ");
      if ((this.pSH.pOE == null) || (this.pSH.pOE.vPh.size() <= 0))
        break label325;
    }
    label325: for (int i = 1; ; i = 0)
    {
      if (this.pSH.pOD.size() > 0)
        i = 1;
      if (this.pTJ.cfu().size() > 0)
        i = 1;
      if (i == 0)
      {
        this.pTf.setVisibility(8);
        this.pTR.update();
        this.pTm.setVisibility(8);
        AppMethodBeat.o(44939);
        break;
      }
      this.pTm.setVisibility(0);
      this.pTQ.update();
      this.pTf.setVisibility(0);
      this.pTe.setText(this.pSH.pOz);
      this.pTe.setTextColor(-7829368);
      this.pTn.setText(com.tencent.mm.wallet_core.ui.e.F(cfR()));
      Object localObject = this.pTJ.pQG;
      if (localObject != null)
      {
        this.pTe.setTextColor(-30434);
        this.pTe.setText(((abv)localObject).pOz);
        this.pTn.setText(com.tencent.mm.wallet_core.ui.e.F(((abv)localObject).wjf / 100.0D));
      }
      while (true)
      {
        findViewById(2131827010).setOnClickListener(new RemittanceBusiUI.2(this));
        AppMethodBeat.o(44939);
        bool = true;
        break;
        localObject = this.pTJ.cfv();
        if (!bo.isNullOrNil((String)localObject))
        {
          this.pTe.setTextColor(-7829368);
          this.pTe.setText((CharSequence)localObject);
        }
      }
      AppMethodBeat.o(44939);
      break;
    }
  }

  private void cfT()
  {
    AppMethodBeat.i(44948);
    ab.i("MicroMsg.RemittanceBusiUI", "unLockFavorimp");
    abv localabv = this.pTJ.pQG;
    if (localabv == null)
    {
      ab.i("MicroMsg.RemittanceBusiUI", "do NetSceneBusiF2fUnlockFavor FavorComposeInfo is null");
      AppMethodBeat.o(44948);
    }
    while (true)
    {
      return;
      int i = (int)Math.round(this.pTp * 100.0D);
      cz localcz = new cz();
      localcz.cIb = this.obL;
      localcz.vFb = this.pSy;
      localcz.vFc = this.oXY;
      localcz.pOA = this.pSH.pOA;
      localcz.scene = this.pQY;
      localcz.vFd = this.pSD;
      localcz.vFe = localabv;
      localcz.vFf = this.pTq;
      localcz.pPZ = this.pRC;
      localcz.vFg = i;
      a(new k(localcz, this.pTK), false, false);
      AppMethodBeat.o(44948);
    }
  }

  private void cfU()
  {
    AppMethodBeat.i(44950);
    ab.i("MicroMsg.RemittanceBusiUI", "goto busi result");
    Intent localIntent = new Intent(this, RemittanceBusiResultUI.class);
    localIntent.putExtra("key_pay_desc", this.pSz);
    localIntent.putExtra("key_rcv_desc", this.pTt);
    if (this.pSH != null)
      localIntent.putExtra("BusiRemittanceResp", this.pSH);
    localIntent.putExtra("key_mch_name", this.pQW);
    localIntent.putExtra("key_rcver_name", this.pTq);
    localIntent.putExtra("key_rcver_true_name", this.pTr);
    if (this.pTN >= 0.0D)
      localIntent.putExtra("key_money", this.pTN);
    while (true)
    {
      localIntent.putExtra("key_f2f_id", this.pSy);
      localIntent.putExtra("key_trans_id", this.oXY);
      localIntent.putExtra("key_check_sign", this.pSD);
      localIntent.putExtra("key_rcvr_open_id", this.pRC);
      localIntent.putExtra("key_channel", this.obL);
      if (this.pSH != null)
      {
        localIntent.putExtra("key_succ_show_avatar_type", this.pSH.pOG);
        localIntent.putExtra("key_succ_show_avatar_show", this.pSH.pOx);
        localIntent.putExtra("key_succ_show_avatar_url", this.pSH.pOy);
      }
      if (this.pSH != null)
        localIntent.putExtra("key_scan_sceen", this.pSH.pOA);
      localIntent.putExtra("key_succ_page_extend", this.pTL);
      abv localabv = this.pTJ.pQG;
      int i = (int)Math.round(this.pTp * 100.0D);
      cz localcz = new cz();
      localcz.cIb = this.obL;
      localcz.vFb = this.pSy;
      localcz.vFc = this.oXY;
      localcz.pOA = this.pSH.pOA;
      localcz.scene = this.pQY;
      localcz.vFd = this.pSD;
      localcz.vFe = localabv;
      localcz.vFf = this.pTq;
      localcz.pPZ = this.pRC;
      localcz.vFg = i;
      try
      {
        localIntent.putExtra("AfterPlaceOrderCommReq", localcz.toByteArray());
        startActivity(localIntent);
        finish();
        AppMethodBeat.o(44950);
        return;
        localIntent.putExtra("key_money", this.pTp);
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.RemittanceBusiUI", localException, "", new Object[0]);
      }
    }
  }

  private void d(com.tencent.mm.plugin.remittance.model.i parami)
  {
    AppMethodBeat.i(44956);
    ab.i("MicroMsg.RemittanceBusiUI", "do start pay zero_pay_flag: %s", new Object[] { Integer.valueOf(parami.pOT.vPF) });
    int i = (int)Math.round(this.pTp * 100.0D);
    Object localObject = new cz();
    ((cz)localObject).cIb = this.obL;
    ((cz)localObject).vFb = this.pSy;
    ((cz)localObject).vFc = this.oXY;
    ((cz)localObject).pOA = this.pSH.pOA;
    ((cz)localObject).scene = this.pQY;
    ((cz)localObject).vFd = this.pSD;
    ((cz)localObject).vFe = this.pTJ.pQG;
    ((cz)localObject).vFf = this.pTq;
    ((cz)localObject).pPZ = this.pRC;
    ((cz)localObject).vFg = i;
    this.pTS.put(parami.pOT.cBT, localObject);
    if (parami.pOT.vPF == 1)
    {
      a(parami.pOT);
      AppMethodBeat.o(44956);
    }
    while (true)
    {
      return;
      PayInfo localPayInfo = new PayInfo();
      localPayInfo.czZ = parami.pOT.cBT;
      localPayInfo.cIf = this.pQY;
      if (this.obL > 0)
        localPayInfo.cIb = this.obL;
      localObject = new Bundle();
      ((Bundle)localObject).putString("extinfo_key_1", this.pTq);
      ((Bundle)localObject).putString("extinfo_key_2", this.pTr);
      ((Bundle)localObject).putString("extinfo_key_3", this.pTt);
      ((Bundle)localObject).putString("extinfo_key_5", getIntent().getStringExtra("receiver_tips"));
      ((Bundle)localObject).putString("extinfo_key_7", this.pSz);
      ((Bundle)localObject).putString("extinfo_key_19", parami.pOT.pPJ);
      localPayInfo.vwh = ((Bundle)localObject);
      localPayInfo.pPV = 1;
      Intent localIntent = new Intent();
      if (parami.pOT.pPG == 1)
      {
        ((Bundle)localObject).putInt("extinfo_key_15", parami.pOT.vPO);
        ((Bundle)localObject).putString("extinfo_key_17", parami.pOT.pPH);
        ((Bundle)localObject).putString("extinfo_key_18", parami.pOT.pPI);
        localIntent.putExtra("key_pay_info", localPayInfo);
        localIntent.putExtra("from_patch_ui", true);
        localIntent.putExtra("key_rcvr_open_id", this.pRC);
        localIntent.putExtra("key_mch_info", this.pTw);
        localIntent.putExtra("key_mch_photo", this.pSH.pOy);
        localIntent.putExtra("key_transfer_qrcode_id", this.pTo);
        localIntent.putExtra("get_dynamic_code_sign", parami.pOT.pPH);
        localIntent.putExtra("get_dynamic_code_extend", parami.pOT.pPI);
        localIntent.putExtra("dynamic_code_spam_wording", parami.pOT.pPK);
        localIntent.putExtra("dynamic_code_amount", parami.pOT.vPO);
        localIntent.putExtra("show_paying_wording", parami.pOT.pPJ);
        if (this.pSH.pOG == 1);
        for (boolean bool = true; ; bool = false)
        {
          localIntent.putExtra("show_avatar_type", bool);
          com.tencent.mm.plugin.report.service.h.pYm.e(15386, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
          this.pRR.dnU();
          this.pUa.dnU();
          this.pUb.dnU();
          com.tencent.mm.bp.d.b(this, "remittance", ".ui.RemittanceF2fDynamicCodeUI", localIntent, 3);
          AppMethodBeat.o(44956);
          break;
        }
      }
      if (!bo.isNullOrNil(parami.pOU));
      for (this.pRH = true; ; this.pRH = false)
      {
        localPayInfo.vwp = this.cEW;
        localPayInfo.aPn = this.pRH;
        if ((parami.pOV == null) || (parami.pOV.czT.czX == null))
          break label747;
        com.tencent.mm.pluginsdk.wallet.h.a(parami.pOV.czT.czX, false, "", localPayInfo, this.pTr, localIntent, parami.pOV.czT.czV);
        AppMethodBeat.o(44956);
        break;
      }
      label747: com.tencent.mm.pluginsdk.wallet.h.a(this, false, "", localPayInfo, this.pTr, localIntent, 1);
      AppMethodBeat.o(44956);
    }
  }

  private void p(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(44947);
    ab.i("MicroMsg.RemittanceBusiUI", "doBusiZeroCallback %s", new Object[] { Boolean.valueOf(paramBoolean) });
    cz localcz = (cz)this.pTS.get(paramString);
    if (localcz == null)
      AppMethodBeat.o(44947);
    while (true)
    {
      return;
      chl localchl = this.pTC;
      String str = this.pTB;
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        paramString = new com.tencent.mm.plugin.remittance.model.l(localchl, localcz, str, i, this.pTD, paramString);
        if (!paramBoolean)
          break label129;
        paramString.pOZ = true;
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
        AppMethodBeat.o(44947);
        break;
      }
      label129: this.pTH = 0;
      a(paramString, true, false);
      AppMethodBeat.o(44947);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44943);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.remittance.model.i))
    {
      paramString = (com.tencent.mm.plugin.remittance.model.i)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramString.pOT.kdT == 0)
        {
          this.pSy = paramString.pOT.vFb;
          this.oXY = paramString.pOT.vFc;
          this.pSD = paramString.pOT.vFd;
          this.pTK = paramString.pOT.vPD;
          this.pTL = paramString.pOT.vPC;
          this.pTB = paramString.pOT.vPI;
          this.pTC = paramString.pOT.vPH;
          this.pTE = paramString.pOT.vPL;
          this.pTF = paramString.pOT.vPJ;
          this.pTG = paramString.pOT.vPK;
          ab.i("MicroMsg.RemittanceBusiUI", "touch_challenge %s need_change_auth_key %s", new Object[] { paramString.pOT.vPM, Integer.valueOf(paramString.pOT.vPN) });
          if (paramString.pOT.vPM != null)
            v.tCn.msn = paramString.pOT.vPM.dlY();
          paramm = v.tCn;
          if (paramString.pOT.vPN == 1)
          {
            bool = true;
            paramm.mso = bool;
            if (!a(paramString))
              d(paramString);
          }
        }
    }
    while (true)
    {
      label248: bool = false;
      AppMethodBeat.o(44943);
      while (true)
      {
        return bool;
        bool = false;
        break;
        ab.e("MicroMsg.RemittanceBusiUI", "place order response: %s, %s", new Object[] { Integer.valueOf(paramString.pOT.kdT), paramString.pOT.kdU });
        if ((paramString.pOT.vPB != null) && (!bo.isNullOrNil(paramString.pOT.vPB.nZb)))
          a(paramString);
        while (true)
        {
          if (paramString.pOT.vPE != 1)
            break label452;
          a(null, null, 0);
          break;
          Object localObject = e.cfP();
          String str = paramString.pOT.kdU;
          paramm = new RemittanceBusiUI.10(this, paramm);
          ab.w("MicroMsg.RemittanceBusiDialogMgr", "showAlert3() msg:%s, title:%s", new Object[] { bo.nullAsNil(str), bo.nullAsNil("") });
          localObject = (Context)((e)localObject).bSI.get();
          if (localObject == null)
            ab.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
          else
            com.tencent.mm.ui.base.h.a((Context)localObject, str, "", paramm);
        }
        label452: break label248;
        ab.e("MicroMsg.RemittanceBusiUI", "net error: %s", new Object[] { paramm });
        break label248;
        if ((paramm instanceof com.tencent.mm.plugin.remittance.model.h))
        {
          ab.i("MicroMsg.RemittanceBusiUI", "pay check callback");
          bool = true;
          AppMethodBeat.o(44943);
        }
        else
        {
          if (!(paramm instanceof com.tencent.mm.plugin.remittance.model.g))
            break label867;
          ab.i("MicroMsg.RemittanceBusiUI", "onSceneEnd %s errType %s errCode %s", new Object[] { paramm, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          paramString = (com.tencent.mm.plugin.remittance.model.g)paramm;
          if ((paramString.pOP.equals(this.pTP.pOP)) && (!paramString.pOQ))
            break label610;
          paramString.pOO = true;
          ab.e("MicroMsg.RemittanceBusiUI", "ignore this getFavor new coming soon %s", new Object[] { Boolean.valueOf(paramString.pOQ) });
          bool = true;
          AppMethodBeat.o(44943);
        }
      }
      label610: if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramString.pOL.kdT == 0)
        {
          this.pTJ.pQH = paramString.pOL.pOE;
          this.pTJ.VR(paramString.pOL.pOE.vPi);
          cfS();
          paramm = paramString.pOM;
          ab.i("MicroMsg.RemittanceBusiUI", "GetFavorAfterAction %s", new Object[] { paramm });
          if (paramm != null)
            paramm.cR(this.pTJ.cfu());
        }
      while (true)
      {
        paramString.pOO = true;
        bool = true;
        AppMethodBeat.o(44943);
        break;
        this.pTJ.cft();
        this.pTe.setTextColor(-7829368);
        this.pTe.setText(paramString.pOL.kdU);
        paramm = paramString.pON;
        if (paramm != null)
        {
          paramm.a(paramInt1, paramInt2, paramString);
          continue;
          this.pTJ.cft();
          if ((this.pSH != null) && (!bo.isNullOrNil(this.pSH.pOz)))
            this.pTe.setText(this.pSH.pOz);
          this.pTe.setTextColor(-7829368);
          this.pTe.setText(getString(2131302367));
          paramm = paramString.pON;
          if (paramm != null)
            paramm.a(paramInt1, paramInt2, paramString);
        }
      }
      label867: if ((paramm instanceof com.tencent.mm.plugin.remittance.model.l))
      {
        paramString = (com.tencent.mm.plugin.remittance.model.l)paramm;
        ab.i("MicroMsg.RemittanceBusiUI", "NetSceneBusiF2fZeroCallback getHasRetried %s", new Object[] { Boolean.valueOf(paramString.pOZ) });
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (paramString.pOY.kdT == 0)
          {
            cfU();
          }
          else
          {
            cfT();
            e.cfP().a(paramString.pOY.kdU, new RemittanceBusiUI.11(this));
          }
        }
        else
          e.cfP().a(getString(2131305389), new RemittanceBusiUI.13(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970509;
  }

  public final void initView()
  {
    AppMethodBeat.i(44937);
    this.nsk = ((ScrollView)findViewById(2131820884));
    this.pSY = ((TextView)findViewById(2131826999));
    this.pSZ = ((TextView)findViewById(2131827000));
    this.pTa = ((TextView)findViewById(2131827005));
    this.pTb = ((TextView)findViewById(2131827007));
    this.pTc = ((TextView)findViewById(2131827018));
    this.pTd = ((TextView)findViewById(2131827019));
    this.pTg = ((CdnImageView)findViewById(2131823740));
    this.pTh = ((WalletFormView)findViewById(2131827002));
    this.pTi = ((Button)findViewById(2131827016));
    this.pTj = ((LinearLayout)findViewById(2131827004));
    this.pRm = ((LinearLayout)findViewById(2131827001));
    this.pTk = ((LinearLayout)findViewById(2131827017));
    this.pTe = ((TextView)findViewById(2131827011));
    this.pTf = findViewById(2131827008);
    this.pTl = ((TextView)findViewById(2131827006));
    this.pTm = findViewById(2131827013);
    this.pTn = ((TextView)findViewById(2131827015));
    if (this.pTx)
    {
      if (!bo.isNullOrNil(this.pTt))
        this.pTa.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, this.pTt, this.pTa.getTextSize()));
      this.pTb.setText(com.tencent.mm.wallet_core.ui.e.F(this.pTp));
      this.pTj.setVisibility(0);
      this.pRm.setVisibility(8);
      if (com.tencent.mm.kernel.g.RK())
      {
        com.tencent.mm.kernel.g.RQ();
        ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.pTq);
        if ((localad == null) || ((int)localad.ewQ == 0))
          ao.a.flu.a(this.pTq, "", new RemittanceBusiUI.25(this));
      }
      cfI();
      this.pTk.setOnClickListener(new RemittanceBusiUI.26(this));
      this.pTi.setOnClickListener(new RemittanceBusiUI.27(this));
      this.nsk.setOnTouchListener(new RemittanceBusiUI.28(this));
      this.obM = new RemittanceBusiUI.29(this);
      if ((this.pSH != null) && (this.pSH.pOE != null))
      {
        this.pTJ.pQH = this.pSH.pOE;
        this.pTJ.VR(this.pSH.pOE.vPi);
      }
      if (cfS())
        com.tencent.mm.plugin.report.service.h.pYm.e(15235, new Object[] { Integer.valueOf(2) });
      AppMethodBeat.o(44937);
      return;
    }
    boolean bool;
    if (this.pSH != null)
      if (this.pSH.pOD.size() > 0)
      {
        bool = false;
        label557: if ((this.pSH.pOE != null) && (this.pSH.pOE.vPg.size() > 0))
          bool = false;
      }
    while (true)
    {
      a(this.pTh, 2, false, bool, true);
      this.pTh.a(new RemittanceBusiUI.23(this));
      this.pTj.setVisibility(8);
      this.pRm.setVisibility(0);
      break;
      continue;
      bool = true;
      break label557;
      bool = true;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(44944);
    ab.i("MicroMsg.RemittanceBusiUI", "onActivityResult requestCode %s resultCode %s %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent });
    if (paramInt1 == 3)
      if (paramInt2 == -1)
        a(bool2, paramIntent);
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(44944);
      return;
      bool2 = false;
      break;
      if (paramInt1 == 1)
      {
        if (paramInt2 == -1);
        for (bool2 = bool1; ; bool2 = false)
        {
          a(bool2, paramIntent);
          break;
        }
      }
      if (paramInt1 == 2)
        if (paramInt2 == -1)
        {
          String str = paramIntent.getStringExtra("INTENT_RESULT_TOKEN");
          this.pTD = str;
          this.pTN = 0.0D;
          ab.i("MicroMsg.RemittanceBusiUI", "onActivityResult _result_token: %s", new Object[] { str });
          p(false, paramIntent.getStringExtra("INTENT_REQKEY"));
        }
        else
        {
          cfT();
        }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44935);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.pYm.e(15235, new Object[] { Integer.valueOf(1) });
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690389)));
    paramBundle = getSupportActionBar().getCustomView();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.findViewById(16908308);
      if ((paramBundle != null) && ((paramBundle instanceof TextView)))
        ((TextView)paramBundle).setTextColor(getResources().getColor(2131689761));
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(-2147483648);
      paramBundle.setStatusBarColor(getResources().getColor(2131690389));
    }
    boolean bool;
    if (com.tencent.mm.compatible.util.d.iW(21))
    {
      if (com.tencent.mm.compatible.util.d.iW(23))
        getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    else
    {
      setBackBtn(new RemittanceBusiUI.12(this), 2131230737);
      nf(1633);
      nf(1241);
      nf(2677);
      nf(2504);
      nf(2702);
      nf(2682);
      paramBundle = this.pTU;
      com.tencent.mm.wallet_core.d.i locali = this.Ahr;
      paramBundle.rtType = 2682;
      paramBundle.Agk = locali;
      locali.Agq.put(Integer.valueOf(2682), paramBundle);
      setMMTitle(2131302373);
      setBackBtn(new RemittanceBusiUI.1(this));
      this.cEW = UUID.randomUUID().toString();
      com.tencent.mm.plugin.wallet.pay.a.b.acq(this.cEW);
      this.pQY = getIntent().getIntExtra("pay_scene", 31);
      this.pTo = getIntent().getStringExtra("scan_remittance_id");
      this.pTp = getIntent().getDoubleExtra("fee", 0.0D);
      this.pTq = getIntent().getStringExtra("receiver_name");
      this.pTr = getIntent().getStringExtra("receiver_true_name");
      this.pTs = getIntent().getStringExtra("receiver_true_name_busi");
      this.obL = getIntent().getIntExtra("pay_channel", 0);
      this.pTt = getIntent().getStringExtra("desc");
      this.pTv = getIntent().getIntExtra("busi_type", 0);
      this.pQW = getIntent().getStringExtra("mch_name");
      this.pTy = getIntent().getStringExtra("mch_type");
      this.pTA = getIntent().getIntExtra("mch_time", 0);
      this.pTw = getIntent().getStringExtra("mch_info");
      this.pTz = getIntent().getIntExtra("get_pay_wifi", 0);
      this.pRC = getIntent().getStringExtra("rcvr_open_id");
      this.pTu = getIntent().getStringExtra("rcvr_ticket");
      this.pTI = getIntent().getStringExtra("receiver_tips");
      this.pSH = ((BusiRemittanceResp)getIntent().getParcelableExtra("BusiRemittanceResp"));
      if (this.pSH != null)
      {
        if ((this.pQY != 32) || ((this.pSH.pOF != 1) && ((this.pSH == null) || (this.pSH.pOD.size() <= 0))))
          break label741;
        bool = true;
        label609: this.pTM = bool;
      }
      if (this.pTp <= 0.0D)
        break label746;
    }
    label741: label746: for (this.pTx = true; ; this.pTx = false)
    {
      if (this.pTv == 0)
      {
        ab.w("MicroMsg.RemittanceBusiUI", "wrong busi type!");
        finish();
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(15386, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
      this.pTQ = new RemittanceBusiUI.a(this, 28, 28, 2.0F);
      this.pTR = new RemittanceBusiUI.a(this, 50, 50, 8.0F);
      initView();
      cbv();
      AppMethodBeat.o(44935);
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
      bool = false;
      break label609;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44942);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.pRR);
    com.tencent.mm.sdk.b.a.xxA.d(this.pUc);
    com.tencent.mm.sdk.b.a.xxA.d(this.pUa);
    this.pUb.dead();
    ng(1633);
    ng(1241);
    ng(2677);
    ng(2504);
    ng(2702);
    ng(2682);
    com.tencent.mm.plugin.wallet.pay.a.b.acr(this.cEW);
    AppMethodBeat.o(44942);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(44954);
    ab.v("MicroMsg.RemittanceBusiUI", "onNewIntent");
    AppMethodBeat.o(44954);
  }

  public void onResume()
  {
    AppMethodBeat.i(44936);
    super.onResume();
    e.cfP().eL(this);
    AppMethodBeat.o(44936);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class b
    implements Runnable
  {
    public com.tencent.mm.wallet_core.d.d pUr;

    b()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(44932);
      RemittanceBusiUI.D(RemittanceBusiUI.this).b(this.pUr);
      AppMethodBeat.o(44932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI
 * JD-Core Version:    0.6.2
 */