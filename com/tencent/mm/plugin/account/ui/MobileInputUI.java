package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

public class MobileInputUI extends MMActivity
{
  protected String countryCode;
  protected String fHE;
  protected int flQ;
  private com.tencent.mm.sdk.b.c gAY;
  protected String gBE;
  protected EditText gBJ;
  protected Button gBP;
  protected Button gBQ;
  private View gBR;
  protected Button gBS;
  protected MMFormInputView gCV;
  private ResizeLayout gCa;
  private Button gCj;
  protected int[] gCr;
  protected MMFormInputView gDH;
  protected EditText gDI;
  protected MMFormVerifyCodeInputView gDJ;
  protected View gDK;
  protected TextView gDL;
  protected Button gDM;
  protected Button gDN;
  protected TextView gDO;
  protected TextView gDP;
  protected TextView gDQ;
  protected Button gDR;
  protected View gDS;
  protected boolean gDT;
  protected String gDU;
  protected String gDV;
  private int gDW;
  private MobileInputUI.b gDX;
  protected boolean gDY;
  protected boolean gDa;
  private MMKeyboardUperView gDb;
  protected boolean gDc;
  private final int gDd;
  protected LinearLayout grF;
  protected TextView grH;
  protected String grJ;
  protected String gsF;
  protected p guc;

  public MobileInputUI()
  {
    AppMethodBeat.i(125183);
    this.gDT = true;
    this.gDU = null;
    this.gDV = null;
    this.grJ = null;
    this.fHE = null;
    this.countryCode = null;
    this.gBE = null;
    this.gDW = 0;
    this.gCr = new int[5];
    this.gDc = false;
    this.gAY = new MobileInputUI.1(this);
    this.gDd = 128;
    AppMethodBeat.o(125183);
  }

  private static void R(Context paramContext, String paramString)
  {
    AppMethodBeat.i(125196);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    com.tencent.mm.bp.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(125196);
  }

  private void apc()
  {
    AppMethodBeat.i(125189);
    if ((!bo.isNullOrNil(this.fHE)) && (!bo.isNullOrNil(this.countryCode)))
      AppMethodBeat.o(125189);
    while (true)
    {
      return;
      this.gBE = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      ab.d("MicroMsg.MobileInputUI", "tm.getSimCountryIso()" + this.gBE);
      if (bo.isNullOrNil(this.gBE))
      {
        ab.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
        AppMethodBeat.o(125189);
      }
      else
      {
        b.a locala = com.tencent.mm.au.b.k(this, this.gBE, getString(2131298789));
        if (locala == null)
        {
          ab.e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
          AppMethodBeat.o(125189);
        }
        else
        {
          this.countryCode = av.amO(locala.fHD);
          this.fHE = locala.fHE;
          AppMethodBeat.o(125189);
        }
      }
    }
  }

  private void are()
  {
    AppMethodBeat.i(125191);
    aqX();
    this.gDX.a(MobileInputUI.a.gEd);
    AppMethodBeat.o(125191);
  }

