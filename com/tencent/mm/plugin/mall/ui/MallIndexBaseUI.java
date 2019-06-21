package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.on;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public abstract class MallIndexBaseUI extends WalletBaseUI
  implements x.a, com.tencent.mm.plugin.wallet_core.model.l
{
  protected String eCq;
  private String ocK = null;
  private String okO = null;
  private ArrayList<MallFunction> okP = null;
  protected int okT;
  private int omA = 0;
  private boolean omB = true;
  protected int omC;
  protected View omD;
  protected View omE;
  private boolean omF = false;
  private TextView omt = null;
  protected ListView omu = null;
  private b omv = null;
  protected ImageView omw = null;
  protected ImageView omx;
  protected TextView omy = null;
  protected TextView omz;

  private void bNe()
  {
    boolean bool = getIntent().getBooleanExtra("key_wallet_has_red", false);
    if (this.omu.getChildCount() == 0);
    label414: 
    while (true)
    {
      return;
      int i = this.omu.getFirstVisiblePosition();
      int j = this.omu.getChildAt(0).getTop();
      ab.i("MicroMsg.MallIndexBaseUI", "initCheckNew %s fpos %s top %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
      if ((i == 0) && (j == 0) && (bool) && (!this.omF) && (this.okP != null))
      {
        this.omF = true;
        int k = this.omu.getHeaderViewsCount() + this.omv.getCount();
        List localList = this.omv.olz;
        if (localList != null)
          for (i = localList.size() - 1; ; i--)
          {
            if (i <= 0)
              break label414;
            Iterator localIterator = ((ArrayList)localList.get(i)).iterator();
            while (true)
              if (localIterator.hasNext())
              {
                b.c localc = (b.c)localIterator.next();
                if ((localc != null) && (localc.omd != null) && (b.a(localc.omd)))
                {
                  j = this.omu.getFirstVisiblePosition();
                  i = this.omu.getLastVisiblePosition();
                  ab.i("MicroMsg.MallIndexBaseUI", "get listview show top %s bottom %s redPos: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
                  if ((k >= j) && (k <= i))
                    break;
                  int m = a.bMY();
                  j = a.bMX() + a.bMW() * (k + 1) + m;
                  i = j;
                  if (k > 2)
                    i = j + m;
                  j = i;
                  if (k > 3)
                    j = i + m;
                  int n = a.bMW() / 3;
                  m = this.omu.getScrollY();
                  k = com.tencent.mm.ui.ae.hy(this).y;
                  i = k;
                  if (com.tencent.mm.ui.ae.hw(this))
                    i = k - com.tencent.mm.ui.ae.fr(this);
                  k = i;
                  if (getSupportActionBar() != null)
                    k = i - getSupportActionBar().getHeight();
                  this.omu.smoothScrollBy(j + n - m - k, 1000);
                  break;
                }
              }
            k--;
          }
      }
    }
  }

  private void bNg()
  {
    setResult(0);
    finish();
  }

  private void bNj()
  {
    if (com.tencent.mm.model.r.YM())
      com.tencent.mm.wallet_core.a.b(this.mController.ylL, "PayURemittanceProcess", null);
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putInt("pay_channel", 1);
      com.tencent.mm.wallet_core.a.b(this.mController.ylL, "RemittanceProcess", localBundle);
    }
  }

  private void bNl()
  {
    if (this.omt != null)
      this.omt.setVisibility(8);
  }

  private MallFunction cm(List<MallFunction> paramList)
  {
    Object localObject;
    if ((paramList == null) || (paramList.size() == 0) || (TextUtils.isEmpty(this.okO)))
      localObject = null;
    while (true)
    {
      return localObject;
      for (int i = 0; ; i++)
      {
        if (i >= paramList.size())
          break label80;
        MallFunction localMallFunction = (MallFunction)paramList.get(i);
        if (localMallFunction != null)
        {
          localObject = localMallFunction;
          if (this.okO.equals(localMallFunction.pFP))
            break;
        }
      }
      label80: localObject = null;
    }
  }

  private MallFunction cn(List<MallFunction> paramList)
  {
    Object localObject;
    if ((paramList == null) || (paramList.size() == 0) || (TextUtils.isEmpty(this.ocK)))
      localObject = null;
    while (true)
    {
      return localObject;
      for (int i = 0; ; i++)
      {
        if (i >= paramList.size())
          break label80;
        MallFunction localMallFunction = (MallFunction)paramList.get(i);
        if (localMallFunction != null)
        {
          localObject = localMallFunction;
          if (this.ocK.equals(localMallFunction.cRS))
            break;
        }
      }
      label80: localObject = null;
    }
  }

  public void a(MallFunction paramMallFunction, int paramInt)
  {
    Object localObject2;
    int i;
    int j;
    if ((paramMallFunction != null) && (paramInt >= 0))
    {
      Object localObject1 = "";
      localObject2 = localObject1;
      if (paramMallFunction.tDn != null)
      {
        localObject2 = localObject1;
        if (!bo.isNullOrNil(paramMallFunction.tDn.ssr))
          localObject2 = paramMallFunction.tDn.ssr;
      }
      if (this.okP == null)
      {
        i = 0;
        boolean bool = b.a(paramMallFunction);
        localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
        String str = paramMallFunction.pFP;
        if (!bool)
          break label237;
        j = 2;
        label81: ((com.tencent.mm.plugin.report.service.h)localObject1).e(10881, new Object[] { str, Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(paramInt), localObject2, Integer.valueOf(j) });
      }
    }
    else
    {
      if ((paramMallFunction == null) || (bo.isNullOrNil(paramMallFunction.cRS)) || (!((com.tencent.mm.plugin.appbrand.service.f)g.K(com.tencent.mm.plugin.appbrand.service.f.class)).Cl(paramMallFunction.cRS)))
        break label243;
      ab.i("MicroMsg.MallIndexBaseUI", "handleFunction, intercept by AppBrandNativeLink, nativeUrl = %s", new Object[] { paramMallFunction.cRS });
      c.cQT().acI(paramMallFunction.pFP);
      com.tencent.mm.plugin.wallet_core.model.mall.d.cQX().acI(paramMallFunction.pFP);
      if (paramMallFunction.tDn != null)
      {
        c.cQT();
        c.e(paramMallFunction);
      }
    }
    while (true)
    {
      return;
      i = this.okP.size();
      break;
      label237: j = 1;
      break label81;
      label243: if (paramMallFunction != null)
      {
        c.cQT().acI(paramMallFunction.pFP);
        com.tencent.mm.plugin.wallet_core.model.mall.d.cQX().acI(paramMallFunction.pFP);
        if (paramMallFunction.tDn != null)
        {
          c.cQT();
          c.e(paramMallFunction);
        }
        if ("wxpay://bizmall/mobile_recharge".equals(paramMallFunction.cRS))
          paramInt = 0;
      }
      while (true)
      {
        ab.i("MicroMsg.MallIndexBaseUI", "functionType : ".concat(String.valueOf(paramInt)));
        switch (paramInt)
        {
        default:
          break;
        case 0:
          localObject2 = new Intent();
          if (bwP())
            ((Intent)localObject2).putExtra("key_is_hide_progress", true);
          ((Intent)localObject2).putExtra("key_func_info", paramMallFunction);
          com.tencent.mm.bp.d.b(this, "recharge", ".ui.PhoneRechargeUI", (Intent)localObject2);
          com.tencent.mm.wallet_core.c.z.hL(15, 0);
          break;
          if ("wxpay://bizmall/weixin_hongbao".equals(paramMallFunction.cRS))
          {
            paramInt = 4;
          }
          else if ("wxpay://bizmall/weixin_scan_qrcode".equals(paramMallFunction.cRS))
          {
            paramInt = 8;
          }
          else if ("wxpay://bizmall/weixin_transfer".equals(paramMallFunction.cRS))
          {
            paramInt = 5;
          }
          else if ("wxpay://bizmall/weixin_offline_pay".equals(paramMallFunction.cRS))
          {
            paramInt = 6;
          }
          else if ("wxpay://bizmall/old_mobile_recharge".equals(paramMallFunction.cRS))
          {
            paramInt = 7;
          }
          else if (!bo.isNullOrNil(paramMallFunction.nmz))
          {
            paramInt = 1;
          }
          else if ("wxpay://bizmall/f2f_hongbao".equals(paramMallFunction.cRS))
          {
            paramInt = 9;
          }
          else
          {
            ab.w("MicroMsg.MallIndexUIHelper", "doSelectFunction no jump");
            paramInt = 2;
            continue;
            paramInt = 3;
          }
          break;
        case 4:
        case 7:
        case 1:
        case 2:
        case 3:
        case 5:
        case 6:
        case 8:
        case 9:
        }
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      paramMallFunction = new Intent();
      paramMallFunction.putExtra("pay_channel", 1);
      com.tencent.mm.bp.d.b(this, "luckymoney", ".ui.LuckyMoneyIndexUI", paramMallFunction);
      com.tencent.mm.wallet_core.c.z.hL(13, 0);
      com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(4), Integer.valueOf(0) });
      continue;
      localObject2 = new Intent();
      if (bwP())
        ((Intent)localObject2).putExtra("key_is_hide_progress", true);
      ((Intent)localObject2).putExtra("key_func_info", paramMallFunction);
      com.tencent.mm.bp.d.b(this, "recharge", ".ui.RechargeUI", (Intent)localObject2);
      continue;
      g.RQ();
      this.okT = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", paramMallFunction.nmz);
      ((Intent)localObject2).putExtra("geta8key_username", com.tencent.mm.model.r.Yz());
      ((Intent)localObject2).putExtra("pay_channel", 1);
      ((Intent)localObject2).putExtra("KPublisherId", "pay_wallet");
      ((Intent)localObject2).putExtra("key_download_restrict", paramMallFunction.tDp);
      ((Intent)localObject2).putExtra("key_wallet_region", this.okT);
      ((Intent)localObject2).putExtra("key_function_id", paramMallFunction.pFP);
      ((Intent)localObject2).putExtra("geta8key_scene", 46);
      com.tencent.mm.bp.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      continue;
      ab.w("MicroMsg.MallIndexBaseUI", "doSelectFunction no jump");
      continue;
      ab.w("MicroMsg.MallIndexBaseUI", "doSelectFunction do nothing");
      t.makeText(this, "fuction list error", 1).show();
      continue;
      com.tencent.mm.plugin.report.service.h.pYm.e(11458, new Object[] { Integer.valueOf(1) });
      if (com.tencent.mm.model.r.YM())
      {
        localObject2 = new LinkedList();
        paramMallFunction = new LinkedList();
        ((List)localObject2).add(getString(2131302471));
        paramMallFunction.add(Integer.valueOf(0));
        ((List)localObject2).add(getString(2131298404));
        paramMallFunction.add(Integer.valueOf(1));
        com.tencent.mm.ui.base.h.a(this, getString(2131302381), (List)localObject2, paramMallFunction, null, true, new MallIndexBaseUI.3(this));
      }
      while (true)
      {
        com.tencent.mm.wallet_core.c.z.hL(14, 0);
        com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(3), Integer.valueOf(0) });
        break;
        g.RQ();
        if (!((Boolean)g.RP().Ry().get(ac.a.xJU, Boolean.FALSE)).booleanValue())
        {
          g.RQ();
          g.RP().Ry().set(ac.a.xJU, Boolean.TRUE);
          com.tencent.mm.ui.base.h.a(this, getString(2131304845), "", new MallIndexBaseUI.4(this));
        }
        else
        {
          bNj();
        }
      }
      paramMallFunction = new Intent();
      paramMallFunction.putExtra("key_from_scene", 1);
      com.tencent.mm.bp.d.b(this.mController.ylL, "offline", ".ui.WalletOfflineEntranceUI", paramMallFunction);
      com.tencent.mm.wallet_core.c.z.hL(9, 0);
      com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
      continue;
      paramMallFunction = new Intent();
      paramMallFunction.putExtra("BaseScanUI_select_scan_mode", 1);
      com.tencent.mm.bp.d.b(this.mController.ylL, "scanner", ".ui.BaseScanUI", paramMallFunction);
      continue;
      com.tencent.mm.bp.d.H(this.mController.ylL, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
    }
  }

  protected abstract void bFY();

  protected abstract void bGb();

  protected abstract void bNa();

  protected abstract void bNb();

  protected final void bNc()
  {
    if (this.omz.getVisibility() == 0)
    {
      a.a(this, true, false);
      AbsListView.LayoutParams localLayoutParams1 = (AbsListView.LayoutParams)this.omD.getLayoutParams();
      AbsListView.LayoutParams localLayoutParams2 = localLayoutParams1;
      if (localLayoutParams1 == null)
        localLayoutParams2 = new AbsListView.LayoutParams(-1, -2);
      localLayoutParams2.height = a.bMX();
      this.omD.setLayoutParams(localLayoutParams2);
    }
  }

  protected abstract boolean bNd();

  public final boolean bNf()
  {
    return false;
  }

  protected abstract void bNh();

  protected abstract void bNi();

  protected abstract void bNk();

  protected abstract void bNm();

  protected abstract void bbC();

  public final void bht()
  {
  }

  public final boolean bwP()
  {
    if ((!bo.isNullOrNil(this.okO)) || (!bo.isNullOrNil(this.ocK)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bwQ()
  {
    if (!bwP())
      cu();
    return true;
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    ab.d("MicroMsg.MallIndexBaseUI", "onOtherSceneEnd");
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.b.a))
    {
      ab.d("MicroMsg.MallIndexBaseUI", "hy: query bound scene end");
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (!this.omB)
          break label77;
        this.omB = false;
        if (!com.tencent.mm.plugin.wallet_core.model.r.cPE().cRh().cQi())
          break label77;
        com.tencent.mm.wallet_core.a.b(this, "PayUOpenProcess", null);
      }
    }
    while (true)
    {
      return bool;
      finish();
      continue;
      label77: switch (paramm.getType())
      {
      default:
        bool = false;
        break;
      case 495:
        paramString = (com.tencent.mm.plugin.mall.a.f)paramm;
        if (paramString.okT != this.okT)
          ab.i("MicroMsg.MallIndexBaseUI", "pass wallet local: %d cgi: %d", new Object[] { Integer.valueOf(this.okT), Integer.valueOf(paramString.okT) });
        if (bwP())
        {
          ab.d("MicroMsg.MallIndexBaseUI", "errorType:%d | errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          if ((paramInt1 == 0) && (paramInt2 == 0) && (paramString.okP != null))
          {
            if (getIntent().getIntExtra("key_scene", 0) == 1)
            {
              paramString = cm(paramString.okP);
              if (paramString != null)
                a(paramString, -1);
            }
            while (true)
            {
              setResult(-1);
              finish();
              break;
              if (!bo.isNullOrNil(this.ocK))
              {
                ab.d("MicroMsg.MallIndexBaseUI", "NativeUrl: %s", new Object[] { this.ocK });
                paramString = cn(paramString.okP);
                if (paramString != null)
                {
                  a(paramString, -1);
                  continue;
                }
                bNg();
                break;
              }
              if ((paramString.okP != null) && (paramString.okP.size() > 0))
              {
                ab.i("MicroMsg.MallIndexBaseUI", "functionScene.mFunctionList != null");
                a(cm(paramString.okP), -1);
              }
              else if ((com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT) != null) && (com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT).size() > 0))
              {
                ab.i("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() != null");
                a(cm(com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT)), -1);
              }
              else
              {
                ab.e("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() == null");
              }
            }
          }
          bNg();
        }
        else
        {
          if ((paramInt1 == 0) && (paramInt2 == 0) && (com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT) != null) && (paramString.okP != null))
          {
            this.okP = com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT);
            ab.i("MicroMsg.MallIndexBaseUI", "get from server now! " + this.okT + " " + this.okP.size());
            c.cQT().X(this.okP);
          }
          cu();
          bNe();
          bGb();
        }
        break;
      }
    }
  }

  public final void cu()
  {
    showOptionMenu(true);
    this.omv.J(this.okP);
    bNi();
    bNk();
    bNl();
    bNm();
  }

  protected abstract void dp(View paramView);

  public void finish()
  {
    super.finish();
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970038;
  }

  protected abstract void initHeaderView();

  public void initView()
  {
    ab.d("MicroMsg.MallIndexBaseUI", "index initView");
    setBackBtn(new MallIndexBaseUI.1(this));
    this.omu = ((ListView)findViewById(2131825793));
    initHeaderView();
    bGb();
    this.omv = new b(this, this.okT);
    this.omu.setAdapter(this.omv);
    this.omv.olA = new MallIndexBaseUI.2(this);
    dp(this.omD);
    this.omz = ((TextView)findViewById(2131821634));
    bNh();
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      g.RQ();
      this.okT = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
      if (paramInt2 == -1)
      {
        if (!com.tencent.mm.model.r.YN())
          break label51;
        finish();
      }
    }
    while (true)
    {
      return;
      label51: finish();
      paramIntent = new on();
      paramIntent.cKQ.context = this.mController.ylL;
      com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    ab.i("MicroMsg.MallIndexBaseUI", "onCreate");
    super.onCreate(paramBundle);
    if (!g.RK())
    {
      ab.v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
      finish();
    }
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
    this.okT = getIntent().getIntExtra("key_wallet_region", i);
    this.eCq = getIntent().getStringExtra("key_uuid");
    if (!bo.isNullOrNil(this.eCq))
      this.eCq = UUID.randomUUID().toString();
    nf(495);
    com.tencent.mm.plugin.wallet_core.model.r.cPP();
    com.tencent.mm.plugin.wallet_core.model.ae.a(this);
    this.okO = getIntent().getStringExtra("key_func_id");
    ab.i("MicroMsg.MallIndexBaseUI", "mFuncId:" + this.okO + " wallet_region: " + this.okT + " walletType: " + com.tencent.mm.model.r.YG() + " default_region: " + i);
    this.ocK = getIntent().getStringExtra("key_native_url");
    ab.i("MicroMsg.MallIndexBaseUI", "mNativeUrl:" + this.ocK);
    if (bwP())
      return;
    bFY();
    AM(0);
    ab.i("MicroMsg.MallIndexBaseUI", "index Oncreate");
    bbC();
    initView();
    c.cQW();
    bNa();
    ab.i("MicroMsg.MallIndexBaseUI", "hy: use default controller for MallIndexUI");
    bNb();
    if (com.tencent.mm.model.r.YM())
      ab.e("MicroMsg.MallIndexBaseUI", "it is payu account ,not initFingerPrint");
    while (true)
    {
      com.tencent.mm.wallet_core.c.z.hL(1, 0);
      com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      break;
      paramBundle = (com.tencent.mm.pluginsdk.l)g.K(com.tencent.mm.pluginsdk.l.class);
      if (paramBundle != null)
      {
        ab.i("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
        paramBundle.bxd();
      }
      else
      {
        ab.e("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null");
      }
    }
  }

  public void onDestroy()
  {
    ng(495);
    com.tencent.mm.plugin.wallet_core.model.r.cPP();
    com.tencent.mm.plugin.wallet_core.model.ae.b(this);
    super.onDestroy();
  }

  public void onResume()
  {
    int i = 1;
    super.onResume();
    i.Lt(1);
    ab.i("MicroMsg.MallIndexBaseUI", "index onResume");
    if (!g.RK())
    {
      ab.v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
      finish();
    }
    if (bwP())
    {
      this.okP = com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT);
      if ((this.okP == null) || (this.okP.size() <= 0))
        ab.i("MicroMsg.MallIndexBaseUI", "mFunctionList == null");
    }
    label362: 
    while (true)
    {
      try
      {
        if ((getIntent().getIntExtra("key_scene", 0) == 1) || (!bo.isNullOrNil(this.ocK)))
        {
          localObject1 = new com/tencent/mm/plugin/mall/a/f;
          ((com.tencent.mm.plugin.mall.a.f)localObject1).<init>(this.okT, com.tencent.mm.plugin.wallet_core.model.mall.b.cQS(), 0);
          a((m)localObject1, true, false);
          return;
        }
        localObject3 = getIntent().getStringExtra("key_url");
        Object localObject1 = localObject3;
        if (localObject3 == null)
          localObject1 = "";
        localObject3 = new com/tencent/mm/plugin/mall/a/f;
        ((com.tencent.mm.plugin.mall.a.f)localObject3).<init>(this.okT, com.tencent.mm.plugin.wallet_core.model.mall.b.cQS(), getIntent().getStringExtra("key_app_id"), this.okO, (String)localObject1);
        a((m)localObject3, true, false);
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        ab.printErrStackTrace("MicroMsg.MallIndexBaseUI", localUnsupportedEncodingException, "", new Object[0]);
        bNg();
        continue;
      }
      Object localObject3 = cm(this.okP);
      Object localObject2 = localObject3;
      if (localObject3 == null)
        localObject2 = cn(this.okP);
      a((MallFunction)localObject2, -1);
      finish();
      continue;
      bNd();
      ab.d("MicroMsg.MallIndexBaseUI", "initFunctionList");
      if (com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT) == null)
      {
        a(new com.tencent.mm.plugin.mall.a.f(this.okT, com.tencent.mm.plugin.wallet_core.model.mall.b.cQS(), 0), true, false);
        ab.e("MicroMsg.MallIndexBaseUI", "funcitonlist invalid");
        i = 0;
      }
      while (true)
      {
        if (i == 0)
          break label362;
        ab.i("MicroMsg.MallIndexBaseUI", "has data");
        cu();
        break;
        a(new com.tencent.mm.plugin.mall.a.f(this.okT, com.tencent.mm.plugin.wallet_core.model.mall.b.cQS(), 1), false, false);
        this.okP = com.tencent.mm.plugin.mall.a.j.bMV().ym(this.okT);
      }
    }
  }

  public void onStop()
  {
    super.onStop();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void yq(int paramInt)
  {
    if ((paramInt == 12) && (this.omy != null))
      bNi();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexBaseUI
 * JD-Core Version:    0.6.2
 */