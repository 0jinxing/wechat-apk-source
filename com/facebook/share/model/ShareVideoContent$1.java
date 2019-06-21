package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareVideoContent$1
  implements Parcelable.Creator<ShareVideoContent>
{
  public final ShareVideoContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97610);
    paramParcel = new ShareVideoContent(paramParcel);
    AppMethodBeat.o(97610);
    return paramParcel;
  }

  public final ShareVideoContent[] newArray(int paramInt)
  {
    return new ShareVideoContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareVideoContent.1
 * JD-Core Version:    0.6.2
 */