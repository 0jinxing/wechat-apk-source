package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameSettingParams
  implements Parcelable
{
  public static final Parcelable.Creator<GameSettingParams> CREATOR;
  public String uDr;
  public String uDs;

  static
  {
    AppMethodBeat.i(8693);
    CREATOR = new GameSettingParams.1();
    AppMethodBeat.o(8693);
  }

  public GameSettingParams()
  {
  }

  private GameSettingParams(Parcel paramParcel)
  {
    AppMethodBeat.i(8692);
    this.uDr = paramParcel.readString();
    this.uDs = paramParcel.readString();
    AppMethodBeat.o(8692);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(8691);
    paramParcel.writeString(this.uDr);
    paramParcel.writeString(this.uDs);
    AppMethodBeat.o(8691);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams
 * JD-Core Version:    0.6.2
 */