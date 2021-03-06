package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.a.b;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletIbgAdapterUI extends WalletBaseUI
{
  private void adg(String paramString)
  {
    AppMethodBeat.i(47842);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(47842);
  }

  private void cSv()
  {
    AppMethodBeat.i(47843);
    g.RQ();
    g.RP().Ry().set(ac.a.xNt, Boolean.TRUE);
    h.a(this, false, getString(2131305594), "", getString(2131305589), getString(2131305588), new WalletIbgAdapterUI.1(this), new WalletIbgAdapterUI.2(this));
    AppMethodBeat.o(47843);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47840);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof b)))
    {
      paramInt1 = ((b)paramm).tuH;
      paramString = ((b)paramm).jumpUrl;
      ab.i("MicroMsg.WalletH5AdapterUI", "hy: get success! url is: %s, download x5 = %b", new Object[] { paramString, Integer.valueOf(paramInt1) });
      if (paramInt1 == 1)
      {
        paramInt1 = v.a.dhq();
        ab.i("MicroMsg.WalletH5AdapterUI", "now status = %d", new Object[] { Integer.valueOf(paramInt1) });
        switch (paramInt1)
        {
        default:
          cSv();
          paramInt1 = 0;
          if (paramInt1 != 0)
          {
            adg(paramString);
            finish();
            AppMethodBeat.o(47840);
          }
          break;
        case 1:
        case 4:
        case 2:
        case 3:
        }
      }
    }
    while (true)
    {
      return false;
      paramInt1 = 1;
      break;
      g.RQ();
      if (((Boolean)g.RP().Ry().get(ac.a.xNt, Boolean.FALSE)).booleanValue())
      {
        Toast.makeText(this, getString(2131305591), 1).show();
        v.a.dhr();
        finish();
      }
      while (true)
      {
        paramInt1 = 0;
        break;
        cSv();
      }
      adg(paramString);
      finish();
      AppMethodBeat.o(47840);
      continue;
      com.tencent.mm.wallet_core.a.b(this, null, 0);
      AppMethodBeat.o(47840);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47838);
    super.onCreate(paramBundle);
    AM(4);
    this.Ahr.nf(1564);
    a(new b(), true, false);
    AppMethodBeat.o(47838);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47841);
    this.Ahr.ng(1564);
    super.onDestroy();
    AppMethodBeat.o(47841);
  }

  public void onResume()
  {
    AppMethodBeat.i(47839);
    super.onResume();
    AppMethodBeat.o(47839);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgAdapterUI
 * JD-Core Version:    0.6.2
 */