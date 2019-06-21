package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LikeContent$1
  implements Parcelable.Creator<LikeContent>
{
  public final LikeContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97088);
    paramParcel = new LikeContent(paramParcel);
    AppMethodBeat.o(97088);
    return paramParcel;
  }

  public final LikeContent[] newArray(int paramInt)
  {
    return new LikeContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeContent.1
 * JD-Core Version:    0.6.2
 */