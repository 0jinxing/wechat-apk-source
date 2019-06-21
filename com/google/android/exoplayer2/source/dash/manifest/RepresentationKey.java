package com.google.android.exoplayer2.source.dash.manifest;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class RepresentationKey
  implements Parcelable, Comparable<RepresentationKey>
{
  public static final Parcelable.Creator<RepresentationKey> CREATOR;
  public final int bhq;
  public final int bii;
  public final int bij;

  static
  {
    AppMethodBeat.i(94136);
    CREATOR = new RepresentationKey.1();
    AppMethodBeat.o(94136);
  }

  public RepresentationKey(int paramInt1, int paramInt2, int paramInt3)
  {
    this.bhq = paramInt1;
    this.bii = paramInt2;
    this.bij = paramInt3;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    AppMethodBeat.i(94134);
    String str = this.bhq + "." + this.bii + "." + this.bij;
    AppMethodBeat.o(94134);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(94135);
    paramParcel.writeInt(this.bhq);
    paramParcel.writeInt(this.bii);
    paramParcel.writeInt(this.bij);
    AppMethodBeat.o(94135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.RepresentationKey
 * JD-Core Version:    0.6.2
 */