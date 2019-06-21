package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.storage.bi.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$9
  implements c.a.b
{
  SelectConversationUI$9(SelectConversationUI paramSelectConversationUI, bi.b paramb, String paramString)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35133);
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 1);
    localIntent.putExtra("kwebmap_slat", this.zKm.nJu);
    localIntent.putExtra("kwebmap_lng", this.zKm.nJv);
    localIntent.putExtra("Kwebmap_locaion", this.zKn);
    localIntent.putExtra("kShowshare", false);
    d.b(this.zKj.mController.ylL, "location", ".ui.RedirectUI", localIntent);
    AppMethodBeat.o(35133);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.9
 * JD-Core Version:    0.6.2
 */