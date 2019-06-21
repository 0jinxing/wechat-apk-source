package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class f extends a
{
  public f(WalletCheckPwdNewUI paramWalletCheckPwdNewUI)
  {
    super(paramWalletCheckPwdNewUI);
  }

  public final void acQ(String paramString)
  {
    AppMethodBeat.i(47130);
    Intent localIntent = new Intent();
    localIntent.putExtra("encrypt_pwd", paramString);
    this.tDN.setResult(-1, localIntent);
    this.tDN.finish();
    AppMethodBeat.o(47130);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(47129);
    String str = this.tDN.getIntent().getStringExtra("title");
    if (!bo.isNullOrNil(str))
      this.tDN.tGT.setText(str);
    AppMethodBeat.o(47129);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.f
 * JD-Core Version:    0.6.2
 */