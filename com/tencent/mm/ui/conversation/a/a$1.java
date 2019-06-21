package com.tencent.mm.ui.conversation.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34628);
    if ((this.zvQ.zvN != null) && (this.zvQ.zvP != null))
    {
      paramView = this.zvQ.zvN.Pz(this.zvQ.aLB);
      this.zvQ.zvP.aeT(paramView.zvS.id);
    }
    AppMethodBeat.o(34628);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.a.1
 * JD-Core Version:    0.6.2
 */