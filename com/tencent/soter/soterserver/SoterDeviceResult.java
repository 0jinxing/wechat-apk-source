package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SoterDeviceResult
  implements Parcelable
{
  public static final Parcelable.Creator<SoterDeviceResult> CREATOR;
  public byte[] AvF;
  public int AvG;
  public int bFZ;

  static
  {
    AppMethodBeat.i(73106);
    CREATOR = new SoterDeviceResult.1();
    AppMethodBeat.o(73106);
  }

  public SoterDeviceResult()
  {
  }

  protected SoterDeviceResult(Parcel paramParcel)
  {
    AppMethodBeat.i(73104);
    this.bFZ = paramParcel.readInt();
    this.AvF = paramParcel.createByteArray();
    this.AvG = paramParcel.readInt();
    AppMethodBeat.o(73104);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73105);
    paramParcel.writeInt(this.bFZ);
    paramParcel.writeByteArray(this.AvF);
    paramParcel.writeInt(this.AvG);
    AppMethodBeat.o(73105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.soterserver.SoterDeviceResult
 * JD-Core Version:    0.6.2
 */