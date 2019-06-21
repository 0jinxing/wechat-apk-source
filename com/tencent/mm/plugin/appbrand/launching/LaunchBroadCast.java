package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.d;

public final class LaunchBroadCast
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchBroadCast> CREATOR;
  public String appId;
  public int cDB;
  public boolean cQe;
  public int har;
  public String username;

  static
  {
    AppMethodBeat.i(102109);
    CREATOR = new LaunchBroadCast.1();
    AppMethodBeat.o(102109);
  }

  private LaunchBroadCast()
  {
  }

  private LaunchBroadCast(Parcel paramParcel)
  {
    AppMethodBeat.i(102108);
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.har = paramParcel.readInt();
    this.cDB = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.cQe = bool;
      AppMethodBeat.o(102108);
      return;
    }
  }

  static void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(102106);
    LaunchBroadCast localLaunchBroadCast = new LaunchBroadCast();
    localLaunchBroadCast.username = null;
    localLaunchBroadCast.appId = paramString;
    localLaunchBroadCast.har = paramInt1;
    localLaunchBroadCast.cDB = paramInt2;
    localLaunchBroadCast.cQe = paramBoolean;
    d.a(paramString, localLaunchBroadCast);
    AppMethodBeat.o(102106);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102107);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.har);
    paramParcel.writeInt(this.cDB);
    if (this.cQe)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      AppMethodBeat.o(102107);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.LaunchBroadCast
 * JD-Core Version:    0.6.2
 */