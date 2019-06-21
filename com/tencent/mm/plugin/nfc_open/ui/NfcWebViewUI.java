package com.tencent.mm.plugin.nfc_open.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.nfc.a.c;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.protobuf.bel;
import com.tencent.mm.protocal.protobuf.nn;
import com.tencent.mm.protocal.protobuf.sz;
import com.tencent.mm.protocal.protobuf.ul;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NfcWebViewUI extends WebViewUI
{
  private String oTx;
  private boolean oTy;
  private com.tencent.mm.plugin.nfc_open.a.a oTz;

  public NfcWebViewUI()
  {
    AppMethodBeat.i(23072);
    this.oTx = null;
    this.oTy = false;
    this.oTz = new com.tencent.mm.plugin.nfc_open.a.a();
    AppMethodBeat.o(23072);
  }

  private static String Ah(int paramInt)
  {
    AppMethodBeat.i(23081);
    StringBuilder localStringBuilder = new StringBuilder("https://support.weixin.qq.com/security/readtemplate?t=bus_recharge/index_error");
    localStringBuilder.append("&type=").append(paramInt);
    String str;
    if ((!g.xyg) && (aa.dor().equals("zh_CN")))
      str = "zh_CN";
    while (true)
    {
      localStringBuilder.append("&lang=").append(str);
      str = localStringBuilder.toString();
      AppMethodBeat.o(23081);
      return str;
      if (aa.dop())
        str = "zh_TW";
      else
        str = "en";
    }
  }

  private String TG(String paramString)
  {
    AppMethodBeat.i(23083);
    ab.i("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl start");
    this.oTx = "";
    try
    {
      String[] arrayOfString = paramString.split(" ");
      if ((arrayOfString != null) && (arrayOfString.length > 1))
      {
        int i = 0;
        boolean bool1 = false;
        boolean bool2;
        while (true)
        {
          bool2 = bool1;
          if (i >= arrayOfString.length - 1)
            break;
          paramString = arrayOfString[i];
          String str = arrayOfString[(i + 1)];
          Object localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("nfc-getDebugNfcCardGuideUrl cmd = ");
          ab.d("MicroMsg.NfcWebViewUI", paramString + " anwser = " + str);
          localObject = new com/tencent/mm/plugin/nfc/a/a;
          ((com.tencent.mm.plugin.nfc.a.a)localObject).<init>(com.tencent.mm.plugin.nfc.c.a.hexStringToByteArray(paramString));
          bool1 = a((com.tencent.mm.plugin.nfc.a.a)localObject, str);
          bool2 = bool1;
          if (!bool1)
            break;
          i = i + 1 + 1;
        }
        if (bool2)
        {
          this.oTx = arrayOfString[(arrayOfString.length - 1)];
          paramString = new java/lang/StringBuilder;
          paramString.<init>("nfc-getDebugNfcCardGuideUrl tempurl = ");
          ab.d("MicroMsg.NfcWebViewUI", this.oTx);
          paramString = this.oTx;
          AppMethodBeat.o(23083);
          return paramString;
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NfcWebViewUI", paramString, "", new Object[0]);
        ab.e("MicroMsg.NfcWebViewUI", "[NFC] Debug get nfc card type exception!" + paramString.toString());
        ab.e("MicroMsg.NfcWebViewUI", "isConnect:".concat(String.valueOf(com.tencent.mm.plugin.nfc.b.a.a.bVz().eF(this.mController.ylL))));
        this.oTx = Ah(1);
        paramString = this.oTx;
        AppMethodBeat.o(23083);
        continue;
        paramString = this.oTx;
        AppMethodBeat.o(23083);
      }
    }
  }

  private String TH(String paramString)
  {
    AppMethodBeat.i(23084);
    ab.i("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl start");
    this.oTx = "";
    Object localObject1 = new bel();
    if (!bo.isNullOrNil(paramString));
    label598: label601: label604: 
    while (true)
    {
      try
      {
        ((bel)localObject1).parseFrom(paramString.getBytes("ISO-8859-1"));
        if (((bel)localObject1).wbW != null)
        {
          int i = 0;
          int j = 0;
          if (j < ((bel)localObject1).wbW.size())
          {
            paramString = (nn)((bel)localObject1).wbW.get(j);
            Object localObject2 = com.tencent.mm.plugin.nfc.b.a.a.bVz();
            if (((com.tencent.mm.plugin.nfc.b.a.a)localObject2).oTq != null)
              ((com.tencent.mm.plugin.nfc.b.a.a)localObject2).oTq.bVA();
            int k = i;
            if (paramString != null)
            {
              k = i;
              if (!bo.isNullOrNil(paramString.vzX))
              {
                k = i;
                if (!bo.ek(paramString.vRR))
                {
                  k = 0;
                  if (k < paramString.vRR.size())
                  {
                    if (bo.ek(((ul)paramString.vRR.get(k)).wbZ))
                      break label604;
                    m = 0;
                    if (m >= ((ul)paramString.vRR.get(k)).wbZ.size())
                      break label601;
                    if ((((ul)paramString.vRR.get(k)).wbZ.get(m) == null) || (bo.isNullOrNil(((sz)((ul)paramString.vRR.get(k)).wbZ.get(m)).wap)) || (bo.isNullOrNil(((sz)((ul)paramString.vRR.get(k)).wbZ.get(m)).nYb)))
                      break label598;
                    localObject2 = ((sz)((ul)paramString.vRR.get(k)).wbZ.get(m)).wap;
                    String str = ((sz)((ul)paramString.vRR.get(k)).wbZ.get(m)).nYb;
                    Object localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>("nfc-getCommonNfcCardGuideUrl cmd = ");
                    ab.d("MicroMsg.NfcWebViewUI", (String)localObject2 + " anwser = " + str);
                    localObject3 = new com/tencent/mm/plugin/nfc/a/a;
                    ((com.tencent.mm.plugin.nfc.a.a)localObject3).<init>(com.tencent.mm.plugin.nfc.c.a.hexStringToByteArray((String)localObject2));
                    if (a((com.tencent.mm.plugin.nfc.a.a)localObject3, str))
                    {
                      i = 1;
                      m++;
                      continue;
                    }
                    i = 0;
                    m = i;
                    if (i != 0)
                      continue;
                    k++;
                    continue;
                  }
                  int m = i;
                  k = m;
                  if (m != 0)
                  {
                    localObject2 = paramString.vzX;
                    ab.i("MicroMsg.NfcWebViewUI", "doCardTypeReport start");
                    localObject1 = new com/tencent/mm/plugin/nfc_open/ui/NfcWebViewUI$2;
                    ((NfcWebViewUI.2)localObject1).<init>(this, (String)localObject2);
                    com.tencent.mm.sdk.g.d.post((Runnable)localObject1, getClass().getName());
                    paramString = paramString.vzX;
                    AppMethodBeat.o(23084);
                    return paramString;
                  }
                }
              }
            }
            i = k;
            j++;
            continue;
          }
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.NfcWebViewUI", paramString, "", new Object[0]);
        ab.e("MicroMsg.NfcWebViewUI", "[NFC] Common get nfc card type exception!" + paramString.toString());
        ab.e("MicroMsg.NfcWebViewUI", "isConnect:".concat(String.valueOf(com.tencent.mm.plugin.nfc.b.a.a.bVz().eF(this.mController.ylL))));
        this.oTx = Ah(1);
        paramString = this.oTx;
        AppMethodBeat.o(23084);
        continue;
      }
      paramString = this.oTx;
      AppMethodBeat.o(23084);
      continue;
      continue;
    }
  }

  private void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    AppMethodBeat.i(23078);
    switch (NfcWebViewUI.3.jDI[parama.ordinal()])
    {
    default:
      finish();
      AppMethodBeat.o(23078);
      return;
    case 1:
    }
    parama = w.p(paramIntent, "android.nfc.extra.TAG");
    if ((parama != null) && ((parama instanceof Tag)));
    for (parama = (Tag)parama; ; parama = null)
    {
      while (true)
      {
        if (parama == null)
        {
          ab.e("MicroMsg.NfcWebViewUI", "[NFC]tag is null");
          AppMethodBeat.o(23078);
          break;
        }
        try
        {
          com.tencent.mm.plugin.nfc.b.a.a.bVz().a(parama);
          ab.i("MicroMsg.NfcWebViewUI", "[NFC] connect status : ".concat(String.valueOf(com.tencent.mm.plugin.nfc.b.a.a.bVz().eG(this.mController.ylL))));
          AppMethodBeat.o(23078);
        }
        catch (Exception parama)
        {
          ab.e("MicroMsg.NfcWebViewUI", "exp protect");
          AppMethodBeat.o(23078);
        }
      }
      break;
    }
  }

  private static boolean a(com.tencent.mm.plugin.nfc.a.a parama, String paramString)
  {
    AppMethodBeat.i(23085);
    ab.i("MicroMsg.NfcWebViewUI", "nfc-doCmd start");
    boolean bool;
    if (ft(paramString, com.tencent.mm.plugin.nfc.b.a.a.bVz().a(parama).toString()))
    {
      bool = true;
      AppMethodBeat.o(23085);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23085);
    }
  }

  private static boolean ak(Intent paramIntent)
  {
    AppMethodBeat.i(23089);
    boolean bool;
    if (paramIntent == null)
    {
      ab.e("MicroMsg.NfcWebViewUI", "intent is null");
      AppMethodBeat.o(23089);
      bool = true;
    }
    while (true)
    {
      return bool;
      Object localObject = paramIntent.getExtras();
      try
      {
        localObject = ((Bundle)localObject).keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if ((str != null) && (!str.startsWith("android.nfc")))
          {
            ab.e("MicroMsg.NfcWebViewUI", "extra wrong key = ".concat(String.valueOf(str)));
            ((Iterator)localObject).remove();
          }
        }
      }
      catch (Exception paramIntent)
      {
        ab.e("MicroMsg.NfcWebViewUI", "judgeIllegalCall e:%s", new Object[] { paramIntent });
        AppMethodBeat.o(23089);
        bool = true;
      }
    }
    paramIntent = w.p(paramIntent, "android.nfc.extra.TAG");
    if ((paramIntent != null) && ((paramIntent instanceof Tag)));
    for (paramIntent = (Tag)paramIntent; ; paramIntent = null)
    {
      if (paramIntent == null)
      {
        ab.e("MicroMsg.NfcWebViewUI", "tag is null");
        AppMethodBeat.o(23089);
        bool = true;
        break;
      }
      AppMethodBeat.o(23089);
      bool = false;
      break;
    }
  }

  private boolean bVD()
  {
    boolean bool = true;
    AppMethodBeat.i(23077);
    try
    {
      if (this.icy.cZp())
      {
        ab.w("MicroMsg.NfcWebViewUI", "not login");
        Intent localIntent = new android/content/Intent;
        localIntent.<init>(this, getClass());
        localIntent.putExtras(getIntent());
        localIntent.addFlags(67108864);
        this.icy.aB(localIntent);
        AppMethodBeat.o(23077);
        return bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(23077);
        continue;
        AppMethodBeat.o(23077);
        bool = false;
      }
    }
  }

  private boolean bVE()
  {
    AppMethodBeat.i(23080);
    boolean bool = this.cOG.startsWith("https://support.weixin.qq.com/security/readtemplate?t=bus_recharge/index_error");
    AppMethodBeat.o(23080);
    return bool;
  }

  private String bVF()
  {
    Object localObject1 = null;
    String str = null;
    AppMethodBeat.i(23082);
    ab.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl start");
    try
    {
      Object localObject2 = this.icy.g(4006, null);
      if (localObject2 == null)
      {
        ab.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl data is null");
        AppMethodBeat.o(23082);
        localObject1 = str;
        return localObject1;
      }
      ((Bundle)localObject2).setClassLoader(getClass().getClassLoader());
      str = ((Bundle)localObject2).getString("debugConfig");
      localObject2 = ((Bundle)localObject2).getString("config");
      if (str != null)
        str = TG(str);
      for (localObject1 = str; ; localObject1 = str)
      {
        ab.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl targetUrl=" + bo.nullAsNil(localObject1));
        AppMethodBeat.o(23082);
        break;
        str = TH((String)localObject2);
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.NfcWebViewUI", localRemoteException.toString());
        ab.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
      }
    }
  }

  private void bVG()
  {
    AppMethodBeat.i(23088);
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    com.tencent.mm.bp.d.f(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    finish();
    overridePendingTransition(2131034130, 2131034221);
    ab.i("MicroMsg.NfcWebViewUI", "lo-nfc-setBackBtn:back click after login");
    AppMethodBeat.o(23088);
  }

  private static boolean ft(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(23086);
    if (bo.isNullOrNil(paramString2))
      AppMethodBeat.o(23086);
    while (true)
    {
      return bool;
      ab.d("MicroMsg.NfcWebViewUI", "nfc-judge mAnwser = " + bo.nullAsNil(paramString1) + " resp = " + bo.nullAsNil(paramString2));
      if (Pattern.compile(paramString1, 2).matcher(paramString2).find())
      {
        bool = true;
        AppMethodBeat.o(23086);
      }
      else
      {
        AppMethodBeat.o(23086);
      }
    }
  }

  public final void aMh()
  {
    AppMethodBeat.i(23075);
    if (bVD())
    {
      finish();
      ab.w("MicroMsg.NfcWebViewUI", "not login, go to SimpleLogin");
      AppMethodBeat.o(23075);
    }
    while (true)
    {
      return;
      super.aMh();
      a(AutoLoginActivity.a.vgJ, getIntent());
      AppMethodBeat.o(23075);
    }
  }

  public final void jD(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(23079);
    if (this.icy == null)
    {
      ab.e("MicroMsg.NfcWebViewUI", "[NFC] invoker is null");
      AppMethodBeat.o(23079);
      return;
    }
    a(AutoLoginActivity.a.vgJ, getIntent());
    Object localObject1 = bVF();
    if ((paramBoolean) && (!bo.isNullOrNil(this.cOG)))
      if (bVE())
        if (bo.isNullOrNil((String)localObject1))
          ab.e("MicroMsg.NfcWebViewUI", "[NFC] carGuideUrl not found! not support this card ?");
    while (true)
    {
      while (true)
      {
        if (bo.isNullOrNil(this.cOG))
        {
          this.cOG = Ah(0);
          ab.e("MicroMsg.NfcWebViewUI", "[NFC] url not found! not support this card ?");
        }
        getIntent().putExtra("rawUrl", this.cOG);
        AppMethodBeat.o(23079);
        break;
        ab.i("MicroMsg.NfcWebViewUI", "alvinluo [NFC] cardGuideUrl: %s", new Object[] { localObject1 });
        this.cOG = ((String)localObject1);
        getIntent().putExtra("rawUrl", this.cOG);
        as(this.cOG, false);
        continue;
        try
        {
          paramBoolean = bo.isNullOrNil((String)localObject1);
          if (!paramBoolean);
          while (true)
          {
            try
            {
              localObject1 = Uri.parse((String)localObject1);
              Object localObject2 = Uri.parse(this.cOG);
              localObject1 = ((Uri)localObject1).getHost();
              String str = ((Uri)localObject2).getHost();
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("targetHost=");
              ab.i("MicroMsg.NfcWebViewUI", (String)localObject1 + ", curHost=" + str);
              paramBoolean = ((String)localObject1).equals(str);
              if (paramBoolean)
              {
                if (i != 0)
                {
                  localObject2 = this.umI;
                  localObject1 = new android/os/Bundle;
                  ((Bundle)localObject1).<init>();
                  ((e)localObject2).c(4007, (Bundle)localObject1);
                }
                ab.i("MicroMsg.NfcWebViewUI", "[NFC]new intent not guide the page");
                AppMethodBeat.o(23079);
              }
            }
            catch (Exception localException)
            {
            }
            i = 0;
          }
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
        }
      }
      this.cOG = localRemoteException;
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(23087);
    if (this.oTy)
    {
      bVG();
      AppMethodBeat.o(23087);
    }
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(23087);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23073);
    Intent localIntent = getIntent();
    if (ak(localIntent))
      ab.e("MicroMsg.NfcWebViewUI", "onCreate judgeIllegalCall finish");
    try
    {
      localIntent.putExtra("key_trust_url", false);
      label35: super.onCreate(paramBundle);
      finish();
      AppMethodBeat.o(23073);
      while (true)
      {
        return;
        localIntent.putExtra("key_trust_url", false);
        super.onCreate(paramBundle);
        com.tencent.mm.sdk.b.a.xxA.c(this.oTz);
        com.tencent.mm.bp.d.dlL();
        ab.i("MicroMsg.NfcWebViewUI", "onCreate, intent action = " + localIntent.getAction());
        setBackBtn(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            AppMethodBeat.i(23069);
            if (NfcWebViewUI.a(NfcWebViewUI.this))
              NfcWebViewUI.b(NfcWebViewUI.this);
            while (true)
            {
              AppMethodBeat.o(23069);
              return true;
              NfcWebViewUI.this.finish();
            }
          }
        });
        getIntent().putExtra("showShare", false);
        nO(false);
        AppMethodBeat.o(23073);
      }
    }
    catch (Exception localException)
    {
      break label35;
    }
  }

  @TargetApi(11)
  public void onDestroy()
  {
    AppMethodBeat.i(23074);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.oTz);
    AppMethodBeat.o(23074);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(23076);
    if (ak(paramIntent))
    {
      ab.e("MicroMsg.NfcWebViewUI", "onNewIntent judgeIllegalCall finish");
      AppMethodBeat.o(23076);
    }
    while (true)
    {
      return;
      paramIntent.putExtra("key_trust_url", false);
      super.onNewIntent(paramIntent);
      setIntent(paramIntent);
      int i = w.a(paramIntent, "wizard_activity_result_code", 2147483647);
      ab.i("MicroMsg.NfcWebViewUI", "onNewIntent, resultCode = ".concat(String.valueOf(i)));
      if (i != 2147483647)
        this.oTy = true;
      switch (i)
      {
      default:
      case -1:
      case 1:
        while (true)
        {
          jD(true);
          ab.i("Foreground dispatch", "Discovered tag with intent: ".concat(String.valueOf(paramIntent)));
          AppMethodBeat.o(23076);
          break;
          a(AutoLoginActivity.a.vgJ, paramIntent);
          continue;
          a(AutoLoginActivity.a.vgL, paramIntent);
        }
      case 0:
      }
      bVD();
      AppMethodBeat.o(23076);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI
 * JD-Core Version:    0.6.2
 */