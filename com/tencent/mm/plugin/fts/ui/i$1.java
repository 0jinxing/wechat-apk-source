package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class i$1 extends ak
{
  i$1(i parami, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(61835);
    switch (paramMessage.what)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(61835);
      return;
      ab.d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is true");
      if ((!i.a(this.mIP)) && (this.mIP.getCount() > 0))
      {
        ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSImageLoader().bzY();
        com.tencent.mm.plugin.sns.b.n.qFx.start();
        this.mIP.notifyDataSetChanged();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.i.1
 * JD-Core Version:    0.6.2
 */