package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DeviceAuthMethodHandler$1
  implements Parcelable.Creator
{
  public final DeviceAuthMethodHandler createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(96749);
    paramParcel = new DeviceAuthMethodHandler(paramParcel);
    AppMethodBeat.o(96749);
    return paramParcel;
  }

  public final DeviceAuthMethodHandler[] newArray(int paramInt)
  {
    return new DeviceAuthMethodHandler[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.login.DeviceAuthMethodHandler.1
 * JD-Core Version:    0.6.2
 */