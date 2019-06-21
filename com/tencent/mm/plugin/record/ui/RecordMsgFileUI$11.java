package com.tencent.mm.plugin.record.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;
import java.io.File;

final class RecordMsgFileUI$11
  implements MenuItem.OnMenuItemClickListener
{
  RecordMsgFileUI$11(RecordMsgFileUI paramRecordMsgFileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24265);
    paramMenuItem = new d(this.pKI.mController.ylL, 1, false);
    paramMenuItem.rBl = new RecordMsgFileUI.11.1(this);
    paramMenuItem.rBm = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(24264);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default:
        case 0:
        }
        while (true)
        {
          AppMethodBeat.o(24264);
          while (true)
          {
            return;
            if (RecordMsgFileUI.c(RecordMsgFileUI.11.this.pKI) != 8)
              break;
            paramAnonymousMenuItem = n.c(RecordMsgFileUI.a(RecordMsgFileUI.11.this.pKI), RecordMsgFileUI.b(RecordMsgFileUI.11.this.pKI));
            if (!e.ct(paramAnonymousMenuItem))
            {
              ab.e("MicroMsg.RecordMsgFileUI", "share file failed, file not exists");
              Toast.makeText(RecordMsgFileUI.11.this.pKI, RecordMsgFileUI.11.this.pKI.getString(2131299732), 1).show();
              AppMethodBeat.o(24264);
            }
            else
            {
              if (new File(paramAnonymousMenuItem).length() <= 10485760L)
                break;
              ab.e("MicroMsg.RecordMsgFileUI", "share file failed, file too large");
              Toast.makeText(RecordMsgFileUI.11.this.pKI, RecordMsgFileUI.11.this.pKI.getString(2131299733), 1).show();
              AppMethodBeat.o(24264);
            }
          }
          RecordMsgFileUI.h(RecordMsgFileUI.11.this.pKI);
        }
      }
    };
    paramMenuItem.cpD();
    AppMethodBeat.o(24265);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.11
 * JD-Core Version:    0.6.2
 */