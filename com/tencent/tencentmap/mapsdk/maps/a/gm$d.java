package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.tencent.map.lib.element.a;
import com.tencent.map.lib.element.j;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.IntBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

class gm$d
{
  private final ArrayList<gm.e> b;
  private gm.e c;

  private gm$d(gm paramgm)
  {
    AppMethodBeat.i(99299);
    this.b = new ArrayList();
    AppMethodBeat.o(99299);
  }

  private Bitmap a(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99306);
    int i = paramInt1 * paramInt2;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    IntBuffer localIntBuffer = IntBuffer.wrap(arrayOfInt1);
    localIntBuffer.position(0);
    paramGL10.glReadPixels((gm.e(this.a).width() - paramInt1) / 2, (gm.e(this.a).height() - paramInt2) / 2, paramInt1, paramInt2, 6408, 5121, localIntBuffer);
    for (i = 0; i < paramInt2; i++)
      for (int j = 0; j < paramInt1; j++)
      {
        int k = arrayOfInt1[(i * paramInt1 + j)];
        arrayOfInt2[((paramInt2 - i - 1) * paramInt1 + j)] = (k & 0xFF00FF00 | k << 16 & 0xFF0000 | k >> 16 & 0xFF);
      }
    try
    {
      paramGL10 = Bitmap.createBitmap(arrayOfInt2, paramInt1, paramInt2, Bitmap.Config.RGB_565);
      AppMethodBeat.o(99306);
      return paramGL10;
    }
    catch (OutOfMemoryError paramGL10)
    {
      while (true)
        paramGL10 = Bitmap.createBitmap(arrayOfInt2, paramInt1, paramInt2, Bitmap.Config.RGB_565);
    }
  }

  private void a(gm.e parame)
  {
    AppMethodBeat.i(99305);
    if ((parame == null) || (parame.a()))
      AppMethodBeat.o(99305);
    while (true)
    {
      return;
      parame.b();
      synchronized (this.b)
      {
        this.b.remove(parame);
        gm.c(this.a).i();
        AppMethodBeat.o(99305);
      }
    }
  }

  private gm.e b()
  {
    AppMethodBeat.i(99300);
    gm.e locale = null;
    synchronized (this.b)
    {
      if (this.b.size() > 0)
        locale = (gm.e)this.b.get(0);
      AppMethodBeat.o(99300);
      return locale;
    }
  }

  public gm.e a(GL10 paramGL10)
  {
    paramGL10 = null;
    while (true)
    {
      try
      {
        AppMethodBeat.i(99302);
        this.c = b();
        if (this.c == null)
        {
          AppMethodBeat.o(99302);
          return paramGL10;
        }
        if (this.c.c())
        {
          a(this.c);
          AppMethodBeat.o(99302);
          continue;
        }
      }
      finally
      {
      }
      gm.c(this.a).h();
      paramGL10 = gm.e.c(this.c);
      int i = gm.e.d(this.c);
      int j = gm.e.e(this.c);
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      int k = (int)(SystemUtil.getDensity(gm.d(this.a)) * 20.0F);
      i = (gm.e(this.a).width() - i) / 2 + k;
      localRect.right = i;
      localRect.left = i;
      k = (gm.e(this.a).height() - j) / 2 + k;
      localRect.bottom = k;
      localRect.top = k;
      gm.c(this.a).b(paramGL10, localRect);
      paramGL10 = this.c;
      AppMethodBeat.o(99302);
    }
  }

  public void a(GL10 paramGL10, gj paramgj, fw paramfw)
  {
    try
    {
      AppMethodBeat.i(99303);
      if (gm.a(this.a) == null)
        AppMethodBeat.o(99303);
      while (true)
      {
        return;
        paramGL10 = gm.e.f(this.c);
        if (paramGL10 != null)
        {
          if ((paramGL10 instanceof a))
            ((a)paramGL10).a(paramgj, paramfw);
          paramGL10.b(paramgj, paramfw);
        }
        paramgj.a();
        AppMethodBeat.o(99303);
      }
    }
    finally
    {
    }
    throw paramGL10;
  }

  public boolean a()
  {
    AppMethodBeat.i(99301);
    synchronized (this.b)
    {
      if ((this.b == null) || (this.b.isEmpty()))
      {
        bool = true;
        AppMethodBeat.o(99301);
        return bool;
      }
      boolean bool = false;
    }
  }

  public void b(GL10 paramGL10, gj paramgj, fw paramfw)
  {
    try
    {
      AppMethodBeat.i(99304);
      if ((this.c != null) && (!this.c.c()))
      {
        int i = gm.e.d(this.c);
        int j = gm.e.e(this.c);
        paramgj = gm.e.g(this.c);
        paramfw = gm.e.f(this.c);
        paramGL10 = a(paramGL10, i, j);
        if ((paramgj != null) && (!this.c.a()))
          paramgj.a(paramGL10, paramfw);
        a(this.c);
      }
      AppMethodBeat.o(99304);
      return;
    }
    finally
    {
    }
    throw paramGL10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gm.d
 * JD-Core Version:    0.6.2
 */