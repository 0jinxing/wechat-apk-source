package com.tencent.mm.plugin.profile.ui.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;

public final class c extends BitmapDrawable
  implements x.a
{
  private String url;

  public c(Resources paramResources, String paramString)
  {
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(23970);
    Object localObject1 = x.a(new c.1(this));
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (!((Bitmap)localObject1).isRecycled());
    }
    else
    {
      localObject2 = null;
    }
    localObject1 = getBounds();
    if (localObject2 != null)
      paramCanvas.drawBitmap(localObject2, null, (Rect)localObject1, null);
    AppMethodBeat.o(23970);
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(23971);
    if (this.url.equals(paramString))
      invalidateSelf();
    AppMethodBeat.o(23971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.b.c
 * JD-Core Version:    0.6.2
 */