package com.tencent.mm.plugin.account.security.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.protocal.protobuf.jp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.util.Map;

public class SecurityAccountIntroUI extends MMWizardActivity
  implements f
{
  private String cFl;
  private ProgressDialog ehJ = null;
  private String gsF;
  private String gzO;
  private String gzP;
  private boolean gzQ = false;
  private Button gzR;
  private String jumpUrl;

  private void aoZ()
  {
    AppMethodBeat.i(69912);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    cancel();
    Ni(1);
    AppMethodBeat.o(69912);
  }

  public final int getLayoutId()
  {
    return 2130970576;
  }

  public final void initView()
  {
    AppMethodBeat.i(69911);
    setMMTitle(2131302704);
    findViewById(2131827289).setOnClickListener(new SecurityAccountIntroUI.1(this));
    if (!this.gzQ)
    {
      this.gzR = ((Button)findViewById(2131827290));
      if (!bo.isNullOrNil(this.gzP))
        this.gzR.setText(this.gzP);
      this.gzR.setVisibility(0);
      this.gzR.setOnClickListener(new SecurityAccountIntroUI.2(this));
    }
    setBackBtn(new SecurityAccountIntroUI.3(this));
    AppMethodBeat.o(69911);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(69907);
    super.onCreate(paramBundle);
    this.gzO = getIntent().getStringExtra("auth_ticket");
    this.cFl = getIntent().getStringExtra("binded_mobile");
    this.gzQ = getIntent().getBooleanExtra("re_open_verify", false);
    paramBundle = getIntent().getStringExtra("close_safe_device_style");
    ab.i("MicroMsg.SecurityAccountIntroUI", "summerphone authTicket[%s], showStyle[%s]", new Object[] { bo.anv(this.gzO), paramBundle });
    if (!bo.isNullOrNil(paramBundle))
    {
      paramBundle = br.z(paramBundle, "wording");
      if (paramBundle != null)
      {
        this.gzP = ((String)paramBundle.get(".wording.title"));
        this.jumpUrl = ((String)paramBundle.get(".wording.url"));
        ab.i("MicroMsg.SecurityAccountIntroUI", "summerphone closeBtnText[%s], jumpUrl[%s]", new Object[] { this.gzP, this.jumpUrl });
      }
    }
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    AppMethodBeat.o(69907);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(69910);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(69910);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(69910);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(69909);
    super.onPause();
    g.Rg().b(145, this);
    g.Rg().b(132, this);
    if (!this.gzQ)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L600_100,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L600_100") + ",2");
    }
    AppMethodBeat.o(69909);
  }

  public void onResume()
  {
    AppMethodBeat.i(69908);
    super.onResume();
    g.Rg().a(145, this);
    g.Rg().a(132, this);
    if (!this.gzQ)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L600_100,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L600_100") + ",1");
      com.tencent.mm.plugin.b.a.wz("L600_100");
    }
    AppMethodBeat.o(69908);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(69913);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (!this.gzQ)
      {
        paramString = ((com.tencent.mm.modelfriend.a)paramm).agh();
        ab.d("MicroMsg.SecurityAccountIntroUI", "duanyi test authTicket_login = " + this.gzO + "duanyi test authTicket_check = " + paramString);
        paramm = new Intent(this, SecurityAccountVerifyUI.class);
        paramm.putExtra("auth_ticket", paramString);
        paramm.putExtra("binded_mobile", this.cFl);
        paramm.putExtra("re_open_verify", this.gzQ);
        paramm.putExtra("from_source", getIntent().getIntExtra("from_source", 1));
        J(this, paramm);
        if (getIntent().getIntExtra("from_source", 1) == 3)
          finish();
        AppMethodBeat.o(69913);
      }
    while (true)
    {
      return;
      paramString = ((jp)((x)paramm).ehh.fsH.fsP).vHS;
      break;
      int i;
      switch (paramInt2)
      {
      default:
        i = 0;
      case -57:
      case -1:
      case -34:
      case -41:
      case -74:
      }
      while (true)
      {
        if ((i == 0) && (!com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString)))
          break label369;
        AppMethodBeat.o(69913);
        break;
        Toast.makeText(this, 2131296906, 0).show();
        i = 1;
        continue;
        Toast.makeText(this, 2131297538, 0).show();
        i = 1;
        continue;
        Toast.makeText(this, 2131297537, 0).show();
        i = 1;
        continue;
        h.a(this, 2131297534, 2131297061, null);
        i = 1;
      }
      label369: Toast.makeText(this, getString(2131302698, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      AppMethodBeat.o(69913);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI
 * JD-Core Version:    0.6.2
 */