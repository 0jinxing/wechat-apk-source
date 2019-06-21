package com.tencent.mm.loader.e;

import com.tencent.mm.loader.h.a.a;
import com.tencent.mm.loader.h.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
  implements com.tencent.mm.loader.d.e
{
  private d<String, Integer> eQt = new d(10);

  public final boolean a(a<?> parama)
  {
    try
    {
      if (this.eQt.aj(parama.toString()))
      {
        int i = ((Integer)this.eQt.get(parama.toString())).intValue();
        this.eQt.put(parama.toString(), Integer.valueOf(i + 1));
        if (i < 50)
          break label124;
        if ((i == 50) || (i % 500 == 0))
          ab.i("MicroMsg.Loader.DefaultImageRetryDownloadListener", "Url %s retry over time %d current time:%d, then stop retry download", new Object[] { parama, Integer.valueOf(50), Integer.valueOf(i) });
      }
      label124: for (boolean bool = false; ; bool = true)
      {
        return bool;
        this.eQt.put(parama.toString(), Integer.valueOf(1));
      }
    }
    finally
    {
    }
    throw parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.e
 * JD-Core Version:    0.6.2
 */