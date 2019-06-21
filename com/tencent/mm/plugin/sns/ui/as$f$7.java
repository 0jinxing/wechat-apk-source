package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class as$f$7
  implements View.OnLongClickListener
{
  as$f$7(as.f paramf)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(39217);
    if (paramView.getTag() == null)
      AppMethodBeat.o(39217);
    while (true)
    {
      return true;
      ab.d("MicroMsg.SnsphotoAdapter", "snsFailPhoto long click");
      this.rwn.rwm = ((as.f.a)paramView.getTag());
      int i = this.rwn.rwm.cNE;
      int j = this.rwn.rwm.position;
      this.rwn.fy(i, j);
      AppMethodBeat.o(39217);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.f.7
 * JD-Core Version:    0.6.2
 */