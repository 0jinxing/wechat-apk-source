package com.tencent.mm.plugin.appbrand.media.music;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

class AppBrandMusicClientService$IPCQueryPlaying extends MainProcessTask
{
  public static final Parcelable.Creator<IPCQueryPlaying> CREATOR;
  private String ikR;
  private boolean isPlaying;

  static
  {
    AppMethodBeat.i(137826);
    CREATOR = new AppBrandMusicClientService.IPCQueryPlaying.1();
    AppMethodBeat.o(137826);
  }

  AppBrandMusicClientService$IPCQueryPlaying()
  {
    this.ikR = null;
    this.isPlaying = false;
  }

  AppBrandMusicClientService$IPCQueryPlaying(Parcel paramParcel)
  {
    AppMethodBeat.i(137822);
    this.ikR = null;
    this.isPlaying = false;
    g(paramParcel);
    AppMethodBeat.o(137822);
  }

  public final void asP()
  {
    AppMethodBeat.i(137823);
    this.isPlaying = a.a.aId().Cw(this.ikR);
    AppMethodBeat.o(137823);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(137824);
    this.ikR = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.isPlaying = bool;
      AppMethodBeat.o(137824);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137825);
    paramParcel.writeString(this.ikR);
    if (this.isPlaying);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(137825);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService.IPCQueryPlaying
 * JD-Core Version:    0.6.2
 */