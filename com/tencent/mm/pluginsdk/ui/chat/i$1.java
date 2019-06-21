package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;

final class i$1
  implements View.OnClickListener
{
  i$1(i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27955);
    if ((this.vox.vow != null) && (this.vox.vos != null))
      this.vox.vow.ajI(this.vox.vos.vop);
    this.vox.vot.dismiss();
    AppMethodBeat.o(27955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.i.1
 * JD-Core Version:    0.6.2
 */