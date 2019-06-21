package com.tencent.mm.plugin.appbrand.dynamic.j;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.dynamic.b.e;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.b;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.plugin.appbrand.widget.l;
import com.tencent.mm.plugin.appbrand.widget.m;
import com.tencent.mm.protocal.protobuf.cvx;
import com.tencent.mm.protocal.protobuf.cvy;
import com.tencent.mm.protocal.protobuf.cyd;
import com.tencent.mm.protocal.protobuf.rg;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class a
{
  private static String F(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(10992);
    paramString = paramString + "#" + paramInt1 + "#" + paramInt2;
    AppMethodBeat.o(10992);
    return paramString;
  }

  public static WxaPkgWrappingInfo a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    AppMethodBeat.i(10990);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", paramString1);
    localBundle.putString("appId", paramString2);
    localBundle.putInt("pkgType", paramInt1);
    localBundle.putInt("pkgVersion", paramInt2);
    localBundle.putString("searchId", paramString3);
    localBundle.putString("preload_download_data", paramString4);
    if (paramInt1 == 10102)
    {
      paramString1 = e.Ac(F(paramString2, paramInt1, paramInt2));
      if (paramString1 != null)
      {
        u.i("MicroMsg.DynamicPkgUpdater", "get wxaPkgInfo from cache", new Object[0]);
        AppMethodBeat.o(10990);
      }
    }
    while (true)
    {
      return paramString1;
      paramString1 = (WxaPkgWrappingInfo)f.a("com.tencent.mm", localBundle, a.a.class);
      if (paramString1 != null)
        e.a(F(paramString2, paramInt1, paramInt2), paramString1);
      AppMethodBeat.o(10990);
    }
  }

  public static d a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    AppMethodBeat.i(10991);
    Bundle localBundle = new Bundle();
    localBundle.putString("appId", paramString1);
    localBundle.putInt("pkgType", paramInt1);
    localBundle.putInt("pkgVersion", paramInt2);
    localBundle.putInt("widgetType", paramInt3);
    localBundle.putInt("scene", paramInt4);
    localBundle.putString("preloadLaunchData", paramString2);
    localBundle = (Bundle)f.a("com.tencent.mm", localBundle, c.class);
    if (localBundle == null)
    {
      paramString1 = null;
      AppMethodBeat.o(10991);
    }
    while (true)
    {
      return paramString1;
      paramString2 = new d();
      paramString2.appId = paramString1;
      paramString2.hoT = ((DebuggerInfo)localBundle.getParcelable("debuggerInfo"));
      paramString1 = localBundle.getByteArray("jsApiInfo");
      if (paramString1 != null)
        paramString2.hoX = new rg();
      try
      {
        paramString2.hoX.parseFrom(paramString1);
        paramString1 = localBundle.getByteArray("launchAction");
        if (paramString1 != null)
          paramString2.hoW = new cvx();
      }
      catch (IOException paramString1)
      {
        try
        {
          paramString2.hoW.parseFrom(paramString1);
          paramString1 = localBundle.getByteArray("versionInfo");
          paramString2.hoY = new cvy();
          if (paramString1 == null);
        }
        catch (IOException paramString1)
        {
          try
          {
            while (true)
            {
              paramString2.hoY.parseFrom(paramString1);
              paramString2.hoU = ((WidgetSysConfig)localBundle.getParcelable("sysConfig"));
              paramString2.hoV = ((WidgetRuntimeConfig)localBundle.getParcelable("runtimeConfig"));
              if (paramString2.hoV == null)
                paramString2.hoV = new WidgetRuntimeConfig();
              AppMethodBeat.o(10991);
              paramString1 = paramString2;
              break;
              paramString1 = paramString1;
              ab.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString1 });
            }
            paramString1 = paramString1;
            ab.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString1 });
          }
          catch (IOException paramString1)
          {
            while (true)
              ab.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString1 });
          }
        }
      }
    }
  }

  public static WxaPkgWrappingInfo b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(10989);
    paramString1 = a(paramString1, paramString2, paramString3, paramInt, 0, null);
    AppMethodBeat.o(10989);
    return paramString1;
  }

  static class c
    implements i<Bundle, Bundle>
  {
    private static Bundle s(Bundle paramBundle)
    {
      boolean bool1 = true;
      AppMethodBeat.i(10985);
      Object localObject1 = paramBundle.getString("appId");
      int i = paramBundle.getInt("pkgType");
      int j = paramBundle.getInt("pkgVersion");
      int k = paramBundle.getInt("scene");
      int m = paramBundle.getInt("widgetType");
      Object localObject2 = paramBundle.getString("preloadLaunchData", "");
      paramBundle = new Bundle();
      Object localObject4;
      try
      {
        Object localObject3 = new com/tencent/mm/plugin/appbrand/dynamic/launching/a;
        ((com.tencent.mm.plugin.appbrand.dynamic.launching.a)localObject3).<init>((String)localObject1, i, j, k, m, (String)localObject2);
        localObject2 = ((com.tencent.mm.plugin.appbrand.dynamic.launching.a)localObject3).azY();
        if (localObject2 == null)
          AppMethodBeat.o(10985);
        while (true)
        {
          return paramBundle;
          if (((j)localObject2).field_jsApiInfo != null)
            paramBundle.putByteArray("jsApiInfo", ((j)localObject2).field_jsApiInfo.toByteArray());
          if (((j)localObject2).field_launchAction != null)
            paramBundle.putByteArray("launchAction", ((j)localObject2).field_launchAction.toByteArray());
          if (((j)localObject2).field_versionInfo != null)
            paramBundle.putByteArray("versionInfo", ((j)localObject2).field_versionInfo.toByteArray());
          localObject3 = new com/tencent/mm/plugin/appbrand/dynamic/launching/WidgetRuntimeConfig;
          ((WidgetRuntimeConfig)localObject3).<init>();
          ((WidgetRuntimeConfig)localObject3).appId = ((String)localObject1);
          ((WidgetRuntimeConfig)localObject3).hog = m;
          localObject2 = ((j)localObject2).field_widgetSetting;
          if (localObject2 != null)
          {
            ((WidgetRuntimeConfig)localObject3).hox = ((cyd)localObject2).xty;
            ((WidgetRuntimeConfig)localObject3).hoz = ((cyd)localObject2).xtA;
            ((WidgetRuntimeConfig)localObject3).hoy = ((cyd)localObject2).xtz;
          }
          paramBundle.putParcelable("runtimeConfig", (Parcelable)localObject3);
          localObject3 = (com.tencent.mm.plugin.appbrand.widget.a.a)com.tencent.mm.plugin.appbrand.dynamic.k.a.ag(com.tencent.mm.plugin.appbrand.widget.a.a.class);
          if (localObject3 != null)
            break;
          AppMethodBeat.o(10985);
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.w("MicroMsg.DynamicPkgUpdater", "check widget launch info error : %s", new Object[] { localException });
        localObject4 = localException.auR().Ev((String)localObject1);
        localObject1 = b.Ad((String)localObject1);
        localObject2 = new DebuggerInfo();
        if (localObject4 == null)
          break label452;
      }
      if (((l)localObject4).field_openDebug)
      {
        bool2 = true;
        label331: ((DebuggerInfo)localObject2).hmE = bool2;
        if ((!j.a.kR(i)) && ((localObject1 == null) || (!((DebuggerInfo)localObject1).hmD)))
          break label458;
        bool2 = true;
        label359: ((DebuggerInfo)localObject2).hmD = bool2;
        if ((localObject1 == null) || (!((DebuggerInfo)localObject1).hmF))
          break label464;
      }
      label452: label458: label464: for (boolean bool2 = bool1; ; bool2 = false)
      {
        ((DebuggerInfo)localObject2).hmF = bool2;
        paramBundle.putParcelable("debuggerInfo", (Parcelable)localObject2);
        localObject1 = AppBrandGlobalSystemConfig.ayC();
        localObject4 = new WidgetSysConfig();
        ((WidgetSysConfig)localObject4).hfU = ((AppBrandGlobalSystemConfig)localObject1).hfU;
        ((WidgetSysConfig)localObject4).hfV = ((AppBrandGlobalSystemConfig)localObject1).hfV;
        ((WidgetSysConfig)localObject4).hfW = ((AppBrandGlobalSystemConfig)localObject1).hfW;
        paramBundle.putParcelable("sysConfig", (Parcelable)localObject4);
        AppMethodBeat.o(10985);
        break;
        bool2 = false;
        break label331;
        bool2 = false;
        break label359;
      }
    }
  }

  public static class d
    implements com.tencent.mm.ipcinvoker.a<Bundle, Bundle>
  {
  }

  public static abstract interface e
  {
    public abstract void ac(String paramString, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.j.a
 * JD-Core Version:    0.6.2
 */