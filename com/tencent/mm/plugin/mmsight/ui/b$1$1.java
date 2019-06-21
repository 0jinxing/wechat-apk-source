package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.n;
import com.tencent.mm.c.g;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class b$1$1
  implements n
{
  b$1$1(b.1 param1)
  {
  }

  public final void b(Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(55132);
    ab.i("MicroMsg.MMSightVideoEditor", "photoEditor onSuccess: %s isNever：%s", new Object[] { paramBitmap, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
        paramBitmap.recycle();
      if ((b.a(this.oBW.oBV) != null) && (!b.b(this.oBW.oBV)))
        if ((b.c(this.oBW.oBV) > 0) && (b.d(this.oBW.oBV) > 0) && (b.c(this.oBW.oBV) <= b.d(this.oBW.oBV)))
        {
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(55127);
              b.a(b.1.1.this.oBW.oBV, h.b(b.e(b.1.1.this.oBW.oBV), b.e(b.1.1.this.oBW.oBV).getString(2131301448), false, null));
              b.f(b.1.1.this.oBW.oBV).pause();
              b.a(b.1.1.this.oBW.oBV, null);
              AppMethodBeat.o(55127);
            }
          });
          AppMethodBeat.o(55132);
        }
    }
    while (true)
    {
      return;
      b.a(this.oBW.oBV, g.cz(b.g(this.oBW.oBV)));
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(55128);
          b.a(b.1.1.this.oBW.oBV).bQf();
          AppMethodBeat.o(55128);
        }
      });
      AppMethodBeat.o(55132);
      continue;
      if (b.b(this.oBW.oBV))
      {
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(55129);
            b.a(b.1.1.this.oBW.oBV, h.b(b.e(b.1.1.this.oBW.oBV), b.e(b.1.1.this.oBW.oBV).getString(2131301448), false, null));
            b.f(b.1.1.this.oBW.oBV).pause();
            b.a(b.1.1.this.oBW.oBV, null);
            AppMethodBeat.o(55129);
          }
        });
        AppMethodBeat.o(55132);
        continue;
        if (paramBitmap != null)
          al.d(new b.1.1.4(this, paramBitmap));
      }
      else
      {
        AppMethodBeat.o(55132);
      }
    }
  }

  public final void onError(Exception paramException)
  {
    AppMethodBeat.i(55131);
    ab.e("MicroMsg.MMSightVideoEditor", "photoEditor onError: %s", new Object[] { paramException });
    AppMethodBeat.o(55131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.1.1
 * JD-Core Version:    0.6.2
 */