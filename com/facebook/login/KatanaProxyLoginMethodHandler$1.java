package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class KatanaProxyLoginMethodHandler$1
  implements Parcelable.Creator<KatanaProxyLoginMethodHandler>
{
  public final KatanaProxyLoginMethodHandler createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(96780);
    paramParcel = new KatanaProxyLoginMethodHandler(paramParcel);
    AppMethodBeat.o(96780);
    return paramParcel;
  }

  public final KatanaProxyLoginMethodHandler[] newArray(int paramInt)
  {
    return new KatanaProxyLoginMethodHandler[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.login.KatanaProxyLoginMethodHandler.1
 * JD-Core Version:    0.6.2
 */