  private void arf()
  {
    AppMethodBeat.i(125194);
    if ((!bo.isNullOrNil(this.fHE)) && (!bo.isNullOrNil(this.countryCode)))
    {
      this.grH.setText(av.hS(this.fHE, this.countryCode));
      AppMethodBeat.o(125194);
    }
    while (true)
    {
      return;
      this.grH.setText(getString(2131301449));
      AppMethodBeat.o(125194);
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(125192);
    if (this.gDY)
    {
      aqX();
      Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      com.tencent.mm.ui.base.b.hM(this);
      AppMethodBeat.o(125192);
    }
    while (true)
    {
      return;
      this.gDX.a(MobileInputUI.a.gEc);
      com.tencent.mm.plugin.b.a.wA(this.gsF);
      aqX();
      finish();
      AppMethodBeat.o(125192);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(125187);
    super.finish();
    overridePendingTransition(2131034130, 2131034130);
    com.tencent.mm.plugin.report.service.h.pYm.e(14262, new Object[] { Integer.valueOf(this.gCr[0]), Integer.valueOf(this.gCr[1]), Integer.valueOf(this.gCr[2]), Integer.valueOf(this.gCr[3]), Integer.valueOf(this.gCr[4]) });
    AppMethodBeat.o(125187);
  }

  public final int getLayoutId()
  {
    return 2130970237;
  }

  public final void initView()
  {
    AppMethodBeat.i(125190);
    this.gCV = ((MMFormInputView)findViewById(2131826122));
    this.gBJ = this.gCV.getContentEditText();
    com.tencent.mm.ui.tools.b.c.d(this.gBJ).PM(16).a(null);
    this.gDH = ((MMFormInputView)findViewById(2131826121));
    this.gDH.setInputType(3);
    this.gDI = this.gDH.getContentEditText();
    this.gDJ = ((MMFormVerifyCodeInputView)findViewById(2131825301));
    this.gDJ.setInputType(3);
    this.grF = ((LinearLayout)findViewById(2131821726));
    this.grH = ((TextView)findViewById(2131821728));
    this.gDK = findViewById(2131826123);
    this.gDL = ((TextView)findViewById(2131826124));
    this.gDM = ((Button)findViewById(2131826067));
    this.gDN = ((Button)findViewById(2131822846));
    this.gDO = ((TextView)findViewById(2131826119));
    this.gDP = ((TextView)findViewById(2131821135));
    this.gDQ = ((TextView)findViewById(2131826120));
    this.gDR = ((Button)findViewById(2131825291));
    this.gCj = ((Button)findViewById(2131825293));
    this.gBP = ((Button)findViewById(2131825295));
    this.gBQ = ((Button)findViewById(2131825297));
    this.gBR = findViewById(2131825296);
    this.gBS = ((Button)findViewById(2131825298));
    this.gDS = findViewById(2131826125);
    this.gCa = ((ResizeLayout)findViewById(2131825288));
    this.gDb = ((MMKeyboardUperView)findViewById(2131820921));
    this.grF.setVisibility(8);
    this.gCV.setVisibility(8);
    this.gDJ.setVisibility(8);
    this.gDH.setVisibility(8);
    this.gDO.setVisibility(8);
    this.gDP.setVisibility(8);
    this.gDN.setVisibility(8);
    this.gDK.setVisibility(8);
    this.gDR.setVisibility(8);
    this.gCa.setOnSizeChanged(new MobileInputUI.15(this));
    this.gBP.setOnClickListener(new MobileInputUI.16(this));
    this.gBQ.setOnClickListener(new MobileInputUI.17(this));
    Object localObject = new com.tencent.mm.ui.widget.a.d(this, 1, false);
    ((com.tencent.mm.ui.widget.a.d)localObject).rBl = new MobileInputUI.18(this);
    ((com.tencent.mm.ui.widget.a.d)localObject).rBm = new MobileInputUI.19(this);
    ((com.tencent.mm.ui.widget.a.d)localObject).zQf = new MobileInputUI.20(this);
    if (aa.doo())
    {
      this.gBS.setOnClickListener(new MobileInputUI.2(this));
      localObject = new boolean[1];
      localObject[0] = 1;
      this.gDI.setOnFocusChangeListener(new MobileInputUI.4(this, (boolean[])localObject));
      this.gDI.addTextChangedListener(new MobileInputUI.5(this, (boolean[])localObject));
      this.gBJ.addTextChangedListener(new MobileInputUI.6(this));
      this.gDI.setOnEditorActionListener(new MobileInputUI.7(this));
      this.gDI.setOnKeyListener(new MobileInputUI.8(this));
      localObject = new boolean[1];
      localObject[0] = 0;
      this.gDN.setEnabled(false);
      this.gDN.setOnTouchListener(new MobileInputUI.9(this, (boolean[])localObject));
      this.gDN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(125170);
          if (this.gEb[0] != 0)
            this.gEb[0] = false;
          while (true)
          {
            MobileInputUI.f(MobileInputUI.this);
            AppMethodBeat.o(125170);
            return;
            com.tencent.mm.plugin.normsg.a.b.oTO.fu("ce_reg_eu", "<Reg>");
            paramAnonymousView = MotionEvent.obtain(0L, 0L, 1, 0.0F, 0.0F, 65535);
            com.tencent.mm.plugin.normsg.a.b.oTO.a("ce_reg_eu", paramAnonymousView);
            com.tencent.mm.plugin.normsg.a.b.oTO.TN("ce_reg_eu");
          }
        }
      });
      if (!bo.isNullOrNil(this.countryCode))
        break label860;
      this.fHE = getString(2131298791);
      this.countryCode = av.amO(getString(2131298790));
    }
    while (true)
    {
      apc();
      arf();
      if (bo.isNullOrNil(this.grJ))
        this.gDI.setText(this.grJ);
      this.grF.setOnClickListener(new MobileInputUI.11(this));
      localObject = "";
      if (com.tencent.mm.protocal.d.vxr)
        localObject = getString(2131296982) + getString(2131296513);
      setMMTitle((String)localObject);
      xE(getResources().getColor(2131690310));
      dyb();
      AppMethodBeat.o(125190);
      return;
      this.gBR.setVisibility(8);
      this.gBS.setText(2131301006);
      this.gBS.setOnClickListener(new MobileInputUI.3(this, (com.tencent.mm.ui.widget.a.d)localObject));
      break;
      label860: this.fHE = com.tencent.mm.au.b.l(this, this.countryCode, getString(2131298789));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int i = 0;
    AppMethodBeat.i(125195);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 32047)
    {
      if (paramIntent != null)
        localObject3 = paramIntent.getBundleExtra("result_data");
      if ((localObject3 != null) && (((Bundle)localObject3).getString("go_next", "").equals("agree_privacy")))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(712L, 2L, 1L, false);
        if ((this.gDX instanceof k))
          ((k)this.gDX).gDz = 0;
        this.gDX.a(MobileInputUI.a.gEd);
        AppMethodBeat.o(125195);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(712L, 1L, 1L, false);
      if ((this.gDX instanceof k))
        ((k)this.gDX).gDz = 1;
      AppMethodBeat.o(125195);
      continue;
      if (paramInt1 == 32046)
      {
        localObject3 = localObject1;
        if (paramIntent != null)
          localObject3 = paramIntent.getBundleExtra("result_data");
        if ((paramInt2 == -1) && (localObject3 != null) && (((Bundle)localObject3).getString("go_next", "").equals("get_reg_verify_code")))
        {
          if ((this.gDX instanceof k))
            ((k)this.gDX).gDz = 2;
          this.gDX.a(MobileInputUI.a.gEd);
        }
        AppMethodBeat.o(125195);
      }
      else
      {
        if (paramInt1 != 32045)
          break;
        localObject3 = localObject2;
        if (paramIntent != null)
          localObject3 = paramIntent.getBundleExtra("result_data");
        if ((paramInt2 == -1) && (localObject3 != null) && (((Bundle)localObject3).getString("go_next", "").equals("auth_again")) && ((this.gDX instanceof l)))
          this.gDX.a(MobileInputUI.a.gEd);
        AppMethodBeat.o(125195);
      }
    }
    switch (paramInt2)
    {
    default:
    case 100:
    case -1:
    }
    label376: 
    do
    {
      AppMethodBeat.o(125195);
      break;
      this.fHE = bo.bc(paramIntent.getStringExtra("country_name"), "");
      this.countryCode = bo.bc(paramIntent.getStringExtra("couttry_code"), "");
      this.gBE = bo.bc(paramIntent.getStringExtra("iso_code"), "");
      if ((this.gDW == 2) && (!com.tencent.mm.au.b.sP(this.countryCode)))
      {
        paramIntent = new Intent(this, RegByMobileRegAIOUI.class);
        paramIntent.putExtra("couttry_code", this.countryCode);
        paramIntent.putExtra("country_name", this.fHE);
        paramIntent.putExtra("iso_code", this.gBE);
        startActivity(paramIntent);
        finish();
        AppMethodBeat.o(125195);
        break;
      }
      arf();
      AppMethodBeat.o(125195);
      break;
    }
    while ((paramInt1 != 1024) || (paramIntent == null));
    localObject3 = paramIntent.getStringExtra("VoiceLoginAuthPwd");
    paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
    boolean bool = bo.isNullOrNil((String)localObject3);
    if (bo.isNullOrNil((String)localObject3));
    for (paramInt1 = i; ; paramInt1 = ((String)localObject3).length())
    {
      ab.d("MicroMsg.MobileInputUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != -217)
        break label376;
      are();
      AppMethodBeat.o(125195);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125184);
    super.onCreate(paramBundle);
    getWindow().getDecorView().setBackgroundColor(this.mController.ylL.getResources().getColor(2131690311));
    this.gDW = getIntent().getIntExtra("mobile_input_purpose", 0);
    this.flQ = getIntent().getIntExtra("mobile_auth_type", 0);
    this.gDY = getIntent().getBooleanExtra("can_finish", false);
    setBackBtn(new MobileInputUI.12(this), 2131230735);
    xE(this.mController.ylL.getResources().getColor(2131690310));
    dyb();
    switch (this.gDW)
    {
    case 0:
    default:
      ab.e("MicroMsg.MobileInputUI", "wrong purpose %s", new Object[] { Integer.valueOf(this.gDW) });
      finish();
      AppMethodBeat.o(125184);
      return;
    case 1:
      if (!bo.isNullOrNil(getIntent().getStringExtra("auth_ticket")))
        this.gDX = new l();
      break;
    case 2:
    case 3:
    case 4:
    case -1:
    }
    while (true)
    {
      this.countryCode = av.amO(bo.bc(getIntent().getStringExtra("couttry_code"), ""));
      this.fHE = bo.bc(getIntent().getStringExtra("country_name"), "");
      this.gBE = bo.nullAsNil(getIntent().getStringExtra("iso_code"));
      this.grJ = bo.bc(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
      this.gDU = av.amP(this.countryCode);
      this.gDV = bo.bc(getIntent().getStringExtra("input_mobile_number"), "");
      this.gsF = com.tencent.mm.plugin.b.a.arO();
      initView();
      this.gDc = getIntent().getBooleanExtra("from_deep_link", false);
      if ((this.gDc) && (!bo.isNullOrNil(this.gDU)) && (!bo.isNullOrNil(this.gDV)))
        this.gDH.setText(this.gDV);
      this.gDX.a(this);
      if (f.EX_DEVICE_LOGIN)
      {
        this.gCj.setVisibility(0);
        this.gCj.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(125174);
            com.tencent.mm.bp.d.H(MobileInputUI.this, "login_exdevice", ".ui.LoginAsExDeviceUI");
            MobileInputUI.this.overridePendingTransition(2131034226, 2131034130);
            AppMethodBeat.o(125174);
          }
        });
      }
      this.gDa = getIntent().getBooleanExtra("from_switch_account", false);
      AppMethodBeat.o(125184);
      break;
      paramBundle = getIntent().getIntArrayExtra("kv_report_login_method_data");
      if (paramBundle != null)
        this.gCr = paramBundle;
      this.gDX = new i();
      continue;
      this.gDX = new k();
      continue;
      this.gDX = new h();
      continue;
      this.gDX = new j();
      continue;
      this.gDX = new l();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125188);
    com.tencent.mm.plugin.normsg.a.b.oTO.TK("ie_reg_eu");
    this.gDJ.reset();
    super.onDestroy();
    AppMethodBeat.o(125188);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125193);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(125193);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125193);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(125186);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    this.gDX.stop();
    AppMethodBeat.o(125186);
  }

  public void onResume()
  {
    AppMethodBeat.i(125185);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    this.gDX.start();
    AppMethodBeat.o(125185);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void setRequestedOrientation(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI
 * JD-Core Version:    0.6.2
 */