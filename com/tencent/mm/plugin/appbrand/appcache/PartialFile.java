package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class PartialFile
  implements Parcelable
{
  public static final Parcelable.Creator<PartialFile> CREATOR;
  public String bIy;
  public String cvZ;
  public String filePath;
  public String gSS;
  public int version;

  static
  {
    AppMethodBeat.i(105315);
    CREATOR = new PartialFile.1();
    AppMethodBeat.o(105315);
  }

  public PartialFile()
  {
  }

  protected PartialFile(Parcel paramParcel)
  {
    AppMethodBeat.i(105314);
    this.bIy = paramParcel.readString();
    this.version = paramParcel.readInt();
    this.gSS = paramParcel.readString();
    this.cvZ = paramParcel.readString();
    this.filePath = paramParcel.readString();
    AppMethodBeat.o(105314);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(105313);
    paramParcel.writeString(this.bIy);
    paramParcel.writeInt(this.version);
    paramParcel.writeString(this.gSS);
    paramParcel.writeString(this.cvZ);
    paramParcel.writeString(this.filePath);
    AppMethodBeat.o(105313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.PartialFile
 * JD-Core Version:    0.6.2
 */