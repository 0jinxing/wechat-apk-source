package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.oa;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.plugin.wallet_core.c.s;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.protobuf.bjk;
import com.tencent.mm.protocal.protobuf.chz;
import com.tencent.mm.protocal.protobuf.rp;
import com.tencent.mm.protocal.protobuf.sc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

@com.tencent.mm.ui.base.a(3)
public class WalletCheckPwdUI extends WalletBaseUI
{
  private int cCF = 0;
  private String czZ;
  private String gEk;
  private TextView gnj;
  private ScrollView hJh;
  protected EditHintPasswdView nrZ;
  private boolean tHd = false;
  private LinearLayout tHe;
  private ImageView tHf;
  private TextView tHg;
  private TextView tHh;
  private TextView tHi;
  private boolean tHj = false;
  private boolean tHk = false;
  private String tHl;
  private int tHm = 0;
  private int tHn;
  private String tHo;
  private String tHp;
  private Animation tHq;
  private c.a tHr;

  private void a(bjk parambjk)
  {
    AppMethodBeat.i(47348);
    if ((parambjk != null) && (!bo.isNullOrNil(parambjk.title)))
      this.tHh.setText(parambjk.title);
    if ((parambjk != null) && (!bo.isNullOrNil(parambjk.wMQ)))
      this.tHi.setText(parambjk.wMQ);
    cRx();
    AppMethodBeat.o(47348);
  }

  private void cRw()
  {
    AppMethodBeat.i(47349);
    ab.i("Micromsg.WalletCheckPwdUI", "change mode: %s", new Object[] { Integer.valueOf(this.cCF) });
    if (this.cCF == 1)
    {
      this.tHe.setVisibility(0);
      this.nrZ.setVisibility(8);
      this.gnj.setText(2131304734);
      this.tHe.postDelayed(new WalletCheckPwdUI.6(this), 300L);
      if (!bo.isNullOrNil(this.tHp))
      {
        this.tHi.setText(this.tHp);
        AppMethodBeat.o(47349);
      }
    }
    while (true)
    {
      return;
      this.tHi.setText(2131304738);
      AppMethodBeat.o(47349);
      continue;
      this.tHe.setVisibility(8);
      this.nrZ.cey();
      this.nrZ.setVisibility(0);
      this.gnj.setText(2131304733);
      dOC();
      if (!bo.isNullOrNil(this.tHo))
      {
        this.tHi.setText(this.tHo);
        AppMethodBeat.o(47349);
      }
      else
      {
        this.tHi.setText(2131304737);
        AppMethodBeat.o(47349);
      }
    }
  }

  private void cRx()
  {
    AppMethodBeat.i(47350);
    c localc = dOD();
    if (localc != null)
      if ("UnbindProcess".equals(localc.bxP()))
      {
        this.tHh.setText(2131304857);
        this.tHi.setText(2131304743);
        AppMethodBeat.o(47350);
      }
    while (true)
    {
      return;
      if ((localc instanceof com.tencent.mm.plugin.wallet_core.b.b))
      {
        this.tHh.setText(2131304839);
        this.tHi.setText(2131304743);
        AppMethodBeat.o(47350);
      }
      else if ("ModifyPwdProcess".equals(localc.bxP()))
      {
        this.tHh.setText(2131305018);
        this.tHi.setText(2131304743);
        AppMethodBeat.o(47350);
      }
      else
      {
        if ("OfflineProcess".equals(localc.bxP()))
        {
          this.tHh.setText(2131304742);
          this.tHi.setText(2131304743);
        }
        AppMethodBeat.o(47350);
      }
    }
  }

  private void cRy()
  {
    AppMethodBeat.i(47355);
    com.tencent.mm.plugin.soter.d.a.cvP();
    lv locallv = new lv();
    locallv.cHD.cBT = this.czZ;
    locallv.cHD.cHF = 1;
    locallv.cHD.cHH = new WalletCheckPwdUI.8(this, locallv);
    com.tencent.mm.sdk.b.a.xxA.a(locallv, Looper.getMainLooper());
    AppMethodBeat.o(47355);
  }

