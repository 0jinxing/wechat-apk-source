package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookRequestError$1
  implements Parcelable.Creator<FacebookRequestError>
{
  public final FacebookRequestError createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(71582);
    paramParcel = new FacebookRequestError(paramParcel, null);
    AppMethodBeat.o(71582);
    return paramParcel;
  }

  public final FacebookRequestError[] newArray(int paramInt)
  {
    return new FacebookRequestError[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookRequestError.1
 * JD-Core Version:    0.6.2
 */