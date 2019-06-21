package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader_app.a.d;

final class h$1
  implements View.OnClickListener
{
  h$1(h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30526);
    ((d)g.K(d.class)).a(paramView.getContext(), null, null);
    AppMethodBeat.o(30526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.h.1
 * JD-Core Version:    0.6.2
 */