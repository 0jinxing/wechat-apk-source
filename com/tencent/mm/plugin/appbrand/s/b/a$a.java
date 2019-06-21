package com.tencent.mm.plugin.appbrand.s.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  public double altitude;
  public String bIy;
  public String buildingId;
  public String floorName;
  public Object fsY;
  public double iSf;
  public double iSg;
  public double latitude;
  public double longitude;

  public final String toString()
  {
    AppMethodBeat.i(93905);
    String str = "Location{latitude=" + this.latitude + ", longitude=" + this.longitude + ", provider='" + this.bIy + '\'' + ", speed=" + this.iSf + ", accuracy=" + this.iSg + ", altitude=" + this.altitude + ", buildingId='" + this.buildingId + '\'' + ", floorName='" + this.floorName + '\'' + ", extra=" + this.fsY + '}';
    AppMethodBeat.o(93905);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.b.a.a
 * JD-Core Version:    0.6.2
 */