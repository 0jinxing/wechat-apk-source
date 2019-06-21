package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(42491);
    if ((paramActivity instanceof SnsLuckyMoneyFreePwdSetting))
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    AppMethodBeat.o(42491);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(42495);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new a.1(this, paramMMActivity, parami);
      AppMethodBeat.o(42495);
    }
    while (true)
    {
      return paramMMActivity;
      paramMMActivity = super.a(paramMMActivity, parami);
      AppMethodBeat.o(42495);
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(42492);
    b(paramActivity, paramBundle);
    AppMethodBeat.o(42492);
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(42494);
    Intent localIntent = new Intent();
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    localIntent.putExtras(localBundle);
    a(paramActivity, "luckymoney", ".sns.SnsLuckyMoneyFreePwdSetting", -1, localIntent, true);
    AppMethodBeat.o(42494);
  }

  public final String bxP()
  {
    return "LuckyFreePwdProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(42493);
    b(paramActivity, null);
    AppMethodBeat.o(42493);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.a
 * JD-Core Version:    0.6.2
 */