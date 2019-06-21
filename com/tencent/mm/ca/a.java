package com.tencent.mm.ca;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a
{
  public static String xus = "screenResolution_density_dpi";
  public static String xut = "screenResolution_density_report";
  private static float xuu = 1.0F;
  static a.a xuv;
  DisplayMetrics aDu;
  private DisplayMetrics xuq;
  private boolean xur;

  public a(DisplayMetrics paramDisplayMetrics)
  {
    AppMethodBeat.i(105870);
    this.xur = true;
    this.xuq = paramDisplayMetrics;
    ab.i("MicroMsg.MMDensityManager", "MMDensityManager switch mm:%s, tools:%s, appbrand:%s", new Object[] { Boolean.valueOf(dmL()), Boolean.valueOf(dmN()), Boolean.valueOf(dmM()) });
    boolean bool;
    if (ah.bqo())
      bool = dmL();
    while (true)
    {
      this.xur = bool;
      do
      {
        if (dmR())
        {
          this.aDu = d(paramDisplayMetrics);
          paramDisplayMetrics.setTo(this.aDu);
          if (Build.VERSION.SDK_INT >= 21)
            ah.getContext().getTheme().getResources().getDisplayMetrics().setTo(this.aDu);
          ab.i("MicroMsg.MMDensityManager", " Target DisplayMetrics[%s]", new Object[] { this.aDu });
        }
        AppMethodBeat.o(105870);
        return;
        if (ah.isAppBrandProcess())
        {
          if ((dmL()) && (dmM()));
          for (bool = true; ; bool = false)
          {
            this.xur = bool;
            break;
          }
        }
      }
      while ((!ah.doF()) && (!ah.doG()));
      if ((dmL()) && (dmN()))
        bool = true;
      else
        bool = false;
    }
  }

  public static void a(a.a parama)
  {
    xuv = parama;
  }

  private static void a(Field paramField)
  {
    AppMethodBeat.i(105882);
    paramField.setAccessible(true);
    Field localField = Field.class.getDeclaredField("accessFlags");
    localField.setAccessible(true);
    localField.setInt(paramField, paramField.getModifiers() & 0xFFFFFFEF);
    AppMethodBeat.o(105882);
  }

  public static DisplayMetrics d(DisplayMetrics paramDisplayMetrics)
  {
    AppMethodBeat.i(105871);
    float f1 = 400.0F;
    float f2;
    int i;
    float f3;
    if (ae.dzf())
    {
      f1 = 750.0F;
      f2 = Math.min(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels) / f1;
      if ((ae.dzh() == 0) || (ae.getDeviceWidth() == 0))
        break label283;
      f1 = 1.0F;
      i = Math.min(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels);
      if (i != 0)
        f1 = ae.getDeviceWidth() / i;
      f3 = f1 * (dmP() / ae.dzh());
      f1 = f3;
      if (f3 < 0.95F)
        f1 = 0.95F;
      if ((!ae.dzf()) && (!ae.dzg()))
        break label266;
      f3 = f1;
      if (f1 > 1.5F)
        f3 = 1.5F;
      label122: xuu = f3;
      f1 = f2 * f3;
      ab.i("MicroMsg.MMDensityManager", "scale targetDensity:%s , device:%s, windows:%s, width:%s, width2:%s, dpiScale:%s", new Object[] { Float.valueOf(f1), Integer.valueOf(ae.dzh()), Float.valueOf(dmP()), Integer.valueOf(ae.getDeviceWidth()), Integer.valueOf(i), Float.valueOf(f3) });
    }
    while (true)
    {
      f3 = paramDisplayMetrics.scaledDensity / paramDisplayMetrics.density;
      i = (int)(160.0F * f1);
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      localDisplayMetrics.setTo(paramDisplayMetrics);
      localDisplayMetrics.scaledDensity = (f3 * f1);
      localDisplayMetrics.densityDpi = i;
      localDisplayMetrics.density = f1;
      AppMethodBeat.o(105871);
      return localDisplayMetrics;
      if (!ae.dzg())
        break;
      f1 = 600.0F;
      break;
      label266: f3 = f1;
      if (f1 <= 1.2F)
        break label122;
      f3 = 1.2F;
      break label122;
      label283: f1 = f2;
    }
  }

  public static float dmK()
  {
    return xuu;
  }

  public static boolean dmL()
  {
    boolean bool = true;
    AppMethodBeat.i(105872);
    try
    {
      int i = bo.getInt(b.brr().b("clicfg_screen_adaptive", "1", false, true), 1);
      if (i > 0)
        AppMethodBeat.o(105872);
      while (true)
      {
        return bool;
        AppMethodBeat.o(105872);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDensityManager", localException, "isOpenScreenAdaptiveForMM", new Object[0]);
        AppMethodBeat.o(105872);
        bool = false;
      }
    }
  }

  public static boolean dmM()
  {
    boolean bool1 = true;
    AppMethodBeat.i(105873);
    try
    {
      com.tencent.mm.k.a locala = com.tencent.mm.k.a.a.KF();
      if (locala != null)
      {
        bool2 = locala.Bi();
        int i;
        if (bo.getInt(b.brr().b("clicfg_screen_adaptive_appbrand", "1", false, true), 1) > 0)
        {
          i = 1;
          if ((i == 0) || (!bool2))
            break label66;
          AppMethodBeat.o(105873);
        }
        for (bool2 = bool1; ; bool2 = false)
        {
          return bool2;
          i = 0;
          break;
          label66: AppMethodBeat.o(105873);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDensityManager", localException, "isOpenScreenAdaptiveForAppBrand", new Object[0]);
        AppMethodBeat.o(105873);
        boolean bool2 = false;
        continue;
        bool2 = false;
      }
    }
  }

  private static boolean dmN()
  {
    boolean bool = true;
    AppMethodBeat.i(105874);
    try
    {
      int i = bo.getInt(b.brr().b("clicfg_screen_adaptive_tool", "1", false, true), 1);
      if (i > 0)
        AppMethodBeat.o(105874);
      while (true)
      {
        return bool;
        AppMethodBeat.o(105874);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDensityManager", localException, "isOpenScreenAdaptiveForTool", new Object[0]);
        AppMethodBeat.o(105874);
        bool = false;
      }
    }
  }

  public static float dmO()
  {
    AppMethodBeat.i(105876);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    float f = localDisplayMetrics.density;
    AppMethodBeat.o(105876);
    return f;
  }

  private static float dmP()
  {
    AppMethodBeat.i(105877);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    float f = localDisplayMetrics.densityDpi;
    AppMethodBeat.o(105877);
    return f;
  }

  private static boolean dmS()
  {
    boolean bool = true;
    AppMethodBeat.i(105884);
    String str = Build.BRAND;
    if (!bo.isNullOrNil(str))
    {
      str = str.toLowerCase();
      if (((str.contains("huawei")) || (str.contains("honor"))) && (Build.VERSION.SDK_INT == 24))
        AppMethodBeat.o(105884);
    }
    while (true)
    {
      return bool;
      if ((str.contains("samsung")) && (Build.VERSION.SDK_INT == 23))
      {
        AppMethodBeat.o(105884);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(105884);
      }
    }
  }

  static String e(DisplayMetrics paramDisplayMetrics)
  {
    AppMethodBeat.i(105881);
    paramDisplayMetrics = String.format("scaledDensity:%s densityDpi:%s density:%s", new Object[] { Float.valueOf(paramDisplayMetrics.scaledDensity), Integer.valueOf(paramDisplayMetrics.densityDpi), Float.valueOf(paramDisplayMetrics.density) });
    AppMethodBeat.o(105881);
    return paramDisplayMetrics;
  }

  public final Configuration b(Configuration paramConfiguration)
  {
    AppMethodBeat.i(105878);
    if (dmR())
    {
      paramConfiguration = new Configuration(paramConfiguration);
      paramConfiguration.densityDpi = getDisplayMetrics().densityDpi;
      dmQ();
      AppMethodBeat.o(105878);
    }
    while (true)
    {
      return paramConfiguration;
      AppMethodBeat.o(105878);
    }
  }

  final void dmQ()
  {
    AppMethodBeat.i(105879);
    try
    {
      DisplayMetrics localDisplayMetrics = getDisplayMetrics();
      Object localObject = Bitmap.class.getDeclaredMethod("setDefaultDensity", new Class[] { Integer.TYPE });
      ((Method)localObject).setAccessible(true);
      ((Method)localObject).invoke(null, new Object[] { Integer.valueOf(localDisplayMetrics.densityDpi) });
      localObject = DisplayMetrics.class.getDeclaredField("DENSITY_DEVICE");
      a((Field)localObject);
      ((Field)localObject).setInt(null, localDisplayMetrics.densityDpi);
      AppMethodBeat.o(105879);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDensityManager", localException, "", new Object[0]);
        AppMethodBeat.o(105879);
      }
    }
  }

  final boolean dmR()
  {
    AppMethodBeat.i(105883);
    boolean bool;
    if ((this.xur) && (!dmS()))
    {
      bool = true;
      AppMethodBeat.o(105883);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105883);
    }
  }

  public final DisplayMetrics getDisplayMetrics()
  {
    AppMethodBeat.i(105875);
    DisplayMetrics localDisplayMetrics;
    if (dmR())
    {
      localDisplayMetrics = new DisplayMetrics();
      localDisplayMetrics.setTo(this.aDu);
      AppMethodBeat.o(105875);
    }
    while (true)
    {
      return localDisplayMetrics;
      localDisplayMetrics = this.xuq;
      AppMethodBeat.o(105875);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.a
 * JD-Core Version:    0.6.2
 */