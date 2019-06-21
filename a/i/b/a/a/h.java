package a.i.b.a.a;

import a.f.b.j;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.b;
import a.i.b.a.c.i.f;
import a.i.b.a.c.l.w;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Member;
import java.util.Collection;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"createInlineClassAwareCallerIfNeeded", "Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "isDefault", "", "kotlin-reflect-api"})
public final class h
{
  public static final <M extends Member> d<M> a(e<? extends M> parame, b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(119014);
    j.p(parame, "receiver$0");
    j.p(paramb, "descriptor");
    Object localObject1 = paramb.dYV();
    j.o(localObject1, "descriptor.valueParameters");
    localObject1 = (Iterable)localObject1;
    int i;
    if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (au)((Iterator)localObject1).next();
        j.o(localObject2, "it");
        localObject2 = ((au)localObject2).dZS();
        j.o(localObject2, "it.type");
        if (f.ab((w)localObject2))
        {
          i = 1;
          if (i == 0)
          {
            localObject1 = paramb.dYT();
            if ((localObject1 == null) || (f.ab((w)localObject1) != true))
            {
              if ((parame instanceof c))
                break label211;
              localObject1 = paramb.dYQ();
              if (localObject1 == null)
                break label211;
              localObject1 = ((ak)localObject1).dZS();
              if ((localObject1 == null) || (f.ab((w)localObject1) != true))
                break label211;
            }
          }
          i = 1;
          label179: if (i == 0)
            break label217;
          parame = (d)new g(paramb, parame, paramBoolean);
          AppMethodBeat.o(119014);
        }
      }
    }
    while (true)
    {
      return parame;
      i = 0;
      break;
      label211: i = 0;
      break label179;
      label217: parame = (d)parame;
      AppMethodBeat.o(119014);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.h
 * JD-Core Version:    0.6.2
 */