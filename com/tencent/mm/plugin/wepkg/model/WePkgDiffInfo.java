package com.tencent.mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WePkgDiffInfo
  implements Parcelable
{
  public static final Parcelable.Creator<WePkgDiffInfo> CREATOR;
  public String cvZ;
  public String downloadUrl;
  public String eBS;
  public int fileSize;
  public String uWO;
  public String uWP;
  public int uWQ;
  public String version;

  static
  {
    AppMethodBeat.i(63524);
    CREATOR = new WePkgDiffInfo.1();
    AppMethodBeat.o(63524);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63523);
    paramParcel.writeString(this.eBS);
    paramParcel.writeString(this.uWO);
    paramParcel.writeString(this.uWP);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeString(this.cvZ);
    paramParcel.writeInt(this.fileSize);
    paramParcel.writeInt(this.uWQ);
    AppMethodBeat.o(63523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo
 * JD-Core Version:    0.6.2
 */