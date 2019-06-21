package com.tencent.mm.loader.e.b;

import a.f;
import a.f.b.j;
import a.g;
import a.l;
import a.v;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/impr/target/TargetCenter;", "", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "", "Lcom/tencent/mm/loader/model/data/DataItem;", "clean", "", "dispatch", "R", "target", "resource", "(Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;Ljava/lang/Object;)V", "onDataItemLoadEnd", "data", "result", "Lcom/tencent/mm/loader/model/LoadResult;", "register", "unregister", "Companion", "libimageloader_release"})
public final class d
{
  public static final String TAG = "MicroMsg.Loader.TargetCenter";
  public static final d.a eQA = new d.a((byte)0);
  private static final f eQz = g.g((a.f.a.a)d.b.eQC);
  public ConcurrentHashMap<c<Object>, Collection<com.tencent.mm.loader.h.a.a<?>>> map = new ConcurrentHashMap();

  public final void a(c<Object> paramc)
  {
    j.p(paramc, "target");
    ab.i(TAG, "unregister ".concat(String.valueOf(paramc)));
    this.map.remove(paramc);
  }

  public final <R> void a(com.tencent.mm.loader.h.a.a<?> parama, com.tencent.mm.loader.h.c<R> paramc)
  {
    j.p(parama, "data");
    j.p(paramc, "result");
    Object localObject1 = (Map)this.map;
    Object localObject2 = new LinkedHashMap();
    Object localObject3 = ((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      if (((Collection)((Map.Entry)localObject1).getValue()).contains(parama))
        ((LinkedHashMap)localObject2).put(((Map.Entry)localObject1).getKey(), ((Map.Entry)localObject1).getValue());
    }
    localObject2 = ((Iterable)((Map)localObject2).keySet()).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      parama = (c)((Iterator)localObject2).next();
      localObject1 = paramc.value;
      if (localObject1 != null)
      {
        ab.i(TAG, "dispatch " + parama + " resource " + localObject1);
        if (localObject1 == null);
        try
        {
          localObject1 = new a/v;
          ((v)localObject1).<init>("null cannot be cast to non-null type kotlin.Any");
          throw ((Throwable)localObject1);
        }
        catch (Exception localException)
        {
          localObject3 = TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("exception ");
          ab.i((String)localObject3, localException.getMessage());
          a(parama);
          continue;
          parama.aP(localObject1);
          a(parama);
        }
        finally
        {
          a(parama);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.b.d
 * JD-Core Version:    0.6.2
 */