package com.tencent.xweb.sys;

import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.p;
import com.tencent.xweb.util.e;

public final class f extends p
{
  WebView AQf;
  String AQg;

  public f(WebView paramWebView)
  {
    AppMethodBeat.i(84746);
    this.AQg = "";
    this.AQf = paramWebView;
    getUserAgentString();
    AppMethodBeat.o(84746);
  }

  public final void dUa()
  {
    AppMethodBeat.i(84750);
    this.AQf.getSettings().setDisplayZoomControls(false);
    AppMethodBeat.o(84750);
  }

  public final void dUb()
  {
    AppMethodBeat.i(84752);
    this.AQf.getSettings().setSaveFormData(false);
    AppMethodBeat.o(84752);
  }

  public final void dUc()
  {
    AppMethodBeat.i(84753);
    this.AQf.getSettings().setSavePassword(false);
    AppMethodBeat.o(84753);
  }

  public final void dUd()
  {
    AppMethodBeat.i(84757);
    this.AQf.getSettings().setDefaultFontSize(8);
    AppMethodBeat.o(84757);
  }

  public final void dUe()
  {
    AppMethodBeat.i(84764);
    this.AQf.getSettings().setAppCacheEnabled(true);
    AppMethodBeat.o(84764);
  }

  public final void dUf()
  {
    AppMethodBeat.i(84766);
    this.AQf.getSettings().setAppCacheMaxSize(10485760L);
    AppMethodBeat.o(84766);
  }

  public final void dUg()
  {
    AppMethodBeat.i(84767);
    this.AQf.getSettings().setDatabaseEnabled(true);
    AppMethodBeat.o(84767);
  }

  public final void dUh()
  {
    AppMethodBeat.i(84768);
    this.AQf.getSettings().setDomStorageEnabled(true);
    AppMethodBeat.o(84768);
  }

  public final void dUi()
  {
    AppMethodBeat.i(84775);
    this.AQf.getSettings().setCacheMode(-1);
    AppMethodBeat.o(84775);
  }

  public final void dUj()
  {
    AppMethodBeat.i(84776);
    if (Build.VERSION.SDK_INT >= 21)
      this.AQf.getSettings().setMixedContentMode(0);
    AppMethodBeat.o(84776);
  }

  public final boolean getBlockNetworkImage()
  {
    AppMethodBeat.i(84760);
    boolean bool = this.AQf.getSettings().getBlockNetworkImage();
    AppMethodBeat.o(84760);
    return bool;
  }

  public final String getUserAgentString()
  {
    AppMethodBeat.i(84773);
    if ((this.AQg == null) || (this.AQg.isEmpty()));
    try
    {
      this.AQg = this.AQf.getSettings().getUserAgentString();
      label36: String str = this.AQg;
      AppMethodBeat.o(84773);
      return str;
    }
    catch (Exception localException)
    {
      break label36;
    }
  }

  public final void setAppCachePath(String paramString)
  {
    AppMethodBeat.i(84765);
    this.AQf.getSettings().setAppCachePath(paramString);
    AppMethodBeat.o(84765);
  }

  public final void setBlockNetworkImage(boolean paramBoolean)
  {
    AppMethodBeat.i(84759);
    this.AQf.getSettings().setBlockNetworkImage(paramBoolean);
    AppMethodBeat.o(84759);
  }

  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    AppMethodBeat.i(84749);
    this.AQf.getSettings().setBuiltInZoomControls(paramBoolean);
    AppMethodBeat.o(84749);
  }

  public final void setDatabasePath(String paramString)
  {
    AppMethodBeat.i(84763);
    this.AQf.getSettings().setDatabasePath(paramString);
    AppMethodBeat.o(84763);
  }

  public final void setDefaultTextEncodingName(String paramString)
  {
    AppMethodBeat.i(84771);
    this.AQf.getSettings().setDefaultTextEncodingName(paramString);
    AppMethodBeat.o(84771);
  }

  public final void setGeolocationEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84769);
    this.AQf.getSettings().setGeolocationEnabled(paramBoolean);
    AppMethodBeat.o(84769);
  }

  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    AppMethodBeat.i(84770);
    this.AQf.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
    AppMethodBeat.o(84770);
  }

  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84761);
    this.AQf.getSettings().setJavaScriptEnabled(paramBoolean);
    AppMethodBeat.o(84761);
  }

  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    AppMethodBeat.i(84756);
    this.AQf.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
    AppMethodBeat.o(84756);
  }

  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    AppMethodBeat.i(84751);
    this.AQf.getSettings().setLoadWithOverviewMode(paramBoolean);
    AppMethodBeat.o(84751);
  }

  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    AppMethodBeat.i(84758);
    this.AQf.getSettings().setLoadsImagesAutomatically(paramBoolean);
    AppMethodBeat.o(84758);
  }

  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(84748);
    if (Build.VERSION.SDK_INT >= 17)
      this.AQf.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
    AppMethodBeat.o(84748);
  }

  public final void setPluginsEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84762);
    e.c(this.AQf.getSettings(), "setPluginsEnabled", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(84762);
  }

  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority)
  {
    AppMethodBeat.i(84774);
    this.AQf.getSettings().setRenderPriority(paramRenderPriority);
    AppMethodBeat.o(84774);
  }

  public final void setSupportZoom(boolean paramBoolean)
  {
    AppMethodBeat.i(84747);
    this.AQf.getSettings().setSupportZoom(paramBoolean);
    AppMethodBeat.o(84747);
  }

  public final void setTextZoom(int paramInt)
  {
    AppMethodBeat.i(84754);
    this.AQf.getSettings().setTextZoom(paramInt);
    AppMethodBeat.o(84754);
  }

  public final void setUseWideViewPort(boolean paramBoolean)
  {
    AppMethodBeat.i(84755);
    this.AQf.getSettings().setUseWideViewPort(paramBoolean);
    AppMethodBeat.o(84755);
  }

  public final void setUserAgentString(String paramString)
  {
    AppMethodBeat.i(84772);
    this.AQg = paramString;
    this.AQf.getSettings().setUserAgentString(paramString);
    AppMethodBeat.o(84772);
  }

  public final void setUsingForAppBrand(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.f
 * JD-Core Version:    0.6.2
 */