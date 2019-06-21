package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.ul;
import com.tencent.mm.g.a.uu;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.g.a.uv.a;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUI extends WalletBaseUI
  implements a.a
{
  private static boolean tpr;
  private static List<WalletPayUI.b> tps;
  public String TAG;
  public String gHr;
  protected int mCount;
  protected com.tencent.mm.plugin.wallet.a pQU;
  private String pRx;
  protected Button pTi;
  private com.tencent.mm.sdk.b.c pUc;
  protected PayInfo pVL;
  protected Orders pWy;
  protected ArrayList<Bankcard> tgB;
  protected Bankcard tgC;
  public FavorPayInfo toH;
  private a toI;
  com.tencent.mm.plugin.wallet_core.ui.d toJ;
  private boolean toK;
  private com.tencent.mm.plugin.wallet.pay.a.d tou;
  protected String tpA;
  protected boolean tpB;
  public Bundle tpC;
  protected boolean tpD;
  protected TextView tpE;
  protected TextView tpF;
  private TextView tpG;
  protected TextView tpH;
  protected TextView tpI;
  protected TextView tpJ;
  protected ImageView tpK;
  private TextView tpL;
  private TextView tpM;
  protected LinearLayout tpN;
  protected WalletPayUI.a tpO;
  public Dialog tpP;
  private long tpQ;
  private TextView tpR;
  private LinearLayout tpS;
  private boolean tpT;
  private boolean tpU;
  private boolean tpV;
  private boolean tpW;
  private boolean tpX;
  private int tpY;
  private boolean tpZ;
  private com.tencent.mm.plugin.wallet.pay.a.c.f tpt;
  protected com.tencent.mm.plugin.wallet_core.ui.b tpu;
  private boolean tpv;
  private boolean tpw;
  protected boolean tpx;
  private c.a tpy;
  protected boolean tpz;
  private boolean tqa;
  private com.tencent.mm.plugin.wallet.pay.a.c.f tqb;
  private boolean tqc;
  private boolean tqd;
  private int tqe;
  private Runnable tqf;
  private WalletPayUI.b tqg;
  private long tqh;
  private boolean tqi;

  static
  {
    AppMethodBeat.i(46126);
    tpr = false;
    tps = new ArrayList();
    AppMethodBeat.o(46126);
  }

  public WalletPayUI()
  {
    AppMethodBeat.i(46076);
    this.TAG = "MicroMsg.WalletPayUI";
    this.pWy = null;
    this.tpt = null;
    this.mCount = 0;
    this.gHr = null;
    this.tgB = null;
    this.tgC = null;
    this.toH = null;
    this.tpu = null;
    this.tpv = false;
    this.tpw = false;
    this.tpx = false;
    this.tpz = false;
    this.tpA = "";
    this.pVL = null;
    this.tpB = false;
    this.tpC = null;
    this.tpD = false;
    this.tpQ = 0L;
    this.tpT = true;
    this.tpU = false;
    this.tpV = false;
    this.tpW = false;
    this.tpX = false;
    this.tpY = -1;
    this.tpZ = false;
    this.tqa = false;
    this.pQU = null;
    this.tqc = false;
    this.tqd = false;
    this.tou = null;
    this.tqe = 0;
    this.tqf = new WalletPayUI.1(this);
    this.tqh = 0L;
    this.pUc = new WalletPayUI.12(this);
    this.toK = false;
    AppMethodBeat.o(46076);
  }

  private void Hg(int paramInt)
  {
    AppMethodBeat.i(46077);
    this.tqe = paramInt;
    ab.i(this.TAG, "markForceFinish errorType %s %s", new Object[] { Integer.valueOf(paramInt), bo.dpG().toString() });
    AppMethodBeat.o(46077);
  }

  private void a(com.tencent.mm.plugin.wallet.pay.a.c.f paramf)
  {
    AppMethodBeat.i(46104);
    ab.i(this.TAG, "stopRealname realnameGuideFlag %s guide_type %s", new Object[] { paramf.cRb, Integer.valueOf(paramf.tot) });
    label107: Object localObject;
    label147: int j;
    if (("1".equals(paramf.cRb)) || ("2".equals(paramf.cRb)))
    {
      this.tqb = paramf;
      this.tou = paramf.tou;
      this.tpZ = true;
      this.pWy = paramf.pWy;
      if (this.pWy == null)
        break label521;
      i = this.pWy.tAq.size();
      this.mCount = i;
      String str = this.TAG;
      localObject = new StringBuilder("get mOrders! bankcardTag : ");
      if (this.pWy == null)
        break label526;
      paramf = Integer.valueOf(this.pWy.tuo);
      ab.d(str, paramf);
      arW();
      if ((this.pWy != null) && (this.pWy.tAr != null))
      {
        this.tpu = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
        if (this.tpu != null)
        {
          if (this.tpu.cRl().size() > 0)
            this.tpv = true;
          this.toH = this.tpu.acX(this.pWy.tAr.tmU);
          this.toH.tzb = this.tpu.acY(this.toH.tzb);
          ab.i(this.TAG, "onSceneEnd init favInfo id favorComposeId %s selectedFavorCompId %s selectedFavorCompId %s  mFavorPayInfo %s", new Object[] { this.pWy.tAr.tmU, this.toH.tzb, this.toH.tzb, this.toH.toString() });
        }
      }
      if ((this.pWy != null) && (this.tgB != null) && (this.pVL != null))
      {
        com.tencent.mm.plugin.wallet_core.utils.d.a(this.pVL, this.pWy);
        paramf = com.tencent.mm.plugin.report.service.h.pYm;
        j = this.pVL.cIf;
        s.cNC();
        if (!s.cND().cQg())
          break label532;
      }
    }
    label521: label526: label532: for (int i = 2; ; i = 1)
    {
      paramf.e(10690, new Object[] { Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf((int)(this.pWy.pTN * 100.0D)), this.pWy.pcl });
      if ((this.pWy == null) || (this.pWy.tAq == null))
        break label596;
      paramf = new LinkedList();
      localObject = this.pWy.tAq.iterator();
      while (((Iterator)localObject).hasNext())
        paramf.add(((Orders.Commodity)((Iterator)localObject).next()).cAa);
      this.tqb = null;
      break;
      i = 0;
      break label107;
      paramf = "";
      break label147;
    }
    if (paramf.size() > 0)
    {
      localObject = new uu();
      ((uu)localObject).cRC.cRE = paramf;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (this.pQU != null)
        this.pQU.bs(10001, (String)paramf.get(0));
    }
    label596: if ((this.pWy != null) && (this.pWy.tAO != null) && (this.pWy.tAO.tBL == 1) && (!bo.isNullOrNil(this.pWy.tAO.pbo)))
    {
      this.tpz = true;
      this.tpA = this.pWy.tAO.pbo;
    }
    s.cNC();
    this.tgB = s.cND().ng(cOk());
    if (!bo.isNullOrNil(this.tpA))
    {
      this.tgC = cOh();
      paramf = bo.bc(getIntent().getStringExtra("key_is_use_default_card"), "");
      if (!bo.isNullOrNil(paramf))
        this.tgC = acu(paramf);
      this.pTi.setClickable(true);
      if (bo.isNullOrNil(r.cPI().tDg))
        break label1030;
      this.tpL.setVisibility(0);
      this.tpL.setText(r.cPI().tDg);
      label771: if ((this.pWy != null) && (this.tgB != null) && (this.pVL != null))
      {
        com.tencent.mm.plugin.wallet_core.utils.d.a(this.pVL, this.pWy);
        paramf = com.tencent.mm.plugin.report.service.h.pYm;
        j = this.pVL.cIf;
        s.cNC();
        if (!s.cND().cQg())
          break label1051;
        i = 2;
        label831: paramf.e(10690, new Object[] { Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf((int)(this.pWy.pTN * 100.0D)), this.pWy.pcl });
      }
      if (this.tpU)
        ap(0, false);
      if (cOl().vwh != null)
        break label1056;
    }
    label1030: label1051: label1056: for (long l = 0L; ; l = cOl().vwh.getLong("wallet_pay_key_check_time"))
    {
      if (l > 0L)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(641L, 4L, 1L, true);
        com.tencent.mm.plugin.report.service.h.pYm.a(641L, 5L, bo.gb(l), true);
      }
      if (this.tqh > 0L)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(641L, 7L, 1L, true);
        com.tencent.mm.plugin.report.service.h.pYm.a(641L, 8L, bo.gb(this.tqh), true);
      }
      AppMethodBeat.o(46104);
      return;
      s.cNC();
      this.tgC = s.cND().a(null, null, cOk(), false);
      break;
      this.tpL.setVisibility(8);
      this.tpL.setText("");
      break label771;
      i = 1;
      break label831;
    }
  }

  private Bankcard acu(String paramString)
  {
    AppMethodBeat.i(46108);
    s.cNC();
    Object localObject = s.cND().nf(true);
    if (((ArrayList)localObject).size() != 0)
    {
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (Bankcard)localIterator.next();
        if (bo.nullAsNil(paramString).equals(((Bankcard)localObject).field_bindSerial))
        {
          ab.i(this.TAG, "hy: get given bankcard");
          AppMethodBeat.o(46108);
          paramString = (String)localObject;
        }
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(46108);
    }
  }

  private boolean b(com.tencent.mm.plugin.wallet.pay.a.c.f paramf)
  {
    boolean bool = false;
    int i = 0;
    AppMethodBeat.i(46121);
    if ("1".equals(paramf.cRb))
    {
      ab.i(this.TAG, "need realname verify");
      this.tpW = true;
      paramf = new Bundle();
      paramf.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
      paramf.putString("realname_verify_process_jump_plugin", "wallet");
      bwP();
      if (this.pVL != null)
        i = this.pVL.cIf;
      bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramf, null, i);
      AppMethodBeat.o(46121);
    }
    while (true)
    {
      return bool;
      if ("2".equals(paramf.cRb))
      {
        ab.i(this.TAG, "need upload credit");
        bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramf.cRc, paramf.cRf, paramf.cRd, paramf.cRe, bwP(), null);
        AppMethodBeat.o(46121);
      }
      else
      {
        ab.i(this.TAG, "realnameGuideFlag =  " + paramf.cRb);
        AppMethodBeat.o(46121);
      }
    }
  }

  private boolean cNG()
  {
    AppMethodBeat.i(138087);
    int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUA, Integer.valueOf(0))).intValue();
    if ((com.tencent.mm.sdk.a.b.dnO()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_PURPLE))
      i = 1;
    if ((i == 1) || ((this.pWy != null) && (this.pWy.tAN == 1)))
      AppMethodBeat.o(138087);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(138087);
    }
  }

  private boolean cNW()
  {
    boolean bool = true;
    AppMethodBeat.i(46079);
    Bundle localBundle = getIntent().getExtras();
    if ((localBundle != null) && (localBundle.containsKey("intent_pay_end")))
    {
      ab.i(this.TAG, "hy: pay end. finish the activity");
      if (localBundle.getBoolean("intent_pay_end", false))
      {
        ab.d(this.TAG, "pay done... errCode:" + localBundle.getInt("intent_pay_end_errcode"));
        ab.d(this.TAG, "pay done INTENT_PAY_APP_URL:" + localBundle.getString("intent_pay_app_url"));
        ab.d(this.TAG, "pay done INTENT_PAY_END:" + localBundle.getBoolean("intent_pay_end", false));
        h(-1, getIntent());
        this.tpw = true;
        AppMethodBeat.o(46079);
      }
    }
    while (true)
    {
      return bool;
      ab.d(this.TAG, "pay cancel");
      h(0, getIntent());
      this.tpw = false;
      break;
      if ((localBundle != null) && (localBundle.getBoolean("key_is_realname_verify_process")));
      switch (localBundle.getInt("realname_verify_process_ret", 0))
      {
      default:
        AppMethodBeat.o(46079);
        bool = false;
        break;
      case -1:
        AppMethodBeat.o(46079);
        continue;
        ab.i(this.TAG, "hy: pay not end");
        AppMethodBeat.o(46079);
        bool = false;
      }
    }
  }

  private void cNY()
  {
    AppMethodBeat.i(46089);
    if (this.pWy == null)
    {
      ab.e(this.TAG, "updatePaymentMethodForFavor mOrders is null");
      AppMethodBeat.o(46089);
      return;
    }
    this.tpJ.setVisibility(8);
    this.tpI.setVisibility(8);
    this.pTi.setText(2131305155);
    this.tpR.setVisibility(0);
    this.tpS.setVisibility(0);
    View localView = this.tpS.findViewById(2131828999);
    Object localObject = this.tpS.findViewById(2131829003);
    label118: CheckedTextView localCheckedTextView1;
    CheckedTextView localCheckedTextView2;
    int i;
    if ("CFT".equals(this.pWy.tAm))
    {
      ((View)localObject).setVisibility(8);
      localCheckedTextView1 = (CheckedTextView)this.tpS.findViewById(2131829002);
      localCheckedTextView2 = (CheckedTextView)this.tpS.findViewById(2131829008);
      localView.setEnabled(true);
      if ((this.pWy == null) || (this.pWy.tAq == null) || (this.pWy.tAq.size() <= 0))
        break label751;
      if (this.pWy.tAb != 1)
        break label559;
      i = 1;
    }
    while (true)
    {
      label198: if (this.tgC == null)
      {
        localView.setVisibility(8);
        label211: ((View)localObject).setOnClickListener(new WalletPayUI.32(this, localCheckedTextView1, localCheckedTextView2));
        this.tpR.setVisibility(0);
        this.tpS.setVisibility(0);
        if (this.toH == null)
          break label745;
        this.tpu = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
        localObject = this.tpu.acU(this.toH.tzb);
        if ((localObject == null) || (((com.tencent.mm.plugin.wallet.a.j)localObject).tmT != 0.0D))
          break label745;
        this.tpS.setVisibility(8);
        this.tpR.setVisibility(8);
      }
      label474: label745: for (int j = 1; ; j = 0)
      {
        this.tpT = true;
        if (j != 0)
          this.tpT = false;
        localCheckedTextView1.setChecked(false);
        localCheckedTextView2.setChecked(true);
        ab.i(this.TAG, "updatePaymentMethodForFavor needbindcardtoshowfavinfo is " + this.pWy.tAs);
        if (this.pWy.tAs == 1)
        {
          this.tpS.findViewById(2131829005).setVisibility(0);
          ((TextView)this.tpS.findViewById(2131829006)).setText(this.pWy.tAt);
          if (!TextUtils.isEmpty(this.pWy.tAu))
          {
            ((TextView)this.tpS.findViewById(2131829007)).setText(" (" + this.pWy.tAu + ")");
            if ((this.tgC != null) && (this.tgC.cPc()) && (!TextUtils.isEmpty(this.tgC.field_forbidWord)))
            {
              localView.setEnabled(false);
              localCheckedTextView1.setVisibility(8);
              ((TextView)this.tpS.findViewById(2131829001)).setText(this.tgC.field_forbidWord);
            }
          }
        }
        while (true)
        {
          cNZ();
          AppMethodBeat.o(46089);
          break;
          ((View)localObject).setVisibility(0);
          break label118;
          i = 0;
          break label198;
          localView.setVisibility(0);
          localView.setOnClickListener(new WalletPayUI.31(this, localCheckedTextView1, localCheckedTextView2));
          break label211;
          ((TextView)this.tpS.findViewById(2131829007)).setText("");
          break label474;
          this.tpS.findViewById(2131829005).setVisibility(8);
          if ((this.tgC != null) && (this.tgC.cPc()) && (!TextUtils.isEmpty(this.tgC.field_forbidWord)))
          {
            localView.setEnabled(false);
            localCheckedTextView1.setVisibility(8);
            ((TextView)this.tpS.findViewById(2131829001)).setText(this.tgC.field_forbidWord);
          }
          else if ((this.tgC != null) && (this.tgC.cPc()) && (TextUtils.isEmpty(this.tgC.field_forbidWord)) && (i == 0))
          {
            localCheckedTextView1.setChecked(true);
            localCheckedTextView2.setChecked(false);
            this.tpT = false;
          }
        }
      }
      label559: label751: i = 0;
    }
  }

  private void cNZ()
  {
    AppMethodBeat.i(46090);
    if (this.tpT)
    {
      this.pTi.setOnClickListener(new WalletPayUI.2(this));
      AppMethodBeat.o(46090);
    }
    while (true)
    {
      return;
      this.pTi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(46036);
          WalletPayUI.this.cOd();
          AppMethodBeat.o(46036);
        }
      });
      AppMethodBeat.o(46090);
    }
  }

  private void cOe()
  {
    int i = 1;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(46096);
    com.tencent.mm.plugin.report.service.h.pYm.e(13958, new Object[] { Integer.valueOf(1) });
    if ((this.pVL != null) && (8 == this.pVL.cIf))
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13955, new Object[] { Integer.valueOf(2) });
      if (this.pVL.vwh != null)
      {
        long l = this.pVL.vwh.getLong("extinfo_key_9");
        com.tencent.mm.plugin.report.service.h.pYm.e(13956, new Object[] { Integer.valueOf(1), Long.valueOf(System.currentTimeMillis() - l) });
      }
    }
    Object localObject;
    if (this.toH != null)
    {
      this.tpu = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
      localObject = this.tpu.acU(this.toH.tzb);
      if ((localObject == null) || (((com.tencent.mm.plugin.wallet.a.j)localObject).tmT != 0.0D));
    }
    while (true)
    {
      if (i != 0)
      {
        s.cNC();
        if (s.cND().cQh())
        {
          ab.i(this.TAG, "payWithoutPassword zeroPay");
          if (this.pVL == null)
          {
            i = k;
            if (this.pVL != null)
              break label258;
            localObject = "";
            label227: ad.e(i, (String)localObject, 3, "");
            cOf();
            AppMethodBeat.o(46096);
          }
        }
      }
      while (true)
      {
        return;
        i = this.pVL.cIf;
        break;
        label258: localObject = this.pVL.czZ;
        break label227;
        ab.i(this.TAG, "has useful bankcard ! payWithOldBankcard zeroPay");
        cNQ();
        AppMethodBeat.o(46096);
        continue;
        if (this.tpz)
        {
          ab.i(this.TAG, "hy: start do pay with force use given bankcard");
          if (!bo.isNullOrNil(this.tpA))
          {
            this.tgC = cOh();
            cNQ();
            AppMethodBeat.o(46096);
          }
          else
          {
            s.cNC();
            if (s.cND().cQi())
              if (this.pVL == null)
              {
                i = 0;
                label363: if (this.pVL != null)
                  break label412;
                localObject = "";
                label374: ad.e(i, (String)localObject, 17, "");
              }
            label412: 
            do
            {
              b(false, 0, "");
              AppMethodBeat.o(46096);
              break;
              i = this.pVL.cIf;
              break label363;
              localObject = this.pVL.czZ;
              break label374;
              s.cNC();
            }
            while (!s.cND().cQh());
            if (this.pVL == null)
            {
              i = 0;
              label446: if (this.pVL != null)
                break label480;
            }
            label480: for (localObject = ""; ; localObject = this.pVL.czZ)
            {
              ad.e(i, (String)localObject, 5, "");
              break;
              i = this.pVL.cIf;
              break label446;
            }
          }
        }
        else
        {
          localObject = bo.bc(getIntent().getStringExtra("key_is_use_default_card"), "");
          if (!bo.isNullOrNil((String)localObject))
            this.tgC = acu((String)localObject);
          if (this.tgC == null)
          {
            if ((this.tgB != null) && (this.tgB.size() > 0))
            {
              ab.i(this.TAG, " no last pay bankcard ! jump to select bankcard!");
              c(false, 8, "");
              AppMethodBeat.o(46096);
            }
            else
            {
              ab.i(this.TAG, "default bankcard not found! payWithNewBankcard");
              s.cNC();
              if (s.cND().cQi())
                if (this.pVL == null)
                {
                  i = 0;
                  label611: if (this.pVL != null)
                    break label660;
                  localObject = "";
                  label622: ad.e(i, (String)localObject, 17, "");
                }
              label660: 
              do
              {
                b(false, 0, "");
                AppMethodBeat.o(46096);
                break;
                i = this.pVL.cIf;
                break label611;
                localObject = this.pVL.czZ;
                break label622;
                s.cNC();
              }
              while (!s.cND().cQh());
              if (this.pVL == null)
              {
                i = 0;
                label694: if (this.pVL != null)
                  break label728;
              }
              label728: for (localObject = ""; ; localObject = this.pVL.czZ)
              {
                ad.e(i, (String)localObject, 5, "");
                break;
                i = this.pVL.cIf;
                break label694;
              }
            }
          }
          else
          {
            i = this.tgC.a(this.pWy.tuo, this.pWy);
            if (this.pQU != null)
              this.pQU.bs(10002, "");
            if (i != 0)
            {
              ab.i(this.TAG, "main bankcard(" + i + ") is useless! jump to select bankcard!");
              c(false, i, "");
              AppMethodBeat.o(46096);
            }
            else
            {
              s.cNC();
              if (s.cND().cQh())
              {
                ab.i(this.TAG, "payWithoutPassword");
                if (this.pVL == null)
                {
                  i = j;
                  label861: if (this.pVL != null)
                    break label905;
                }
                label905: for (localObject = ""; ; localObject = this.pVL.czZ)
                {
                  ad.e(i, (String)localObject, 3, "");
                  cOf();
                  AppMethodBeat.o(46096);
                  break;
                  i = this.pVL.cIf;
                  break label861;
                }
              }
              ab.i(this.TAG, "has useful bankcard ! payWithOldBankcard");
              cNQ();
              AppMethodBeat.o(46096);
            }
          }
        }
      }
      i = 0;
    }
  }

  private void cOf()
  {
    AppMethodBeat.i(46097);
    na(true);
    com.tencent.mm.plugin.wallet_core.utils.d.cSP();
    AppMethodBeat.o(46097);
  }

  private Bankcard cOh()
  {
    AppMethodBeat.i(46107);
    s.cNC();
    Object localObject = s.cND().nf(true);
    if (((ArrayList)localObject).size() != 0)
    {
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (Bankcard)localIterator.next();
        if (bo.nullAsNil(this.tpA).equals(((Bankcard)localObject).field_bindSerial))
        {
          ab.i(this.TAG, "hy: get given bankcard");
          AppMethodBeat.o(46107);
        }
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(46107);
    }
  }

  private boolean cOi()
  {
    boolean bool = false;
    AppMethodBeat.i(46112);
    if (bwP())
    {
      AM(4);
      ae.m(this, 0);
      AppMethodBeat.o(46112);
    }
    while (true)
    {
      return bool;
      AM(0);
      ae.m(this, this.mController.dyj());
      bool = true;
      AppMethodBeat.o(46112);
    }
  }

  private boolean cOj()
  {
    AppMethodBeat.i(46115);
    boolean bool;
    if ((this.pWy != null) && (this.pWy.tAi))
    {
      com.tencent.mm.kernel.g.RQ();
      if (((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(196614, Boolean.TRUE)).booleanValue())
      {
        Object localObject = getLayoutInflater().inflate(2130971149, null);
        CheckBox localCheckBox = (CheckBox)((View)localObject).findViewById(2131828987);
        en((View)localObject);
        ((TextView)((View)localObject).findViewById(2131823800)).setOnClickListener(new WalletPayUI.21(this, localCheckBox));
        localObject = com.tencent.mm.ui.base.h.a(this, getString(2131305199), (View)localObject, getString(2131304724), getString(2131305292), new WalletPayUI.22(this, localCheckBox), new WalletPayUI.24(this));
        ((com.tencent.mm.ui.widget.a.c)localObject).setCancelable(false);
        localCheckBox.setOnCheckedChangeListener(new WalletPayUI.25(this, (com.tencent.mm.ui.widget.a.c)localObject));
        AppMethodBeat.o(46115);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(46115);
    }
  }

  private void en(View paramView)
  {
    AppMethodBeat.i(46116);
    paramView = (TextView)paramView.findViewById(2131826339);
    paramView.setText(Html.fromHtml(String.format(getResources().getString(2131305197), new Object[] { getResources().getString(2131304513) })));
    paramView.setMovementMethod(LinkMovementMethod.getInstance());
    AppMethodBeat.o(46116);
  }

  private void h(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(46086);
    if ((this.pVL != null) && (this.pVL.cIf == 46) && (this.pWy != null))
    {
      paramIntent.putExtra("key_total_fee", this.pWy.pTN);
      ab.i(this.TAG, "sentCancelEvent set fee:%s", new Object[] { Double.valueOf(this.pWy.pTN) });
    }
    uv localuv = new uv();
    localuv.cRF.intent = paramIntent;
    uv.a locala;
    if (this.tqe == 1)
    {
      localuv.cRF.cRG = 1000;
      localuv.cRF.result = paramInt;
      locala = localuv.cRF;
      if (this.pVL != null)
        break label217;
    }
    label217: for (paramIntent = ""; ; paramIntent = this.pVL.czZ)
    {
      locala.czZ = paramIntent;
      localuv.cRF.cRH = 1;
      if ((this.pVL != null) && (paramInt == 0))
        com.tencent.mm.plugin.wallet.pay.a.b.b.ak(this.pVL.czZ, this.pVL.cIf, this.pVL.cIb);
      com.tencent.mm.sdk.b.a.xxA.m(localuv);
      AppMethodBeat.o(46086);
      return;
      if (this.tqe != 2)
        break;
      localuv.cRF.cRG = 1001;
      break;
    }
  }

  protected void Q(Bundle paramBundle)
  {
    AppMethodBeat.i(46118);
    this.tpx = true;
    if (this.pWy != null)
    {
      paramBundle.putInt("key_support_bankcard", this.pWy.tuo);
      paramBundle.putString("key_reqKey", this.pWy.czZ);
      if ((this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
        paramBundle.putString("key_TransId", ((Orders.Commodity)this.pWy.tAq.get(0)).cAa);
      paramBundle.putLong("key_SessionId", this.tpQ);
    }
    if (this.pVL != null)
      paramBundle.putInt("key_scene", this.pVL.cIf);
    if (!cOc());
    for (boolean bool = true; ; bool = false)
    {
      paramBundle.putBoolean("key_is_oversea", bool);
      paramBundle.putInt("is_deduct_open", this.tpY);
      this.tpy = new WalletPayUI.26(this);
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pay.b.class, paramBundle, this.tpy);
      AppMethodBeat.o(46118);
      return;
    }
  }

  protected final void ap(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(46103);
    com.tencent.mm.plugin.report.service.h.pYm.e(13958, new Object[] { Integer.valueOf(2) });
    com.tencent.mm.plugin.report.service.h.pYm.e(13955, new Object[] { Integer.valueOf(4) });
    if (this.pVL == null)
      if (this.pVL != null)
        break label226;
    label226: for (Object localObject = ""; ; localObject = this.pVL.czZ)
    {
      ad.e(i, (String)localObject, 11, "");
      localObject = this.mBundle;
      ((Bundle)localObject).putInt("key_main_bankcard_state", paramInt);
      ((Bundle)localObject).putParcelable("key_orders", this.pWy);
      ((Bundle)localObject).putParcelable("key_pay_info", this.pVL);
      ((Bundle)localObject).putParcelable("key_authen", cOb());
      ((Bundle)localObject).putString("key_pwd1", this.gHr);
      ((Bundle)localObject).putInt("key_pay_flag", 3);
      ((Bundle)localObject).putInt("key_err_code", -1004);
      ((Bundle)localObject).putParcelable("key_favor_pay_info", this.toH);
      ((Bundle)localObject).putBoolean("key_is_filter_bank_type", paramBoolean);
      if (this.tgC != null)
        ((Bundle)localObject).putString("key_is_cur_bankcard_bind_serial", this.tgC.field_bindSerial);
      Q((Bundle)localObject);
      AppMethodBeat.o(46103);
      return;
      i = this.pVL.cIf;
      break;
    }
  }

  protected final boolean arW()
  {
    AppMethodBeat.i(46106);
    boolean bool;
    if ((this.pWy == null) || (this.pWy.tAq == null) || (this.pWy.tAq.size() <= 0))
    {
      ab.w(this.TAG, "mOrders info is Illegal!");
      if ((this.tpt != null) && (this.tpt.bLD()))
      {
        AppMethodBeat.o(46106);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      String str1 = getString(2131305049);
      String str2 = str1;
      if (this.tpt != null)
      {
        str2 = str1;
        if (!bo.isNullOrNil(this.tpt.aIm))
          str2 = this.tpt.aIm;
      }
      ab.i(this.TAG, "checkInfo() errMsg:%s", new Object[] { str2 });
      com.tencent.mm.ui.base.h.a(this.mController.ylL, str2, "", new WalletPayUI.19(this));
      AppMethodBeat.o(46106);
      bool = false;
      continue;
      if ((this.tpz) && (!bo.isNullOrNil(this.tpA)) && (cOh() == null))
      {
        if ((this.tpt != null) && (this.tpt.bLD()))
        {
          AppMethodBeat.o(46106);
          bool = false;
        }
        else
        {
          ab.w(this.TAG, "hy: should use given bankcard, but resolved as null. show error msg and quit");
          str1 = getString(2131305049);
          str2 = str1;
          if (this.tpt != null)
          {
            str2 = str1;
            if (!bo.isNullOrNil(this.tpt.aIm))
              str2 = this.tpt.aIm;
          }
          ab.i(this.TAG, "checkInfo() errMsg:%s", new Object[] { str2 });
          com.tencent.mm.ui.base.h.a(this.mController.ylL, str2, "", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(46058);
              WalletPayUI.this.finish();
              AppMethodBeat.o(46058);
            }
          });
          AppMethodBeat.o(46106);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(46106);
        bool = true;
      }
    }
  }

  protected final void b(boolean paramBoolean, int paramInt, String paramString)
  {
    AppMethodBeat.i(46100);
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("pay with new bankcard! user's wxpay register status :");
    s.cNC();
    ab.d(str, s.cND().cQg() + ", need confirm ? " + paramBoolean);
    if (paramBoolean)
    {
      if (!bo.isNullOrNil(paramString))
        break label132;
      paramString = Bankcard.Y(this, paramInt);
    }
    label132: 
    while (true)
    {
      com.tencent.mm.ui.base.h.d(this, paramString, "", getString(2131305157), getString(2131296868), new WalletPayUI.11(this), new WalletPayUI.13(this));
      AppMethodBeat.o(46100);
      while (true)
      {
        return;
        cOg();
        AppMethodBeat.o(46100);
      }
    }
  }

  public final boolean bNf()
  {
    return false;
  }

  public final boolean bwP()
  {
    boolean bool1 = false;
    AppMethodBeat.i(46111);
    String str1;
    boolean bool2;
    label86: int i;
    if (this.tpZ)
    {
      str1 = this.TAG;
      if ((cOl() == null) || (!cOl().mXg))
      {
        bool2 = true;
        ab.i(str1, "case 1 %s,  stack %s", new Object[] { Boolean.valueOf(bool2), bo.dpG().toString() });
        str1 = this.TAG;
        s.cNC();
        if (s.cND().cQg())
          break label196;
        bool2 = true;
        ab.d(str1, "case 2 %s,", new Object[] { Boolean.valueOf(bool2) });
        String str2 = this.TAG;
        if (this.tgB != null)
          break label201;
        i = 0;
        label120: if (this.tgC != null)
          break label213;
        str1 = "";
        label130: ab.d(str2, "case 3 mBankcardList %s, mDefaultBankcard %s", new Object[] { Integer.valueOf(i), str1 });
        if ((cOl() != null) && (cOl().mXg))
          break label224;
        ab.i(this.TAG, "get isTransparent1");
        AppMethodBeat.o(46111);
        bool2 = bool1;
      }
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label196: bool2 = false;
      break label86;
      label201: i = this.tgB.size();
      break label120;
      label213: str1 = this.tgC.field_forbidWord;
      break label130;
      label224: s.cNC();
      if (!s.cND().cQg())
      {
        ab.i(this.TAG, "get isTransparent2");
        AppMethodBeat.o(46111);
        bool2 = bool1;
      }
      else
      {
        if ((this.tgB != null) && ((this.tgB.size() == 0) || ((this.tgC != null) && (!bo.isNullOrNil(this.tgC.field_forbidWord)))))
        {
          str1 = this.TAG;
          if ((this.tgB != null) && (this.tgB.size() == 0))
          {
            bool2 = true;
            label319: if ((this.tgC == null) || (bo.isNullOrNil(this.tgC.field_forbidWord)))
              break label384;
          }
          label384: for (boolean bool3 = true; ; bool3 = false)
          {
            ab.i(str1, "get isTransparent3 1 %s 2 %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
            AppMethodBeat.o(46111);
            bool2 = bool1;
            break;
            bool2 = false;
            break label319;
          }
        }
        ab.i(this.TAG, "get isTransparent4");
        AppMethodBeat.o(46111);
        bool2 = true;
        continue;
        ab.i(this.TAG, "get isTransparent5");
        AppMethodBeat.o(46111);
        bool2 = true;
      }
    }
  }

  public final boolean bwQ()
  {
    boolean bool1 = false;
    AppMethodBeat.i(46110);
    ab.i(this.TAG, "onProgressFinish isFromH5RealNameVerify %s", new Object[] { Boolean.valueOf(this.tqc) });
    com.tencent.mm.sdk.b.a.xxA.m(new ul());
    int i;
    int j;
    label92: Object localObject;
    label103: boolean bool2;
    if ((this.pWy != null) && (this.pWy.tAv != null) && (!this.tpX))
    {
      i = 1;
      if ((i == 0) && (!cOi()))
      {
        if (this.pVL != null)
          break label141;
        j = 0;
        if (this.pVL != null)
          break label152;
        localObject = "";
        ad.e(j, (String)localObject, 2, "");
      }
      if (!this.tqc)
        break label164;
      mY(true);
      bool2 = true;
    }
    while (true)
    {
      AppMethodBeat.o(46110);
      return bool2;
      i = 0;
      break;
      label141: j = this.pVL.cIf;
      break label92;
      label152: localObject = this.pVL.czZ;
      break label103;
      label164: if (this.tpW)
      {
        bool2 = true;
      }
      else if (i != 0)
      {
        localObject = new Intent(this, WalletPayDeductUI.class);
        ((Intent)localObject).putExtra("orders", this.pWy);
        startActivityForResult((Intent)localObject, 0);
        bool2 = true;
      }
      else if (this.mController.contentView.getVisibility() != 0)
      {
        if ((!this.tpD) && (arW()))
        {
          mY(true);
          this.tpD = true;
        }
        bool2 = true;
      }
      else
      {
        bool2 = bool1;
        if (this.mController.contentView.getVisibility() == 0)
        {
          bool2 = bool1;
          if (this.pWy != null)
          {
            bool2 = bool1;
            if (this.pWy.tAv != null)
            {
              bool2 = bool1;
              if (this.pTi.isEnabled())
              {
                bool2 = bool1;
                if (!this.tqa)
                {
                  this.pTi.performClick();
                  this.tqa = true;
                  bool2 = bool1;
                }
              }
            }
          }
        }
      }
    }
  }

  public final void c(boolean paramBoolean, int paramInt, String paramString)
  {
    AppMethodBeat.i(46101);
    ab.d(this.TAG, "pay with select bankcard! need confirm ? ".concat(String.valueOf(paramBoolean)));
    if (paramBoolean)
    {
      if (!bo.isNullOrNil(paramString))
        break label122;
      paramString = Bankcard.Y(this, paramInt);
    }
    label122: 
    while (true)
    {
      com.tencent.mm.ui.base.h.d(this, paramString, "", getString(2131305176), getString(2131296868), new WalletPayUI.14(this, paramInt), new WalletPayUI.15(this));
      AppMethodBeat.o(46101);
      while (true)
      {
        return;
        if (cNG())
        {
          mZ(true);
          AppMethodBeat.o(46101);
        }
        else
        {
          ap(paramInt, false);
          AppMethodBeat.o(46101);
        }
      }
    }
  }

  public final void c(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(46119);
    ab.i(this.TAG, "onGenFinish callback");
    if (paramBoolean)
    {
      ab.i(this.TAG, "onGenFinish callback, result.isSuccess is true");
      this.pVL.cBU = paramString1;
      this.pVL.cBV = paramString2;
      na(false);
      com.tencent.mm.plugin.wallet_core.utils.d.cSP();
      AppMethodBeat.o(46119);
    }
    while (true)
    {
      return;
      ab.e(this.TAG, "onGenFinish callback, result.isSuccess is false");
      na(false);
      com.tencent.mm.plugin.wallet_core.utils.d.cSP();
      AppMethodBeat.o(46119);
    }
  }

  public boolean c(int paramInt1, int paramInt2, final String paramString, final m paramm)
  {
    AppMethodBeat.i(46105);
    ab.i(this.TAG, "errorType %s errCode %s, errmsg %s, scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    boolean bool;
    label120: Object localObject;
    label267: label318: label353: Bundle localBundle;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.c.f))
      {
        this.Ahw = 1;
        this.tpt = ((com.tencent.mm.plugin.wallet.pay.a.c.f)paramm);
        paramm = (com.tencent.mm.plugin.wallet.pay.a.c.f)paramm;
        if (paramm.bLD())
        {
          paramString = paramm.nYe;
          paramString.a(this, new com.tencent.mm.wallet_core.c.e()
          {
            public final void cMX()
            {
              AppMethodBeat.i(46053);
              if (paramString.dNM())
              {
                WalletPayUI.a(WalletPayUI.this, paramm);
                AppMethodBeat.o(46053);
              }
              while (true)
              {
                return;
                WalletPayUI.this.cNX();
                AppMethodBeat.o(46053);
              }
            }

            public final void cMY()
            {
              AppMethodBeat.i(46054);
              if (paramString.dNM())
              {
                WalletPayUI.a(WalletPayUI.this, paramm);
                AppMethodBeat.o(46054);
              }
              while (true)
              {
                return;
                WalletPayUI.this.finish();
                AppMethodBeat.o(46054);
              }
            }

            public final void onCancel()
            {
              AppMethodBeat.i(46052);
              if (paramString.dNM())
              {
                WalletPayUI.a(WalletPayUI.this, paramm);
                AppMethodBeat.o(46052);
              }
              while (true)
              {
                return;
                WalletPayUI.this.finish();
                AppMethodBeat.o(46052);
              }
            }
          });
          bool = true;
          AppMethodBeat.o(46105);
          return bool;
        }
        a(paramm);
      }
      while (!(paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
        while (true)
        {
          cu();
          bool = true;
          AppMethodBeat.o(46105);
        }
      this.Ahw = 1;
      paramm = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramm;
      this.tqi = false;
      paramString = this.mBundle;
      paramString.putParcelable("key_pay_info", this.pVL);
      paramString.putParcelable("key_bankcard", this.tgC);
      paramString.putString("key_bank_type", this.tgC.field_bankcardType);
      if (!bo.isNullOrNil(this.gHr))
        paramString.putString("key_pwd1", this.gHr);
      paramString.putString("kreq_token", paramm.token);
      paramString.putParcelable("key_authen", paramm.toh);
      if (!paramm.tof)
      {
        bool = true;
        paramString.putBoolean("key_need_verify_sms", bool);
        paramString.putInt("key_can_verify_tail", paramm.tol);
        paramString.putString("key_verify_tail_wording", paramm.tom);
        localObject = this.mBundle;
        if (paramm.ton != 1)
          break label636;
        bool = true;
        ((Bundle)localObject).putBoolean("key_block_bind_new_card", bool);
        if (!bo.isNullOrNil(paramm.toi))
          break label642;
        paramString.putString("key_mobile", this.tgC.field_mobile);
        paramString.putString("key_QADNA_URL", paramm.toj);
        if (!paramm.tpw)
          break label657;
        if (this.pQU != null)
        {
          this.pQU.bs(10003, "");
          localObject = this.pQU;
          com.tencent.mm.plugin.report.service.h.pYm.e(13455, new Object[] { ((com.tencent.mm.plugin.wallet.a)localObject).teR, Long.valueOf(System.currentTimeMillis()), ((com.tencent.mm.plugin.wallet.a)localObject).teS });
        }
        paramString.putParcelable("key_orders", paramm.tog);
        if (this.pVL != null)
        {
          ab.i(this.TAG, "payscene %d", new Object[] { Integer.valueOf(this.pVL.cIf) });
          if (8 == this.pVL.cIf)
          {
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOS, Boolean.TRUE);
          }
        }
        label513: localBundle = new Bundle();
        localBundle.putString("pwd", this.gHr);
        localObject = (l)com.tencent.mm.kernel.g.K(l.class);
        paramInt1 = 0;
        if (!((l)localObject).bxe())
          break label671;
        paramInt1 = 1;
      }
      while (true)
      {
        localBundle.putInt("key_open_biometric_type", paramInt1);
        ((l)localObject).a(paramm.cNJ(), true, localBundle);
        paramString.putInt("key_pay_flag", 3);
        paramm = paramm.oYc;
        if (paramm != null)
          paramString.putParcelable("key_realname_guide_helper", paramm);
        Q(paramString);
        bool = true;
        AppMethodBeat.o(46105);
        break;
        bool = false;
        break label267;
        label636: bool = false;
        break label318;
        label642: paramString.putString("key_mobile", paramm.toi);
        break label353;
        label657: paramString.putParcelable("key_orders", this.pWy);
        break label513;
        label671: if (((l)localObject).bxh())
          paramInt1 = 2;
      }
    }
    if ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
    {
      this.tqi = false;
      localBundle = new Bundle();
      localBundle.putString("pwd", this.gHr);
      localObject = (l)com.tencent.mm.kernel.g.K(l.class);
      if (this.pVL.tKd == 1)
      {
        bool = true;
        label745: ((l)localObject).a(bool, false, localBundle);
        if ((paramInt2 != -1) && (paramInt2 != -500))
          break label878;
      }
      label860: label878: for (this.Ahw = 3; ; this.Ahw = 2)
        switch (paramInt2)
        {
        default:
          bool = false;
          AppMethodBeat.o(46105);
          break label120;
          bool = false;
          break label745;
        case 402:
        case 403:
        case 408:
        case 100000:
        case 100001:
        case 100102:
        case 100100:
        case 100101:
        case 404:
        }
      localObject = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramm;
      this.tpC = this.mBundle;
      this.tpC.putParcelable("key_pay_info", this.pVL);
      this.tpC.putParcelable("key_bankcard", this.tgC);
      if (!bo.isNullOrNil(this.gHr))
        this.tpC.putString("key_pwd1", this.gHr);
      this.tpC.putString("kreq_token", ((com.tencent.mm.plugin.wallet.pay.a.a.b)localObject).token);
      this.tpC.putParcelable("key_authen", ((com.tencent.mm.plugin.wallet.pay.a.a.b)localObject).toh);
      paramm = this.tpC;
      if (!((com.tencent.mm.plugin.wallet.pay.a.a.b)localObject).tof)
      {
        bool = true;
        label1000: paramm.putBoolean("key_need_verify_sms", bool);
        this.tpC.putString("key_mobile", this.tgC.field_mobile);
        this.tpC.putInt("key_err_code", paramInt2);
        this.tpC.putParcelable("key_orders", this.pWy);
        if (!bo.isNullOrNil(paramString))
          break label1482;
        paramString = getString(2131305201, new Object[] { this.tgC.field_desc, this.tgC.field_mobile });
      }
    }
    label1482: 
    while (true)
    {
      com.tencent.mm.ui.base.h.d(this, paramString, "", getString(2131305200), getString(2131296868), new WalletPayUI.17(this), new WalletPayUI.18(this));
      bool = true;
      AppMethodBeat.o(46105);
      break;
      bool = false;
      break label1000;
      this.pVL.vwi = paramInt2;
      cNQ();
      bool = true;
      AppMethodBeat.o(46105);
      break;
      this.pVL.vwi = paramInt2;
      bool = false;
      if (paramInt2 == 100100)
        bool = true;
      if (this.toI == null)
        this.toI = new a(this, this);
      this.toI.a(bool, this.pVL.cBS, this.pVL.czZ);
      ab.i(this.TAG, "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is ".concat(String.valueOf(bool)));
      bool = true;
      AppMethodBeat.o(46105);
      break;
      if ((this.tgC == null) || (this.pWy == null))
        break label860;
      this.tgC.twR = this.pWy.czZ;
      if ((this.tgB != null) && (this.tgB.size() > 1))
        c(true, 4, paramString);
      while (true)
      {
        bool = true;
        AppMethodBeat.o(46105);
        break;
        b(true, 4, paramString);
      }
      if (!(paramm instanceof com.tencent.mm.plugin.wallet.pay.a.c.f))
        break label860;
      this.tpZ = true;
      cOi();
      if (paramInt2 == 416)
      {
        ab.e(this.TAG, "errCode is 416 need real name verify!");
        this.Ahw = 2;
        this.tpW = true;
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
        paramString.putString("realname_verify_process_jump_plugin", "wallet");
        if (this.pVL != null);
        for (paramInt1 = this.pVL.cIf; ; paramInt1 = 0)
        {
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramInt2, paramm, paramString, paramInt1);
          AppMethodBeat.o(46105);
          break;
        }
      }
      this.Ahw = 3;
      ab.i(this.TAG, "errCode is %d , not need real name verify!", new Object[] { Integer.valueOf(paramInt2) });
      break label860;
    }
  }

  protected void cNQ()
  {
    AppMethodBeat.i(46098);
    mZ(false);
    AppMethodBeat.o(46098);
  }

  public final boolean cNR()
  {
    return true;
  }

  protected void cNX()
  {
    int i = 2;
    AppMethodBeat.i(46081);
    com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(2), Integer.valueOf(this.pVL.cIf) });
    if (this.pVL.cIf == 11)
      i = 3;
    PayInfo localPayInfo = this.pVL;
    Object localObject;
    if ((localPayInfo == null) || (bo.isNullOrNil(localPayInfo.czZ)))
    {
      ab.i("MicroMsg.CgiManager", "no payInfo or reqKey");
      localObject = null;
      if (localObject != null)
      {
        ((u)localObject).eHT = "PayProcess";
        ((u)localObject).hbj = this.tpQ;
        if ((this.pVL.cIf != 6) || (this.pVL.vwe != 100))
          break label436;
        ((u)localObject).gOW = 100;
        label134: if (!this.pVL.vwf)
          break label450;
      }
    }
    label436: label450: for (boolean bool = true; ; bool = false)
    {
      a((m)localObject, true, bool);
      AppMethodBeat.o(46081);
      return;
      localObject = localPayInfo.czZ;
      ab.i("MicroMsg.CgiManager", "qrorderinfo reqKey: %s", new Object[] { localObject });
      ab.i("MicroMsg.CgiManager", "qrorderinfo go new split cgi");
      if (((String)localObject).startsWith("sns_aa_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.a(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("sns_tf_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.j(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("sns_ff_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.c(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("ts_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.d(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("sns_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.h(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("offline_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.e(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("up_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.k(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("seb_ff_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.g(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("tax_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.i(localPayInfo, i);
        break;
      }
      if (((String)localObject).startsWith("dc_"))
      {
        localObject = new com.tencent.mm.plugin.wallet.pay.a.c.b(localPayInfo, i);
        break;
      }
      localObject = new com.tencent.mm.plugin.wallet.pay.a.c.f(localPayInfo, i);
      break;
      ((u)localObject).gOW = this.pVL.cIf;
      break label134;
    }
  }

  public final void cOa()
  {
    AppMethodBeat.i(46091);
    com.tencent.mm.plugin.wallet.a.j localj = this.tpu.acU(this.toH.tzb);
    List localList = this.tpu.cRl();
    com.tencent.mm.plugin.wallet.a.h localh = this.tpu.tDO;
    Object localObject1 = "";
    double d1;
    Object localObject2;
    int j;
    double d2;
    if (localj != null)
    {
      d1 = localj.tnb;
      if (d1 > 0.0D)
      {
        localObject2 = localj.tnd;
        int i = 1;
        localObject1 = localObject2;
        j = i;
        d2 = d1;
        if (!bo.isNullOrNil(localj.tne))
        {
          localObject1 = (String)localObject2 + "," + localj.tne;
          d2 = d1;
          j = i;
        }
      }
    }
    while (true)
    {
      localObject2 = localObject1;
      if (j == 0)
      {
        localObject2 = localObject1;
        if (localList.size() > 0)
          localObject2 = (String)localObject1 + this.mController.ylL.getString(2131305238);
      }
      if ((d2 > 0.0D) && (localh != null) && (localh.tmX == 0))
      {
        if (localj != null)
          this.tpE.setText(com.tencent.mm.wallet_core.ui.e.F(localj.tna));
        this.tpH.setText(com.tencent.mm.wallet_core.ui.e.atr(this.pWy.pcl));
        this.tpG.setText(com.tencent.mm.wallet_core.ui.e.e(this.pWy.pTN, this.pWy.pcl));
        this.tpG.setVisibility(0);
      }
      while (true)
      {
        if (!bo.isNullOrNil((String)localObject2))
          this.tpM.setText((CharSequence)localObject2);
        AppMethodBeat.o(46091);
        return;
        this.tpE.setText(com.tencent.mm.wallet_core.ui.e.F(this.pWy.pTN));
        this.tpH.setText(com.tencent.mm.wallet_core.ui.e.atr(this.pWy.pcl));
        this.tpG.setVisibility(8);
      }
      j = 0;
      d2 = d1;
      continue;
      j = 0;
      d2 = 0.0D;
    }
  }

  protected final Authen cOb()
  {
    AppMethodBeat.i(46092);
    Authen localAuthen = new Authen();
    if (cOc());
    for (localAuthen.bJt = 3; ; localAuthen.bJt = 6)
    {
      if (!bo.isNullOrNil(this.gHr))
        localAuthen.twc = this.gHr;
      if (this.tgC != null)
      {
        localAuthen.pbo = this.tgC.field_bindSerial;
        localAuthen.pbn = this.tgC.field_bankcardType;
      }
      if ((this.toH != null) && (this.tpu != null) && (this.tpu.cRi()))
      {
        localAuthen.two = this.toH.tzb;
        localAuthen.twn = this.toH.tze;
      }
      localAuthen.pGr = this.pVL;
      AppMethodBeat.o(46092);
      return localAuthen;
    }
  }

  protected final boolean cOc()
  {
    boolean bool = true;
    AppMethodBeat.i(46093);
    if ((this.tgC != null) && (this.pWy != null) && (this.pWy.tuo == 3))
      if (this.tgC.cPf())
        AppMethodBeat.o(46093);
    while (true)
    {
      return bool;
      AppMethodBeat.o(46093);
      bool = false;
      continue;
      if ((this.pWy != null) && (!Bankcard.Ho(this.pWy.tuo)))
      {
        AppMethodBeat.o(46093);
      }
      else
      {
        AppMethodBeat.o(46093);
        bool = false;
      }
    }
  }

  protected final void cOd()
  {
    AppMethodBeat.i(46094);
    mY(true);
    AppMethodBeat.o(46094);
  }

  protected final void cOg()
  {
    AppMethodBeat.i(46102);
    Bundle localBundle = getIntent().getExtras();
    s.cNC();
    if (s.cND().cQg());
    for (int i = 2; ; i = 1)
    {
      localBundle.putInt("key_pay_flag", i);
      localBundle.putParcelable("key_orders", this.pWy);
      localBundle.putParcelable("key_pay_info", this.pVL);
      localBundle.putParcelable("key_favor_pay_info", this.toH);
      Q(localBundle);
      AppMethodBeat.o(46102);
      return;
    }
  }

  protected final boolean cOk()
  {
    if ((this.pVL != null) && (this.pVL.cIf != 11));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final PayInfo cOl()
  {
    AppMethodBeat.i(46117);
    if (this.pVL == null)
      this.pVL = ((PayInfo)getIntent().getParcelableExtra("key_pay_info"));
    PayInfo localPayInfo = this.pVL;
    AppMethodBeat.o(46117);
    return localPayInfo;
  }

  protected final void cu()
  {
    AppMethodBeat.i(46088);
    if ((this.pWy != null) && (this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
    {
      this.tpE.setText(com.tencent.mm.wallet_core.ui.e.F(this.pWy.pTN));
      this.tpH.setText(com.tencent.mm.wallet_core.ui.e.atr(this.pWy.pcl));
      this.tpO.notifyDataSetChanged();
      if (this.pWy.tAq.size() > 1)
      {
        this.tpK.setVisibility(0);
        this.tpF.setText(getString(2131305204, new Object[] { ((Orders.Commodity)this.pWy.tAq.get(0)).desc, this.pWy.tAq.size() }));
        this.tpB = false;
      }
    }
    else
    {
      if ((this.pVL != null) && (this.pVL.cIf == 48))
        this.tpF.setText(2131302062);
      this.tpI.setVisibility(8);
      this.tpJ.setVisibility(8);
      this.tpR.setVisibility(8);
      this.tpS.setVisibility(8);
      this.pTi.setText(2131305155);
      if ((this.tgC == null) || (!this.tgC.cPc()))
        break label542;
      if (bo.isNullOrNil(this.tgC.field_forbidWord))
        break label522;
      this.tpI.setText(this.tgC.field_forbidWord);
      this.tpI.setVisibility(4);
      this.tpJ.setVisibility(8);
      s.cNC();
      if (s.cND().cQh())
        cNY();
      label329: s.cNC();
      if (!s.cND().cQh())
      {
        s.cNC();
        if (!s.cND().cQi())
          break label590;
      }
    }
    label424: label571: label590: for (int i = 1; ; i = 0)
    {
      LinearLayout localLinearLayout = (LinearLayout)findViewById(2131828993);
      if ((i != 0) && (this.toH != null) && (this.tpu != null) && (this.tpv) && (this.pWy != null))
      {
        cOa();
        this.tpM.setOnClickListener(new WalletPayUI.30(this));
        localLinearLayout.setVisibility(0);
        if ((this.pWy == null) || (this.tgB == null) || (this.pVL == null))
          break label571;
        this.pTi.setClickable(true);
        this.pTi.setEnabled(true);
      }
      while (true)
      {
        if (this.pWy == null)
          this.tpJ.setVisibility(8);
        AppMethodBeat.o(46088);
        return;
        this.tpF.setText(((Orders.Commodity)this.pWy.tAq.get(0)).desc);
        this.tpK.setVisibility(8);
        break;
        s.cNC();
        if (!s.cND().cQh())
          break label329;
        cNY();
        break label329;
        s.cNC();
        if (!s.cND().cQi())
          break label329;
        cNY();
        break label329;
        localLinearLayout.setVisibility(8);
        break label424;
        this.pTi.setClickable(false);
        this.pTi.setEnabled(false);
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(46083);
    ab.i(this.TAG, "finish %s %s mPayResultType:%s", new Object[] { Integer.valueOf(hashCode()), bo.dpG().toString(), Integer.valueOf(this.Ahw) });
    dOy();
    if ((this.pWy != null) && (!this.pWy.tAq.isEmpty()))
      getIntent().putExtra("key_trans_id", ((Orders.Commodity)this.pWy.tAq.get(0)).cAa);
    if (this.pVL != null)
      getIntent().putExtra("key_reqKey", this.pVL.czZ);
    if (this.tpw)
    {
      if (this.pWy != null)
        getIntent().putExtra("key_total_fee", this.pWy.pTN);
      getIntent().putExtra("key_pay_reslut_type", 1);
      h(-1, getIntent());
      setResult(-1, getIntent());
      localObject = dOD();
      if ((localObject != null) && (this == (Context)((com.tencent.mm.wallet_core.c)localObject).AeT.get()))
      {
        ab.i(this.TAG, "remove process end callback to prevent ui leak");
        ((com.tencent.mm.wallet_core.c)localObject).dND();
      }
      super.finish();
      AppMethodBeat.o(46083);
      return;
    }
    if ((this.pVL != null) && (this.pVL.cIf == 8) && (this.pWy != null))
    {
      this.pVL.vwn = 0;
      a(com.tencent.mm.plugin.wallet.pay.a.a.a(cOb(), this.pWy, true), false, false);
      if (this.pVL.vwh != null)
      {
        long l = this.pVL.vwh.getLong("extinfo_key_9");
        com.tencent.mm.plugin.report.service.h.pYm.e(13956, new Object[] { Integer.valueOf(3), Long.valueOf(System.currentTimeMillis() - l) });
      }
    }
    h(0, getIntent());
    getIntent().putExtra("key_pay_reslut_type", this.Ahw);
    label393: int i;
    if (this.tqe == 1)
    {
      getIntent().putExtra("key_pay_reslut_type", 1000);
      setResult(0, getIntent());
      s.cNC();
      if (!s.cND().cQi())
        break label572;
      if (this.pVL != null)
        break label549;
      i = 0;
      label425: if (this.pVL != null)
        break label561;
    }
    label549: label561: for (Object localObject = ""; ; localObject = this.pVL.czZ)
    {
      ad.e(i, (String)localObject, 18, "");
      Iterator localIterator = com.tencent.mm.wallet_core.a.atm("PayProcess").iterator();
      while (localIterator.hasNext())
      {
        localObject = (com.tencent.mm.wallet_core.c)localIterator.next();
        ((com.tencent.mm.wallet_core.c)localObject).F(new Object[] { "specEndProcessWithoutFinish" });
        if (((com.tencent.mm.wallet_core.c)localObject).mqu != null)
          ((com.tencent.mm.wallet_core.c)localObject).mqu.clear();
        com.tencent.mm.wallet_core.a.remove(localObject.getClass().hashCode());
        ((com.tencent.mm.wallet_core.c)localObject).cNF();
      }
      break;
      if (this.tqe != 2)
        break label393;
      getIntent().putExtra("key_pay_reslut_type", 1001);
      break label393;
      i = this.pVL.cIf;
      break label425;
    }
    label572: s.cNC();
    if (s.cND().cQh())
    {
      if (this.pVL == null)
      {
        i = 0;
        label595: if (this.pVL != null)
          break label629;
      }
      label629: for (localObject = ""; ; localObject = this.pVL.czZ)
      {
        ad.e(i, (String)localObject, 4, "");
        break;
        i = this.pVL.cIf;
        break label595;
      }
    }
    if (this.pVL == null)
    {
      i = 0;
      label650: if (this.pVL != null)
        break label685;
    }
    label685: for (localObject = ""; ; localObject = this.pVL.czZ)
    {
      ad.e(i, (String)localObject, 7, "");
      break;
      i = this.pVL.cIf;
      break label650;
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971150;
  }

  public final void initView()
  {
    AppMethodBeat.i(46087);
    ae.a(getWindow());
    MMScrollView localMMScrollView = (MMScrollView)findViewById(2131823366);
    localMMScrollView.a(localMMScrollView, localMMScrollView);
    this.pTi = ((Button)findViewById(2131829010));
    this.pTi.setClickable(false);
    this.pTi.setEnabled(false);
    this.tpE = ((TextView)findViewById(2131828925));
    this.tpF = ((TextView)findViewById(2131828989));
    this.tpH = ((TextView)findViewById(2131828990));
    this.tpM = ((TextView)findViewById(2131828995));
    this.tpG = ((TextView)findViewById(2131828991));
    this.tpL = ((TextView)findViewById(2131829009));
    this.tpG.getPaint().setFlags(16);
    this.tpI = ((TextView)findViewById(2131829012));
    this.tpJ = ((TextView)findViewById(2131829011));
    this.tpJ.setOnClickListener(new WalletPayUI.27(this));
    this.tpK = ((ImageView)findViewById(2131828996));
    this.tpK.setOnClickListener(new WalletPayUI.28(this));
    this.tpN = ((LinearLayout)findViewById(2131828992));
    this.tpO = new WalletPayUI.a(this);
    this.pTi.setOnClickListener(new WalletPayUI.29(this));
    this.pTi.setText(2131305155);
    this.tpR = ((TextView)findViewById(2131828997));
    this.tpS = ((LinearLayout)findViewById(2131828998));
    cu();
    AppMethodBeat.o(46087);
  }

  protected final void mY(boolean paramBoolean)
  {
    AppMethodBeat.i(46095);
    if ((paramBoolean) && (!cOj()))
    {
      AppMethodBeat.o(46095);
      return;
    }
    if (this.toH != null)
    {
      this.tpu = com.tencent.mm.plugin.wallet_core.ui.c.tDU.a(this.pWy);
      com.tencent.mm.plugin.wallet.a.j localj = this.tpu.acU(this.toH.tzb);
      if ((localj == null) || (localj.tmT != 0.0D));
    }
    for (int i = 1; ; i = 0)
    {
      if (this.tqb != null)
      {
        if (this.tqb.tot == 0)
        {
          ab.i(this.TAG, "need real name,stop");
          b(this.tqb);
          AppMethodBeat.o(46095);
          break;
        }
        if ((this.tqb.tot == 1) && (i != 0))
        {
          ab.i(this.TAG, "need real name, zero stop");
          b(this.tqb);
        }
      }
      if (this.tou != null)
      {
        if ((this.tou.tob == 1) && (!bo.isNullOrNil(this.tou.nZb)) && (!bo.isNullOrNil(this.tou.nZc)) && (!bo.isNullOrNil(this.tou.toc)))
        {
          if ((this.pVL != null) && (this.pWy != null) && (this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
          {
            if (this.pVL.cIf != 8)
              break label378;
            com.tencent.mm.plugin.report.service.h.pYm.e(15368, new Object[] { Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(1), ((Orders.Commodity)this.pWy.tAq.get(0)).cAa });
          }
          while (true)
          {
            com.tencent.mm.ui.base.h.a(this.mController.ylL, this.tou.toc, "", this.tou.nZc, this.tou.nZb, false, new WalletPayUI.4(this), new WalletPayUI.5(this));
            AppMethodBeat.o(46095);
            break;
            label378: com.tencent.mm.plugin.report.service.h.pYm.e(15368, new Object[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1), ((Orders.Commodity)this.pWy.tAq.get(0)).cAa });
          }
        }
        if ((this.tou.tob == 2) && (!bo.isNullOrNil(this.tou.toc)) && (!bo.isNullOrNil(this.tou.tod)))
        {
          ab.i(this.TAG, "pay has been blocked");
          if ((this.pVL != null) && (this.pWy != null) && (this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
          {
            if (this.pVL.cIf != 8)
              break label636;
            com.tencent.mm.plugin.report.service.h.pYm.e(15368, new Object[] { Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(1), ((Orders.Commodity)this.pWy.tAq.get(0)).cAa });
          }
          while (true)
          {
            com.tencent.mm.ui.base.h.a(this.mController.ylL, this.tou.toc, "", this.tou.tod, false, new WalletPayUI.6(this));
            AppMethodBeat.o(46095);
            break;
            label636: com.tencent.mm.plugin.report.service.h.pYm.e(15368, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), ((Orders.Commodity)this.pWy.tAq.get(0)).cAa });
          }
        }
      }
      cOe();
      AppMethodBeat.o(46095);
      break;
    }
  }

  protected final void mZ(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(46099);
    if (!arW())
    {
      AppMethodBeat.o(46099);
      return;
    }
    this.toK = false;
    ab.i(this.TAG, "pay with old bankcard! from statck %s", new Object[] { bo.dpG().toString() });
    int i;
    if (this.pVL == null)
    {
      i = 0;
      label59: if (this.pVL != null)
        break label235;
    }
    label235: for (Object localObject = ""; ; localObject = this.pVL.czZ)
    {
      ad.e(i, (String)localObject, 8, "");
      if (this.tpP != null)
      {
        ab.w(this.TAG, "close previous cashier dialog");
        this.tpP.dismiss();
      }
      this.toK = false;
      if (!cNG())
        break label247;
      this.tpP = new com.tencent.mm.plugin.wallet_core.ui.cashier.b(this.mController.ylL);
      com.tencent.mm.plugin.wallet_core.ui.cashier.b localb = (com.tencent.mm.plugin.wallet_core.ui.cashier.b)this.tpP;
      PayInfo localPayInfo = this.pVL;
      localObject = this.pWy;
      FavorPayInfo localFavorPayInfo = this.toH;
      Bankcard localBankcard = this.tgC;
      if (!this.tpz)
        bool = true;
      localb.a(localPayInfo, (Orders)localObject, localFavorPayInfo, localBankcard, bool, paramBoolean);
      localb.tMA = new WalletPayUI.7(this);
      localb.show();
      addDialog(localb);
      AppMethodBeat.o(46099);
      break;
      i = this.pVL.cIf;
      break label59;
    }
    label247: if (!this.tpz);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.tpP = com.tencent.mm.plugin.wallet_core.ui.q.a(this, paramBoolean, this.pWy, this.toH, this.tgC, this.pVL, this.pRx, new WalletPayUI.8(this), new WalletPayUI.9(this), new WalletPayUI.10(this));
      this.toJ = ((com.tencent.mm.plugin.wallet_core.ui.d)this.tpP);
      AppMethodBeat.o(46099);
      break;
    }
  }

  protected void na(boolean paramBoolean)
  {
    AppMethodBeat.i(46114);
    com.tencent.mm.plugin.wallet.pay.a.a.b localb = com.tencent.mm.plugin.wallet.pay.a.a.a(cOb(), this.pWy, paramBoolean);
    if (this.pWy != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("key_reqKey", this.pWy.czZ);
      if ((this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
        localBundle.putString("key_TransId", ((Orders.Commodity)this.pWy.tAq.get(0)).cAa);
      localBundle.putLong("key_SessionId", this.tpQ);
      localb.eHT = "PayProcess";
      localb.mBundle = localBundle;
    }
    if (this.pVL != null)
      if ((this.pVL.cIf != 6) || (this.pVL.vwe != 100))
        break label249;
    label249: for (localb.gOW = 100; ; localb.gOW = this.pVL.cIf)
    {
      a(localb, true, true);
      if ((this.pVL != null) && (8 == this.pVL.cIf) && (this.pVL.vwh != null))
      {
        long l = this.pVL.vwh.getLong("extinfo_key_9");
        com.tencent.mm.plugin.report.service.h.pYm.e(13956, new Object[] { Integer.valueOf(2), Long.valueOf(System.currentTimeMillis() - l) });
      }
      AppMethodBeat.o(46114);
      return;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46109);
    ab.i(this.TAG, "onAcvityResult requestCode:" + paramInt1 + ", resultCode:" + paramInt2);
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(46109);
      return;
      if (paramInt2 == -1)
      {
        if (paramIntent != null)
        {
          this.tpY = paramIntent.getIntExtra("auto_deduct_flag", -1);
          this.pWy.tAv.tpY = this.tpY;
          cOl().vwk = this.tpY;
          if (this.tpY == 1)
          {
            cOl().vwl = paramIntent.getStringExtra("deduct_bank_type");
            cOl().vwm = paramIntent.getStringExtra("deduct_bind_serial");
          }
        }
        this.tpX = true;
        bwQ();
      }
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13958, new Object[] { Integer.valueOf(3) });
        AppMethodBeat.o(46109);
        break;
        finish();
      }
      this.tpP.dismiss();
      this.tpD = false;
      cNX();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46078);
    super.onCreate(paramBundle);
    this.TAG = ("MicroMsg.WalletPayUI@" + hashCode());
    if (tpr)
    {
      ab.w(this.TAG, "has Undestory WalletPayUI!");
      com.tencent.mm.plugin.report.service.h.pYm.k(965L, 1L, 1L);
      Hg(2);
      finish();
      AppMethodBeat.o(46078);
    }
    int k;
    while (true)
    {
      return;
      tpr = true;
      long l = System.currentTimeMillis();
      int i = getIntent().getIntExtra("key_context_hashcode", -1);
      paramBundle = new WalletPayUI.b[tps.size()];
      ab.i(this.TAG, "WalletPayUI check %s this %s fromHashCode %s", new Object[] { Integer.valueOf(tps.size()), Integer.valueOf(hashCode()), Integer.valueOf(i) });
      WalletPayUI.b[] arrayOfb = (WalletPayUI.b[])tps.toArray(paramBundle);
      int j = arrayOfb.length;
      k = 0;
      if (k < j)
      {
        paramBundle = arrayOfb[k];
        WalletPayUI localWalletPayUI = (WalletPayUI)paramBundle.tqs.get();
        if (localWalletPayUI != null)
        {
          ab.w(this.TAG, "has old payui, both finish %s", new Object[] { Integer.valueOf(localWalletPayUI.hashCode()) });
          if ((i != paramBundle.aBR) || (i == -1))
            break label289;
          localWalletPayUI.Hg(2);
          com.tencent.mm.plugin.report.service.h.pYm.k(965L, 41L, 1L);
        }
        while (true)
        {
          tps.remove(paramBundle);
          localWalletPayUI.finish();
          k++;
          break;
          label289: localWalletPayUI.Hg(1);
          com.tencent.mm.plugin.report.service.h.pYm.k(965L, 40L, 1L);
        }
      }
      this.tqg = new WalletPayUI.b(this, (byte)0);
      this.tqg.timestamp = l;
      this.tqg.aBR = i;
      this.tqg.tqs = new WeakReference(this);
      tps.add(this.tqg);
      if (com.tencent.mm.kernel.g.RK())
        break;
      ab.e(this.TAG, "hy: account not ready. finish now");
      finish();
      AppMethodBeat.o(46078);
    }
    getWindow().getDecorView().postDelayed(this.tqf, 5000L);
    this.tqh = bo.anU();
    com.tencent.mm.sdk.b.a.xxA.c(this.pUc);
    com.tencent.mm.plugin.wallet_core.model.k.Hp(5);
    this.pQU = com.tencent.mm.plugin.wallet.a.at(getIntent());
    setMMTitle(2131305203);
    this.pVL = cOl();
    this.tpz = getIntent().getBooleanExtra("key_is_force_use_given_card", false);
    this.tpA = bo.bc(getIntent().getStringExtra("key_force_use_bind_serail"), "");
    this.pRx = getIntent().getStringExtra("key_receiver_true_name");
    if ((this.pVL == null) || (this.pVL.vwj == 0L))
    {
      this.tpQ = System.currentTimeMillis();
      label538: s.cNC();
      if (!s.cND().cQg())
      {
        if (this.pVL != null)
          break label682;
        k = 0;
        label561: if (this.pVL != null)
          break label694;
        paramBundle = "";
        label571: ad.e(k, paramBundle, 1, "");
      }
      if (cNW())
        break label763;
      ab.d(this.TAG, "PayInfo = " + this.pVL);
      if ((this.pVL == null) || (bo.isNullOrNil(this.pVL.czZ)))
        break label705;
      cNX();
      initView();
    }
    while (true)
    {
      if (this.pVL != null)
        com.tencent.mm.plugin.wallet.pay.a.b.acn(this.pVL.vwp);
      AppMethodBeat.o(46078);
      break;
      this.tpQ = this.pVL.vwj;
      break label538;
      label682: k = this.pVL.cIf;
      break label561;
      label694: paramBundle = this.pVL.czZ;
      break label571;
      label705: if ((this.pVL != null) && (!bo.isNullOrNil(this.pVL.aIm)));
      for (paramBundle = this.pVL.aIm; ; paramBundle = getString(2131305196))
      {
        com.tencent.mm.ui.base.h.a(this, paramBundle, null, false, new WalletPayUI.23(this));
        break;
      }
      label763: ab.i(this.TAG, "hy: pay end on create. finish");
      finish();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46080);
    if (this.toI != null)
    {
      this.toI.cNM();
      this.toI.release();
    }
    com.tencent.mm.sdk.b.a.xxA.d(this.pUc);
    this.toJ = null;
    getWindow().getDecorView().removeCallbacks(this.tqf);
    tps.remove(this.tqg);
    tpr = false;
    long l = System.currentTimeMillis();
    Object localObject = new WalletPayUI.b[tps.size()];
    for (WalletPayUI.b localb : (WalletPayUI.b[])tps.toArray((Object[])localObject))
    {
      localObject = (WalletPayUI)localb.tqs.get();
      if ((localObject != null) && (l - localb.timestamp > 600000L))
      {
        ab.w(this.TAG, "has old payui, both finish");
        com.tencent.mm.plugin.report.service.h.pYm.k(965L, 2L, 1L);
        tps.remove(localb);
        ((WalletPayUI)localObject).Hg(1);
        ((WalletPayUI)localObject).finish();
      }
    }
    if (this.pVL != null)
      com.tencent.mm.plugin.wallet.pay.a.b.aco(this.pVL.vwp);
    super.onDestroy();
    AppMethodBeat.o(46080);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(46084);
    if (paramInt == 4)
      if (this.tqi)
      {
        ab.w(this.TAG, "block when authening");
        AppMethodBeat.o(46084);
      }
    while (true)
    {
      return bool;
      if ((this.tpP != null) && (this.pVL != null) && (this.pVL.mXg) && (!this.Ahr.bLA()))
        finish();
      while (true)
      {
        AppMethodBeat.o(46084);
        break;
        aqX();
        showDialog(1000);
      }
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(46084);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    int i = 1;
    AppMethodBeat.i(46085);
    ab.i(this.TAG, "onNewIntent");
    setIntent(paramIntent);
    if (!cNW())
    {
      ab.w(this.TAG, "hy: pay not end if judge from intent, but should finish this ui, and set cancel event");
      if (paramIntent.getBooleanExtra("send_cancel_event", true))
        h(0, getIntent());
      this.tpw = false;
    }
    if (paramIntent.getBooleanExtra("direc_change_bankcard", false))
    {
      mZ(true);
      AppMethodBeat.o(46085);
      return;
    }
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_bind_end", false)))
      this.tpU = true;
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
        break label142;
      ab.i(this.TAG, "isFromBindCard is true");
      cNX();
      AppMethodBeat.o(46085);
      break;
    }
    label142: if ((paramIntent != null) && (paramIntent.getBooleanExtra("key_is_realname_verify_process", false)))
    {
      this.tpV = true;
      j = i;
      label164: if (j == 0)
        break label200;
      ab.i(this.TAG, "isFromRealNameVerify is true");
      finish();
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(46085);
      break;
      j = 0;
      break label164;
      label200: ab.e(this.TAG, "isFromBindCard is false,isFromRealNameVerify is false");
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(46120);
    super.onPause();
    if (this.toJ != null)
      this.toJ.onActivityPause();
    AppMethodBeat.o(46120);
  }

  public void onResume()
  {
    AppMethodBeat.i(46082);
    ab.i(this.TAG, "hy: onResume isFromH5RealNameVerify %s", new Object[] { Boolean.valueOf(this.tqc) });
    if (!this.Ahr.bLA())
    {
      if (!bo.isNullOrNil(this.tpA))
        this.tgC = cOh();
    }
    else
    {
      if (!this.tqd)
        break label152;
      ab.i(this.TAG, "onResume isResumePassFinish");
      this.tqd = false;
    }
    while (true)
    {
      super.onResume();
      AppMethodBeat.o(46082);
      return;
      if (this.tgC == null)
      {
        s.cNC();
        this.tgC = s.cND().a(null, null, cOk(), false);
        break;
      }
      s.cNC();
      this.tgC = s.cND().a(null, this.tgC.field_bindSerial, cOk(), false);
      break;
      label152: if ((this.tpx) && (this.mController.contentView.getVisibility() != 0) && ((this.tpP == null) || (!this.tpP.isShowing())))
      {
        ab.i(this.TAG, "hy: has started process and is transparent and no pwd appeared. finish self");
        finish();
      }
      else if (this.toJ != null)
      {
        this.toJ.cRm();
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(46113);
    if (paramInt == 0)
    {
      if (!bwP())
        break label37;
      finish();
      AppMethodBeat.o(46113);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
        cNQ();
      label37: AppMethodBeat.o(46113);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI
 * JD-Core Version:    0.6.2
 */