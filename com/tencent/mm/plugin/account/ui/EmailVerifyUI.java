package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.account.friend.a.r.a;
import com.tencent.mm.plugin.account.friend.a.r.b;
import com.tencent.mm.plugin.account.friend.a.z;
import com.tencent.mm.protocal.protobuf.xv;
import com.tencent.mm.protocal.protobuf.xw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView;
import com.tencent.mm.ui.base.h;

public class EmailVerifyUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ = null;
  private TextView gAF;
  private TextView gAG;
  private MMAutoSwitchEditTextView gAH;
  private Button gAI;
  private Button gAJ;
  private String gAK;
  private String gAL;
  private String gAM;
  private String gAN;
  private boolean gAO = false;
  private String gsF;

  private void goBack()
  {
    AppMethodBeat.i(124771);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    finish();
    AppMethodBeat.o(124771);
  }

  public final int getLayoutId()
  {
    return 2130970985;
  }

  public final void initView()
  {
    AppMethodBeat.i(124769);
    setMMTitle(2131302248);
    this.gAF = ((TextView)findViewById(2131828394));
    String str = getString(2131302231);
    this.gAF.setText(Html.fromHtml(str));
    this.gAG = ((TextView)findViewById(2131828395));
    this.gAK = getIntent().getStringExtra("email_address");
    if (!bo.isNullOrNil(this.gAK))
    {
      this.gAG.setText(this.gAK);
      this.gAM = getIntent().getStringExtra("password");
      this.gAL = getIntent().getStringExtra("email_login_page");
      ab.i("MicroMsg.EmailVerifyUI", "user register:email add:[%s], password not allowed to printf, login page:[%s]", new Object[] { this.gAK, this.gAL });
      this.gAH = ((MMAutoSwitchEditTextView)findViewById(2131828396));
      this.gAH.setOnInputFinished(new EmailVerifyUI.1(this));
      this.gAH.setOnTextChanged(new EmailVerifyUI.2(this));
      this.gAJ = ((Button)findViewById(2131828398));
      this.gAJ.setOnClickListener(new EmailVerifyUI.3(this));
      this.gAI = ((Button)findViewById(2131828397));
      if ((!bo.isNullOrNil(this.gAL)) && (!bo.isNullOrNil(this.gAK)))
        break label305;
      this.gAI.setVisibility(8);
    }
    while (true)
    {
      setBackBtn(new EmailVerifyUI.5(this));
      addTextOptionMenu(0, getString(2131296989), new EmailVerifyUI.6(this));
      enableOptionMenu(false);
      AppMethodBeat.o(124769);
      return;
      ab.w("MicroMsg.EmailVerifyUI", "email add is null or nill");
      break;
      label305: this.gAI.setVisibility(0);
      this.gAI.setOnClickListener(new EmailVerifyUI.4(this));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124766);
    super.onCreate(paramBundle);
    initView();
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    AppMethodBeat.o(124766);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(124770);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(124770);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(124770);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(124768);
    super.onPause();
    g.Rg().b(481, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R500_200,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R500_200") + ",2");
    AppMethodBeat.o(124768);
  }

  public void onResume()
  {
    AppMethodBeat.i(124767);
    super.onResume();
    g.Rg().a(481, this);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R500_200,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R500_200") + ",1");
    com.tencent.mm.plugin.b.a.wz("R500_200");
    AppMethodBeat.o(124767);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(124772);
    ab.i("MicroMsg.EmailVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    this.gAO = false;
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (paramm.getType() != 481)
    {
      ab.e("MicroMsg.EmailVerifyUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paramm.getType()) });
      AppMethodBeat.o(124772);
    }
    while (true)
    {
      return;
      int i = ((r.a)((z)paramm).ftU.acF()).gvF.vIJ;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (i == 2)
        {
          com.tencent.mm.plugin.b.a.wA("R200_900_email");
          paramString = new Intent(this, RegSetInfoUI.class);
          paramString.putExtra("regsetinfo_ticket", ((r.b)((z)paramm).ftU.ZS()).gvG.wdB);
          paramString.putExtra("regsetinfo_user", this.gAK);
          paramString.putExtra("regsetinfo_ismobile", 3);
          paramString.putExtra("regsetinfo_NextStyle", ((z)paramm).ajx());
          paramString.putExtra("regsetinfo_pwd", this.gAM);
          paramString.putExtra("regsetinfo_bind_email", this.gAK);
          startActivity(paramString);
          AppMethodBeat.o(124772);
        }
        else if (i == 1)
        {
          paramString = new StringBuilder();
          g.RN();
          paramString = paramString.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R22_resend_email_code_alert,");
          g.RN();
          com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R22_resend_email_code_alert") + ",3");
          h.bQ(this, getString(2131302241));
          AppMethodBeat.o(124772);
        }
        else
        {
          ab.e("MicroMsg.EmailVerifyUI", "err opcode");
          AppMethodBeat.o(124772);
        }
      }
      else
      {
        int j;
        if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
          j = 1;
        while (true)
        {
          if (j == 0)
            break label583;
          AppMethodBeat.o(124772);
          break;
          switch (paramInt2)
          {
          default:
            j = 0;
            break;
          case -32:
            h.a(this, 2131302230, 2131302229, null);
            paramString = new StringBuilder();
            g.RN();
            paramString = paramString.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R500_260,");
            g.RN();
            com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R500_260") + ",3");
            j = 1;
            break;
          case -33:
            h.a(this, 2131302228, 2131302229, null);
            j = 1;
            break;
          case -34:
            Toast.makeText(this, 2131302227, 0).show();
            j = 1;
          }
        }
        label583: if (i == 2)
        {
          Toast.makeText(this, getString(2131302249, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(124772);
        }
        else
        {
          if (i == 1)
            Toast.makeText(this, getString(2131302240, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(124772);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI
 * JD-Core Version:    0.6.2
 */