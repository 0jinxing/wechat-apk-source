package com.tencent.mm.plugin.account.security.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.Map;

public class SecurityAccountVerifyUI extends MMWizardActivity
  implements com.tencent.mm.ai.f
{
  private String cCU;
  private String cCW;
  private String cFl;
  private ap che;
  private ProgressDialog ehJ = null;
  private String gsF;
  private String gzO;
  private Button gzR;
  private EditText gzV;
  private TextView gzW;
  private TextView gzX;
  private Button gzY;
  private boolean gzZ = false;

  private void aoZ()
  {
    AppMethodBeat.i(69929);
    cancel();
    Ni(1);
    AppMethodBeat.o(69929);
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(69931);
    if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
    {
      AppMethodBeat.o(69931);
      return bool2;
    }
    switch (paramInt2)
    {
    default:
      bool2 = false;
    case -32:
    case -33:
    case -34:
    case -57:
    case -1:
    case -41:
    case -74:
    }
    while (true)
    {
      AppMethodBeat.o(69931);
      break;
      h.a(this.mController.ylL, 2131297584, 2131297589, null);
      bool2 = bool1;
      continue;
      h.a(this.mController.ylL, 2131297583, 2131297589, null);
      bool2 = bool1;
      continue;
      Toast.makeText(this, 2131297538, 0).show();
      bool2 = bool1;
      continue;
      Toast.makeText(this.mController.ylL, 2131296906, 0).show();
      bool2 = bool1;
      continue;
      Toast.makeText(this.mController.ylL, 2131297537, 0).show();
      bool2 = bool1;
      continue;
      h.a(this.mController.ylL, 2131297534, 2131297061, null);
      bool2 = bool1;
    }
  }

  public final int getLayoutId()
  {
    return 2130970578;
  }

  public final void initView()
  {
    AppMethodBeat.i(69927);
    this.cFl = getIntent().getStringExtra("binded_mobile");
    this.gzO = getIntent().getStringExtra("auth_ticket");
    this.gzZ = getIntent().getBooleanExtra("re_open_verify", false);
    this.gzV = ((EditText)findViewById(2131821771));
    this.gzW = ((TextView)findViewById(2131827293));
    this.gzX = ((TextView)findViewById(2131827294));
    this.gzY = ((Button)findViewById(2131827295));
    this.gzV.addTextChangedListener(new SecurityAccountVerifyUI.1(this));
    this.gzW.setText(bo.ans(this.cFl));
    this.gzX.setTag(Integer.valueOf(60));
    this.che = new ap(new SecurityAccountVerifyUI.2(this), true);
    this.gzY.setOnClickListener(new SecurityAccountVerifyUI.3(this));
    if (!this.gzZ)
    {
      this.gzR = ((Button)findViewById(2131827290));
      this.gzR.setVisibility(0);
      this.gzR.setOnClickListener(new SecurityAccountVerifyUI.4(this));
    }
    setBackBtn(new SecurityAccountVerifyUI.5(this));
    addTextOptionMenu(0, getString(2131296989), new SecurityAccountVerifyUI.6(this));
    enableOptionMenu(false);
    setMMTitle(2131302689);
    this.che.ae(1000L, 1000L);
    AppMethodBeat.o(69927);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(69923);
    super.onCreate(paramBundle);
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    AppMethodBeat.o(69923);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(69926);
    super.onDestroy();
    this.che.stopTimer();
    AppMethodBeat.o(69926);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(69928);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(69928);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(69928);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(69925);
    g.Rg().b(145, this);
    g.Rg().b(132, this);
    super.onPause();
    if (!this.gzZ)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L600_200,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L600_200") + ",2");
    }
    AppMethodBeat.o(69925);
  }

  public void onResume()
  {
    AppMethodBeat.i(69924);
    g.Rg().a(145, this);
    g.Rg().a(132, this);
    super.onResume();
    if (!this.gzZ)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L600_200,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L600_200") + ",1");
      com.tencent.mm.plugin.b.a.wz("L600_200");
    }
    AppMethodBeat.o(69924);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(69930);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    switch (paramm.getType())
    {
    default:
    case 145:
    case 132:
    }
    while (true)
    {
      AppMethodBeat.o(69930);
      while (true)
      {
        return;
        paramm = (com.tencent.mm.modelfriend.a)paramm;
        if (paramm.Ah() == 10)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            ab.i("MicroMsg.SecurityAccountVerifyUI", "resend verify code successfully");
            AppMethodBeat.o(69930);
          }
          else
          {
            ab.w("MicroMsg.SecurityAccountVerifyUI", "resend verify code fail, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
            if (j(paramInt1, paramInt2, paramString))
            {
              AppMethodBeat.o(69930);
            }
            else
            {
              Toast.makeText(this.mController.ylL, getString(2131302698, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
              AppMethodBeat.o(69930);
            }
          }
        }
        else if (paramm.Ah() == 11)
        {
          Intent localIntent;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            this.gzO = paramm.agh();
            ab.d("MicroMsg.SecurityAccountVerifyUI", "duanyi test bind opmobile verify authticket = " + this.gzO);
            paramInt1 = getIntent().getIntExtra("from_source", 1);
            localIntent = new Intent();
            localIntent.putExtra("from_source", paramInt1);
            localIntent.putExtra("binded_mobile", this.cFl);
          }
          switch (paramInt1)
          {
          case 4:
          default:
            Ni(1);
            AppMethodBeat.o(69930);
            break;
          case 3:
            localIntent.addFlags(67108864);
            localIntent.putExtra("auth_ticket", this.gzO);
            paramm = getIntent().getStringExtra("WizardTransactionId");
            paramString = paramm;
            if (paramm == null)
              paramString = "";
            paramString = (Intent)ynD.get(paramString);
            ynD.clear();
            if (paramString != null)
              com.tencent.mm.plugin.account.a.a.gkE.a(this, localIntent, paramString);
            while (true)
            {
              finish();
              AppMethodBeat.o(69930);
              break;
              com.tencent.mm.plugin.account.a.a.gkE.a(this, localIntent, null);
            }
          case 1:
          case 2:
          case 5:
          case 6:
            localIntent.addFlags(67108864);
            localIntent.putExtra("auth_ticket", this.gzO);
            com.tencent.mm.plugin.account.a.a.gkE.a(this, localIntent, null);
            finish();
            AppMethodBeat.o(69930);
            continue;
            ab.w("MicroMsg.SecurityAccountVerifyUI", "verify verify-code fail, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
            if (j(paramInt1, paramInt2, paramString))
            {
              AppMethodBeat.o(69930);
              continue;
            }
            Toast.makeText(this.mController.ylL, getString(2131302702, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
            AppMethodBeat.o(69930);
            break;
          }
        }
        else
        {
          ab.w("MicroMsg.SecurityAccountVerifyUI", "unknow bind mobile for reg op code %d, errType %d, errCode %d", new Object[] { Integer.valueOf(paramm.Ah()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          AppMethodBeat.o(69930);
          continue;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            com.tencent.mm.plugin.account.security.a.f.n(true, true);
            paramString = new Intent(this, MySafeDeviceListUI.class);
            paramString.addFlags(67108864);
            startActivity(paramString);
            finish();
            AppMethodBeat.o(69930);
          }
          else
          {
            if (!j(paramInt1, paramInt2, paramString))
              break;
            AppMethodBeat.o(69930);
          }
        }
      }
      Toast.makeText(this, getString(2131302702, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI
 * JD-Core Version:    0.6.2
 */