package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jk;
import com.tencent.mm.model.bk;
import com.tencent.mm.platformtools.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;

public class LoginIndepPass extends MMActivity
  implements com.tencent.mm.ai.f
{
  private String account;
  private String cOG;
  private ProgressDialog ehJ;
  private c gAY;
  private f gBT;
  private String gBV;
  private String gBW;
  private EditText gCB;
  private String gCC;
  private Button gCD;
  private String gsF;
  private com.tencent.mm.ui.base.p guc;
  private SecurityImage gue;
  private String gzO;

  public LoginIndepPass()
  {
    AppMethodBeat.i(124985);
    this.ehJ = null;
    this.gue = null;
    this.gBT = new f();
    this.gAY = new c()
    {
    };
    AppMethodBeat.o(124985);
  }

  private void aqU()
  {
    AppMethodBeat.i(124991);
    Object localObject = this.gCB.getText().toString();
    if (bo.isNullOrNil(this.account))
    {
      h.g(this, 2131304239, 2131301017);
      AppMethodBeat.o(124991);
    }
    while (true)
    {
      return;
      if (((String)localObject).equals(""))
      {
        h.g(this, 2131304235, 2131301017);
        AppMethodBeat.o(124991);
      }
      else
      {
        aqX();
        com.tencent.mm.kernel.g.Rg().a(701, this);
        com.tencent.mm.kernel.g.Rg().a(252, this);
        localObject = new com.tencent.mm.modelsimple.q(this.account, (String)localObject, null, 1);
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
        getString(2131297061);
        this.ehJ = h.b(this, getString(2131301031), true, new LoginIndepPass.16(this, (com.tencent.mm.modelsimple.q)localObject));
        AppMethodBeat.o(124991);
      }
    }
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(124993);
    if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
    {
      AppMethodBeat.o(124993);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramInt1 == 4);
      switch (paramInt2)
      {
      default:
        AppMethodBeat.o(124993);
        break;
      case -1:
        if (com.tencent.mm.kernel.g.Rg().acS() == 5)
        {
          h.g(this, 2131301656, 2131301655);
          AppMethodBeat.o(124993);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(124993);
        }
        break;
      case -4:
      case -3:
        h.g(this, 2131299241, 2131301017);
        AppMethodBeat.o(124993);
        bool = true;
        break;
      case -9:
        h.g(this, 2131301016, 2131301017);
        AppMethodBeat.o(124993);
        bool = true;
        break;
      case -100:
        com.tencent.mm.kernel.a.hold();
        AppCompatActivity localAppCompatActivity = this.mController.ylL;
        com.tencent.mm.kernel.g.RN();
        if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
        for (paramString = com.tencent.mm.bz.a.an(this.mController.ylL, 2131301294); ; paramString = com.tencent.mm.kernel.a.QH())
        {
          h.a(localAppCompatActivity, paramString, this.mController.ylL.getString(2131297061), new LoginIndepPass.7(this), new LoginIndepPass.8(this));
          AppMethodBeat.o(124993);
          bool = true;
          break;
          com.tencent.mm.kernel.g.RN();
        }
      case -140:
        if (!bo.isNullOrNil(this.cOG))
          z.o(this.mController.ylL, paramString, this.cOG);
        AppMethodBeat.o(124993);
        bool = true;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969951;
  }

  public final void initView()
  {
    AppMethodBeat.i(124990);
    this.gCB = ((EditText)findViewById(2131825314));
    this.gCD = ((Button)findViewById(2131825315));
    enableOptionMenu(false);
    addTextOptionMenu(0, getString(2131301024), new LoginIndepPass.9(this));
    this.gCB.addTextChangedListener(new LoginIndepPass.10(this));
    this.gCB.setOnEditorActionListener(new LoginIndepPass.11(this));
    this.gCB.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        AppMethodBeat.i(124978);
        boolean bool;
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          LoginIndepPass.a(LoginIndepPass.this);
          bool = true;
          AppMethodBeat.o(124978);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(124978);
        }
      }
    });
    this.gCD.setText(getString(2131301028));
    this.gCD.setOnClickListener(new LoginIndepPass.13(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(124982);
        com.tencent.mm.plugin.b.a.wA("L200_100");
        paramAnonymousMenuItem = new Intent(LoginIndepPass.this, MobileInputUI.class);
        paramAnonymousMenuItem.putExtra("mobile_input_purpose", 1);
        paramAnonymousMenuItem.addFlags(67108864);
        LoginIndepPass.this.startActivity(paramAnonymousMenuItem);
        LoginIndepPass.this.finish();
        AppMethodBeat.o(124982);
        return true;
      }
    });
    this.gzO = getIntent().getStringExtra("auth_ticket");
    if (!bo.isNullOrNil(this.gzO))
      new ak().postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(124983);
          LoginIndepPass.a(LoginIndepPass.this, f.ara(), f.arb());
          AppMethodBeat.o(124983);
        }
      }
      , 500L);
    AppMethodBeat.o(124990);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(124994);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      ab.d("MicroMsg.LoginIndepPass", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 != -1) || (paramInt1 != 1024) || (paramIntent == null))
        break label178;
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bo.isNullOrNil(str);
      if (!bo.isNullOrNil(str))
        break label169;
      paramInt1 = i;
      label110: ab.d("MicroMsg.LoginIndepPass", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != -217)
        break label178;
      aqU();
      AppMethodBeat.o(124994);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label169: paramInt1 = str.length();
      break label110;
      label178: AppMethodBeat.o(124994);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124986);
    super.onCreate(paramBundle);
    paramBundle = getString(2131301022);
    if (d.vxr)
      paramBundle = getString(2131296982) + getString(2131296513);
    setMMTitle(paramBundle);
    this.gCC = getIntent().getStringExtra("bindmcontact_mobile");
    if (this.gCC != null)
      this.account = av.amN(this.gCC);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    AppMethodBeat.o(124986);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(124989);
    com.tencent.mm.kernel.g.Rg().b(701, this);
    com.tencent.mm.kernel.g.Rg().b(252, this);
    super.onDestroy();
    AppMethodBeat.o(124989);
  }

  public void onPause()
  {
    AppMethodBeat.i(124988);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L200_200,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L200_200") + ",2");
    AppMethodBeat.o(124988);
  }

  public void onResume()
  {
    AppMethodBeat.i(124987);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L200_200,");
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L200_200") + ",1");
    com.tencent.mm.plugin.b.a.wz("L200_200");
    AppMethodBeat.o(124987);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(124992);
    ab.i("MicroMsg.LoginIndepPass", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (this.guc != null)
    {
      this.guc.dismiss();
      this.guc = null;
    }
    if ((paramm.getType() == 252) || (paramm.getType() == 701))
    {
      this.cOG = ((com.tencent.mm.modelsimple.q)paramm).ajm();
      com.tencent.mm.kernel.g.Rg().b(701, this);
      com.tencent.mm.kernel.g.Rg().b(252, this);
      this.gBT.guh = ((com.tencent.mm.modelsimple.q)paramm).ajn();
      this.gBT.gug = ((com.tencent.mm.modelsimple.q)paramm).ajo();
      this.gBT.gui = ((com.tencent.mm.modelsimple.q)paramm).ajp();
      this.gBT.gCL = ((com.tencent.mm.modelsimple.q)paramm).getSecCodeType();
      this.gBT.account = this.account;
      this.gBT.guf = this.gCB.getText().toString();
      if (paramInt2 == -75)
      {
        z.cu(this.mController.ylL);
        AppMethodBeat.o(124992);
      }
      while (true)
      {
        return;
        if (paramInt2 == -106)
        {
          z.f(this, paramString, 0);
          AppMethodBeat.o(124992);
        }
        else if (paramInt2 == -217)
        {
          z.a(this, e.a((com.tencent.mm.modelsimple.q)paramm), paramInt2);
          AppMethodBeat.o(124992);
        }
        else if (paramInt2 == -205)
        {
          this.gzO = ((com.tencent.mm.modelsimple.q)paramm).agh();
          this.gBV = ((com.tencent.mm.modelsimple.q)paramm).ajq();
          this.gBW = ((com.tencent.mm.modelsimple.q)paramm).ajt();
          ab.i("MicroMsg.LoginIndepPass", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bo.anv(this.gzO), this.gBW });
          f.a(this.gBT);
          paramString = new Intent();
          paramString.putExtra("auth_ticket", this.gzO);
          paramString.putExtra("binded_mobile", this.gBV);
          paramString.putExtra("close_safe_device_style", this.gBW);
          paramString.putExtra("from_source", 5);
          com.tencent.mm.plugin.account.a.a.gkE.g(this, paramString);
          AppMethodBeat.o(124992);
        }
        else
        {
          if (paramInt2 != -140)
            break;
          if (!bo.isNullOrNil(this.cOG))
            z.o(this, paramString, this.cOG);
          AppMethodBeat.o(124992);
        }
      }
      if ((paramInt1 != 4) || ((paramInt2 != -16) && (paramInt2 != -17)))
        break label1265;
      com.tencent.mm.kernel.g.Rg().a(new bk(new LoginIndepPass.3(this)), 0);
    }
    label1265: for (int i = 1; ; i = 0)
    {
      if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
      {
        com.tencent.mm.kernel.g.Rg().a(701, this);
        com.tencent.mm.kernel.g.Rg().a(252, this);
        if (this.gue == null)
        {
          this.gue = SecurityImage.a.a(this.mController.ylL, this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui, new LoginIndepPass.4(this), null, new LoginIndepPass.5(this), this.gBT);
          AppMethodBeat.o(124992);
          break;
        }
        ab.d("MicroMsg.LoginIndepPass", "imgSid:" + this.gBT.guh + " img len" + this.gBT.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
        this.gue.b(this.gBT.gCL, this.gBT.gug, this.gBT.guh, this.gBT.gui);
        AppMethodBeat.o(124992);
        break;
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        l.apX();
        z.vx(this.gBT.account);
        w.cm(this);
        z.showAddrBookUploadConfirm(this, new LoginIndepPass.6(this), false, 2);
        AppMethodBeat.o(124992);
        break;
      }
      if (j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(124992);
        break;
      }
      if ((paramm.getType() == 252) || (paramm.getType() == 701))
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if ((paramString != null) && (paramString.a(this, null, null)))
        {
          AppMethodBeat.o(124992);
          break;
        }
      }
      Toast.makeText(this, getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(124992);
      break;
      if (paramm.getType() == 145)
      {
        com.tencent.mm.kernel.g.Rg().b(145, this);
        paramString = ((com.tencent.mm.modelfriend.a)paramm).agi();
        if (paramInt2 == -41)
        {
          h.g(this, 2131302269, 2131302270);
          AppMethodBeat.o(124992);
          break;
        }
        if (paramInt2 == -75)
        {
          h.b(this, getString(2131296515), "", true);
          AppMethodBeat.o(124992);
          break;
        }
        com.tencent.mm.plugin.b.a.wA("L3");
        Object localObject = new StringBuilder();
        com.tencent.mm.kernel.g.RN();
        localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L3,");
        com.tencent.mm.kernel.g.RN();
        com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L3") + ",1");
        localObject = new Intent();
        ((Intent)localObject).putExtra("bindmcontact_mobile", this.gCC);
        ((Intent)localObject).putExtra("bindmcontact_shortmobile", paramString);
        ((Intent)localObject).putExtra("mobile_verify_purpose", 1);
        ((Intent)localObject).putExtra("mobileverify_countdownsec", ((com.tencent.mm.modelfriend.a)paramm).agn());
        ((Intent)localObject).putExtra("mobileverify_countdownstyle", ((com.tencent.mm.modelfriend.a)paramm).ago());
        ((Intent)localObject).putExtra("mobileverify_fb", ((com.tencent.mm.modelfriend.a)paramm).agp());
        a(MobileVerifyUI.class, (Intent)localObject);
        AppMethodBeat.o(124992);
        break;
      }
      if (j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(124992);
        break;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
        Toast.makeText(this, getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(124992);
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
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginIndepPass
 * JD-Core Version:    0.6.2
 */