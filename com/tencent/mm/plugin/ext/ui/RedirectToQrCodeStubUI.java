package com.tencent.mm.plugin.ext.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public class RedirectToQrCodeStubUI extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20439);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.RedirectToQrCodeStubUI", "hy: start to handle qrcode string");
    paramBundle = getIntent().getStringExtra("K_STR");
    int i = getIntent().getIntExtra("K_TYPE", -1);
    int j = getIntent().getIntExtra("K_VERSION", -1);
    cf localcf = new cf();
    localcf.cvm.activity = this;
    localcf.cvm.ctB = paramBundle;
    localcf.cvm.cvn = i;
    localcf.cvm.cvo = j;
    localcf.cvm.scene = 47;
    a.xxA.m(localcf);
    finish();
    AppMethodBeat.o(20439);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.ui.RedirectToQrCodeStubUI
 * JD-Core Version:    0.6.2
 */