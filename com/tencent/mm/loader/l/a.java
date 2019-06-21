package com.tencent.mm.loader.l;

import android.graphics.Bitmap;
import com.tencent.mm.loader.e.b.f;
import com.tencent.mm.loader.h.a.b;
import com.tencent.mm.sdk.platformtools.d;
import java.io.InputStream;

public final class a
{
  public static Bitmap a(f<?> paramf, InputStream paramInputStream, int paramInt1, int paramInt2, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      if ((paramf != null) && (paramf.width > 0) && (paramf.width > 0))
        paramf = d.a(paramInputStream, 0.0F, paramf.width, paramf.height);
    while (true)
    {
      paramInputStream = paramf;
      if (paramBoolean1)
        paramInputStream = d.a(paramf, paramInt1, paramInt2, false, true);
      paramf = paramInputStream;
      if (paramFloat > 0.0F)
        paramf = d.c(paramInputStream, paramFloat);
      paramInputStream = paramf;
      if (paramBoolean2)
        paramInputStream = d.ak(paramf);
      return paramInputStream;
      paramf = d.decodeStream(paramInputStream);
      continue;
      paramf = d.a(paramInputStream, 0.0F, paramInt1, paramInt2);
    }
  }

  public static boolean d(com.tencent.mm.loader.h.a.a parama)
  {
    if ((parama == null) || (parama.Uf() == b.eRX) || (parama.Uf() == b.eRW) || (parama.Uf() == b.eRY));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.l.a
 * JD-Core Version:    0.6.2
 */