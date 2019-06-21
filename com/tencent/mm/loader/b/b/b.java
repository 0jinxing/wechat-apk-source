package com.tencent.mm.loader.b.b;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.h.d;
import com.tencent.mm.loader.h.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cache/memory/DefaultMemoryCache;", "T", "R", "Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "()V", "defaultImageMemoryCache", "Lcom/tencent/mm/loader/model/MMLRUMap;", "", "clear", "", "get", "Lcom/tencent/mm/loader/model/Resource;", "url", "Lcom/tencent/mm/loader/model/data/DataItem;", "head", "Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "put", "value", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;Ljava/lang/Object;)V", "remove", "Companion", "libimageloader_release"})
public final class b<T, R> extends c<T, R>
{
  private static final String TAG = "MicroMsg.Loader.DefaultImageMemoryCacheListener";
  private static final int ePp = 50;
  public static final b.a ePq = new b.a((byte)0);
  private final d<String, R> ePn = new d(ePp);

  public final e<R> a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.e.c.a<R> parama1)
  {
    j.p(parama, "url");
    parama = b(parama, parama1);
    parama = this.ePn.get(parama);
    if (parama != null);
    for (parama = new e(parama); ; parama = null)
      return parama;
  }

  public final void a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.e.c.a<R> parama1, R paramR)
  {
    j.p(parama, "url");
    parama = b(parama, parama1);
    this.ePn.put(parama, paramR);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.b.b.b
 * JD-Core Version:    0.6.2
 */