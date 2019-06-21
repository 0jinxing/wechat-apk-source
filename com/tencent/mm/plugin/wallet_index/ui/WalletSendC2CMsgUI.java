package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class WalletSendC2CMsgUI extends WalletBaseUI
{
  private int gOW;
  private Map<String, String> tSo = null;

  private boolean adk(String paramString)
  {
    AppMethodBeat.i(48311);
    String str1;
    String str2;
    String str3;
    String str4;
    Object localObject;
    String str5;
    String str6;
    if (this.gOW == 1)
    {
      paramString = getIntent().getStringExtra("key_receiver");
      str1 = getIntent().getStringExtra("key_sender_des");
      str2 = getIntent().getStringExtra("key_receiver_des");
      str3 = URLEncoder.encode(getIntent().getStringExtra("key_url"));
      str4 = getIntent().getStringExtra("key_templateid");
      localObject = getIntent().getStringExtra("key_sceneid");
      str5 = getIntent().getStringExtra("key_receivertitle");
      str6 = getIntent().getStringExtra("key_sendertitle");
    }
    while (true)
    {
      boolean bool;
      if ((!bo.isNullOrNil(str3)) && (!bo.isNullOrNil(str4)))
      {
        ab.d("MicroMsg.WalletSendC2CMsgUI", "send c2c msg to".concat(String.valueOf(paramString)));
        a(new com.tencent.mm.plugin.wallet_index.c.h(paramString, str5, str6, str4, str1, str2, str3, (String)localObject), true, true);
        AppMethodBeat.o(48311);
        bool = true;
      }
      while (true)
      {
        return bool;
        localObject = cTb();
        if ((localObject == null) || (bo.isNullOrNil(paramString)))
          break label373;
        str5 = URLDecoder.decode(bo.nullAsNil((String)((Map)localObject).get("receivertitle")));
        str6 = URLDecoder.decode(bo.nullAsNil((String)((Map)localObject).get("sendertitle")));
        str1 = URLDecoder.decode(bo.nullAsNil((String)((Map)localObject).get("senderdes")));
        str2 = URLDecoder.decode(bo.nullAsNil((String)((Map)localObject).get("receiverdes")));
        str3 = bo.nullAsNil((String)((Map)localObject).get("url"));
        str4 = URLDecoder.decode(bo.nullAsNil((String)((Map)localObject).get("templateid")));
        localObject = URLDecoder.decode(bo.nullAsNil((String)((Map)localObject).get("senceid")));
        break;
        ab.w("MicroMsg.WalletSendC2CMsgUI", "url = " + bo.isNullOrNil(str3) + "templateId=" + bo.isNullOrNil(str4));
        bool = false;
        AppMethodBeat.o(48311);
      }
      label373: localObject = null;
      str4 = null;
      str3 = null;
      str2 = null;
      str1 = null;
      str6 = null;
      str5 = null;
    }
  }

  private Map<String, String> cTb()
  {
    AppMethodBeat.i(48312);
    if (this.tSo == null)
    {
      localObject = getIntent().getStringExtra("packageExt");
      ab.d("MicroMsg.WalletSendC2CMsgUI", "func[getPackageData] packageExt: ".concat(String.valueOf(localObject)));
      if (!bo.isNullOrNil((String)localObject))
      {
        String[] arrayOfString = ((String)localObject).split("&");
        this.tSo = new HashMap();
        if ((arrayOfString != null) && (arrayOfString.length > 0))
          for (int i = 0; i < arrayOfString.length; i++)
            if (!bo.isNullOrNil(arrayOfString[i]))
            {
              localObject = arrayOfString[i].split("=");
              if ((localObject.length == 2) && (!bo.isNullOrNil(localObject[0])))
                this.tSo.put(localObject[0], localObject[1]);
            }
      }
    }
    Object localObject = this.tSo;
    AppMethodBeat.o(48312);
    return localObject;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    boolean bool = true;
    AppMethodBeat.i(48309);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        ab.i("MicroMsg.WalletSendC2CMsgUI", "Check jsapi suc & Go Select Contact");
        f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
        ab.i("MicroMsg.WalletSendC2CMsgUI", "doCallSelectConversationUI");
        paramString = cTb();
        paramInt1 = i;
        if (paramString != null)
        {
          paramInt1 = i;
          if (paramString.containsKey("togroup"))
          {
            paramInt1 = i;
            if ("0".equals(paramString.get("togroup")))
              paramInt1 = 1;
          }
        }
        paramString = new Intent();
        if (paramInt1 == 0)
          break label311;
      }
    label311: for (paramInt1 = 7; ; paramInt1 = 3)
    {
      paramString.putExtra("select_is_ret", true);
      paramString.putExtra("Select_Conv_Type", paramInt1);
      d.b(this, ".ui.transmit.SelectConversationUI", paramString, 1);
      AppMethodBeat.o(48309);
      while (true)
      {
        return bool;
        if ((paramm instanceof com.tencent.mm.plugin.wallet_index.c.h))
        {
          ab.i("MicroMsg.WalletSendC2CMsgUI", "Send c2c msg suc");
          if (this.gOW == 1)
            com.tencent.mm.ui.base.h.bQ(this, getString(2131305354));
          while (true)
          {
            finish();
            AppMethodBeat.o(48309);
            break;
            com.tencent.mm.ui.base.h.bQ(this, getString(2131300520));
            setResult(-1);
          }
          if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
          {
            ab.e("MicroMsg.WalletSendC2CMsgUI", "Check jsapi fail");
            setResult(-1000);
            finish();
            AppMethodBeat.o(48309);
          }
          else
          {
            if ((paramm instanceof com.tencent.mm.plugin.wallet_index.c.h))
            {
              if (this.gOW == 1)
                com.tencent.mm.ui.base.h.bQ(this, paramString);
              while (true)
              {
                finish();
                AppMethodBeat.o(48309);
                break;
                setResult(-1000);
              }
            }
            setResult(-1000);
            finish();
          }
        }
        else
        {
          AppMethodBeat.o(48309);
          bool = false;
        }
      }
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48310);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null)
    {
      ab.d("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
      if (paramInt1 != 1)
        break label215;
      if ((paramInt2 != -1) || (paramIntent == null))
        break label190;
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      ab.d("MicroMsg.WalletSendC2CMsgUI", "Select user , " + bo.nullAsNil(paramIntent));
      if (adk(paramIntent))
        break label182;
      ab.e("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
      setResult(-1000);
      finish();
      AppMethodBeat.o(48310);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
      break;
      label182: AppMethodBeat.o(48310);
      continue;
      label190: ab.e("MicroMsg.WalletSendC2CMsgUI", "cancel select contact fail");
      setResult(0);
      finish();
      AppMethodBeat.o(48310);
      continue;
      label215: ab.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, unknown requestCode = ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(48310);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48307);
    super.onCreate(paramBundle);
    AM(8);
    this.gOW = getIntent().getIntExtra("key_scene", 0);
    ab.i("MicroMsg.WalletSendC2CMsgUI", "scene:" + this.gOW);
    if (this.gOW == 0)
    {
      nf(580);
      if (getIntent() == null)
      {
        ab.e("MicroMsg.WalletSendC2CMsgUI", "func[doCheckPayNetscene] intent null");
        setResult(-1000);
        finish();
        AppMethodBeat.o(48307);
      }
    }
    while (true)
    {
      return;
      a(new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 6, "getSendC2CMessageRequest", getIntent().getIntExtra("pay_channel", 0)), true, false);
      AppMethodBeat.o(48307);
      continue;
      if (!adk(null))
      {
        ab.d("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
        setResult(-1000);
        finish();
        AppMethodBeat.o(48307);
      }
      else
      {
        AppMethodBeat.o(48307);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48308);
    super.onDestroy();
    ng(580);
    AppMethodBeat.o(48308);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletSendC2CMsgUI
 * JD-Core Version:    0.6.2
 */