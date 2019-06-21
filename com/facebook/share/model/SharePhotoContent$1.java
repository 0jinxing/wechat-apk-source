package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SharePhotoContent$1
  implements Parcelable.Creator<SharePhotoContent>
{
  public final SharePhotoContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97566);
    paramParcel = new SharePhotoContent(paramParcel);
    AppMethodBeat.o(97566);
    return paramParcel;
  }

  public final SharePhotoContent[] newArray(int paramInt)
  {
    return new SharePhotoContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.SharePhotoContent.1
 * JD-Core Version:    0.6.2
 */