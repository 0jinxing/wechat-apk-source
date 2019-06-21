package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareOpenGraphContent$1
  implements Parcelable.Creator<ShareOpenGraphContent>
{
  public final ShareOpenGraphContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97530);
    paramParcel = new ShareOpenGraphContent(paramParcel);
    AppMethodBeat.o(97530);
    return paramParcel;
  }

  public final ShareOpenGraphContent[] newArray(int paramInt)
  {
    return new ShareOpenGraphContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareOpenGraphContent.1
 * JD-Core Version:    0.6.2
 */