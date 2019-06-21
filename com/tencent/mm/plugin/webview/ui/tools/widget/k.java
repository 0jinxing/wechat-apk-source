package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.plugin.downloader.model.DownloadChecker;
import com.tencent.mm.plugin.webview.a;
import com.tencent.mm.plugin.webview.model.ah;
import com.tencent.mm.plugin.webview.model.an;
import com.tencent.mm.plugin.webview.modelcache.q;
import com.tencent.mm.plugin.webview.stub.WebViewStubService;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class k extends s
{
  public MMWebView fow;
  protected Activity gNy;
  ak mHandler;
  protected String mTH;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.d uDd;
  private f uDh;
  public com.tencent.mm.plugin.webview.ui.tools.k uFu;
  private boolean uJA;
  protected Map<String, String> uJB;
  protected k.c uJC;
  public m uJD;
  final Bundle uJm;
  protected boolean uJn;
  private String uJo;
  private Set<String> uJp;
  protected k.b uJq;
  protected k.a uJr;
  private an uJs;
  protected String uJt;
  protected String uJu;
  private String uJv;
  private List<b> uJw;
  private final Map<String, String> uJx;
  protected boolean uJy;
  protected boolean uJz;
  private final Map<String, Map<String, String>> uwr;
  public com.tencent.mm.plugin.webview.stub.d uzS;

  public k(MMWebView paramMMWebView)
  {
    this(paramMMWebView, (byte)0);
  }

  public k(MMWebView paramMMWebView, byte paramByte)
  {
    this(paramMMWebView, false, null);
  }

  public k(MMWebView paramMMWebView, boolean paramBoolean, Bundle paramBundle)
  {
    AppMethodBeat.i(9990);
    this.uDh = null;
    this.uDd = null;
    this.uJn = false;
    this.uJo = "";
    this.uJp = new HashSet();
    this.uJq = new k.b(this);
    this.uJr = new k.a(null);
    this.uJt = null;
    this.uJu = null;
    this.uJv = null;
    this.uJw = new ArrayList();
    this.uJx = new HashMap();
    this.uwr = new ConcurrentHashMap();
    this.uJy = false;
    this.uJz = false;
    this.uJA = false;
    this.uJC = new k.c(this);
    this.uJD = new k.5(this);
    this.gNy = ((Activity)paramMMWebView.getContext());
    this.fow = paramMMWebView;
    this.mHandler = new ak();
    this.uFu = new com.tencent.mm.plugin.webview.ui.tools.k((JsapiPermissionWrapper)this.gNy.getIntent().getParcelableExtra("hardcode_jspermission"), (GeneralControlWrapper)this.gNy.getIntent().getParcelableExtra("hardcode_general_ctrl"), new k.1(this));
    this.uJn = paramBoolean;
    this.uJm = paramBundle;
    this.uJs = new an(this.gNy);
    ab.i("MicroMsg.MMWebViewClient", "MMWebViewClient init, webview: %d, resourceInterrupter: %d", new Object[] { Integer.valueOf(this.fow.hashCode()), Integer.valueOf(this.uJs.hashCode()) });
    AppMethodBeat.o(9990);
  }

  private void D(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(10012);
    String str1 = bo.bc(dae(), this.uJt);
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.MMWebViewClient", "after getA8Key, currentURL is null or nil, wtf");
      this.fow.loadUrl(paramString);
      AppMethodBeat.o(10012);
    }
    while (true)
    {
      return;
      if (this.uDd == null)
      {
        if (paramMap.size() > 0)
        {
          this.fow.loadUrl(paramString, paramMap);
          AppMethodBeat.o(10012);
        }
        else
        {
          this.fow.loadUrl(paramString);
          AppMethodBeat.o(10012);
        }
      }
      else if (bo.nullAsNil(paramString).contains("#wechat_redirect"))
      {
        if (paramMap.size() > 0)
        {
          this.fow.loadUrl(paramString, paramMap);
          AppMethodBeat.o(10012);
        }
        else
        {
          this.fow.loadUrl(paramString);
          AppMethodBeat.o(10012);
        }
      }
      else
      {
        if (!hh(str1, paramString))
        {
          String str2 = q.aeN(str1);
          String str3 = q.aeN(paramString);
          if ((bo.isNullOrNil(str3)) || (bo.isNullOrNil(str2)) || (!str3.equals(str2)) || (this.uzS == null) || (!afI(str1)))
            break label266;
        }
        label266: for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label272;
          this.uJx.put(str1, paramString);
          this.uwr.put(str1, paramMap);
          this.uDd.z(paramString, paramMap);
          AppMethodBeat.o(10012);
          break;
        }
        label272: if (paramMap.size() > 0)
        {
          this.fow.loadUrl(paramString, paramMap);
          AppMethodBeat.o(10012);
        }
        else
        {
          this.fow.loadUrl(paramString);
          AppMethodBeat.o(10012);
        }
      }
    }
  }

  private void a(String paramString1, String paramString2, JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    AppMethodBeat.i(10015);
    if (!bo.isNullOrNil(paramString2))
    {
      this.uFu.a(paramString2, paramJsapiPermissionWrapper, paramGeneralControlWrapper);
      this.uJp.remove(paramString2);
      this.uJz = false;
      this.mTH = paramString2;
    }
    if (hh(paramString1, paramString2))
    {
      this.uFu.a(paramString1, paramJsapiPermissionWrapper, paramGeneralControlWrapper);
      this.uJp.remove(paramString1);
      AppMethodBeat.o(10015);
    }
    while (true)
    {
      return;
      if ((this.uzS == null) || (bo.isNullOrNil(paramString1)) || (!afI(paramString2)))
      {
        AppMethodBeat.o(10015);
      }
      else
      {
        this.uFu.a(paramString1, paramJsapiPermissionWrapper, paramGeneralControlWrapper);
        this.uJp.remove(paramString1);
        AppMethodBeat.o(10015);
      }
    }
  }

  private void cZX()
  {
    AppMethodBeat.i(10006);
    ab.i("MicroMsg.MMWebViewClient", "tryBindService");
    Intent localIntent = new Intent(this.gNy, WebViewStubService.class);
    this.gNy.bindService(localIntent, this.uJC, 1);
    AppMethodBeat.o(10006);
  }

  private String dae()
  {
    AppMethodBeat.i(10016);
    String str;
    if (!bo.isNullOrNil(this.uJu))
    {
      str = this.uJu;
      AppMethodBeat.o(10016);
    }
    while (true)
    {
      return str;
      if (this.mHandler == null)
      {
        str = null;
        AppMethodBeat.o(10016);
      }
      else if (Thread.currentThread().getId() == this.mHandler.getLooper().getThread().getId())
      {
        if (this.fow == null)
        {
          str = "";
          AppMethodBeat.o(10016);
        }
        else
        {
          str = this.fow.getUrl();
          AppMethodBeat.o(10016);
        }
      }
      else
      {
        str = (String)new k.4(this, "").b(this.mHandler);
        AppMethodBeat.o(10016);
      }
    }
  }

  private void dcV()
  {
    AppMethodBeat.i(10011);
    try
    {
      if (this.uzS != null)
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putInt("scene_end_type", 233);
        localBundle.putInt("scene_end_listener_hash_code", this.fow.hashCode());
        this.uzS.a(6, localBundle, this.fow.hashCode());
      }
      AppMethodBeat.o(10011);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMWebViewClient", "removeSceneEnd, ex = " + localException.getMessage());
        AppMethodBeat.o(10011);
      }
    }
  }

  private boolean hh(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10013);
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(10013);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((a.uet.matcher(paramString1).matches()) && (a.uet.matcher(paramString2).matches()))
      {
        String str1 = paramString1.replaceFirst("http://", "").replaceFirst("https://", "");
        int i = str1.indexOf('#');
        String str2 = str1;
        if (i > 0)
          str2 = str1.substring(0, i);
        if ((paramString2.replaceFirst("http://", "").replaceFirst("https://", "").startsWith(str2)) && (this.uzS != null) && (afI(paramString1)))
        {
          bool = true;
          AppMethodBeat.o(10013);
        }
      }
      else
      {
        AppMethodBeat.o(10013);
        bool = false;
      }
    }
  }

  private void k(String paramString, boolean paramBoolean, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(10010);
    if (this.gNy.isFinishing())
      AppMethodBeat.o(10010);
    while (true)
    {
      return;
      if (this.uFu == null)
      {
        ab.e("MicroMsg.MMWebViewClient", "startGetA8Key fail, after onDestroy");
        AppMethodBeat.o(10010);
        continue;
      }
      if (this.uJn)
      {
        ab.i("MicroMsg.MMWebViewClient", "edw startGetA8Key, nevergeta8key");
        this.uFu.a(paramString, null, null);
        AppMethodBeat.o(10010);
        continue;
      }
      if (this.uzS == null);
      for (boolean bool2 = false; ; bool2 = this.uJp.contains(paramString))
      {
        if (((!this.uFu.has(paramString)) && (!bool2)) || (paramBoolean))
          break label153;
        ab.i("MicroMsg.MMWebViewClient", "edw startGetA8Key no need, wvPerm already has value, url = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(10010);
        break;
      }
      label153: int i = this.uJr.ael(paramString);
      ab.i("MicroMsg.MMWebViewClient", "edw startGetA8Key, url = " + paramString + ", scene = " + paramInt + ", username = " + "" + ", reason = " + i + ", force = " + paramBoolean);
      ab.i("MicroMsg.MMWebViewClient", "edw startGetA8Key, begin, set a default permission");
      this.uJp.add(paramString);
      this.uFu.a(paramString, null, null);
      this.uJz = true;
      this.uJq.daN();
      Bundle localBundle = new Bundle();
      localBundle.putString("geta8key_data_req_url", paramString);
      localBundle.putString("geta8key_data_username", "");
      localBundle.putInt("geta8key_data_scene", paramInt);
      localBundle.putInt("geta8key_data_reason", i);
      if (this.fow.getIsX5Kernel())
      {
        localBundle.putInt("geta8key_data_flag", 1);
        localBundle.putString("geta8key_data_net_type", u.cXS());
        localBundle.putInt("webview_binder_id", this.fow.hashCode());
        localBundle.putString("geta8key_outer_url", BZ(paramString));
        this.uJo = paramString;
        g(localBundle, paramString);
      }
      try
      {
        paramBoolean = this.uzS.s(233, localBundle);
        ab.i("MicroMsg.MMWebViewClient", "startGetA8Key, doScene ret = ".concat(String.valueOf(paramBoolean)));
        AppMethodBeat.o(10010);
        continue;
        localBundle.putInt("geta8key_data_flag", 0);
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.w("MicroMsg.MMWebViewClient", "startGetA8Key, ex = " + paramString.getMessage());
          paramBoolean = bool1;
        }
      }
    }
  }

  protected String BZ(String paramString)
  {
    return "";
  }

  protected void NT(String paramString)
  {
    AppMethodBeat.i(10008);
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("Pragma", "no-cache");
    localHashMap.put("Cache-Control", "no-cache");
    this.fow.loadUrl(paramString, localHashMap);
    AppMethodBeat.o(10008);
  }

  public o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(10001);
    if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
    {
      paramWebView = super.a(paramWebView, paramn);
      AppMethodBeat.o(10001);
    }
    while (true)
    {
      return paramWebView;
      ab.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramn.getUrl(), paramn.getMethod(), Boolean.valueOf(paramn.isForMainFrame()) });
      paramWebView = this.uJs.a(paramn.getUrl().toString(), false, this.uzS);
      AppMethodBeat.o(10001);
    }
  }

  public o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(10002);
    if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
    {
      paramWebView = super.a(paramWebView, paramn, paramBundle);
      AppMethodBeat.o(10002);
    }
    while (true)
    {
      return paramWebView;
      ab.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramn.getUrl(), paramn.getMethod(), Boolean.valueOf(paramn.isForMainFrame()) });
      if (c.iv(this.gNy));
      try
      {
        int i = paramBundle.getInt("resourceType");
        if ((i == 1) || (i == 7))
        {
          ab.i("MicroMsg.MMWebViewClient", "get resoutce type is iframe : %d, start geta8key", new Object[] { Integer.valueOf(i) });
          k(paramn.getUrl().toString(), false, aGv());
        }
        paramWebView = this.uJs.a(paramn.getUrl().toString(), true, this.uzS);
        AppMethodBeat.o(10002);
      }
      catch (Exception paramWebView)
      {
        while (true)
          ab.w("MicroMsg.MMWebViewClient", "get resource type failed Exception ; %s", new Object[] { paramWebView.getMessage() });
      }
      catch (Throwable paramWebView)
      {
        while (true)
          ab.w("MicroMsg.MMWebViewClient", "get resource type failed Throwable ; %s", new Object[] { paramWebView.getMessage() });
      }
    }
  }

  public void a(com.tencent.mm.plugin.webview.stub.d paramd, com.tencent.mm.plugin.webview.ui.tools.k paramk)
  {
  }

  protected void a(com.tencent.mm.plugin.webview.ui.tools.jsapi.d paramd)
  {
  }

  protected void a(f paramf)
  {
  }

  public void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(9998);
    super.a(paramWebView, paramInt, paramString1, paramString2);
    AppMethodBeat.o(9998);
  }

  public final void a(WebView paramWebView, j paramj, SslError paramSslError)
  {
    AppMethodBeat.i(9997);
    super.a(paramWebView, paramj, paramSslError);
    AppMethodBeat.o(9997);
  }

  protected void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
  }

  public final void a(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(9994);
    ab.i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory, url = %s, isReload = %b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    super.a(paramWebView, paramString, paramBoolean);
    paramWebView = paramWebView.getUrl();
    if (this.uJn)
      bI(paramWebView, false);
    if ((this.uFu != null) && (!this.uFu.has(paramWebView)))
    {
      ab.i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory start geta8key, url = %s", new Object[] { paramWebView });
      bI(paramWebView, false);
    }
    AppMethodBeat.o(9994);
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(9993);
    ab.i("MicroMsg.MMWebViewClient", "edw opt, shouldOverride url = ".concat(String.valueOf(paramString)));
    if (this.uzS == null)
    {
      ab.e("MicroMsg.MMWebViewClient", "Service not ready yet, make sure url loading happens after service connected");
      AppMethodBeat.o(9993);
    }
    while (true)
    {
      return bool1;
      if (!ah.aes(paramString))
      {
        ab.f("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, URL load failed, url = ".concat(String.valueOf(paramString)));
        agd(paramString);
        AppMethodBeat.o(9993);
      }
      else if (paramString.equals(this.uJv))
      {
        this.uJv = "";
        AppMethodBeat.o(9993);
      }
      else if (DownloadChecker.a(paramString, getSource(), paramWebView))
      {
        ab.i("MicroMsg.MMWebViewClient", "use the downloader to download");
        AppMethodBeat.o(9993);
      }
      else
      {
        boolean bool2 = agD(paramString);
        if ((!bool2) && (paramString.startsWith("weixin://")))
        {
          ab.e("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, can not deal with this weixin scheme, stop directly, url = %s", new Object[] { paramString });
          AppMethodBeat.o(9993);
        }
        else if (bool2)
        {
          AppMethodBeat.o(9993);
        }
        else
        {
          int i = this.uJr.ael(paramString);
          if (((i == 0) || (i == 2)) && (!this.uJn))
          {
            ab.i("MicroMsg.MMWebViewClient", "edw shouldOverride, should not continue, reason = ".concat(String.valueOf(i)));
            if (afI(paramString))
            {
              this.fow.stopLoading();
              this.fow.post(new k.2(this, paramString));
            }
            while (true)
            {
              if (!paramString.equals(this.uJo))
                break label314;
              ab.w("MicroMsg.MMWebViewClient", "shouldOverride, url equals lastGetA8KeyUrl, not trigger geta8key");
              AppMethodBeat.o(9993);
              bool1 = false;
              break;
              this.fow.stopLoading();
            }
            label314: bI(paramString, true);
            AppMethodBeat.o(9993);
          }
          else
          {
            AppMethodBeat.o(9993);
            bool1 = false;
          }
        }
      }
    }
  }

  protected m aGt()
  {
    return null;
  }

  protected int aGu()
  {
    return 0;
  }

  protected int aGv()
  {
    return 5;
  }

  protected boolean afI(String paramString)
  {
    AppMethodBeat.i(9991);
    boolean bool;
    if (this.fow != null)
    {
      this.fow.hashCode();
      bool = com.tencent.mm.plugin.webview.modelcache.p.aeI(paramString);
      AppMethodBeat.o(9991);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9991);
    }
  }

  protected final boolean agD(String paramString)
  {
    AppMethodBeat.i(9992);
    Iterator localIterator = this.uJw.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.afS(paramString))
      {
        bool = localb.afM(paramString);
        ab.i("MicroMsg.MMWebViewClient", "url handled, ret = " + bool + ", url = " + paramString);
        bool = true;
        AppMethodBeat.o(9992);
      }
    }
    while (true)
    {
      return bool;
      bool = oZ(paramString);
      AppMethodBeat.o(9992);
    }
  }

  protected boolean agc(String paramString)
  {
    AppMethodBeat.i(10007);
    boolean bool;
    if (this.uzS == null)
    {
      this.uJt = paramString;
      cZX();
      bool = true;
      AppMethodBeat.o(10007);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10007);
    }
  }

  protected void agd(String paramString)
  {
  }

  protected boolean am(Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(10014);
    ab.d("MicroMsg.MMWebViewClient", "[cpan] process a8 key:%d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    int i = paramBundle.getInt("geta8key_result_action_code");
    String str1 = paramBundle.getString("geta8key_result_title");
    String str2 = paramBundle.getString("geta8key_result_full_url");
    String str3 = paramBundle.getString("geta8key_result_content");
    ab.i("MicroMsg.MMWebViewClient", "processGetA8Key, actionCode = " + i + ", title = " + str1 + ", fullUrl = " + str2 + ", content = " + str3);
    String[] arrayOfString = paramBundle.getStringArray("geta8key_result_http_header_key_list");
    paramBundle = paramBundle.getStringArray("geta8key_result_http_header_value_list");
    HashMap localHashMap = new HashMap();
    if ((arrayOfString != null) && (paramBundle != null) && (arrayOfString.length > 0) && (paramBundle.length > 0) && (arrayOfString.length == paramBundle.length))
      for (int j = 0; j < arrayOfString.length; j++)
        localHashMap.put(arrayOfString[j], paramBundle[j]);
    this.uJB = localHashMap;
    switch (i)
    {
    case 3:
    case 4:
    case 5:
    default:
      ab.i("MicroMsg.MMWebViewClient", "qrcode-getA8key-not_catch: action code = ".concat(String.valueOf(i)));
      AppMethodBeat.o(10014);
    case 1:
    case 2:
    case 7:
    case 6:
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.MMWebViewClient", "getA8key-text: ".concat(String.valueOf(str3)));
      if ((str3 == null) || (str3.length() == 0))
      {
        ab.e("MicroMsg.MMWebViewClient", "getA8key-text fail, invalid content");
        AppMethodBeat.o(10014);
      }
      else
      {
        this.fow.getSettings().setJavaScriptEnabled(false);
        this.fow.loadData(str3, "text/html", "utf-8");
        AppMethodBeat.o(10014);
        bool = true;
        continue;
        ab.i("MicroMsg.MMWebViewClient", "getA8key-webview/no-notice: title = " + str1 + ", fullUrl = " + str2);
        if ((str2 == null) || (str2.length() == 0))
        {
          ab.e("MicroMsg.MMWebViewClient", "getA8key-webview fail, invalid fullUrl");
          AppMethodBeat.o(10014);
        }
        else if (!ah.aes(str2))
        {
          ab.f("MicroMsg.MMWebViewClient", "processGetA8Key qrcode, canLoadUrl fail, url = ".concat(String.valueOf(str2)));
          agd(str2);
          AppMethodBeat.o(10014);
          bool = true;
        }
        else
        {
          D(str2, localHashMap);
          AppMethodBeat.o(10014);
          bool = true;
          continue;
          ab.i("MicroMsg.MMWebViewClient", "getA8key-special_webview: fullUrl = ".concat(String.valueOf(str2)));
          if ((str2 == null) || (str2.length() == 0))
          {
            ab.e("MicroMsg.MMWebViewClient", "getA8key-special_webview fail, invalid fullUrl");
            AppMethodBeat.o(10014);
          }
          else if (!ah.aes(str2))
          {
            ab.f("MicroMsg.MMWebViewClient", "processGetA8Key special, canLoadUrl fail, url = ".concat(String.valueOf(str2)));
            agd(str2);
            AppMethodBeat.o(10014);
            bool = true;
          }
          else
          {
            this.fow.loadUrl(str2);
            AppMethodBeat.o(10014);
            bool = true;
          }
        }
      }
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(9996);
    ab.d("MicroMsg.MMWebViewClient", "onPageFinished url = %s", new Object[] { paramString });
    if (this.uzS == null)
      AppMethodBeat.o(9996);
    while (true)
    {
      return;
      super.b(paramWebView, paramString);
      if (!ah.aes(paramString))
      {
        ab.f("MicroMsg.MMWebViewClient", "onPageFinished, canLoadUrl fail, url = ".concat(String.valueOf(paramString)));
        agd(paramString);
        AppMethodBeat.o(9996);
      }
      else
      {
        this.uJv = "";
        if (paramString.equals("file:///android_asset/jsapi/wxjs.js"))
        {
          ab.i("MicroMsg.MMWebViewClient", "onPageFinished, js is finished loaded");
          e(paramWebView, paramString);
          AppMethodBeat.o(9996);
        }
        else
        {
          this.uDh.dbZ();
          e(paramWebView, paramString);
          AppMethodBeat.o(9996);
        }
      }
    }
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(9995);
    ab.d("MicroMsg.MMWebViewClient", "onPageStarted url = %s", new Object[] { paramString });
    if ((this.uzS == null) || (this.uJy))
    {
      this.uJy = false;
      AppMethodBeat.o(9995);
    }
    while (true)
    {
      return;
      if (!ah.aes(paramString))
      {
        ab.f("MicroMsg.MMWebViewClient", "onPageStarted, canLoadUrl fail, url = ".concat(String.valueOf(paramString)));
        agd(paramString);
        AppMethodBeat.o(9995);
      }
      else if (agD(paramString))
      {
        this.uJv = paramString;
        AppMethodBeat.o(9995);
      }
      else
      {
        this.uJu = paramString;
        super.b(paramWebView, paramString, paramBitmap);
        this.uDh.dbY();
        if (afI(paramString))
        {
          this.fow.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", null);
          if (this.uDd != null)
            this.uDd.z((String)this.uJx.get(paramString), (Map)this.uwr.get(paramString));
        }
        bI(paramString, false);
        a(paramWebView, paramString, paramBitmap);
        AppMethodBeat.o(9995);
      }
    }
  }

  public void bI(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(10009);
    k(paramString, paramBoolean, aGu());
    AppMethodBeat.o(10009);
  }

  public o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(10000);
    ab.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s", new Object[] { paramString });
    paramWebView = this.uJs.a(paramString, true, this.uzS);
    AppMethodBeat.o(10000);
    return paramWebView;
  }

  public final void cleanup()
  {
    AppMethodBeat.i(10003);
    try
    {
      this.uzS.Jc(this.fow.hashCode());
      if (this.uJC == null);
    }
    catch (Exception localException1)
    {
      try
      {
        this.gNy.unbindService(this.uJC);
        if (this.uDd != null)
          this.uDd.detach();
        if (this.uDh != null)
          this.uDh.detach();
        dcV();
        this.uJD = null;
        dbT();
        AppMethodBeat.o(10003);
        return;
        localException1 = localException1;
        ab.printErrStackTrace("MicroMsg.MMWebViewClient", localException1, "", new Object[0]);
      }
      catch (Exception localException2)
      {
        while (true)
          ab.e("MicroMsg.MMWebViewClient", localException2.getMessage());
      }
    }
  }

  protected void dbT()
  {
  }

  protected void dbU()
  {
    AppMethodBeat.i(10005);
    if (TextUtils.isEmpty(this.uJt))
      AppMethodBeat.o(10005);
    while (true)
    {
      return;
      try
      {
        this.uzS.a(this.uJt, true, null);
        if (agD(this.uJt))
          AppMethodBeat.o(10005);
      }
      catch (Exception localException)
      {
        while (true)
          ab.w("MicroMsg.MMWebViewClient", "postBinded, jumpToActivity, ex = " + localException.getMessage());
        Uri localUri = Uri.parse(this.uJt);
        Object localObject = localUri;
        if (localUri.getScheme() == null)
        {
          this.uJt += "http://";
          localObject = Uri.parse(this.uJt);
        }
        if (((Uri)localObject).getScheme().startsWith("http"))
        {
          ab.i("MicroMsg.MMWebViewClient", "uri scheme not startwith http, scheme = " + ((Uri)localObject).getScheme());
          this.uJr = new k.a(this.uJt);
          if ((this.uJn) || (this.uFu.has(this.uJt)))
          {
            this.fow.loadUrl(this.uJt);
            AppMethodBeat.o(10005);
          }
          else
          {
            bI(this.uJt, false);
            AppMethodBeat.o(10005);
          }
        }
        else if (!ah.aes(this.uJt))
        {
          agd(this.uJt);
          AppMethodBeat.o(10005);
        }
        else
        {
          this.fow.loadUrl(this.uJt);
          AppMethodBeat.o(10005);
        }
      }
    }
  }

  public final void dcU()
  {
    AppMethodBeat.i(10004);
    HashMap localHashMap = new HashMap();
    localHashMap.put("init_url", this.uJt);
    localHashMap.put("webview_type", "1");
    localHashMap.put("init_font_size", "1");
    this.uDd = new com.tencent.mm.plugin.webview.ui.tools.jsapi.d(this.fow, this.uFu, localHashMap, this.uzS, this.fow.hashCode());
    ab.i("MicroMsg.MMWebViewClient", "initJsApi， webview: %d, jsapi: %d", new Object[] { Integer.valueOf(this.fow.hashCode()), Integer.valueOf(this.uDd.hashCode()) });
    this.uDd.uFt = null;
    this.fow.addJavascriptInterface(this.uDd, "__wx");
    this.uJw.add(this.uDd);
    this.uJw.add(new e(this.fow, this.uDd));
    this.uDh = new f(this.fow, this.uzS, this.uDd, new k.3(this), false);
    a(this.uDh);
    try
    {
      i = bo.getInt(this.uzS.afk("WebviewDisableDigestVerify"), 0);
      ab.i("MicroMsg.MMWebViewClient", "js digest verification config = %d", new Object[] { Integer.valueOf(i) });
      if ((i == 0) && (this.gNy.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("wvsha1", true)))
      {
        this.uDd.dch();
        this.uJs.aey(this.uDd.uFw);
      }
      AppMethodBeat.o(10004);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.MMWebViewClient", "getting js digest verification config fails, ex = " + localException.getMessage());
        int i = 0;
      }
    }
  }

  protected void e(WebView paramWebView, String paramString)
  {
  }

  protected void g(Bundle paramBundle, String paramString)
  {
  }

  protected String getSource()
  {
    return "";
  }

  public final void h(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(9999);
    ab.i("MicroMsg.MMWebViewClient", "edw onLoadResource opt, url = ".concat(String.valueOf(paramString)));
    super.h(paramWebView, paramString);
    AppMethodBeat.o(9999);
  }

  protected boolean oZ(String paramString)
  {
    return false;
  }

  public final void of(boolean paramBoolean)
  {
    this.uJy = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k
 * JD-Core Version:    0.6.2
 */