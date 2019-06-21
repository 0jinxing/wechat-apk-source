package com.tencent.mm.plugin.location.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class e
{
  public static String a(LocationInfo paramLocationInfo)
  {
    AppMethodBeat.i(113305);
    if (paramLocationInfo.cIK == null)
      paramLocationInfo.cIK = "";
    paramLocationInfo = "<msg><location x=\"" + paramLocationInfo.nJu + "\" y=\"" + paramLocationInfo.nJv + "\" scale=\"" + paramLocationInfo.nJw + "\" label=\"" + bo.ani(paramLocationInfo.nJx) + "\" poiname=\"" + bo.ani(paramLocationInfo.cIK) + "\" maptype=\"0\" /></msg>";
    AppMethodBeat.o(113305);
    return paramLocationInfo;
  }

  public static String a(String paramString1, String paramString2, View paramView)
  {
    AppMethodBeat.i(113306);
    ab.d("MicroMsg.MapUtil", "w h " + paramView.getWidth() + " " + (paramView.getHeight() / 2 + 20));
    String str = paramString1 + paramString2 + ".png";
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), (int)(paramView.getHeight() * 0.7D), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(localBitmap));
    try
    {
      ab.d("MicroMsg.MapUtil", "saveMyBitmap ".concat(String.valueOf(paramString2)));
      paramView = new java/io/File;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramView.<init>(paramString1 + paramString2 + ".png");
      paramView.createNewFile();
      try
      {
        paramString1 = new java/io/FileOutputStream;
        paramString1.<init>(paramView);
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("h ");
        ab.d("MicroMsg.MapUtil", localBitmap.getHeight() + " w:" + localBitmap.getWidth() + " ");
        localBitmap.compress(Bitmap.CompressFormat.PNG, 100, paramString1);
        if (paramString1 == null);
      }
      catch (FileNotFoundException paramString1)
      {
        try
        {
          paramString1.flush();
          paramString1.close();
          ab.i("MicroMsg.MapUtil", "bitmap recycle %s", new Object[] { localBitmap.toString() });
          localBitmap.recycle();
          AppMethodBeat.o(113306);
          paramString1 = str;
          return paramString1;
          paramString1 = paramString1;
          ab.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
          paramString1 = null;
        }
        catch (IOException paramString1)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
        }
      }
    }
    catch (IOException paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MapUtil", paramString1, "", new Object[0]);
        AppMethodBeat.o(113306);
        paramString1 = null;
      }
    }
  }

  public static PackageInfo aK(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(113304);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 1);
      AppMethodBeat.o(113304);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MapUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(113304);
        paramContext = localObject;
      }
    }
    catch (ActivityNotFoundException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MapUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(113304);
        paramContext = localObject;
      }
    }
  }

  public static double[] c(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(113308);
    double d1 = paramArrayOfDouble[0];
    double d2 = paramArrayOfDouble[1];
    int i;
    if ((d1 < 72.004000000000005D) || (d1 > 137.8347D) || (d2 < 0.8293D) || (d2 > 55.827100000000002D))
    {
      i = 1;
      if (i == 0)
        break label78;
      paramArrayOfDouble = new double[2];
      paramArrayOfDouble[0] = d1;
      paramArrayOfDouble[1] = d2;
      AppMethodBeat.o(113308);
    }
    while (true)
    {
      return paramArrayOfDouble;
      i = 0;
      break;
      label78: double d3 = d1 - 105.0D;
      double d4 = d2 - 35.0D;
      double d5 = Math.sqrt(Math.abs(d3));
      double d6 = (20.0D * Math.sin(6.0D * d3 * 3.141592653589793D) + 20.0D * Math.sin(2.0D * d3 * 3.141592653589793D)) * 2.0D / 3.0D;
      double d7 = (20.0D * Math.sin(3.141592653589793D * d4) + 40.0D * Math.sin(d4 / 3.0D * 3.141592653589793D)) * 2.0D / 3.0D;
      double d8 = (160.0D * Math.sin(d4 / 12.0D * 3.141592653589793D) + 320.0D * Math.sin(3.141592653589793D * d4 / 30.0D)) * 2.0D / 3.0D;
      double d9 = Math.sqrt(Math.abs(d3));
      double d10 = (20.0D * Math.sin(6.0D * d3 * 3.141592653589793D) + 20.0D * Math.sin(2.0D * d3 * 3.141592653589793D)) * 2.0D / 3.0D;
      double d11 = (20.0D * Math.sin(3.141592653589793D * d3) + 40.0D * Math.sin(d3 / 3.0D * 3.141592653589793D)) * 2.0D / 3.0D;
      double d12 = Math.sin(d3 / 12.0D * 3.141592653589793D);
      double d13 = (Math.sin(d3 / 30.0D * 3.141592653589793D) * 300.0D + 150.0D * d12) * 2.0D / 3.0D;
      d12 = d2 / 180.0D * 3.141592653589793D;
      double d14 = Math.sin(d12);
      double d15 = 1.0D - d14 * (0.006693421622965943D * d14);
      d14 = Math.sqrt(d15);
      d8 = (-100.0D + 2.0D * d3 + 3.0D * d4 + 0.2D * d4 * d4 + 0.1D * d3 * d4 + 0.2D * d5 + d6 + d7 + d8) * 180.0D / (6335552.7170004258D / (d15 * d14) * 3.141592653589793D);
      d7 = 6378245.0D / d14;
      d4 = (d13 + (d4 * (0.1D * d3) + (300.0D + d3 + 2.0D * d4 + 0.1D * d3 * d3) + 0.1D * d9 + d10 + d11)) * 180.0D / (Math.cos(d12) * d7 * 3.141592653589793D);
      paramArrayOfDouble = new double[2];
      paramArrayOfDouble[0] = (d1 * 2.0D - (d1 + d4));
      paramArrayOfDouble[1] = (2.0D * d2 - (d2 + d8));
      AppMethodBeat.o(113308);
    }
  }

  public static boolean j(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113307);
    boolean bool;
    if ((Math.abs(paramDouble2) > 180.0D) || (Math.abs(paramDouble1) > 90.0D))
    {
      bool = false;
      AppMethodBeat.o(113307);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(113307);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.e
 * JD-Core Version:    0.6.2
 */