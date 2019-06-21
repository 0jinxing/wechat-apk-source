package com.tencent.mm.modelsfs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SFSContext$Builder$1
  implements Parcelable.Creator<SFSContext.Builder>
{
  public final SFSContext.Builder createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(93211);
    paramParcel = new SFSContext.Builder(paramParcel, null);
    AppMethodBeat.o(93211);
    return paramParcel;
  }

  public final SFSContext.Builder[] newArray(int paramInt)
  {
    return new SFSContext.Builder[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.SFSContext.Builder.1
 * JD-Core Version:    0.6.2
 */