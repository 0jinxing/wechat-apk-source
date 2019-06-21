package com.tencent.mm.plugin.wallet.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.d.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class WalletUnbindBankCardProxyUI extends WalletBaseUI
{
  private String tmv;
  private Bankcard tmw;
  private Map<String, String> tmx;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    Object localObject1 = null;
    AppMethodBeat.i(45831);
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    setResult(0);
    if (localIntent != null)
    {
      this.tmv = localIntent.getStringExtra("packageExt");
      if (!bo.isNullOrNil(this.tmv))
      {
        paramBundle = this.tmv;
        Object localObject2;
        if (!bo.isNullOrNil(paramBundle))
        {
          String[] arrayOfString = paramBundle.split("&");
          localObject2 = new HashMap();
          if ((arrayOfString != null) && (arrayOfString.length > 0))
          {
            int i = arrayOfString.length;
            for (int j = 0; ; j++)
            {
              paramBundle = (Bundle)localObject2;
              if (j >= i)
                break;
              String str = arrayOfString[j];
              if (!bo.isNullOrNil(str))
              {
                int k = str.indexOf("=");
                paramBundle = str.substring(0, k);
                str = str.substring(k + 1, str.length());
                if ((!bo.isNullOrNil(paramBundle)) && (!bo.isNullOrNil(str)))
                  ((Map)localObject2).put(paramBundle, str);
              }
            }
          }
        }
        paramBundle = null;
        this.tmx = paramBundle;
        if ((this.tmx.containsKey("bank_type")) && (this.tmx.containsKey("bind_serial")))
        {
          paramBundle = r.cPG();
          localObject2 = (String)this.tmx.get("bind_serial");
          localObject2 = "select * from WalletBankcard where bindSerial = '" + (String)localObject2 + "'";
          localObject2 = paramBundle.bSd.a((String)localObject2, null, 2);
          paramBundle = localObject1;
          if (((Cursor)localObject2).moveToNext())
          {
            paramBundle = new Bankcard();
            paramBundle.d((Cursor)localObject2);
          }
          ((Cursor)localObject2).close();
          this.tmw = paramBundle;
          if (this.tmw == null)
          {
            ab.e("MicorMsg.WalletUnbindBankCardProxyUI", "can not found bankcard");
            setResult(0);
            finish();
            AppMethodBeat.o(45831);
          }
        }
      }
    }
    while (true)
    {
      return;
      localIntent.putExtra("key_is_show_detail", false);
      localIntent.putExtra("key_bankcard", this.tmw);
      localIntent.putExtra("scene", 1);
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.bind.a.class, localIntent.getExtras(), new WalletUnbindBankCardProxyUI.1(this));
      AppMethodBeat.o(45831);
      continue;
      ab.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param:package error.package==" + this.tmv);
      setResult(1);
      finish();
      AppMethodBeat.o(45831);
      continue;
      ab.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param error");
      setResult(1);
      finish();
      AppMethodBeat.o(45831);
      continue;
      ab.e("MicorMsg.WalletUnbindBankCardProxyUI", "intent is null");
      finish();
      AppMethodBeat.o(45831);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(45832);
    finish();
    AppMethodBeat.o(45832);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI
 * JD-Core Version:    0.6.2
 */