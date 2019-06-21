package com.tencent.mm.at.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.n;
import com.tencent.mm.at.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class g
  implements n
{
  private a<String, Integer> fHo;

  public g()
  {
    AppMethodBeat.i(116093);
    this.fHo = new a(10);
    AppMethodBeat.o(116093);
  }

  public final boolean sG(String paramString)
  {
    try
    {
      AppMethodBeat.i(116094);
      if (this.fHo.aj(paramString))
      {
        int i = ((Integer)this.fHo.get(paramString)).intValue();
        this.fHo.put(paramString, Integer.valueOf(i + 1));
        if (i < 50)
          break label122;
        if ((i == 50) || (i % 500 == 0))
          ab.i("MicroMsg.imageloader.DefaultImageRetryDownloadListener", "Url %s retry over time %d current time:%d, then stop retry download", new Object[] { paramString, Integer.valueOf(50), Integer.valueOf(i) });
        AppMethodBeat.o(116094);
      }
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        this.fHo.put(paramString, Integer.valueOf(1));
        label122: AppMethodBeat.o(116094);
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.b.g
 * JD-Core Version:    0.6.2
 */