package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareFeedContent$1
  implements Parcelable.Creator<ShareFeedContent>
{
  public final ShareFeedContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97243);
    paramParcel = new ShareFeedContent(paramParcel);
    AppMethodBeat.o(97243);
    return paramParcel;
  }

  public final ShareFeedContent[] newArray(int paramInt)
  {
    return new ShareFeedContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareFeedContent.1
 * JD-Core Version:    0.6.2
 */