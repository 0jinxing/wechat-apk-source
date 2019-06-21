package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SoterSignResult
  implements Parcelable
{
  public static final Parcelable.Creator<SoterSignResult> CREATOR;
  public byte[] AvF;
  public int AvG;
  public int bFZ;

  static
  {
    AppMethodBeat.i(73118);
    CREATOR = new SoterSignResult.1();
    AppMethodBeat.o(73118);
  }

  public SoterSignResult()
  {
  }

  protected SoterSignResult(Parcel paramParcel)
  {
    AppMethodBeat.i(73116);
    this.bFZ = paramParcel.readInt();
    this.AvF = paramParcel.createByteArray();
    this.AvG = paramParcel.readInt();
    AppMethodBeat.o(73116);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73117);
    paramParcel.writeInt(this.bFZ);
    paramParcel.writeByteArray(this.AvF);
    paramParcel.writeInt(this.AvG);
    AppMethodBeat.o(73117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.soterserver.SoterSignResult
 * JD-Core Version:    0.6.2
 */