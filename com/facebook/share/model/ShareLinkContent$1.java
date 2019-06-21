package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareLinkContent$1
  implements Parcelable.Creator<ShareLinkContent>
{
  public final ShareLinkContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97418);
    paramParcel = new ShareLinkContent(paramParcel);
    AppMethodBeat.o(97418);
    return paramParcel;
  }

  public final ShareLinkContent[] newArray(int paramInt)
  {
    return new ShareLinkContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareLinkContent.1
 * JD-Core Version:    0.6.2
 */