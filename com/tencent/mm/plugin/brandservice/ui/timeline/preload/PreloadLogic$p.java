package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.c.a.a;
import a.c.b.a.d;
import a.c.b.a.g;
import a.c.c;
import a.l;
import a.p.b;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.ac;

@d(c="com/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$preloadByIdAndUrls$1", dWy={995}, f="PreloadLogic.kt", m="invokeSuspend")
@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"})
final class PreloadLogic$p extends g
  implements a.f.a.m<ac, c<? super y>, Object>
{
  private ac jTk;
  int label;

  PreloadLogic$p(List paramList, int paramInt, c paramc)
  {
    super(paramc);
  }

  public final c<y> a(Object paramObject, c<?> paramc)
  {
    AppMethodBeat.i(14903);
    a.f.b.j.p(paramc, "completion");
    paramc = new p(this.jKn, this.jKl, paramc);
    paramc.jTk = ((ac)paramObject);
    AppMethodBeat.o(14903);
    return paramc;
  }

  public final Object bO(Object paramObject)
  {
    AppMethodBeat.i(14902);
    Object localObject1 = a.AVh;
    switch (this.label)
    {
    default:
      paramObject = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      AppMethodBeat.o(14902);
      throw paramObject;
    case 0:
    }
    if ((paramObject instanceof p.b))
    {
      paramObject = ((p.b)paramObject).AUq;
      AppMethodBeat.o(14902);
      throw paramObject;
    }
    localObject1 = this.jKn;
    int j;
    Object localObject2;
    label125: Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    if (!((Collection)localObject1).isEmpty())
    {
      i = 1;
      if (i == 0)
        break label907;
      paramObject = PreloadLogic.jSS;
      j = PreloadLogic.sq(this.jKl);
      if (j == 0)
        break label500;
      localObject2 = ((Iterable)localObject1).iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext())
          break;
        paramObject = (List)((Iterator)localObject2).next();
        localObject3 = new StringBuilder("addToPreload_").append((String)paramObject.get(0)).append('_').append((String)paramObject.get(1)).append('_');
        localObject4 = PreloadLogic.jSS;
        localObject3 = ((StringBuilder)localObject3).append((String)PreloadLogic.a(paramObject, 3, "")).append('_');
        localObject4 = PreloadLogic.jSS;
        localObject3 = (String)PreloadLogic.a(paramObject, 4, "");
        localObject4 = PreloadLogic.jSS;
      }
      while (PreloadLogic.aXr().contains(localObject3));
      localObject4 = PreloadLogic.jSS;
      PreloadLogic.aXr().add(localObject3);
      localObject5 = h.pYm;
      localObject4 = paramObject.get(0);
      localObject3 = q.encode((String)paramObject.get(1));
      localObject6 = PreloadLogic.jSS;
      localObject6 = PreloadLogic.a(paramObject, 3, "");
      localObject7 = PreloadLogic.jSS;
      localObject7 = PreloadLogic.a(paramObject, 4, "");
      localObject8 = paramObject.get(2);
      if (!a.f.b.j.j((String)paramObject.get(2), "-1"))
        break label490;
      paramObject = (String)paramObject.get(1);
      if (paramObject == null)
        break label485;
      paramObject = Boolean.valueOf(m.FW(paramObject));
      label382: if (!paramObject.booleanValue())
        break label490;
      i = 1;
      label391: if (i == 0)
        break label495;
    }
    label485: label490: label495: for (int i = 1; ; i = 0)
    {
      ((h)localObject5).e(16468, new Object[] { Integer.valueOf(j), localObject4, localObject3, localObject6, localObject7, Integer.valueOf(1), localObject8, "", "", "", Integer.valueOf(i) });
      break label125;
      i = 0;
      break;
      paramObject = null;
      break label382;
      i = 0;
      break label391;
    }
    label500: paramObject = PreloadLogic.jSS;
    label607: int k;
    if (PreloadLogic.rW(PreloadLogic.sr(this.jKl)))
    {
      j = b.sk(this.jKl);
      localObject1 = (Iterable)localObject1;
      paramObject = (Collection)new ArrayList();
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        if (!m.FW((String)((List)localObject2).get(1)));
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label607;
          paramObject.add(localObject2);
          break;
        }
      }
      localObject1 = (Iterable)paramObject;
      paramObject = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (List)((Iterator)localObject1).next();
        localObject3 = ((List)localObject4).get(1);
        localObject2 = PreloadLogic.jSS;
        paramObject.add(new android.support.v4.f.j(localObject3, Integer.valueOf(PreloadLogic.sn(Integer.parseInt((String)((List)localObject4).get(2))))));
      }
      localObject1 = (Iterable)paramObject;
      paramObject = (Collection)new ArrayList();
      localObject3 = ((Iterable)localObject1).iterator();
      label839: label842: 
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = ((Iterator)localObject3).next();
        localObject2 = (android.support.v4.f.j)localObject1;
        localObject4 = PreloadLogic.jSS;
        if (m.FC(PreloadLogic.c((android.support.v4.f.j)localObject2)))
        {
          localObject4 = PreloadLogic.jSS;
          localObject4 = PreloadLogic.aXp();
          localObject5 = PreloadLogic.jSS;
          localObject6 = PreloadLogic.c((android.support.v4.f.j)localObject2);
          localObject5 = PreloadLogic.jSS;
          if (!((PreloadLogic.a)localObject4).bK((String)localObject6, PreloadLogic.d((android.support.v4.f.j)localObject2)))
            break label839;
        }
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label842;
          paramObject.add(localObject1);
          break;
        }
      }
      paramObject = (List)paramObject;
      k = Math.max(paramObject.size() - j, 0);
      paramObject = a.a.j.a((Iterable)paramObject, j);
      if (((Collection)paramObject).isEmpty())
        break label919;
    }
    label907: label919: for (i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localObject1 = PreloadLogic.jSS;
        PreloadLogic.a(paramObject, this.jKl, k, 1);
      }
      paramObject = y.AUy;
      AppMethodBeat.o(14902);
      return paramObject;
    }
  }

  public final Object m(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(14904);
    paramObject1 = ((p)a(paramObject1, (c)paramObject2)).bO(y.AUy);
    AppMethodBeat.o(14904);
    return paramObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.p
 * JD-Core Version:    0.6.2
 */