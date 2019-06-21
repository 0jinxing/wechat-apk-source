package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.be;
import com.tencent.mm.plugin.report.service.h;
import java.lang.ref.WeakReference;

final class l$6
  implements View.OnClickListener
{
  l$6(l paraml, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34681);
    be.ZV().co(this.bVv, this.yhK);
    d.H((Context)this.zwC.vlu.get(), "game", ".ui.GameCenterUI");
    h.pYm.e(11002, new Object[] { Integer.valueOf(9), Integer.valueOf(1) });
    AppMethodBeat.o(34681);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.l.6
 * JD-Core Version:    0.6.2
 */