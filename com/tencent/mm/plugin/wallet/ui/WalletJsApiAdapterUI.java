package com.tencent.mm.plugin.wallet.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletJsApiAdapterUI extends WalletBaseUI
{
  protected boolean pQP = false;
  protected String packageName = "";
  protected String ttH = "";

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46461);
    ab.i("MicroMsg.WalletJsApiAdapterUI", "onSceneEnd errType %s errCode %s errMsg %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
        break label164;
      f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
      if ((!bo.isNullOrNil(this.packageName)) && (!bo.isNullOrNil(this.ttH)))
      {
        paramString = new Intent();
        paramString.putExtra("intent_finish_self", true);
        d.b(this, this.packageName, this.ttH, paramString, 1);
        AppMethodBeat.o(46461);
      }
    }
    while (true)
    {
      return bool;
      setResult(-1);
      finish();
      break;
      setResult(-1000);
      h.bQ(this, paramString);
      finish();
      AppMethodBeat.o(46461);
      continue;
      label164: AppMethodBeat.o(46461);
      bool = false;
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46460);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      setResult(-1);
      finish();
    }
    AppMethodBeat.o(46460);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(46459);
    if (!this.pQP)
    {
      ab.d("MicroMsg.WalletJsApiAdapterUI", "back press not lock");
      finish();
      AppMethodBeat.o(46459);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.WalletJsApiAdapterUI", "back press but lock");
      AppMethodBeat.o(46459);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46456);
    super.onCreate(paramBundle);
    AM(8);
    this.packageName = getIntent().getStringExtra("intent_jump_package");
    this.ttH = getIntent().getStringExtra("intent_jump_ui");
    nf(580);
    if (getIntent() == null)
    {
      ab.d("MicroMsg.WalletJsApiAdapterUI", "func[doCheckPayNetscene] intent null");
      setResult(0);
      finish();
      AppMethodBeat.o(46456);
      return;
    }
    int i = getIntent().getIntExtra("source_type", 1);
    ab.i("MicroMsg.WalletJsApiAdapterUI", "do check jsapi: %s", new Object[] { Integer.valueOf(i) });
    paramBundle = null;
    if (i == 1)
      paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), getIntent().getIntExtra("jsapi_scene", 0), "openWCPayCardList", getIntent().getIntExtra("pay_channel", 0));
    while (true)
    {
      if (paramBundle != null)
        a(paramBundle, true, false);
      AppMethodBeat.o(46456);
      break;
      if (i == 2)
      {
        String str1 = getIntent().getStringExtra("appId");
        String str2 = getIntent().getStringExtra("timeStamp");
        paramBundle = getIntent().getStringExtra("nonceStr");
        String str3 = getIntent().getStringExtra("packageExt");
        String str4 = getIntent().getStringExtra("signtype");
        String str5 = getIntent().getStringExtra("paySignature");
        String str6 = getIntent().getStringExtra("wxapp_username");
        String str7 = getIntent().getStringExtra("wxapp_path");
        String str8 = getIntent().getStringExtra("command_word");
        paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, paramBundle, str3, str4, str5, getIntent().getIntExtra("jsapi_scene", 0), str6, str7, str8, getIntent().getIntExtra("pay_channel", 0));
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46458);
    ng(580);
    super.onDestroy();
    AppMethodBeat.o(46458);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(46457);
    ab.v("MicroMsg.WalletJsApiAdapterUI", "onNewIntent");
    int i = paramIntent.getIntExtra("RESET_PWD_USER_ACTION", 0);
    if (i == 1)
    {
      setResult(-1);
      finish();
      AppMethodBeat.o(46457);
    }
    while (true)
    {
      return;
      if (i == 2)
      {
        setResult(-1000);
        finish();
        AppMethodBeat.o(46457);
      }
      else
      {
        setResult(0);
        finish();
        AppMethodBeat.o(46457);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI
 * JD-Core Version:    0.6.2
 */