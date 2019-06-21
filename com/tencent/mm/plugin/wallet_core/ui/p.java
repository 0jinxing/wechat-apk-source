package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.oa;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.a.c;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.soter.a.g.f;
import com.tenpay.android.wechat.MyKeyboardWindow;

public final class p extends i
  implements d
{
  protected DialogInterface.OnCancelListener Ue;
  private String cHI;
  private String czZ;
  protected boolean gHY;
  public ImageView gvq;
  private boolean isPaused;
  public View jcl;
  protected MyKeyboardWindow mKeyboard;
  private Animation msx;
  private int msy;
  protected View nTi;
  public ImageView oft;
  public TextView pUA;
  public TextView qcc;
  public ImageView tGW;
  public TextView tJA;
  public TextView tJB;
  public FavourLayout tJC;
  public CdnImageView tJD;
  public TextView tJE;
  public EditHintPasswdView tJF;
  public b tJG;
  public View tJH;
  public View tJI;
  public TextView tJJ;
  public ImageView tJK;
  public TextView tJL;
  public TextView tJM;
  public View tJN;
  public TextView tJO;
  protected a tJP;
  protected DialogInterface.OnClickListener tJQ;
  protected boolean tJR;
  protected boolean tJS;
  protected Bankcard tJT;
  public TextView tJU;
  public View tJV;
  public TextView tJW;
  protected int tJX;
  protected boolean tJY;
  private int tJZ;
  public Button tJz;
  private Animation tKa;
  private String tKb;
  private long tKc;
  private int tKd;
  private int tKe;
  private boolean tKf;
  protected com.tencent.mm.plugin.wallet_core.utils.a tln;
  public TextView tpG;

  private p(Context paramContext)
  {
    super(paramContext, 2131493871);
    AppMethodBeat.i(47565);
    this.tJR = false;
    this.tJS = true;
    this.tJT = null;
    this.tln = new com.tencent.mm.plugin.wallet_core.utils.a();
    this.tJX = 0;
    this.tJY = false;
    this.tJZ = 0;
    this.msy = 0;
    this.tKa = null;
    this.tKb = "";
    this.tKc = -1L;
    this.tKd = 0;
    this.cHI = "";
    this.tKe = 0;
    this.tKf = false;
    this.isPaused = false;
    ab.v("MicroMsg.WalletPwdCustomDialog", "alvinluo WalletPwdDialog initView");
    this.jcl = View.inflate(paramContext, 2130971107, null);
    this.tJz = ((Button)this.jcl.findViewById(2131822912));
    this.oft = ((ImageView)this.jcl.findViewById(2131826480));
    this.mKeyboard = ((MyKeyboardWindow)this.jcl.findViewById(2131822357));
    this.nTi = this.jcl.findViewById(2131822356);
    this.qcc = ((TextView)this.jcl.findViewById(2131821019));
    this.tJA = ((TextView)this.jcl.findViewById(2131829019));
    this.pUA = ((TextView)this.jcl.findViewById(2131826481));
    this.tpG = ((TextView)this.jcl.findViewById(2131826482));
    this.tpG.getPaint().setFlags(16);
    this.tJB = ((TextView)this.jcl.findViewById(2131825789));
    this.tJC = ((FavourLayout)this.jcl.findViewById(2131828748));
    this.tJD = ((CdnImageView)this.jcl.findViewById(2131829026));
    this.tJH = this.jcl.findViewById(2131829022);
    this.tJE = ((TextView)this.jcl.findViewById(2131826485));
    this.gvq = ((ImageView)this.jcl.findViewById(2131826478));
    this.tJI = this.jcl.findViewById(2131826483);
    this.tJJ = ((TextView)this.jcl.findViewById(2131829025));
    a.b.b(this.gvq, com.tencent.mm.wallet_core.ui.e.getUsername());
    this.tJF = ((EditHintPasswdView)this.jcl.findViewById(2131824902));
    this.tJK = ((ImageView)this.jcl.findViewById(2131826484));
    this.tJU = ((TextView)this.jcl.findViewById(2131829020));
    this.tJV = this.jcl.findViewById(2131828755);
    this.tJW = ((TextView)this.jcl.findViewById(2131828757));
    this.tGW = ((ImageView)this.jcl.findViewById(2131828756));
    this.tJL = ((TextView)this.jcl.findViewById(2131827122));
    this.tJM = ((TextView)this.jcl.findViewById(2131829024));
    this.tJN = this.jcl.findViewById(2131829021);
    this.tJO = ((TextView)this.jcl.findViewById(2131829023));
    this.tJC.setVisibility(8);
    setCanceledOnTouchOutside(true);
    getWindow().setSoftInputMode(2);
    this.tJz.setEnabled(false);
    this.tJz.setTextColor(paramContext.getResources().getColorStateList(2131690777));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.tJF);
    this.tJF.setOnInputValidListener(new p.1(this));
    this.tJF.requestFocus();
    Object localObject = (TextView)this.jcl.findViewById(2131829019);
    if (localObject != null)
      ((TextView)localObject).setText(ae.ir(paramContext));
    paramContext = (EditText)this.jcl.findViewById(2131820687);
    com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(paramContext);
    this.mKeyboard.setInputEditText(paramContext);
    if (Build.VERSION.SDK_INT >= 14)
    {
      localObject = new c();
      this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
      paramContext.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
    }
    paramContext.setOnClickListener(new p.2(this));
    this.jcl.findViewById(2131822358).setOnClickListener(new p.3(this));
    cRM();
    AppMethodBeat.o(47565);
  }

  public static p a(Context paramContext, String paramString1, String paramString2, String paramString3, boolean paramBoolean, b paramb, DialogInterface.OnCancelListener paramOnCancelListener, a parama)
  {
    AppMethodBeat.i(47575);
    if (((Activity)paramContext).isFinishing())
    {
      AppMethodBeat.o(47575);
      paramContext = null;
      return paramContext;
    }
    p localp = new p(paramContext);
    if (localp.tJz != null)
    {
      localp.tJQ = null;
      localp.tJz.setOnClickListener(new p.6(localp));
    }
    if (localp.oft != null)
    {
      localp.Ue = paramOnCancelListener;
      localp.oft.setVisibility(0);
      localp.oft.setOnClickListener(new p.7(localp, paramOnCancelListener));
    }
    localp.setOnCancelListener(paramOnCancelListener);
    localp.setCancelable(true);
    localp.qcc.setText(paramString1);
    if (!TextUtils.isEmpty(paramString2))
    {
      localp.pUA.setVisibility(0);
      localp.pUA.setText(paramString2);
      label157: localp.tJI.setVisibility(8);
      localp.tJS = false;
      localp.tJP = parama;
      if (TextUtils.isEmpty(paramString3))
        break label266;
      localp.tJL.setVisibility(0);
      localp.tJL.setText(paramString3);
    }
    while (true)
    {
      localp.tJG = paramb;
      localp.tJY = paramBoolean;
      if (!com.tencent.mm.model.r.YM())
        localp.cRM();
      localp.show();
      com.tencent.mm.ui.base.h.a(paramContext, localp);
      AppMethodBeat.o(47575);
      paramContext = localp;
      break;
      localp.pUA.setVisibility(8);
      break label157;
      label266: ab.i("MicroMsg.WalletPwdCustomDialog", "ChargeFee is null");
      localp.tJL.setVisibility(8);
    }
  }

  private void cRM()
  {
    AppMethodBeat.i(47566);
    ab.v("MicroMsg.WalletPwdCustomDialog", "alvinluo updateFingerprintMode");
    this.tJZ = 0;
    this.tJU.setVisibility(8);
    this.tJV.setVisibility(8);
    this.tKc = bo.yz();
    ak localak = com.tencent.mm.plugin.wallet_core.model.r.cPI();
    l locall = (l)g.K(l.class);
    if ((localak != null) && (locall.bxe()));
    for (boolean bool1 = locall.bxz(); ; bool1 = true)
    {
      ab.i("MicroMsg.WalletPwdCustomDialog", "hy: soter key status: %b", new Object[] { Boolean.valueOf(bool1) });
      this.tKd = 0;
      this.cHI = "";
      if ((locall != null) && (locall.bxn()) && (!locall.bxf()));
      for (bool1 = true; ; bool1 = false)
      {
        ab.v("MicroMsg.WalletPwdCustomDialog", "alvinluo isDeviceSupportFp: %b", new Object[] { Boolean.valueOf(bool1) });
        boolean bool2;
        if ((locall != null) && (locall.bxe()))
        {
          bool2 = true;
          if ((!bool2) || (!bool1) || (!this.tJY) || (cRP()))
            break label414;
          this.tJU.setVisibility(0);
          this.tJU.setText(getContext().getString(2131305244));
          this.tJX = 1;
          this.tJV.setVisibility(0);
          this.tGW.setVisibility(0);
          this.tJF.setVisibility(8);
          this.nTi.setVisibility(8);
          this.tJA.setText(2131305237);
          this.tKd = 1;
          cRy();
          com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        }
        while (true)
        {
          ab.i("MicroMsg.WalletPwdCustomDialog", "isOpenTouch:" + bool2 + ",  isDeviceSupport:" + bool1 + ", use_pay_touch:" + this.tJY + ", isForcePwdMode:" + cRP());
          this.tJU.setOnClickListener(new p.4(this));
          AppMethodBeat.o(47566);
          return;
          bool2 = false;
          break;
          label414: if ((bool2) && (bool1) && (this.tJY) && (cRP()))
          {
            this.tJU.setText(getContext().getString(2131304802));
            this.tJU.setVisibility(0);
            this.tJX = 0;
            this.tJV.setVisibility(8);
            this.tJF.setVisibility(0);
            if (!this.nTi.isShown())
              this.nTi.setVisibility(0);
            this.tJA.setText(2131305242);
            this.tKd = 0;
            this.cHI = "";
            com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
            com.tencent.mm.wallet_core.ui.e.QS(8);
          }
          else
          {
            this.tKd = 0;
            this.cHI = "";
            this.tJU.setVisibility(8);
            com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          }
        }
      }
    }
  }

  private void cRN()
  {
    AppMethodBeat.i(47567);
    this.tJU.setText(getContext().getString(2131304802));
    this.tJX = 0;
    this.tKc = bo.yz();
    this.tJV.setVisibility(8);
    this.tJF.setVisibility(0);
    if (!this.nTi.isShown())
      this.nTi.setVisibility(0);
    this.tJA.setText(2131305242);
    nl(true);
    this.tKd = 0;
    this.cHI = "";
    com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    com.tencent.mm.wallet_core.ui.e.QS(29);
    cRz();
    AppMethodBeat.o(47567);
  }

  private static boolean cRP()
  {
    AppMethodBeat.i(47579);
    g.RQ();
    Object localObject = g.RP().Ry().get(ac.a.xKM, Boolean.FALSE);
    if (localObject != null);
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(47579);
      return bool;
    }
  }

  private void cRy()
  {
    AppMethodBeat.i(47568);
    ab.i("MicroMsg.WalletPwdCustomDialog", "reqFingerPrintAuth %s", new Object[] { bo.dpG().toString() });
    com.tencent.mm.plugin.soter.d.a.cvP();
    lv locallv = new lv();
    locallv.cHD.cBT = this.czZ;
    locallv.cHD.cHF = 1;
    locallv.cHD.cHH = new p.5(this, locallv);
    com.tencent.mm.sdk.b.a.xxA.a(locallv, Looper.getMainLooper());
    AppMethodBeat.o(47568);
  }

  private static void cRz()
  {
    AppMethodBeat.i(47569);
    ab.i("MicroMsg.WalletPwdCustomDialog", "hy: send release FPManager");
    oa localoa = new oa();
    com.tencent.mm.sdk.b.a.xxA.m(localoa);
    AppMethodBeat.o(47569);
  }

  private static void nl(boolean paramBoolean)
  {
    AppMethodBeat.i(47578);
    g.RQ();
    g.RP().Ry().set(ac.a.xKM, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(47578);
  }

  protected final void cRO()
  {
    AppMethodBeat.i(47574);
    nl(false);
    if (this.tJQ != null)
      this.tJQ.onClick(this, 0);
    dismiss();
    boolean bool;
    if (this.tJG != null)
    {
      ab.i("MicroMsg.WalletPwdCustomDialog", "doOk use_touch: %s soterAuthReq: %s ", new Object[] { Integer.valueOf(this.tKd), this.cHI });
      b localb = this.tJG;
      String str = this.tJF.getText();
      if (this.tKd == 1)
      {
        bool = true;
        localb.f(str, bool, this.cHI);
      }
    }
    else
    {
      if (this.tKc >= 0L)
        break label132;
      ab.e("MicroMsg.WalletPwdCustomDialog", "hy: not set update mode time yet. abandon");
      AppMethodBeat.o(47574);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label132: if (this.tJX == 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(686L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(686L, 1L, bo.az(this.tKc), false);
        AppMethodBeat.o(47574);
      }
      else
      {
        if (this.tJX == 1)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(686L, 2L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(686L, 3L, bo.az(this.tKc), false);
        }
        AppMethodBeat.o(47574);
      }
    }
  }

  public final void cRm()
  {
    AppMethodBeat.i(47576);
    this.isPaused = false;
    if (com.tencent.mm.model.r.YM())
      AppMethodBeat.o(47576);
    while (true)
    {
      return;
      AppMethodBeat.o(47576);
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(47573);
    try
    {
      super.dismiss();
      cRz();
      this.tln.destory();
      if (this.msx != null)
        this.msx.cancel();
      AppMethodBeat.o(47573);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.WalletPwdCustomDialog", "dismiss exception, e = " + localException.getMessage());
    }
  }

  public final void onActivityPause()
  {
    AppMethodBeat.i(47577);
    this.isPaused = true;
    if (com.tencent.mm.model.r.YM())
      AppMethodBeat.o(47577);
    while (true)
    {
      return;
      if (this.tJX == 1)
        cRN();
      AppMethodBeat.o(47577);
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47571);
    super.onCreate(paramBundle);
    setContentView(this.jcl);
    f.dRn().dRo();
    AppMethodBeat.o(47571);
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47570);
    if (paramInt == 4)
    {
      if (this.Ue != null)
        this.Ue.onCancel(this);
      if (this.tJP != null)
        this.tJP.bXx();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(47570);
    return bool;
  }

  public final void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(47572);
    super.setCancelable(paramBoolean);
    this.gHY = paramBoolean;
    setCanceledOnTouchOutside(this.gHY);
    AppMethodBeat.o(47572);
  }

  public static abstract interface a
  {
    public abstract void bXx();
  }

  public static abstract interface b
  {
    public abstract void f(String paramString1, boolean paramBoolean, String paramString2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.p
 * JD-Core Version:    0.6.2
 */