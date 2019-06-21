package com.tencent.mm.plugin.appbrand.launching;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;
import com.tencent.mm.protocal.protobuf.axn;
import java.lang.reflect.Constructor;

final class AppBrandLaunchErrorAction$a
  implements Parcelable.Creator<AppBrandLaunchErrorAction>
{
  static AppBrandLaunchErrorAction a(String paramString, int paramInt, aa paramaa)
  {
    Object localObject = null;
    Intent localIntent = null;
    AppMethodBeat.i(131694);
    if ((paramaa == null) || (paramaa.field_launchAction == null))
    {
      AppMethodBeat.o(131694);
      paramString = localIntent;
      return paramString;
    }
    switch (paramaa.field_launchAction.vAS)
    {
    default:
      paramString = localObject;
    case 3:
    case 2:
    }
    while (true)
    {
      if (paramString != null)
        AppBrandStickyBannerLogic.b.aMR();
      AppMethodBeat.o(131694);
      break;
      paramString = new AppBrandLaunchErrorActionAlert(paramString, paramInt, paramaa.field_launchAction.wup, paramaa.field_launchAction.wBw);
      continue;
      localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramaa.field_launchAction.wBu);
      localIntent.putExtra("forceHideShare", true);
      paramString = new AppBrandLaunchErrorActionStartActivity(paramString, paramInt, "webview", ".ui.tools.WebViewUI", localIntent);
    }
  }

  private static AppBrandLaunchErrorAction l(Parcel paramParcel)
  {
    AppMethodBeat.i(131693);
    String str = paramParcel.readString();
    if (str == null)
    {
      AppMethodBeat.o(131693);
      paramParcel = null;
    }
    while (true)
    {
      return paramParcel;
      try
      {
        paramParcel = (AppBrandLaunchErrorAction)Class.forName(str).getDeclaredConstructor(new Class[] { Parcel.class }).newInstance(new Object[] { paramParcel });
        AppMethodBeat.o(131693);
      }
      catch (Exception paramParcel)
      {
        AppMethodBeat.o(131693);
        paramParcel = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.a
 * JD-Core Version:    0.6.2
 */