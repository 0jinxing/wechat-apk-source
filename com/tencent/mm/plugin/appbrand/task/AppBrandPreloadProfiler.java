package com.tencent.mm.plugin.appbrand.task;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class AppBrandPreloadProfiler
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandPreloadProfiler> CREATOR;
  public long endTime;
  public long iEh;
  public long iEi;
  public long iEj;
  public long startTime;

  static
  {
    AppMethodBeat.i(132787);
    CREATOR = new AppBrandPreloadProfiler.1();
    AppMethodBeat.o(132787);
  }

  public AppBrandPreloadProfiler()
  {
    this.iEh = 9223372036854775807L;
    this.iEi = 9223372036854775807L;
    this.startTime = 9223372036854775807L;
    this.endTime = 9223372036854775807L;
    this.iEj = 9223372036854775807L;
  }

  protected AppBrandPreloadProfiler(Parcel paramParcel)
  {
    AppMethodBeat.i(132786);
    this.iEh = 9223372036854775807L;
    this.iEi = 9223372036854775807L;
    this.startTime = 9223372036854775807L;
    this.endTime = 9223372036854775807L;
    this.iEj = 9223372036854775807L;
    this.iEh = paramParcel.readLong();
    this.iEi = paramParcel.readLong();
    this.startTime = paramParcel.readLong();
    this.endTime = paramParcel.readLong();
    this.iEj = paramParcel.readLong();
    AppMethodBeat.o(132786);
  }

  public final long aLK()
  {
    AppMethodBeat.i(132782);
    long l = SystemClock.elapsedRealtime();
    this.iEh = l;
    AppMethodBeat.o(132782);
    return l;
  }

  public final long aLL()
  {
    AppMethodBeat.i(132783);
    long l = SystemClock.elapsedRealtime();
    this.endTime = l;
    AppMethodBeat.o(132783);
    return l;
  }

  public final long aLM()
  {
    if ((this.iEj == 9223372036854775807L) || (this.endTime == 9223372036854775807L));
    for (long l = 0L; ; l = this.endTime - this.iEj)
      return l;
  }

  public final long aLN()
  {
    if ((this.endTime == 9223372036854775807L) || (this.iEh == 9223372036854775807L));
    for (long l = 0L; ; l = this.endTime - this.iEh)
      return l;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(132784);
    String str;
    if ((this.iEh == 9223372036854775807L) || (this.iEi == 9223372036854775807L) || (this.startTime == 9223372036854775807L) || (this.endTime == 9223372036854775807L))
    {
      str = bo.t("[AppBrandPreloadProfiler] in panic req = [%d]ms, process = [%d]ms, start = [%d]ms, end = [%d]ms", new Object[] { Long.valueOf(this.iEh), Long.valueOf(this.iEi), Long.valueOf(this.startTime), Long.valueOf(this.endTime) });
      AppMethodBeat.o(132784);
    }
    while (true)
    {
      return str;
      str = bo.t("[AppBrandPreloadProfiler] process-start costs [%d]ms, trans-thread costs [%d]ms, preload component costs [%d]ms", new Object[] { Long.valueOf(this.iEi - this.iEh), Long.valueOf(this.startTime - this.iEi), Long.valueOf(this.endTime - this.startTime) });
      AppMethodBeat.o(132784);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(132785);
    paramParcel.writeLong(this.iEh);
    paramParcel.writeLong(this.iEi);
    paramParcel.writeLong(this.startTime);
    paramParcel.writeLong(this.endTime);
    paramParcel.writeLong(this.iEj);
    AppMethodBeat.o(132785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler
 * JD-Core Version:    0.6.2
 */