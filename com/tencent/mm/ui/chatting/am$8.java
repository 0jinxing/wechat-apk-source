package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.base.n.d;

final class am$8
  implements n.d
{
  am$8(String paramString, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    int i = 66;
    AppMethodBeat.i(31017);
    String str = paramMenuItem.getTitle();
    ab.i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", new Object[] { str, this.yMp });
    paramMenuItem = bi.a.apC(this.yMp);
    Object localObject = this.yMp;
    if (ad.aox(paramMenuItem.svN))
    {
      paramInt = 66;
      localObject = new com.tencent.mm.modelmulti.h(str, (String)localObject, paramInt);
      aw.Rg().a((m)localObject, 0);
      localObject = com.tencent.mm.plugin.report.service.h.pYm;
      if (!ad.aox(paramMenuItem.svN))
        break label183;
    }
    label183: for (paramInt = i; ; paramInt = 42)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject).e(10424, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(32), str });
      com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131297039));
      AppMethodBeat.o(31017);
      return;
      paramInt = 42;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.8
 * JD-Core Version:    0.6.2
 */