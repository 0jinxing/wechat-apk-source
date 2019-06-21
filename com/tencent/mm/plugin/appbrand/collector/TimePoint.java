package com.tencent.mm.plugin.appbrand.collector;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class TimePoint
  implements Parcelable
{
  public static final Parcelable.Creator<TimePoint> CREATOR;
  final AtomicInteger heL;
  final AtomicLong heM;
  final AtomicReference<TimePoint> heN;
  String name;

  static
  {
    AppMethodBeat.i(57064);
    CREATOR = new TimePoint.1();
    AppMethodBeat.o(57064);
  }

  TimePoint()
  {
    AppMethodBeat.i(57061);
    this.heL = new AtomicInteger();
    this.heM = new AtomicLong();
    this.heN = new AtomicReference();
    this.name = "";
    AppMethodBeat.o(57061);
  }

  public TimePoint(String paramString, long paramLong)
  {
    AppMethodBeat.i(57062);
    this.heL = new AtomicInteger();
    this.heM = new AtomicLong();
    this.heN = new AtomicReference();
    this.name = paramString;
    this.heM.set(paramLong);
    AppMethodBeat.o(57062);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(57063);
    paramParcel.writeString(this.name);
    paramParcel.writeLong(this.heM.get());
    paramParcel.writeInt(this.heL.get());
    paramParcel.writeParcelable((Parcelable)this.heN.get(), paramInt);
    AppMethodBeat.o(57063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.collector.TimePoint
 * JD-Core Version:    0.6.2
 */