package com.tencent.mm.plugin.appbrand.collector;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import junit.framework.Assert;

public class CollectSession
  implements Parcelable
{
  public static final Parcelable.Creator<CollectSession> CREATOR;
  public final Bundle cBY;
  String groupId;
  TimePoint heA;
  TimePoint heB;
  final Map<String, TimePoint> heC;
  String heD;
  String id;

  static
  {
    AppMethodBeat.i(57019);
    CREATOR = new CollectSession.1();
    AppMethodBeat.o(57019);
  }

  CollectSession()
  {
    AppMethodBeat.i(57014);
    this.heC = new HashMap();
    this.cBY = new Bundle();
    AppMethodBeat.o(57014);
  }

  public CollectSession(String paramString)
  {
    AppMethodBeat.i(57015);
    this.heC = new HashMap();
    this.cBY = new Bundle();
    this.id = paramString;
    AppMethodBeat.o(57015);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(57018);
    paramParcel.writeString(this.groupId);
    paramParcel.writeString(this.id);
    paramParcel.writeParcelable(this.heA, paramInt);
    paramParcel.writeString(this.heD);
    paramParcel.writeBundle(this.cBY);
    AppMethodBeat.o(57018);
  }

  public final void yF(String paramString)
  {
    AppMethodBeat.i(57016);
    Assert.assertNull(this.heA);
    this.heA = new TimePoint(paramString, System.nanoTime());
    this.heB = this.heA;
    this.heA.heL.set(1);
    this.heC.put(paramString, this.heA);
    AppMethodBeat.o(57016);
  }

  public final void yG(String paramString)
  {
    AppMethodBeat.i(57017);
    Assert.assertNotNull(this.heB);
    long l = System.nanoTime();
    TimePoint localTimePoint = (TimePoint)this.heC.get(paramString);
    if (localTimePoint == null)
    {
      localTimePoint = new TimePoint(paramString, l);
      localTimePoint.heL.set(1);
      this.heC.put(paramString, localTimePoint);
      this.heB.heN.set(localTimePoint);
      this.heB = localTimePoint;
      AppMethodBeat.o(57017);
    }
    while (true)
    {
      return;
      localTimePoint.heM.set((l + localTimePoint.heM.get() * localTimePoint.heL.get()) / (localTimePoint.heL.get() + 1));
      localTimePoint.heL.incrementAndGet();
      AppMethodBeat.o(57017);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.collector.CollectSession
 * JD-Core Version:    0.6.2
 */