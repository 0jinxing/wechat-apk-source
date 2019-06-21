package com.tencent.xweb.x5;

import android.webkit.GeolocationPermissions.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;

public final class g$e
  implements GeolocationPermissions.Callback
{
  GeolocationPermissionsCallback AQy;

  public g$e(GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    this.AQy = paramGeolocationPermissionsCallback;
  }

  public final void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(84829);
    if (this.AQy != null)
      this.AQy.invoke(paramString, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(84829);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g.e
 * JD-Core Version:    0.6.2
 */