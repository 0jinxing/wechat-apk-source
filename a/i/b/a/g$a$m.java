package a.i.b.a;

import a.f.a.a;
import a.f.b.k;
import a.i.b.a.c.a.d;
import a.i.b.a.c.b.e;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"})
final class g$a$m extends k
  implements a<T>
{
  g$a$m(g.a parama)
  {
    super(0);
  }

  public final T invoke()
  {
    AppMethodBeat.i(118706);
    Object localObject = this.AWZ.dWX();
    if (((e)localObject).dYc() != a.i.b.a.c.b.f.Bew)
    {
      AppMethodBeat.o(118706);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      if (((e)localObject).dYg())
      {
        d locald = d.AZQ;
        if (d.b((e)localObject));
      }
      for (localObject = this.AWZ.AWY.AVA.getEnclosingClass().getDeclaredField(((e)localObject).dZg().name); ; localObject = this.AWZ.AWY.AVA.getDeclaredField("INSTANCE"))
      {
        localObject = ((Field)localObject).get(null);
        if (localObject != null)
          break;
        localObject = new v("null cannot be cast to non-null type T");
        AppMethodBeat.o(118706);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(118706);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.g.a.m
 * JD-Core Version:    0.6.2
 */