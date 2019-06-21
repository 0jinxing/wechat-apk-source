package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.j.d;
import com.tencent.mm.pluginsdk.g.a.c.k;

public class WxaPkgLoadProgress
  implements Parcelable, d, k
{
  public static final Parcelable.Creator<WxaPkgLoadProgress> CREATOR;
  public long gUP;
  public long gUQ;
  public int progress;

  static
  {
    AppMethodBeat.i(59527);
    CREATOR = new WxaPkgLoadProgress.1();
    AppMethodBeat.o(59527);
  }

  public WxaPkgLoadProgress()
  {
    this.progress = 0;
    this.gUP = -1L;
    this.gUQ = -1L;
  }

  public WxaPkgLoadProgress(int paramInt, long paramLong1, long paramLong2)
  {
    this.progress = 0;
    this.gUP = -1L;
    this.gUQ = -1L;
    this.progress = paramInt;
    this.gUP = paramLong1;
    this.gUQ = paramLong2;
  }

  protected WxaPkgLoadProgress(Parcel paramParcel)
  {
    AppMethodBeat.i(59524);
    this.progress = 0;
    this.gUP = -1L;
    this.gUQ = -1L;
    this.progress = paramParcel.readInt();
    this.gUP = paramParcel.readLong();
    this.gUQ = paramParcel.readLong();
    AppMethodBeat.o(59524);
  }

  public final long awk()
  {
    return this.gUP;
  }

  public final long awl()
  {
    return this.gUQ;
  }

  public int describeContents()
  {
    return 0;
  }

  public final int getProgress()
  {
    return this.progress;
  }

  public String toString()
  {
    AppMethodBeat.i(59525);
    String str = "WxaPkgLoadProgress{progress=" + this.progress + ", writtenLength=" + this.gUP + ", totalLength=" + this.gUQ + '}';
    AppMethodBeat.o(59525);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(59526);
    paramParcel.writeInt(this.progress);
    paramParcel.writeLong(this.gUP);
    paramParcel.writeLong(this.gUQ);
    AppMethodBeat.o(59526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress
 * JD-Core Version:    0.6.2
 */