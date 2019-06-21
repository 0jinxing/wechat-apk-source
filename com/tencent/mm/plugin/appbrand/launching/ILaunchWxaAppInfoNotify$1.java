package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.appbrand.ipc.d;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.protocal.protobuf.rg;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Locale;

final class ILaunchWxaAppInfoNotify$1
  implements ILaunchWxaAppInfoNotify
{
  private final String TAG = "MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]";

  private static String a(aa paramaa)
  {
    AppMethodBeat.i(131820);
    if (paramaa == null)
    {
      paramaa = "NULL";
      AppMethodBeat.o(131820);
    }
    while (true)
    {
      return paramaa;
      try
      {
        paramaa = String.format(Locale.US, "bytes[%d]", new Object[] { Integer.valueOf(paramaa.field_jsapiInfo.vYw.wR.length) });
        AppMethodBeat.o(131820);
      }
      catch (Exception paramaa)
      {
        paramaa = String.format(Locale.US, "Exception[%s]", new Object[] { paramaa });
        AppMethodBeat.o(131820);
      }
    }
  }

  public final void a(String paramString1, int paramInt, String paramString2, aa paramaa)
  {
    AppMethodBeat.i(131819);
    Object localObject1 = g.Ch(paramString2);
    if (localObject1 != null)
    {
      ab.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyLaunchInfoUpdate [update deferred process] appId[%s], type[%d], sessionId[%s], %s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, a(paramaa) });
      ((g)localObject1).a(paramString1, paramInt, paramString2, paramaa);
    }
    try
    {
      ab.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyLaunchInfoUpdate [update remote] appId[%s], type[%d], sessionId[%s], %s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, a(paramaa) });
      localObject1 = new com/tencent/mm/plugin/appbrand/launching/ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper;
      ((ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper)localObject1).<init>();
      ((ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper)localObject1).appId = paramString1;
      ((ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper)localObject1).har = paramInt;
      Object localObject2 = new com/tencent/mm/plugin/appbrand/permission/AppRuntimeApiPermissionBundle;
      ((AppRuntimeApiPermissionBundle)localObject2).<init>(paramaa.field_jsapiInfo);
      ((ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper)localObject1).bQt = ((AppRuntimeApiPermissionBundle)localObject2);
      localObject2 = AppBrandLaunchErrorAction.CREATOR;
      ((ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper)localObject1).ihd = AppBrandLaunchErrorAction.a.a(paramString1, paramInt, paramaa);
      d.a(paramString1, (Parcelable)localObject1);
      AppMethodBeat.o(131819);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", localThrowable, "notifyLaunchInfoUpdate [update remote] appId[%s], type[%d], sessionId[%s], %s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, a(paramaa) });
        AppMethodBeat.o(131819);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify.1
 * JD-Core Version:    0.6.2
 */