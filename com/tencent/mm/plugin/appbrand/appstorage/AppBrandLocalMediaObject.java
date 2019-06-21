package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public class AppBrandLocalMediaObject
  implements Parcelable, p.a
{
  public static final Parcelable.Creator<AppBrandLocalMediaObject> CREATOR;
  public String czD;
  public String eov;
  public String fnQ;
  public boolean gXl;
  public long gXm;
  public long gjQ;
  public String mimeType;

  static
  {
    AppMethodBeat.i(105341);
    CREATOR = new AppBrandLocalMediaObject.1();
    AppMethodBeat.o(105341);
  }

  protected AppBrandLocalMediaObject()
  {
  }

  protected AppBrandLocalMediaObject(Parcel paramParcel)
  {
    AppMethodBeat.i(105340);
    this.czD = paramParcel.readString();
    this.fnQ = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.eov = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.gXl = bool;
      this.gjQ = paramParcel.readLong();
      this.gXm = paramParcel.readLong();
      AppMethodBeat.o(105340);
      return;
    }
  }

  public final long awL()
  {
    return this.gjQ;
  }

  public int describeContents()
  {
    return 0;
  }

  public final String getFileName()
  {
    return this.czD;
  }

  public final long lastModified()
  {
    return this.gXm;
  }

  public String toString()
  {
    AppMethodBeat.i(105338);
    String str = "AppBrandLocalMediaObject{localId='" + this.czD + '\'' + ", fileFullPath='" + this.fnQ + '\'' + ", mimeType='" + this.mimeType + '\'' + ", fileExt='" + this.eov + '\'' + '}';
    AppMethodBeat.o(105338);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(105339);
    paramParcel.writeString(this.czD);
    paramParcel.writeString(this.fnQ);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.eov);
    if (this.gXl)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeLong(this.gjQ);
      paramParcel.writeLong(this.gXm);
      AppMethodBeat.o(105339);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject
 * JD-Core Version:    0.6.2
 */