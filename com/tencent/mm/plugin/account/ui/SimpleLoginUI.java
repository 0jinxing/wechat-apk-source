package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.bk;
import com.tencent.mm.platformtools.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.plugin.account.model.c.1;
import com.tencent.mm.plugin.account.model.c.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.xlog.app.XLogSetup;

public class SimpleLoginUI extends MMWizardActivity
  implements com.tencent.mm.ai.f
{
  private TextWatcher arx;
  private String cOG;
  private ProgressDialog ehJ;
  private com.tencent.mm.sdk.b.c gAY;
  private f gBT;
  private String gBV;
  private String gBW;
  private MMClearEditText gCS;
  private MMClearEditText gCT;
  private MMFormInputView gCU;
  private MMFormInputView gCV;
  private Button gCW;
  private ResizeLayout gCa;
  private MMKeyboardUperView gDb;
  private SecurityImage gue;
  private String gzO;

  public SimpleLoginUI()
  {
    AppMethodBeat.i(125617);
    this.ehJ = null;
    this.gue = null;
    this.gBT = new f();
    this.cOG = "";
    this.arx = new SimpleLoginUI.1(this);
    this.gAY = new SimpleLoginUI.12(this);
    AppMethodBeat.o(125617);
  }

  private void aoZ()
  {
    AppMethodBeat.i(125623);
    boolean bool = getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
    if (!bool)
      cancel();
    Ni(1);
    if (bool)
      exit(1);
    AppMethodBeat.o(125623);
  }

  private void aqU()
  {
    AppMethodBeat.i(125624);
    this.gBT.account = this.gCS.getText().toString().trim();
    this.gBT.guf = this.gCT.getText().toString();
    if (this.gBT.account.equals(""))
    {
      com.tencent.mm.ui.base.h.g(this, 2131304239, 2131301017);
      AppMethodBeat.o(125624);
    }
    while (true)
    {
      return;
      if (this.gBT.guf.equals(""))
      {
        com.tencent.mm.ui.base.h.g(this, 2131304235, 2131301017);
        AppMethodBeat.o(125624);
      }
      else
      {
        aqX();
        com.tencent.mm.modelsimple.q localq = new com.tencent.mm.modelsimple.q(this.gBT.account, this.gBT.guf, this.gzO, 0);
        com.tencent.mm.kernel.g.Rg().a(localq, 0);
        getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131301031), true, new SimpleLoginUI.5(this, localq));
        AppMethodBeat.o(125624);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969949;
  }

  public final void initView()
  {
    AppMethodBeat.i(125622);
    this.gCU = ((MMFormInputView)findViewById(2131825289));
    this.gCV = ((MMFormInputView)findViewById(2131825290));
    this.gCS = ((MMClearEditText)this.gCU.getContentEditText());
    this.gCS.setFocusableInTouchMode(false);
    this.gCS.setOnTouchListener(new SimpleLoginUI.14(this));
    this.gCT = ((MMClearEditText)this.gCV.getContentEditText());
    this.gCT.setFocusableInTouchMode(false);
    this.gCT.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(125611);
        SimpleLoginUI.d(SimpleLoginUI.this).setFocusableInTouchMode(true);
        SimpleLoginUI.c(SimpleLoginUI.this).setFocusableInTouchMode(false);
        boolean bool = SimpleLoginUI.d(SimpleLoginUI.this).getDefaultOnTouchListener().onTouch(paramAnonymousView, paramAnonymousMotionEvent);
        AppMethodBeat.o(125611);
        return bool;
      }
    });
    com.tencent.mm.ui.tools.b.c.d(this.gCT).PM(16).a(null);
    this.gCW = ((Button)findViewById(2131825292));
    this.gCW.setEnabled(false);
    this.gCS.addTextChangedListener(this.arx);
    this.gCT.addTextChangedListener(this.arx);
    this.gCT.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        AppMethodBeat.i(125612);
        boolean bool;
        if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
        {
          SimpleLoginUI.b(SimpleLoginUI.this);
          bool = true;
          AppMethodBeat.o(125612);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(125612);
        }
      }
    });
    this.gCT.setOnKeyListener(new SimpleLoginUI.17(this));
    this.gCa = ((ResizeLayout)findViewById(2131825288));
    this.gDb = ((MMKeyboardUperView)findViewById(2131820921));
    this.gCa.setOnSizeChanged(new SimpleLoginUI.18(this));
    this.gDb.setOnTouchListener(new SimpleLoginUI.19(this));
    findViewById(2131825291).setVisibility(8);
    setMMTitle(2131301037);
    setBackBtn(new SimpleLoginUI.2(this));
    this.gzO = getIntent().getStringExtra("auth_ticket");
    if (!bo.isNullOrNil(this.gzO))
    {
      this.gCS.setText(bo.nullAsNil(f.ara()));
      this.gCT.setText(bo.nullAsNil(f.arb()));
      new ak().postDelayed(new SimpleLoginUI.3(this), 500L);
    }
    if (com.tencent.mm.sdk.platformtools.g.xyf)
      com.tencent.mm.plugin.account.a.a.gkF.p(this);
    this.gCW.setOnClickListener(new SimpleLoginUI.4(this));
    AppMethodBeat.o(125622);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(125628);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      ab.d("MicroMsg.SimpleLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 != -1) || (paramInt1 != 1024) || (paramIntent == null))
        break label178;
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bo.isNullOrNil(str);
      if (!bo.isNullOrNil(str))
        break label169;
      paramInt1 = i;
      label110: ab.d("MicroMsg.SimpleLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != -217)
        break label178;
      aqU();
      AppMethodBeat.o(125628);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label169: paramInt1 = str.length();
      break label110;
      label178: AppMethodBeat.o(125628);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125618);
    super.onCreate(paramBundle);
    paramBundle = getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu());
    if (paramBundle.getBoolean("first_launch_weixin", true))
    {
      paramBundle.edit().putBoolean("first_launch_weixin", false).commit();
      XLogSetup.realSetupXlog();
    }
    setMMTitle(2131296982);
    if (com.tencent.mm.plugin.account.a.a.gkF != null)
      com.tencent.mm.plugin.account.a.a.gkF.BV();
    initView();
    com.tencent.mm.kernel.g.Rg().a(701, this);
    com.tencent.mm.kernel.g.Rg().a(252, this);
    if (!b.ai(this))
    {
      new Intent().addFlags(67108864);
      com.tencent.mm.plugin.account.a.a.gkE.p(new Intent(), this);
    }
    AppMethodBeat.o(125618);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125620);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    super.onDestroy();
    AppMethodBeat.o(125620);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125625);
    boolean bool;
    if (paramInt == 4)
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(125625);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125625);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(125621);
    super.onNewIntent(paramIntent);
    this.gzO = paramIntent.getStringExtra("auth_ticket");
    paramIntent = getIntent().getExtras();
    if (paramIntent != null)
      this.gzO = paramIntent.getString("auth_ticket");
    if (!bo.isNullOrNil(this.gzO))
    {
      this.gCS.setText(bo.nullAsNil(f.ara()));
      this.gCT.setText(bo.nullAsNil(f.arb()));
      new ak().postDelayed(new SimpleLoginUI.13(this), 500L);
    }
    AppMethodBeat.o(125621);
  }

  public void onPause()
  {
    AppMethodBeat.i(125626);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    AppMethodBeat.o(125626);
  }

  public void onResume()
  {
    AppMethodBeat.i(125619);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    AppMethodBeat.o(125619);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125627);
    ab.i("MicroMsg.SimpleLoginUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    ab.d("MicroMsg.SimpleLoginUI", "Scene Type " + paramm.getType());
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    this.cOG = ((com.tencent.mm.modelsimple.q)paramm).ajm();
    int i;
    if ((paramm.getType() == 252) || (paramm.getType() == 701))
    {
      this.gBT.gCL = ((com.tencent.mm.modelsimple.q)paramm).getSecCodeType();
      this.gBT.guh = ((com.tencent.mm.modelsimple.q)paramm).ajn();
      this.gBT.gug = ((com.tencent.mm.modelsimple.q)paramm).ajo();
      this.gBT.gui = ((com.tencent.mm.modelsimple.q)paramm).ajp();
      if (paramInt2 == -205)
      {
        this.gzO = ((com.tencent.mm.modelsimple.q)paramm).agh();
        this.gBV = ((com.tencent.mm.modelsimple.q)paramm).ajq();
        this.gBW = ((com.tencent.mm.modelsimple.q)paramm).ajt();
      }
      if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      {
        i = 1;
        com.tencent.mm.kernel.g.Rg().a(new bk(new SimpleLoginUI.10(this)), 0);
      }
    }
    while (true)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        w.cm(this);
        z.vx(this.gBT.account);
        paramString = new com.tencent.mm.plugin.account.model.c(this.mController.ylL, new SimpleLoginUI.11(this));
        paramString.cwn = com.tencent.mm.plugin.account.a.a.gkF.a(paramString);
        if (paramString.cwn == null)
        {
          if (paramString.gyH != null)
            paramString.gyH.aqC();
          AppMethodBeat.o(125627);
        }
      }
      while (true)
      {
        return;
        if (paramString.cwn.getType() == 139)
          com.tencent.mm.kernel.g.Rg().a(139, paramString);
        while (true)
        {
          com.tencent.mm.kernel.g.Rg().a(paramString.cwn, 0);
          paramm = paramString.context;
          paramString.context.getString(2131297061);
          paramString.tipDialog = com.tencent.mm.ui.base.h.b(paramm, paramString.context.getString(2131296966), true, new c.1(paramString));
          AppMethodBeat.o(125627);
          break;
          if (paramString.cwn.getType() == 138)
            com.tencent.mm.kernel.g.Rg().a(138, paramString);
        }
        if (paramInt2 == -217)
        {
          z.a(this, e.a((com.tencent.mm.modelsimple.q)paramm), paramInt2);
          AppMethodBeat.o(125627);
        }
        else
        {
          if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
            i = 1;
          while (true)
          {
            if (i == 0)
              break label1147;
            AppMethodBeat.o(125627);
            break;
            if (paramInt1 == 4);
            switch (paramInt2)
            {
            default:
              i = 0;
              break;
            case -1:
              if (com.tencent.mm.kernel.g.Rg().acS() == 5)
              {
                com.tencent.mm.ui.base.h.g(this, 2131301656, 2131301655);
                i = 1;
              }
              break;
            case -30:
            case -4:
            case -3:
              com.tencent.mm.ui.base.h.g(this, 2131299241, 2131301017);
              i = 1;
              break;
            case -9:
              com.tencent.mm.ui.base.h.g(this, 2131301016, 2131301017);
              i = 1;
              break;
            case -72:
              com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131302315, 2131297061);
              i = 1;
              break;
            case -75:
              z.cu(this.mController.ylL);
              i = 1;
              break;
            case -311:
            case -310:
            case -6:
              if (this.gue == null)
                this.gue = SecurityImage.a.a(this.mController.ylL, this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui, new SimpleLoginUI.6(this), null, new SimpleLoginUI.7(this), this.gBT);
              while (true)
              {
                i = 1;
                break;
                ab.d("MicroMsg.SimpleLoginUI", "imgSid:" + this.gBT.guh + " img len" + this.gBT.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
                this.gue.b(this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui);
              }
            case -100:
              com.tencent.mm.kernel.a.hold();
              com.tencent.mm.kernel.g.RN();
              com.tencent.mm.ui.base.h.a(this, com.tencent.mm.kernel.a.QH(), getString(2131297061), new SimpleLoginUI.8(this), new SimpleLoginUI.9(this));
              i = 1;
              break;
            case -205:
              ab.i("MicroMsg.SimpleLoginUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bo.anv(this.gzO), this.gBW });
              f.a(this.gBT);
              paramm = new Intent();
              paramm.putExtra("auth_ticket", this.gzO);
              paramm.putExtra("binded_mobile", this.gBV);
              paramm.putExtra("close_safe_device_style", this.gBW);
              paramm.putExtra("from_source", 3);
              com.tencent.mm.plugin.account.a.a.gkE.g(this, paramm);
              i = 1;
              break;
            case -140:
              if (!bo.isNullOrNil(this.cOG))
                z.o(this, paramString, this.cOG);
              i = 1;
              break;
            case -106:
              z.f(this, paramString, 0);
              i = 1;
            }
          }
          label1147: paramString = com.tencent.mm.h.a.jY(paramString);
          if ((paramString != null) && (paramString.a(this, null, null)))
          {
            AppMethodBeat.o(125627);
          }
          else
          {
            Toast.makeText(this, getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
            AppMethodBeat.o(125627);
          }
        }
      }
      i = 0;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI
 * JD-Core Version:    0.6.2
 */