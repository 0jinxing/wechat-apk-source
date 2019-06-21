package com.tencent.xweb.xwalk;

import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.p;
import org.xwalk.core.XWalkSettings;
import org.xwalk.core.XWalkView;

public final class k extends p
{
  XWalkView ASC;

  public k(XWalkView paramXWalkView)
  {
    this.ASC = paramXWalkView;
  }

  public final void dUa()
  {
  }

  public final void dUb()
  {
    AppMethodBeat.i(85352);
    this.ASC.getSettings().setSaveFormData(false);
    AppMethodBeat.o(85352);
  }

  public final void dUc()
  {
  }

  public final void dUd()
  {
    AppMethodBeat.i(85356);
    this.ASC.getSettings().setDefaultFontSize(8);
    AppMethodBeat.o(85356);
  }

  public final void dUe()
  {
    AppMethodBeat.i(85361);
    this.ASC.getSettings().setAppCacheEnabled(true);
    AppMethodBeat.o(85361);
  }

  public final void dUf()
  {
  }

  public final void dUg()
  {
    AppMethodBeat.i(85363);
    this.ASC.getSettings().setDatabaseEnabled(true);
    AppMethodBeat.o(85363);
  }

  public final void dUh()
  {
    AppMethodBeat.i(85364);
    this.ASC.getSettings().setDomStorageEnabled(true);
    AppMethodBeat.o(85364);
  }

  public final void dUi()
  {
    AppMethodBeat.i(85368);
    this.ASC.getSettings().setCacheMode(-1);
    AppMethodBeat.o(85368);
  }

  public final void dUj()
  {
  }

  public final boolean getBlockNetworkImage()
  {
    AppMethodBeat.i(85359);
    boolean bool = this.ASC.getSettings().getBlockNetworkImage();
    AppMethodBeat.o(85359);
    return bool;
  }

  public final String getUserAgentString()
  {
    AppMethodBeat.i(85367);
    String str = this.ASC.getUserAgentString();
    AppMethodBeat.o(85367);
    return str;
  }

  public final void setAppCachePath(String paramString)
  {
    AppMethodBeat.i(85362);
    this.ASC.getSettings().setAppCachePath(paramString);
    AppMethodBeat.o(85362);
  }

  public final void setBlockNetworkImage(boolean paramBoolean)
  {
    AppMethodBeat.i(85358);
    this.ASC.getSettings().setBlockNetworkImage(paramBoolean);
    AppMethodBeat.o(85358);
  }

  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    AppMethodBeat.i(85350);
    this.ASC.getSettings().setBuiltInZoomControls(paramBoolean);
    AppMethodBeat.o(85350);
  }

  public final void setDatabasePath(String paramString)
  {
  }

  public final void setDefaultTextEncodingName(String paramString)
  {
  }

  public final void setGeolocationEnabled(boolean paramBoolean)
  {
  }

  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    AppMethodBeat.i(85365);
    this.ASC.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
    AppMethodBeat.o(85365);
  }

  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(85360);
    this.ASC.getSettings().setJavaScriptEnabled(paramBoolean);
    AppMethodBeat.o(85360);
  }

  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    AppMethodBeat.i(85355);
    paramLayoutAlgorithm = org.xwalk.core.XWalkSettings.LayoutAlgorithm.values()[paramLayoutAlgorithm.ordinal()];
    this.ASC.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
    AppMethodBeat.o(85355);
  }

  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    AppMethodBeat.i(85351);
    this.ASC.getSettings().setLoadWithOverviewMode(paramBoolean);
    AppMethodBeat.o(85351);
  }

  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    AppMethodBeat.i(85357);
    this.ASC.getSettings().setLoadsImagesAutomatically(paramBoolean);
    AppMethodBeat.o(85357);
  }

  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(85348);
    this.ASC.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
    AppMethodBeat.o(85348);
  }

  public final void setPluginsEnabled(boolean paramBoolean)
  {
  }

  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority)
  {
  }

  public final void setSupportZoom(boolean paramBoolean)
  {
    AppMethodBeat.i(85347);
    this.ASC.getSettings().setSupportZoom(paramBoolean);
    AppMethodBeat.o(85347);
  }

  public final void setTextZoom(int paramInt)
  {
    AppMethodBeat.i(85353);
    this.ASC.getSettings().setTextZoom(paramInt);
    AppMethodBeat.o(85353);
  }

  public final void setUseWideViewPort(boolean paramBoolean)
  {
    AppMethodBeat.i(85354);
    this.ASC.getSettings().setUseWideViewPort(paramBoolean);
    AppMethodBeat.o(85354);
  }

  public final void setUserAgentString(String paramString)
  {
    AppMethodBeat.i(85366);
    this.ASC.getSettings().setUserAgentString(paramString);
    AppMethodBeat.o(85366);
  }

  public final void setUsingForAppBrand(int paramInt)
  {
    AppMethodBeat.i(85349);
    this.ASC.getSettings().setUsingForAppBrand(paramInt);
    AppMethodBeat.o(85349);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.k
 * JD-Core Version:    0.6.2
 */