package com.tencent.mm.loader.e;

import com.tencent.mm.a.g;
import com.tencent.mm.loader.f.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
  implements f
{
  public final String b(com.tencent.mm.loader.h.a.a<?> parama)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (parama != null)
    {
      localObject2 = localObject1;
      if (!bo.isNullOrNil(parama.toString()))
      {
        localObject2 = g.x(parama.toString().getBytes());
        ab.d("MicroMsg.Loader.DefaultFileNameCreator", "create image file name :%s", new Object[] { localObject2 });
      }
    }
    return localObject2;
  }

  public final String c(com.tencent.mm.loader.h.a.a<?> parama)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (parama != null)
    {
      localObject2 = localObject1;
      if (!bo.isNullOrNil(parama.toString()))
      {
        localObject2 = g.x(parama.toString().getBytes());
        ab.d("MicroMsg.Loader.DefaultFileNameCreator", "create image file name :%s", new Object[] { localObject2 });
      }
    }
    return (String)localObject2 + ".tmp";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.a
 * JD-Core Version:    0.6.2
 */