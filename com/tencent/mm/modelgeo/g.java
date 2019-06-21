package com.tencent.mm.modelgeo;

import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public abstract class g
  implements TencentLocationListener
{
  private final Map<String, Integer> fCg = new HashMap();

  public g()
  {
    this.fCg.put("gps", Integer.valueOf(0));
    this.fCg.put("network", Integer.valueOf(1));
  }

  public void a(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt1, double paramDouble3, double paramDouble4, double paramDouble5, String paramString1, String paramString2, int paramInt2)
  {
  }

  public void onLocationChanged(TencentLocation paramTencentLocation, int paramInt, String paramString)
  {
    ab.i("MicroMsg.SLocationListenerWgs84", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s", new Object[] { Double.valueOf(paramTencentLocation.getLatitude()), Double.valueOf(paramTencentLocation.getLongitude()), Float.valueOf(paramTencentLocation.getAccuracy()), Integer.valueOf(paramInt), paramTencentLocation.getAreaStat(), Float.valueOf(paramTencentLocation.getSpeed()), Float.valueOf(paramTencentLocation.getBearing()), paramString, paramTencentLocation.getProvider() });
    if (paramInt == 0)
      a(true, paramTencentLocation.getLatitude(), paramTencentLocation.getLongitude(), ((Integer)this.fCg.get(paramTencentLocation.getProvider())).intValue(), paramTencentLocation.getSpeed(), paramTencentLocation.getAccuracy(), paramTencentLocation.getAltitude(), paramTencentLocation.getIndoorBuildingId(), paramTencentLocation.getIndoorBuildingFloor(), paramTencentLocation.getIndoorLocationType());
    while (true)
    {
      return;
      a(false, paramTencentLocation.getLatitude(), paramTencentLocation.getLongitude(), ((Integer)this.fCg.get(paramTencentLocation.getProvider())).intValue(), paramTencentLocation.getSpeed(), paramTencentLocation.getAccuracy(), paramTencentLocation.getAltitude(), paramTencentLocation.getIndoorBuildingId(), paramTencentLocation.getIndoorBuildingFloor(), paramTencentLocation.getIndoorLocationType());
    }
  }

  public void onStatusUpdate(String paramString1, int paramInt, String paramString2)
  {
    ab.d("MicroMsg.SLocationListenerWgs84", "onStatusUpdate, name=%s, status=%d, desc=%s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.g
 * JD-Core Version:    0.6.2
 */