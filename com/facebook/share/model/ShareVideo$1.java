package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareVideo$1
  implements Parcelable.Creator<ShareVideo>
{
  public final ShareVideo createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97597);
    paramParcel = new ShareVideo(paramParcel);
    AppMethodBeat.o(97597);
    return paramParcel;
  }

  public final ShareVideo[] newArray(int paramInt)
  {
    return new ShareVideo[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareVideo.1
 * JD-Core Version:    0.6.2
 */