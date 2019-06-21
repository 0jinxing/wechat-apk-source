package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CustomTabLoginMethodHandler$1
  implements Parcelable.Creator
{
  public final CustomTabLoginMethodHandler createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(96695);
    paramParcel = new CustomTabLoginMethodHandler(paramParcel);
    AppMethodBeat.o(96695);
    return paramParcel;
  }

  public final CustomTabLoginMethodHandler[] newArray(int paramInt)
  {
    return new CustomTabLoginMethodHandler[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.login.CustomTabLoginMethodHandler.1
 * JD-Core Version:    0.6.2
 */