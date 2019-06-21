package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.aj;
import com.tencent.mm.plugin.websearch.api.al;
import com.tencent.mm.plugin.websearch.api.ap;
import com.tencent.mm.plugin.websearch.api.l;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public abstract class PreLoadWebViewUI extends WebViewUI
{
  protected String cIy;
  protected String cvF;
  boolean uCf;
  CountDownLatch uCg = new CountDownLatch(dbI() + 2);
  private com.tencent.mm.plugin.websearch.api.ah uCh;
  private int uaJ = -1;

  private void dbO()
  {
    if (this.uCf)
      new Thread(new PreLoadWebViewUI.2(this)).start();
  }

  public void aMh()
  {
    super.aMh();
    this.uCg.countDown();
    if ((this.uhz != null) && (!this.uhz.ready))
    {
      this.uhz.a(new PreLoadWebViewUI.1(this));
      if (b.dnO())
      {
        if (!this.uCf)
          break label95;
        t.makeText(com.tencent.mm.sdk.platformtools.ah.getContext(), "use preloaded webview(安装coolassist时弹出), sys " + ap.cVF().cVG(), 1).show();
      }
    }
    while (true)
    {
      return;
      dbO();
      break;
      label95: t.makeText(com.tencent.mm.sdk.platformtools.ah.getContext(), "no preloaded webview(安装coolassist时弹出), sys " + ap.cVF().cVG(), 1).show();
    }
  }

  public final MMWebView aXX()
  {
    Object localObject1 = getIntent();
    if (localObject1 != null)
    {
      this.uaJ = ((Intent)localObject1).getIntExtra("key_preload_biz", -1);
      ab.i("PreLoadWebViewUI", "getting preloaded  webview, biz %d", new Object[] { Integer.valueOf(this.uaJ) });
    }
    for (Object localObject2 = (al)aj.cVp().Ih(this.uaJ).fn(this); ; localObject2 = null)
    {
      label73: int i;
      if (localObject2 == null)
      {
        localObject1 = null;
        if (localObject2 != null)
          break label191;
        localObject2 = null;
        this.uCh = ((com.tencent.mm.plugin.websearch.api.ah)localObject2);
        if (localObject1 != null)
          break label243;
        ab.i("PreLoadWebViewUI", "no available preloaded webview");
        this.uCf = false;
        localObject1 = cWL();
        if (TextUtils.isEmpty((CharSequence)localObject1))
          break label204;
        if (bo.ank(Uri.parse((String)localObject1).getQueryParameter("isOpenPreload")) != 1)
          break label199;
        i = 1;
        label124: if (i != 0)
          h.pYm.e(15005, new Object[] { Integer.valueOf(this.uaJ), Integer.valueOf(4), Integer.valueOf(0) });
        if (this.uaJ != 2)
          break label209;
        localObject1 = MMWebView.a.in(this);
      }
      while (true)
      {
        return localObject1;
        localObject1 = (MMWebView)((al)localObject2).uaQ;
        break;
        label191: localObject2 = ((al)localObject2).uaR;
        break label73;
        label199: i = 0;
        break label124;
        label204: i = 0;
        break label124;
        label209: MMWebView localMMWebView;
        try
        {
          if (ap.cVF().cVG())
          {
            localObject1 = MMWebView.a.im(this);
            continue;
          }
          localObject1 = MMWebView.a.in(this);
        }
        catch (Exception localException)
        {
          localMMWebView = MMWebView.a.in(this);
        }
        continue;
        label243: ab.i("PreLoadWebViewUI", "use preloaded webview ,%s ", new Object[] { localMMWebView.toString() });
        this.uCf = true;
        h.pYm.e(15005, new Object[] { Integer.valueOf(this.uaJ), Integer.valueOf(3), Integer.valueOf(0) });
      }
    }
  }

  public final boolean aYd()
  {
    return this.uCf;
  }

  public final void daF()
  {
    h.pYm.e(15005, new Object[] { Integer.valueOf(this.uaJ), Integer.valueOf(5), Integer.valueOf(0) });
  }

  public final com.tencent.mm.plugin.websearch.api.ah dap()
  {
    return this.uCh;
  }

  public final void daq()
  {
    this.uCf = false;
  }

  protected void dbE()
  {
  }

  public int dbI()
  {
    return 0;
  }

  protected Map<String, Object> dbJ()
  {
    return null;
  }

  public final Map<String, Object> dbP()
  {
    Object localObject1 = cWL();
    Object localObject2;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject2 = new HashMap();
      Uri localUri = Uri.parse((String)localObject1);
      localObject1 = localUri.getQueryParameterNames().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        String str = (String)((Iterator)localObject1).next();
        ((Map)localObject2).put(str, localUri.getQueryParameter(str));
      }
    }
    while (true)
    {
      localObject1 = dbJ();
      if (localObject1 != null)
        ((Map)localObject2).putAll((Map)localObject1);
      ab.i("PreLoadWebViewUI", "buildOnUiInitParams %s", new Object[] { localObject2.toString() });
      return localObject2;
      localObject2 = Collections.emptyMap();
    }
  }

  protected d getJsapi()
  {
    return this.uhz;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (TextUtils.isEmpty(this.cvF))
    {
      this.cvF = getIntent().getStringExtra("sessionId");
      this.cIy = getIntent().getStringExtra("subSessionId");
      if (TextUtils.isEmpty(this.cIy))
        this.cIy = this.cvF;
    }
  }

  public void onResume()
  {
    super.onResume();
    this.uCg.countDown();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected class a extends WebViewUI.h
  {
    protected a()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
 * JD-Core Version:    0.6.2
 */