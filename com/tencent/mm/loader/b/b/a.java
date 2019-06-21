package com.tencent.mm.loader.b.b;

import android.graphics.Bitmap;
import com.tencent.mm.loader.h.d;
import com.tencent.mm.loader.h.e;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends c<String, Bitmap>
{
  private d<String, Bitmap> ePn = new d(50);
  private d<String, Bitmap> ePo = new d(10);

  public final e<Bitmap> a(com.tencent.mm.loader.h.a.a<String> parama, com.tencent.mm.loader.e.c.a<Bitmap> parama1)
  {
    if (!bo.isNullOrNil((String)parama.value()))
    {
      parama1 = b(parama, parama1);
      parama = (Bitmap)this.ePn.get(parama1);
      if (parama != null)
        break label67;
      parama = (Bitmap)this.ePo.get(parama1);
    }
    label67: 
    while (true)
    {
      if (parama != null);
      for (parama = new e(parama); ; parama = null)
        return parama;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.b.b.a
 * JD-Core Version:    0.6.2
 */