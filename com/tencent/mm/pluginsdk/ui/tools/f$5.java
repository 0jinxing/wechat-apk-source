package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;

final class f$5
  implements x.a
{
  f$5(f paramf)
  {
  }

  public final void m(String paramString, final Bitmap paramBitmap)
  {
    boolean bool = false;
    AppMethodBeat.i(79931);
    if (paramBitmap == null)
      bool = true;
    ab.v("MicroMsg.ImageEngine", "on get picture finish, notifyKey[%s], bitmap is null[%B]", new Object[] { paramString, Boolean.valueOf(bool) });
    if (paramBitmap == null)
      AppMethodBeat.o(79931);
    while (true)
    {
      return;
      this.vuC.vuw.put(paramString, paramBitmap);
      final ImageView localImageView = (ImageView)this.vuC.vuu.get(paramString);
      if (localImageView != null)
      {
        this.vuC.vuv.remove(localImageView);
        this.vuC.fbD.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(79930);
            f.c.b(localImageView, paramBitmap);
            AppMethodBeat.o(79930);
          }
        });
      }
      this.vuC.vuu.remove(paramString);
      AppMethodBeat.o(79931);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f.5
 * JD-Core Version:    0.6.2
 */