package com.tencent.mm.plugin.facedetect;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceProNative$FaceStatus$1
  implements Parcelable.Creator<FaceProNative.FaceStatus>
{
  public final FaceProNative.FaceStatus createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(37);
    paramParcel = new FaceProNative.FaceStatus(paramParcel);
    AppMethodBeat.o(37);
    return paramParcel;
  }

  public final FaceProNative.FaceStatus[] newArray(int paramInt)
  {
    return new FaceProNative.FaceStatus[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus.1
 * JD-Core Version:    0.6.2
 */