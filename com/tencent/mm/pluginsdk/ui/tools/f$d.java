package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$d
  implements Runnable
{
  ImageView cAw;
  Bitmap mQQ;

  private f$d(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79940);
    if (this.cAw != null)
    {
      if ((this.mQQ == null) || (!this.mQQ.isRecycled()))
        break label63;
      f.c.k(this.cAw);
    }
    while (true)
    {
      this.cAw = null;
      this.mQQ = null;
      this.vuC.vuy.cy(this);
      AppMethodBeat.o(79940);
      return;
      label63: f.c.b(this.cAw, this.mQQ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f.d
 * JD-Core Version:    0.6.2
 */