  private static void cRz()
  {
    AppMethodBeat.i(47356);
    ab.i("Micromsg.WalletCheckPwdUI", "hy: send release FPManager");
    oa localoa = new oa();
    com.tencent.mm.sdk.b.a.xxA.m(localoa);
    AppMethodBeat.o(47356);
  }

  public final void AM(int paramInt)
  {
    AppMethodBeat.i(47341);
    this.mController.contentView.setVisibility(paramInt);
    AppMethodBeat.o(47341);
  }

  public final void bLz()
  {
    AppMethodBeat.i(47343);
    ab.d("Micromsg.WalletCheckPwdUI", "check pwd ");
    this.Ahr.bLz();
    AppMethodBeat.o(47343);
  }

  public final boolean bwP()
  {
    return this.tHd;
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = true;
    AppMethodBeat.i(47351);
    ab.d("Micromsg.WalletCheckPwdUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    boolean bool2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof r))
      {
        paramString = this.mBundle;
        paramString.putString("key_pwd1", this.nrZ.getText());
        com.tencent.mm.wallet_core.a.j(this, paramString);
        if (this.nrZ != null)
          this.nrZ.cey();
        finish();
        AppMethodBeat.o(47351);
        bool2 = bool1;
      }
    while (true)
    {
      return bool2;
      if ((paramm instanceof y))
      {
        com.tencent.mm.ui.base.h.bQ(this, getString(2131304749));
        paramString = com.tencent.mm.wallet_core.a.aE(this);
        if (paramString != null)
          paramString.mqu.putInt("key_process_result_code", -1);
        com.tencent.mm.wallet_core.a.j(this, paramString.mqu);
        if (this.nrZ != null)
          this.nrZ.cey();
        finish();
        break;
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
        this.tHl = ((com.tencent.mm.plugin.wallet_core.c.a)paramm).getToken();
        setResult(-1);
        a(((rp)((com.tencent.mm.plugin.wallet_core.c.a)paramm).ehh.fsH.fsP).vYW);
        AM(0);
        break;
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.b))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.c.b)paramm;
        this.tHl = paramString.ttM.token;
        this.czZ = paramString.ttM.vwr;
        f.akr(paramString.ttM.vwr);
        if (paramString.ttM.vYW != null)
        {
          this.tHo = paramString.ttM.vYW.wMQ;
          this.tHp = paramString.ttM.vYW.wMR;
        }
        setResult(-1);
        a(paramString.ttM.vYW);
        paramString = paramString.ttM.vZv;
        if ((paramString != null) && (paramString.vPM != null))
        {
          paramm = (l)com.tencent.mm.kernel.g.K(l.class);
          if ((paramString.xhl == 1) && (paramString.xhm == 1) && (paramm.bxo()) && (paramm.bxn()) && (!paramm.bxf()))
          {
            ab.i("Micromsg.WalletCheckPwdUI", "can use touch pay");
            this.cCF = 1;
            if (paramString.vPM != null)
              v.tCn.msn = paramString.vPM.dlY();
            paramm = v.tCn;
            if (paramString.vPN != 1)
              break label504;
          }
        }
        label504: for (bool2 = true; ; bool2 = false)
        {
          paramm.mso = bool2;
          cRy();
          this.gnj.setVisibility(0);
          cRw();
          AM(0);
          break;
        }
      }
      if (!(paramm instanceof s))
        break;
      paramString = (s)paramm;
      if (paramString.cOT())
      {
        ab.i("Micromsg.WalletCheckPwdUI", "need free sms");
        paramm = new Bundle();
        paramm.putString("key_pwd1", this.gEk);
        paramm.putString("key_jsapi_token", this.tHl);
        paramm.putString("key_relation_key", paramString.tul);
        paramm.putString("key_mobile", paramString.tuk);
        this.tHr = new WalletCheckPwdUI.7(this);
        com.tencent.mm.wallet_core.a.a(this, n.class, paramm, this.tHr);
        break;
      }
      paramString = new Intent();
      paramString.putExtra("token", ((s)paramm).tui);
      setResult(-1, paramString);
      finish();
      break;
      if (this.nrZ != null)
        this.nrZ.cey();
      if (((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a)) || ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.b)))
      {
        ab.i("Micromsg.WalletCheckPwdUI", "check jsapi fail");
        paramString = com.tencent.mm.wallet_core.a.aE(this);
        if ((paramString != null) && (paramString.bxP().equals("UnbindProcess")))
        {
          setResult(1);
          paramString.mqu.putInt("key_process_result_code", 1);
          com.tencent.mm.wallet_core.a.j(this, paramString.mqu);
        }
        while (true)
        {
          AppMethodBeat.o(47351);
          bool2 = bool1;
          break;
          setResult(0);
          finish();
        }
      }
      AppMethodBeat.o(47351);
      bool2 = false;
    }
  }

  public boolean cNR()
  {
    boolean bool = false;
    AppMethodBeat.i(47353);
    if (this.mBundle.getInt("key_pay_flag", 0) != 0)
    {
      bool = true;
      AppMethodBeat.o(47353);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(47353);
    }
  }

  public int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971083;
  }

  public final void initView()
  {
    AppMethodBeat.i(47347);
    bo.ac(dOF());
    this.nrZ = ((EditHintPasswdView)findViewById(2131824902));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.nrZ);
    this.nrZ.setOnInputValidListener(new EditHintPasswdView.a()
    {
      public final void hY(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(47334);
        if (paramAnonymousBoolean)
        {
          WalletCheckPwdUI.a(WalletCheckPwdUI.this, WalletCheckPwdUI.this.nrZ.getText());
          c localc = com.tencent.mm.wallet_core.a.aE(WalletCheckPwdUI.this);
          String str = null;
          if (localc != null)
            str = localc.bxP();
          if ((WalletCheckPwdUI.b(WalletCheckPwdUI.this)) && (!"UnbindProcess".equals(str)))
          {
            WalletCheckPwdUI.this.a(new s(WalletCheckPwdUI.c(WalletCheckPwdUI.this), WalletCheckPwdUI.d(WalletCheckPwdUI.this), (byte)0), true, true);
            com.tencent.mm.plugin.report.service.h.pYm.e(15021, new Object[] { Integer.valueOf(1) });
            AppMethodBeat.o(47334);
          }
        }
        while (true)
        {
          return;
          if (!WalletCheckPwdUI.this.dOE().p(new Object[] { WalletCheckPwdUI.c(WalletCheckPwdUI.this), WalletCheckPwdUI.this.cNH() }))
            WalletCheckPwdUI.this.a(new r(WalletCheckPwdUI.c(WalletCheckPwdUI.this), 1, WalletCheckPwdUI.this.cNH()), true, true);
          AppMethodBeat.o(47334);
        }
      }
    });
    this.hJh = ((ScrollView)findViewById(2131828750));
    this.tHe = ((LinearLayout)findViewById(2131828755));
    this.tHf = ((ImageView)findViewById(2131828756));
    this.tHh = ((TextView)findViewById(2131824899));
    this.tHi = ((TextView)findViewById(2131828754));
    this.tHg = ((TextView)findViewById(2131828757));
    this.gnj = ((TextView)findViewById(2131828758));
    this.gnj.setOnClickListener(new WalletCheckPwdUI.4(this));
    this.obM = new WalletCheckPwdUI.5(this);
    e(this.nrZ, 0, false);
    dOC();
    AppMethodBeat.o(47347);
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = -1;
    AppMethodBeat.i(47342);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    dyb();
    paramBundle = getIntent();
    Object localObject;
    if ((paramBundle != null) && (getIntent().hasExtra("scene")))
    {
      i = paramBundle.getIntExtra("scene", -1);
      if (i != 1)
        break label493;
      this.tHj = true;
      ab.d("Micromsg.WalletCheckPwdUI", "check pwd jsapi");
      AM(4);
      paramBundle = null;
      if (!this.tHk)
        break label289;
      localObject = com.tencent.mm.wallet_core.a.aE(this);
      if (localObject != null)
        paramBundle = ((c)localObject).mqu;
      localObject = paramBundle;
      if (paramBundle != null)
        break label324;
      ab.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] process.getContextData null");
      setResult(1);
      finish();
    }
    while (true)
    {
      initView();
      cRx();
      setBackBtn(new WalletCheckPwdUI.1(this));
      findViewById(2131828753).setOnClickListener(new WalletCheckPwdUI.2(this));
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(-2147483648);
        paramBundle.setStatusBarColor(getResources().getColor(2131690310));
        if (Build.VERSION.SDK_INT >= 23)
          paramBundle.getDecorView().setSystemUiVisibility(8192);
      }
      this.mController.contentView.setFitsSystemWindows(true);
      AppMethodBeat.o(47342);
      return;
      paramBundle = com.tencent.mm.wallet_core.a.aE(this);
      if (paramBundle == null)
        break;
      i = paramBundle.mqu.getInt("scene", -1);
      if ((i == 1) && ("UnbindProcess".equals(paramBundle.bxP())));
      for (boolean bool = true; ; bool = false)
      {
        this.tHk = bool;
        break;
      }
      label289: if (getIntent() == null)
      {
        ab.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] intent null");
        setResult(0);
        finish();
      }
      else
      {
        localObject = getIntent().getExtras();
        label324: String str1 = ((Bundle)localObject).getString("appId");
        paramBundle = ((Bundle)localObject).getString("timeStamp");
        String str2 = ((Bundle)localObject).getString("nonceStr");
        String str3 = ((Bundle)localObject).getString("packageExt");
        String str4 = ((Bundle)localObject).getString("signtype");
        String str5 = ((Bundle)localObject).getString("paySignature");
        String str6 = ((Bundle)localObject).getString("url");
        i = ((Bundle)localObject).getInt("pay_channel", 0);
        if (this.tHk)
          ab.i("Micromsg.WalletCheckPwdUI", "appId is null? " + bo.isNullOrNil(str1));
        for (paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(str1, paramBundle, str2, str3, str4, str5, str6, 10, "verifyWCPayPassword", i); ; paramBundle = new com.tencent.mm.plugin.wallet_core.c.b(str1, paramBundle, str2, str3, str4, str5, str6, "verifyWCPayPassword", i))
        {
          a(paramBundle, true, false);
          break;
        }
        label493: AM(0);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47346);
    super.onDestroy();
    cRz();
    AppMethodBeat.o(47346);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47352);
    boolean bool;
    if ((this.nTi != null) && (this.nTi.isShown()))
    {
      this.nTi.setVisibility(8);
      bool = true;
      AppMethodBeat.o(47352);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(47352);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(47345);
    super.onPause();
    this.cCF = 0;
    cRw();
    cRz();
    ng(580);
    AppMethodBeat.o(47345);
  }

  public void onResume()
  {
    AppMethodBeat.i(47344);
    if (this.nrZ != null)
      this.nrZ.cey();
    nf(580);
    super.onResume();
    AppMethodBeat.o(47344);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(47354);
    if (this.tHd)
    {
      finish();
      AppMethodBeat.o(47354);
    }
    while (true)
    {
      return;
      if (this.nrZ != null)
        this.nrZ.cey();
      AppMethodBeat.o(47354);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI
 * JD-Core Version:    0.6.2
 */