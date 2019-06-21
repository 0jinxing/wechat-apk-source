package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class PrivateCommand extends SpliceCommand
{
  public static final Parcelable.Creator<PrivateCommand> CREATOR;
  public final long bfB;
  public final long bfC;
  public final byte[] bfD;

  static
  {
    AppMethodBeat.i(95362);
    CREATOR = new PrivateCommand.1();
    AppMethodBeat.o(95362);
  }

  private PrivateCommand(long paramLong1, byte[] paramArrayOfByte, long paramLong2)
  {
    this.bfB = paramLong2;
    this.bfC = paramLong1;
    this.bfD = paramArrayOfByte;
  }

  private PrivateCommand(Parcel paramParcel)
  {
    AppMethodBeat.i(95359);
    this.bfB = paramParcel.readLong();
    this.bfC = paramParcel.readLong();
    this.bfD = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(this.bfD);
    AppMethodBeat.o(95359);
  }

  static PrivateCommand a(l paraml, int paramInt, long paramLong)
  {
    AppMethodBeat.i(95360);
    long l = paraml.cM();
    byte[] arrayOfByte = new byte[paramInt - 4];
    paraml.readBytes(arrayOfByte, 0, arrayOfByte.length);
    paraml = new PrivateCommand(l, arrayOfByte, paramLong);
    AppMethodBeat.o(95360);
    return paraml;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95361);
    paramParcel.writeLong(this.bfB);
    paramParcel.writeLong(this.bfC);
    paramParcel.writeInt(this.bfD.length);
    paramParcel.writeByteArray(this.bfD);
    AppMethodBeat.o(95361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.PrivateCommand
 * JD-Core Version:    0.6.2
 */