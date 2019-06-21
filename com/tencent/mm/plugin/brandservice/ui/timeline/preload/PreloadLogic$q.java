package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.c.b.a.d;
import a.c.c;
import a.l;
import a.p.b;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.ac;

@d(c="com/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$preloadByInfoIdAndBuffer$1", dWy={967}, f="PreloadLogic.kt", m="invokeSuspend")
@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"})
final class PreloadLogic$q extends a.c.b.a.g
  implements a.f.a.m<ac, c<? super y>, Object>
{
  private ac jTk;
  int label;

  PreloadLogic$q(int paramInt, List paramList, c paramc)
  {
    super(paramc);
  }

  public final c<y> a(Object paramObject, c<?> paramc)
  {
    AppMethodBeat.i(14906);
    a.f.b.j.p(paramc, "completion");
    paramc = new q(this.jKl, this.jKn, paramc);
    paramc.jTk = ((ac)paramObject);
    AppMethodBeat.o(14906);
    return paramc;
  }

  public final Object bO(Object paramObject)
  {
    AppMethodBeat.i(14905);
    Object localObject1 = a.c.a.a.AVh;
    switch (this.label)
    {
    default:
      paramObject = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      AppMethodBeat.o(14905);
      throw paramObject;
    case 0:
    }
    if ((paramObject instanceof p.b))
    {
      paramObject = ((p.b)paramObject).AUq;
      AppMethodBeat.o(14905);
      throw paramObject;
    }
    int i = b.sk(this.jKl);
    paramObject = (Iterable)this.jKn;
    localObject1 = (Collection)new ArrayList();
    Object localObject2 = paramObject.iterator();
    if (((Iterator)localObject2).hasNext())
    {
      paramObject = (String[])((Iterator)localObject2).next();
      j = Integer.parseInt(paramObject[2]);
      paramObject = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(Long.parseLong(paramObject[0]), paramObject[1]).fjr;
      if (j > 0)
        a.f.b.j.o(paramObject, "it");
      for (paramObject = a.a.j.a((Iterable)paramObject, j); ; paramObject = (List)paramObject)
      {
        a.a.j.a((Collection)localObject1, (Iterable)paramObject);
        break;
      }
    }
    localObject1 = (Iterable)localObject1;
    paramObject = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    Object localObject3 = ((Iterable)localObject1).iterator();
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (p)((Iterator)localObject3).next();
      localObject4 = ((p)localObject1).url;
      localObject2 = PreloadLogic.jSS;
      paramObject.add(new android.support.v4.f.j(localObject4, Integer.valueOf(PreloadLogic.sn(((p)localObject1).type))));
    }
    localObject1 = (Iterable)paramObject;
    paramObject = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    label424: label428: 
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = ((Iterator)localObject1).next();
      localObject2 = (android.support.v4.f.j)localObject4;
      localObject3 = PreloadLogic.jSS;
      if (m.FC(PreloadLogic.c((android.support.v4.f.j)localObject2)))
      {
        localObject3 = PreloadLogic.jSS;
        localObject3 = PreloadLogic.aXp();
        Object localObject5 = PreloadLogic.jSS;
        localObject5 = PreloadLogic.c((android.support.v4.f.j)localObject2);
        PreloadLogic localPreloadLogic = PreloadLogic.jSS;
        if (!((PreloadLogic.a)localObject3).bK((String)localObject5, PreloadLogic.d((android.support.v4.f.j)localObject2)))
          break label424;
      }
      for (j = 1; ; j = 0)
      {
        if (j != 0)
          break label428;
        paramObject.add(localObject4);
        break;
      }
    }
    paramObject = (List)paramObject;
    int k = Math.max(paramObject.size() - i, 0);
    paramObject = a.a.j.a((Iterable)paramObject, i);
    if (!((Collection)paramObject).isEmpty());
    for (int j = 1; ; j = 0)
    {
      if (j != 0)
      {
        localObject1 = PreloadLogic.jSS;
        PreloadLogic.a(paramObject, this.jKl, k, 1);
      }
      paramObject = y.AUy;
      AppMethodBeat.o(14905);
      return paramObject;
    }
  }

  public final Object m(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(14907);
    paramObject1 = ((q)a(paramObject1, (c)paramObject2)).bO(y.AUy);
    AppMethodBeat.o(14907);
    return paramObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.q
 * JD-Core Version:    0.6.2
 */