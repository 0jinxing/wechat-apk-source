package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ModulePkgInfo
  implements Parcelable, Cloneable
{
  public static final Parcelable.Creator<ModulePkgInfo> CREATOR;
  public boolean cta;
  public String cvZ;
  public volatile String gSP;
  public String[] gSQ;
  public PartialFile[] gSR;
  public String name;

  static
  {
    AppMethodBeat.i(105311);
    CREATOR = new ModulePkgInfo.1();
    AppMethodBeat.o(105311);
  }

  public ModulePkgInfo()
  {
  }

  private ModulePkgInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(105309);
    readFromParcel(paramParcel);
    AppMethodBeat.o(105309);
  }

  public int describeContents()
  {
    return 0;
  }

  public void readFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(105308);
    this.gSP = paramParcel.readString();
    this.name = paramParcel.readString();
    this.cvZ = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.cta = bool;
      this.gSQ = paramParcel.createStringArray();
      this.gSR = ((PartialFile[])paramParcel.createTypedArray(PartialFile.CREATOR));
      AppMethodBeat.o(105308);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(105307);
    paramParcel.writeString(this.gSP);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.cvZ);
    if (this.cta);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeStringArray(this.gSQ);
      paramParcel.writeTypedArray(this.gSR, 0);
      AppMethodBeat.o(105307);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo
 * JD-Core Version:    0.6.2
 */