package com.tencent.mm.ui.chatting;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bv;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.transmit.MsgRetransmitUI.a;

final class am$6
  implements n.d
{
  am$6(bi parambi, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31015);
    String str = paramMenuItem.getTitle();
    s locals = u.ut(this.fku.field_imgPath);
    ab.i("MicroMsg.LongClickBrandServiceHelper", "connector click[video]: to[%s] imgPath[%s]", new Object[] { str, this.fku.field_imgPath });
    paramMenuItem = new MsgRetransmitUI.a();
    Object localObject = this.val$context;
    this.val$context.getResources().getString(2131297061);
    localObject = h.b((Context)localObject, this.val$context.getResources().getString(2131297043), true, new am.6.1(this, paramMenuItem));
    paramMenuItem.context = this.val$context;
    paramMenuItem.fileName = this.fku.field_imgPath;
    paramMenuItem.gII = ((Dialog)localObject);
    paramMenuItem.userName = str;
    paramMenuItem.zIW = locals.fXh;
    paramMenuItem.fXd = locals.fXd;
    paramMenuItem.execute(new Object[0]);
    bv.aaq().c(bv.fnw, null);
    h.bQ(this.val$context, this.val$context.getString(2131297039));
    AppMethodBeat.o(31015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.6
 * JD-Core Version:    0.6.2
 */