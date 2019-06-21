package com.tencent.mm.view.d;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.at.a.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements m
{
  private com.tencent.mm.at.a.d.a<String, Bitmap> Ado;

  public a()
  {
    AppMethodBeat.i(63019);
    this.Ado = new com.tencent.mm.at.a.d.a(150);
    AppMethodBeat.o(63019);
  }

  public final void c(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(63021);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed. key is null.");
      AppMethodBeat.o(63021);
    }
    while (true)
    {
      return;
      if (paramBitmap == null)
      {
        ab.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed.value is null.");
        AppMethodBeat.o(63021);
      }
      else
      {
        this.Ado.put(paramString, paramBitmap);
        AppMethodBeat.o(63021);
      }
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(63022);
    try
    {
      if (this.Ado == null)
        break label160;
      Object localObject1 = this.Ado.snapshot();
      if ((!((Map)localObject1).isEmpty()) && (((Map)localObject1).size() > 0))
      {
        Iterator localIterator = ((Map)localObject1).entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (Bitmap)((Map.Entry)localIterator.next()).getValue();
          if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
            ab.i("MicroMsg.emoji.EmojiLoaderMemoryCache", "recycle bitmap:%s, not need", new Object[] { localObject1.toString() });
        }
      }
    }
    finally
    {
      AppMethodBeat.o(63022);
    }
    Object localObject3 = this.Ado;
    if (((com.tencent.mm.at.a.d.a)localObject3).eRT == null)
    {
      localObject3 = new java/lang/NullPointerException;
      ((NullPointerException)localObject3).<init>("mData == null");
      AppMethodBeat.o(63022);
      throw ((Throwable)localObject3);
    }
    ((com.tencent.mm.at.a.d.a)localObject3).eRT.trimToSize(-1);
    label160: AppMethodBeat.o(63022);
  }

  public final Bitmap kR(String paramString)
  {
    AppMethodBeat.i(63020);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = (Bitmap)this.Ado.get(paramString);
      AppMethodBeat.o(63020);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(63020);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.d.a
 * JD-Core Version:    0.6.2
 */