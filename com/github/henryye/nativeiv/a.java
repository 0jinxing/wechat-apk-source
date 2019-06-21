package com.github.henryye.nativeiv;

import android.util.SparseArray;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.github.henryye.nativeiv.bitmap.b;
import com.github.henryye.nativeiv.bitmap.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a
{
  public Map<BitmapType, b> aLP;
  public SparseArray<Map<BitmapType, b>> aLQ;

  public a()
  {
    AppMethodBeat.i(115742);
    this.aLP = new HashMap(2);
    this.aLQ = new SparseArray();
    this.aLP.put(BitmapType.Native, new a.1(this));
    this.aLP.put(BitmapType.Legacy, new a.2(this));
    this.aLP.put(BitmapType.Undefined, new a.3(this));
    AppMethodBeat.o(115742);
  }

  public static IBitmap a(c paramc, Map<BitmapType, b> paramMap)
  {
    AppMethodBeat.i(115744);
    if (((b)paramMap.get(BitmapType.Native)).a(paramc))
    {
      paramc = ((b)paramMap.get(BitmapType.Native)).pz();
      AppMethodBeat.o(115744);
    }
    while (true)
    {
      return paramc;
      if (((b)paramMap.get(BitmapType.Legacy)).a(paramc))
      {
        paramc = ((b)paramMap.get(BitmapType.Legacy)).pz();
        AppMethodBeat.o(115744);
      }
      else
      {
        paramc = ((b)paramMap.get(BitmapType.Undefined)).pz();
        AppMethodBeat.o(115744);
      }
    }
  }

  public static void b(Map<BitmapType, b> paramMap)
  {
    AppMethodBeat.i(115743);
    if (paramMap == null)
      AppMethodBeat.o(115743);
    while (true)
    {
      return;
      paramMap = paramMap.values().iterator();
      while (paramMap.hasNext())
        ((b)paramMap.next()).destroy();
      AppMethodBeat.o(115743);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.a
 * JD-Core Version:    0.6.2
 */