package com.tencent.mm.plugin.game.luggage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameWebViewLaunchParams
  implements Parcelable
{
  public static final Parcelable.Creator<GameWebViewLaunchParams> CREATOR;
  public GameFloatLayerInfo mTF;

  static
  {
    AppMethodBeat.i(135805);
    CREATOR = new GameWebViewLaunchParams.1();
    AppMethodBeat.o(135805);
  }

  public GameWebViewLaunchParams()
  {
  }

  private GameWebViewLaunchParams(Parcel paramParcel)
  {
    AppMethodBeat.i(135804);
    this.mTF = ((GameFloatLayerInfo)paramParcel.readParcelable(GameFloatLayerInfo.class.getClassLoader()));
    AppMethodBeat.o(135804);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(135803);
    paramParcel.writeParcelable(this.mTF, paramInt);
    AppMethodBeat.o(135803);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams
 * JD-Core Version:    0.6.2
 */