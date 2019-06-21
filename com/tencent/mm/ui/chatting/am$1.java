package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class am$1
  implements n.d
{
  am$1(String paramString, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31010);
    paramMenuItem = paramMenuItem.getTitle();
    ab.i("MicroMsg.LongClickBrandServiceHelper", "connector click[text]: to[%s] text[%s]", new Object[] { paramMenuItem, this.fOH });
    com.tencent.mm.modelmulti.h localh = new com.tencent.mm.modelmulti.h(paramMenuItem, this.fOH, t.nK(paramMenuItem));
    aw.Rg().a(localh, 0);
    com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(1), Integer.valueOf(1), paramMenuItem });
    com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131297039));
    AppMethodBeat.o(31010);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.1
 * JD-Core Version:    0.6.2
 */