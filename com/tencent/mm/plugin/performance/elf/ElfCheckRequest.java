package com.tencent.mm.plugin.performance.elf;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ElfCheckRequest
  implements Parcelable
{
  public static final Parcelable.Creator<ElfCheckRequest> CREATOR;
  public long oJs;

  static
  {
    AppMethodBeat.i(111050);
    CREATOR = new ElfCheckRequest.1();
    AppMethodBeat.o(111050);
  }

  public ElfCheckRequest()
  {
    this.oJs = 0L;
  }

  protected ElfCheckRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(111049);
    this.oJs = 0L;
    this.oJs = paramParcel.readLong();
    AppMethodBeat.o(111049);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(111048);
    paramParcel.writeLong(this.oJs);
    AppMethodBeat.o(111048);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.ElfCheckRequest
 * JD-Core Version:    0.6.2
 */