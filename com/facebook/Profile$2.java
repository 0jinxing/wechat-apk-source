package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class Profile$2
  implements Parcelable.Creator<Profile>
{
  public final Profile createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(71806);
    paramParcel = new Profile(paramParcel, null);
    AppMethodBeat.o(71806);
    return paramParcel;
  }

  public final Profile[] newArray(int paramInt)
  {
    return new Profile[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.Profile.2
 * JD-Core Version:    0.6.2
 */