package com.tencent.mm.ui.chatting.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$4
  implements View.OnClickListener
{
  b$4(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32779);
    if (this.zba.zaY != null)
      this.zba.zaY.onCancel();
    AppMethodBeat.o(32779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.b.4
 * JD-Core Version:    0.6.2
 */