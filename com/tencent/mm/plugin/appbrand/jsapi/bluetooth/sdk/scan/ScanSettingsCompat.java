package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ScanSettingsCompat
  implements Parcelable
{
  public static final Parcelable.Creator<ScanSettingsCompat> CREATOR;
  final int hGe;
  private final int hGf;
  final long hGg;

  static
  {
    AppMethodBeat.i(94340);
    CREATOR = new ScanSettingsCompat.1();
    AppMethodBeat.o(94340);
  }

  private ScanSettingsCompat(int paramInt, long paramLong)
  {
    this.hGe = paramInt;
    this.hGf = 1;
    this.hGg = paramLong;
  }

  private ScanSettingsCompat(Parcel paramParcel)
  {
    AppMethodBeat.i(94338);
    this.hGe = paramParcel.readInt();
    this.hGf = paramParcel.readInt();
    this.hGg = paramParcel.readLong();
    AppMethodBeat.o(94338);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(94339);
    paramParcel.writeInt(this.hGe);
    paramParcel.writeInt(this.hGf);
    paramParcel.writeLong(this.hGg);
    AppMethodBeat.o(94339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat
 * JD-Core Version:    0.6.2
 */