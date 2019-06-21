package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.bx;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.modelsimple.r;
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
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class LoginHistoryUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private String cOG;
  protected ProgressDialog ehJ;
  private SharedPreferences ehZ;
  private com.tencent.mm.sdk.b.c gAY;
  protected TextView gBI;
  protected EditText gBJ;
  protected Button gBK;
  protected Button gBL;
  protected View gBM;
  protected View gBN;
  protected View gBO;
  protected Button gBP;
  protected Button gBQ;
  private View gBR;
  protected Button gBS;
  protected f gBT;
  protected String gBU;
  protected String gBV;
  private String gBW;
  private String gBX;
  private ImageView gBY;
  private MMKeyboardUperView gBZ;
  private ResizeLayout gCa;
  protected String gCb;
  private String gCc;
  private com.tencent.mm.platformtools.c gCd;
  protected LinearLayout gCe;
  protected LinearLayout gCf;
  protected LinearLayout gCg;
  protected MMFormInputView gCh;
  protected MMFormVerifyCodeInputView gCi;
  private Button gCj;
  protected String gCk;
  protected boolean gCl;
  protected boolean gCm;
  private int gCn;
  private int gCo;
  private boolean gCp;
  private String gCq;
  protected int[] gCr;
  private int gCs;
  private String gCt;
  private int gCu;
  private SecurityImage gue;
  protected int gwX;
  protected String gzO;

  public LoginHistoryUI()
  {
    AppMethodBeat.i(124940);
    this.ehJ = null;
    this.gue = null;
    this.gBT = new f();
    this.cOG = "";
    this.gCk = "";
    this.gCl = false;
    this.gCp = false;
    this.gCr = new int[5];
    this.gAY = new LoginHistoryUI.1(this);
    this.gCu = 0;
    AppMethodBeat.o(124940);
  }

  private static Bitmap D(Bitmap paramBitmap)
  {
    AppMethodBeat.i(124947);
    paramBitmap = Bitmap.createBitmap(paramBitmap, 5, 5, paramBitmap.getWidth() - 10, paramBitmap.getHeight() - 10, null, false);
    AppMethodBeat.o(124947);
    return paramBitmap;
  }

  public static void R(Context paramContext, String paramString)
  {
    AppMethodBeat.i(124959);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    com.tencent.mm.bp.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(124959);
  }

  private void b(q paramq)
  {
    AppMethodBeat.i(124957);
    ab.i("MicroMsg.LoginHistoryUI", "checktask LoginHistoryUI startLauncher 0x%x, stack: %s", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
    localIntent.addFlags(67108864);
    if (paramq != null)
    {
      localIntent.putExtra("kstyle_show_bind_mobile_afterauth", paramq.ajr());
      localIntent.putExtra("kstyle_bind_recommend_show", paramq.aju());
      localIntent.putExtra("kstyle_bind_wording", paramq.ajs());
    }
    startActivity(localIntent);
    finish();
    AppMethodBeat.o(124957);
  }

  private void goBack()
  {
    AppMethodBeat.i(124945);
    Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
    localIntent.addFlags(67108864);
    if (bo.isNullOrNil(this.gBX))
      localIntent.putExtra("can_finish", true);
    startActivity(localIntent);
    finish();
    b.hM(this);
    AppMethodBeat.o(124945);
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(124958);
    if (paramInt1 == 4);
    boolean bool;
    switch (paramInt2)
    {
    default:
      if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
      {
        if (this.gue != null)
          this.gue.dismiss();
        AppMethodBeat.o(124958);
        bool = true;
      }
      break;
    case -3:
    case -1:
    case -9:
    case -72:
    case -75:
    case -32:
    case -33:
    case -311:
    case -310:
    case -6:
    case -100:
    case -205:
    case -140:
    }
    while (true)
    {
      return bool;
      if (this.gCu <= 0)
      {
        com.tencent.mm.ui.base.h.g(this, 2131299241, 2131301017);
        this.gCu += 1;
      }
      while (true)
      {
        AppMethodBeat.o(124958);
        bool = true;
        break;
        com.tencent.mm.ui.base.h.d(this, getString(2131299242), getString(2131301017), getString(2131299243), getString(2131296868), new LoginHistoryUI.11(this), new LoginHistoryUI.12(this));
      }
      if (com.tencent.mm.kernel.g.Rg().acS() == 5)
      {
        com.tencent.mm.ui.base.h.g(this, 2131301656, 2131301655);
        AppMethodBeat.o(124958);
        bool = true;
      }
      else
      {
        com.tencent.mm.ui.base.h.g(this, 2131301016, 2131301017);
        AppMethodBeat.o(124958);
        bool = true;
        continue;
        com.tencent.mm.ui.base.h.g(this, 2131302315, 2131297061);
        AppMethodBeat.o(124958);
        bool = true;
        continue;
        z.cu(this);
        AppMethodBeat.o(124958);
        bool = true;
        continue;
        com.tencent.mm.ui.base.h.a(this, getString(2131297585), "", new LoginHistoryUI.13(this));
        AppMethodBeat.o(124958);
        bool = true;
        continue;
        com.tencent.mm.ui.base.h.a(this, 2131297583, 2131297589, new LoginHistoryUI.14(this));
        AppMethodBeat.o(124958);
        bool = true;
        continue;
        com.tencent.mm.kernel.g.Rg().a(701, this);
        com.tencent.mm.kernel.g.Rg().a(252, this);
        if (this.gue == null)
          this.gue = SecurityImage.a.a(this, this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui, new LoginHistoryUI.15(this, paramInt1), null, new LoginHistoryUI.16(this), this.gBT);
        while (true)
        {
          AppMethodBeat.o(124958);
          bool = true;
          break;
          ab.d("MicroMsg.LoginHistoryUI", "imgSid:" + this.gBT.guh + " img len" + this.gBT.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
          this.gue.b(this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui);
        }
        com.tencent.mm.kernel.a.hold();
        com.tencent.mm.kernel.g.RN();
        if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
        for (paramString = com.tencent.mm.bz.a.an(this, 2131301294); ; paramString = com.tencent.mm.kernel.a.QH())
        {
          com.tencent.mm.ui.base.h.a(this, paramString, getString(2131297061), new LoginHistoryUI.17(this), new LoginHistoryUI.18(this));
          AppMethodBeat.o(124958);
          bool = true;
          break;
          com.tencent.mm.kernel.g.RN();
        }
        ab.i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bo.anv(this.gzO), this.gBW });
        f.a(this.gBT);
        paramString = new Intent();
        paramString.putExtra("auth_ticket", this.gzO);
        paramString.putExtra("binded_mobile", this.gBV);
        paramString.putExtra("close_safe_device_style", this.gBW);
        paramString.putExtra("from_source", 2);
        com.tencent.mm.plugin.account.a.a.gkE.g(this, paramString);
        AppMethodBeat.o(124958);
        bool = true;
        continue;
        if (!bo.isNullOrNil(this.cOG))
          z.o(this, paramString, this.cOG);
        AppMethodBeat.o(124958);
        bool = true;
        continue;
        paramString = new ag(paramInt1, paramInt2, paramString);
        bool = this.gCd.a(this, paramString);
        AppMethodBeat.o(124958);
      }
    }
  }

  private void wt(String paramString)
  {
    AppMethodBeat.i(124955);
    this.gCk = paramString;
    aqU();
    AppMethodBeat.o(124955);
  }

  protected void aqU()
  {
    AppMethodBeat.i(124952);
    this.gBT.account = this.gCb.trim();
    AppMethodBeat.o(124952);
  }

  protected final void aqV()
  {
    AppMethodBeat.i(124950);
    com.tencent.mm.kernel.g.Rg().a(701, this);
    com.tencent.mm.kernel.g.Rg().a(252, this);
    AppMethodBeat.o(124950);
  }

  protected final void aqW()
  {
    AppMethodBeat.i(124951);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    AppMethodBeat.o(124951);
  }

  public final void aqX()
  {
    AppMethodBeat.i(124953);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
      AppMethodBeat.o(124953);
    while (true)
    {
      return;
      Object localObject = getCurrentFocus();
      if (localObject == null)
      {
        AppMethodBeat.o(124953);
      }
      else
      {
        localObject = ((View)localObject).getWindowToken();
        if (localObject == null)
        {
          AppMethodBeat.o(124953);
        }
        else
        {
          localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
          AppMethodBeat.o(124953);
        }
      }
    }
  }

  public boolean aqY()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130969950;
  }

  public final void initView()
  {
    AppMethodBeat.i(124948);
    this.gCe = ((LinearLayout)findViewById(2131825302));
    this.gCg = ((LinearLayout)findViewById(2131825307));
    this.gCf = ((LinearLayout)findViewById(2131825311));
    this.gCh = ((MMFormInputView)findViewById(2131825300));
    this.gCi = ((MMFormVerifyCodeInputView)findViewById(2131825301));
    this.gBX = getIntent().getStringExtra("switch_login_wx_id");
    if (!bo.isNullOrNil(this.gBX))
    {
      this.gCb = bx.fnB.getString(this.gBX, "login_user_name");
      this.gCc = bx.fnB.getString(this.gBX, "last_avatar_path");
      this.gCo = bo.ank(bx.fnB.getString(this.gBX, "last_bind_info"));
      if ((this.gCo & 0x1) != 0)
        this.gBU = bx.fnB.getString(this.gBX, "last_login_bind_qq");
      if ((this.gCo & 0x4) != 0)
        this.gBV = bx.fnB.getString(this.gBX, "last_login_bind_mobile");
      this.gCn = bo.ank(bx.fnB.getString(this.gBX, "last_login_use_voice"));
      setBackBtn(new LoginHistoryUI.26(this), 2131230735);
    }
    while (true)
    {
      Object localObject = getIntent().getStringExtra("email_address");
      if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equalsIgnoreCase(this.gCb)))
        this.gCb = ((String)localObject);
      this.gBY = ((ImageView)findViewById(2131825299));
      if (!bo.isNullOrNil(this.gCc));
      try
      {
        localObject = com.tencent.mm.ah.d.qi(this.gCc);
        if ((localObject != null) && (((Bitmap)localObject).getWidth() > 10))
          this.gBY.setImageBitmap(D((Bitmap)localObject));
        com.tencent.mm.kernel.g.RN();
        if ((com.tencent.mm.kernel.a.QX()) && (!this.gCb.equals("")))
        {
          this.gCl = true;
          b(null);
          AppMethodBeat.o(124948);
          return;
          this.gCb = com.tencent.mm.model.av.fly.T("login_user_name", "");
          this.gCc = com.tencent.mm.model.av.fly.ZC();
          this.gCo = bo.ank(com.tencent.mm.model.av.fly.T("last_bind_info", ""));
          if ((this.gCo & 0x1) != 0)
            this.gBU = com.tencent.mm.model.av.fly.T("last_login_bind_qq", "");
          if ((this.gCo & 0x4) != 0)
            this.gBV = com.tencent.mm.model.av.fly.T("last_login_bind_mobile", "");
          this.gCn = bo.ank(com.tencent.mm.model.av.fly.T("last_login_use_voice", ""));
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.LoginHistoryUI", localException, "get avatar error", new Object[0]);
        this.gBZ = ((MMKeyboardUperView)findViewById(2131820921));
        this.gBI = ((TextView)findViewById(2131825289));
        this.gBJ = this.gCh.getContentEditText();
        this.gBK = ((Button)findViewById(2131825292));
        this.gBM = findViewById(2131825303);
        this.gBN = findViewById(2131825308);
        this.gBO = ((Button)findViewById(2131825313));
        this.gBL = ((Button)findViewById(2131825306));
        this.gCj = ((Button)findViewById(2131825293));
        this.gBP = ((Button)findViewById(2131825295));
        this.gBQ = ((Button)findViewById(2131825297));
        this.gBR = findViewById(2131825296);
        this.gBS = ((Button)findViewById(2131825298));
        this.gBP.setOnClickListener(new LoginHistoryUI.27(this));
        this.gBQ.setOnClickListener(new LoginHistoryUI.28(this));
        if (!aa.doo())
          this.gBR.setVisibility(8);
        this.gCh.setVisibility(8);
        this.gCe.setVisibility(8);
        this.gCg.setVisibility(8);
        this.gCf.setVisibility(8);
        this.gBK.setVisibility(8);
        this.gBM.setVisibility(8);
        this.gBN.setVisibility(8);
        this.gBO.setVisibility(8);
        this.gBL.setVisibility(8);
        com.tencent.mm.ui.tools.b.c.d(this.gBJ).hz(4, 16).a(null);
        this.gCa = ((ResizeLayout)findViewById(2131825288));
        if (!bo.ant(this.gCb).booleanValue())
          break label1061;
      }
    }
    if (!this.gCb.equals(this.gBU))
    {
      this.gCr[2] = 1;
      this.gBI.setText(ws(this.gCb));
      label876: this.gCa.setOnSizeChanged(new LoginHistoryUI.29(this));
      this.gBZ.setOnTouchListener(new LoginHistoryUI.30(this));
      com.tencent.mm.ui.widget.a.d locald = new com.tencent.mm.ui.widget.a.d(this, 1, false);
      locald.rBl = new LoginHistoryUI.31(this);
      locald.rBm = new LoginHistoryUI.2(this);
      locald.zQf = new LoginHistoryUI.3(this);
      if (!bo.isNullOrNil(this.gBX))
        break label1082;
      this.gBS.setOnClickListener(new LoginHistoryUI.4(this, locald));
    }
    while (true)
    {
      setMMTitle("");
      xE(getResources().getColor(2131690310));
      dyb();
      pP(false);
      if (com.tencent.mm.sdk.platformtools.g.xyf)
        com.tencent.mm.plugin.account.a.a.gkF.p(this);
      if (com.tencent.mm.sdk.platformtools.f.EX_DEVICE_LOGIN)
      {
        this.gCj.setVisibility(0);
        this.gCj.setOnClickListener(new LoginHistoryUI.7(this));
      }
      AppMethodBeat.o(124948);
      break;
      label1061: this.gCr[2] = 2;
      this.gBI.setText(this.gCb);
      break label876;
      label1082: if (!aa.doo())
      {
        this.gBS.setText(2131305631);
        this.gBS.setOnClickListener(new LoginHistoryUI.5(this));
      }
      else
      {
        this.gBS.setText(2131305633);
        this.gBS.setOnClickListener(new LoginHistoryUI.6(this));
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(124954);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      ab.d("MicroMsg.LoginHistoryUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt1 != 1024) || (paramIntent == null))
        break label176;
      if (paramInt2 != -1)
        break label316;
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bo.isNullOrNil(str);
      if (!bo.isNullOrNil(str))
        break label167;
      paramInt1 = j;
      label113: ab.d("MicroMsg.LoginHistoryUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      wt(str);
      AppMethodBeat.o(124954);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label167: paramInt1 = str.length();
      break label113;
      label176: if ((paramInt1 == 1025) && (paramIntent != null))
      {
        if (paramInt2 == 2)
        {
          paramIntent = paramIntent.getStringExtra("KFaceLoginAuthPwd");
          bool = bo.isNullOrNil(paramIntent);
          if (bo.isNullOrNil(paramIntent));
          for (paramInt1 = i; ; paramInt1 = paramIntent.length())
          {
            ab.i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
            wt(paramIntent);
            AppMethodBeat.o(124954);
            break;
          }
        }
      }
      else if ((paramInt1 == 31685) && (paramIntent != null) && (paramInt2 == -1))
      {
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("auth_again")))
          aqU();
      }
      label316: AppMethodBeat.o(124954);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124941);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", new Object[] { com.tencent.mm.plugin.account.a.a.gkF });
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.ehZ = ah.getContext().getSharedPreferences(ah.doA(), 0);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.gCp = paramBundle.getBooleanExtra("login_success_need_bind_fingerprint", false);
      this.gCp = this.gCp;
      if (this.gCp)
        this.gCq = paramBundle.getStringExtra("bind_login_fingerprint_info");
    }
    initView();
    this.gCd = new com.tencent.mm.platformtools.c();
    AppMethodBeat.o(124941);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(124942);
    ab.i("MicroMsg.LoginHistoryUI", "onDestroy");
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    if (this.gCd != null)
      this.gCd.close();
    com.tencent.mm.plugin.report.service.h.pYm.e(14262, new Object[] { Integer.valueOf(this.gCr[0]), Integer.valueOf(this.gCr[1]), Integer.valueOf(this.gCr[2]), Integer.valueOf(this.gCr[3]), Integer.valueOf(this.gCr[4]) });
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    super.onDestroy();
    AppMethodBeat.o(124942);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(124946);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
      goBack();
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(124946);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(124944);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    AppMethodBeat.o(124944);
  }

  public void onResume()
  {
    AppMethodBeat.i(124943);
    super.onResume();
    Object localObject1 = new ArrayList();
    Object localObject2;
    if ((aqY()) && (this.gwX != 1) && ((this.gCn & 0x20000) != 0))
    {
      localObject2 = new com.tencent.mm.ui.base.m(this, 7001, 0);
      ((com.tencent.mm.ui.base.m)localObject2).setTitle(2131301029);
      ((List)localObject1).add(localObject2);
    }
    if ((this.gwX != 5) && ((this.gCn & 0x40000) != 0))
    {
      localObject2 = new com.tencent.mm.ui.base.m(this, 7005, 0);
      ((com.tencent.mm.ui.base.m)localObject2).setTitle(2131301026);
      ((List)localObject1).add(localObject2);
    }
    if (!bo.isNullOrNil(this.gCb))
    {
      if (this.gwX != 2)
      {
        localObject2 = new com.tencent.mm.ui.base.m(this, 7007, 0);
        ((com.tencent.mm.ui.base.m)localObject2).setTitle(getString(2131301027));
        ((List)localObject1).add(localObject2);
      }
      if ((!bo.isNullOrNil(this.gBV)) && (this.gwX != 3))
      {
        localObject2 = new com.tencent.mm.ui.base.m(this, 7008, 0);
        ((com.tencent.mm.ui.base.m)localObject2).setTitle(getString(2131301028));
        ((List)localObject1).add(localObject2);
      }
      if (this.gCb.equalsIgnoreCase(this.gBU))
        this.gBJ.setHint(getString(2131302321));
    }
    if (((List)localObject1).size() > 1)
    {
      localObject2 = new com.tencent.mm.ui.widget.a.d(this, 1, false);
      ((com.tencent.mm.ui.widget.a.d)localObject2).rBl = new LoginHistoryUI.19(this, (List)localObject1);
      ((com.tencent.mm.ui.widget.a.d)localObject2).rBm = new LoginHistoryUI.20(this);
      ((com.tencent.mm.ui.widget.a.d)localObject2).zQf = new LoginHistoryUI.21(this);
      this.gBL.setVisibility(0);
      this.gBL.setText(2131301010);
      this.gBL.setOnClickListener(new LoginHistoryUI.23(this, (com.tencent.mm.ui.widget.a.d)localObject2));
      com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
      com.tencent.mm.kernel.g.RN();
      com.tencent.mm.kernel.a.Rc();
      if ((!com.tencent.mm.kernel.g.RK()) || (!com.tencent.mm.kernel.g.RN().eJb) || (this.gCb.equals("")))
        break label494;
      if ((this.ehJ == null) || (!this.ehJ.isShowing()))
        break label480;
      AppMethodBeat.o(124943);
    }
    while (true)
    {
      return;
      if (((List)localObject1).size() > 0)
      {
        this.gBL.setVisibility(0);
        this.gBL.setText(((com.tencent.mm.ui.base.m)((List)localObject1).get(0)).getTitle());
        this.gBL.setOnClickListener(new LoginHistoryUI.24(this, (List)localObject1));
        break;
      }
      this.gBL.setVisibility(8);
      break;
      label480: b(null);
      AppMethodBeat.o(124943);
      continue;
      label494: if (com.tencent.mm.q.a.On() == 2)
      {
        localObject1 = new c.a(this);
        ((c.a)localObject1).PV(2131298270);
        ((c.a)localObject1).asE(getString(2131298269));
        ((c.a)localObject1).rc(false);
        ((c.a)localObject1).Qc(2131298267).a(new LoginHistoryUI.22(this));
        ((c.a)localObject1).aMb().show();
        com.tencent.mm.q.a.b(this, System.currentTimeMillis());
      }
      AppMethodBeat.o(124943);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(124956);
    ab.i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    ab.d("MicroMsg.LoginHistoryUI", "Scene Type " + paramm.getType());
    if (paramm.getType() == 145)
    {
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      i = ((com.tencent.mm.modelfriend.a)paramm).Ah();
      if (i == 16)
        if (paramInt2 == -41)
        {
          com.tencent.mm.ui.base.h.g(this, 2131302269, 2131302270);
          this.gCi.reset();
          AppMethodBeat.o(124956);
        }
      while (true)
      {
        return;
        if (paramInt2 == -75)
        {
          com.tencent.mm.ui.base.h.b(this, getString(2131296515), "", true);
          this.gCi.reset();
          AppMethodBeat.o(124956);
        }
        else if (paramInt2 == -106)
        {
          z.f(this, paramString, 32045);
          this.gCi.reset();
          AppMethodBeat.o(124956);
          continue;
          if (i == 17)
          {
            this.gCs = paramInt2;
            this.gCt = paramString;
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              new g(new LoginHistoryUI.8(this), ((com.tencent.mm.modelfriend.a)paramm).getUsername(), ((com.tencent.mm.modelfriend.a)paramm).agf(), this.gBV).a(this);
              AppMethodBeat.o(124956);
              continue;
            }
            if (j(paramInt1, paramInt2, paramString))
            {
              AppMethodBeat.o(124956);
              continue;
            }
            paramm = com.tencent.mm.h.a.jY(paramString);
            if (paramm != null)
              paramm.a(this, null, null);
          }
        }
        else
        {
          label343: if (!j(paramInt1, paramInt2, paramString))
            break;
          AppMethodBeat.o(124956);
        }
      }
    }
    if ((paramm.getType() == 252) || (paramm.getType() == 701))
    {
      this.cOG = ((q)paramm).ajm();
      ab.e("MicroMsg.LoginHistoryUI", "url " + this.cOG);
      com.tencent.mm.kernel.g.Rg().b(701, this);
      com.tencent.mm.kernel.g.Rg().b(252, this);
      this.gBT.gCL = ((q)paramm).getSecCodeType();
      this.gBT.guh = ((q)paramm).ajn();
      this.gBT.gug = ((q)paramm).ajo();
      this.gBT.gui = ((q)paramm).ajp();
      if (paramInt2 == -205)
      {
        this.gzO = ((q)paramm).agh();
        this.gBV = ((q)paramm).ajq();
        this.gBW = ((q)paramm).ajt();
      }
      if ((paramInt1 != 4) || ((paramInt2 != -16) && (paramInt2 != -17)))
        break label1045;
      com.tencent.mm.kernel.g.Rg().a(new bk(new LoginHistoryUI.9(this)), 0);
    }
    label1045: for (int i = 1; ; i = 0)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        l.apX();
        w.cm(this);
        z.vx(this.gBT.account);
        if ((this.ehJ != null) && (this.ehJ.isShowing()))
          this.ehJ.setMessage(getString(2131296965));
        b((q)paramm);
        if (this.gwX == 3)
        {
          this.gCm = ((q)paramm).ajv();
          com.tencent.mm.kernel.g.Rg().a(255, this);
          paramString = new r(1);
          com.tencent.mm.kernel.g.Rg().a(paramString, 0);
          getString(2131297061);
          this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131296965), true, new LoginHistoryUI.10(this, paramString));
        }
        AppMethodBeat.o(124956);
        break;
      }
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if (paramInt2 == -106)
      {
        z.f(this, paramString, 31685);
        AppMethodBeat.o(124956);
        break;
      }
      if (paramInt2 == -217)
      {
        z.a(this, e.a((q)paramm), paramInt2);
        AppMethodBeat.o(124956);
        break;
      }
      if (j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(124956);
        break;
      }
      paramm = com.tencent.mm.h.a.jY(paramString);
      if ((paramm != null) && (paramm.a(this, null, null)))
      {
        AppMethodBeat.o(124956);
        break;
      }
      Toast.makeText(this, getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      break label343;
      if (paramm.getType() != 255)
        break label343;
      if ((this.ehJ != null) && (this.ehJ.isShowing()))
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      com.tencent.mm.kernel.g.Rg().b(255, this);
      if ((paramInt2 == -3) && (paramInt1 == 4))
      {
        boolean bool = this.gCm;
        paramString = new Intent(this, RegByMobileSetPwdUI.class);
        paramString.putExtra("kintent_hint", getString(2131303155));
        paramString.putExtra("kintent_cancelable", bool);
        startActivity(paramString);
      }
      AppMethodBeat.o(124956);
      break;
      AppMethodBeat.o(124956);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void setRequestedOrientation(int paramInt)
  {
  }

  protected final String ws(String paramString)
  {
    AppMethodBeat.i(124949);
    new com.tencent.mm.sdk.platformtools.av();
    String str1 = "86";
    Object localObject = paramString;
    if (this.gCb.startsWith("+"))
    {
      String str2 = paramString.replace("+", "");
      paramString = com.tencent.mm.sdk.platformtools.av.Ps(str2);
      str1 = paramString;
      localObject = str2;
      if (paramString != null)
      {
        localObject = str2.substring(paramString.length());
        str1 = paramString;
      }
    }
    paramString = com.tencent.mm.sdk.platformtools.av.formatNumber(str1, (String)localObject);
    AppMethodBeat.o(124949);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI
 * JD-Core Version:    0.6.2
 */