package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.v4.content.d;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public final class ad
{
  private static Typeface rcc = null;

  public static boolean YK(String paramString)
  {
    AppMethodBeat.i(37365);
    boolean bool;
    if ((paramString != null) && (paramString.length() >= 102400))
    {
      bool = true;
      AppMethodBeat.o(37365);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37365);
    }
  }

  public static String YL(String paramString)
  {
    AppMethodBeat.i(37366);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(37366);
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(com.tencent.mm.loader.j.b.eSk.replace("/data/user/0", "/data/data"), "tmpLargeCanvasDir");
      if (!localb.exists())
        localb.mkdirs();
      try
      {
        byte[] arrayOfByte = paramString.getBytes("UTF-8");
        paramString = new com/tencent/mm/vfs/b;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString.<init>(localb, System.currentTimeMillis());
        paramString = j.w(paramString.dMD());
        int i = e.b(paramString, arrayOfByte, arrayOfByte.length);
        if (i == 0)
          AppMethodBeat.o(37366);
      }
      catch (Exception paramString)
      {
        ab.e("LandingPageUtil", "writeTempCanvasXmlToLocal fail");
        paramString = "";
        AppMethodBeat.o(37366);
      }
    }
  }

  public static String YM(String paramString)
  {
    AppMethodBeat.i(37367);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(37367);
    }
    while (true)
    {
      return paramString;
      try
      {
        com.tencent.mm.vfs.b localb = new com/tencent/mm/vfs/b;
        localb.<init>(paramString);
        if (!localb.exists())
        {
          paramString = "";
          AppMethodBeat.o(37367);
        }
        else
        {
          paramString = e.cy(paramString);
          localb.delete();
          AppMethodBeat.o(37367);
        }
      }
      catch (Exception paramString)
      {
        ab.e("LandingPageUtil", "readTempCanvasXmlFromLocalAndDeleteIt fail");
        paramString = "";
        AppMethodBeat.o(37367);
      }
    }
  }

  public static int aY(float paramFloat)
  {
    int i = (int)paramFloat;
    int j = i;
    if (paramFloat - i > 0.001D)
      j = i + 1;
    return j;
  }

  public static void ac(Activity paramActivity)
  {
    AppMethodBeat.i(37361);
    ab.i("LandingPageUtil", "setFullScreen");
    int i = 514;
    if (!ae.hD(paramActivity))
      i = 1542;
    while (true)
    {
      int j = i;
      if (Build.VERSION.SDK_INT >= 19)
        j = i | 0x1000;
      paramActivity.getWindow().getDecorView().setSystemUiVisibility(j);
      AppMethodBeat.o(37361);
      return;
      ab.i("LandingPageUtil", "has cut out");
    }
  }

  public static int[] eP(Context paramContext)
  {
    AppMethodBeat.i(37360);
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i;
    if (Build.VERSION.SDK_INT >= 13)
    {
      paramContext = new Point();
      localDisplay.getRealSize(paramContext);
      i = paramContext.x;
    }
    for (int j = paramContext.y; ; j = localDisplay.getHeight())
    {
      AppMethodBeat.o(37360);
      return new int[] { i, j };
      i = localDisplay.getWidth();
    }
  }

  public static void eQ(Context paramContext)
  {
    AppMethodBeat.i(37362);
    d.S(paramContext).c(new Intent("com.tencent.mm.adlanding.set_uioption"));
    AppMethodBeat.o(37362);
  }

  public static Typeface eR(Context paramContext)
  {
    AppMethodBeat.i(37364);
    if (rcc == null)
      rcc = Typeface.createFromAsset(paramContext.getAssets(), "fonts/WeChatNum.ttf");
    paramContext = rcc;
    AppMethodBeat.o(37364);
    return paramContext;
  }

  public static Bitmap getBitmap(String paramString)
  {
    AppMethodBeat.i(37359);
    String str = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages";
    paramString = "adId" + "_image_" + ag.ck(paramString);
    paramString = str + "/" + paramString;
    if (e.ct(paramString))
    {
      paramString = BackwardSupportUtil.b.i(paramString, 1.0F);
      AppMethodBeat.o(37359);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(37359);
    }
  }

  public static String m(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(37363);
    try
    {
      URI localURI = new java/net/URI;
      localURI.<init>(paramString);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
        ((StringBuilder)localObject).append(paramArrayOfString[j]).append("&");
      if (((StringBuilder)localObject).length() > 1)
      {
        StringBuilder localStringBuilder = ((StringBuilder)localObject).deleteCharAt(((StringBuilder)localObject).length() - 1);
        localObject = localURI.getQuery();
        if (localObject == null);
        for (paramArrayOfString = localStringBuilder.toString(); ; paramArrayOfString = (String)localObject + "&" + localStringBuilder.toString())
        {
          localObject = new java/net/URI;
          ((URI)localObject).<init>(localURI.getScheme(), localURI.getAuthority(), localURI.getPath(), paramArrayOfString, localURI.getFragment());
          paramArrayOfString = ((URI)localObject).toString();
          paramString = paramArrayOfString;
          AppMethodBeat.o(37363);
          return paramString;
          paramArrayOfString = new java/lang/StringBuilder;
          paramArrayOfString.<init>();
        }
      }
    }
    catch (URISyntaxException paramArrayOfString)
    {
      while (true)
      {
        ab.printErrStackTrace("LandingPageUtil", paramArrayOfString, "", new Object[0]);
        AppMethodBeat.o(37363);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad
 * JD-Core Version:    0.6.2
 */