package com.tencent.mm.plugin.downloader_app.ui;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136281);
    this.kQY.aop.notifyChanged();
    AppMethodBeat.o(136281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.b.1
 * JD-Core Version:    0.6.2
 */