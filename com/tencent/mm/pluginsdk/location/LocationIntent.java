package com.tencent.mm.pluginsdk.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;

public class LocationIntent
  implements Parcelable
{
  public static final Parcelable.Creator<LocationIntent> CREATOR;
  public int cED = 0;
  public String eUu = "";
  public Addr fBB = null;
  public String label = "";
  public double lat;
  public double lng;
  public String nJB;
  public String nJz;
  public String vaO = "";
  public int vaP = 0;

  static
  {
    AppMethodBeat.i(79209);
    CREATOR = new LocationIntent.1();
    AppMethodBeat.o(79209);
  }

  public final String SY()
  {
    AppMethodBeat.i(79207);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("lat " + this.lat + ";");
    ((StringBuffer)localObject).append("lng " + this.lng + ";");
    ((StringBuffer)localObject).append("scale " + this.cED + ";");
    ((StringBuffer)localObject).append("label " + this.label + ";");
    ((StringBuffer)localObject).append("poiname " + this.eUu + ";");
    ((StringBuffer)localObject).append("infourl " + this.vaO + ";");
    ((StringBuffer)localObject).append("locTypeId " + this.nJz + ";");
    ((StringBuffer)localObject).append("poiType " + this.vaP + ";");
    if (this.fBB != null)
      ((StringBuffer)localObject).append("addr " + this.fBB.toString() + ";");
    ((StringBuffer)localObject).append("poiid " + this.nJB + ";");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(79207);
    return localObject;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(79208);
    paramParcel.writeDouble(this.lat);
    paramParcel.writeDouble(this.lng);
    paramParcel.writeInt(this.cED);
    paramParcel.writeString(this.label);
    paramParcel.writeString(this.eUu);
    paramParcel.writeString(this.vaO);
    paramParcel.writeString(this.nJz);
    paramParcel.writeInt(this.vaP);
    paramParcel.writeParcelable(this.fBB, paramInt);
    paramParcel.writeString(this.nJB);
    AppMethodBeat.o(79208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.location.LocationIntent
 * JD-Core Version:    0.6.2
 */