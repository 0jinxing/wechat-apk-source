package com.tencent.mm.pluginsdk.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class o extends r
{
  public static final String[] vbu = { "application/msword", "application/vnd.ms-powerpoint", "application/vnd.ms-excel", "application/pdf", "application/epub+zip", "text/plain", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/zip", "application/rar" };
  public static final int[] vbv = { 2131230821, 2131230807, 2131230793, 2131230804, 2131230792, 2131230812, 2131230821, 2131230793, 2131230807, 2131230809, 2131230809 };
  public static final int[] vbw = { 2131230821, 2131230807, 2131230793, 2131230804, 2131230792, 2131230812, 2131230821, 2131230793, 2131230807, 2131230809, 2131230809 };

  public static int aiD(String paramString)
  {
    AppMethodBeat.i(125828);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramString != null)
    {
      localObject2 = localObject1;
      if (paramString.length() > 0)
        localObject2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
    }
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0);
    }
    else
    {
      localObject1 = "*/".concat(String.valueOf(paramString));
    }
    int i = 0;
    int j = -1;
    while (i < vbu.length)
    {
      if (vbu[i].equals(localObject1))
        j = i;
      i++;
    }
    if (j != -1)
    {
      i = vbv[j];
      AppMethodBeat.o(125828);
    }
    while (true)
    {
      return i;
      i = 2131230813;
      AppMethodBeat.o(125828);
    }
  }

  public static int bv(Context paramContext, String paramString)
  {
    AppMethodBeat.i(125824);
    int i;
    if (paramContext == null)
    {
      i = 3;
      AppMethodBeat.o(125824);
    }
    while (true)
    {
      return i;
      boolean bool;
      label31: Object localObject1;
      if ((paramString == null) || (paramString.length() == 0))
      {
        bool = false;
        localObject1 = paramString;
        if (!bool)
          localObject1 = "http://".concat(String.valueOf(paramString));
      }
      Object localObject2;
      Object localObject3;
      try
      {
        paramString = Uri.parse((String)localObject1);
        if (paramString == null)
        {
          AppMethodBeat.o(125824);
          i = 2;
          continue;
          localObject2 = paramString.trim();
          i = ((String)localObject2).toLowerCase().indexOf("://");
          int j = ((String)localObject2).toLowerCase().indexOf('.');
          if ((i > 0) && (j > 0) && (i > j))
          {
            bool = false;
            break label31;
          }
          bool = ((String)localObject2).toLowerCase().contains("://");
          break label31;
        }
        localObject2 = paramString;
        if (paramString.getScheme().toLowerCase().equals("qb"))
        {
          localObject2 = fG(paramContext);
          if (((o.a)localObject2).vbx != -1)
            break label228;
          i = 0;
        }
        while (true)
        {
          localObject2 = paramString;
          if (i == 0)
          {
            paramString = new java/lang/StringBuilder;
            paramString.<init>("http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375");
            localObject2 = Uri.parse(URLEncoder.encode((String)localObject1, "UTF-8"));
          }
          localObject3 = fG(paramContext);
          if (((o.a)localObject3).vbx != -1)
            break label270;
          AppMethodBeat.o(125824);
          i = 4;
          break;
          label228: if (((o.a)localObject2).vbx == 2)
          {
            i = ((o.a)localObject2).ver;
            if (i < 42)
              i = 0;
          }
          else
          {
            i = 1;
          }
        }
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(125824);
        i = 2;
      }
      continue;
      label270: if ((((o.a)localObject3).vbx == 2) && (((o.a)localObject3).ver < 33))
      {
        i = 5;
        AppMethodBeat.o(125824);
      }
      else
      {
        localObject1 = new Intent("android.intent.action.VIEW");
        if (((o.a)localObject3).vbx == 2)
          if ((((o.a)localObject3).ver >= 33) && (((o.a)localObject3).ver <= 39))
          {
            ((Intent)localObject1).setClassName("com.tencent.mtt", "com.tencent.mtt.PhotoEditUI");
            paramString = (String)localObject1;
            label352: paramString.setData((Uri)localObject2);
          }
        try
        {
          paramString.putExtra("loginType", 24);
          paramString.putExtra("ChannelID", "com.tencent.mm");
          paramString.putExtra("PosID", 0);
          paramContext.startActivity(paramString);
          AppMethodBeat.o(125824);
          i = 0;
          continue;
          if ((((o.a)localObject3).ver >= 40) && (((o.a)localObject3).ver <= 45))
          {
            ((Intent)localObject1).setClassName("com.tencent.mtt", "com.tencent.mtt.SplashActivity");
            paramString = (String)localObject1;
            break label352;
          }
          paramString = (String)localObject1;
          if (((o.a)localObject3).ver < 46)
            break label352;
          localObject1 = new Intent("com.tencent.QQBrowser.action.VIEW");
          localObject3 = g(paramContext, (Uri)localObject2);
          paramString = (String)localObject1;
          if (localObject3 == null)
            break label352;
          paramString = (String)localObject1;
          if (TextUtils.isEmpty(((o.b)localObject3).classname))
            break label352;
          ((Intent)localObject1).setClassName(((o.b)localObject3).vbz, ((o.b)localObject3).classname);
          paramString = (String)localObject1;
          break label352;
          if (((o.a)localObject3).vbx == 1)
          {
            if (((o.a)localObject3).ver == 1)
            {
              ((Intent)localObject1).setClassName("com.tencent.qbx5", "com.tencent.qbx5.PhotoEditUI");
              paramString = (String)localObject1;
              break label352;
            }
            paramString = (String)localObject1;
            if (((o.a)localObject3).ver != 2)
              break label352;
            ((Intent)localObject1).setClassName("com.tencent.qbx5", "com.tencent.qbx5.SplashActivity");
            paramString = (String)localObject1;
            break label352;
          }
          if (((o.a)localObject3).vbx == 0)
          {
            if ((((o.a)localObject3).ver >= 4) && (((o.a)localObject3).ver <= 6))
            {
              ((Intent)localObject1).setClassName("com.tencent.qbx", "com.tencent.qbx.SplashActivity");
              paramString = (String)localObject1;
              break label352;
            }
            paramString = (String)localObject1;
            if (((o.a)localObject3).ver <= 6)
              break label352;
            localObject1 = new Intent("com.tencent.QQBrowser.action.VIEW");
            localObject3 = g(paramContext, (Uri)localObject2);
            paramString = (String)localObject1;
            if (localObject3 == null)
              break label352;
            paramString = (String)localObject1;
            if (TextUtils.isEmpty(((o.b)localObject3).classname))
              break label352;
            ((Intent)localObject1).setClassName(((o.b)localObject3).vbz, ((o.b)localObject3).classname);
            paramString = (String)localObject1;
            break label352;
          }
          localObject1 = new Intent("com.tencent.QQBrowser.action.VIEW");
          localObject3 = g(paramContext, (Uri)localObject2);
          paramString = (String)localObject1;
          if (localObject3 == null)
            break label352;
          paramString = (String)localObject1;
          if (TextUtils.isEmpty(((o.b)localObject3).classname))
            break label352;
          ((Intent)localObject1).setClassName(((o.b)localObject3).vbz, ((o.b)localObject3).classname);
          paramString = (String)localObject1;
        }
        catch (ActivityNotFoundException paramContext)
        {
          AppMethodBeat.o(125824);
          i = 4;
        }
      }
    }
  }

  public static boolean fF(Context paramContext)
  {
    AppMethodBeat.i(125820);
    boolean bool;
    if (fG(paramContext).vbx == -1)
    {
      bool = false;
      AppMethodBeat.o(125820);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(125820);
    }
  }

  private static o.a fG(Context paramContext)
  {
    AppMethodBeat.i(125825);
    o.a locala = new o.a();
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      Object localObject1 = null;
      while (true)
      {
        Object localObject2;
        Object localObject4;
        try
        {
          localObject2 = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
          localObject1 = localObject2;
          locala.vbx = 2;
          localObject1 = localObject2;
          locala.vby = "ADRQB_";
          Object localObject3 = localObject2;
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            localObject3 = localObject2;
            if (((PackageInfo)localObject2).versionCode > 420000)
            {
              localObject1 = localObject2;
              locala.ver = ((PackageInfo)localObject2).versionCode;
              localObject1 = localObject2;
              localObject3 = new java/lang/StringBuilder;
              localObject1 = localObject2;
              ((StringBuilder)localObject3).<init>();
              localObject1 = localObject2;
              locala.vby += ((PackageInfo)localObject2).versionName.replaceAll("\\.", "");
              AppMethodBeat.o(125825);
              return locala;
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
          locala.vbx = 0;
          localObject1 = localObject4;
          locala.vby = "ADRQBX_";
          paramContext = (Context)localObject4;
          if (paramContext != null)
          {
            locala.ver = paramContext.versionCode;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            locala.vby += paramContext.versionName.replaceAll("\\.", "");
          }
          label233: AppMethodBeat.o(125825);
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          while (true)
            try
            {
              PackageInfo localPackageInfo1 = localPackageManager.getPackageInfo("com.tencent.qbx5", 0);
              localObject1 = localPackageInfo1;
              locala.vbx = 1;
              localObject1 = localPackageInfo1;
              locala.vby = "ADRQBX5_";
              paramContext = localPackageInfo1;
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException3)
            {
              try
              {
                PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
                localObject1 = localPackageInfo2;
                locala.vbx = 2;
                localObject1 = localPackageInfo2;
                locala.vby = "ADRQB_";
                paramContext = localPackageInfo2;
              }
              catch (PackageManager.NameNotFoundException localNameNotFoundException4)
              {
                try
                {
                  PackageInfo localPackageInfo3 = localPackageManager.getPackageInfo("com.tencent.mtt.x86", 0);
                  localObject1 = localPackageInfo3;
                  locala.vbx = 2;
                  localObject1 = localPackageInfo3;
                  locala.vby = "ADRQB_";
                  paramContext = localPackageInfo3;
                }
                catch (Exception localException)
                {
                  Object localObject5 = localObject1;
                  try
                  {
                    localObject2 = g(paramContext, Uri.parse("http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375"));
                    paramContext = (Context)localObject1;
                    if (localObject2 != null)
                    {
                      paramContext = (Context)localObject1;
                      localObject5 = localObject1;
                      if (!TextUtils.isEmpty(((o.b)localObject2).vbz))
                      {
                        localObject5 = localObject1;
                        paramContext = localPackageManager.getPackageInfo(((o.b)localObject2).vbz, 0);
                        localObject5 = paramContext;
                        locala.vbx = 2;
                        localObject5 = paramContext;
                        locala.vby = "ADRQB_";
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
    }
    catch (Exception paramContext)
    {
      break label233;
    }
  }

  private static o.b g(Context paramContext, Uri paramUri)
  {
    AppMethodBeat.i(125826);
    Object localObject = new Intent("com.tencent.QQBrowser.action.VIEW");
    ((Intent)localObject).setData(paramUri);
    paramUri = paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 0);
    if (paramUri.size() <= 0)
    {
      paramContext = null;
      AppMethodBeat.o(125826);
    }
    while (true)
    {
      return paramContext;
      paramContext = new o.b((byte)0);
      Iterator localIterator = paramUri.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label168;
        localObject = (ResolveInfo)localIterator.next();
        paramUri = ((ResolveInfo)localObject).activityInfo.packageName;
        if (paramUri.contains("com.tencent.mtt"))
        {
          paramContext.classname = ((ResolveInfo)localObject).activityInfo.name;
          paramContext.vbz = ((ResolveInfo)localObject).activityInfo.packageName;
          AppMethodBeat.o(125826);
          break;
        }
        if (paramUri.contains("com.tencent.qbx"))
        {
          paramContext.classname = ((ResolveInfo)localObject).activityInfo.name;
          paramContext.vbz = ((ResolveInfo)localObject).activityInfo.packageName;
        }
      }
      label168: AppMethodBeat.o(125826);
    }
  }

  public final boolean F(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(125827);
    paramContext = paramContext.getPackageManager().queryIntentActivities(paramIntent, 0);
    boolean bool;
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      paramIntent = paramContext.iterator();
      if (paramIntent.hasNext())
      {
        paramContext = ((ResolveInfo)paramIntent.next()).activityInfo.packageName;
        if (paramContext.contains("com.tencent.mtt"))
        {
          AppMethodBeat.o(125827);
          bool = true;
        }
      }
    }
    while (true)
    {
      return bool;
      if (!paramContext.contains("com.tencent.qbx"))
        break;
      AppMethodBeat.o(125827);
      bool = true;
      continue;
      AppMethodBeat.o(125827);
      bool = false;
    }
  }

  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    AppMethodBeat.i(125823);
    if ((paramContext == null) || (paramResolveInfo == null) || (paramResolveInfo.activityInfo == null) || (paramResolveInfo.activityInfo.packageName == null))
    {
      paramContext = null;
      AppMethodBeat.o(125823);
    }
    while (true)
    {
      return paramContext;
      Object localObject = paramResolveInfo.activityInfo.packageName;
      if ("com.qihoo.browser".equals(localObject))
      {
        paramContext = "360浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.mx.browser".equals(localObject))
      {
        paramContext = "傲游云浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.dolphin.browser.xf".equals(localObject))
      {
        paramContext = "海豚浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.UCMobile".equals(localObject))
      {
        paramContext = "UC浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.baidu.browser.apps".equals(localObject))
      {
        paramContext = "百度浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("sogou.mobile.explorer".equals(localObject))
      {
        paramContext = "搜狗浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.ijinshan.browser".equals(localObject))
      {
        paramContext = "猎豹浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.mediawoz.xbrowser".equals(localObject))
      {
        paramContext = "GO浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.oupeng.browser".equals(localObject))
      {
        paramContext = "欧朋浏览器";
        AppMethodBeat.o(125823);
      }
      else if ("com.tiantianmini.android.browser".equals(localObject))
      {
        paramContext = "天天浏览器";
        AppMethodBeat.o(125823);
      }
      else
      {
        localObject = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager());
        if (localObject != null)
        {
          localObject = ((CharSequence)localObject).toString();
          localObject = Pattern.compile("\\(.*推荐.*\\)", 2).matcher((CharSequence)localObject);
          if (((Matcher)localObject).find())
          {
            paramContext = ((Matcher)localObject).replaceAll("");
            AppMethodBeat.o(125823);
          }
        }
        else
        {
          paramContext = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager()).toString();
          AppMethodBeat.o(125823);
        }
      }
    }
  }

  public final boolean aix(String paramString)
  {
    AppMethodBeat.i(125821);
    boolean bool;
    if (("com.tencent.mtt".equals(paramString)) || ("com.tencent.qbx".equals(paramString)) || ("com.tencent.mtt.x86".equals(paramString)) || ("com.tencent.qbx5".equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(125821);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125821);
    }
  }

  public final String anK()
  {
    return "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10318";
  }

  public final String dgX()
  {
    return "qq_browser.apk";
  }

  public final s.a dgY()
  {
    AppMethodBeat.i(125822);
    s.a locala = new s.a();
    locala.vbD = 2131302043;
    locala.vbF = 2131302044;
    locala.vbC = 2130839081;
    AppMethodBeat.o(125822);
    return locala;
  }

  public final boolean fE(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(125819);
    paramContext = fG(paramContext);
    if (paramContext.vbx == -1)
      AppMethodBeat.o(125819);
    while (true)
    {
      return bool;
      if ((paramContext.vbx == 2) && (paramContext.ver < 33))
      {
        AppMethodBeat.o(125819);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(125819);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.o
 * JD-Core Version:    0.6.2
 */