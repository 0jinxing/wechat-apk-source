package com.tencent.mm.plugin.u.a;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.ll;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.g.a.y;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.service.f;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.scanner.a.s;
import com.tencent.mm.plugin.scanner.ui.ProductUI;
import com.tencent.mm.plugin.scanner.ui.VcardContactUI;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.plugin.scanner.util.r.a;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.protocal.protobuf.ado;
import com.tencent.mm.protocal.protobuf.adp;
import com.tencent.mm.protocal.protobuf.atp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public final class c
{
  private static final SparseIntArray pAw;
  private static final SparseIntArray pAx;
  private static final SparseIntArray pAy;

  static
  {
    AppMethodBeat.i(80769);
    pAw = new c.5();
    pAx = new c.6();
    pAy = new c.7();
    AppMethodBeat.o(80769);
  }

  protected static int Bx(int paramInt)
  {
    if ((paramInt == 30) || (paramInt == 37) || (paramInt == 38) || (paramInt == 40))
      paramInt = 13;
    while (true)
    {
      return paramInt;
      if ((paramInt == 4) || (paramInt == 47))
        paramInt = 12;
      else if (paramInt == 34)
        paramInt = 24;
      else
        paramInt = 0;
    }
  }

  private static void a(c.a parama, int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(80768);
    ab.d("MicroMsg.scanner.GetA8KeyRedirect", "actionCode = %s, url = %s", new Object[] { Integer.valueOf(paramInt1), paramString });
    he localhe = new he();
    localhe.cBW.actionCode = paramInt1;
    localhe.cBW.result = paramString;
    localhe.cBW.context = parama.getContext();
    paramString = new Bundle();
    paramString.putInt("pay_channel", paramInt2);
    localhe.cBW.cBY = paramString;
    localhe.callback = new c.4(parama, localhe);
    com.tencent.mm.sdk.b.a.xxA.a(localhe, Looper.myLooper());
    AppMethodBeat.o(80768);
  }

  public static boolean a(c.a parama, com.tencent.mm.modelsimple.h paramh, DialogInterface.OnClickListener paramOnClickListener, String paramString, int paramInt1, int paramInt2, Runnable paramRunnable, Bundle paramBundle)
  {
    AppMethodBeat.i(80767);
    boolean bool;
    if (parama.getContext() == null)
    {
      ab.e("MicroMsg.scanner.GetA8KeyRedirect", "handleGetA8KeyRedirect, null redirectContext");
      bool = false;
      AppMethodBeat.o(80767);
    }
    int i;
    int j;
    Intent localIntent;
    while (true)
    {
      return bool;
      i = paramh.aiV();
      j = ((ado)paramh.ehh.fsG.fsP).vXI;
      ab.i("MicroMsg.scanner.GetA8KeyRedirect", "actionCode : %s, codeType : %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      ab.i("MicroMsg.scanner.GetA8KeyRedirect", "source=".concat(String.valueOf(paramInt1)));
      localIntent = new Intent();
      localIntent.putExtra("geta8key_scene", paramInt1);
      localIntent.putExtra("KPublisherId", "qrcode");
      localIntent.putExtra("prePublishId", "qrcode");
      i.Lt(Bx(paramInt1));
      switch (i)
      {
      case 5:
      case 13:
      case 19:
      case 27:
      case 28:
      case 29:
      default:
        ab.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-not_catch: action code = " + paramh.aiV());
        bool = false;
        AppMethodBeat.o(80767);
      case 1:
      case 2:
      case 7:
      case 30:
      case 6:
      case 4:
      case 3:
      case 8:
      case 22:
      case 9:
      case 10:
      case 11:
      case 12:
      case 15:
      case 14:
      case 21:
      case 16:
      case 18:
      case 25:
      case 17:
      case 20:
      case 24:
      case 23:
      case 26:
      }
    }
    ab.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-text: " + paramh.getContent());
    localIntent.putExtra("data", paramh.getContent());
    localIntent.putExtra("showShare", false);
    if (paramInt2 == 2)
      localIntent.putExtra("stastic_scene", 13);
    while (true)
    {
      localIntent.putExtra("pay_channel", Bx(paramInt1));
      localIntent.putExtra("geta8key_session_id", paramh.ajb());
      com.tencent.mm.plugin.scanner.c.gkE.i(localIntent, parama.getContext());
      new ak(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      if (paramInt2 == 1)
        localIntent.putExtra("stastic_scene", 14);
      else
        localIntent.putExtra("stastic_scene", 11);
    }
    ab.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-webview: " + paramh.aiT());
    paramBundle = parama.getContext();
    paramRunnable = parama.getContext();
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      com.tencent.mm.ui.base.h.a(paramBundle, paramRunnable.getString(2131302089, new Object[] { paramString }), parama.getContext().getString(2131297061), new c.1(localIntent, paramh, paramInt2, paramInt1, parama), paramOnClickListener);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      paramString = paramh.aiT();
    }
    ab.i("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-webview_no_notice: reqUrl : %s,  fullUrl : %s, shareUrl : %s", new Object[] { paramh.aiU(), paramh.aiT(), paramh.aiX() });
    localIntent.putExtra("title", paramh.getTitle());
    localIntent.putExtra("rawUrl", paramh.aiT());
    localIntent.putExtra("k_share_url", paramh.aiX());
    if (paramInt2 == 2)
    {
      localIntent.putExtra("stastic_scene", 13);
      ab.i("MicroMsg.scanner.GetA8KeyRedirect", "start webview with channel : ".concat(String.valueOf(Bx(paramInt1))));
      localIntent.putExtra("pay_channel", Bx(paramInt1));
      localIntent.putExtra("geta8key_session_id", paramh.ajb());
      localIntent.putExtra("geta8key_cookie", paramh.ajc());
      paramh = paramh.aja();
      if (bo.ek(paramh))
        break label997;
      paramOnClickListener = paramh.iterator();
      while (paramOnClickListener.hasNext())
      {
        paramBundle = (atp)paramOnClickListener.next();
        if ((paramBundle == null) || (bo.isNullOrNil(paramBundle.vMU)) || (bo.isNullOrNil(paramBundle.pXM)))
          ab.e("MicroMsg.scanner.GetA8KeyRedirect", "http header has null value");
      }
    }
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      while (true)
      {
        if (paramInt1 == 0)
        {
          String[] arrayOfString = new String[paramh.size()];
          paramBundle = new String[paramh.size()];
          paramInt1 = 0;
          while (true)
            if (paramInt1 < paramh.size())
            {
              Object localObject = (atp)paramh.get(paramInt1);
              paramOnClickListener = ((atp)localObject).vMU;
              localObject = ((atp)localObject).pXM;
              ab.i("MicroMsg.scanner.GetA8KeyRedirect", "http header index = %d, key = %s, value = %s", new Object[] { Integer.valueOf(paramInt1), paramOnClickListener, localObject });
              arrayOfString[paramInt1] = paramOnClickListener;
              paramBundle[paramInt1] = localObject;
              paramInt1++;
              continue;
              if (paramInt2 == 1)
              {
                localIntent.putExtra("stastic_scene", 14);
                break;
              }
              localIntent.putExtra("stastic_scene", 11);
              break;
            }
          localIntent.putExtra("geta8key_result_http_header_key_list", arrayOfString);
          localIntent.putExtra("geta8key_result_http_header_value_list", paramBundle);
          localIntent.putExtra("k_has_http_header", true);
        }
        label997: if ((i == 30) && (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIb, 0) == 1))
        {
          localIntent.putExtra("auth_raw_url", paramString);
          localIntent.putExtra("auth_from_scan", true);
          d.b(parama.getContext(), "webview", ".ui.tools.SDKOAuthUI", localIntent);
          new ak(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
          bool = true;
          AppMethodBeat.o(80767);
          break;
        }
        com.tencent.mm.plugin.scanner.c.gkE.i(localIntent, parama.getContext());
        new ak(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
        bool = true;
        AppMethodBeat.o(80767);
        break;
        ab.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-special_webview: " + paramh.aiT());
        localIntent.putExtra("rawUrl", paramh.aiT());
        localIntent.putExtra("pay_channel", Bx(paramInt1));
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("show_bottom", false);
        localIntent.putExtra("isWebwx", false);
        localIntent.putExtra("geta8key_session_id", paramh.ajb());
        localIntent.putExtra("geta8key_cookie", paramh.ajc());
        com.tencent.mm.plugin.scanner.c.gkE.i(localIntent, parama.getContext());
        bool = true;
        AppMethodBeat.o(80767);
        break;
        bool = false;
        AppMethodBeat.o(80767);
        break;
        paramString = paramh.aiT();
        ab.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-app: ".concat(String.valueOf(paramString)));
        if ((paramString == null) || (paramString.length() == 0))
        {
          ab.e("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-app, fullUrl is null");
          bool = false;
          AppMethodBeat.o(80767);
          break;
        }
        paramh = parama.getContext().getString(2131302088);
        if (paramString.startsWith("http"))
          paramh = parama.getContext().getString(2131302089, new Object[] { paramString });
        paramString = Uri.parse(paramString);
        if (paramString != null)
        {
          paramString = new Intent("android.intent.action.VIEW", paramString);
          paramString.addFlags(268435456);
          if (bo.k(parama.getContext(), paramString))
          {
            com.tencent.mm.ui.base.h.a(parama.getContext(), paramh, parama.getContext().getString(2131297061), false, new c.2(parama, paramString), paramOnClickListener);
            bool = true;
            AppMethodBeat.o(80767);
            break;
          }
        }
        bool = false;
        AppMethodBeat.o(80767);
        break;
        paramh = paramh.getContent();
        ab.d("MicroMsg.scanner.GetA8KeyRedirect", "get vcard from server: ".concat(String.valueOf(paramh)));
        if (!bo.isNullOrNil(paramh))
          paramString = new s();
        try
        {
          paramString.We(paramh);
          paramString = new android/content/Intent;
          paramString.<init>(parama.getContext(), VcardContactUI.class);
          parama.getContext().startActivity(paramString);
          parama.jZ(false);
          bool = true;
          AppMethodBeat.o(80767);
        }
        catch (XmlPullParserException paramString)
        {
          ab.e("MicroMsg.scanner.GetA8KeyRedirect", "parser vcardxml err: " + paramString.getMessage() + " " + paramh);
          ab.printErrStackTrace("MicroMsg.scanner.GetA8KeyRedirect", paramString, "", new Object[0]);
          com.tencent.mm.ui.base.h.a(parama.getContext(), parama.getContext().getString(2131302098), parama.getContext().getString(2131297061), false, paramOnClickListener);
          bool = true;
          AppMethodBeat.o(80767);
        }
        catch (IOException paramString)
        {
          while (true)
          {
            ab.e("MicroMsg.scanner.GetA8KeyRedirect", "parser vcardxml err: " + paramString.getMessage() + " " + paramh);
            ab.printErrStackTrace("MicroMsg.scanner.GetA8KeyRedirect", paramString, "", new Object[0]);
          }
        }
      }
      ab.d("MicroMsg.scanner.GetA8KeyRedirect", "ftf pay url:" + paramh.aiT());
      com.tencent.mm.pluginsdk.wallet.h.a(parama.getContext(), 1, paramh.aiT(), Bx(paramInt1), null);
      new ak(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      paramOnClickListener = new Bundle();
      paramOnClickListener.putInt("key_scene", 5);
      bool = com.tencent.mm.plugin.scanner.c.gkE.b(parama.getContext(), paramh.aiT(), paramOnClickListener);
      AppMethodBeat.o(80767);
      break;
      a(parama, i, paramh.aiT(), Bx(paramInt1));
      new ak(Looper.getMainLooper()).postDelayed(paramRunnable, 200L);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      a(parama, i, paramh.aiT(), Bx(paramInt1));
      bool = true;
      AppMethodBeat.o(80767);
      break;
      paramOnClickListener = paramh.aiT();
      paramh = paramOnClickListener;
      if (paramOnClickListener != null)
        paramh = paramOnClickListener.replace("wxpd://", "");
      paramOnClickListener = new Intent();
      paramOnClickListener.putExtra("key_product_id", paramh);
      paramOnClickListener.putExtra("key_product_scene", 7);
      d.b(parama.getContext(), "product", ".ui.MallProductUI", paramOnClickListener);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      paramOnClickListener = new Intent();
      paramOnClickListener.setClass(parama.getContext(), ProductUI.class);
      paramOnClickListener.putExtra("key_ProductUI_getProductInfoScene", 5);
      paramOnClickListener.putExtra("key_Qrcode_Url", paramh.aiT());
      parama.getContext().startActivity(paramOnClickListener);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      paramOnClickListener = paramh.aiT();
      paramh = new Intent().setClassName(ah.getContext(), "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.BakchatPcUsbService");
      parama = bo.I(ah.getContext(), paramh);
      if (parama != null);
      while (true)
      {
        d.aH(parama.putExtra("url", paramOnClickListener).putExtra("isFromWifi", true));
        ab.d("MicroMsg.scanner.GetA8KeyRedirect", "GET_CONNECT_INFO start end");
        bool = true;
        AppMethodBeat.o(80767);
        break;
        parama = paramh;
      }
      paramh = r.Wt(paramh.aiT());
      if (paramh == null)
        ab.e("MicroMsg.scanner.GetA8KeyRedirect", "item == null");
      while (true)
      {
        bool = false;
        AppMethodBeat.o(80767);
        break;
        if (r.sP(paramh.iAd))
          break label2180;
        r.aQ(parama.getContext(), parama.getContext().getString(2131297936));
      }
      label2180: paramOnClickListener = new Intent();
      paramOnClickListener.putExtra("key_card_id", paramh.kbU);
      paramOnClickListener.putExtra("key_card_ext", paramh.cMD);
      paramOnClickListener.putExtra("key_from_scene", 0);
      if (paramInt2 == 2)
        paramOnClickListener.putExtra("key_stastic_scene", 13);
      while (true)
      {
        d.b(parama.getContext(), "card", ".ui.CardDetailUI", paramOnClickListener);
        ab.d("MicroMsg.scanner.GetA8KeyRedirect", "MMSCAN_QRCODE_CARD start end");
        break;
        if (paramInt2 == 1)
          paramOnClickListener.putExtra("key_stastic_scene", 14);
        else
          paramOnClickListener.putExtra("key_stastic_scene", 11);
      }
      paramh = paramh.aiT();
      paramOnClickListener = r.Wu(paramh);
      if ((paramOnClickListener == null) || (paramOnClickListener.size() == 0))
        ab.e("MicroMsg.scanner.GetA8KeyRedirect", "list == null || list.size() == 0");
      while (true)
      {
        bool = false;
        AppMethodBeat.o(80767);
        break;
        if (r.Q(paramOnClickListener))
          break label2367;
        r.aQ(parama.getContext(), parama.getContext().getString(2131297936));
      }
      label2367: paramOnClickListener = new Intent();
      paramOnClickListener.putExtra("key_from_scene", 0);
      paramOnClickListener.putExtra("src_username", "");
      paramOnClickListener.putExtra("js_url", "");
      paramOnClickListener.putExtra("key_in_card_list", paramh);
      if (paramInt2 == 2)
        paramOnClickListener.putExtra("key_stastic_scene", 13);
      while (true)
      {
        d.b(parama.getContext(), "card", ".ui.CardAddEntranceUI", paramOnClickListener);
        ab.d("MicroMsg.scanner.GetA8KeyRedirect", "MMSCAN_QRCODE_MULTIPLE_CARD start end");
        break;
        if (paramInt2 == 1)
          paramOnClickListener.putExtra("key_stastic_scene", 14);
        else
          paramOnClickListener.putExtra("key_stastic_scene", 11);
      }
      paramRunnable = new Intent();
      paramRunnable.putExtra("free_wifi_url", paramh.aiT());
      paramString = (adp)paramh.ehh.fsH.fsP;
      if ((paramString == null) || (paramString.vAI == null))
      {
        ab.e("MicroMsg.NetSceneGetA8Key", "get mid failed");
        paramString = null;
        label2548: paramRunnable.putExtra("free_wifi_mid", paramString);
        paramString = (adp)paramh.ehh.fsH.fsP;
        if ((paramString != null) && (paramString.SSID != null))
          break label2695;
        ab.e("MicroMsg.NetSceneGetA8Key", "get ssid failed");
        paramString = null;
        label2594: paramRunnable.putExtra("free_wifi_ssid", paramString);
        paramRunnable.putExtra("free_wifi_source", 1);
        paramRunnable.putExtra("free_wifi_ap_key", paramh.aiT());
        if (g.RP().Ry().get(303104, null) == null)
          break label2703;
        com.tencent.mm.ui.base.h.a(parama.getContext(), 2131300042, 2131297061, 2131296874, 2131296868, new c.3(parama, paramRunnable), paramOnClickListener);
      }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(80767);
        break;
        paramString = paramString.vAI;
        break label2548;
        label2695: paramString = paramString.SSID;
        break label2594;
        label2703: d.b(parama.getContext(), "freewifi", ".ui.FreeWifiEntryUI", paramRunnable);
        parama.jZ(false);
      }
      ab.d("MicroMsg.scanner.GetA8KeyRedirect", "getA8key-emoticon full url: " + paramh.aiT());
      parama = new com.tencent.mm.ao.c(paramh.aiT());
      g.Rg().a(parama, 0);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      parama = new pt();
      parama.cLX.cLY = paramString;
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      bool = true;
      AppMethodBeat.o(80767);
      break;
      paramh = paramh.aiT();
      if (bo.isNullOrNil(paramh))
      {
        ab.e("MicroMsg.scanner.GetA8KeyRedirect", "onStartCommand url is null");
        bool = true;
        AppMethodBeat.o(80767);
        break;
      }
      ab.i("MicroMsg.scanner.GetA8KeyRedirect", "summerbak start url, url:%s", new Object[] { paramh });
      parama = new y();
      parama.csT.url = paramh;
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      ab.i("MicroMsg.scanner.GetA8KeyRedirect", "publish BackupGetA8keyRedirectEvent");
      bool = true;
      AppMethodBeat.o(80767);
      break;
      paramOnClickListener = paramh.aiT();
      ab.i("MicroMsg.scanner.GetA8KeyRedirect", "fullURL: ".concat(String.valueOf(paramOnClickListener)));
      paramString = parama.getContext();
      ab.i("MicroMsg.scanner.GetA8KeyRedirect", "processAppBrandFullURL, fullURL: ".concat(String.valueOf(paramOnClickListener)));
      paramRunnable = Uri.parse(paramOnClickListener);
      if ((paramRunnable.getQueryParameter("search_query") != null) && (paramRunnable.getQueryParameter("search_query").length() > 0))
      {
        paramh = paramRunnable.getQueryParameter("search_query");
        paramBundle = paramRunnable.getQueryParameter("appid");
        paramString = paramRunnable.getQueryParameter("search_extInfo");
        paramInt2 = bo.getInt(paramRunnable.getQueryParameter("debug"), 0);
        paramInt1 = bo.getInt(paramRunnable.getQueryParameter("version"), 0);
        paramRunnable = new ll();
        paramRunnable.cHk.scene = 1;
        paramRunnable.cHk.appId = paramBundle;
        paramRunnable.cHk.type = paramInt2;
        paramRunnable.cHk.version = paramInt1;
        paramRunnable.cHk.cHl = paramh;
        paramRunnable.cHk.url = paramOnClickListener;
        paramRunnable.cHk.cHm = paramString;
        com.tencent.mm.sdk.b.a.xxA.m(paramRunnable);
        paramString = aa.cVd();
        paramString.putExtra("ftsbizscene", 99999);
        paramString.putExtra("ftsQuery", paramh);
        paramString.putExtra("ftsqrcodestring", paramOnClickListener);
        paramOnClickListener = aa.d(300, false, 262144);
        paramOnClickListener.put("query", paramh);
        paramh = aa.HP(bo.ank((String)paramOnClickListener.get("scene")));
        paramOnClickListener.put("sessionid", paramh);
        paramString.putExtra("rawUrl", aa.E(paramOnClickListener));
        paramString.putExtra("key_session_id", paramh);
        d.b(ah.getContext(), "webview", ".ui.tools.fts.FTSWebViewUI", paramString);
        parama.jZ(false);
        bool = true;
        AppMethodBeat.o(80767);
        break;
      }
      if (bo.getInt(paramRunnable.getQueryParameter("qr_type4wxa"), 0) == 2)
        paramh = pAy;
      while (true)
      {
        paramInt1 = paramh.get(paramInt2);
        ((f)g.K(f.class)).b(paramString, paramOnClickListener, paramInt1, paramBundle);
        break;
        switch (j)
        {
        default:
          paramh = pAw;
          break;
        case 22:
          paramh = pAx;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.c
 * JD-Core Version:    0.6.2
 */