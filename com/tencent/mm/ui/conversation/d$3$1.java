package com.tencent.mm.ui.conversation;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;

final class d$3$1
  implements Runnable
{
  d$3$1(d.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34178);
    long l = System.currentTimeMillis();
    int i;
    if ((l - this.zrl.zrj < 3000L) && (this.zrl.zrk >= 0))
      i = this.zrl.zrk;
    label71: label94: label363: label370: 
    while (true)
    {
      Object localObject = this.zrl.zrh.zrd;
      int k;
      int m;
      if (this.zrl.zrh.zrc > 0)
      {
        j = 1;
        k = ((h)localObject).getCount();
        if (k <= 0)
          break label325;
        m = Math.abs((i + 1) % k);
        if (m == i)
          break label325;
        ak localak = (ak)((h)localObject).MG(m);
        if ((localak == null) || ((localak.field_unReadCount <= 0) && (localak.field_unReadMuteCount <= 0)))
          break label313;
        if (j == 0)
          break label310;
        if (h.a(localak, ((h)localObject).i(localak)) != 2)
          break label313;
        if (m >= 0)
          break label331;
        BackwardSupportUtil.c.c(this.zrl.zrh.zqz, this.zrl.zrh.zqz.getHeaderViewsCount());
        this.zrl.zrj = l;
        localObject = this.zrl;
        if (m >= 0)
          break label363;
      }
      for (int j = 0; ; j = m)
      {
        ((d.3)localObject).zrk = j;
        ab.d("MicroMsg.ConvUnreadHelper", "headerCount %d, scroll from %d to %d", new Object[] { Integer.valueOf(this.zrl.zrh.zqz.getHeaderViewsCount()), Integer.valueOf(i), Integer.valueOf(m) });
        AppMethodBeat.o(34178);
        return;
        i = this.zrl.zrh.zqz.getFirstVisiblePosition() - this.zrl.zrh.zqz.getHeaderViewsCount() + 1;
        if (i >= 0)
          break label370;
        i = 0;
        break;
        j = 0;
        break label71;
        break label154;
        m = (m + 1) % k;
        break label94;
        m = -1;
        break label154;
        BackwardSupportUtil.c.c(this.zrl.zrh.zqz, this.zrl.zrh.zqz.getHeaderViewsCount() + m);
        break label185;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.d.3.1
 * JD-Core Version:    0.6.2
 */