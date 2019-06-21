package com.tencent.mm.w;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;

final class b$1
  implements n.b
{
  b$1(b paramb)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(124474);
    if (!b.Pr())
    {
      AppMethodBeat.o(124474);
      return;
    }
    if ((paramObject != null) && ((paramObject instanceof String)))
    {
      paramn = (String)paramObject;
      label33: switch (paramInt)
      {
      case 3:
      case 4:
      default:
      case 2:
      case 5:
      }
    }
    while (true)
    {
      AppMethodBeat.o(124474);
      break;
      paramn = null;
      break label33;
      if (paramn != null)
      {
        this.eBa.eAX.a(65636, new b.f(this.eBa, paramn));
        AppMethodBeat.o(124474);
        break;
        if (paramn == null)
        {
          this.eBa.eAX.a(65636, new b.c(this.eBa));
          AppMethodBeat.o(124474);
          break;
        }
        this.eBa.eAX.a(65636, new b.d(this.eBa, paramn));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.b.1
 * JD-Core Version:    0.6.2
 */