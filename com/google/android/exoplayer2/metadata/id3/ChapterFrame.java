package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame
{
  public static final Parcelable.Creator<ChapterFrame> CREATOR;
  public final String bfm;
  public final int bfn;
  public final int bfo;
  public final long bfp;
  public final long bfq;
  private final Id3Frame[] bfr;

  static
  {
    AppMethodBeat.i(95291);
    CREATOR = new ChapterFrame.1();
    AppMethodBeat.o(95291);
  }

  ChapterFrame(Parcel paramParcel)
  {
    super("CHAP");
    AppMethodBeat.i(95287);
    this.bfm = paramParcel.readString();
    this.bfn = paramParcel.readInt();
    this.bfo = paramParcel.readInt();
    this.bfp = paramParcel.readLong();
    this.bfq = paramParcel.readLong();
    int i = paramParcel.readInt();
    this.bfr = new Id3Frame[i];
    for (int j = 0; j < i; j++)
      this.bfr[j] = ((Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader()));
    AppMethodBeat.o(95287);
  }

  public ChapterFrame(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, Id3Frame[] paramArrayOfId3Frame)
  {
    super("CHAP");
    this.bfm = paramString;
    this.bfn = paramInt1;
    this.bfo = paramInt2;
    this.bfp = paramLong1;
    this.bfq = paramLong2;
    this.bfr = paramArrayOfId3Frame;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95288);
    if (this == paramObject)
      AppMethodBeat.o(95288);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95288);
        bool = false;
      }
      else
      {
        paramObject = (ChapterFrame)paramObject;
        if ((this.bfn == paramObject.bfn) && (this.bfo == paramObject.bfo) && (this.bfp == paramObject.bfp) && (this.bfq == paramObject.bfq) && (v.j(this.bfm, paramObject.bfm)) && (Arrays.equals(this.bfr, paramObject.bfr)))
        {
          AppMethodBeat.o(95288);
        }
        else
        {
          AppMethodBeat.o(95288);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95289);
    int i = this.bfn;
    int j = this.bfo;
    int k = (int)this.bfp;
    int m = (int)this.bfq;
    if (this.bfm != null);
    for (int n = this.bfm.hashCode(); ; n = 0)
    {
      AppMethodBeat.o(95289);
      return n + ((((i + 527) * 31 + j) * 31 + k) * 31 + m) * 31;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95290);
    paramParcel.writeString(this.bfm);
    paramParcel.writeInt(this.bfn);
    paramParcel.writeInt(this.bfo);
    paramParcel.writeLong(this.bfp);
    paramParcel.writeLong(this.bfq);
    paramParcel.writeInt(this.bfr.length);
    Id3Frame[] arrayOfId3Frame = this.bfr;
    int i = arrayOfId3Frame.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable(arrayOfId3Frame[paramInt], 0);
    AppMethodBeat.o(95290);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ChapterFrame
 * JD-Core Version:    0.6.2
 */