package com.tencent.mm.plugin.sight.encode.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.encode.a.b.a;
import com.tencent.mm.ui.base.h;
import java.util.List;

final class MainSightForwardContainerView$6
  implements b.a
{
  MainSightForwardContainerView$6(MainSightForwardContainerView paramMainSightForwardContainerView, List paramList)
  {
  }

  public final void onError(int paramInt)
  {
    AppMethodBeat.i(25041);
    if ((this.qAN.size() <= 1) || (-1 == paramInt))
      h.bQ(this.qAL.getContext(), this.qAL.getContext().getString(2131302960));
    AppMethodBeat.o(25041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.6
 * JD-Core Version:    0.6.2
 */