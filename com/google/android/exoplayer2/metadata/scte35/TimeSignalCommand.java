package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class TimeSignalCommand extends SpliceCommand
{
  public static final Parcelable.Creator<TimeSignalCommand> CREATOR;
  public final long bfX;
  public final long bfY;

  static
  {
    AppMethodBeat.i(95386);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(95386);
  }

  private TimeSignalCommand(long paramLong1, long paramLong2)
  {
    this.bfX = paramLong1;
    this.bfY = paramLong2;
  }

  static TimeSignalCommand b(l paraml, long paramLong, s params)
  {
    AppMethodBeat.i(95383);
    paramLong = c(paraml, paramLong);
    paraml = new TimeSignalCommand(paramLong, params.ao(paramLong));
    AppMethodBeat.o(95383);
    return paraml;
  }

  static long c(l paraml, long paramLong)
  {
    AppMethodBeat.i(95384);
    long l1 = paraml.readUnsignedByte();
    long l2 = -9223372036854775807L;
    if ((0x80 & l1) != 0L)
      l2 = ((1L & l1) << 32 | paraml.cM()) + paramLong & 0xFFFFFFFF;
    AppMethodBeat.o(95384);
    return l2;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95385);
    paramParcel.writeLong(this.bfX);
    paramParcel.writeLong(this.bfY);
    AppMethodBeat.o(95385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand
 * JD-Core Version:    0.6.2
 */