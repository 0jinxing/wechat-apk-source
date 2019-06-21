package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import com.tencent.mm.y.d.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public final class g
  implements d<com.tencent.mm.y.d>
{
  private Stack<com.tencent.mm.y.d> efp;
  private Stack<com.tencent.mm.y.d> efq;
  public int efs;
  private SparseArray<String> efx;
  private HashMap<String, Bitmap> efy;

  public final void CO()
  {
    this.efs += 1;
  }

  public final void Je()
  {
    AppMethodBeat.i(116255);
    ab.i("MicroMsg.MosaicCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.efp.size()) });
    this.efp.clear();
    if (this.efq != null)
    {
      ab.i("MicroMsg.MosaicCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.efq.size()) });
      this.efp.addAll(this.efq);
    }
    AppMethodBeat.o(116255);
  }

  public final Bitmap Jl()
  {
    AppMethodBeat.i(116259);
    String str = (String)this.efx.get(ac(true));
    if (bo.isNullOrNil(str))
    {
      ab.w("MicroMsg.MosaicCache", "[getCacheFromLocal] path is null");
      AppMethodBeat.o(116259);
      localBitmap1 = null;
      return localBitmap1;
    }
    ab.i("MicroMsg.MosaicCache", "[getCacheFromLocal] path:%s size:%s", new Object[] { str, Integer.valueOf(ac(true)) });
    if (this.efy.containsKey(str));
    for (Bitmap localBitmap1 = (Bitmap)this.efy.get(str); ; localBitmap1 = null)
    {
      Bitmap localBitmap2;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled());
      }
      else
      {
        ab.i("MicroMsg.MosaicCache", "");
        localBitmap2 = com.tencent.mm.sdk.platformtools.d.aml(str);
        ab.i("MicroMsg.MosaicCache", "[getCacheFromLocal] get from local!");
      }
      if (localBitmap2 == null)
      {
        ab.e("MicroMsg.MosaicCache", "[getCacheFromLocal] null == bitmap path:%s", new Object[] { str });
        AppMethodBeat.o(116259);
        localBitmap1 = null;
        break;
      }
      localBitmap1 = localBitmap2.copy(Bitmap.Config.ARGB_8888, true);
      ab.i("MicroMsg.MosaicCache", "bitmap recycle %s", new Object[] { localBitmap2 });
      localBitmap2.recycle();
      AppMethodBeat.o(116259);
      break;
    }
  }

  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    AppMethodBeat.i(116256);
    if (!paramBoolean)
      if ((this.efp == null) || (this.efp.size() <= 0))
        break label62;
    label62: for (com.tencent.mm.y.d locald = (com.tencent.mm.y.d)this.efp.peek(); ; locald = null)
    {
      if ((locald != null) && (locald.ckt == d.a.eHy))
        locald.draw(paramCanvas);
      AppMethodBeat.o(116256);
      return;
    }
  }

  public final void a(com.tencent.mm.y.d paramd)
  {
    AppMethodBeat.i(116260);
    if (this.efp != null)
      this.efp.push(paramd);
    AppMethodBeat.o(116260);
  }

  public final int ac(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(116261);
    if (paramBoolean)
      if (this.efp != null)
      {
        i = this.efp.size();
        AppMethodBeat.o(116261);
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(116261);
      continue;
      if (this.efq != null)
      {
        i = this.efq.size();
        AppMethodBeat.o(116261);
      }
      else
      {
        AppMethodBeat.o(116261);
      }
    }
  }

  public final void b(Canvas paramCanvas)
  {
    AppMethodBeat.i(116257);
    Bitmap localBitmap = Jl();
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    AppMethodBeat.o(116257);
  }

  public final void by(boolean paramBoolean)
  {
    AppMethodBeat.i(116254);
    ab.i("MicroMsg.MosaicCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.efp.size()) });
    if (this.efq != null)
      this.efq.clear();
    this.efq = ((Stack)this.efp.clone());
    if (paramBoolean)
      this.efp.clear();
    AppMethodBeat.o(116254);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(116252);
    ab.i("MicroMsg.MosaicCache", "[onCreate]");
    this.efp = new Stack();
    this.efx = new SparseArray();
    this.efy = new HashMap();
    AppMethodBeat.o(116252);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116253);
    if (this.efp != null)
    {
      localIterator = this.efp.iterator();
      while (localIterator.hasNext())
        localIterator.next();
      this.efp.clear();
    }
    if (this.efq != null)
    {
      localIterator = this.efq.iterator();
      while (localIterator.hasNext())
        localIterator.next();
      this.efq.clear();
    }
    this.efx.clear();
    Iterator localIterator = this.efy.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)((Map.Entry)localIterator.next()).getValue();
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        ab.i("MicroMsg.MosaicCache", "bitmap recycle %s", new Object[] { localBitmap.toString() });
        localBitmap.recycle();
      }
    }
    this.efy.clear();
    AppMethodBeat.o(116253);
  }

  public final void p(final Bitmap paramBitmap)
  {
    AppMethodBeat.i(116258);
    paramBitmap = paramBitmap.copy(Bitmap.Config.ARGB_8888, true);
    final String str1 = com.tencent.mm.ch.a.asQ(com.tencent.mm.e.a.ciX.toString());
    ab.i("MicroMsg.MosaicCache", "[saveCacheToLocal] path:%s size:%s", new Object[] { str1, Integer.valueOf(ac(true)) });
    String str2 = (String)this.efx.get(ac(true));
    if (!bo.isNullOrNil(str2))
    {
      e.deleteFile(str2);
      this.efx.remove(ac(true));
    }
    this.efx.put(ac(true), str1);
    this.efy.put(str1, paramBitmap);
    com.tencent.mm.sdk.g.d.g(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(116251);
        try
        {
          com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 50, Bitmap.CompressFormat.PNG, str1, true);
          AppMethodBeat.o(116251);
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.MosaicCache", localIOException, "", new Object[0]);
            AppMethodBeat.o(116251);
          }
        }
      }
    }
    , "[saveCacheToLocal] mosaic path:".concat(String.valueOf(str1)));
    AppMethodBeat.o(116258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.g
 * JD-Core Version:    0.6.2
 */