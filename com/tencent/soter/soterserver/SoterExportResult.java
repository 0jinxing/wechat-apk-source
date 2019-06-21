package com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SoterExportResult
  implements Parcelable
{
  public static final Parcelable.Creator<SoterExportResult> CREATOR;
  public byte[] AvF;
  public int AvG;
  public int bFZ;

  static
  {
    AppMethodBeat.i(73110);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(73110);
  }

  public SoterExportResult()
  {
  }

  public SoterExportResult(Parcel paramParcel)
  {
    AppMethodBeat.i(73108);
    this.bFZ = paramParcel.readInt();
    this.AvF = paramParcel.createByteArray();
    this.AvG = paramParcel.readInt();
    AppMethodBeat.o(73108);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73109);
    paramParcel.writeInt(this.bFZ);
    paramParcel.writeByteArray(this.AvF);
    paramParcel.writeInt(this.AvG);
    AppMethodBeat.o(73109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.soterserver.SoterExportResult
 * JD-Core Version:    0.6.2
 */