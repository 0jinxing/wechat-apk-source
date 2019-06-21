package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.n.d;

final class am$9
  implements n.d
{
  am$9(bi parambi, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31018);
    String str = paramMenuItem.getTitle();
    paramMenuItem = ap.aps(this.fku.field_content).cvZ;
    if ((paramMenuItem == null) || (paramMenuItem.endsWith("-1")))
      paramMenuItem = this.fku.field_imgPath;
    while (true)
    {
      if (paramMenuItem == null)
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: filePath is null");
        AppMethodBeat.o(31018);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.LongClickBrandServiceHelper", "connector click[emoji]: to[%s] filePath[%s]", new Object[] { str, paramMenuItem });
        if (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().r(this.val$context, str, paramMenuItem))
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(47), Integer.valueOf(64), str });
          com.tencent.mm.ui.base.h.bQ(this.val$context, "");
        }
        com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(47), Integer.valueOf(64), str });
        com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131297039));
        AppMethodBeat.o(31018);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.9
 * JD-Core Version:    0.6.2
 */