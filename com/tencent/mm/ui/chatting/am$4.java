package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.f;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.n.d;

final class am$4
  implements n.d
{
  am$4(bi parambi, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31013);
    paramMenuItem = paramMenuItem.getTitle();
    if (bo.isNullOrNil(this.fku.field_imgPath))
    {
      ab.e("MicroMsg.LongClickBrandServiceHelper", "Transfer fileName erro: fileName null");
      AppMethodBeat.o(31013);
      return;
    }
    com.tencent.mm.modelvoice.p localp = q.uW(this.fku.field_imgPath);
    Object localObject = this.fku.field_imgPath;
    if (localp == null);
    for (paramInt = 0; ; paramInt = localp.gaf)
    {
      localObject = q.f(paramMenuItem, (String)localObject, paramInt);
      ab.i("MicroMsg.LongClickBrandServiceHelper", "connector click[voice]: to[%s] filePath[%s]", new Object[] { paramMenuItem, localObject });
      localObject = new f((String)localObject, 1);
      aw.Rg().a((m)localObject, 0);
      com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(34), Integer.valueOf(2), paramMenuItem });
      com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131297039));
      AppMethodBeat.o(31013);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.4
 * JD-Core Version:    0.6.2
 */