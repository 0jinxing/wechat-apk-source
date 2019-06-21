package com.tencent.mm.plugin.favorite;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.widget.a.c.a.b;

final class d$4
  implements c.a.b
{
  d$4(g paramg, Context paramContext)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(20502);
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_Msg_content", this.meI.field_favProto.desc);
    d.f(this.val$context, ".ui.transmit.RetransmitPreviewUI", localIntent);
    b.hL(this.val$context);
    AppMethodBeat.o(20502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.d.4
 * JD-Core Version:    0.6.2
 */