package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SoterSessionResult
  implements Parcelable
{
  public static final Parcelable.Creator<SoterSessionResult> CREATOR;
  public long AvH;
  public int bFZ;

  static
  {
    AppMethodBeat.i(73114);
    CREATOR = new SoterSessionResult.1();
    AppMethodBeat.o(73114);
  }

  public SoterSessionResult()
  {
  }

  protected SoterSessionResult(Parcel paramParcel)
  {
    AppMethodBeat.i(73112);
    this.AvH = paramParcel.readLong();
    this.bFZ = paramParcel.readInt();
    AppMethodBeat.o(73112);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73113);
    paramParcel.writeLong(this.AvH);
    paramParcel.writeInt(this.bFZ);
    AppMethodBeat.o(73113);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.soterserver.SoterSessionResult
 * JD-Core Version:    0.6.2
 */