package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.c.b.a.g;
import a.c.c;
import a.c.e;
import a.c.e.c;
import a.f.b.x;
import a.p.b;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import kotlinx.coroutines.ac;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.ap;
import kotlinx.coroutines.bc;
import kotlinx.coroutines.bc.a;
import kotlinx.coroutines.bl;
import kotlinx.coroutines.bm;
import kotlinx.coroutines.i;

@a.c.b.a.d(c="com/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$addToPreload$1", dWy={898, 906}, f="PreloadLogic.kt", m="invokeSuspend")
@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"})
final class PreloadLogic$j extends g
  implements a.f.a.m<ac, c<? super y>, Object>
{
  private ac jTk;
  int label;

  PreloadLogic$j(long paramLong, String paramString, int paramInt1, int paramInt2, Object[] paramArrayOfObject, c paramc)
  {
    super(paramc);
  }

  public final c<y> a(Object paramObject, c<?> paramc)
  {
    AppMethodBeat.i(14883);
    a.f.b.j.p(paramc, "completion");
    paramc = new j(this.jKi, this.jKj, this.jKk, this.jKl, this.jTl, paramc);
    paramc.jTk = ((ac)paramObject);
    AppMethodBeat.o(14883);
    return paramc;
  }

  public final Object bO(Object arg1)
  {
    AppMethodBeat.i(14882);
    Object localObject1 = a.c.a.a.AVh;
    switch (this.label)
    {
    default:
      ??? = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      AppMethodBeat.o(14882);
      throw ???;
    case 0:
      if ((??? instanceof p.b))
      {
        ??? = ((p.b)???).AUq;
        AppMethodBeat.o(14882);
        throw ???;
      }
      ??? = PreloadLogic.jSS;
    case 1:
    }
    Object localObject5;
    label323: Object localObject6;
    while (true)
    {
      synchronized (PreloadLogic.aXv())
      {
        Object localObject2 = PreloadLogic.jSS;
        PreloadLogic.gO(this.jKi);
        localObject2 = PreloadLogic.jSS;
        localObject5 = PreloadLogic.aXv();
        localObject2 = new a/f/b/x;
        ((x)localObject2).<init>(4);
        ((x)localObject2).add(this.jKj);
        ((x)localObject2).add(Integer.valueOf(this.jKk));
        ((x)localObject2).add(Integer.valueOf(this.jKl));
        ((x)localObject2).jdMethod_do(this.jTl);
        ((Queue)localObject5).add(a.a.j.U(((x)localObject2).toArray(new Object[((x)localObject2).ckx.size()])));
        this.label = 1;
        if (1000L <= 0L)
        {
          localObject2 = y.AUy;
          if (localObject2 != localObject1)
            break label568;
          AppMethodBeat.o(14882);
          ??? = localObject1;
          return ???;
        }
      }
      localObject5 = new kotlinx.coroutines.j(a.c.a.b.c(this));
      ??? = (bc)((kotlinx.coroutines.a)localObject5).BPv.dWv().get((e.c)bc.BQx);
      if (((kotlinx.coroutines.a)localObject5).BPu == null);
      for (i = 1; i == 0; i = 0)
      {
        ??? = (Throwable)new IllegalStateException("Check failed.".toString());
        AppMethodBeat.o(14882);
        throw ???;
      }
      if (??? == null)
      {
        ((kotlinx.coroutines.a)localObject5).BPu = ((ap)bl.BQP);
        localObject6 = (i)localObject5;
        ??? = ((i)localObject6).dWv();
        a.f.b.j.p(???, "receiver$0");
        ??? = ???.get((e.c)a.c.d.AVd);
        ??? = ???;
        if (!(??? instanceof aj))
          ??? = null;
        ??? = (aj)???;
        ??? = ???;
        if (??? == null)
          ??? = ah.elh();
        ???.a((i)localObject6);
        if (!((kotlinx.coroutines.a)localObject5).ekP())
          break label506;
      }
      for (??? = a.c.a.a.AVh; ; ??? = ((kotlinx.coroutines.a)localObject5).ec(???))
      {
        ??? = ???;
        if (??? != a.c.a.a.AVh)
          break;
        a.f.b.j.p(this, "frame");
        ??? = ???;
        break;
        ???.start();
        ??? = bc.a.a(???, true, false, (a.f.a.b)new kotlinx.coroutines.l(???, (kotlinx.coroutines.a)localObject5), 2);
        ((kotlinx.coroutines.a)localObject5).BPu = ???;
        if (!(((kotlinx.coroutines.a)localObject5).BPs instanceof bm));
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label504;
          ???.dispose();
          ((kotlinx.coroutines.a)localObject5).BPu = ((ap)bl.BQP);
          break;
        }
        label504: break label323;
        label506: ??? = ((kotlinx.coroutines.a)localObject5).BPs;
        if ((??? instanceof kotlinx.coroutines.q))
        {
          ??? = ((kotlinx.coroutines.q)???).cause;
          AppMethodBeat.o(14882);
          throw ???;
        }
      }
      if ((??? instanceof p.b))
      {
        ??? = ((p.b)???).AUq;
        AppMethodBeat.o(14882);
        throw ???;
      }
      label568: ??? = PreloadLogic.jSS;
      synchronized (PreloadLogic.aXv())
      {
        ??? = PreloadLogic.jSS;
        if (PreloadLogic.aXw() == this.jKi)
        {
          ??? = PreloadLogic.jSS;
          if (!PreloadLogic.aXv().isEmpty());
        }
        else
        {
          ??? = y.AUy;
          AppMethodBeat.o(14882);
          continue;
        }
        ??? = new java/util/ArrayList;
        localObject1 = PreloadLogic.jSS;
        ???.<init>((Collection)PreloadLogic.aXv());
        localObject1 = PreloadLogic.jSS;
        PreloadLogic.aXv().clear();
        ??? = (Iterable)a.a.j.l((Iterable)???);
        ??? = (Collection)new ArrayList();
        localObject1 = ((Iterable)???).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          ??? = ((Iterator)localObject1).next();
          if ((((List)???).get(0) instanceof String))
            ???.add(???);
        }
      }
    }
    localObject1 = (Iterable)???;
    ??? = new HashSet();
    ??? = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject6 = ((Iterator)localObject1).next();
      localObject5 = ((List)localObject6).get(0);
      if (localObject5 == null)
      {
        ??? = new v("null cannot be cast to non-null type kotlin.String");
        AppMethodBeat.o(14882);
        throw ???;
      }
      if (???.add(b.FJ((String)localObject5)))
        ((ArrayList)???).add(localObject6);
    }
    ??? = (List)???;
    label1104: label1114: label1645: label1649: int k;
    if (!((List)???).isEmpty())
    {
      ??? = PreloadLogic.jSS;
      int j = PreloadLogic.sq(this.jKl);
      Object localObject7;
      Object localObject8;
      if (j != 0)
      {
        localObject1 = ((Iterable)???).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          ??? = (List)((Iterator)localObject1).next();
          localObject5 = h.pYm;
          localObject6 = PreloadLogic.jSS;
          localObject6 = PreloadLogic.a(???, 3, "");
          localObject7 = ???.get(0);
          if (localObject7 == null)
          {
            ??? = new v("null cannot be cast to non-null type kotlin.String");
            AppMethodBeat.o(14882);
            throw ???;
          }
          localObject7 = com.tencent.mm.compatible.util.q.encode((String)localObject7);
          localObject8 = PreloadLogic.jSS;
          localObject8 = PreloadLogic.a(???, 4, "");
          Object localObject9 = PreloadLogic.jSS;
          localObject9 = PreloadLogic.a(???, 5, "");
          Object localObject10 = ???.get(1);
          Object localObject11 = ???.get(1);
          if (localObject11 == null)
          {
            ??? = new v("null cannot be cast to non-null type kotlin.Int");
            AppMethodBeat.o(14882);
            throw ???;
          }
          if (((Integer)localObject11).intValue() == -1)
          {
            ??? = ???.get(0);
            if (??? == null)
            {
              ??? = new v("null cannot be cast to non-null type kotlin.String");
              AppMethodBeat.o(14882);
              throw ???;
            }
            ??? = (String)???;
            if (??? != null)
            {
              ??? = Boolean.valueOf(m.FW(???));
              if (!???.booleanValue())
                break label1214;
              i = 1;
              if (i == 0)
                break label1220;
            }
          }
          label1214: label1220: for (i = 1; ; i = 0)
          {
            ((h)localObject5).e(16468, new Object[] { Integer.valueOf(j), localObject6, localObject7, localObject8, localObject9, Integer.valueOf(2), localObject10, "", "", "", Integer.valueOf(i) });
            break;
            ??? = null;
            break label1104;
            i = 0;
            break label1114;
          }
        }
      }
      ??? = PreloadLogic.jSS;
      if (PreloadLogic.rW(PreloadLogic.sr(this.jKl)))
      {
        j = b.sk(this.jKl);
        ??? = (Iterable)???;
        ??? = (Collection)new ArrayList();
        localObject5 = ((Iterable)???).iterator();
        label1361: 
        while (((Iterator)localObject5).hasNext())
        {
          localObject1 = ((Iterator)localObject5).next();
          ??? = ((List)localObject1).get(0);
          if (??? == null)
          {
            ??? = new v("null cannot be cast to non-null type kotlin.String");
            AppMethodBeat.o(14882);
            throw ???;
          }
          if (!m.FW((String)???));
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label1361;
            ???.add(localObject1);
            break;
          }
        }
        ??? = (Iterable)???;
        ??? = (Collection)new ArrayList(a.a.j.d((Iterable)???));
        ??? = ((Iterable)???).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject5 = (List)((Iterator)???).next();
          localObject1 = ((List)localObject5).get(0);
          if (localObject1 == null)
          {
            ??? = new v("null cannot be cast to non-null type kotlin.String");
            AppMethodBeat.o(14882);
            throw ???;
          }
          localObject1 = (String)localObject1;
          localObject6 = PreloadLogic.jSS;
          localObject5 = ((List)localObject5).get(1);
          if (localObject5 == null)
          {
            ??? = new v("null cannot be cast to non-null type kotlin.Int");
            AppMethodBeat.o(14882);
            throw ???;
          }
          ???.add(new android.support.v4.f.j(localObject1, Integer.valueOf(PreloadLogic.sn(((Integer)localObject5).intValue()))));
        }
        ??? = (Iterable)???;
        ??? = (Collection)new ArrayList();
        ??? = ((Iterable)???).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject5 = ((Iterator)???).next();
          localObject1 = (android.support.v4.f.j)localObject5;
          localObject6 = PreloadLogic.jSS;
          if (m.FC(PreloadLogic.c((android.support.v4.f.j)localObject1)))
          {
            localObject6 = PreloadLogic.jSS;
            localObject6 = PreloadLogic.aXp();
            localObject7 = PreloadLogic.jSS;
            localObject7 = PreloadLogic.c((android.support.v4.f.j)localObject1);
            localObject8 = PreloadLogic.jSS;
            if (!((PreloadLogic.a)localObject6).bK((String)localObject7, PreloadLogic.d((android.support.v4.f.j)localObject1)))
              break label1645;
          }
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label1649;
            ???.add(localObject5);
            break;
          }
        }
        ??? = (List)???;
        k = Math.max(???.size() - j, 0);
        ??? = a.a.j.a((Iterable)???, j);
        if (((Collection)???).isEmpty())
          break label1729;
      }
    }
    label1729: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        ??? = PreloadLogic.jSS;
        PreloadLogic.a((List)???, this.jKl, k, 2);
      }
      ??? = y.AUy;
      AppMethodBeat.o(14882);
      break;
    }
  }

  public final Object m(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(14884);
    paramObject1 = ((j)a(paramObject1, (c)paramObject2)).bO(y.AUy);
    AppMethodBeat.o(14884);
    return paramObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.j
 * JD-Core Version:    0.6.2
 */