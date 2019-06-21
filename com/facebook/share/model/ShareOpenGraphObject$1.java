package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareOpenGraphObject$1
  implements Parcelable.Creator<ShareOpenGraphObject>
{
  public final ShareOpenGraphObject createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97543);
    paramParcel = new ShareOpenGraphObject(paramParcel);
    AppMethodBeat.o(97543);
    return paramParcel;
  }

  public final ShareOpenGraphObject[] newArray(int paramInt)
  {
    return new ShareOpenGraphObject[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareOpenGraphObject.1
 * JD-Core Version:    0.6.2
 */