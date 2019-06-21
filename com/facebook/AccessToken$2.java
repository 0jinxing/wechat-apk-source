package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AccessToken$2
  implements Parcelable.Creator
{
  public final AccessToken createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(71510);
    paramParcel = new AccessToken(paramParcel);
    AppMethodBeat.o(71510);
    return paramParcel;
  }

  public final AccessToken[] newArray(int paramInt)
  {
    return new AccessToken[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.AccessToken.2
 * JD-Core Version:    0.6.2
 */