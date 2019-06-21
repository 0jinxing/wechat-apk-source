package com.tencent.mm.plugin.location.model;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.bv.a.a;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class m
  implements a
{
  private Bitmap jMX;
  private f<String, Bitmap> nKC;

  public m()
  {
    AppMethodBeat.i(113375);
    this.jMX = null;
    this.nKC = new b(20, getClass());
    AppMethodBeat.o(113375);
  }

  public final void Dp(String paramString)
  {
    try
    {
      AppMethodBeat.i(113378);
      ab.d("MicroMsg.TrackAvatarCacheService", "clearCache, tag = %s", new Object[] { paramString });
      Iterator localIterator = this.nKC.snapshot().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith(paramString))
          this.nKC.remove(str);
      }
    }
    finally
    {
    }
    AppMethodBeat.o(113378);
  }

  public final Bitmap PO(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(113376);
        if (bo.isNullOrNil(paramString))
        {
          AppMethodBeat.o(113376);
          paramString = null;
          return paramString;
        }
        ab.d("MicroMsg.TrackAvatarCacheService", "getAvatar, tag = %s, cacheSize = %d", new Object[] { paramString, Integer.valueOf(this.nKC.size()) });
        paramString = (Bitmap)this.nKC.get(paramString);
        if ((paramString != null) && (!paramString.isRecycled()))
        {
          AppMethodBeat.o(113376);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(113376);
      paramString = null;
    }
  }

  public final void p(String paramString, Bitmap paramBitmap)
  {
    try
    {
      AppMethodBeat.i(113377);
      if (this.nKC.get(paramString) != null)
      {
        Bitmap localBitmap = (Bitmap)this.nKC.get(paramString);
        if (!localBitmap.isRecycled())
        {
          ab.i("MicroMsg.TrackAvatarCacheService", "bitmap recycle %s", new Object[] { localBitmap.toString() });
          localBitmap.recycle();
        }
        this.nKC.remove(paramString);
      }
      this.nKC.put(paramString, paramBitmap);
      ab.d("MicroMsg.TrackAvatarCacheService", "updateCache, tag = %s, cacheSize = %d", new Object[] { paramString, Integer.valueOf(this.nKC.size()) });
      AppMethodBeat.o(113377);
      return;
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.m
 * JD-Core Version:    0.6.2
 */