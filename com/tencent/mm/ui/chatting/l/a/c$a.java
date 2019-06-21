package com.tencent.mm.ui.chatting.l.a;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.w;
import com.tencent.mm.ui.chatting.view.MMChattingListView;
import java.lang.ref.WeakReference;

final class c$a
  implements Runnable
{
  private String username;
  private View view;
  private long zap;
  private long zaq;
  WeakReference<MMChattingListView> zar;

  private c$a(c paramc, MMChattingListView paramMMChattingListView, String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(32723);
    this.view = paramMMChattingListView;
    this.username = paramString;
    this.zar = new WeakReference(paramMMChattingListView);
    this.zap = paramLong2;
    this.zaq = paramLong1;
    AppMethodBeat.o(32723);
  }

  public final void run()
  {
    AppMethodBeat.i(32724);
    Object localObject = ((j)g.K(j.class)).bOm();
    int i = ((j)g.K(j.class)).bOr().s(this.username, 0L, this.zaq - 1L);
    if (i <= 0);
    for (int j = ((b)localObject).o(this.username, 0L, this.zaq - 1L); ; j = 0)
    {
      boolean bool1;
      int k;
      if ((i <= 0) && (j <= 0))
      {
        bool1 = true;
        k = ((j)g.K(j.class)).bOr().s(this.username, this.zap + 1L, 9223372036854775807L);
        if (k > 0)
          break label296;
      }
      label155: label290: label296: for (int m = ((b)localObject).o(this.username, this.zap + 1L, 9223372036854775807L); ; m = 0)
      {
        boolean bool2;
        if ((k <= 0) && (m <= 0))
        {
          bool2 = true;
          bool3 = bool2;
          if (bool2)
          {
            localObject = ((b)localObject).QN(this.username);
            if (((w)localObject).field_lastLocalSeq != ((w)localObject).field_lastPushSeq)
              break label290;
          }
        }
        for (boolean bool3 = true; ; bool3 = false)
        {
          ab.i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[CheckEdgeTask#run] isShowTopAll:%s topCount:%s topBlockCount:%s isShowBottomAll:%s bottomCount:%s bottomBlockCount:%s", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool3), Integer.valueOf(k), Integer.valueOf(m) });
          this.view.postDelayed(new c.a.1(this, bool1, bool3), 60L);
          AppMethodBeat.o(32724);
          return;
          bool1 = false;
          break;
          bool2 = false;
          break label155;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.c.a
 * JD-Core Version:    0.6.2
 */