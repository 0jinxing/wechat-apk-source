package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletFaceIdAuthUI extends WalletBaseUI
{
  int gOW;
  Button mqV;
  private WalletFaceIdAuthUI.c mqW;

  public final void Ml(String paramString)
  {
    AppMethodBeat.i(41392);
    h.a(this, paramString, "", getString(2131296955), false, new WalletFaceIdAuthUI.2(this));
    AppMethodBeat.o(41392);
  }

  public final boolean bwP()
  {
    AppMethodBeat.i(41390);
    boolean bool = this.mqW.bwP();
    AppMethodBeat.o(41390);
    return bool;
  }

  public final boolean bwQ()
  {
    return true;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41391);
    boolean bool = this.mqW.c(paramInt1, paramInt2, paramString, paramm);
    AppMethodBeat.o(41391);
    return bool;
  }

  public final int getLayoutId()
  {
    return 2130969488;
  }

  public final void initView()
  {
    AppMethodBeat.i(41389);
    this.mqV = ((Button)findViewById(2131823862));
    this.mqV.setOnClickListener(new WalletFaceIdAuthUI.1(this));
    AppMethodBeat.o(41389);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41388);
    this.gOW = getIntent().getIntExtra("key_scene", 1);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "scene: %s", new Object[] { Integer.valueOf(this.gOW) });
    if (this.gOW == 0)
      this.mqW = new WalletFaceIdAuthUI.b(this);
    while (true)
    {
      super.onCreate(paramBundle);
      setMMTitle(2131299562);
      this.mqW.onCreate();
      initView();
      AppMethodBeat.o(41388);
      return;
      if (this.gOW == 1)
        this.mqW = new WalletFaceIdAuthUI.a(this);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI
 * JD-Core Version:    0.6.2
 */