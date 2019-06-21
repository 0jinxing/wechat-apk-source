package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.pluginsdk.c.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g
{
  public static int Kw(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(79272);
    new ArrayList();
    if (a.a.bYQ() == null)
    {
      ab.e("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
      AppMethodBeat.o(79272);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      Cursor localCursor = a.a.bYQ().eQ(0, paramInt);
      if (localCursor == null)
      {
        AppMethodBeat.o(79272);
        paramInt = i;
      }
      else
      {
        paramInt = localCursor.getCount();
        localCursor.close();
        AppMethodBeat.o(79272);
      }
    }
  }

  public static f Uq(String paramString)
  {
    AppMethodBeat.i(138580);
    paramString = bT(paramString, true);
    AppMethodBeat.o(138580);
    return paramString;
  }

  public static List<f> a(Context paramContext, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(79270);
    Object localObject = new ArrayList();
    if (a.a.bYQ() == null)
    {
      ab.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      AppMethodBeat.o(79270);
      paramContext = (Context)localObject;
    }
    while (true)
    {
      return paramContext;
      List localList = gJ(1, paramInt);
      localObject = null;
      if (paramBoolean)
      {
        localObject = new int[1];
        localObject[0] = 5;
      }
      if (localObject == null)
      {
        AppMethodBeat.o(79270);
        paramContext = localList;
      }
      else
      {
        localObject = a.a.bYQ().x((int[])localObject);
        if (localObject != null)
        {
          while (((Cursor)localObject).moveToNext())
          {
            f localf = new f();
            localf.d((Cursor)localObject);
            if (localf.field_status == 1)
            {
              if (u(paramContext, localf.field_appId))
              {
                if (!bo.isNullOrNil(localf.field_signature))
                  localList.add(localf);
              }
              else
              {
                localf.field_status = 4;
                a.a.bYQ().e(localf);
              }
            }
            else if (localf.field_signature != null)
              localList.add(localf);
          }
          ((Cursor)localObject).close();
        }
        AppMethodBeat.o(79270);
        paramContext = localList;
      }
    }
  }

  public static boolean a(Context paramContext, Intent paramIntent, String paramString, int paramInt, aj paramaj, Bundle paramBundle)
  {
    AppMethodBeat.i(79296);
    boolean bool;
    if ((paramContext == null) || (paramIntent == null))
    {
      ab.i("MicroMsg.AppInfoLogic", "launchApp failed, context or intent is null.");
      if (paramaj != null)
        paramaj.dR(false);
      bool = false;
      AppMethodBeat.o(79296);
    }
    while (true)
    {
      return bool;
      String str;
      if (paramBundle != null)
      {
        str = paramBundle.getString("current_page_url", "");
        paramBundle = paramBundle.getString("current_page_appid", "");
        label71: localObject = bo.H(paramContext, paramIntent);
        if ((localObject == null) || (((List)localObject).isEmpty()))
          break label358;
        if ((!TextUtils.isEmpty(paramIntent.getPackage())) || (((List)localObject).size() != 1))
          break label203;
      }
      label203: for (Object localObject = b((ResolveInfo)((List)localObject).get(0)); ; localObject = paramIntent.getPackage())
      {
        ab.d("MicroMsg.AppInfoLogic", "launchApp, wxpkg : %s.", new Object[] { ah.getPackageName() });
        if (!bo.nullAsNil(ah.getPackageName()).equals(localObject))
          break label212;
        ab.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
        if (paramaj != null)
          paramaj.dR(false);
        bool = false;
        AppMethodBeat.o(79296);
        break;
        str = "";
        paramBundle = "";
        break label71;
      }
      label212: ab.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) by wechat with intent", new Object[] { localObject });
      if (paramInt == 2)
      {
        paramContext.startActivity(paramIntent);
        if (paramaj != null)
          paramaj.dR(true);
        bool = true;
        AppMethodBeat.o(79296);
      }
      else
      {
        if (!TextUtils.isEmpty(paramString));
        for (paramString = paramContext.getString(2131300905, new Object[] { paramString }); ; paramString = paramContext.getString(2131300904))
        {
          com.tencent.mm.ui.base.h.a(paramContext, paramString, "", paramContext.getString(2131300901), paramContext.getString(2131296868), false, new g.4(paramContext, paramIntent, (String)localObject, str, paramBundle, paramaj), new g.5((String)localObject, str, paramBundle, paramaj));
          bool = true;
          AppMethodBeat.o(79296);
          break;
        }
        label358: ab.w("MicroMsg.AppInfoLogic", "launchApp failed, not activity can resolve the intent.");
        if (paramaj != null)
          paramaj.dR(false);
        bool = false;
        AppMethodBeat.o(79296);
      }
    }
  }

  public static boolean a(Context paramContext, Intent paramIntent, String paramString, aj paramaj)
  {
    AppMethodBeat.i(79294);
    boolean bool = a(paramContext, paramIntent, paramString, paramaj, null);
    AppMethodBeat.o(79294);
    return bool;
  }

  public static boolean a(Context paramContext, Intent paramIntent, String paramString, aj paramaj, Bundle paramBundle)
  {
    AppMethodBeat.i(79295);
    boolean bool = a(paramContext, paramIntent, paramString, 0, paramaj, paramBundle);
    AppMethodBeat.o(79295);
    return bool;
  }

  public static boolean a(Context paramContext, f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(79275);
    if (paramf == null)
    {
      ab.w("MicroMsg.AppInfoLogic", "app is null");
      AppMethodBeat.o(79275);
    }
    while (true)
    {
      return bool;
      if ((paramf.field_packageName == null) || (paramf.field_packageName.length() == 0))
      {
        ab.w("MicroMsg.AppInfoLogic", "field_packageName is null");
        AppMethodBeat.o(79275);
      }
      else
      {
        bool = p.u(paramContext, paramf.field_packageName);
        AppMethodBeat.o(79275);
      }
    }
  }

  public static boolean a(Context paramContext, String paramString, WXMediaMessage paramWXMediaMessage, int paramInt, aj paramaj, Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(79289);
    if (paramContext == null)
    {
      ab.e("MicroMsg.AppInfoLogic", "launch app failed: context is null");
      if (paramaj != null)
        paramaj.dR(false);
      AppMethodBeat.o(79289);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.AppInfoLogic", "launch app failed: appid is null or nil");
        if (paramaj != null)
          paramaj.dR(false);
        AppMethodBeat.o(79289);
      }
      else if (paramWXMediaMessage == null)
      {
        ab.e("MicroMsg.AppInfoLogic", "launch app failed: wxMsg is null");
        if (paramaj != null)
          paramaj.dR(false);
        AppMethodBeat.o(79289);
      }
      else
      {
        if (Looper.myLooper() == Looper.getMainLooper());
        for (f localf = dX(paramString, 2147483647); ; localf = bS(paramString, false))
        {
          if (localf != null)
            break label185;
          ab.e("MicroMsg.AppInfoLogic", "get appinfo is null, appid is : [%s]", new Object[] { paramString });
          if (paramaj != null)
            paramaj.dR(false);
          AppMethodBeat.o(79289);
          break;
        }
        label185: if (localf.field_status == 3)
        {
          ab.e("MicroMsg.AppInfoLogic", "requestAppShow fail, app is in blacklist, packageName = " + localf.field_packageName);
          if (paramaj != null)
            paramaj.dR(false);
          AppMethodBeat.o(79289);
        }
        else
        {
          bool = a(paramContext, localf.field_packageName, paramWXMediaMessage, paramString, localf.field_openId, paramInt, paramaj, paramBundle);
          AppMethodBeat.o(79289);
        }
      }
    }
  }

  public static boolean a(Context paramContext, String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3, int paramInt, aj paramaj, Bundle paramBundle)
  {
    AppMethodBeat.i(79290);
    ab.d("MicroMsg.AppInfoLogic", "request pkg = " + paramString1 + ", openId = " + paramString3);
    boolean bool = a(paramContext, paramString1, paramString2, c(paramContext, paramWXMediaMessage, paramString3), paramInt, paramaj, paramBundle);
    AppMethodBeat.o(79290);
    return bool;
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2, ShowMessageFromWX.Req paramReq, int paramInt, aj paramaj, Bundle paramBundle)
  {
    AppMethodBeat.i(79291);
    boolean bool;
    if (paramReq == null)
    {
      ab.i("MicroMsg.AppInfoLogic", "launchApp failed, req is null.");
      if (paramaj != null)
        paramaj.dR(false);
      bool = false;
      AppMethodBeat.o(79291);
    }
    g.1 local1;
    while (true)
    {
      return bool;
      if ((TextUtils.isEmpty(paramString1)) || (!p.u(paramContext, paramString1)))
      {
        ab.i("MicroMsg.AppInfoLogic", "launchApp failed, pkg is null or application has not installed.");
        com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131298234));
        if (paramaj != null)
          paramaj.dR(false);
        bool = false;
        AppMethodBeat.o(79291);
      }
      else
      {
        ab.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) with appId(%s)", new Object[] { paramString1, paramString2 });
        if (bo.nullAsNil(ah.getPackageName()).equals(paramString1))
        {
          ab.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
          if (paramaj != null)
            paramaj.dR(false);
          bool = false;
          AppMethodBeat.o(79291);
        }
        else
        {
          local1 = new g.1(paramReq, paramString1, paramContext, paramaj);
          if (paramInt != 2)
            break;
          ab.i("MicroMsg.AppInfoLogic", "launchApp with show confirm dialog(%s).", new Object[] { paramString1 });
          local1.run();
          bool = true;
          AppMethodBeat.o(79291);
        }
      }
    }
    label249: Object localObject;
    if (paramBundle != null)
    {
      paramReq = paramBundle.getString("current_page_url", "");
      paramBundle = paramBundle.getString("current_page_appid", "");
      localObject = bT(paramString2, true);
      if ((localObject == null) || (bo.isNullOrNil(b(paramContext, (f)localObject, null))))
        break label403;
      localObject = paramContext.getString(2131300905, new Object[] { b(paramContext, (f)localObject, null) });
      label296: if (paramString2 != null)
        break label414;
      paramString2 = "";
    }
    label403: label414: 
    while (true)
    {
      aiG(paramString2);
      ab.i("MicroMsg.AppInfoLogic", "launchApp with args(showType : %s, pkg : %s)", new Object[] { Integer.valueOf(paramInt), paramString1 });
      com.tencent.mm.ui.base.h.a(paramContext, (String)localObject, "", paramContext.getString(2131300901), paramContext.getString(2131296868), false, new g.2(paramString1, paramReq, paramBundle, paramString2, local1), new g.3(paramString1, paramReq, paramBundle, paramString2, paramaj));
      bool = true;
      AppMethodBeat.o(79291);
      break;
      paramReq = "";
      paramBundle = "";
      break label249;
      localObject = paramContext.getString(2131300904);
      break label296;
    }
  }

  private static boolean a(f paramf, int paramInt)
  {
    if ((paramf == null) || (paramf.field_appVersion < paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean ad(Context paramContext, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(79268);
    Long localLong = c.a.aik(String.valueOf(paramInt));
    if (localLong == null)
      AppMethodBeat.o(79268);
    while (true)
    {
      return bool;
      if (b(paramContext, localLong.longValue(), true).size() == 0)
      {
        AppMethodBeat.o(79268);
      }
      else
      {
        AppMethodBeat.o(79268);
        bool = true;
      }
    }
  }

  public static boolean aiF(String paramString)
  {
    AppMethodBeat.i(79285);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(79285);
    }
    while (true)
    {
      return bool;
      bool = j(bT(paramString, true));
      AppMethodBeat.o(79285);
    }
  }

  private static void aiG(String paramString)
  {
    AppMethodBeat.i(79292);
    if ("wx073f4a4daff0abe8".equalsIgnoreCase(paramString))
      com.tencent.mm.plugin.report.service.h.pYm.e(15413, new Object[] { Integer.valueOf(1), "", "" });
    AppMethodBeat.o(79292);
  }

  public static Bitmap b(String paramString, int paramInt, float paramFloat)
  {
    Object localObject = null;
    AppMethodBeat.i(79265);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppInfoLogic", "getAppIcon, appId is null");
      AppMethodBeat.o(79265);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (!com.tencent.mm.kernel.g.RN().QY())
      {
        AppMethodBeat.o(79265);
        paramString = localObject;
      }
      else if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
      {
        if (ah.getContext() == null)
        {
          AppMethodBeat.o(79265);
          paramString = localObject;
        }
        else if (ah.getContext().getResources() == null)
        {
          AppMethodBeat.o(79265);
          paramString = localObject;
        }
        else
        {
          switch (paramInt)
          {
          default:
            ab.e("MicroMsg.AppInfoLogic", "getAppIcon, unknown iconType = ".concat(String.valueOf(paramInt)));
            AppMethodBeat.o(79265);
            paramString = localObject;
            break;
          case 1:
          case 3:
          case 4:
          case 5:
            paramString = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130840192);
            if ((paramString == null) || (paramString.isRecycled()))
            {
              AppMethodBeat.o(79265);
              paramString = localObject;
              continue;
            }
            AppMethodBeat.o(79265);
            break;
          case 2:
            AppMethodBeat.o(79265);
            paramString = localObject;
            break;
          }
        }
      }
      else
      {
        Bitmap localBitmap = a.a.bYQ().a(paramString, paramInt, paramFloat);
        if (localBitmap == null)
        {
          ab.w("MicroMsg.AppInfoLogic", "getAppIcon, bm does not exist or has been recycled");
          a.a.bYQ().cN(paramString, paramInt);
          AppMethodBeat.o(79265);
          paramString = localObject;
        }
        else if (localBitmap.isRecycled())
        {
          AppMethodBeat.o(79265);
          paramString = localObject;
        }
        else
        {
          AppMethodBeat.o(79265);
          paramString = localBitmap;
        }
      }
    }
  }

  public static String b(Context paramContext, f paramf, String paramString)
  {
    AppMethodBeat.i(79279);
    if ((paramContext == null) || (paramf == null))
      AppMethodBeat.o(79279);
    while (true)
    {
      return paramString;
      String str = fK(paramContext);
      Object localObject = null;
      if (str.equalsIgnoreCase("zh_CN"))
        localObject = paramf.field_appName;
      if (str.equalsIgnoreCase("en"))
      {
        if (bo.isNullOrNil(paramf.field_appName_en))
          localObject = paramf.field_appName;
      }
      else
      {
        label72: if (!str.equalsIgnoreCase("zh_TW"))
        {
          paramContext = (Context)localObject;
          if (!str.equalsIgnoreCase("zh_HK"));
        }
        else
        {
          if (str.equalsIgnoreCase("zh_HK"))
          {
            if (!bo.isNullOrNil(paramf.field_appName_hk))
              break label199;
            localObject = paramf.field_appName_tw;
          }
          label121: paramContext = (Context)localObject;
          if (bo.isNullOrNil((String)localObject))
          {
            if (!bo.isNullOrNil(paramf.field_appName_tw))
              break label208;
            paramContext = paramf.field_appName;
          }
        }
        label147: localObject = paramContext;
        if (bo.isNullOrNil(paramContext))
          if (!bo.isNullOrNil(paramf.field_appName_en))
            break label216;
      }
      label199: label208: label216: for (localObject = paramf.field_appName; ; localObject = paramf.field_appName_en)
      {
        if (!bo.isNullOrNil((String)localObject))
          break label225;
        AppMethodBeat.o(79279);
        break;
        localObject = paramf.field_appName_en;
        break label72;
        localObject = paramf.field_appName_hk;
        break label121;
        paramContext = paramf.field_appName_tw;
        break label147;
      }
      label225: AppMethodBeat.o(79279);
      paramString = (String)localObject;
    }
  }

  public static String b(ResolveInfo paramResolveInfo)
  {
    AppMethodBeat.i(79298);
    Object localObject;
    if (paramResolveInfo == null)
    {
      localObject = null;
      AppMethodBeat.o(79298);
    }
    while (true)
    {
      return localObject;
      String str = paramResolveInfo.resolvePackageName;
      localObject = str;
      if (TextUtils.isEmpty(str))
      {
        localObject = str;
        if (paramResolveInfo.activityInfo != null)
          localObject = paramResolveInfo.activityInfo.packageName;
      }
      AppMethodBeat.o(79298);
    }
  }

  public static List<f> b(Context paramContext, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(79266);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = com.tencent.mm.plugin.s.a.bYJ();
    Object localObject2 = new StringBuilder(256);
    ((StringBuilder)localObject2).append("select * from AppInfo");
    ((StringBuilder)localObject2).append(" where ");
    ((StringBuilder)localObject2).append(" ( appSupportContentType & ").append(paramLong).append(" ) != 0");
    ((StringBuilder)localObject2).append(" and  ( svrAppSupportContentType & ").append(paramLong).append(" ) != 0");
    ((StringBuilder)localObject2).append(" and  ( appInfoFlag & 8192 ) != 0");
    ((StringBuilder)localObject2).append(" and status != 4");
    if (!paramBoolean)
      ((StringBuilder)localObject2).append(" and  ( appInfoFlag & 16384 ) == 0");
    ab.v("MicroMsg.AppInfoStorage", "getAppInfoByContentFlag sql %s", new Object[] { ((StringBuilder)localObject2).toString() });
    localObject2 = ((i)localObject1).rawQuery(((StringBuilder)localObject2).toString(), new String[0]);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      ab.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
      localObject1 = null;
    }
    if (localObject1 == null)
      AppMethodBeat.o(79266);
    while (true)
    {
      return localArrayList;
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = new f();
        ((f)localObject2).d((Cursor)localObject1);
        if (((f)localObject2).field_status == 1)
        {
          if (u(paramContext, ((f)localObject2).field_appId))
          {
            if (!bo.isNullOrNil(((f)localObject2).field_signature))
              localArrayList.add(localObject2);
          }
          else
          {
            ((f)localObject2).field_status = 4;
            a.a.bYQ().e((f)localObject2);
          }
        }
        else if (((f)localObject2).field_signature != null)
          localArrayList.add(localObject2);
      }
      ((Cursor)localObject1).close();
      AppMethodBeat.o(79266);
    }
  }

  public static boolean b(Context paramContext, Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(79293);
    boolean bool = a(paramContext, paramIntent, paramString, null, null);
    AppMethodBeat.o(79293);
    return bool;
  }

  public static boolean b(f paramf, int paramInt)
  {
    AppMethodBeat.i(79287);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
    {
      AppMethodBeat.o(79287);
      bool = false;
      return bool;
    }
    if ((paramf.field_appInfoFlag & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.AppInfoLogic", "isAppHasFlag, appid = %s, flag = %s, ret = %b", new Object[] { paramf.field_appId, Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      ab.i("MicroMsg.AppInfoLogic", "appInfoFlag = " + paramf.field_appInfoFlag);
      AppMethodBeat.o(79287);
      break;
    }
  }

  public static f bS(String paramString, boolean paramBoolean)
  {
    f localf = null;
    AppMethodBeat.i(79262);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
      AppMethodBeat.o(79262);
      paramString = localf;
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.plugin.s.a.a locala = a.a.bYQ();
      if (locala == null)
      {
        ab.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
        AppMethodBeat.o(79262);
        paramString = localf;
      }
      else if (paramBoolean)
      {
        paramString = locala.Ur(paramString);
        AppMethodBeat.o(79262);
      }
      else
      {
        localf = locala.Uq(paramString);
        if (localf == null)
        {
          paramString = locala.Ur(paramString);
          AppMethodBeat.o(79262);
        }
        else
        {
          locala.Us(paramString);
          AppMethodBeat.o(79262);
          paramString = localf;
        }
      }
    }
  }

  public static f bT(String paramString, boolean paramBoolean)
  {
    f localf = null;
    AppMethodBeat.i(79263);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
      AppMethodBeat.o(79263);
      paramString = localf;
    }
    while (true)
    {
      return paramString;
      if (a.a.bYQ() == null)
      {
        ab.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
        AppMethodBeat.o(79263);
        paramString = localf;
      }
      else
      {
        localf = a.a.bYQ().Uq(paramString);
        if ((paramBoolean) && (g(localf)))
          a.a.bYQ().Us(paramString);
        AppMethodBeat.o(79263);
        paramString = localf;
      }
    }
  }

  public static ShowMessageFromWX.Req c(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    AppMethodBeat.i(79297);
    ShowMessageFromWX.Req localReq = new ShowMessageFromWX.Req();
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    localReq.message = paramWXMediaMessage;
    localReq.transaction = com.tencent.mm.a.g.x(bo.anU().getBytes());
    localReq.openId = paramString;
    localReq.lang = aa.g(localContext.getSharedPreferences(ah.doA(), 0));
    localReq.country = ((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null));
    AppMethodBeat.o(79297);
    return localReq;
  }

  public static String c(Context paramContext, f paramf, String paramString)
  {
    AppMethodBeat.i(79280);
    if ((paramContext == null) || (paramf == null))
      AppMethodBeat.o(79280);
    while (true)
    {
      return paramString;
      String str1 = fK(paramContext);
      String str2 = null;
      if (str1.equalsIgnoreCase("zh_CN"))
        str2 = paramf.field_appName;
      if (str1.equalsIgnoreCase("en"))
      {
        if (bo.isNullOrNil(paramf.field_appName_en))
          str2 = paramf.field_appName;
      }
      else
        label72: if (!str1.equalsIgnoreCase("zh_TW"))
        {
          paramContext = str2;
          if (!str1.equalsIgnoreCase("zh_HK"));
        }
        else
        {
          if (str1.equalsIgnoreCase("zh_HK"))
          {
            if (!bo.isNullOrNil(paramf.field_appName_hk))
              break label172;
            str2 = paramf.field_appName_tw;
          }
          label121: paramContext = str2;
          if (bo.isNullOrNil(str2))
            if (!bo.isNullOrNil(paramf.field_appName_tw))
              break label181;
        }
      label172: label181: for (paramContext = paramf.field_appName; ; paramContext = paramf.field_appName_tw)
      {
        if (!bo.isNullOrNil(paramContext))
          break label189;
        AppMethodBeat.o(79280);
        break;
        str2 = paramf.field_appName_en;
        break label72;
        str2 = paramf.field_appName_hk;
        break label121;
      }
      label189: AppMethodBeat.o(79280);
      paramString = paramContext;
    }
  }

  public static f dX(String paramString, int paramInt)
  {
    f localf = null;
    AppMethodBeat.i(79261);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
      AppMethodBeat.o(79261);
      paramString = localf;
    }
    while (true)
    {
      return paramString;
      if (a.a.bYQ() == null)
      {
        ab.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
        AppMethodBeat.o(79261);
        paramString = localf;
      }
      else
      {
        localf = a.a.bYQ().Uq(paramString);
        if (a(localf, paramInt))
          a.a.bYQ().Us(paramString);
        AppMethodBeat.o(79261);
        paramString = localf;
      }
    }
  }

  public static boolean dg(String paramString)
  {
    AppMethodBeat.i(79276);
    boolean bool;
    if ((paramString == null) || (paramString.trim().length() == 0) || (paramString.equals("weixinfile")) || (paramString.equals("invalid_appname")))
    {
      bool = false;
      AppMethodBeat.o(79276);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(79276);
    }
  }

  public static List<f> dhB()
  {
    AppMethodBeat.i(79273);
    ArrayList localArrayList = new ArrayList();
    if (a.a.bYQ() == null)
    {
      ab.e("MicroMsg.AppInfoLogic", "getAllServices, getISubCorePluginBase() == null");
      AppMethodBeat.o(79273);
    }
    while (true)
    {
      return localArrayList;
      Cursor localCursor = a.a.bYQ().bYP();
      if (localCursor == null)
      {
        AppMethodBeat.o(79273);
      }
      else
      {
        while (localCursor.moveToNext())
        {
          f localf = new f();
          localf.d(localCursor);
          if (!bo.isNullOrNil(localf.field_openId))
            localArrayList.add(localf);
        }
        localCursor.close();
        AppMethodBeat.o(79273);
      }
    }
  }

  public static boolean dk(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79282);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(79282);
    while (true)
    {
      return bool;
      f localf = bT(paramString, false);
      if (localf == null)
      {
        ab.w("MicroMsg.AppInfoLogic", "app is null, appId = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(79282);
      }
      else
      {
        bool = localf.xy();
        AppMethodBeat.o(79282);
      }
    }
  }

  public static List<f> fJ(Context paramContext)
  {
    AppMethodBeat.i(79269);
    ArrayList localArrayList = new ArrayList();
    if (a.a.bYQ() == null)
    {
      ab.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      AppMethodBeat.o(79269);
    }
    while (true)
    {
      return localArrayList;
      Cursor localCursor = a.a.bYQ().bYN();
      if (localCursor == null)
      {
        AppMethodBeat.o(79269);
      }
      else
      {
        while (localCursor.moveToNext())
        {
          f localf = new f();
          localf.d(localCursor);
          if (localf.field_status == 1)
          {
            if (u(paramContext, localf.field_appId))
            {
              if (!bo.isNullOrNil(localf.field_signature))
                localArrayList.add(localf);
            }
            else
            {
              localf.field_status = 4;
              a.a.bYQ().e(localf);
            }
          }
          else if (localf.field_signature != null)
            localArrayList.add(localf);
        }
        localCursor.close();
        AppMethodBeat.o(79269);
      }
    }
  }

  public static String fK(Context paramContext)
  {
    AppMethodBeat.i(79281);
    paramContext = aa.g(paramContext.getSharedPreferences(ah.doA(), 0));
    if ((paramContext == null) || (paramContext.length() == 0) || (paramContext.equalsIgnoreCase("zh_CN")))
    {
      paramContext = "zh_CN";
      AppMethodBeat.o(79281);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(79281);
    }
  }

  private static boolean g(f paramf)
  {
    AppMethodBeat.i(79264);
    boolean bool;
    if ((paramf == null) || (paramf.field_appName == null) || (paramf.field_appName.length() == 0))
    {
      bool = true;
      AppMethodBeat.o(79264);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79264);
    }
  }

  public static List<f> gJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79271);
    ArrayList localArrayList = new ArrayList();
    if (a.a.bYQ() == null)
    {
      ab.e("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
      AppMethodBeat.o(79271);
    }
    while (true)
    {
      return localArrayList;
      Cursor localCursor = a.a.bYQ().eQ(paramInt1, paramInt2);
      if (localCursor == null)
      {
        AppMethodBeat.o(79271);
      }
      else
      {
        while (localCursor.moveToNext())
        {
          f localf = new f();
          localf.d(localCursor);
          localArrayList.add(localf);
        }
        localCursor.close();
        AppMethodBeat.o(79271);
      }
    }
  }

  public static boolean h(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(79283);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
      AppMethodBeat.o(79283);
    while (true)
    {
      return bool;
      if ((paramf.field_appInfoFlag & 0x1) > 0)
      {
        bool = true;
        AppMethodBeat.o(79283);
      }
      else
      {
        AppMethodBeat.o(79283);
      }
    }
  }

  public static boolean i(f paramf)
  {
    boolean bool = true;
    if (paramf == null);
    while (true)
    {
      return bool;
      if ((paramf.field_appInfoFlag & 0x2) != 0)
        bool = false;
    }
  }

  private static boolean j(f paramf)
  {
    boolean bool = true;
    AppMethodBeat.i(79284);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
    {
      AppMethodBeat.o(79284);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramf.field_appId.equals("wx7fa037cc7dfabad5"))
      {
        AppMethodBeat.o(79284);
      }
      else if ((paramf.field_appInfoFlag & 0x8) > 0)
      {
        AppMethodBeat.o(79284);
      }
      else
      {
        AppMethodBeat.o(79284);
        bool = false;
      }
    }
  }

  public static boolean k(f paramf)
  {
    AppMethodBeat.i(79286);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
    {
      AppMethodBeat.o(79286);
      bool = false;
      return bool;
    }
    if ((paramf.field_appInfoFlag & 0x40) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.v("MicroMsg.AppInfoLogic", "canReadMMMsg, appid = %s, ret = %b", new Object[] { paramf.field_appId, Boolean.valueOf(bool) });
      AppMethodBeat.o(79286);
      break;
    }
  }

  public static boolean l(f paramf)
  {
    AppMethodBeat.i(79288);
    boolean bool;
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
    {
      AppMethodBeat.o(79288);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i;
      label43: String str;
      if ((paramf.field_appInfoFlag & 0x80) > 0)
      {
        i = 1;
        if (1 != i)
          break label132;
        str = paramf.field_appId;
        paramf = new HashMap();
        r.m(paramf);
        if (!paramf.containsKey(str))
          break label116;
      }
      label116: for (paramf = (String)paramf.get(str); ; paramf = null)
      {
        if ((paramf != null) && (!paramf.equals("0")))
          break label121;
        AppMethodBeat.o(79288);
        bool = true;
        break;
        i = 0;
        break label43;
      }
      label121: AppMethodBeat.o(79288);
      bool = false;
      continue;
      label132: AppMethodBeat.o(79288);
      bool = false;
    }
  }

  public static boolean o(Context paramContext, long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(79267);
    if (b(paramContext, paramLong, true).size() == 0)
    {
      bool = false;
      AppMethodBeat.o(79267);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(79267);
    }
  }

  public static String r(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(79277);
    paramContext = b(paramContext, dX(paramString, paramInt), null);
    AppMethodBeat.o(79277);
    return paramContext;
  }

  public static String t(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79278);
    paramContext = b(paramContext, bT(paramString, true), null);
    AppMethodBeat.o(79278);
    return paramContext;
  }

  public static boolean u(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79274);
    boolean bool;
    if ((paramContext == null) || (paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppInfoLogic", "isAppInstalled, invalid arguments");
      bool = false;
      AppMethodBeat.o(79274);
    }
    while (true)
    {
      return bool;
      bool = a(paramContext, bT(paramString, true));
      AppMethodBeat.o(79274);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.g
 * JD-Core Version:    0.6.2
 */