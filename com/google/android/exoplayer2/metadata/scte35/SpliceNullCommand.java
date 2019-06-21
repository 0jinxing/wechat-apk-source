package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class SpliceNullCommand extends SpliceCommand
{
  public static final Parcelable.Creator<SpliceNullCommand> CREATOR;

  static
  {
    AppMethodBeat.i(95372);
    CREATOR = new SpliceNullCommand.1();
    AppMethodBeat.o(95372);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand
 * JD-Core Version:    0.6.2
 */