package com.tencent.smtt.sdk.a;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class d
{
  public static int a(Context paramContext, String paramString, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    AppMethodBeat.i(65155);
    int i;
    if (paramContext == null)
    {
      i = 3;
      AppMethodBeat.o(65155);
    }
    Object localObject1;
    label76: Object localObject2;
    while (true)
    {
      return i;
      localObject1 = paramString;
      if (!a(paramString))
        localObject1 = "http://".concat(String.valueOf(paramString));
      try
      {
        localObject1 = Uri.parse((String)localObject1);
        if (localObject1 != null)
          break label76;
        AppMethodBeat.o(65155);
        i = 2;
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(65155);
        i = 2;
      }
      continue;
      localObject2 = a(paramContext);
      if (((d.a)localObject2).a == -1)
      {
        AppMethodBeat.o(65155);
        i = 4;
      }
      else
      {
        if ((((d.a)localObject2).a != 2) || (((d.a)localObject2).b >= 33))
          break;
        i = 5;
        AppMethodBeat.o(65155);
      }
    }
    paramString = new Intent("android.intent.action.VIEW");
    if (((d.a)localObject2).a == 2)
      if ((((d.a)localObject2).b >= 33) && (((d.a)localObject2).b <= 39))
        paramString.setClassName("com.tencent.mtt", "com.tencent.mtt.MainActivity");
    label660: 
    while (true)
    {
      while (true)
      {
        paramString.setData((Uri)localObject1);
        if (paramHashMap != null)
        {
          localObject1 = paramHashMap.keySet();
          if (localObject1 != null)
          {
            localObject2 = ((Set)localObject1).iterator();
            while (true)
              if (((Iterator)localObject2).hasNext())
              {
                String str = (String)((Iterator)localObject2).next();
                localObject1 = (String)paramHashMap.get(str);
                if (!TextUtils.isEmpty((CharSequence)localObject1))
                {
                  paramString.putExtra(str, (String)localObject1);
                  continue;
                  if ((((d.a)localObject2).b >= 40) && (((d.a)localObject2).b <= 45))
                  {
                    paramString.setClassName("com.tencent.mtt", "com.tencent.mtt.SplashActivity");
                    break;
                  }
                  if (((d.a)localObject2).b < 46)
                    break label660;
                  paramString = new Intent("com.tencent.QQBrowser.action.VIEW");
                  localObject2 = a(paramContext, (Uri)localObject1);
                  if ((localObject2 != null) && (!TextUtils.isEmpty(((d.b)localObject2).a)))
                    paramString.setClassName(((d.b)localObject2).b, ((d.b)localObject2).a);
                  break;
                  if (((d.a)localObject2).a == 1)
                  {
                    if (((d.a)localObject2).b == 1)
                    {
                      paramString.setClassName("com.tencent.qbx5", "com.tencent.qbx5.MainActivity");
                      break;
                    }
                    if (((d.a)localObject2).b != 2)
                      break label660;
                    paramString.setClassName("com.tencent.qbx5", "com.tencent.qbx5.SplashActivity");
                    break;
                  }
                  if (((d.a)localObject2).a == 0)
                  {
                    if ((((d.a)localObject2).b >= 4) && (((d.a)localObject2).b <= 6))
                    {
                      paramString.setClassName("com.tencent.qbx", "com.tencent.qbx.SplashActivity");
                      break;
                    }
                    if (((d.a)localObject2).b <= 6)
                      break label660;
                    paramString = new Intent("com.tencent.QQBrowser.action.VIEW");
                    localObject2 = a(paramContext, (Uri)localObject1);
                    if ((localObject2 != null) && (!TextUtils.isEmpty(((d.b)localObject2).a)))
                      paramString.setClassName(((d.b)localObject2).b, ((d.b)localObject2).a);
                    break;
                  }
                  paramString = new Intent("com.tencent.QQBrowser.action.VIEW");
                  localObject2 = a(paramContext, (Uri)localObject1);
                  if ((localObject2 != null) && (!TextUtils.isEmpty(((d.b)localObject2).a)))
                    paramString.setClassName(((d.b)localObject2).b, ((d.b)localObject2).a);
                  break;
                }
              }
          }
        }
        try
        {
          paramString.putExtra("loginType", d(paramContext));
          paramString.addFlags(268435456);
          if (paramWebView != null)
          {
            paramHashMap = new android/graphics/Point;
            paramHashMap.<init>(paramWebView.getScrollX(), paramWebView.getScrollY());
            paramString.putExtra("AnchorPoint", paramHashMap);
            paramHashMap = new android/graphics/Point;
            paramHashMap.<init>(paramWebView.getContentWidth(), paramWebView.getContentHeight());
            paramString.putExtra("ContentSize", paramHashMap);
          }
          paramContext.startActivity(paramString);
          i = 0;
          AppMethodBeat.o(65155);
        }
        catch (ActivityNotFoundException paramContext)
        {
          AppMethodBeat.o(65155);
          i = 4;
        }
      }
      break;
    }
  }

  public static int a(Context paramContext, String paramString1, HashMap<String, String> paramHashMap, String paramString2, WebView paramWebView)
  {
    int i = 0;
    AppMethodBeat.i(65154);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      localObject = paramContext.getPackageManager();
      if (localObject != null)
      {
        localObject = ((PackageManager)localObject).getPackageInfo("com.tencent.mtt", 0);
        if (localObject != null)
        {
          j = ((PackageInfo)localObject).versionCode;
          if (j > 601000)
            j = 1;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        try
        {
          Object localObject = URLEncoder.encode(paramString1, "UTF-8");
          if (j != 0)
            paramString1 = (String)localObject;
          if (j != 0)
          {
            localObject = ",encoded=1";
            localStringBuilder.append("mttbrowser://url=").append(paramString1).append(",product=TBS,packagename=").append(paramContext.getPackageName()).append(",from=").append(paramString2).append(",version=4.3.0.1057").append((String)localObject);
            j = a(paramContext, localStringBuilder.toString(), paramHashMap, paramWebView);
            AppMethodBeat.o(65154);
            return j;
            localThrowable = localThrowable;
            j = 0;
            continue;
          }
          String str = "";
          continue;
        }
        catch (Exception localException)
        {
          j = i;
          continue;
        }
        int j = 0;
      }
    }
  }

  private static Uri a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(65152);
    paramContext = Uri.fromFile(new File(paramString));
    AppMethodBeat.o(65152);
    return paramContext;
  }

  public static d.a a(Context paramContext)
  {
    AppMethodBeat.i(65158);
    boolean bool = paramContext.getApplicationContext().getSharedPreferences("x5_proxy_setting", 0).getBoolean("qb_install_status", false);
    d.a locala = new d.a();
    if (bool)
      AppMethodBeat.o(65158);
    while (true)
    {
      return locala;
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        Object localObject1 = null;
        Object localObject2;
        Object localObject4;
        try
        {
          localObject2 = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
          localObject1 = localObject2;
          locala.a = 2;
          localObject1 = localObject2;
          locala.e = "com.tencent.mtt";
          localObject1 = localObject2;
          locala.c = "ADRQB_";
          Object localObject3 = localObject2;
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            localObject3 = localObject2;
            if (((PackageInfo)localObject2).versionCode > 420000)
            {
              localObject1 = localObject2;
              locala.b = ((PackageInfo)localObject2).versionCode;
              localObject1 = localObject2;
              localObject3 = new java/lang/StringBuilder;
              localObject1 = localObject2;
              ((StringBuilder)localObject3).<init>();
              localObject1 = localObject2;
              locala.c += ((PackageInfo)localObject2).versionName.replaceAll("\\.", "");
              localObject1 = localObject2;
              locala.d = ((PackageInfo)localObject2).versionName.replaceAll("\\.", "");
              AppMethodBeat.o(65158);
            }
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          localObject4 = localObject1;
          localObject1 = localObject4;
        }
        try
        {
          localObject4 = localPackageManager.getPackageInfo("com.tencent.qbx", 0);
          localObject1 = localObject4;
          locala.a = 0;
          localObject1 = localObject4;
          locala.e = "com.tencent.qbx";
          localObject1 = localObject4;
          locala.c = "ADRQBX_";
          paramContext = (Context)localObject4;
          if (paramContext != null)
          {
            locala.b = paramContext.versionCode;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            locala.c += paramContext.versionName.replaceAll("\\.", "");
            locala.d = paramContext.versionName.replaceAll("\\.", "");
          }
          label337: AppMethodBeat.o(65158);
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          while (true)
            try
            {
              PackageInfo localPackageInfo1 = localPackageManager.getPackageInfo("com.tencent.qbx5", 0);
              localObject1 = localPackageInfo1;
              locala.a = 1;
              localObject1 = localPackageInfo1;
              locala.e = "com.tencent.qbx5";
              localObject1 = localPackageInfo1;
              locala.c = "ADRQBX5_";
              paramContext = localPackageInfo1;
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException3)
            {
              try
              {
                PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
                localObject1 = localPackageInfo2;
                locala.e = "com.tencent.mtt";
                localObject1 = localPackageInfo2;
                locala.a = 2;
                localObject1 = localPackageInfo2;
                locala.c = "ADRQB_";
                paramContext = localPackageInfo2;
              }
              catch (PackageManager.NameNotFoundException localNameNotFoundException4)
              {
                try
                {
                  PackageInfo localPackageInfo3 = localPackageManager.getPackageInfo("com.tencent.mtt.x86", 0);
                  localObject1 = localPackageInfo3;
                  locala.e = "com.tencent.mtt.x86";
                  localObject1 = localPackageInfo3;
                  locala.a = 2;
                  localObject1 = localPackageInfo3;
                  locala.c = "ADRQB_";
                  paramContext = localPackageInfo3;
                }
                catch (Exception localException)
                {
                  Object localObject5 = localObject1;
                  try
                  {
                    localObject2 = a(paramContext, Uri.parse("http://mdc.html5.qq.com/mh?channel_id=50079&u="));
                    paramContext = (Context)localObject1;
                    if (localObject2 != null)
                    {
                      paramContext = (Context)localObject1;
                      localObject5 = localObject1;
                      if (!TextUtils.isEmpty(((d.b)localObject2).b))
                      {
                        localObject5 = localObject1;
                        paramContext = localPackageManager.getPackageInfo(((d.b)localObject2).b, 0);
                        localObject5 = paramContext;
                        locala.e = ((d.b)localObject2).b;
                        localObject5 = paramContext;
                        locala.a = 2;
                        localObject5 = paramContext;
                        locala.c = "ADRQB_";
                      }
                    }
                  }
                  catch (Exception paramContext)
                  {
                    paramContext = (Context)localObject5;
                  }
                }
              }
            }
        }
      }
      catch (Exception paramContext)
      {
        break label337;
      }
    }
  }

  private static d.b a(Context paramContext, Uri paramUri)
  {
    ResolveInfo localResolveInfo = null;
    AppMethodBeat.i(65157);
    Object localObject = new Intent("com.tencent.QQBrowser.action.VIEW");
    ((Intent)localObject).setData(paramUri);
    paramUri = paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 0);
    if (paramUri.size() <= 0)
    {
      AppMethodBeat.o(65157);
      paramContext = localResolveInfo;
    }
    while (true)
    {
      return paramContext;
      paramContext = new d.b(null);
      localObject = paramUri.iterator();
      while (true)
      {
        if (!((Iterator)localObject).hasNext())
          break label170;
        localResolveInfo = (ResolveInfo)((Iterator)localObject).next();
        paramUri = localResolveInfo.activityInfo.packageName;
        if (paramUri.contains("com.tencent.mtt"))
        {
          paramContext.a = localResolveInfo.activityInfo.name;
          paramContext.b = localResolveInfo.activityInfo.packageName;
          AppMethodBeat.o(65157);
          break;
        }
        if (paramUri.contains("com.tencent.qbx"))
        {
          paramContext.a = localResolveInfo.activityInfo.name;
          paramContext.b = localResolveInfo.activityInfo.packageName;
        }
      }
      label170: AppMethodBeat.o(65157);
    }
  }

  public static boolean a(Context paramContext, long paramLong1, long paramLong2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(65162);
    d.a locala = a(paramContext);
    boolean bool2 = false;
    try
    {
      long l = Long.valueOf(locala.d).longValue();
      if (l >= paramLong1)
        bool2 = true;
      if (locala.b >= paramLong2)
      {
        bool2 = bool1;
        AppMethodBeat.o(65162);
        return bool2;
      }
    }
    catch (NumberFormatException paramContext)
    {
      while (true);
    }
  }

  public static boolean a(Context paramContext, String paramString1, int paramInt, String paramString2, HashMap<String, String> paramHashMap, Bundle paramBundle)
  {
    AppMethodBeat.i(65151);
    Intent localIntent;
    boolean bool;
    try
    {
      localIntent = new android/content/Intent;
      localIntent.<init>("com.tencent.QQBrowser.action.sdk.document");
      if (paramHashMap == null)
        break label113;
      Object localObject = paramHashMap.keySet();
      if (localObject == null)
        break label113;
      Iterator localIterator = ((Set)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        String str = (String)paramHashMap.get(localObject);
        if (!TextUtils.isEmpty(str))
          localIntent.putExtra((String)localObject, str);
      }
    }
    catch (Exception paramContext)
    {
      bool = false;
      AppMethodBeat.o(65151);
    }
    return bool;
    label113: new File(paramString1);
    localIntent.putExtra("key_reader_sdk_id", 3);
    localIntent.putExtra("key_reader_sdk_type", paramInt);
    if (paramInt == 0)
      localIntent.putExtra("key_reader_sdk_path", paramString1);
    while (true)
    {
      localIntent.putExtra("key_reader_sdk_format", paramString2);
      if ((paramContext != null) && (paramContext.getApplicationInfo().targetSdkVersion >= 24) && (Build.VERSION.SDK_INT >= 24))
        localIntent.addFlags(1);
      localIntent.setDataAndType(a(paramContext, paramString1), "mtt/".concat(String.valueOf(paramString2)));
      localIntent.putExtra("loginType", d(paramContext.getApplicationContext()));
      if (paramBundle != null)
        localIntent.putExtra("key_reader_sdk_extrals", paramBundle);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(65151);
      bool = true;
      break;
      if (paramInt == 1)
        localIntent.putExtra("key_reader_sdk_url", paramString1);
    }
  }

  public static boolean a(Context paramContext, String paramString, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(65153);
    Object localObject = Uri.parse(paramString);
    paramString = new Intent("android.intent.action.VIEW");
    paramString.setFlags(268435456);
    paramString.setDataAndType((Uri)localObject, "video/*");
    if (paramHashMap != null)
    {
      localObject = paramHashMap.keySet();
      if (localObject != null)
      {
        Iterator localIterator = ((Set)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          String str = (String)paramHashMap.get(localObject);
          if (!TextUtils.isEmpty(str))
            paramString.putExtra((String)localObject, str);
        }
      }
    }
    try
    {
      paramString.putExtra("loginType", d(paramContext));
      paramHashMap = new android/content/ComponentName;
      paramHashMap.<init>("com.tencent.mtt", "com.tencent.mtt.browser.video.H5VideoThrdcallActivity");
      paramString.setComponent(paramHashMap);
      paramContext.startActivity(paramString);
      i = 1;
      if (i != 0);
    }
    catch (Throwable paramHashMap)
    {
      try
      {
        paramString.setComponent(null);
        paramContext.startActivity(paramString);
        AppMethodBeat.o(65153);
        bool = true;
        return bool;
        paramHashMap = paramHashMap;
        int i = 0;
      }
      catch (Throwable paramContext)
      {
        while (true)
        {
          AppMethodBeat.o(65153);
          boolean bool = false;
        }
      }
    }
  }

  private static boolean a(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(65159);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(65159);
    while (true)
    {
      return bool;
      paramString = paramString.trim();
      int i = paramString.toLowerCase().indexOf("://");
      int j = paramString.toLowerCase().indexOf('.');
      if ((i > 0) && (j > 0) && (i > j))
      {
        AppMethodBeat.o(65159);
      }
      else
      {
        bool = paramString.toLowerCase().contains("://");
        AppMethodBeat.o(65159);
      }
    }
  }

  public static boolean b(Context paramContext)
  {
    AppMethodBeat.i(65160);
    boolean bool;
    if (a(paramContext).a == -1)
    {
      bool = false;
      AppMethodBeat.o(65160);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(65160);
    }
  }

  public static boolean c(Context paramContext)
  {
    boolean bool1 = true;
    AppMethodBeat.i(65161);
    paramContext = a(paramContext);
    boolean bool2 = false;
    try
    {
      long l = Long.valueOf(paramContext.d).longValue();
      if (l >= 6001500L)
        bool2 = true;
      if (paramContext.b >= 601500)
      {
        bool2 = bool1;
        AppMethodBeat.o(65161);
        return bool2;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true);
    }
  }

  private static int d(Context paramContext)
  {
    AppMethodBeat.i(65156);
    int i = 26;
    paramContext = paramContext.getApplicationInfo().processName;
    if (paramContext.equals("com.tencent.mobileqq"))
      i = 13;
    while (true)
    {
      AppMethodBeat.o(65156);
      return i;
      if (paramContext.equals("com.qzone"))
        i = 14;
      else if (paramContext.equals("com.tencent.WBlog"))
        i = 15;
      else if (paramContext.equals("com.tencent.mm"))
        i = 24;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a.d
 * JD-Core Version:    0.6.2
 */