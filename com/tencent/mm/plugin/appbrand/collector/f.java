package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class f
{
  private static final AtomicInteger heH;
  private static final AtomicLong heI;
  private static boolean heJ;

  static
  {
    AppMethodBeat.i(57044);
    heH = new AtomicInteger();
    heI = new AtomicLong();
    AppMethodBeat.o(57044);
  }

  public static boolean ayu()
  {
    return heJ;
  }

  public static String ayv()
  {
    float f1 = 0.0F;
    AppMethodBeat.i(57043);
    int i = heH.get();
    long l1 = heI.get();
    Object localObject = new StringBuilder();
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append("fps : ");
    int j = heH.get();
    long l2 = heI.get();
    if ((!heJ) || (l2 <= 0L))
    {
      f2 = 0.0F;
      localStringBuilder.append(f2);
      ((StringBuilder)localObject).append("\ncount : ").append(i);
      localStringBuilder = ((StringBuilder)localObject).append("\naverage cost : ");
      if (i > 0)
        break label145;
    }
    label145: for (float f2 = f1; ; f2 = 1.0F * (float)l1 / i)
    {
      localStringBuilder.append(f2);
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(57043);
      return localObject;
      f2 = j * 1000.0F / (float)l2;
      break;
    }
  }

  public static void dH(boolean paramBoolean)
  {
    heJ = paramBoolean;
  }

  public static void reset()
  {
    AppMethodBeat.i(57042);
    heH.set(0);
    heI.set(0L);
    AppMethodBeat.o(57042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.collector.f
 * JD-Core Version:    0.6.2
 */