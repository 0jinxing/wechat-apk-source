package com.tencent.mm.plugin.soter.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.d.b;
import com.tencent.mm.vending.g.f;

public final class b
{
  public static void a(boolean paramBoolean1, boolean paramBoolean2, g paramg)
  {
    AppMethodBeat.i(59357);
    ab.i("MicroMsg.SoterInitManager", "alvinluo isNeedPrepareAsk: %b, isNeedSaveDeviceInfo: %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    try
    {
      long l = System.currentTimeMillis();
      Object localObject1 = f.D(Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2));
      Object localObject2 = new com/tencent/mm/plugin/soter/e/a;
      ((a)localObject2).<init>();
      localObject2 = ((com.tencent.mm.vending.g.c)localObject1).d((com.tencent.mm.vending.c.a)localObject2);
      localObject1 = new com/tencent/mm/plugin/soter/e/c;
      ((c)localObject1).<init>();
      localObject2 = ((com.tencent.mm.vending.g.c)localObject2).d((com.tencent.mm.vending.c.a)localObject1);
      localObject1 = new com/tencent/mm/plugin/soter/e/d;
      ((d)localObject1).<init>();
      localObject1 = ((com.tencent.mm.vending.g.c)localObject2).d((com.tencent.mm.vending.c.a)localObject1);
      localObject2 = new com/tencent/mm/plugin/soter/e/b$2;
      ((b.2)localObject2).<init>(paramg);
      localObject1 = ((com.tencent.mm.vending.g.c)localObject1).a((d.a)localObject2);
      localObject2 = new com/tencent/mm/plugin/soter/e/b$1;
      ((b.1)localObject2).<init>(l, paramg);
      ((com.tencent.mm.vending.g.d)localObject1).a((d.b)localObject2);
      AppMethodBeat.o(59357);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SoterInitManager", localException, "alvinluo exception when init soter: %s", new Object[] { localException.getMessage() });
        com.tencent.mm.plugin.soter.d.a.fH(4, 1001);
        if (paramg != null)
          paramg.aC(-1, "system error");
        AppMethodBeat.o(59357);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.e.b
 * JD-Core Version:    0.6.2
 */