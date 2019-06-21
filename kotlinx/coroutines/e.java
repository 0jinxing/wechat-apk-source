package kotlinx.coroutines;

import a.c.c;
import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"})
public final class e
{
  public static final bc a(ac paramac, a.c.e parame, ad paramad, m<? super ac, ? super c<? super y>, ? extends Object> paramm)
  {
    AppMethodBeat.i(118288);
    j.p(paramac, "receiver$0");
    j.p(parame, "context");
    j.p(paramad, "start");
    j.p(paramm, "block");
    paramac = v.a(paramac, parame);
    int i;
    if ((ad)paramad == ad.BPO)
    {
      i = 1;
      if (i == 0)
        break label91;
    }
    label91: for (paramac = (bp)new bi(paramac, paramm); ; paramac = new bp(paramac, true))
    {
      paramac.a(paramad, paramac, paramm);
      paramac = (bc)paramac;
      AppMethodBeat.o(118288);
      return paramac;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.e
 * JD-Core Version:    0.6.2
 */