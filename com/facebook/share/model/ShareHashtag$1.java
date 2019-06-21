package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareHashtag$1
  implements Parcelable.Creator<ShareHashtag>
{
  public final ShareHashtag createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97406);
    paramParcel = new ShareHashtag(paramParcel);
    AppMethodBeat.o(97406);
    return paramParcel;
  }

  public final ShareHashtag[] newArray(int paramInt)
  {
    return new ShareHashtag[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareHashtag.1
 * JD-Core Version:    0.6.2
 */