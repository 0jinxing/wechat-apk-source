package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.model.av;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;

public class RegByMobileSendSmsUI extends MMActivity
  implements f
{
  private String bCu;
  private int countDown;
  private String cxb;
  private String gAN;
  private ba gBm;
  private String gDC;
  private g gDu;
  private String gDy;
  private int gEs;
  private int gEu;
  private boolean gFM;
  private String gFm;
  private String gGi;
  private String gGj;
  private ProgressDialog gGk;
  private int gGl;
  private Button gGm;
  private Button gGn;
  private ap gGo;
  private SecurityImage gGp;

  public RegByMobileSendSmsUI()
  {
    AppMethodBeat.i(125413);
    this.gGi = "";
    this.gAN = "";
    this.gGj = "";
    this.gDy = "";
    this.countDown = 15;
    this.gBm = new ba();
    AppMethodBeat.o(125413);
  }

  private void goBack()
  {
    AppMethodBeat.i(125421);
    h.a(this, getString(2131302273), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(125405);
        RegByMobileSendSmsUI.t(RegByMobileSendSmsUI.this);
        RegByMobileSendSmsUI.this.finish();
        AppMethodBeat.o(125405);
      }
    }
    , null);
    AppMethodBeat.o(125421);
  }

  private void stopTimer()
  {
    AppMethodBeat.i(125420);
    if (this.gGo != null)
      this.gGo.stopTimer();
    this.gGn.setText(2131302271);
    this.gGn.setEnabled(true);
    AppMethodBeat.o(125420);
  }

  private k ww(String paramString)
  {
    AppMethodBeat.i(125416);
    k localk = new k(paramString);
    ab.d("MicroMsg.RegByMobileSendSmsUI", "content: %s", new Object[] { paramString });
    int i = paramString.indexOf(' ') + 1;
    localk.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(2131427765)), i, paramString.length(), 33);
    localk.setSpan(new ForegroundColorSpan(getResources().getColor(2131690135)), i, paramString.length(), 33);
    AppMethodBeat.o(125416);
    return localk;
  }

  public final int getLayoutId()
  {
    return 2130970497;
  }

  public final void initView()
  {
    AppMethodBeat.i(125415);
    super.initView();
    ((TextView)findViewById(2131826935)).setText(getString(2131302277, new Object[] { this.gGi }));
    ((TextView)findViewById(2131826936)).setText(ww(getString(2131302276, new Object[] { this.gAN })));
    ((TextView)findViewById(2131826937)).setText(ww(getString(2131302279, new Object[] { this.gGj })));
    this.gGm = ((Button)findViewById(2131826939));
    this.gGn = ((Button)findViewById(2131826940));
    if (bo.Q(new String[] { this.gGi, this.gGj, this.gAN }))
    {
      this.gGm.setEnabled(false);
      this.gGn.setEnabled(false);
      if (!bo.isNullOrNil(q.getSimCountryIso()))
        break label248;
      this.gGm.setVisibility(8);
    }
    while (true)
    {
      setMMTitle(2131302278);
      setBackBtn(new RegByMobileSendSmsUI.10(this));
      AppMethodBeat.o(125415);
      return;
      this.gGn.setOnClickListener(new RegByMobileSendSmsUI.1(this));
      break;
      label248: this.gGm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(125406);
          paramAnonymousView = new Intent();
          paramAnonymousView.setAction("android.intent.action.SENDTO");
          paramAnonymousView.setData(Uri.parse("smsto:" + RegByMobileSendSmsUI.b(RegByMobileSendSmsUI.this)));
          paramAnonymousView.putExtra("sms_body", RegByMobileSendSmsUI.c(RegByMobileSendSmsUI.this));
          try
          {
            RegByMobileSendSmsUI.this.startActivity(paramAnonymousView);
            RegByMobileSendSmsUI.this.overridePendingTransition(2131034265, 2131034262);
            AppMethodBeat.o(125406);
            return;
          }
          catch (Exception paramAnonymousView)
          {
            while (true)
            {
              ab.e("MicroMsg.RegByMobileSendSmsUI", paramAnonymousView.getMessage());
              AppMethodBeat.o(125406);
            }
          }
        }
      });
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125414);
    super.onCreate(paramBundle);
    this.gEs = getIntent().getIntExtra("key_reg_style", 1);
    this.gGi = bo.nullAsNil(getIntent().getStringExtra("from_mobile"));
    this.gGj = bo.nullAsNil(getIntent().getStringExtra("to_mobile"));
    this.gAN = bo.nullAsNil(getIntent().getStringExtra("verify_code"));
    this.gDy = bo.nullAsNil(getIntent().getStringExtra("regsession_id"));
    this.gFm = bo.nullAsNil(getIntent().getStringExtra("reg_3d_app_ticket"));
    this.bCu = bo.nullAsNil(getIntent().getStringExtra("kintent_nickname"));
    this.gDC = bo.nullAsNil(getIntent().getStringExtra("kintent_password"));
    this.gFM = getIntent().getBooleanExtra("kintent_hasavatar", false);
    this.gEu = getIntent().getIntExtra("reg_3d_app_type", 0);
    initView();
    AppMethodBeat.o(125414);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125422);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(125422);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125422);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(125417);
    super.onResume();
    com.tencent.mm.kernel.g.Rg().a(145, this);
    AppMethodBeat.o(125417);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125419);
    ab.i("MicroMsg.RegByMobileSendSmsUI", "errType %s, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.gGk != null)
      this.gGk.dismiss();
    if ((paramm.getType() == 145) && (((com.tencent.mm.modelfriend.a)paramm).Ah() == 15))
    {
      paramm = (com.tencent.mm.modelfriend.a)paramm;
      this.cxb = paramm.agg();
      if (paramInt2 == 0)
      {
        stopTimer();
        if (this.gEs == 1)
        {
          com.tencent.mm.kernel.g.Rg().a(126, this);
          paramString = new s("", this.gDC, this.bCu, 0, "", this.gGi, "", "", this.cxb, 1, "", "", "", true, this.gFM);
          paramString.ts(this.gDy);
          paramString.tt(this.gFm);
          paramString.lX(1);
          com.tencent.mm.kernel.g.Rg().a(paramString, 0);
          getString(2131297061);
          this.gGk = h.b(this, getString(2131302326), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              AppMethodBeat.i(125408);
              com.tencent.mm.kernel.g.Rg().c(paramString);
              com.tencent.mm.kernel.g.Rg().b(126, RegByMobileSendSmsUI.this);
              AppMethodBeat.o(125408);
            }
          });
          AppMethodBeat.o(125419);
        }
      }
    }
    while (true)
    {
      return;
      paramString = new Intent();
      paramString.putExtra("regsetinfo_ticket", this.cxb);
      paramString.putExtra("regsetinfo_user", this.gGi);
      paramString.putExtra("regsession_id", this.gDy);
      paramString.putExtra("reg_3d_app_ticket", this.gFm);
      paramString.putExtra("reg_3d_app_type", this.gEu);
      paramString.putExtra("mobile_check_type", 1);
      paramString.putExtra("regsetinfo_ismobile", 4);
      paramString.putExtra("regsetinfo_NextControl", paramm.agm());
      paramString.putExtra("key_reg_style", this.gEs);
      paramString.setClass(this, RegSetInfoUI.class);
      startActivity(paramString);
      AppMethodBeat.o(125419);
      continue;
      if (paramInt2 == -35)
      {
        stopTimer();
        paramString = com.tencent.mm.h.a.jY(paramString);
        this.gBm.daR = this.gEu;
        this.gBm.cVS = 7L;
        this.gBm.ajK();
        if (paramString != null)
        {
          paramString.a(this, new RegByMobileSendSmsUI.12(this, paramm), new RegByMobileSendSmsUI.13(this));
          AppMethodBeat.o(125419);
        }
        else
        {
          h.a(this, getString(2131297520), null, new RegByMobileSendSmsUI.14(this, paramm), new RegByMobileSendSmsUI.15(this));
          AppMethodBeat.o(125419);
        }
      }
      else if (paramInt2 == -212)
      {
        stopTimer();
        paramString = new Intent(this, MobileLoginOrForceReg.class);
        paramString.putExtra("ticket", this.cxb);
        paramString.putExtra("moble", this.gGi);
        paramString.putExtra("regsession_id", this.gDy);
        paramString.putExtra("reg_3d_app_ticket", this.gFm);
        paramString.putExtra("reg_3d_app_type", this.gEu);
        paramString.putExtra("next_controll", paramm.agm());
        paramString.putExtra("username", paramm.getUsername());
        paramString.putExtra("password", paramm.agf());
        paramString.putExtra("nickname", paramm.ags());
        paramString.putExtra("avatar_url", paramm.agr());
        paramString.putExtra("mobile_check_type", 1);
        paramString.putExtra("kintent_hasavatar", this.gFM);
        paramString.putExtra("kintent_nickname", this.bCu);
        paramString.putExtra("kintent_password", this.gDC);
        paramString.putExtra("key_reg_style", this.gEs);
        startActivity(paramString);
        AppMethodBeat.o(125419);
      }
      else if ((!bo.isNullOrNil(paramString)) && (this.gGl >= 4))
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if ((paramString != null) && (paramString.a(this, null, null)))
          AppMethodBeat.o(125419);
      }
      else
      {
        AppMethodBeat.o(125419);
        continue;
        if (paramm.getType() == 126)
        {
          s locals = (s)paramm;
          if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
          {
            if (this.gGp == null)
            {
              this.gGp = SecurityImage.a.a(this, 0, locals.ajo(), locals.ajn(), "", new RegByMobileSendSmsUI.16(this, locals), null, new RegByMobileSendSmsUI.2(this), new RegByMobileSendSmsUI.3(this, locals));
              AppMethodBeat.o(125419);
            }
            else
            {
              this.gGp.b(0, ((s)paramm).ajo(), ((s)paramm).ajn(), "");
              AppMethodBeat.o(125419);
            }
          }
          else if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            String str = this.gGi;
            this.gBm.daR = this.gEu;
            this.gBm.cVS = 6L;
            this.gBm.ajK();
            com.tencent.mm.kernel.a.unhold();
            com.tencent.mm.kernel.a.cm(true);
            if (this.gFM)
            {
              paramString = com.tencent.mm.compatible.util.e.euY + "temp.avatar";
              paramm = com.tencent.mm.compatible.util.e.euY + "temp.avatar.hd";
              com.tencent.mm.vfs.e.aQ(paramString, paramm);
              com.tencent.mm.vfs.e.deleteFile(paramString);
              d.c(paramm, 96, 96, Bitmap.CompressFormat.JPEG, 90, paramString);
              new com.tencent.mm.ah.m(this, com.tencent.mm.compatible.util.e.euY + "temp.avatar").a(new RegByMobileSendSmsUI.4(this, locals, str), new RegByMobileSendSmsUI.5(this, locals, str));
              AppMethodBeat.o(125419);
            }
            else
            {
              this.cxb = locals.ajw();
              av.fly.ak("login_user_name", str);
              paramString = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
              paramString.addFlags(67108864);
              paramString.putExtra("LauncherUI.enter_from_reg", true);
              startActivity(paramString);
              finish();
              com.tencent.mm.plugin.b.a.wA("RE900_100");
              paramString = new StringBuilder();
              com.tencent.mm.kernel.g.RN();
              paramString = paramString.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_600,");
              com.tencent.mm.kernel.g.RN();
              com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R200_600") + ",4");
              AppMethodBeat.o(125419);
            }
          }
          else
          {
            paramString = com.tencent.mm.h.a.jY(paramString);
            if (paramString != null)
            {
              paramString.a(this, null, null);
              AppMethodBeat.o(125419);
            }
          }
        }
        else
        {
          AppMethodBeat.o(125419);
        }
      }
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(125418);
    super.onStop();
    stopTimer();
    com.tencent.mm.kernel.g.Rg().b(145, this);
    AppMethodBeat.o(125418);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI
 * JD-Core Version:    0.6.2
 */