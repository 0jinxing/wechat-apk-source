package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class e
{
  public static StringBuilder a(TimePoint paramTimePoint)
  {
    AppMethodBeat.i(57041);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramTimePoint == null)
    {
      ab.i("MicroMsg.CostTimeUtil", "print failed, headPoint is null.");
      AppMethodBeat.o(57041);
    }
    while (true)
    {
      return localStringBuilder;
      localStringBuilder.append(0).append(". ").append(paramTimePoint.name).append(" : ");
      localStringBuilder.append(paramTimePoint.heM);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramTimePoint.heL.get());
      localStringBuilder.append(", ");
      localStringBuilder.append(paramTimePoint.heM.get() - paramTimePoint.heM.get());
      int i = 0;
      TimePoint localTimePoint;
      for (Object localObject = paramTimePoint; ((TimePoint)localObject).heN.get() != null; localObject = localTimePoint)
      {
        localTimePoint = (TimePoint)((TimePoint)localObject).heN.get();
        localStringBuilder.append("\n");
        localStringBuilder.append(i + 1).append(". ").append(localTimePoint.name).append(" : ");
        localStringBuilder.append((localTimePoint.heM.get() - ((TimePoint)localObject).heM.get()) / 1000000.0D);
        i++;
      }
      localStringBuilder.append("\n");
      localStringBuilder.append("total cost : ").append((((TimePoint)localObject).heM.get() - paramTimePoint.heM.get()) / 1000000.0D);
      AppMethodBeat.o(57041);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.collector.e
 * JD-Core Version:    0.6.2
 */