package com.tencent.mm.aj;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class m$a
{
  List<Object> fwI;
  Map<String, Integer> fwJ;
  Map<String, WeakReference<Bitmap>> fwK;
  az fwL;

  public m$a()
  {
    AppMethodBeat.i(11421);
    this.fwI = new ArrayList();
    this.fwJ = new HashMap();
    this.fwK = new HashMap();
    this.fwL = null;
    AppMethodBeat.o(11421);
  }

  public static String rm(String paramString)
  {
    AppMethodBeat.i(11424);
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      paramString = ((o)com.tencent.mm.kernel.g.K(o.class)).Yf() + "/brand_" + com.tencent.mm.a.g.x(paramString.getBytes());
      AppMethodBeat.o(11424);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(11424);
    }
  }

  public final void aeL()
  {
    AppMethodBeat.i(11422);
    this.fwI.clear();
    AppMethodBeat.o(11422);
  }

  final void g(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(11425);
    Bitmap localBitmap1;
    if (this.fwK.containsKey(paramString))
      localBitmap1 = (Bitmap)((WeakReference)this.fwK.get(paramString)).get();
    while (true)
    {
      Bitmap localBitmap3;
      if (localBitmap1 != null)
      {
        localBitmap3 = localBitmap1;
        if (!localBitmap1.isRecycled())
          break label111;
      }
      try
      {
        localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, 128, 128, true);
        localBitmap1 = d.a(localBitmap1, true, localBitmap1.getWidth() >> 1);
        this.fwK.remove(paramString);
        this.fwK.put(paramString, new WeakReference(localBitmap1));
        localBitmap3 = localBitmap1;
        label111: if (localBitmap3 == paramBitmap)
        {
          AppMethodBeat.o(11425);
          return;
          localBitmap1 = null;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        while (true)
        {
          Bitmap localBitmap2 = paramBitmap;
          continue;
          ab.i("MicroMsg.BrandLogic", "recycle bitmap:%s", new Object[] { paramBitmap.toString() });
          paramBitmap.recycle();
          AppMethodBeat.o(11425);
        }
      }
    }
  }

  final Bitmap rl(String paramString)
  {
    AppMethodBeat.i(11423);
    String str = String.format("%s%f", new Object[] { paramString, Float.valueOf(1.5F) });
    Bitmap localBitmap2;
    if (this.fwK.containsKey(str))
    {
      Bitmap localBitmap1 = (Bitmap)((WeakReference)this.fwK.get(str)).get();
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled());
      }
      else
      {
        localBitmap2 = BackwardSupportUtil.b.i(paramString, 1.5F);
        this.fwK.remove(str);
        this.fwK.put(str, new WeakReference(localBitmap2));
      }
    }
    while (true)
    {
      AppMethodBeat.o(11423);
      return localBitmap2;
      localBitmap2 = BackwardSupportUtil.b.i(paramString, 1.5F);
      this.fwK.put(str, new WeakReference(localBitmap2));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.m.a
 * JD-Core Version:    0.6.2
 */