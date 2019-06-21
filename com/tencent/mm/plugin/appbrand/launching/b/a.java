package com.tencent.mm.plugin.appbrand.launching.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.dynamic.j.a.d;
import com.tencent.mm.plugin.appbrand.dynamic.k.b;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.aa;
import com.tencent.mm.plugin.appbrand.launching.l;
import com.tencent.mm.plugin.appbrand.launching.z;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class a
{
  static void a(Context paramContext, String paramString1, Uri paramUri, int paramInt, Bundle paramBundle, String paramString2)
  {
    String str = bo.nullAsNil(paramUri.getQueryParameter("path"));
    int i = bo.getInt(paramUri.getQueryParameter("version"), 0);
    int j = bo.getInt(paramUri.getQueryParameter("type"), 0);
    paramUri = new AppBrandStatObject();
    a(paramString1, paramInt, paramUri, paramBundle);
    AppBrandLaunchProxyUI.a(paramContext, paramString2, str, j, i, paramUri, null, null);
  }

  private static void a(String paramString, int paramInt, AppBrandStatObject paramAppBrandStatObject, Bundle paramBundle)
  {
    paramAppBrandStatObject.scene = paramInt;
    paramAppBrandStatObject.cst = q.encode(paramString);
    paramAppBrandStatObject.cOq = com.tencent.mm.plugin.appbrand.report.f.h(paramInt, paramBundle);
    paramAppBrandStatObject.cOr = com.tencent.mm.plugin.appbrand.report.f.i(paramInt, paramBundle);
    if ((paramInt != 1037) && (paramInt != 1018));
    for (paramAppBrandStatObject.cOo = paramInt; ; paramAppBrandStatObject.cOo = 0)
      return;
  }

  public final a.a a(Context paramContext, String paramString, int paramInt, Bundle paramBundle)
  {
    ab.i("MicroMsg.AppBrand.AbsLinkOpener", "handle url = %s", new Object[] { paramString });
    String str1 = null;
    String str2;
    if (bo.isNullOrNil(paramString))
    {
      paramContext = a.a.ijg;
      str2 = paramString;
      paramString = str1;
    }
    int j;
    label196: String str3;
    String str4;
    String str6;
    long l;
    while (true)
    {
      a(str2, paramString, paramContext);
      return paramContext;
      int i = paramString.indexOf('#');
      j = paramString.indexOf('?');
      str2 = paramString;
      if (i > 0)
      {
        str2 = paramString;
        if (j > 0)
        {
          str2 = paramString;
          if (i < j)
          {
            str2 = paramString.substring(0, i) + paramString.substring(j, paramString.length());
            ab.i("MicroMsg.AppBrand.AbsLinkOpener", "replace url for parsing %s", new Object[] { str2 });
          }
        }
      }
      paramString = Uri.parse(str2);
      if (bo.getInt(paramString.getQueryParameter("debug"), 0) > 0);
      for (j = 1; ; j = 0)
      {
        if (j == 0)
          break label546;
        j = bo.getInt(paramString.getQueryParameter("ret"), 0);
        if (j != 1)
          break label196;
        paramContext = a.a.ijh;
        break;
      }
      if (j == 2)
      {
        paramContext = a.a.iji;
      }
      else
      {
        localObject1 = paramString.getQueryParameter("appid");
        str3 = paramString.getQueryParameter("username");
        str1 = bo.nullAsNil(paramString.getQueryParameter("path"));
        localObject2 = paramString.getQueryParameter("codeurl");
        str4 = paramString.getQueryParameter("md5");
        str5 = paramString.getQueryParameter("pageurl");
        str6 = paramString.getQueryParameter("pagemd5");
        l = bo.getLong(paramString.getQueryParameter("test_lifespan"), 7200L);
        if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil(str3)) && (!bo.isNullOrNil((String)localObject2)))
          break;
        ab.i("MicroMsg.AppBrand.AbsLinkOpener", "appId = %s, username = %s, codeURL = %s, invalid, return", new Object[] { localObject1, str3, localObject2 });
        paramContext = a.a.ijg;
      }
    }
    boolean bool = com.tencent.mm.plugin.appbrand.app.f.auV().a((String)localObject1, 1, (String)localObject2, str4, 0L, bo.anT() + l);
    if ((!bo.isNullOrNil(str5)) && (!bo.isNullOrNil(str6)))
    {
      com.tencent.mm.plugin.appbrand.app.f.auV().a((String)localObject1, 10000, str5, str6, 0L, bo.anT() + l);
      j = b.cX(0, 1);
      if (j == 10000)
      {
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("appId", (String)localObject1);
        ((Bundle)localObject2).putInt("debugType", j);
        com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", (Parcelable)localObject2, a.d.class, null);
      }
    }
    if (bool)
      com.tencent.mm.plugin.appbrand.task.h.bt((String)localObject1, 1);
    String str5 = paramString.getQueryParameter("json_extinfo");
    Object localObject2 = new LaunchParamsOptional();
    ((LaunchParamsOptional)localObject2).fpI = str5;
    ((l)com.tencent.mm.plugin.appbrand.app.f.E(l.class)).n((String)localObject1, 1, str5);
    Object localObject1 = new AppBrandStatObject();
    a(str2, paramInt, (AppBrandStatObject)localObject1, paramBundle);
    AppBrandLaunchProxyUI.a(paramContext, str3, str1, 1, -1, (AppBrandStatObject)localObject1, null, (LaunchParamsOptional)localObject2);
    while (true)
    {
      paramContext = a.a.ijf;
      break;
      label546: str3 = paramString.getQueryParameter("username");
      if (bo.isNullOrNil(str3))
      {
        ab.i("MicroMsg.AppBrand.AbsLinkOpener", "username = %s, invalid, return", new Object[] { str3 });
        paramContext = a.a.ijg;
        break;
      }
      if (paramBundle != null);
      for (str1 = paramBundle.getString("stat_app_id"); ; str1 = null)
      {
        if (!bo.isNullOrNil(str1))
          break label628;
        a(paramContext, str2, paramString, paramInt, paramBundle, str3);
        break;
      }
      label628: paramBundle = new a.1(this, str1, str3, paramContext, str2, paramString, paramInt, paramBundle);
      localObject1 = new aa();
      ((aa)localObject1).field_appId = str1;
      paramContext = com.tencent.mm.plugin.appbrand.app.f.auP();
      if (paramContext == null)
      {
        ab.w("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump false, wxapp cache storage is null");
        h.a(paramBundle);
      }
      else
      {
        if (paramContext.a((aa)localObject1, new String[] { "appId" }))
        {
          if ((((aa)localObject1).Cj("banJumpApp")) || (((aa)localObject1).Cj("banJumpGame")));
          for (paramInt = 1; ; paramInt = 0)
          {
            if (paramInt == 0)
              break label771;
            ((d)g.K(d.class)).a(str3, new h.1(paramBundle, (aa)localObject1));
            break;
          }
        }
        label771: ab.i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, no ban info for appid:%s", new Object[] { str1 });
        h.a(paramBundle);
      }
    }
  }

  abstract void a(String paramString, Uri paramUri, a.a parama);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.b.a
 * JD-Core Version:    0.6.2
 */