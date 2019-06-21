package com.tencent.mm.plugin.appbrand.dynamic.i;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class b
{
  private static b.a hoL;
  private static b.a hoM;

  static
  {
    AppMethodBeat.i(10976);
    hoL = new b.a((byte)0);
    hoM = new b.a((byte)0);
    AppMethodBeat.o(10976);
  }

  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, b.a parama)
  {
    AppMethodBeat.i(10975);
    int i = parama.count;
    long l1 = parama.hoN;
    long l2 = parama.hoO;
    long l3 = parama.hoP;
    if ((l1 <= 0L) || (l2 <= 0L) || (i <= 0) || (l3 <= 0L))
      AppMethodBeat.o(10975);
    while (true)
    {
      return;
      parama = new ArrayList();
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(690);
      localIDKey.SetKey(paramInt1);
      localIDKey.SetValue(l1);
      parama.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(690);
      localIDKey.SetKey(paramInt2);
      localIDKey.SetValue(l2);
      parama.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(690);
      localIDKey.SetKey(paramInt3);
      localIDKey.SetValue(i);
      parama.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(690);
      localIDKey.SetKey(paramInt4);
      localIDKey.SetValue(l3);
      parama.add(localIDKey);
      com.tencent.mm.plugin.report.service.h.pYm.b(parama, false);
      AppMethodBeat.o(10975);
    }
  }

  private static void a(b.a parama, long paramLong, int paramInt)
  {
    try
    {
      parama.hoN += paramLong / 1000L;
      parama.hoO += paramInt;
      parama.hoP += paramLong / paramInt;
      parama.count += 1;
      return;
    }
    finally
    {
    }
  }

  public static void aAj()
  {
    AppMethodBeat.i(10974);
    a(5, 6, 7, 8, hoM);
    a(0, 1, 2, 3, hoL);
    hoM.reset();
    hoL.reset();
    AppMethodBeat.o(10974);
  }

  public static void f(long paramLong, int paramInt)
  {
    AppMethodBeat.i(10973);
    if ((paramLong <= 0L) || (paramInt <= 0))
      AppMethodBeat.o(10973);
    while (true)
    {
      return;
      switch (com.tencent.mm.aa.h.QE())
      {
      default:
        a(hoL, paramLong, paramInt);
        AppMethodBeat.o(10973);
        break;
      case 1:
        a(hoM, paramLong, paramInt);
        AppMethodBeat.o(10973);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.i.b
 * JD-Core Version:    0.6.2
 */