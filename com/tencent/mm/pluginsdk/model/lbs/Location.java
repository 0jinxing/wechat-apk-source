package com.tencent.mm.pluginsdk.model.lbs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class Location
  implements Parcelable
{
  public static final Parcelable.Creator<Location> CREATOR;
  public int accuracy;
  public int cGo;
  public String cGq;
  public float fBr;
  public float fBs;
  public String mac;

  static
  {
    AppMethodBeat.i(79410);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(79410);
  }

  public Location()
  {
  }

  public Location(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    this.fBr = paramFloat1;
    this.fBs = paramFloat2;
    this.accuracy = paramInt1;
    this.cGo = paramInt2;
    this.mac = paramString1;
    this.cGq = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean dhR()
  {
    AppMethodBeat.i(79408);
    boolean bool;
    if ((this.fBr == -85.0F) || (this.fBs == -1000.0F))
    {
      ab.d("MicroMsg.Radar.Location", "mac and cellId is null");
      bool = true;
      AppMethodBeat.o(79408);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79408);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(79409);
    paramParcel.writeFloat(this.fBr);
    paramParcel.writeFloat(this.fBs);
    paramParcel.writeInt(this.accuracy);
    paramParcel.writeInt(this.cGo);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.cGq);
    AppMethodBeat.o(79409);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.lbs.Location
 * JD-Core Version:    0.6.2
 */