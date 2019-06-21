package com.tencent.mm.loader.b.b;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.h.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "T", "R", "", "()V", "clear", "", "get", "Lcom/tencent/mm/loader/model/Resource;", "url", "Lcom/tencent/mm/loader/model/data/DataItem;", "head", "Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "getImageKey", "", "uriValue", "put", "key", "value", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;Ljava/lang/Object;)V", "remove", "libimageloader_release"})
public abstract class c<T, R>
{
  public static String b(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.e.c.a<R> parama1)
  {
    if ((parama == null) || (!parama.Ug()))
      parama1 = null;
    while (true)
    {
      return parama1;
      if (parama1 != null)
      {
        String str = parama.toString();
        j.o(str, "uriValue.toString()");
        str = parama1.lS(str);
        parama1 = str;
        if (str != null);
      }
      else
      {
        parama1 = parama.toString();
        j.o(parama1, "uriValue.toString()");
      }
    }
  }

  public abstract e<R> a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.e.c.a<R> parama1);

  public abstract void a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.e.c.a<R> parama1, R paramR);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.b.b.c
 * JD-Core Version:    0.6.2
 */