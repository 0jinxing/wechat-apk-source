package com.tencent.mm.plugin.location.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.ui.d;
import com.tencent.mm.sdk.platformtools.bo;

public class LocationInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LocationInfo> CREATOR;
  public String cIK;
  public int nJA;
  public String nJB;
  public String nJt;
  public double nJu;
  public double nJv;
  public int nJw;
  public String nJx;
  public String nJy;
  String nJz;

  static
  {
    AppMethodBeat.i(113298);
    CREATOR = new LocationInfo.1();
    AppMethodBeat.o(113298);
  }

  public LocationInfo()
  {
    this.nJt = "";
    this.nJu = -85.0D;
    this.nJv = -1000.0D;
    this.nJx = "";
    this.nJy = "zh-cn";
    this.nJz = "";
    this.nJA = 0;
  }

  public LocationInfo(byte paramByte)
  {
    AppMethodBeat.i(113294);
    this.nJt = "";
    this.nJu = -85.0D;
    this.nJv = -1000.0D;
    this.nJx = "";
    this.nJy = "zh-cn";
    this.nJz = "";
    this.nJA = 0;
    this.nJt = (toString() + " " + System.nanoTime());
    this.nJw = d.bJM();
    AppMethodBeat.o(113294);
  }

  public final boolean bJo()
  {
    if ((this.nJu != -85.0D) && (this.nJv != -1000.0D));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bJp()
  {
    AppMethodBeat.i(113296);
    boolean bool;
    if ((bo.isNullOrNil(this.nJx)) && (bo.isNullOrNil(this.cIK)))
    {
      bool = false;
      AppMethodBeat.o(113296);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(113296);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(113297);
    String str = this.nJu + " " + this.nJv + " " + this.nJx + " " + this.cIK + "  " + this.nJt;
    AppMethodBeat.o(113297);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(113295);
    paramParcel.writeString(this.nJt);
    paramParcel.writeDouble(this.nJu);
    paramParcel.writeDouble(this.nJv);
    paramParcel.writeInt(this.nJw);
    paramParcel.writeString(this.nJx);
    paramParcel.writeString(this.nJy);
    paramParcel.writeString(this.cIK);
    paramParcel.writeString(this.nJz);
    paramParcel.writeInt(this.nJA);
    paramParcel.writeString(this.nJB);
    AppMethodBeat.o(113295);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.LocationInfo
 * JD-Core Version:    0.6.2
 */