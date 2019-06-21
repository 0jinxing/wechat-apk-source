package com.tencent.mm.plugin.record.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import java.util.Map;

final class RecordMsgImageUI$9
  implements n.d
{
  RecordMsgImageUI$9(RecordMsgImageUI paramRecordMsgImageUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24303);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(24303);
      while (true)
      {
        return;
        RecordMsgImageUI.g(this.pKQ);
        AppMethodBeat.o(24303);
        continue;
        localObject = this.pKQ;
        paramMenuItem = new cl();
        e.a(paramMenuItem, ((RecordMsgImageUI)localObject).getIntent().getIntExtra("key_favorite_source_type", 1), ((RecordMsgImageUI)localObject).ceS());
        paramMenuItem.cvA.cvH = 10;
        paramMenuItem.cvA.activity = ((Activity)localObject);
        a.xxA.m(paramMenuItem);
        AppMethodBeat.o(24303);
        continue;
        RecordMsgImageUI.h(this.pKQ);
        AppMethodBeat.o(24303);
        continue;
        paramMenuItem = RecordMsgImageUI.i(this.pKQ);
        if (!bo.isNullOrNil(paramMenuItem))
          break;
        AppMethodBeat.o(24303);
      }
      Object localObject = (nr)RecordMsgImageUI.j(this.pKQ).get(paramMenuItem);
      if (localObject != null)
      {
        paramMenuItem = new cf();
        paramMenuItem.cvm.activity = this.pKQ;
        paramMenuItem.cvm.ctB = ((nr)localObject).cJX.result;
        paramMenuItem.cvm.cvn = ((nr)localObject).cJX.cvn;
        paramMenuItem.cvm.cvp = 8;
        RecordMsgImageUI.a(this.pKQ, paramMenuItem);
        paramMenuItem.cvm.cvo = ((nr)localObject).cJX.cvo;
        if (this.pKQ.getIntent() != null)
          paramMenuItem.cvm.cvs = this.pKQ.getIntent().getBundleExtra("_stat_obj");
        a.xxA.m(paramMenuItem);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI.9
 * JD-Core Version:    0.6.2
 */