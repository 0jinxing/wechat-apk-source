package com.tencent.mm.plugin.brandservice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class b
  implements o
{
  public static n gkE;
  public static m gkF;

  public static void a(String paramString, Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(13799);
    if (paramLong > 0L)
    {
      d.xDG.b(paramRunnable, paramString, paramLong);
      AppMethodBeat.o(13799);
    }
    while (true)
    {
      return;
      d.xDG.b(paramRunnable, paramString);
      AppMethodBeat.o(13799);
    }
  }

  public static void h(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(13798);
    if (paramObject == null);
    for (String str = "null"; ; str = paramObject.toString())
    {
      ab.i("MicroMsg.BrandService.BrandServiceApplication", "set config, key[%d], value[%s]", new Object[] { Integer.valueOf(paramInt), str });
      g.RQ();
      g.RP().Ry().set(paramInt, paramObject);
      AppMethodBeat.o(13798);
      return;
    }
  }

  public final void a(m paramm)
  {
    gkF = paramm;
  }

  public final void a(n paramn)
  {
    gkE = paramn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b
 * JD-Core Version:    0.6.2
 */