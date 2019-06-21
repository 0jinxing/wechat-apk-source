package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.aa;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.webview.ui.tools.widget.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.c.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.f.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;

public final class g extends h
{
  public g(Context paramContext, r paramr, ViewGroup paramViewGroup)
  {
    super(paramContext, paramr, paramViewGroup);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37065);
    super.coZ();
    WebView localWebView = (WebView)getView();
    if ((localWebView != null) && (localWebView.getParent() != null))
    {
      ((ViewGroup)localWebView.getParent()).removeView(localWebView);
      localWebView.setTag(null);
      localWebView.destroy();
    }
    this.contentView = null;
    AppMethodBeat.o(37065);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37062);
    WebView localWebView;
    aa localaa;
    String str2;
    if ((aa)cpB() != null)
    {
      localWebView = (WebView)getView();
      localaa = (aa)cpB();
      if ((TextUtils.isEmpty(localaa.url)) || (TextUtils.isEmpty(cpC().qPj)))
        break label183;
      String str1 = AdLandingPagesProxy.getInstance().getUin();
      str2 = ad.m(localaa.url, new String[] { "uxinfo=" + cpC().qPj, "uin=".concat(String.valueOf(str1)) });
      if (localaa.cuu != 1)
        break label192;
      str1 = AdLandingPagesProxy.getInstance().getAdVoteInfo(localaa.url, cpC().qPj, str1);
      if (bo.isNullOrNil(str1))
        break label192;
      str2 = str2 + "&" + str1;
    }
    label183: label192: 
    while (true)
    {
      localWebView.loadUrl(str2);
      AppMethodBeat.o(37062);
      return;
      str2 = localaa.url;
    }
  }

  protected final void cpq()
  {
    AppMethodBeat.i(37063);
    ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qZo.qWS, (int)this.qZo.qWQ, (int)this.qZo.qWT, (int)this.qZo.qWR);
    this.contentView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(37063);
  }

  protected final View cpr()
  {
    AppMethodBeat.i(37064);
    MMWebView localMMWebView = f.a.uJi.du(this.context);
    localMMWebView.getSettings().dUe();
    localMMWebView.getSettings().dUi();
    localMMWebView.getSettings().dUh();
    localMMWebView.setWebViewClient(c.a.uJh.a(localMMWebView, false, new g.1(this)));
    AppMethodBeat.o(37064);
    return localMMWebView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g
 * JD-Core Version:    0.6.2
 */