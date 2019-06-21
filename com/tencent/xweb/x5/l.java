package com.tencent.xweb.x5;

import android.os.Bundle;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.TextSize;
import com.tencent.smtt.sdk.WebView;
import com.tencent.xweb.p;
import com.tencent.xweb.p.a;
import org.a.a;
import org.xwalk.core.Log;

public final class l extends p
{
  WebView AQT;
  private int AQU = 0;

  public l(WebView paramWebView)
  {
    this.AQT = paramWebView;
  }

  public final void a(p.a parama)
  {
    try
    {
      AppMethodBeat.i(84970);
      this.AQT.getSettings().setTextSize(WebSettings.TextSize.valueOf(parama.name()));
      AppMethodBeat.o(84970);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final void dUa()
  {
    AppMethodBeat.i(84965);
    this.AQT.getSettings().setDisplayZoomControls(false);
    AppMethodBeat.o(84965);
  }

  public final void dUb()
  {
    AppMethodBeat.i(84967);
    this.AQT.getSettings().setSaveFormData(false);
    AppMethodBeat.o(84967);
  }

  public final void dUc()
  {
    AppMethodBeat.i(84968);
    this.AQT.getSettings().setSavePassword(false);
    AppMethodBeat.o(84968);
  }

  public final void dUd()
  {
    AppMethodBeat.i(84973);
    this.AQT.getSettings().setDefaultFontSize(8);
    AppMethodBeat.o(84973);
  }

  public final void dUe()
  {
    AppMethodBeat.i(84980);
    this.AQT.getSettings().setAppCacheEnabled(true);
    AppMethodBeat.o(84980);
  }

  public final void dUf()
  {
    AppMethodBeat.i(84982);
    this.AQT.getSettings().setAppCacheMaxSize(10485760L);
    AppMethodBeat.o(84982);
  }

  public final void dUg()
  {
    AppMethodBeat.i(84983);
    this.AQT.getSettings().setDatabaseEnabled(true);
    AppMethodBeat.o(84983);
  }

  public final void dUh()
  {
    AppMethodBeat.i(84984);
    this.AQT.getSettings().setDomStorageEnabled(true);
    AppMethodBeat.o(84984);
  }

  public final void dUi()
  {
    AppMethodBeat.i(84991);
    this.AQT.getSettings().setCacheMode(-1);
    AppMethodBeat.o(84991);
  }

  public final void dUj()
  {
    AppMethodBeat.i(84992);
    this.AQT.getSettings().setMixedContentMode(0);
    AppMethodBeat.o(84992);
  }

  public final boolean getBlockNetworkImage()
  {
    AppMethodBeat.i(84976);
    boolean bool = this.AQT.getSettings().getBlockNetworkImage();
    AppMethodBeat.o(84976);
    return bool;
  }

  public final String getUserAgentString()
  {
    AppMethodBeat.i(84989);
    String str = this.AQT.getSettings().getUserAgentString();
    AppMethodBeat.o(84989);
    return str;
  }

  public final void setAppCachePath(String paramString)
  {
    AppMethodBeat.i(84981);
    this.AQT.getSettings().setAppCachePath(paramString);
    AppMethodBeat.o(84981);
  }

  public final void setBlockNetworkImage(boolean paramBoolean)
  {
    AppMethodBeat.i(84975);
    this.AQT.getSettings().setBlockNetworkImage(paramBoolean);
    AppMethodBeat.o(84975);
  }

  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    AppMethodBeat.i(84964);
    this.AQT.getSettings().setBuiltInZoomControls(paramBoolean);
    AppMethodBeat.o(84964);
  }

  public final void setDatabasePath(String paramString)
  {
    AppMethodBeat.i(84979);
    this.AQT.getSettings().setDatabasePath(paramString);
    AppMethodBeat.o(84979);
  }

  public final void setDefaultTextEncodingName(String paramString)
  {
    AppMethodBeat.i(84987);
    this.AQT.getSettings().setDefaultTextEncodingName(paramString);
    AppMethodBeat.o(84987);
  }

  public final void setGeolocationEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84985);
    this.AQT.getSettings().setGeolocationEnabled(paramBoolean);
    AppMethodBeat.o(84985);
  }

  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    AppMethodBeat.i(84986);
    this.AQT.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
    AppMethodBeat.o(84986);
  }

  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84977);
    this.AQT.getSettings().setJavaScriptEnabled(paramBoolean);
    AppMethodBeat.o(84977);
  }

  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    AppMethodBeat.i(84972);
    paramLayoutAlgorithm = com.tencent.smtt.sdk.WebSettings.LayoutAlgorithm.values()[paramLayoutAlgorithm.ordinal()];
    this.AQT.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
    AppMethodBeat.o(84972);
  }

  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    AppMethodBeat.i(84966);
    this.AQT.getSettings().setLoadWithOverviewMode(paramBoolean);
    AppMethodBeat.o(84966);
  }

  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    AppMethodBeat.i(84974);
    this.AQT.getSettings().setLoadsImagesAutomatically(paramBoolean);
    AppMethodBeat.o(84974);
  }

  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(84963);
    this.AQT.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
    AppMethodBeat.o(84963);
  }

  public final void setPluginsEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84978);
    this.AQT.getSettings().setPluginsEnabled(paramBoolean);
    AppMethodBeat.o(84978);
  }

  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority)
  {
    AppMethodBeat.i(84990);
    paramRenderPriority = com.tencent.smtt.sdk.WebSettings.RenderPriority.values()[paramRenderPriority.ordinal()];
    this.AQT.getSettings().setRenderPriority(paramRenderPriority);
    AppMethodBeat.o(84990);
  }

  public final void setSupportZoom(boolean paramBoolean)
  {
    AppMethodBeat.i(84962);
    this.AQT.getSettings().setSupportZoom(paramBoolean);
    AppMethodBeat.o(84962);
  }

  public final void setTextZoom(int paramInt)
  {
    AppMethodBeat.i(84969);
    this.AQT.getSettings().setTextZoom(paramInt);
    AppMethodBeat.o(84969);
  }

  public final void setUseWideViewPort(boolean paramBoolean)
  {
    AppMethodBeat.i(84971);
    this.AQT.getSettings().setUseWideViewPort(paramBoolean);
    AppMethodBeat.o(84971);
  }

  public final void setUserAgentString(String paramString)
  {
    AppMethodBeat.i(84988);
    this.AQT.getSettings().setUserAgentString(paramString);
    AppMethodBeat.o(84988);
  }

  public final void setUsingForAppBrand(int paramInt)
  {
    AppMethodBeat.i(84993);
    this.AQU = paramInt;
    if (this.AQT.getX5WebViewExtension() == null)
    {
      AppMethodBeat.o(84993);
      return;
    }
    switch (this.AQU)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      while (true)
      {
        AppMethodBeat.o(84993);
        break;
        Bundle localBundle1 = new Bundle(1);
        localBundle1.putInt("flag", 1);
        this.AQT.getX5WebViewExtension().invokeMiscMethod("setMiniProgramFlag", localBundle1);
        try
        {
          a.ep(this.AQT.getX5WebViewExtension()).u("setEnableAutoPageDiscarding", new Object[] { Boolean.FALSE });
          a.ep(this.AQT.getX5WebViewExtension()).u("setEnableAutoPageRestoration", new Object[] { Boolean.FALSE });
          AppMethodBeat.o(84993);
        }
        catch (Exception localException)
        {
          Log.e("XWEB.X5WebViewSettings", "DisableAutoPageDiscarding error ".concat(String.valueOf(localException)));
          AppMethodBeat.o(84993);
        }
      }
      break;
      Bundle localBundle2 = new Bundle(1);
      localBundle2.putInt("flag", 2);
      this.AQT.getX5WebViewExtension().invokeMiscMethod("setMiniProgramFlag", localBundle2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.l
 * JD-Core Version:    0.6.2
 */