package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppGroupCreationContent$1
  implements Parcelable.Creator<AppGroupCreationContent>
{
  public final AppGroupCreationContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97321);
    paramParcel = new AppGroupCreationContent(paramParcel);
    AppMethodBeat.o(97321);
    return paramParcel;
  }

  public final AppGroupCreationContent[] newArray(int paramInt)
  {
    return new AppGroupCreationContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.AppGroupCreationContent.1
 * JD-Core Version:    0.6.2
 */