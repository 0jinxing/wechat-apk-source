package com.tencent.smtt.export.external.interfaces;

import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IX5WebSettings
{
  public static final int DEFAULT_CACHE_CAPACITY = 15;
  public static final int LOAD_CACHE_AD = 100;
  public static final int LOAD_CACHE_ELSE_NETWORK = 1;
  public static final int LOAD_CACHE_ONLY = 3;
  public static final int LOAD_DEFAULT = -1;
  public static final int LOAD_NORMAL = 0;
  public static final int LOAD_NO_CACHE = 2;

  public abstract boolean enableSmoothTransition();

  public abstract boolean getAllowContentAccess();

  public abstract boolean getAllowFileAccess();

  public abstract boolean getBlockNetworkImage();

  public abstract boolean getBlockNetworkLoads();

  public abstract boolean getBuiltInZoomControls();

  public abstract int getCacheMode();

  public abstract String getCursiveFontFamily();

  public abstract boolean getDatabaseEnabled();

  public abstract String getDatabasePath();

  public abstract int getDefaultFixedFontSize();

  public abstract int getDefaultFontSize();

  public abstract String getDefaultTextEncodingName();

  public abstract ZoomDensity getDefaultZoom();

  public abstract boolean getDisplayZoomControls();

  public abstract boolean getDomStorageEnabled();

  public abstract String getFantasyFontFamily();

  public abstract String getFixedFontFamily();

  public abstract boolean getJavaScriptCanOpenWindowsAutomatically();

  public abstract boolean getJavaScriptEnabled();

  public abstract IX5WebSettings.LayoutAlgorithm getLayoutAlgorithm();

  public abstract boolean getLightTouchEnabled();

  public abstract boolean getLoadWithOverviewMode();

  public abstract boolean getLoadsImagesAutomatically();

  public abstract boolean getMediaPlaybackRequiresUserGesture();

  public abstract int getMinimumFontSize();

  public abstract int getMinimumLogicalFontSize();

  public abstract int getMixedContentMode();

  public abstract boolean getNavDump();

  public abstract IX5WebSettings.PluginState getPluginState();

  public abstract boolean getPluginsEnabled();

  public abstract String getPluginsPath();

  public abstract String getSansSerifFontFamily();

  public abstract boolean getSaveFormData();

  public abstract boolean getSavePassword();

  public abstract String getSerifFontFamily();

  public abstract String getStandardFontFamily();

  public abstract IX5WebSettings.TextSize getTextSize();

  public abstract int getTextZoom();

  public abstract boolean getUseWebViewBackgroundForOverscrollBackground();

  public abstract boolean getUseWideViewPort();

  public abstract String getUserAgent();

  public abstract String getUserAgentString();

  public abstract void setAllowContentAccess(boolean paramBoolean);

  public abstract void setAllowFileAccess(boolean paramBoolean);

  public abstract void setAllowFileAccessFromFileURLs(boolean paramBoolean);

  public abstract void setAllowUniversalAccessFromFileURLs(boolean paramBoolean);

  public abstract void setAppCacheEnabled(boolean paramBoolean);

  public abstract void setAppCacheMaxSize(long paramLong);

  public abstract void setAppCachePath(String paramString);

  public abstract void setBlockNetworkImage(boolean paramBoolean);

  public abstract void setBlockNetworkLoads(boolean paramBoolean);

  public abstract void setBuiltInZoomControls(boolean paramBoolean);

  public abstract void setCacheMode(int paramInt);

  public abstract void setCursiveFontFamily(String paramString);

  public abstract void setDatabaseEnabled(boolean paramBoolean);

  public abstract void setDatabasePath(String paramString);

  public abstract void setDefaultDatabasePath(boolean paramBoolean);

  public abstract void setDefaultFixedFontSize(int paramInt);

  public abstract void setDefaultFontSize(int paramInt);

  public abstract void setDefaultTextEncodingName(String paramString);

  public abstract void setDefaultZoom(ZoomDensity paramZoomDensity);

  public abstract void setDisplayZoomControls(boolean paramBoolean);

  public abstract void setDomStorageEnabled(boolean paramBoolean);

  public abstract void setEnableSmoothTransition(boolean paramBoolean);

  public abstract void setFantasyFontFamily(String paramString);

  public abstract void setFixedFontFamily(String paramString);

  public abstract void setGeolocationDatabasePath(String paramString);

  public abstract void setGeolocationEnabled(boolean paramBoolean);

  public abstract void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean);

  public abstract void setJavaScriptEnabled(boolean paramBoolean);

  public abstract void setLayoutAlgorithm(IX5WebSettings.LayoutAlgorithm paramLayoutAlgorithm);

  public abstract void setLightTouchEnabled(boolean paramBoolean);

  public abstract void setLoadWithOverviewMode(boolean paramBoolean);

  public abstract void setLoadsImagesAutomatically(boolean paramBoolean);

  public abstract void setMediaPlaybackRequiresUserGesture(boolean paramBoolean);

  public abstract void setMinimumFontSize(int paramInt);

  public abstract void setMinimumLogicalFontSize(int paramInt);

  public abstract void setNavDump(boolean paramBoolean);

  public abstract void setNeedInitialFocus(boolean paramBoolean);

  public abstract void setPluginEnabled(boolean paramBoolean);

  public abstract void setPluginState(IX5WebSettings.PluginState paramPluginState);

  public abstract void setPluginsEnabled(boolean paramBoolean);

  public abstract void setPluginsPath(String paramString);

  public abstract void setRenderPriority(IX5WebSettings.RenderPriority paramRenderPriority);

  public abstract void setSansSerifFontFamily(String paramString);

  public abstract void setSaveFormData(boolean paramBoolean);

  public abstract void setSavePassword(boolean paramBoolean);

  public abstract void setSerifFontFamily(String paramString);

  public abstract void setStandardFontFamily(String paramString);

  public abstract void setSupportMultipleWindows(boolean paramBoolean);

  public abstract void setSupportZoom(boolean paramBoolean);

  public abstract void setTextSize(IX5WebSettings.TextSize paramTextSize);

  public abstract void setTextZoom(int paramInt);

  public abstract void setUseWebViewBackgroundForOverscrollBackground(boolean paramBoolean);

  public abstract void setUseWideViewPort(boolean paramBoolean);

  public abstract void setUserAgent(String paramString);

  public abstract void setUserAgent(String paramString, boolean paramBoolean);

  public abstract void setUserAgentString(String paramString);

  public abstract boolean supportMultipleWindows();

  public abstract boolean supportZoom();

  public static enum ZoomDensity
  {
    int value;

    static
    {
      AppMethodBeat.i(63815);
      FAR = new ZoomDensity("FAR", 0, 150);
      MEDIUM = new ZoomDensity("MEDIUM", 1, 100);
      CLOSE = new ZoomDensity("CLOSE", 2, 75);
      $VALUES = new ZoomDensity[] { FAR, MEDIUM, CLOSE };
      AppMethodBeat.o(63815);
    }

    private ZoomDensity(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebSettings
 * JD-Core Version:    0.6.2
 */