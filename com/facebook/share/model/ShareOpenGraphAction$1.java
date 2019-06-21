package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareOpenGraphAction$1
  implements Parcelable.Creator<ShareOpenGraphAction>
{
  public final ShareOpenGraphAction createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97518);
    paramParcel = new ShareOpenGraphAction(paramParcel);
    AppMethodBeat.o(97518);
    return paramParcel;
  }

  public final ShareOpenGraphAction[] newArray(int paramInt)
  {
    return new ShareOpenGraphAction[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareOpenGraphAction.1
 * JD-Core Version:    0.6.2
 */