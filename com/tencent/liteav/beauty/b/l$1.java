package com.tencent.liteav.beauty.b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.basic.e.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

class l$1
  implements Runnable
{
  l$1(l paraml, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66918);
    l.a(this.c, this.a);
    l.b(this.c, this.b);
    if (this.a != null)
    {
      l.a(this.c, i.a(this.a, l.a(this.c), false));
      l.b(this.c)[0] = 1.0F;
      if (this.b == null)
        break label166;
      l.b(this.c, i.a(this.b, l.c(this.c), false));
      l.b(this.c)[1] = 1.0F;
      AppMethodBeat.o(66918);
    }
    while (true)
    {
      return;
      if (l.a(this.c) != -1)
        GLES20.glDeleteTextures(1, new int[] { l.a(this.c) }, 0);
      l.a(this.c, -1);
      l.b(this.c)[0] = 0.0F;
      break;
      label166: if (l.c(this.c) != -1)
        GLES20.glDeleteTextures(1, new int[] { l.c(this.c) }, 0);
      l.b(this.c, -1);
      l.b(this.c)[1] = 0.0F;
      AppMethodBeat.o(66918);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.l.1
 * JD-Core Version:    0.6.2
 */