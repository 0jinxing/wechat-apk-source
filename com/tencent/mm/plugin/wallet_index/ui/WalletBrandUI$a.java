package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_index.c.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public final class WalletBrandUI$a
  implements WalletBrandUI.b
{
  private int tRV = 0;
  private String tos = "";

  public WalletBrandUI$a(WalletBrandUI paramWalletBrandUI)
  {
  }

  public final int cSY()
  {
    return 1563;
  }

  public final m cSZ()
  {
    AppMethodBeat.i(48251);
    WalletBrandUI.a(this.tRU, this.tRU.getIntent().getStringExtra("appId"));
    String str1 = this.tRU.getIntent().getStringExtra("signtype");
    String str2 = this.tRU.getIntent().getStringExtra("nonceStr");
    String str3 = this.tRU.getIntent().getStringExtra("timeStamp");
    String str4 = this.tRU.getIntent().getStringExtra("packageExt");
    Object localObject = this.tRU.getIntent().getStringExtra("paySignature");
    String str5 = this.tRU.getIntent().getStringExtra("url");
    this.tRV = this.tRU.getIntent().getIntExtra("result_jump_mode", 0);
    WalletBrandUI.b(this.tRU, this.tRU.getIntent().getStringExtra("bizUsername"));
    int i = this.tRU.getIntent().getIntExtra("pay_channel", 0);
    localObject = new a(WalletBrandUI.f(this.tRU), str2, str3, str4, (String)localObject, str1, str5, WalletBrandUI.g(this.tRU), i);
    g.RQ();
    g.RO().eJo.a((m)localObject, 0);
    AppMethodBeat.o(48251);
    return localObject;
  }

  public final String cTa()
  {
    return this.tos;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48252);
    Intent localIntent;
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof a)))
    {
      paramString = ((a)paramm).jumpUrl;
      ab.i("MicroMsg.WalletBrandUI", "hy: gen prepay success! url is: %s", new Object[] { paramString });
      this.tos = paramString;
      paramm = ((a)paramm).tRo;
      if (this.tRV == 1)
      {
        localIntent = new Intent();
        localIntent.putExtra("url", paramString);
        localIntent.putExtra("jsInjectCode", paramm);
        this.tRU.setResult(-1, localIntent);
        this.tRU.finish();
        AppMethodBeat.o(48252);
      }
    }
    while (true)
    {
      return;
      localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramString);
      localIntent.putExtra("showShare", false);
      if (!bo.isNullOrNil(paramm))
      {
        localIntent.putExtra("shouldForceViewPort", true);
        localIntent.putExtra("view_port_code", paramm);
      }
      d.b(this.tRU, "webview", ".ui.tools.WebViewUI", localIntent);
      this.tRU.setResult(-1);
      break;
      ab.i("MicroMsg.WalletBrandUI", "hy: gen prepay failed! errType: %d, errCode: %d, errmsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      h.a(this.tRU, paramString, "", new WalletBrandUI.a.1(this), new WalletBrandUI.a.2(this));
      AppMethodBeat.o(48252);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.a
 * JD-Core Version:    0.6.2
 */