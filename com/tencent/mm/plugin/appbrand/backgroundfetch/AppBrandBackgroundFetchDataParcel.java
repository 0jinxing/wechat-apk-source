package com.tencent.mm.plugin.appbrand.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandBackgroundFetchDataParcel
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandBackgroundFetchDataParcel> CREATOR;
  public String data;
  public int hca;
  public String path;
  public String query;
  public int scene;
  public long updateTime;
  public String username;

  static
  {
    AppMethodBeat.i(129769);
    CREATOR = new AppBrandBackgroundFetchDataParcel.1();
    AppMethodBeat.o(129769);
  }

  public AppBrandBackgroundFetchDataParcel()
  {
  }

  protected AppBrandBackgroundFetchDataParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(129768);
    this.username = paramParcel.readString();
    this.hca = paramParcel.readInt();
    this.path = paramParcel.readString();
    this.query = paramParcel.readString();
    this.data = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.updateTime = paramParcel.readLong();
    AppMethodBeat.o(129768);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(129767);
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.hca);
    paramParcel.writeString(this.path);
    paramParcel.writeString(this.query);
    paramParcel.writeString(this.data);
    paramParcel.writeInt(this.scene);
    paramParcel.writeLong(this.updateTime);
    AppMethodBeat.o(129767);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel
 * JD-Core Version:    0.6.2
 */