package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.au.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public class RegByMobileVoiceVerifyUI extends MMActivity
  implements f
{
  private String cFl;
  private TextView exj;
  private String gBC;
  private String gGN;
  private com.tencent.mm.modelfriend.a gGP;
  private x gGQ;
  private int gGR = 0;
  private String gsF;

  public final int getLayoutId()
  {
    return 2130968846;
  }

  public final void initView()
  {
    AppMethodBeat.i(125470);
    setMMTitle(2131297599);
    setBackBtn(new RegByMobileVoiceVerifyUI.1(this));
    this.exj = ((TextView)findViewById(2131821776));
    Button localButton = (Button)findViewById(2131821777);
    this.gBC = RegByMobileVoiceVerifySelectUI.wx(this.cFl);
    this.exj.setText(this.gBC);
    this.gGN = b.sN(this.cFl);
    findViewById(2131821775).setOnClickListener(new RegByMobileVoiceVerifyUI.2(this));
    localButton.setOnClickListener(new RegByMobileVoiceVerifyUI.3(this));
    AppMethodBeat.o(125470);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(125471);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10000)
      if (paramIntent == null)
        AppMethodBeat.o(125471);
    while (true)
    {
      return;
      this.gBC = paramIntent.getStringExtra("voice_verify_language");
      this.gGN = paramIntent.getStringExtra("voice_verify_code");
      this.exj.setText(this.gBC);
      AppMethodBeat.o(125471);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125466);
    super.onCreate(paramBundle);
    this.cFl = getIntent().getExtras().getString("bindmcontact_mobile");
    this.gGR = getIntent().getExtras().getInt("voice_verify_type");
    if ((this.gGR == 0) || (this.gGR == 2) || (this.gGR == 3))
      g.Rg().a(145, this);
    while (true)
    {
      this.gsF = com.tencent.mm.plugin.b.a.arO();
      initView();
      AppMethodBeat.o(125466);
      return;
      if ((this.gGR == 4) || (this.gGR == 1))
        g.Rg().a(132, this);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125468);
    super.onDestroy();
    g.Rg().b(132, this);
    g.Rg().b(145, this);
    if ((this.gGR == 0) || (this.gGR == 2) || (this.gGR == 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_500,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R200_500") + ",2");
    }
    AppMethodBeat.o(125468);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125469);
    boolean bool;
    if (paramInt == 4)
    {
      com.tencent.mm.plugin.b.a.wA(this.gsF);
      aqX();
      finish();
      bool = true;
      AppMethodBeat.o(125469);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125469);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(125467);
    super.onResume();
    if ((this.gGR == 0) || (this.gGR == 2) || (this.gGR == 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R200_500,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R200_500") + ",1");
      com.tencent.mm.plugin.b.a.wz("R200_500");
    }
    AppMethodBeat.o(125467);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(125472);
    ab.i("MicroMsg.RegByMobileVoiceVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    AppMethodBeat.o(125472);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI
 * JD-Core Version:    0.6.2
 */