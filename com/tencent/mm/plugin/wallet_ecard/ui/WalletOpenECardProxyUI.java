package com.tencent.mm.plugin.wallet_ecard.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletOpenECardProxyUI extends WalletECardBaseUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48158);
    ab.i("MicroMsg.WalletOpenECardProxyUI", "activity result, request:%s, result: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        setResult(0);
        paramIntent = dOD();
        if (paramIntent != null)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("key_process_result_code", 0);
          paramIntent.l(this, localBundle);
          AppMethodBeat.o(48158);
        }
      }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(48158);
      continue;
      finish();
      AppMethodBeat.o(48158);
      continue;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(48158);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48157);
    super.onCreate(paramBundle);
    AM(4);
    c localc = dOD();
    int i;
    boolean bool;
    if (localc != null)
    {
      i = this.mBundle.getInt(com.tencent.mm.plugin.wallet_ecard.a.a.tPH, 0);
      bool = this.mBundle.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.tPZ, false);
      ab.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, isReuseExistCard: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
      if (bool)
      {
        dOE().p(new Object[] { Integer.valueOf(2), Integer.valueOf(i), Boolean.TRUE });
        AppMethodBeat.o(48157);
      }
    }
    while (true)
    {
      return;
      paramBundle = this.mBundle.getString(com.tencent.mm.plugin.wallet_ecard.a.a.tPI);
      bool = this.mBundle.getBoolean(com.tencent.mm.plugin.wallet_ecard.a.a.tPK, false);
      ab.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, token==null:%s, isTokenInvalid: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bo.isNullOrNil(paramBundle)), Boolean.valueOf(bool) });
      if (!bo.isNullOrNil(paramBundle))
      {
        dOE().p(new Object[] { Integer.valueOf(1), Integer.valueOf(i), paramBundle });
        AppMethodBeat.o(48157);
      }
      else
      {
        localc.a(this.mController.ylL, 0, this.mBundle);
        AppMethodBeat.o(48157);
        continue;
        ab.w("MicroMsg.WalletOpenECardProxyUI", "no process!!!");
        finish();
        AppMethodBeat.o(48157);
      }
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(48159);
    int i = paramIntent.getIntExtra("key_process_result_code", -1);
    boolean bool = paramIntent.getBooleanExtra("key_process_is_end", false);
    ab.i("MicroMsg.WalletOpenECardProxyUI", "new intent, resultCode: %d, isEnd: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
    if (i == -1)
    {
      if (paramIntent.getBooleanExtra("key_goto_lqt_detail", false))
      {
        ab.i("MicroMsg.WalletOpenECardProxyUI", "jump to detail");
        paramIntent = new Intent();
        paramIntent.putExtra("key_account_type", 2);
        d.b(this, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", paramIntent);
      }
      setResult(-1);
      paramIntent = dOD();
      if (!bool)
        break label125;
      finish();
      AppMethodBeat.o(48159);
    }
    while (true)
    {
      return;
      setResult(0);
      break;
      label125: if (paramIntent != null)
        paramIntent.aG(this.mController.ylL);
      AppMethodBeat.o(48159);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI
 * JD-Core Version:    0.6.2
 */