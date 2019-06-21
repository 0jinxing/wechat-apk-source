package com.tencent.mm.modelgeo;

import android.content.Context;
import android.os.Looper;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.map.geolocation.TencentLocationManagerOptions;
import com.tencent.map.geolocation.TencentLocationRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class h
{
  private static h fCh = null;
  private static Context mContext;

  public static void a(TencentLocationListener paramTencentLocationListener, int paramInt, Looper paramLooper)
  {
    AppMethodBeat.i(78150);
    ab.d("MicroMsg.SLocationManager", "requestLocationUpdate %s, isLoaded %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(TencentLocationManagerOptions.isLoadLibraryEnabled()) });
    com.tencent.mm.plugin.report.service.h.pYm.a(584L, 0L, 1L, true);
    TencentLocationManager.getInstance(mContext).setCoordinateType(paramInt);
    TencentLocationRequest localTencentLocationRequest = TencentLocationRequest.create();
    localTencentLocationRequest.setInterval(2000L);
    ab.i("MicroMsg.SLocationManager", "requestCode %d", new Object[] { Integer.valueOf(TencentLocationManager.getInstance(mContext).requestLocationUpdates(localTencentLocationRequest, paramTencentLocationListener, paramLooper)) });
    AppMethodBeat.o(78150);
  }

  public static void agE()
  {
    AppMethodBeat.i(78149);
    ab.d("MicroMsg.SLocationManager", "removeUpdate");
    TencentLocationManager.getInstance(mContext).removeUpdates(null);
    AppMethodBeat.o(78149);
  }

  public static h bY(Context paramContext)
  {
    AppMethodBeat.i(78148);
    if (fCh == null)
      fCh = new h();
    mContext = paramContext;
    paramContext = fCh;
    AppMethodBeat.o(78148);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.h
 * JD-Core Version:    0.6.2
 */