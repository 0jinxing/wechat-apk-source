package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.storage.z;

final class FindMContactLearmMoreUI$1
  implements View.OnClickListener
{
  FindMContactLearmMoreUI$1(FindMContactLearmMoreUI paramFindMContactLearmMoreUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13622);
    g.RP().Ry().set(12322, Boolean.TRUE);
    ((a)g.M(a.class)).syncUploadMContactStatus(true, false);
    FindMContactLearmMoreUI.a(this.gsY);
    AppMethodBeat.o(13622);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI.1
 * JD-Core Version:    0.6.2
 */