package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class n extends c
{
  private String gEk;
  private int scene;
  private String token;
  private String tul;

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(47406);
    ab.i("MicroMsg.WalletJSApiVerifyCodeProcess", "start WalletJSApiVerifyCodeProcess");
    this.tul = paramBundle.getString("key_relation_key");
    this.gEk = paramBundle.getString("key_pwd1");
    this.token = paramBundle.getString("key_jsapi_token");
    this.scene = paramBundle.getInt("key_verify_scene");
    b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
    AppMethodBeat.o(47406);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(47408);
    paramMMActivity = new n.1(this, paramMMActivity, parami, parami, paramMMActivity);
    AppMethodBeat.o(47408);
    return paramMMActivity;
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(47407);
    ab.i("MicroMsg.WalletJSApiVerifyCodeProcess", "end WalletJSApiVerifyCodeProcess");
    if (this.scene == 8)
    {
      a(paramActivity, "wallet", ".pay.ui.WalletLoanRepaymentUI", -1, null, false);
      AppMethodBeat.o(47407);
    }
    while (true)
    {
      return;
      a(paramActivity, WalletCheckPwdUI.class, -1, null, false);
      AppMethodBeat.o(47407);
    }
  }

  public final String bxP()
  {
    return null;
  }

  public final void c(Activity paramActivity, int paramInt)
  {
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.n
 * JD-Core Version:    0.6.2
 */