package com.tencent.mm.plugin.appbrand.game.cgipkg;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.c;
import com.tencent.mm.ipcinvoker.wx_extension.d;
import com.tencent.mm.protocal.protobuf.ajh;

public class GameMenuParcel
  implements Parcelable
{
  public static final Parcelable.Creator<GameMenuParcel> CREATOR;
  public String appId;
  public ajh hqz;

  static
  {
    AppMethodBeat.i(130062);
    CREATOR = new GameMenuParcel.1();
    AppMethodBeat.o(130062);
  }

  public GameMenuParcel()
  {
  }

  private GameMenuParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(130061);
    this.appId = paramParcel.readString();
    this.hqz = ((ajh)c.a(d.class.getName(), paramParcel));
    AppMethodBeat.o(130061);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130060);
    paramParcel.writeString(this.appId);
    c.a(this.hqz, paramParcel);
    AppMethodBeat.o(130060);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.cgipkg.GameMenuParcel
 * JD-Core Version:    0.6.2
 */