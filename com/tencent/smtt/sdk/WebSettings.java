package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.LayoutAlgorithm;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.PluginState;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.RenderPriority;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.TextSize;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings.ZoomDensity;
import com.tencent.smtt.utils.r;

public class WebSettings
{
  public static final int LOAD_CACHE_ELSE_NETWORK = 1;
  public static final int LOAD_CACHE_ONLY = 3;
  public static final int LOAD_DEFAULT = -1;
  public static final int LOAD_NORMAL = 0;
  public static final int LOAD_NO_CACHE = 2;
  private IX5WebSettings a = null;
  private android.webkit.WebSettings b = null;
  private boolean c = false;

  WebSettings(android.webkit.WebSettings paramWebSettings)
  {
    this.a = null;
    this.b = paramWebSettings;
    this.c = false;
  }

  WebSettings(IX5WebSettings paramIX5WebSettings)
  {
    this.a = paramIX5WebSettings;
    this.b = null;
    this.c = true;
  }

  @TargetApi(17)
  public static String getDefaultUserAgent(Context paramContext)
  {
    AppMethodBeat.i(64816);
    if (bv.a().b())
    {
      paramContext = bv.a().c().i(paramContext);
      AppMethodBeat.o(64816);
    }
    while (true)
    {
      return paramContext;
      if (Build.VERSION.SDK_INT < 17)
      {
        AppMethodBeat.o(64816);
        paramContext = null;
      }
      else
      {
        paramContext = r.a(android.webkit.WebSettings.class, "getDefaultUserAgent", new Class[] { Context.class }, new Object[] { paramContext });
        if (paramContext == null)
        {
          AppMethodBeat.o(64816);
          paramContext = null;
        }
        else
        {
          paramContext = (String)paramContext;
          AppMethodBeat.o(64816);
        }
      }
    }
  }

