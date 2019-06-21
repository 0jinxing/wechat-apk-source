package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.b;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ca.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;

public final class l extends ContextThemeWrapper
{
  private Resources iJr;
  private LayoutInflater iJs;

  public l(Context paramContext)
  {
    AppMethodBeat.i(133168);
    super.attachBaseContext(paramContext);
    if ((a.dmL()) && (!a.dmM()))
    {
      DisplayMetrics localDisplayMetrics = a.d(paramContext.getResources().getDisplayMetrics());
      this.iJr = new a(paramContext.getResources(), localDisplayMetrics);
      if (Build.VERSION.SDK_INT >= 21)
        getTheme().getResources().getDisplayMetrics().setTo(this.iJr.getDisplayMetrics());
    }
    AppMethodBeat.o(133168);
  }

  public final Resources getResources()
  {
    AppMethodBeat.i(133169);
    Resources localResources;
    if ((getAssets() != null) && (this.iJr != null))
    {
      localResources = this.iJr;
      AppMethodBeat.o(133169);
    }
    while (true)
    {
      return localResources;
      localResources = super.getResources();
      AppMethodBeat.o(133169);
    }
  }

  public final Object getSystemService(String paramString)
  {
    AppMethodBeat.i(138149);
    if ("layout_inflater".equals(paramString))
      if (this.iJs != null)
      {
        paramString = this.iJs;
        AppMethodBeat.o(138149);
      }
    while (true)
    {
      return paramString;
      paramString = v.a((LayoutInflater)super.getSystemService("layout_inflater"));
      this.iJs = paramString;
      AppMethodBeat.o(138149);
      continue;
      paramString = super.getSystemService(paramString);
      AppMethodBeat.o(138149);
    }
  }

  static final class a extends b
  {
    private Configuration YO;
    private final Resources iJt;
    private DisplayMetrics iJu;

    a(Resources paramResources, DisplayMetrics paramDisplayMetrics)
    {
      super();
      AppMethodBeat.i(133164);
      this.iJt = paramResources;
      this.iJu = paramDisplayMetrics;
      paramResources = new Configuration(this.iJt.getConfiguration());
      paramDisplayMetrics = new DisplayMetrics();
      paramDisplayMetrics.setTo(this.iJt.getDisplayMetrics());
      updateConfiguration(paramResources, paramDisplayMetrics);
      AppMethodBeat.o(133164);
    }

    private Drawable r(Drawable paramDrawable)
    {
      AppMethodBeat.i(138144);
      if (((paramDrawable instanceof BitmapDrawable)) && (this.iJu != null))
        ((BitmapDrawable)paramDrawable).setTargetDensity(this.iJu.densityDpi);
      AppMethodBeat.o(138144);
      return paramDrawable;
    }

    public final Configuration getConfiguration()
    {
      AppMethodBeat.i(133166);
      Configuration localConfiguration;
      if (this.YO != null)
      {
        localConfiguration = this.YO;
        AppMethodBeat.o(133166);
      }
      while (true)
      {
        return localConfiguration;
        localConfiguration = super.getConfiguration();
        AppMethodBeat.o(133166);
      }
    }

    public final DisplayMetrics getDisplayMetrics()
    {
      AppMethodBeat.i(133165);
      DisplayMetrics localDisplayMetrics;
      if (this.iJu != null)
      {
        localDisplayMetrics = this.iJu;
        AppMethodBeat.o(133165);
      }
      while (true)
      {
        return localDisplayMetrics;
        localDisplayMetrics = super.getDisplayMetrics();
        AppMethodBeat.o(133165);
      }
    }

    public final Drawable getDrawable(int paramInt)
    {
      AppMethodBeat.i(138145);
      Drawable localDrawable;
      if (this.iJu != null)
      {
        localDrawable = getDrawableForDensity(paramInt, this.iJu.densityDpi);
        AppMethodBeat.o(138145);
      }
      while (true)
      {
        return localDrawable;
        localDrawable = r(this.iJt.getDrawable(paramInt));
        AppMethodBeat.o(138145);
      }
    }

    public final Drawable getDrawable(int paramInt, Resources.Theme paramTheme)
    {
      AppMethodBeat.i(138146);
      try
      {
        if (this.iJu != null)
        {
          Drawable localDrawable = getDrawableForDensity(paramInt, this.iJu.densityDpi, paramTheme);
          paramTheme = localDrawable;
          AppMethodBeat.o(138146);
          return paramTheme;
        }
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandUIScreenAdaptiveContextThemeWrapper", localNoSuchMethodError, "getDrawable(id, theme)", new Object[0]);
          if (paramTheme == null)
          {
            paramTheme = getDrawableForDensity(paramInt, this.iJu.densityDpi);
            AppMethodBeat.o(138146);
          }
          else
          {
            paramTheme = r(this.iJt.getDrawable(paramInt, paramTheme));
            AppMethodBeat.o(138146);
          }
        }
      }
    }

    public final Drawable getDrawableForDensity(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(138147);
      int i = paramInt2;
      if (paramInt2 == 0)
      {
        i = paramInt2;
        if (this.iJu != null)
          i = this.iJu.densityDpi;
      }
      Drawable localDrawable = this.iJt.getDrawableForDensity(paramInt1, i);
      AppMethodBeat.o(138147);
      return localDrawable;
    }

    public final Drawable getDrawableForDensity(int paramInt1, int paramInt2, Resources.Theme paramTheme)
    {
      AppMethodBeat.i(138148);
      int i = paramInt2;
      if (paramInt2 == 0)
      {
        i = paramInt2;
        if (this.iJu != null)
          i = this.iJu.densityDpi;
      }
      paramTheme = this.iJt.getDrawableForDensity(paramInt1, i, paramTheme);
      AppMethodBeat.o(138148);
      return paramTheme;
    }

    public final void updateConfiguration(Configuration paramConfiguration, DisplayMetrics paramDisplayMetrics)
    {
      AppMethodBeat.i(133167);
      if (this.iJu != null)
      {
        this.iJu = a.d(paramDisplayMetrics);
        this.YO = new Configuration(paramConfiguration);
        this.YO.densityDpi = this.iJu.densityDpi;
        super.updateConfiguration(this.YO, this.iJu);
        this.iJt.updateConfiguration(paramConfiguration, paramDisplayMetrics);
        AppMethodBeat.o(133167);
      }
      while (true)
      {
        return;
        super.updateConfiguration(paramConfiguration, paramDisplayMetrics);
        AppMethodBeat.o(133167);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.l
 * JD-Core Version:    0.6.2
 */