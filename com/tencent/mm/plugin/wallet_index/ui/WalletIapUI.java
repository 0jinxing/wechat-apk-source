package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_index.c.l;
import com.tencent.mm.protocal.protobuf.auh;
import com.tencent.mm.protocal.protobuf.aui;
import com.tencent.mm.protocal.protobuf.blm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.c.t;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(7)
public class WalletIapUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private final int DEFAULT;
  private final int OK;
  private int currentState;
  private int czV;
  private Dialog iMU;
  private com.tencent.mm.sdk.b.c piM;
  private com.tencent.mm.sdk.b.c tRS;
  private final int tRX;
  private final int tRY;
  private final int tRZ;
  private c tRr;
  private d tRt;
  private final int tSa;
  private final int tSb;
  private final int tSc;
  private final int tSd;
  private boolean tSe;
  private int tSf;
  private boolean tSg;
  private String tSh;
  private b tSi;
  private d tSj;

  public WalletIapUI()
  {
    AppMethodBeat.i(48278);
    this.tRX = 4;
    this.tRY = 0;
    this.tRZ = 1;
    this.tSa = 2;
    this.tSb = 3;
    this.OK = 1000;
    this.tSc = 1001;
    this.tSd = 1002;
    this.DEFAULT = 1003;
    this.tSe = false;
    this.tSf = 0;
    this.currentState = 1003;
    this.tSh = "0";
    this.czV = 0;
    this.tRS = new WalletIapUI.1(this);
    this.tSj = new WalletIapUI.2(this);
    this.tRt = new WalletIapUI.3(this);
    this.piM = new WalletIapUI.4(this);
    AppMethodBeat.o(48278);
  }

  private void aoW()
  {
    AppMethodBeat.i(48286);
    ab.i("MicroMsg.WalletIapUI", "showLoadingDialog!");
    this.iMU = com.tencent.mm.wallet_core.ui.g.a(this, getString(2131297086), new WalletIapUI.5(this));
    AppMethodBeat.o(48286);
  }

  private void aoX()
  {
    AppMethodBeat.i(48287);
    ab.i("MicroMsg.WalletIapUI", "hideLoadingDialog!");
    if ((this.iMU != null) && (this.iMU.isShowing()))
    {
      this.iMU.dismiss();
      this.iMU = null;
    }
    AppMethodBeat.o(48287);
  }

  public void finish()
  {
    AppMethodBeat.i(48285);
    ab.i("MicroMsg.WalletIapUI", "finish");
    aoX();
    super.finish();
    AppMethodBeat.o(48285);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48283);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.WalletIapUI", "onActivityResult resultCode : ".concat(String.valueOf(paramInt2)));
    if ((paramIntent != null) && (paramIntent.getExtras() != null) && (paramIntent.getExtras().get("key_total_fee") != null))
    {
      this.tSh = paramIntent.getExtras().get("key_total_fee").toString();
      ab.i("MicroMsg.WalletIapUI", "has payAmount:%s", new Object[] { this.tSh });
      if (this.tSi == null)
        break label127;
      this.tSi.a(this, paramInt1, paramInt2, paramIntent);
      ab.d("MicroMsg.WalletIapUI", "onActivityResult handled by mWalletPay.");
      AppMethodBeat.o(48283);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletIapUI", "no payAmount");
      break;
      label127: ab.e("MicroMsg.WalletIapUI", "havn't handle user action");
      Intent localIntent = new Intent();
      paramIntent = com.tencent.mm.plugin.wallet_index.c.b.bu(6, "");
      localIntent.putExtra("key_err_code", paramIntent.nqa);
      localIntent.putExtra("key_err_msg", paramIntent.nqb);
      localIntent.putExtra("key_launch_ts", a.tRs);
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(48283);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48279);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.WalletIapUI", "onCreate");
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(422, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(414, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1130, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1306, this);
    if (getIntent().getIntExtra("key_action_type", 200001) == 200001)
      aoW();
    this.tSg = getIntent().getBooleanExtra("key_is_mini_program", false);
    this.tRr = new c();
    this.tRr.tRE = this.tSg;
    if ((getIntent().getBooleanExtra("key_force_google", false)) || (r.YL()))
      ab.d("MicroMsg.WalletIapUI", "Pay use Google Wallet!");
    for (this.tSi = new a(this, this.tRr, this.tRt); ; this.tSi = new f(this.tRr, this.piM))
    {
      this.tRr.peo = this.tSi.cSW();
      com.tencent.mm.sdk.b.a.xxA.c(this.tRS);
      AppMethodBeat.o(48279);
      return;
      ab.d("MicroMsg.WalletIapUI", "Pay use WeiXin Wallet!");
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48282);
    ab.i("MicroMsg.WalletIapUI", "onDestroy");
    aoX();
    if (this.currentState == 1003)
      this.currentState = 1001;
    String str = "";
    if (getIntent() != null)
      str = getIntent().getStringExtra("key_appid");
    int i;
    int j;
    if ((this.tSi instanceof f))
    {
      i = 0;
      long l = ()(bo.getDouble(this.tSh, 0.0D) * 100.0D);
      ab.i("MicroMsg.WalletIapUI", "reportPaymentState report(%s), isMiniProgram : %b, appid %s, walletType %s, currentScene %s, currentState %s, payAmount %s, payamount %s", new Object[] { Integer.valueOf(15751), Boolean.valueOf(this.tSg), str, Integer.valueOf(i), Integer.valueOf(this.tSf), Integer.valueOf(this.currentState), this.tSh, Long.valueOf(l) });
      h localh = h.pYm;
      if (!this.tSg)
        break label403;
      j = 0;
      label176: localh.e(15751, new Object[] { Integer.valueOf(j), str, Integer.valueOf(i), Integer.valueOf(this.tSf), Integer.valueOf(this.currentState), this.tSh, Long.valueOf(l) });
      h.pYm.a(1044L, this.currentState - 1000, 1L, false);
      if (this.currentState != 1001)
        break label409;
      h.pYm.a(1044L, this.tSf + 4, 1L, false);
    }
    while (true)
    {
      if (this.tSi != null)
        this.tSi.l(this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(422, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(414, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(1130, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(1306, this);
      com.tencent.mm.sdk.b.a.xxA.d(this.tRS);
      super.onDestroy();
      AppMethodBeat.o(48282);
      return;
      i = 1;
      break;
      label403: j = 1;
      break label176;
      label409: if (this.currentState == 1002)
        h.pYm.a(1044L, this.tSf + 8, 1L, false);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(48281);
    ab.i("MicroMsg.WalletIapUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(48281);
  }

  public void onResume()
  {
    AppMethodBeat.i(48280);
    ab.i("MicroMsg.WalletIapUI", "onResume");
    super.onResume();
    ab.i("MicroMsg.WalletIapUI", "Handler jump");
    Object localObject1;
    String str1;
    String str2;
    String str3;
    c localc;
    int i;
    if (!this.tSe)
    {
      this.tSe = true;
      localObject1 = getIntent();
      if (((Intent)localObject1).getIntExtra("key_action_type", 200001) == 200002)
      {
        ab.i("MicroMsg.WalletIapUI", "start to restore the purchase!");
        this.tSf = 3;
        this.tSi.b(this, true);
        AppMethodBeat.o(48280);
        return;
      }
      localObject2 = this.tRr;
      str1 = ((Intent)localObject1).getStringExtra("key_product_id");
      ((c)localObject2).kWz = str1;
      ((c)localObject2).tRD.add(str1);
      ab.d("MicroMsg.IapData", "prepare pay product: ".concat(String.valueOf(str1)));
      this.tRr.tQY = ((Intent)localObject1).getStringExtra("key_price");
      this.tRr.tQX = ((Intent)localObject1).getStringExtra("key_currency_type");
      str2 = ((Intent)localObject1).getStringExtra("key_ext_info");
      this.tRr.mCount = ((Intent)localObject1).getIntExtra("key_count", 1);
      str1 = ((Intent)localObject1).getStringExtra("key_appid");
      localObject2 = ((Intent)localObject1).getStringExtra("key_desc");
      str3 = ((Intent)localObject1).getStringExtra("key_busiid");
      this.tRr.tRF = ((Intent)localObject1).getStringExtra("key_virtual_pay_sign");
      this.tRr.tRG = ((Intent)localObject1).getStringExtra("key_attach");
      com.tencent.mm.kernel.g.RQ();
      localObject1 = com.tencent.mm.kernel.g.RO().eJo;
      localc = this.tRr;
      i = this.tSi.cSW();
      if (!localc.tRE)
        break label331;
    }
    label331: for (Object localObject2 = new com.tencent.mm.plugin.wallet_index.c.f(i, str1, localc.tQY, (String)localObject2, localc.mCount, localc.tQX, str3, localc.tRF, localc.tRG); ; localObject2 = new s(localc.kWz, localc.tQY, localc.tQX, localc.mCount, i, str2))
    {
      ((p)localObject1).a((m)localObject2, 0);
      AppMethodBeat.o(48280);
      break;
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48284);
    ab.i("MicroMsg.WalletIapUI", "onSceneEnd type:" + paramm.getType() + " errCode:" + paramInt2 + ",errMsg:" + paramString);
    paramString = com.tencent.mm.plugin.wallet_index.c.b.bu(paramInt2, paramString);
    paramInt2 = paramString.nqa;
    paramString = paramString.nqb;
    paramInt1 = paramm.getType();
    switch (paramInt1)
    {
    default:
      ab.w("MicroMsg.WalletIapUI", "get a wrong sceneType : ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(48284);
    case 422:
    case 1130:
      while (true)
      {
        return;
        c localc = this.tRr;
        localObject = com.tencent.mm.plugin.wallet_index.c.b.bu(paramInt2, paramString);
        paramInt1 = ((com.tencent.mm.plugin.wallet_index.c.b)localObject).nqa;
        s locals;
        if ((paramm instanceof s))
        {
          locals = (s)paramm;
          if (paramInt1 == 0)
          {
            if (!localc.cSX())
              break label336;
            paramm = (blm)locals.ehh.fsH.fsP;
            if (paramm == null)
              break label322;
            paramString = new aui();
            paramString.wyq = paramm.wOw;
            paramString.wyr = paramm.wOx;
            paramString.cIf = 5;
            paramString.wys = paramm.wOy;
            ab.d("MicroMsg.NetScenePreparePurchase", "get Sign4TenPay is " + paramm.wOy);
            label276: localc.tRf = paramString;
          }
        }
        while (true)
        {
          if (((com.tencent.mm.plugin.wallet_index.c.b)localObject).nqa != 0)
            break label574;
          this.czV = this.tSi.a(this, this.tSj);
          this.tSf = 1;
          AppMethodBeat.o(48284);
          break;
          label322: ab.e("MicroMsg.NetScenePreparePurchase", "getIapWxPayData fail.");
          paramString = null;
          break label276;
          label336: paramm = (blm)locals.ehh.fsH.fsP;
          if (paramm != null)
          {
            paramString = new auh();
            paramString.wma = locals.tQX;
            paramString.pho = locals.kWz;
            paramString.pdz = locals.tQY;
            paramString.wym = paramm.wOv;
            ab.d("MicroMsg.NetScenePreparePurchase", "getIapGoogleData is " + paramm.wOv);
          }
          while (true)
          {
            localc.tRe = paramString;
            break;
            ab.e("MicroMsg.NetScenePreparePurchase", "getIapGoogleData fail.");
            paramString = null;
          }
          if ((paramm instanceof com.tencent.mm.plugin.wallet_index.c.f))
          {
            paramString = (com.tencent.mm.plugin.wallet_index.c.f)paramm;
            if ((paramInt1 == 0) && (paramString.errCode == 0))
            {
              localc.tRf = paramString.tRf;
              localc.tRe = paramString.tRe;
              if (localc.cSX())
              {
                if (localc.tRf != null)
                  localc.tRw = localc.tRf.wym;
                else
                  ab.e("MicroMsg.IapData", "iapWxPayData is null");
              }
              else if (localc.tRe != null)
                localc.tRw = localc.tRe.wym;
              else
                ab.e("MicroMsg.IapData", "iapGoogleData is null");
            }
          }
        }
        label574: this.currentState = 1002;
        ab.i("MicroMsg.WalletIapUI", "back to preview UI, reason: PreparePurchase fail , errCode: " + ((com.tencent.mm.plugin.wallet_index.c.b)localObject).nqa + " , errMsg: " + ((com.tencent.mm.plugin.wallet_index.c.b)localObject).nqb);
        paramString = new Intent();
        paramString.putExtra("key_err_code", ((com.tencent.mm.plugin.wallet_index.c.b)localObject).nqa);
        paramString.putExtra("key_err_msg", ((com.tencent.mm.plugin.wallet_index.c.b)localObject).nqb);
        paramString.putExtra("key_response_position", 1);
        setResult(-1, paramString);
        finish();
        AppMethodBeat.o(48284);
      }
    case 414:
    case 1306:
    }
    Object localObject = this.tRr;
    if ((paramm instanceof t))
    {
      paramm = (t)paramm;
      ((c)localObject).kWz = paramm.kWz;
      ((c)localObject).tRB = paramm.kWB;
      ((c)localObject).tRC = paramm.tRC;
      if (paramm.errCode == 0)
        paramInt1 = 1;
    }
    while (true)
    {
      label742: ((c)localObject).tRD.remove(((c)localObject).kWz);
      if (paramInt1 != 0)
      {
        ab.i("MicroMsg.IapData", "Verify " + ((c)localObject).kWz + " OK");
        ((c)localObject).tRz.add(((c)localObject).kWz);
        ((c)localObject).tRA.add(((c)localObject).tRB);
      }
      while (true)
      {
        bool = false;
        while (true)
        {
          if (!this.tRr.tRD.isEmpty())
            break label1236;
          ab.d("MicroMsg.WalletIapUI", "Verify All End... ");
          if (this.tRr.tRz.isEmpty())
            break label1137;
          ab.i("MicroMsg.WalletIapUI", "mResultProductIds size: " + this.tRr.tRz.size() + ", Consume ...");
          this.tSi.a(this, this.tRr.tRz, this.tRt, bool);
          AppMethodBeat.o(48284);
          break;
          paramInt1 = 0;
          break label742;
          if (!(paramm instanceof l))
            break label1245;
          paramm = (l)paramm;
          ((c)localObject).kWz = paramm.cwg;
          if (paramm.errCode == 0)
          {
            paramInt1 = 1;
            break label742;
          }
          paramInt1 = 0;
          break label742;
          if (!((c)localObject).kWz.startsWith("com.tencent.xin.wco"))
            break label1101;
          if (((c)localObject).tRC <= 0)
            break label1065;
          ((c)localObject).tRz.add(((c)localObject).kWz);
          ((c)localObject).tRA.add(((c)localObject).tRB);
          ab.i("MicroMsg.IapData", "Verify " + ((c)localObject).kWz + " fail and cosume");
        }
        label1065: ab.i("MicroMsg.IapData", "Verify " + ((c)localObject).kWz + " fail");
        continue;
        label1101: ab.i("MicroMsg.IapData", "Verify " + ((c)localObject).kWz + " fail");
      }
      label1137: ab.i("MicroMsg.WalletIapUI", "back to preview UI, reason: VerifyPurchase fail , errCode: " + paramInt2 + " , errMsg: " + paramString);
      this.currentState = 1002;
      paramm = new Intent();
      paramm.putExtra("key_err_code", paramInt2);
      paramm.putExtra("key_err_msg", paramString);
      paramm.putExtra("key_response_position", 3);
      paramm.putExtra("key_launch_ts", a.tRs);
      setResult(-1, paramm);
      finish();
      label1236: AppMethodBeat.o(48284);
      break;
      label1245: paramInt1 = 0;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletIapUI
 * JD-Core Version:    0.6.2
 */