package com.tencent.mm.plugin.wepkg.version;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

class WepkgVersionUpdater$WepkgNetSceneProcessTask$WepkgCheckReq
  implements Parcelable
{
  public static final Parcelable.Creator<WepkgCheckReq> CREATOR;
  private String eBS;
  private int scene;
  private String version;

  static
  {
    AppMethodBeat.i(63673);
    CREATOR = new WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.1();
    AppMethodBeat.o(63673);
  }

  private WepkgVersionUpdater$WepkgNetSceneProcessTask$WepkgCheckReq()
  {
  }

  private WepkgVersionUpdater$WepkgNetSceneProcessTask$WepkgCheckReq(Parcel paramParcel)
  {
    AppMethodBeat.i(63671);
    this.eBS = paramParcel.readString();
    this.version = paramParcel.readString();
    this.scene = paramParcel.readInt();
    AppMethodBeat.o(63671);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63672);
    paramParcel.writeString(this.eBS);
    paramParcel.writeString(this.version);
    paramParcel.writeInt(this.scene);
    AppMethodBeat.o(63672);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq
 * JD-Core Version:    0.6.2
 */