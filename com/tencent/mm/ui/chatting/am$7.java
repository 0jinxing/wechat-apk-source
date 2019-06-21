package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class am$7
  implements n.d
{
  am$7(String paramString, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31016);
    paramMenuItem = paramMenuItem.getTitle();
    ab.i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", new Object[] { paramMenuItem, this.yMo });
    com.tencent.mm.modelmulti.h localh = new com.tencent.mm.modelmulti.h(paramMenuItem, this.yMo, 48);
    aw.Rg().a(localh, 0);
    com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(48), Integer.valueOf(16), paramMenuItem });
    com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131297039));
    AppMethodBeat.o(31016);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.7
 * JD-Core Version:    0.6.2
 */