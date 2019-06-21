package com.tencent.mm.plugin.appbrand.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

class AppBrandBackgroundFetchDataStorageIPC$WxappIdentity
  implements Parcelable
{
  public static final Parcelable.Creator<WxappIdentity> CREATOR;
  public int hca;
  public String username;

  static
  {
    AppMethodBeat.i(129788);
    CREATOR = new AppBrandBackgroundFetchDataStorageIPC.WxappIdentity.1();
    AppMethodBeat.o(129788);
  }

  public AppBrandBackgroundFetchDataStorageIPC$WxappIdentity()
  {
  }

  protected AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(Parcel paramParcel)
  {
    AppMethodBeat.i(129787);
    this.username = paramParcel.readString();
    this.hca = paramParcel.readInt();
    AppMethodBeat.o(129787);
  }

  public AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(String paramString, int paramInt)
  {
    this.username = paramString;
    this.hca = paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(129786);
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.hca);
    AppMethodBeat.o(129786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC.WxappIdentity
 * JD-Core Version:    0.6.2
 */