package com.tencent.mm.ui.conversation.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34629);
    if ((this.zvQ.zvN != null) && (this.zvQ.zvP != null))
    {
      paramView = this.zvQ.zvN.Pz(this.zvQ.aLB);
      this.zvQ.zvP.in(paramView.zvS.id, paramView.zvS.url);
    }
    AppMethodBeat.o(34629);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.a.2
 * JD-Core Version:    0.6.2
 */