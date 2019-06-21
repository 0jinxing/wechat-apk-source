package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareCameraEffectContent$1
  implements Parcelable.Creator<ShareCameraEffectContent>
{
  public final ShareCameraEffectContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97394);
    paramParcel = new ShareCameraEffectContent(paramParcel);
    AppMethodBeat.o(97394);
    return paramParcel;
  }

  public final ShareCameraEffectContent[] newArray(int paramInt)
  {
    return new ShareCameraEffectContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareCameraEffectContent.1
 * JD-Core Version:    0.6.2
 */