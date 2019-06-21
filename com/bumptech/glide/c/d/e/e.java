package com.bumptech.glide.c.d.e;

import android.graphics.Bitmap;
import com.bumptech.glide.b.a;
import com.bumptech.glide.c.b.q;
import com.bumptech.glide.c.d.c.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class e extends b<c>
  implements q
{
  public e(c paramc)
  {
    super(paramc);
  }

  public final int getSize()
  {
    AppMethodBeat.i(92334);
    g localg = ((c)this.drawable).aFU.aGa;
    int i = localg.aGb.lW();
    int j = com.bumptech.glide.h.j.j(localg.nD().getWidth(), localg.nD().getHeight(), localg.nD().getConfig());
    AppMethodBeat.o(92334);
    return j + i;
  }

  public final void initialize()
  {
    AppMethodBeat.i(92336);
    ((c)this.drawable).ny().prepareToDraw();
    AppMethodBeat.o(92336);
  }

  public final Class<c> mK()
  {
    return c.class;
  }

  public final void recycle()
  {
    AppMethodBeat.i(92335);
    ((c)this.drawable).stop();
    Object localObject = (c)this.drawable;
    ((c)localObject).aBU = true;
    localObject = ((c)localObject).aFU.aGa;
    ((g)localObject).callbacks.clear();
    ((g)localObject).nF();
    ((g)localObject).isRunning = false;
    if (((g)localObject).aGf != null)
    {
      ((g)localObject).awX.c(((g)localObject).aGf);
      ((g)localObject).aGf = null;
    }
    if (((g)localObject).aGh != null)
    {
      ((g)localObject).awX.c(((g)localObject).aGh);
      ((g)localObject).aGh = null;
    }
    if (((g)localObject).aGj != null)
    {
      ((g)localObject).awX.c(((g)localObject).aGj);
      ((g)localObject).aGj = null;
    }
    ((g)localObject).aGb.clear();
    ((g)localObject).aGg = true;
    AppMethodBeat.o(92335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.e
 * JD-Core Version:    0.6.2
 */