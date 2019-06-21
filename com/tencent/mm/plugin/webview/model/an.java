package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.normsg.a.b;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.webview.modelcache.q;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.f;
import com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class an
{
  private Context mContext;
  private int umA;
  public ArrayList<String> umB;
  public ArrayList<String> umC;
  public List<Integer> umD;
  public final Map<String, Boolean> umE;
  public final Set<String> umF;
  private String umG;

  public an(Context paramContext)
  {
    AppMethodBeat.i(6739);
    this.umA = -1;
    this.umG = null;
    this.mContext = paramContext;
    this.umD = new ArrayList();
    this.umE = new HashMap();
    this.umF = new HashSet();
    this.umB = new ArrayList();
    this.umC = new ArrayList();
    AppMethodBeat.o(6739);
  }

  private boolean b(String paramString, com.tencent.mm.plugin.webview.stub.d paramd)
  {
    AppMethodBeat.i(6741);
    Object localObject1;
    boolean bool;
    if (this.umA == -1)
    {
      try
      {
        paramd = paramd.g(31, null);
        if (paramd != null)
        {
          this.umA = paramd.getInt("webview_ad_intercept_control_flag");
          this.umB = paramd.getStringArrayList("webview_ad_intercept_whitelist_domins");
          this.umC = paramd.getStringArrayList("webview_ad_intercept_blacklist_domins");
          paramd = new java/lang/StringBuilder;
          paramd.<init>();
          paramd.append("white domain list :\n");
          localObject1 = this.umB.iterator();
          while (((Iterator)localObject1).hasNext())
            paramd.append((String)((Iterator)localObject1).next()).append("\n");
        }
      }
      catch (Exception paramd)
      {
        ab.e("MicroMsg.WebViewResourceInterrupter", "get ad domain failed : %s", new Object[] { paramd.getMessage() });
        this.umA = 0;
      }
    }
    else
    {
      if (this.umA != 0)
        break label213;
      AppMethodBeat.o(6741);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramd.append("black list domain list : \n");
      localObject1 = this.umC.iterator();
      while (((Iterator)localObject1).hasNext())
        paramd.append((String)((Iterator)localObject1).next()).append("\n");
      ab.i("MicroMsg.WebViewResourceInterrupter", paramd.toString());
      break;
      label213: paramd = Uri.parse(paramString).getHost();
      ab.d("MicroMsg.WebViewResourceInterrupter", "check has verified this domain : %s, is in black list = %b", new Object[] { paramd, this.umE.get(paramd) });
      if (bo.isNullOrNil(paramd))
      {
        AppMethodBeat.o(6741);
        bool = false;
      }
      else if (this.umE.containsKey(paramd))
      {
        bool = ((Boolean)this.umE.get(paramd)).booleanValue();
        AppMethodBeat.o(6741);
      }
      else
      {
        Object localObject2;
        if ((this.umB != null) && (this.umB.size() > 0))
        {
          localObject1 = this.umB.iterator();
          while (true)
            if (((Iterator)localObject1).hasNext())
            {
              localObject2 = (String)((Iterator)localObject1).next();
              if ((!bo.isNullOrNil((String)localObject2)) && (paramd.contains((CharSequence)localObject2)))
              {
                this.umE.put(paramd, Boolean.FALSE);
                ab.i("MicroMsg.WebViewResourceInterrupter", "white list, ignore check the url");
                AppMethodBeat.o(6741);
                bool = false;
                break;
              }
            }
        }
        if ((this.umC != null) && (this.umC.size() > 0))
        {
          localObject2 = this.umC.iterator();
          while (true)
            if (((Iterator)localObject2).hasNext())
            {
              localObject1 = (String)((Iterator)localObject2).next();
              if ((!bo.isNullOrNil((String)localObject1)) && (paramd.contains((CharSequence)localObject1)))
              {
                if (this.umA == 1)
                {
                  this.umE.put(paramd, Boolean.TRUE);
                  ab.e("MicroMsg.WebViewResourceInterrupter", "black list, should stop the request, domain = %s, url = %s", new Object[] { localObject1, paramString });
                  AppMethodBeat.o(6741);
                  bool = true;
                  break;
                }
                if (this.umA == 2)
                {
                  ab.i("MicroMsg.WebViewResourceInterrupter", "black list, just get html content and report, domain = %s, url = %s", new Object[] { localObject1, paramString });
                  this.umF.add(paramd);
                  this.umE.put(paramd, Boolean.FALSE);
                  AppMethodBeat.o(6741);
                  bool = false;
                  break;
                }
              }
            }
        }
        this.umE.put(paramd, Boolean.FALSE);
        AppMethodBeat.o(6741);
        bool = false;
      }
    }
  }

  private o cXO()
  {
    AppMethodBeat.i(6743);
    int i = ((a)g.K(a.class)).a(a.a.lIf, 1);
    Object localObject1;
    if (i == 0)
    {
      ab.i("MicroMsg.WebViewResourceInterrupter", "tryInterceptBridgeScriptRequest, canPreInjectJsBridge: %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(6743);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      if ((this.mContext != null) && ((this.mContext instanceof WebViewUI)))
        ((WebViewUI)this.mContext).uvG = false;
      try
      {
        Object localObject3;
        if (!TextUtils.isEmpty(this.umG))
        {
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(org.apache.commons.a.c.toByteArray(ah.getContext().getAssets().open("jsapi/wxjs.js")));
          localObject3 = ((String)localObject1).replaceFirst("\\$\\{dgtVerifyRandomStr\\}", this.umG).replaceFirst("\\$\\{dgtVerifyEnabled\\}", "true");
          localObject1 = new java/io/ByteArrayInputStream;
          ((ByteArrayInputStream)localObject1).<init>(((String)localObject3).getBytes("UTF-8"));
          ab.i("MicroMsg.WebViewResourceInterrupter", "tryInterceptBridgeScriptRequest, ranDomStr: %s, hashCode: %d", new Object[] { this.umG, Integer.valueOf(hashCode()) });
        }
        while (true)
        {
          localObject3 = new HashMap();
          ((HashMap)localObject3).put("Cache-Control", "no-cache, no-store, must-revalidate");
          ((HashMap)localObject3).put("Pragma", "no-cache");
          ((HashMap)localObject3).put("Expires", "0");
          localObject1 = new o("application/javascript", "utf-8", 200, "OK", (Map)localObject3, (InputStream)localObject1);
          AppMethodBeat.o(6743);
          break;
          localObject1 = ah.getContext().getAssets().open("jsapi/wxjs.js");
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WebViewResourceInterrupter", "tryInterceptBridgeScriptRequest, failed, ", new Object[] { localException });
        AppMethodBeat.o(6743);
        Object localObject2 = null;
      }
    }
  }

  public final o a(String paramString, boolean paramBoolean, com.tencent.mm.plugin.webview.stub.d paramd)
  {
    AppMethodBeat.i(6740);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebViewResourceInterrupter", "url is null, return ");
      paramString = null;
      AppMethodBeat.o(6740);
    }
    while (true)
    {
      return paramString;
      if (paramString.startsWith("weixin://bridge.js"))
      {
        paramString = cXO();
        AppMethodBeat.o(6740);
      }
      else
      {
        if (!paramString.startsWith("weixin://game.js"))
          break label211;
        if ((this.mContext != null) && ((this.mContext instanceof GameWebViewUI)))
          break;
        paramString = null;
        AppMethodBeat.o(6740);
      }
    }
    paramString = ((GameWebViewUI)this.mContext).uDe;
    if (paramString != null);
    for (paramBoolean = paramString.uVv; ; paramBoolean = false)
    {
      while (true)
      {
        paramString = com.tencent.mm.plugin.webview.ui.tools.game.d.nX(paramBoolean);
        if (paramString != null)
        {
          if (Build.VERSION.SDK_INT >= 21)
          {
            paramString = new o(paramString.getMimeType(), paramString.getEncoding(), paramString.getStatusCode(), paramString.getReasonPhrase(), paramString.getResponseHeaders(), paramString.getData());
            AppMethodBeat.o(6740);
            break;
          }
          paramString = new o(paramString.getMimeType(), paramString.getEncoding(), paramString.getData());
          AppMethodBeat.o(6740);
          break;
        }
        paramString = null;
        AppMethodBeat.o(6740);
        break;
        label211: if (!paramString.startsWith("weixin://resourceid/"))
          break label321;
        ab.i("MicroMsg.WebViewResourceInterrupter", "it is wechat resource is, should intercept");
        try
        {
          paramString = paramd.dC(paramString, 1);
          if (bo.isNullOrNil(paramString))
            ab.e("MicroMsg.WebviewJSSDKUtil", "local is is null or nil");
          for (paramString = null; ; paramString = ap.aeE(paramString))
          {
            paramd = new com/tencent/xweb/o;
            paramd.<init>("image/*", "utf-8", paramString);
            AppMethodBeat.o(6740);
            paramString = paramd;
            break;
          }
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.WebViewResourceInterrupter", "get webview jssdk resource failed %s", new Object[] { paramString.getMessage() });
          paramString = null;
          AppMethodBeat.o(6740);
        }
      }
      break;
      label321: Object localObject1;
      Object localObject2;
      if (paramBoolean)
      {
        int i;
        if ((bo.isNullOrNil(paramString)) || (!q.Ed(paramString)))
          i = 0;
        while (true)
        {
          if (i == 0)
            break label593;
          ab.f("MicroMsg.WebViewResourceInterrupter", "local url, interrupt request : %s", new Object[] { paramString });
          paramString = new o("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
          AppMethodBeat.o(6740);
          break;
          localObject1 = paramString.toLowerCase();
          if ((((String)localObject1).contains("localhost")) || (((String)localObject1).contains("127.0.0.1")) || (((String)localObject1).contains("::1")) || (((String)localObject1).contains(u.bOO())))
          {
            if ((this.umD != null) && (this.umD.size() > 0))
              localObject2 = this.umD.iterator();
          }
          else
            while (true)
              if (((Iterator)localObject2).hasNext())
              {
                i = ((Integer)((Iterator)localObject2).next()).intValue();
                if ((((String)localObject1).contains("localhost:".concat(String.valueOf(i)))) || (((String)localObject1).contains("127.0.0.1:".concat(String.valueOf(i)))))
                {
                  ab.i("MicroMsg.WebViewResourceInterrupter", "int white list : %s, port = %d", new Object[] { localObject1, Integer.valueOf(i) });
                  i = 0;
                  break;
                }
              }
          ab.e("MicroMsg.WebViewResourceInterrupter", "not allowed to load local url : %s", new Object[] { localObject1 });
          i = 1;
        }
      }
      label593: if (b(paramString, paramd))
      {
        ab.e("MicroMsg.WebViewResourceInterrupter", "this is a ad request, interrupt request : %s", new Object[] { paramString });
        paramString = new o("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
        AppMethodBeat.o(6740);
        break;
      }
      while (true)
      {
        long l1;
        long l2;
        try
        {
          if (f.isEnabled())
          {
            String str = f.cZD();
            localObject1 = Uri.parse(paramString);
            paramd = ((Uri)localObject1).getHost();
            if ((str != null) && (paramd != null))
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              if (str.equals(ag.ck(paramd + b.oTO.TQ("\003&+21"))))
              {
                paramd = ((Uri)localObject1).getQueryParameterNames();
                if ((paramd != null) && (paramd.contains(ApplicationInfo.class.getSimpleName().substring(2, 3))))
                {
                  ab.w("MicroMsg.WebViewResourceInterrupter", "[tomys] wv, something wicked this way comes.");
                  if (bo.isNullOrNil(paramString))
                    ab.w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
                }
                else
                {
                  if (!f.bXm())
                    continue;
                  ab.w("MicroMsg.WebViewResourceInterrupter", "[tomys] wv, block is enabled.");
                  if (!bo.isNullOrNil(paramString))
                    break label1003;
                  ab.w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
                  paramString = new com/tencent/xweb/o;
                  paramd = new java/io/ByteArrayInputStream;
                  paramd.<init>(new byte[0]);
                  paramString.<init>("text/plain", "UTF-8", paramd);
                  AppMethodBeat.o(6740);
                  break;
                }
                try
                {
                  paramd = ah.getContext().getSharedPreferences("qar_cycle_rec", 0);
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>("qaj_tick_");
                  localObject2 = ag.ck(paramString);
                  l1 = paramd.getLong((String)localObject2, 0L);
                  l2 = System.currentTimeMillis();
                  if (l2 - l1 <= TimeUnit.HOURS.toMillis(24L))
                    continue;
                  paramd.edit().putLong((String)localObject2, l2).commit();
                  e.pXa.a(16195, paramString.replace(",", "%2C"), false, true);
                  e.pXa.a(943L, 0L, 1L, false);
                }
                catch (Throwable paramd)
                {
                  ab.printErrStackTrace("MicroMsg.WebViewReporter", paramd, "", new Object[0]);
                }
                continue;
              }
            }
          }
        }
        catch (Throwable paramString)
        {
          paramString = null;
          AppMethodBeat.o(6740);
        }
        break;
        try
        {
          label1003: paramd = ah.getContext().getSharedPreferences("qar_cycle_rec", 0);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("qab_tick_");
          paramString = ag.ck(paramString);
          l1 = paramd.getLong(paramString, 0L);
          l2 = System.currentTimeMillis();
          if (l2 - l1 > TimeUnit.HOURS.toMillis(24L))
          {
            paramd.edit().putLong(paramString, l2).commit();
            e.pXa.a(943L, 1L, 1L, false);
          }
        }
        catch (Throwable paramString)
        {
          ab.printErrStackTrace("MicroMsg.WebViewReporter", paramString, "", new Object[0]);
        }
      }
    }
  }

  public final void aey(String paramString)
  {
    AppMethodBeat.i(6742);
    this.umG = paramString;
    ab.i("MicroMsg.WebViewResourceInterrupter", "setDgtVerifyRandomStr, ranDomStr: %s, hashCode: %d", new Object[] { this.umG, Integer.valueOf(hashCode()) });
    AppMethodBeat.o(6742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.an
 * JD-Core Version:    0.6.2
 */