  @Deprecated
  public boolean enableSmoothTransition()
  {
    AppMethodBeat.i(64741);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.enableSmoothTransition();
      AppMethodBeat.o(64741);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT >= 11)
        {
          Object localObject = r.a(this.b, "enableSmoothTransition");
          if (localObject == null)
          {
            AppMethodBeat.o(64741);
            bool = false;
          }
          else
          {
            bool = ((Boolean)localObject).booleanValue();
            AppMethodBeat.o(64741);
          }
        }
        else
        {
          AppMethodBeat.o(64741);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(64741);
        bool = false;
      }
    }
  }

  @TargetApi(11)
  public boolean getAllowContentAccess()
  {
    AppMethodBeat.i(64737);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getAllowContentAccess();
      AppMethodBeat.o(64737);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT >= 11)
        {
          Object localObject = r.a(this.b, "getAllowContentAccess");
          if (localObject == null)
          {
            AppMethodBeat.o(64737);
            bool = false;
          }
          else
          {
            bool = ((Boolean)localObject).booleanValue();
            AppMethodBeat.o(64737);
          }
        }
        else
        {
          AppMethodBeat.o(64737);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(64737);
        bool = false;
      }
    }
  }

  @TargetApi(3)
  public boolean getAllowFileAccess()
  {
    AppMethodBeat.i(64734);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getAllowFileAccess();
      AppMethodBeat.o(64734);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        bool = this.b.getAllowFileAccess();
        AppMethodBeat.o(64734);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(64734);
      }
    }
  }

  public boolean getBlockNetworkImage()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64788);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getBlockNetworkImage();
          AppMethodBeat.o(64788);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.getBlockNetworkImage();
          AppMethodBeat.o(64788);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64788);
    }
  }

  @TargetApi(8)
  public boolean getBlockNetworkLoads()
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(64790);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getBlockNetworkLoads();
          AppMethodBeat.o(64790);
          return bool;
        }
        if ((this.c) || (this.b == null))
          break label93;
        if (Build.VERSION.SDK_INT >= 8)
        {
          bool = this.b.getBlockNetworkLoads();
          AppMethodBeat.o(64790);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64790);
      continue;
      label93: AppMethodBeat.o(64790);
    }
  }

  @TargetApi(3)
  public boolean getBuiltInZoomControls()
  {
    AppMethodBeat.i(64730);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getBuiltInZoomControls();
      AppMethodBeat.o(64730);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        bool = this.b.getBuiltInZoomControls();
        AppMethodBeat.o(64730);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(64730);
      }
    }
  }

  public int getCacheMode()
  {
    AppMethodBeat.i(64822);
    int i;
    if ((this.c) && (this.a != null))
    {
      i = this.a.getCacheMode();
      AppMethodBeat.o(64822);
    }
    while (true)
    {
      return i;
      if ((!this.c) && (this.b != null))
      {
        i = this.b.getCacheMode();
        AppMethodBeat.o(64822);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(64822);
      }
    }
  }

  public String getCursiveFontFamily()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64774);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getCursiveFontFamily();
          AppMethodBeat.o(64774);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getCursiveFontFamily();
          AppMethodBeat.o(64774);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64774);
    }
  }

  @TargetApi(5)
  public boolean getDatabaseEnabled()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64806);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getDatabaseEnabled();
          AppMethodBeat.o(64806);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.getDatabaseEnabled();
          AppMethodBeat.o(64806);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64806);
    }
  }

  @TargetApi(5)
  public String getDatabasePath()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64805);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getDatabasePath();
          AppMethodBeat.o(64805);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getDatabasePath();
          AppMethodBeat.o(64805);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64805);
    }
  }

  public int getDefaultFixedFontSize()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64784);
        if ((this.c) && (this.a != null))
        {
          i = this.a.getDefaultFixedFontSize();
          AppMethodBeat.o(64784);
          return i;
        }
        if ((!this.c) && (this.b != null))
        {
          i = this.b.getDefaultFixedFontSize();
          AppMethodBeat.o(64784);
          continue;
        }
      }
      finally
      {
      }
      int i = 0;
      AppMethodBeat.o(64784);
    }
  }

  public int getDefaultFontSize()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64782);
        if ((this.c) && (this.a != null))
        {
          i = this.a.getDefaultFontSize();
          AppMethodBeat.o(64782);
          return i;
        }
        if ((!this.c) && (this.b != null))
        {
          i = this.b.getDefaultFontSize();
          AppMethodBeat.o(64782);
          continue;
        }
      }
      finally
      {
      }
      int i = 0;
      AppMethodBeat.o(64782);
    }
  }

  public String getDefaultTextEncodingName()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64815);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getDefaultTextEncodingName();
          AppMethodBeat.o(64815);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getDefaultTextEncodingName();
          AppMethodBeat.o(64815);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64815);
    }
  }

  @TargetApi(7)
  public WebSettings.ZoomDensity getDefaultZoom()
  {
    AppMethodBeat.i(64753);
    WebSettings.ZoomDensity localZoomDensity;
    if ((this.c) && (this.a != null))
    {
      localZoomDensity = WebSettings.ZoomDensity.valueOf(this.a.getDefaultZoom().name());
      AppMethodBeat.o(64753);
    }
    while (true)
    {
      return localZoomDensity;
      if ((!this.c) && (this.b != null))
      {
        localZoomDensity = WebSettings.ZoomDensity.valueOf(this.b.getDefaultZoom().name());
        AppMethodBeat.o(64753);
      }
      else
      {
        localZoomDensity = null;
        AppMethodBeat.o(64753);
      }
    }
  }

  @TargetApi(11)
  public boolean getDisplayZoomControls()
  {
    AppMethodBeat.i(64732);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getDisplayZoomControls();
      AppMethodBeat.o(64732);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT >= 11)
        {
          Object localObject = r.a(this.b, "getDisplayZoomControls");
          if (localObject == null)
          {
            AppMethodBeat.o(64732);
            bool = false;
          }
          else
          {
            bool = ((Boolean)localObject).booleanValue();
            AppMethodBeat.o(64732);
          }
        }
        else
        {
          AppMethodBeat.o(64732);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(64732);
        bool = false;
      }
    }
  }

  @TargetApi(7)
  public boolean getDomStorageEnabled()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64804);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getDomStorageEnabled();
          AppMethodBeat.o(64804);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.getDomStorageEnabled();
          AppMethodBeat.o(64804);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64804);
    }
  }

  public String getFantasyFontFamily()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64776);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getFantasyFontFamily();
          AppMethodBeat.o(64776);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getFantasyFontFamily();
          AppMethodBeat.o(64776);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64776);
    }
  }

  public String getFixedFontFamily()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64768);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getFixedFontFamily();
          AppMethodBeat.o(64768);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getFixedFontFamily();
          AppMethodBeat.o(64768);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64768);
    }
  }

  public boolean getJavaScriptCanOpenWindowsAutomatically()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64813);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getJavaScriptCanOpenWindowsAutomatically();
          AppMethodBeat.o(64813);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.getJavaScriptCanOpenWindowsAutomatically();
          AppMethodBeat.o(64813);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64813);
    }
  }

  public boolean getJavaScriptEnabled()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64808);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getJavaScriptEnabled();
          AppMethodBeat.o(64808);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.getJavaScriptEnabled();
          AppMethodBeat.o(64808);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64808);
    }
  }

  public WebSettings.LayoutAlgorithm getLayoutAlgorithm()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64764);
        WebSettings.LayoutAlgorithm localLayoutAlgorithm;
        if ((this.c) && (this.a != null))
        {
          localLayoutAlgorithm = WebSettings.LayoutAlgorithm.valueOf(this.a.getLayoutAlgorithm().name());
          AppMethodBeat.o(64764);
          return localLayoutAlgorithm;
        }
        if ((!this.c) && (this.b != null))
        {
          localLayoutAlgorithm = WebSettings.LayoutAlgorithm.valueOf(this.b.getLayoutAlgorithm().name());
          AppMethodBeat.o(64764);
          continue;
        }
      }
      finally
      {
      }
      Object localObject2 = null;
      AppMethodBeat.o(64764);
    }
  }

  public boolean getLightTouchEnabled()
  {
    AppMethodBeat.i(64755);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getLightTouchEnabled();
      AppMethodBeat.o(64755);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        bool = this.b.getLightTouchEnabled();
        AppMethodBeat.o(64755);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(64755);
      }
    }
  }

  @TargetApi(7)
  public boolean getLoadWithOverviewMode()
  {
    AppMethodBeat.i(64739);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getLoadWithOverviewMode();
      AppMethodBeat.o(64739);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        bool = this.b.getLoadWithOverviewMode();
        AppMethodBeat.o(64739);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(64739);
      }
    }
  }

  public boolean getLoadsImagesAutomatically()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64786);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getLoadsImagesAutomatically();
          AppMethodBeat.o(64786);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.getLoadsImagesAutomatically();
          AppMethodBeat.o(64786);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64786);
    }
  }

  @TargetApi(17)
  public boolean getMediaPlaybackRequiresUserGesture()
  {
    AppMethodBeat.i(64817);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getMediaPlaybackRequiresUserGesture();
      AppMethodBeat.o(64817);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT < 17)
        {
          AppMethodBeat.o(64817);
          bool = false;
        }
        else
        {
          Object localObject = r.a(this.b, "getMediaPlaybackRequiresUserGesture");
          if (localObject == null)
          {
            AppMethodBeat.o(64817);
            bool = false;
          }
          else
          {
            bool = ((Boolean)localObject).booleanValue();
            AppMethodBeat.o(64817);
          }
        }
      }
      else
      {
        AppMethodBeat.o(64817);
        bool = false;
      }
    }
  }

  public int getMinimumFontSize()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64778);
        if ((this.c) && (this.a != null))
        {
          i = this.a.getMinimumFontSize();
          AppMethodBeat.o(64778);
          return i;
        }
        if ((!this.c) && (this.b != null))
        {
          i = this.b.getMinimumFontSize();
          AppMethodBeat.o(64778);
          continue;
        }
      }
      finally
      {
      }
      int i = 0;
      AppMethodBeat.o(64778);
    }
  }

  public int getMinimumLogicalFontSize()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64780);
        if ((this.c) && (this.a != null))
        {
          i = this.a.getMinimumLogicalFontSize();
          AppMethodBeat.o(64780);
          return i;
        }
        if ((!this.c) && (this.b != null))
        {
          i = this.b.getMinimumLogicalFontSize();
          AppMethodBeat.o(64780);
          continue;
        }
      }
      finally
      {
      }
      int i = 0;
      AppMethodBeat.o(64780);
    }
  }

  public int getMixedContentMode()
  {
    try
    {
      AppMethodBeat.i(64725);
      if (this.c)
      {
        IX5WebSettings localIX5WebSettings = this.a;
        if (localIX5WebSettings == null);
      }
      while (true)
      {
        int i;
        try
        {
          i = this.a.getMixedContentMode();
          AppMethodBeat.o(64725);
          return i;
        }
        catch (Throwable localThrowable)
        {
          AppMethodBeat.o(64725);
          i = -1;
          continue;
        }
        if (Build.VERSION.SDK_INT < 21)
        {
          AppMethodBeat.o(64725);
          i = -1;
        }
        else
        {
          Object localObject1 = r.a(this.b, "getMixedContentMode", new Class[0], new Object[0]);
          if (localObject1 == null)
          {
            AppMethodBeat.o(64725);
            i = -1;
          }
          else
          {
            i = ((Integer)localObject1).intValue();
            AppMethodBeat.o(64725);
          }
        }
      }
    }
    finally
    {
    }
  }

  public boolean getNavDump()
  {
    AppMethodBeat.i(64726);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getNavDump();
      AppMethodBeat.o(64726);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        Object localObject = r.a(this.b, "getNavDump");
        if (localObject == null)
        {
          AppMethodBeat.o(64726);
          bool = false;
        }
        else
        {
          bool = ((Boolean)localObject).booleanValue();
          AppMethodBeat.o(64726);
        }
      }
      else
      {
        AppMethodBeat.o(64726);
        bool = false;
      }
    }
  }

  @Deprecated
  @TargetApi(8)
  public WebSettings.PluginState getPluginState()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64810);
        Object localObject1;
        if ((this.c) && (this.a != null))
        {
          localObject1 = WebSettings.PluginState.valueOf(this.a.getPluginState().name());
          AppMethodBeat.o(64810);
          return localObject1;
        }
        if ((this.c) || (this.b == null))
          break label132;
        if (Build.VERSION.SDK_INT >= 8)
        {
          localObject1 = r.a(this.b, "getPluginState");
          if (localObject1 == null)
          {
            AppMethodBeat.o(64810);
            localObject1 = null;
            continue;
          }
          localObject1 = WebSettings.PluginState.valueOf(((android.webkit.WebSettings.PluginState)localObject1).name());
          AppMethodBeat.o(64810);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64810);
      Object localObject3 = null;
      continue;
      label132: AppMethodBeat.o(64810);
      localObject3 = null;
    }
  }

  @Deprecated
  @TargetApi(8)
  public boolean getPluginsEnabled()
  {
    while (true)
    {
      boolean bool;
      try
      {
        AppMethodBeat.i(64809);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getPluginsEnabled();
          AppMethodBeat.o(64809);
          return bool;
        }
        if ((this.c) || (this.b == null))
          break label168;
        if (Build.VERSION.SDK_INT <= 17)
        {
          Object localObject1 = r.a(this.b, "getPluginsEnabled");
          if (localObject1 == null)
          {
            AppMethodBeat.o(64809);
            bool = false;
            continue;
          }
          bool = ((Boolean)localObject1).booleanValue();
          AppMethodBeat.o(64809);
          continue;
        }
      }
      finally
      {
      }
      if (Build.VERSION.SDK_INT == 18)
      {
        android.webkit.WebSettings.PluginState localPluginState = this.b.getPluginState();
        if (android.webkit.WebSettings.PluginState.ON == localPluginState)
        {
          bool = true;
          AppMethodBeat.o(64809);
        }
        else
        {
          AppMethodBeat.o(64809);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(64809);
        bool = false;
        continue;
        label168: AppMethodBeat.o(64809);
        bool = false;
      }
    }
  }

  @Deprecated
  public String getPluginsPath()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64811);
        if ((this.c) && (this.a != null))
        {
          localObject1 = this.a.getPluginsPath();
          AppMethodBeat.o(64811);
          return localObject1;
        }
        if ((this.c) || (this.b == null))
          break label121;
        if (Build.VERSION.SDK_INT > 17)
          break label109;
        Object localObject1 = r.a(this.b, "getPluginsPath");
        if (localObject1 == null)
        {
          localObject1 = null;
          AppMethodBeat.o(64811);
          continue;
        }
      }
      finally
      {
      }
      String str = (String)localObject2;
      AppMethodBeat.o(64811);
      continue;
      label109: str = "";
      AppMethodBeat.o(64811);
      continue;
      label121: str = "";
      AppMethodBeat.o(64811);
    }
  }

  public String getSansSerifFontFamily()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64770);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getSansSerifFontFamily();
          AppMethodBeat.o(64770);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getSansSerifFontFamily();
          AppMethodBeat.o(64770);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64770);
    }
  }

  public boolean getSaveFormData()
  {
    AppMethodBeat.i(64745);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getSaveFormData();
      AppMethodBeat.o(64745);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        bool = this.b.getSaveFormData();
        AppMethodBeat.o(64745);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(64745);
      }
    }
  }

  public boolean getSavePassword()
  {
    AppMethodBeat.i(64747);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getSavePassword();
      AppMethodBeat.o(64747);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        bool = this.b.getSavePassword();
        AppMethodBeat.o(64747);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(64747);
      }
    }
  }

  public String getSerifFontFamily()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64772);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getSerifFontFamily();
          AppMethodBeat.o(64772);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getSerifFontFamily();
          AppMethodBeat.o(64772);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64772);
    }
  }

  public String getStandardFontFamily()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64766);
        String str1;
        if ((this.c) && (this.a != null))
        {
          str1 = this.a.getStandardFontFamily();
          AppMethodBeat.o(64766);
          return str1;
        }
        if ((!this.c) && (this.b != null))
        {
          str1 = this.b.getStandardFontFamily();
          AppMethodBeat.o(64766);
          continue;
        }
      }
      finally
      {
      }
      String str2 = "";
      AppMethodBeat.o(64766);
    }
  }

  public TextSize getTextSize()
  {
    AppMethodBeat.i(64751);
    TextSize localTextSize;
    if ((this.c) && (this.a != null))
    {
      localTextSize = TextSize.valueOf(this.a.getTextSize().name());
      AppMethodBeat.o(64751);
    }
    while (true)
    {
      return localTextSize;
      if ((!this.c) && (this.b != null))
      {
        localTextSize = TextSize.valueOf(this.b.getTextSize().name());
        AppMethodBeat.o(64751);
      }
      else
      {
        localTextSize = null;
        AppMethodBeat.o(64751);
      }
    }
  }

  // ERROR //
  @TargetApi(14)
  public int getTextZoom()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 381
    //   5: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 44	com/tencent/smtt/sdk/WebSettings:c	Z
    //   12: ifeq +30 -> 42
    //   15: aload_0
    //   16: getfield 40	com/tencent/smtt/sdk/WebSettings:a	Lcom/tencent/smtt/export/external/interfaces/IX5WebSettings;
    //   19: ifnull +23 -> 42
    //   22: aload_0
    //   23: getfield 40	com/tencent/smtt/sdk/WebSettings:a	Lcom/tencent/smtt/export/external/interfaces/IX5WebSettings;
    //   26: invokeinterface 383 1 0
    //   31: istore_1
    //   32: ldc_w 381
    //   35: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: aload_0
    //   39: monitorexit
    //   40: iload_1
    //   41: ireturn
    //   42: aload_0
    //   43: getfield 44	com/tencent/smtt/sdk/WebSettings:c	Z
    //   46: ifne +95 -> 141
    //   49: aload_0
    //   50: getfield 42	com/tencent/smtt/sdk/WebSettings:b	Landroid/webkit/WebSettings;
    //   53: ifnull +88 -> 141
    //   56: getstatic 81	android/os/Build$VERSION:SDK_INT	I
    //   59: bipush 14
    //   61: if_icmpge +14 -> 75
    //   64: ldc_w 381
    //   67: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   70: iconst_0
    //   71: istore_1
    //   72: goto -34 -> 38
    //   75: aload_0
    //   76: getfield 42	com/tencent/smtt/sdk/WebSettings:b	Landroid/webkit/WebSettings;
    //   79: invokevirtual 384	android/webkit/WebSettings:getTextZoom	()I
    //   82: istore_1
    //   83: ldc_w 381
    //   86: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: goto -51 -> 38
    //   92: astore_2
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_2
    //   96: athrow
    //   97: astore_2
    //   98: aload_0
    //   99: getfield 42	com/tencent/smtt/sdk/WebSettings:b	Landroid/webkit/WebSettings;
    //   102: ldc_w 385
    //   105: invokestatic 107	com/tencent/smtt/utils/r:a	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   108: astore_2
    //   109: aload_2
    //   110: ifnonnull +14 -> 124
    //   113: ldc_w 381
    //   116: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: iconst_0
    //   120: istore_1
    //   121: goto -83 -> 38
    //   124: aload_2
    //   125: checkcast 292	java/lang/Integer
    //   128: invokevirtual 295	java/lang/Integer:intValue	()I
    //   131: istore_1
    //   132: ldc_w 381
    //   135: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: goto -100 -> 38
    //   141: ldc_w 381
    //   144: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: iconst_0
    //   148: istore_1
    //   149: goto -111 -> 38
    //
    // Exception table:
    //   from	to	target	type
    //   2	38	92	finally
    //   42	70	92	finally
    //   75	83	92	finally
    //   83	89	92	finally
    //   98	109	92	finally
    //   113	119	92	finally
    //   124	138	92	finally
    //   141	147	92	finally
    //   75	83	97	java/lang/Exception
  }

  @Deprecated
  public boolean getUseWebViewBackgroundForOverscrollBackground()
  {
    AppMethodBeat.i(64743);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.getUseWebViewBackgroundForOverscrollBackground();
      AppMethodBeat.o(64743);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        Object localObject = r.a(this.b, "getUseWebViewBackgroundForOverscrollBackground");
        if (localObject == null)
        {
          AppMethodBeat.o(64743);
          bool = false;
        }
        else
        {
          bool = ((Boolean)localObject).booleanValue();
          AppMethodBeat.o(64743);
        }
      }
      else
      {
        AppMethodBeat.o(64743);
        bool = false;
      }
    }
  }

  public boolean getUseWideViewPort()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64760);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.getUseWideViewPort();
          AppMethodBeat.o(64760);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.getUseWideViewPort();
          AppMethodBeat.o(64760);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64760);
    }
  }

  @TargetApi(3)
  public String getUserAgentString()
  {
    AppMethodBeat.i(64757);
    String str;
    if ((this.c) && (this.a != null))
    {
      str = this.a.getUserAgentString();
      AppMethodBeat.o(64757);
    }
    while (true)
    {
      return str;
      if ((!this.c) && (this.b != null))
      {
        str = this.b.getUserAgentString();
        AppMethodBeat.o(64757);
      }
      else
      {
        str = "";
        AppMethodBeat.o(64757);
      }
    }
  }

  @TargetApi(11)
  public void setAllowContentAccess(boolean paramBoolean)
  {
    AppMethodBeat.i(64735);
    if ((this.c) && (this.a != null))
    {
      this.a.setAllowContentAccess(paramBoolean);
      AppMethodBeat.o(64735);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT < 11)
        {
          AppMethodBeat.o(64735);
        }
        else
        {
          r.a(this.b, "setAllowContentAccess", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
          AppMethodBeat.o(64735);
        }
      }
      else
        AppMethodBeat.o(64735);
    }
  }

  @TargetApi(3)
  public void setAllowFileAccess(boolean paramBoolean)
  {
    AppMethodBeat.i(64733);
    if ((this.c) && (this.a != null))
    {
      this.a.setAllowFileAccess(paramBoolean);
      AppMethodBeat.o(64733);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setAllowFileAccess(paramBoolean);
        AppMethodBeat.o(64733);
      }
      else
      {
        AppMethodBeat.o(64733);
      }
    }
  }

  @TargetApi(16)
  public void setAllowFileAccessFromFileURLs(boolean paramBoolean)
  {
    AppMethodBeat.i(64793);
    if ((this.c) && (this.a != null))
    {
      this.a.setAllowFileAccessFromFileURLs(paramBoolean);
      AppMethodBeat.o(64793);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        r.a(this.b, "setAllowFileAccessFromFileURLs", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(64793);
      }
      else
      {
        AppMethodBeat.o(64793);
      }
    }
  }

  @TargetApi(16)
  public void setAllowUniversalAccessFromFileURLs(boolean paramBoolean)
  {
    AppMethodBeat.i(64792);
    if ((this.c) && (this.a != null))
    {
      this.a.setAllowUniversalAccessFromFileURLs(paramBoolean);
      AppMethodBeat.o(64792);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        r.a(this.b, "setAllowUniversalAccessFromFileURLs", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(64792);
      }
      else
      {
        AppMethodBeat.o(64792);
      }
    }
  }

  @TargetApi(7)
  public void setAppCacheEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64799);
    if ((this.c) && (this.a != null))
    {
      this.a.setAppCacheEnabled(paramBoolean);
      AppMethodBeat.o(64799);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setAppCacheEnabled(paramBoolean);
        AppMethodBeat.o(64799);
      }
      else
      {
        AppMethodBeat.o(64799);
      }
    }
  }

  @TargetApi(7)
  public void setAppCacheMaxSize(long paramLong)
  {
    AppMethodBeat.i(64801);
    if ((this.c) && (this.a != null))
    {
      this.a.setAppCacheMaxSize(paramLong);
      AppMethodBeat.o(64801);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setAppCacheMaxSize(paramLong);
        AppMethodBeat.o(64801);
      }
      else
      {
        AppMethodBeat.o(64801);
      }
    }
  }

  @TargetApi(7)
  public void setAppCachePath(String paramString)
  {
    AppMethodBeat.i(64800);
    if ((this.c) && (this.a != null))
    {
      this.a.setAppCachePath(paramString);
      AppMethodBeat.o(64800);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setAppCachePath(paramString);
        AppMethodBeat.o(64800);
      }
      else
      {
        AppMethodBeat.o(64800);
      }
    }
  }

  public void setBlockNetworkImage(boolean paramBoolean)
  {
    AppMethodBeat.i(64787);
    if ((this.c) && (this.a != null))
    {
      this.a.setBlockNetworkImage(paramBoolean);
      AppMethodBeat.o(64787);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setBlockNetworkImage(paramBoolean);
        AppMethodBeat.o(64787);
      }
      else
      {
        AppMethodBeat.o(64787);
      }
    }
  }

  @TargetApi(8)
  public void setBlockNetworkLoads(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64789);
        if ((this.c) && (this.a != null))
        {
          this.a.setBlockNetworkLoads(paramBoolean);
          AppMethodBeat.o(64789);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          if (Build.VERSION.SDK_INT < 8)
            break label94;
          this.b.setBlockNetworkLoads(paramBoolean);
          AppMethodBeat.o(64789);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64789);
      continue;
      label94: AppMethodBeat.o(64789);
    }
  }

  @TargetApi(3)
  public void setBuiltInZoomControls(boolean paramBoolean)
  {
    AppMethodBeat.i(64729);
    if ((this.c) && (this.a != null))
    {
      this.a.setBuiltInZoomControls(paramBoolean);
      AppMethodBeat.o(64729);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setBuiltInZoomControls(paramBoolean);
        AppMethodBeat.o(64729);
      }
      else
      {
        AppMethodBeat.o(64729);
      }
    }
  }

  public void setCacheMode(int paramInt)
  {
    AppMethodBeat.i(64821);
    if ((this.c) && (this.a != null))
    {
      this.a.setCacheMode(paramInt);
      AppMethodBeat.o(64821);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setCacheMode(paramInt);
      AppMethodBeat.o(64821);
    }
  }

  public void setCursiveFontFamily(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64773);
        if ((this.c) && (this.a != null))
        {
          this.a.setCursiveFontFamily(paramString);
          AppMethodBeat.o(64773);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setCursiveFontFamily(paramString);
          AppMethodBeat.o(64773);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64773);
    }
  }

  @TargetApi(5)
  public void setDatabaseEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64802);
    if ((this.c) && (this.a != null))
    {
      this.a.setDatabaseEnabled(paramBoolean);
      AppMethodBeat.o(64802);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setDatabaseEnabled(paramBoolean);
        AppMethodBeat.o(64802);
      }
      else
      {
        AppMethodBeat.o(64802);
      }
    }
  }

  @Deprecated
  @TargetApi(5)
  public void setDatabasePath(String paramString)
  {
    AppMethodBeat.i(64797);
    if ((this.c) && (this.a != null))
    {
      this.a.setDatabasePath(paramString);
      AppMethodBeat.o(64797);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        r.a(this.b, "setDatabasePath", new Class[] { String.class }, new Object[] { paramString });
        AppMethodBeat.o(64797);
      }
      else
      {
        AppMethodBeat.o(64797);
      }
    }
  }

  public void setDefaultFixedFontSize(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64783);
        if ((this.c) && (this.a != null))
        {
          this.a.setDefaultFixedFontSize(paramInt);
          AppMethodBeat.o(64783);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setDefaultFixedFontSize(paramInt);
          AppMethodBeat.o(64783);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64783);
    }
  }

  public void setDefaultFontSize(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64781);
        if ((this.c) && (this.a != null))
        {
          this.a.setDefaultFontSize(paramInt);
          AppMethodBeat.o(64781);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setDefaultFontSize(paramInt);
          AppMethodBeat.o(64781);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64781);
    }
  }

  public void setDefaultTextEncodingName(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64814);
        if ((this.c) && (this.a != null))
        {
          this.a.setDefaultTextEncodingName(paramString);
          AppMethodBeat.o(64814);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setDefaultTextEncodingName(paramString);
          AppMethodBeat.o(64814);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64814);
    }
  }

  @TargetApi(7)
  public void setDefaultZoom(WebSettings.ZoomDensity paramZoomDensity)
  {
    AppMethodBeat.i(64752);
    if ((this.c) && (this.a != null))
    {
      this.a.setDefaultZoom(IX5WebSettings.ZoomDensity.valueOf(paramZoomDensity.name()));
      AppMethodBeat.o(64752);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setDefaultZoom(android.webkit.WebSettings.ZoomDensity.valueOf(paramZoomDensity.name()));
        AppMethodBeat.o(64752);
      }
      else
      {
        AppMethodBeat.o(64752);
      }
    }
  }

  @TargetApi(11)
  public void setDisplayZoomControls(boolean paramBoolean)
  {
    AppMethodBeat.i(64731);
    if ((this.c) && (this.a != null))
    {
      this.a.setDisplayZoomControls(paramBoolean);
      AppMethodBeat.o(64731);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT < 11)
        {
          AppMethodBeat.o(64731);
        }
        else
        {
          r.a(this.b, "setDisplayZoomControls", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
          AppMethodBeat.o(64731);
        }
      }
      else
        AppMethodBeat.o(64731);
    }
  }

  @TargetApi(7)
  public void setDomStorageEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64803);
    if ((this.c) && (this.a != null))
    {
      this.a.setDomStorageEnabled(paramBoolean);
      AppMethodBeat.o(64803);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setDomStorageEnabled(paramBoolean);
        AppMethodBeat.o(64803);
      }
      else
      {
        AppMethodBeat.o(64803);
      }
    }
  }

  @Deprecated
  @TargetApi(11)
  public void setEnableSmoothTransition(boolean paramBoolean)
  {
    AppMethodBeat.i(64740);
    if ((this.c) && (this.a != null))
    {
      this.a.setEnableSmoothTransition(paramBoolean);
      AppMethodBeat.o(64740);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT >= 11)
        {
          r.a(this.b, "setEnableSmoothTransition", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
          AppMethodBeat.o(64740);
        }
      }
      else
      {
        AppMethodBeat.o(64740);
        continue;
        AppMethodBeat.o(64740);
      }
    }
  }

  public void setFantasyFontFamily(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64775);
        if ((this.c) && (this.a != null))
        {
          this.a.setFantasyFontFamily(paramString);
          AppMethodBeat.o(64775);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setFantasyFontFamily(paramString);
          AppMethodBeat.o(64775);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64775);
    }
  }

  public void setFixedFontFamily(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64767);
        if ((this.c) && (this.a != null))
        {
          this.a.setFixedFontFamily(paramString);
          AppMethodBeat.o(64767);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setFixedFontFamily(paramString);
          AppMethodBeat.o(64767);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64767);
    }
  }

  @TargetApi(5)
  public void setGeolocationDatabasePath(String paramString)
  {
    AppMethodBeat.i(64798);
    if ((this.c) && (this.a != null))
    {
      this.a.setGeolocationDatabasePath(paramString);
      AppMethodBeat.o(64798);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setGeolocationDatabasePath(paramString);
        AppMethodBeat.o(64798);
      }
      else
      {
        AppMethodBeat.o(64798);
      }
    }
  }

  @TargetApi(5)
  public void setGeolocationEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64807);
    if ((this.c) && (this.a != null))
    {
      this.a.setGeolocationEnabled(paramBoolean);
      AppMethodBeat.o(64807);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setGeolocationEnabled(paramBoolean);
        AppMethodBeat.o(64807);
      }
      else
      {
        AppMethodBeat.o(64807);
      }
    }
  }

  public void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64812);
        if ((this.c) && (this.a != null))
        {
          this.a.setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
          AppMethodBeat.o(64812);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
          AppMethodBeat.o(64812);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64812);
    }
  }

  @Deprecated
  public void setJavaScriptEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64791);
    try
    {
      if ((this.c) && (this.a != null))
      {
        this.a.setJavaScriptEnabled(paramBoolean);
        AppMethodBeat.o(64791);
      }
      while (true)
      {
        return;
        if ((this.c) || (this.b == null))
          break;
        this.b.setJavaScriptEnabled(paramBoolean);
        AppMethodBeat.o(64791);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        AppMethodBeat.o(64791);
        continue;
        AppMethodBeat.o(64791);
      }
    }
  }

  public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    AppMethodBeat.i(64763);
    if ((this.c) && (this.a != null))
    {
      this.a.setLayoutAlgorithm(IX5WebSettings.LayoutAlgorithm.valueOf(paramLayoutAlgorithm.name()));
      AppMethodBeat.o(64763);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.valueOf(paramLayoutAlgorithm.name()));
      AppMethodBeat.o(64763);
    }
  }

  public void setLightTouchEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64754);
    if ((this.c) && (this.a != null))
    {
      this.a.setLightTouchEnabled(paramBoolean);
      AppMethodBeat.o(64754);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setLightTouchEnabled(paramBoolean);
        AppMethodBeat.o(64754);
      }
      else
      {
        AppMethodBeat.o(64754);
      }
    }
  }

  @TargetApi(7)
  public void setLoadWithOverviewMode(boolean paramBoolean)
  {
    AppMethodBeat.i(64738);
    if ((this.c) && (this.a != null))
    {
      this.a.setLoadWithOverviewMode(paramBoolean);
      AppMethodBeat.o(64738);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setLoadWithOverviewMode(paramBoolean);
        AppMethodBeat.o(64738);
      }
      else
      {
        AppMethodBeat.o(64738);
      }
    }
  }

  public void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    AppMethodBeat.i(64785);
    if ((this.c) && (this.a != null))
    {
      this.a.setLoadsImagesAutomatically(paramBoolean);
      AppMethodBeat.o(64785);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setLoadsImagesAutomatically(paramBoolean);
        AppMethodBeat.o(64785);
      }
      else
      {
        AppMethodBeat.o(64785);
      }
    }
  }

  @TargetApi(17)
  public void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(64818);
    if ((this.c) && (this.a != null))
    {
      this.a.setMediaPlaybackRequiresUserGesture(paramBoolean);
      AppMethodBeat.o(64818);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT < 17)
        {
          AppMethodBeat.o(64818);
        }
        else
        {
          r.a(this.b, "setMediaPlaybackRequiresUserGesture", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
          AppMethodBeat.o(64818);
        }
      }
      else
        AppMethodBeat.o(64818);
    }
  }

  public void setMinimumFontSize(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64777);
        if ((this.c) && (this.a != null))
        {
          this.a.setMinimumFontSize(paramInt);
          AppMethodBeat.o(64777);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setMinimumFontSize(paramInt);
          AppMethodBeat.o(64777);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64777);
    }
  }

  public void setMinimumLogicalFontSize(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64779);
        if ((this.c) && (this.a != null))
        {
          this.a.setMinimumLogicalFontSize(paramInt);
          AppMethodBeat.o(64779);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setMinimumLogicalFontSize(paramInt);
          AppMethodBeat.o(64779);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64779);
    }
  }

  @TargetApi(21)
  public void setMixedContentMode(int paramInt)
  {
    AppMethodBeat.i(64736);
    if ((this.c) && (this.a != null))
      AppMethodBeat.o(64736);
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        if (Build.VERSION.SDK_INT < 21)
        {
          AppMethodBeat.o(64736);
        }
        else
        {
          r.a(this.b, "setMixedContentMode", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(64736);
        }
      }
      else
        AppMethodBeat.o(64736);
    }
  }

  public void setNavDump(boolean paramBoolean)
  {
    AppMethodBeat.i(64724);
    if ((this.c) && (this.a != null))
    {
      this.a.setNavDump(paramBoolean);
      AppMethodBeat.o(64724);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        r.a(this.b, "setNavDump", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(64724);
      }
      else
      {
        AppMethodBeat.o(64724);
      }
    }
  }

  public void setNeedInitialFocus(boolean paramBoolean)
  {
    AppMethodBeat.i(64819);
    if ((this.c) && (this.a != null))
    {
      this.a.setNeedInitialFocus(paramBoolean);
      AppMethodBeat.o(64819);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setNeedInitialFocus(paramBoolean);
        AppMethodBeat.o(64819);
      }
      else
      {
        AppMethodBeat.o(64819);
      }
    }
  }

  @Deprecated
  @TargetApi(8)
  public void setPluginState(WebSettings.PluginState paramPluginState)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64795);
        if ((this.c) && (this.a != null))
        {
          this.a.setPluginState(IX5WebSettings.PluginState.valueOf(paramPluginState.name()));
          AppMethodBeat.o(64795);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          if (Build.VERSION.SDK_INT < 8)
            break label129;
          paramPluginState = android.webkit.WebSettings.PluginState.valueOf(paramPluginState.name());
          r.a(this.b, "setPluginState", new Class[] { android.webkit.WebSettings.PluginState.class }, new Object[] { paramPluginState });
          AppMethodBeat.o(64795);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64795);
      continue;
      label129: AppMethodBeat.o(64795);
    }
  }

  @Deprecated
  public void setPluginsEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(64794);
    if ((this.c) && (this.a != null))
    {
      this.a.setPluginsEnabled(paramBoolean);
      AppMethodBeat.o(64794);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        r.a(this.b, "setPluginsEnabled", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(64794);
      }
      else
      {
        AppMethodBeat.o(64794);
      }
    }
  }

  @Deprecated
  public void setPluginsPath(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64796);
        if ((this.c) && (this.a != null))
        {
          this.a.setPluginsPath(paramString);
          AppMethodBeat.o(64796);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          r.a(this.b, "setPluginsPath", new Class[] { String.class }, new Object[] { paramString });
          AppMethodBeat.o(64796);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64796);
    }
  }

  public void setRenderPriority(RenderPriority paramRenderPriority)
  {
    AppMethodBeat.i(64820);
    if ((this.c) && (this.a != null))
    {
      this.a.setRenderPriority(IX5WebSettings.RenderPriority.valueOf(paramRenderPriority.name()));
      AppMethodBeat.o(64820);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setRenderPriority(android.webkit.WebSettings.RenderPriority.valueOf(paramRenderPriority.name()));
        AppMethodBeat.o(64820);
      }
      else
      {
        AppMethodBeat.o(64820);
      }
    }
  }

  public void setSansSerifFontFamily(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64769);
        if ((this.c) && (this.a != null))
        {
          this.a.setSansSerifFontFamily(paramString);
          AppMethodBeat.o(64769);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setSansSerifFontFamily(paramString);
          AppMethodBeat.o(64769);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64769);
    }
  }

  public void setSaveFormData(boolean paramBoolean)
  {
    AppMethodBeat.i(64744);
    if ((this.c) && (this.a != null))
    {
      this.a.setSaveFormData(paramBoolean);
      AppMethodBeat.o(64744);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setSaveFormData(paramBoolean);
      AppMethodBeat.o(64744);
    }
  }

  public void setSavePassword(boolean paramBoolean)
  {
    AppMethodBeat.i(64746);
    if ((this.c) && (this.a != null))
    {
      this.a.setSavePassword(paramBoolean);
      AppMethodBeat.o(64746);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setSavePassword(paramBoolean);
      AppMethodBeat.o(64746);
    }
  }

  public void setSerifFontFamily(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64771);
        if ((this.c) && (this.a != null))
        {
          this.a.setSerifFontFamily(paramString);
          AppMethodBeat.o(64771);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setSerifFontFamily(paramString);
          AppMethodBeat.o(64771);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64771);
    }
  }

  public void setStandardFontFamily(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64765);
        if ((this.c) && (this.a != null))
        {
          this.a.setStandardFontFamily(paramString);
          AppMethodBeat.o(64765);
          return;
        }
        if ((!this.c) && (this.b != null))
        {
          this.b.setStandardFontFamily(paramString);
          AppMethodBeat.o(64765);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64765);
    }
  }

  public void setSupportMultipleWindows(boolean paramBoolean)
  {
    AppMethodBeat.i(64761);
    if ((this.c) && (this.a != null))
    {
      this.a.setSupportMultipleWindows(paramBoolean);
      AppMethodBeat.o(64761);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setSupportMultipleWindows(paramBoolean);
        AppMethodBeat.o(64761);
      }
      else
      {
        AppMethodBeat.o(64761);
      }
    }
  }

  public void setSupportZoom(boolean paramBoolean)
  {
    AppMethodBeat.i(64727);
    if ((this.c) && (this.a != null))
    {
      this.a.setSupportZoom(paramBoolean);
      AppMethodBeat.o(64727);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        this.b.setSupportZoom(paramBoolean);
        AppMethodBeat.o(64727);
      }
      else
      {
        AppMethodBeat.o(64727);
      }
    }
  }

  public void setTextSize(TextSize paramTextSize)
  {
    AppMethodBeat.i(64750);
    if ((this.c) && (this.a != null))
    {
      this.a.setTextSize(IX5WebSettings.TextSize.valueOf(paramTextSize.name()));
      AppMethodBeat.o(64750);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setTextSize(android.webkit.WebSettings.TextSize.valueOf(paramTextSize.name()));
      AppMethodBeat.o(64750);
    }
  }

  @TargetApi(14)
  public void setTextZoom(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64748);
        if ((this.c) && (this.a != null))
        {
          this.a.setTextZoom(paramInt);
          AppMethodBeat.o(64748);
          return;
        }
        if ((this.c) || (this.b == null))
          break label127;
        if (Build.VERSION.SDK_INT < 14)
        {
          AppMethodBeat.o(64748);
          continue;
        }
      }
      finally
      {
      }
      try
      {
        this.b.setTextZoom(paramInt);
        AppMethodBeat.o(64748);
      }
      catch (Exception localException)
      {
        r.a(this.b, "setTextZoom", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(paramInt) });
      }
      label127: AppMethodBeat.o(64748);
    }
  }

  @Deprecated
  public void setUseWebViewBackgroundForOverscrollBackground(boolean paramBoolean)
  {
    AppMethodBeat.i(64742);
    if ((this.c) && (this.a != null))
    {
      this.a.setUseWebViewBackgroundForOverscrollBackground(paramBoolean);
      AppMethodBeat.o(64742);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
      {
        r.a(this.b, "setUseWebViewBackgroundForOverscrollBackground", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(64742);
      }
      else
      {
        AppMethodBeat.o(64742);
      }
    }
  }

  public void setUseWideViewPort(boolean paramBoolean)
  {
    AppMethodBeat.i(64759);
    if ((this.c) && (this.a != null))
    {
      this.a.setUseWideViewPort(paramBoolean);
      AppMethodBeat.o(64759);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setUseWideViewPort(paramBoolean);
      AppMethodBeat.o(64759);
    }
  }

  public void setUserAgent(String paramString)
  {
    AppMethodBeat.i(64756);
    if ((this.c) && (this.a != null))
    {
      this.a.setUserAgent(paramString);
      AppMethodBeat.o(64756);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setUserAgentString(paramString);
      AppMethodBeat.o(64756);
    }
  }

  @TargetApi(3)
  public void setUserAgentString(String paramString)
  {
    AppMethodBeat.i(64758);
    if ((this.c) && (this.a != null))
    {
      this.a.setUserAgentString(paramString);
      AppMethodBeat.o(64758);
    }
    while (true)
    {
      return;
      if ((!this.c) && (this.b != null))
        this.b.setUserAgentString(paramString);
      AppMethodBeat.o(64758);
    }
  }

  public boolean supportMultipleWindows()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64762);
        if ((this.c) && (this.a != null))
        {
          bool = this.a.supportMultipleWindows();
          AppMethodBeat.o(64762);
          return bool;
        }
        if ((!this.c) && (this.b != null))
        {
          bool = this.b.supportMultipleWindows();
          AppMethodBeat.o(64762);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      AppMethodBeat.o(64762);
    }
  }

  public boolean supportZoom()
  {
    AppMethodBeat.i(64728);
    boolean bool;
    if ((this.c) && (this.a != null))
    {
      bool = this.a.supportZoom();
      AppMethodBeat.o(64728);
    }
    while (true)
    {
      return bool;
      if ((!this.c) && (this.b != null))
      {
        bool = this.b.supportZoom();
        AppMethodBeat.o(64728);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(64728);
      }
    }
  }

  public static enum RenderPriority
  {
    static
    {
      AppMethodBeat.i(64717);
      NORMAL = new RenderPriority("NORMAL", 0);
      HIGH = new RenderPriority("HIGH", 1);
      LOW = new RenderPriority("LOW", 2);
      $VALUES = new RenderPriority[] { NORMAL, HIGH, LOW };
      AppMethodBeat.o(64717);
    }
  }

  public static enum TextSize
  {
    int value;

    static
    {
      AppMethodBeat.i(64720);
      SMALLEST = new TextSize("SMALLEST", 0, 50);
      SMALLER = new TextSize("SMALLER", 1, 75);
      NORMAL = new TextSize("NORMAL", 2, 100);
      LARGER = new TextSize("LARGER", 3, 125);
      LARGEST = new TextSize("LARGEST", 4, 150);
      $VALUES = new TextSize[] { SMALLEST, SMALLER, NORMAL, LARGER, LARGEST };
      AppMethodBeat.o(64720);
    }

    private TextSize(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebSettings
 * JD-Core Version:    0.6.2
 */