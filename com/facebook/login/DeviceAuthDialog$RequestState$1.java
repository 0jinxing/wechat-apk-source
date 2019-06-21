package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DeviceAuthDialog$RequestState$1
  implements Parcelable.Creator<DeviceAuthDialog.RequestState>
{
  public final DeviceAuthDialog.RequestState createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(96718);
    paramParcel = new DeviceAuthDialog.RequestState(paramParcel);
    AppMethodBeat.o(96718);
    return paramParcel;
  }

  public final DeviceAuthDialog.RequestState[] newArray(int paramInt)
  {
    return new DeviceAuthDialog.RequestState[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.RequestState.1
 * JD-Core Version:    0.6.2
 */