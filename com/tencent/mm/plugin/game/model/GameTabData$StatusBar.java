package com.tencent.mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameTabData$StatusBar
  implements Parcelable
{
  public static final Parcelable.Creator<StatusBar> CREATOR;
  public int color;
  public String mYo;

  static
  {
    AppMethodBeat.i(111394);
    CREATOR = new GameTabData.StatusBar.1();
    AppMethodBeat.o(111394);
  }

  public GameTabData$StatusBar()
  {
    this.mYo = null;
    this.color = 0;
  }

  public GameTabData$StatusBar(Parcel paramParcel)
  {
    AppMethodBeat.i(111392);
    this.mYo = null;
    this.color = 0;
    this.mYo = paramParcel.readString();
    this.color = paramParcel.readInt();
    AppMethodBeat.o(111392);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(111393);
    paramParcel.writeString(this.mYo);
    paramParcel.writeInt(this.color);
    AppMethodBeat.o(111393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.GameTabData.StatusBar
 * JD-Core Version:    0.6.2
 */