package com.tencent.mm.plugin.location.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public final class d
{
  private ActivityManager aDn;
  public int cKB;
  public Context context;
  public int nLB;
  public int nLC;
  public boolean nLD;

  public d(Context paramContext)
  {
    AppMethodBeat.i(113439);
    this.nLB = 0;
    this.nLC = 0;
    this.cKB = -1;
    this.nLD = false;
    this.context = paramContext;
    this.aDn = ((ActivityManager)paramContext.getSystemService("activity"));
    AppMethodBeat.o(113439);
  }

  private static Intent a(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    AppMethodBeat.i(113441);
    if ((paramBoolean) || (!paramLocationInfo2.bJo()))
    {
      paramContext = e.c(new double[] { paramLocationInfo1.nJv, paramLocationInfo1.nJu });
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%s,%s?z=%s", new Object[] { Double.valueOf(paramContext[1]), Double.valueOf(paramContext[0]), Integer.valueOf(paramLocationInfo1.nJw) })));
      paramContext.setPackage("com.baidu.BaiduMap");
      AppMethodBeat.o(113441);
    }
    while (true)
    {
      return paramContext;
      String str = a(paramContext, paramLocationInfo2);
      if (!bo.isNullOrNil(str))
      {
        paramLocationInfo2 = String.format("name:%s|latlng:%f,%f", new Object[] { str, Double.valueOf(paramLocationInfo2.nJu), Double.valueOf(paramLocationInfo2.nJv) });
        label151: paramContext = a(paramContext, paramLocationInfo1);
        if (bo.isNullOrNil(paramContext))
          break label312;
        paramContext = String.format("name:%s|latlng:%f,%f", new Object[] { paramContext, Double.valueOf(paramLocationInfo1.nJu), Double.valueOf(paramLocationInfo1.nJv) });
        paramContext = String.format("intent://map/direction?origin=%s&destination=%s&mode=driving&coord_type=gcj02", new Object[] { paramLocationInfo2, paramContext });
        ab.d("MicroMsg.MapHelper", "url ".concat(String.valueOf(paramContext)));
      }
      try
      {
        paramLocationInfo1 = new java/lang/StringBuilder;
        paramLocationInfo1.<init>();
        paramContext = paramContext + "&referer=tencent|weixin#Intent;scheme=bdapp;package=com.baidu.BaiduMap;end";
        ab.d("MicroMsg.MapHelper", "all: ".concat(String.valueOf(paramContext)));
        paramContext = Intent.getIntent(paramContext);
        AppMethodBeat.o(113441);
        continue;
        paramLocationInfo2 = String.format("%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.nJu), Double.valueOf(paramLocationInfo2.nJv) });
        break label151;
        label312: paramContext = String.format("%f,%f", new Object[] { Double.valueOf(paramLocationInfo1.nJu), Double.valueOf(paramLocationInfo1.nJv) });
      }
      catch (URISyntaxException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.MapHelper", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(113441);
      }
    }
  }

  private static Intent a(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(113444);
    if ((paramBoolean) || (!paramLocationInfo2.bJo()))
    {
      paramContext = e.c(new double[] { paramLocationInfo1.nJv, paramLocationInfo1.nJu });
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%s,%s?z=%s", new Object[] { Double.valueOf(paramContext[1]), Double.valueOf(paramContext[0]), Integer.valueOf(paramLocationInfo1.nJw) })));
      paramContext.setPackage(paramString);
      AppMethodBeat.o(113444);
    }
    while (true)
    {
      return paramContext;
      String str1 = String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.nJu), Double.valueOf(paramLocationInfo2.nJv), Double.valueOf(paramLocationInfo1.nJu), Double.valueOf(paramLocationInfo1.nJv) });
      String str2 = str1;
      if (!bo.isNullOrNil(paramLocationInfo2.nJx))
      {
        str2 = str1;
        if (!bo.isNullOrNil(paramLocationInfo1.nJx))
          str2 = str1 + String.format("&from=%s&to=%s", new Object[] { paramLocationInfo2.nJx, paramLocationInfo1.nJx });
      }
      paramLocationInfo2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
      paramLocationInfo2.setPackage(paramString);
      if (bo.k(paramContext, paramLocationInfo2))
      {
        AppMethodBeat.o(113444);
        paramContext = paramLocationInfo2;
      }
      else
      {
        paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.nJu + "," + paramLocationInfo1.nJv));
        paramContext.setPackage(paramString);
        AppMethodBeat.o(113444);
      }
    }
  }

  private static Intent a(LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    AppMethodBeat.i(113442);
    if ((paramBoolean) || (!paramLocationInfo2.bJo()))
    {
      paramLocationInfo2 = e.c(new double[] { paramLocationInfo1.nJv, paramLocationInfo1.nJu });
      paramLocationInfo1 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%s,%s?z=%s", new Object[] { Double.valueOf(paramLocationInfo2[1]), Double.valueOf(paramLocationInfo2[0]), Integer.valueOf(paramLocationInfo1.nJw) })));
      paramLocationInfo1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
      AppMethodBeat.o(113442);
      return paramLocationInfo1;
    }
    if (bo.isNullOrNil(paramLocationInfo1.nJy));
    for (String str = "zh-cn"; ; str = paramLocationInfo1.nJy)
    {
      paramLocationInfo1 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=".concat(String.valueOf(str)), new Object[] { Double.valueOf(paramLocationInfo2.nJu), Double.valueOf(paramLocationInfo2.nJv), Double.valueOf(paramLocationInfo1.nJu), Double.valueOf(paramLocationInfo1.nJv) })));
      paramLocationInfo1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
      AppMethodBeat.o(113442);
      break;
    }
  }

  private static String a(Context paramContext, LocationInfo paramLocationInfo)
  {
    AppMethodBeat.i(113440);
    paramContext = paramContext.getString(2131300970);
    if ((!bo.isNullOrNil(paramLocationInfo.cIK)) && (!paramLocationInfo.cIK.equals(paramContext)))
    {
      paramContext = paramLocationInfo.cIK;
      AppMethodBeat.o(113440);
    }
    while (true)
    {
      return paramContext;
      if (!bo.isNullOrNil(paramLocationInfo.nJx))
      {
        paramContext = paramLocationInfo.nJx;
        AppMethodBeat.o(113440);
      }
      else
      {
        paramContext = "";
        AppMethodBeat.o(113440);
      }
    }
  }

  private static Intent b(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    AppMethodBeat.i(113443);
    if ((paramBoolean) || (!paramLocationInfo2.bJo()))
    {
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.nJu + "," + paramLocationInfo1.nJv + "?z=" + paramLocationInfo1.nJw));
      paramContext.setPackage("com.tencent.map");
      AppMethodBeat.o(113443);
    }
    while (true)
    {
      return paramContext;
      String str1 = paramLocationInfo1.nJB;
      String str2 = str1;
      if (!bo.isNullOrNil(paramLocationInfo1.nJB))
      {
        str2 = str1;
        if (paramLocationInfo1.nJB.startsWith("qqmap_"))
          str2 = paramLocationInfo1.nJB.substring(6);
      }
      paramLocationInfo2 = a(paramContext, paramLocationInfo2);
      str1 = a(paramContext, paramLocationInfo1);
      paramLocationInfo2 = String.format("qqmap://map/routeplan/type=drive&touid=%s&tocoord=%f,%f&from=%s&to=%s&referer=wx_client", new Object[] { str2, Double.valueOf(paramLocationInfo1.nJu), Double.valueOf(paramLocationInfo1.nJv), URLEncoder.encode(paramLocationInfo2), URLEncoder.encode(str1) });
      ab.d("MicroMsg.MapHelper", "tencentluxian, url=%s", new Object[] { paramLocationInfo2 });
      paramLocationInfo2 = new Intent("android.intent.action.VIEW", Uri.parse(paramLocationInfo2));
      paramLocationInfo2.setPackage("com.tencent.map");
      if (bo.k(paramContext, paramLocationInfo2))
      {
        AppMethodBeat.o(113443);
        paramContext = paramLocationInfo2;
      }
      else
      {
        paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.nJu + "," + paramLocationInfo1.nJv));
        paramContext.setPackage("com.tencent.map");
        AppMethodBeat.o(113443);
      }
    }
  }

  private static Intent b(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(113445);
    if ((paramBoolean) || (!paramLocationInfo2.bJo()))
    {
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.nJu + "," + paramLocationInfo1.nJv + "?z=" + paramLocationInfo1.nJw));
      paramContext.setPackage(paramString);
      AppMethodBeat.o(113445);
    }
    while (true)
    {
      return paramContext;
      String str1 = String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.nJu), Double.valueOf(paramLocationInfo2.nJv), Double.valueOf(paramLocationInfo1.nJu), Double.valueOf(paramLocationInfo1.nJv) });
      String str2 = str1;
      if (!bo.isNullOrNil(paramLocationInfo2.nJx))
      {
        str2 = str1;
        if (!bo.isNullOrNil(paramLocationInfo1.nJx))
          str2 = str1 + String.format("&from=%s&to=%s", new Object[] { paramLocationInfo2.nJx, paramLocationInfo1.nJx });
      }
      paramLocationInfo2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
      paramLocationInfo2.setPackage(paramString);
      if (bo.k(paramContext, paramLocationInfo2))
      {
        AppMethodBeat.o(113445);
        paramContext = paramLocationInfo2;
      }
      else
      {
        paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.nJu + "," + paramLocationInfo1.nJv));
        paramContext.setPackage(paramString);
        AppMethodBeat.o(113445);
      }
    }
  }

  public static int bJM()
  {
    AppMethodBeat.i(113438);
    ab.d("MicroMsg.MapHelper", "getDefaultZoom isGoogle : false");
    AppMethodBeat.o(113438);
    return 16;
  }

  public final void a(LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(113446);
    PackageManager localPackageManager;
    Object localObject;
    if ("com.tencent.map".equals(paramString))
      if (paramBoolean)
      {
        h.pYm.e(11091, new Object[] { Integer.valueOf(4), Integer.valueOf(2) });
        localPackageManager = this.context.getPackageManager();
        if (!"com.google.android.apps.maps".equals(paramString))
          break label243;
        localObject = a(paramLocationInfo1, paramLocationInfo2, false);
        paramString = (String)localObject;
        if (!bo.k(this.context, (Intent)localObject))
          paramString = a(paramLocationInfo1, paramLocationInfo2, true);
        h.pYm.e(10997, new Object[] { "4", "", Integer.valueOf(0), Integer.valueOf(0) });
        this.context.startActivity(paramString);
        AppMethodBeat.o(113446);
      }
    while (true)
    {
      return;
      h.pYm.e(11091, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
      break;
      if (paramBoolean)
      {
        h.pYm.e(11091, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
        break;
      }
      h.pYm.e(11091, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
      break;
      label243: if ("com.baidu.BaiduMap".equals(paramString))
      {
        localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, false);
        paramString = (String)localObject;
        if (!bo.k(this.context, (Intent)localObject))
          paramString = a(this.context, paramLocationInfo1, paramLocationInfo2, true);
        paramLocationInfo1 = e.aK(this.context, "com.baidu.BaiduMap").applicationInfo.loadLabel(localPackageManager).toString();
        h.pYm.e(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
        this.context.startActivity(paramString);
        AppMethodBeat.o(113446);
      }
      else if ("com.tencent.map".equals(paramString))
      {
        localObject = b(this.context, paramLocationInfo1, paramLocationInfo2, false);
        paramString = (String)localObject;
        if (!bo.k(this.context, (Intent)localObject))
          paramString = b(this.context, paramLocationInfo1, paramLocationInfo2, true);
        h.pYm.e(10997, new Object[] { "2", "", Integer.valueOf(0), Integer.valueOf(0) });
        this.context.startActivity(paramString);
        AppMethodBeat.o(113446);
      }
      else
      {
        PackageInfo localPackageInfo;
        Intent localIntent;
        if ("com.autonavi.minimap".equals(paramString))
        {
          localPackageInfo = e.aK(this.context, paramString);
          if (localPackageInfo != null)
          {
            localIntent = a(this.context, paramLocationInfo1, paramLocationInfo2, false, paramString);
            localObject = localIntent;
            if (!bo.k(this.context, localIntent))
              localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, true, paramString);
            paramLocationInfo1 = localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString();
            h.pYm.e(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
            this.context.startActivity((Intent)localObject);
          }
          AppMethodBeat.o(113446);
        }
        else
        {
          if ("com.sogou.map.android.maps".equals(paramString))
          {
            localPackageInfo = e.aK(this.context, paramString);
            if (localPackageInfo != null)
            {
              localIntent = b(this.context, paramLocationInfo1, paramLocationInfo2, false, paramString);
              localObject = localIntent;
              if (!bo.k(this.context, localIntent))
                localObject = b(this.context, paramLocationInfo1, paramLocationInfo2, true, paramString);
              paramLocationInfo1 = localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString();
              h.pYm.e(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
              this.context.startActivity((Intent)localObject);
            }
          }
          AppMethodBeat.o(113446);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.d
 * JD-Core Version:    0.6.2
 */