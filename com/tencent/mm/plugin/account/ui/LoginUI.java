package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.bx;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ag;
import com.tencent.mm.platformtools.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.widget.a.d.a;

public class LoginUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private TextWatcher arx;
  private String cOG;
  private String cxb;
  private ProgressDialog ehJ;
  private com.tencent.mm.sdk.b.c gAY;
  protected Button gBP;
  protected Button gBQ;
  private View gBR;
  protected Button gBS;
  private f gBT;
  private String gBV;
  private String gBW;
  private MMClearEditText gCS;
  private MMClearEditText gCT;
  private MMFormInputView gCU;
  private MMFormInputView gCV;
  private Button gCW;
  private Button gCX;
  protected View gCY;
  private String gCZ;
  private ResizeLayout gCa;
  private com.tencent.mm.platformtools.c gCd;
  private Button gCj;
  private boolean gDa;
  private MMKeyboardUperView gDb;
  private boolean gDc;
  private final int gDd;
  private String gsF;
  private SecurityImage gue;
  private String gzO;
  private int sceneType;

  public LoginUI()
  {
    AppMethodBeat.i(125052);
    this.ehJ = null;
    this.cxb = null;
    this.gue = null;
    this.gBT = new f();
    this.cOG = "";
    this.sceneType = 0;
    this.arx = new LoginUI.1(this);
    this.gDc = false;
    this.gAY = new LoginUI.12(this);
    this.gDd = 128;
    AppMethodBeat.o(125052);
  }

  private static void R(Context paramContext, String paramString)
  {
    AppMethodBeat.i(125058);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    com.tencent.mm.bp.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(125058);
  }

  private void aqU()
  {
    AppMethodBeat.i(125063);
    this.gBT.account = this.gCS.getText().toString().trim();
    this.gBT.guf = this.gCT.getText().toString();
    if (this.gBT.account.equals(""))
    {
      com.tencent.mm.ui.base.h.g(this, 2131304239, 2131301017);
      AppMethodBeat.o(125063);
    }
    while (true)
    {
      return;
      if (this.gBT.guf.equals(""))
      {
        com.tencent.mm.ui.base.h.g(this, 2131304235, 2131301017);
        AppMethodBeat.o(125063);
      }
      else
      {
        aqX();
        com.tencent.mm.kernel.g.Rg().a(252, this);
        com.tencent.mm.kernel.g.Rg().a(701, this);
        com.tencent.mm.modelsimple.q localq = new com.tencent.mm.modelsimple.q(this.gBT.account, this.gBT.guf, this.gzO, 2);
        com.tencent.mm.kernel.g.Rg().a(localq, 0);
        getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131301031), true, new LoginUI.18(this, localq));
        AppMethodBeat.o(125063);
      }
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(125060);
    aqX();
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    com.tencent.mm.pluginsdk.model.app.p.dhH();
    finish();
    AppMethodBeat.o(125060);
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(125061);
    if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
    {
      AppMethodBeat.o(125061);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramInt1 == 4);
      switch (paramInt2)
      {
      default:
        paramString = new ag(paramInt1, paramInt2, paramString);
        bool = this.gCd.a(this, paramString);
        AppMethodBeat.o(125061);
        break;
      case -1:
        if (com.tencent.mm.kernel.g.Rg().acS() == 5)
        {
          com.tencent.mm.ui.base.h.g(this, 2131301656, 2131301655);
          AppMethodBeat.o(125061);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(125061);
        }
        break;
      case -3:
        com.tencent.mm.ui.base.h.g(this, 2131299241, 2131301017);
        AppMethodBeat.o(125061);
        bool = true;
        break;
      case -9:
        com.tencent.mm.ui.base.h.g(this, 2131301016, 2131301017);
        AppMethodBeat.o(125061);
        bool = true;
        break;
      case -72:
        com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131302315, 2131297061);
        AppMethodBeat.o(125061);
        bool = true;
        break;
      case -75:
        z.cu(this.mController.ylL);
        AppMethodBeat.o(125061);
        bool = true;
        break;
      case -311:
      case -310:
      case -6:
        com.tencent.mm.kernel.g.Rg().a(701, this);
        com.tencent.mm.kernel.g.Rg().a(252, this);
        if (this.gue == null)
          this.gue = SecurityImage.a.a(this, this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui, new LoginUI.11(this), null, new LoginUI.13(this), this.gBT);
        while (true)
        {
          AppMethodBeat.o(125061);
          bool = true;
          break;
          ab.d("MicroMsg.LoginUI", "imgSid:" + this.gBT.guh + " img len" + this.gBT.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
          this.gue.b(this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui);
        }
      case -100:
        com.tencent.mm.kernel.a.hold();
        AppCompatActivity localAppCompatActivity = this.mController.ylL;
        com.tencent.mm.kernel.g.RN();
        if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
        for (paramString = com.tencent.mm.bz.a.an(this.mController.ylL, 2131301294); ; paramString = com.tencent.mm.kernel.a.QH())
        {
          com.tencent.mm.ui.base.h.a(localAppCompatActivity, paramString, this.mController.ylL.getString(2131297061), new LoginUI.14(this), new LoginUI.15(this));
          AppMethodBeat.o(125061);
          bool = true;
          break;
          com.tencent.mm.kernel.g.RN();
        }
      case -205:
        ab.i("MicroMsg.LoginUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bo.anv(this.gzO), this.gBW });
        f.a(this.gBT);
        com.tencent.mm.plugin.b.a.wA("L600_100");
        paramString = new Intent();
        paramString.putExtra("auth_ticket", this.gzO);
        paramString.putExtra("binded_mobile", this.gBV);
        paramString.putExtra("close_safe_device_style", this.gBW);
        paramString.putExtra("from_source", 1);
        com.tencent.mm.plugin.account.a.a.gkE.g(this, paramString);
        AppMethodBeat.o(125061);
        bool = true;
        break;
      case -140:
        if (!bo.isNullOrNil(this.cOG))
          z.o(this, paramString, this.cOG);
        AppMethodBeat.o(125061);
        bool = true;
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(125064);
    super.finish();
    overridePendingTransition(2131034130, 2131034130);
    AppMethodBeat.o(125064);
  }

  public final int getLayoutId()
  {
    return 2130969949;
  }

  public final void initView()
  {
    AppMethodBeat.i(125057);
    this.gCU = ((MMFormInputView)findViewById(2131825289));
    this.gCV = ((MMFormInputView)findViewById(2131825290));
    this.gCS = ((MMClearEditText)this.gCU.getContentEditText());
    this.gCT = ((MMClearEditText)this.gCV.getContentEditText());
    com.tencent.mm.ui.tools.b.c.d(this.gCT).PM(16).a(null);
    this.gCW = ((Button)findViewById(2131825292));
    this.gCW.setEnabled(false);
    this.gCX = ((Button)findViewById(2131825291));
    this.gCj = ((Button)findViewById(2131825293));
    this.gCY = findViewById(2131825294);
    this.gCY.setVisibility(0);
    this.gBP = ((Button)findViewById(2131825295));
    this.gBR = findViewById(2131825296);
    this.gBQ = ((Button)findViewById(2131825297));
    this.gBS = ((Button)findViewById(2131825298));
    this.gCa = ((ResizeLayout)findViewById(2131825288));
    this.gDb = ((MMKeyboardUperView)findViewById(2131820921));
    this.gCa.setOnSizeChanged(new LoginUI.19(this));
    this.gBP.setOnClickListener(new LoginUI.20(this));
    this.gBQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(125048);
        paramAnonymousView = LoginUI.this.getString(2131305899, new Object[] { aa.dor() });
        LoginUI.S(LoginUI.this, paramAnonymousView);
        AppMethodBeat.o(125048);
      }
    });
    Object localObject = new com.tencent.mm.ui.widget.a.d(this, 1, false);
    ((com.tencent.mm.ui.widget.a.d)localObject).rBl = new LoginUI.22(this);
    ((com.tencent.mm.ui.widget.a.d)localObject).zQf = new d.a()
    {
      public final void onDismiss()
      {
      }
    };
    ((com.tencent.mm.ui.widget.a.d)localObject).rBm = new LoginUI.24(this);
    if (aa.doo())
      this.gBS.setOnClickListener(new LoginUI.25(this));
    while (true)
    {
      setMMTitle("");
      setBackBtn(new LoginUI.3(this), 2131230735);
      this.gCW.setOnClickListener(new LoginUI.4(this));
      this.gCX.setOnClickListener(new LoginUI.5(this));
      this.gzO = getIntent().getStringExtra("auth_ticket");
      if (!bo.isNullOrNil(this.gzO))
      {
        this.gCS.setText(bo.nullAsNil(f.ara()));
        this.gCT.setText(bo.nullAsNil(f.arb()));
        new ak().postDelayed(new LoginUI.6(this), 500L);
      }
      this.gCS.addTextChangedListener(this.arx);
      this.gCT.addTextChangedListener(this.arx);
      this.gCT.setOnEditorActionListener(new LoginUI.7(this));
      this.gCT.setOnKeyListener(new LoginUI.8(this));
      if (com.tencent.mm.sdk.platformtools.g.xyf)
        com.tencent.mm.plugin.account.a.a.gkF.p(this);
      localObject = getIntent().getStringExtra("login_username");
      this.gDc = getIntent().getBooleanExtra("from_deep_link", false);
      if (!bo.isNullOrNil((String)localObject))
        this.gCS.setText((CharSequence)localObject);
      if (com.tencent.mm.sdk.platformtools.f.EX_DEVICE_LOGIN)
      {
        this.gCj.setVisibility(0);
        this.gCj.setOnClickListener(new LoginUI.9(this));
      }
      AppMethodBeat.o(125057);
      return;
      this.gBR.setVisibility(8);
      this.gBS.setText(2131301006);
      this.gBS.setOnClickListener(new LoginUI.2(this, (com.tencent.mm.ui.widget.a.d)localObject));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(125065);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      ab.d("MicroMsg.LoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (paramInt2 != -1)
        break label241;
      if ((paramInt1 != 1024) || (paramIntent == null))
        break label196;
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bo.isNullOrNil(str);
      if (!bo.isNullOrNil(str))
        break label178;
      paramInt1 = i;
      label110: ab.d("MicroMsg.LoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != -217)
        break label187;
      this.gBT.guf = str;
      aqU();
      AppMethodBeat.o(125065);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label178: paramInt1 = str.length();
      break label110;
      label187: AppMethodBeat.o(125065);
      continue;
      label196: if ((paramInt1 == 32644) && (paramIntent != null))
      {
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("auth_again")))
          aqU();
      }
      label241: AppMethodBeat.o(125065);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125053);
    super.onCreate(paramBundle);
    getWindow().getDecorView().setBackgroundColor(this.mController.ylL.getResources().getColor(2131690311));
    paramBundle = "";
    if (com.tencent.mm.protocal.d.vxr)
      paramBundle = getString(2131296982) + getString(2131296513);
    this.sceneType = getIntent().getIntExtra("login_type", 0);
    setMMTitle(paramBundle);
    xE(getResources().getColor(2131690310));
    dyb();
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    this.gCd = new com.tencent.mm.platformtools.c();
    this.gDa = getIntent().getBooleanExtra("from_switch_account", false);
    this.gCZ = av.fly.T("login_weixin_username", "");
    paramBundle = getIntent().getIntArrayExtra("kv_report_login_method_data");
    if (paramBundle != null)
      com.tencent.mm.plugin.report.service.h.pYm.e(14262, new Object[] { Integer.valueOf(paramBundle[0]), Integer.valueOf(paramBundle[1]), Integer.valueOf(paramBundle[2]), Integer.valueOf(paramBundle[3]), Integer.valueOf(paramBundle[4]) });
    AppMethodBeat.o(125053);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125056);
    if (this.gCd != null)
      this.gCd.close();
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    super.onDestroy();
    AppMethodBeat.o(125056);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125059);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(125059);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125059);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(125055);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    StringBuilder localStringBuilder;
    if (this.sceneType == 0)
    {
      localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L100_100_logout,");
      com.tencent.mm.kernel.g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L100_100_logout") + ",2");
      AppMethodBeat.o(125055);
    }
    while (true)
    {
      return;
      if (this.sceneType == 1)
      {
        localStringBuilder = new StringBuilder();
        com.tencent.mm.kernel.g.RN();
        localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L400_100_login,");
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L400_100_login") + ",2");
      }
      AppMethodBeat.o(125055);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(125054);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    StringBuilder localStringBuilder;
    if (this.sceneType == 0)
    {
      localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L100_100_logout,");
      com.tencent.mm.kernel.g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L100_100_logout") + ",1");
      com.tencent.mm.plugin.b.a.wz("L100_100_logout");
      AppMethodBeat.o(125054);
    }
    while (true)
    {
      return;
      if (this.sceneType == 1)
      {
        localStringBuilder = new StringBuilder();
        com.tencent.mm.kernel.g.RN();
        localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L400_100_login,");
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L400_100_login") + ",1");
        com.tencent.mm.plugin.b.a.wz("L400_100_login");
      }
      AppMethodBeat.o(125054);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125062);
    ab.i("MicroMsg.LoginUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramm.getType() != 252) && (paramm.getType() != 701))
    {
      AppMethodBeat.o(125062);
      return;
    }
    com.tencent.mm.kernel.g.Rg().b(252, this);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    this.cOG = ((com.tencent.mm.modelsimple.q)paramm).ajm();
    this.gBT.guh = ((com.tencent.mm.modelsimple.q)paramm).ajn();
    this.gBT.gug = ((com.tencent.mm.modelsimple.q)paramm).ajo();
    this.gBT.gui = ((com.tencent.mm.modelsimple.q)paramm).ajp();
    this.gBT.gCL = ((com.tencent.mm.modelsimple.q)paramm).getSecCodeType();
    this.gBT.account = ((com.tencent.mm.modelsimple.q)paramm).account;
    if (paramInt2 == -205)
    {
      this.gzO = ((com.tencent.mm.modelsimple.q)paramm).agh();
      this.gBV = ((com.tencent.mm.modelsimple.q)paramm).ajq();
      this.gBW = ((com.tencent.mm.modelsimple.q)paramm).ajt();
    }
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      com.tencent.mm.kernel.g.Rg().a(new bk(new LoginUI.16(this)), 0);
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        l.apX();
        z.vx(this.gBT.account);
        paramString = av.fly.T("login_weixin_username", "");
        w.cm(this);
        if (this.gDa)
        {
          bx.fnB.an(this.gCZ, paramString);
          bx.fnB.g(r.Yz(), r.Zg());
          com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(9), bx.fnB.aau() });
        }
        z.showAddrBookUploadConfirm(this, new LoginUI.17(this, paramm), false, 2);
        paramString = new StringBuilder();
        com.tencent.mm.kernel.g.RN();
        paramString = paramString.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_900_phone,");
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R200_900_phone") + ",4");
        if (this.gDc)
        {
          paramString = ah.getContext().getSharedPreferences("randomid_prefs", com.tencent.mm.compatible.util.h.Mu()).getString("randomID", "");
          com.tencent.mm.plugin.report.service.h.pYm.e(11930, new Object[] { paramString, Integer.valueOf(4) });
        }
        AppMethodBeat.o(125062);
        break;
      }
      if (paramInt2 == -106)
      {
        z.f(this, paramString, 32644);
        AppMethodBeat.o(125062);
        break;
      }
      if (paramInt2 == -217)
      {
        z.a(this, e.a((com.tencent.mm.modelsimple.q)paramm), paramInt2);
        AppMethodBeat.o(125062);
        break;
      }
      if (j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(125062);
        break;
      }
      if (paramInt2 == -5)
      {
        Toast.makeText(this, getString(2131301040), 0).show();
        AppMethodBeat.o(125062);
        break;
      }
      paramString = com.tencent.mm.h.a.jY(paramString);
      if ((paramString != null) && (paramString.a(this, null, null)))
      {
        AppMethodBeat.o(125062);
        break;
      }
      Toast.makeText(this, getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(125062);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI
 * JD-Core Version:    0.6.2
 */