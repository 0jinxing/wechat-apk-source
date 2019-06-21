package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CameraEffectArguments$1
  implements Parcelable.Creator<CameraEffectArguments>
{
  public final CameraEffectArguments createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97335);
    paramParcel = new CameraEffectArguments(paramParcel);
    AppMethodBeat.o(97335);
    return paramParcel;
  }

  public final CameraEffectArguments[] newArray(int paramInt)
  {
    return new CameraEffectArguments[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.CameraEffectArguments.1
 * JD-Core Version:    0.6.2
 */