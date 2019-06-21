package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class OpenIMAddressUI$OpenIMAddressUIFragment$7
  implements Runnable
{
  OpenIMAddressUI$OpenIMAddressUIFragment$7(OpenIMAddressUI.OpenIMAddressUIFragment paramOpenIMAddressUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33772);
    ab.i("MicroMsg.OpenIMAddressUI", "post to first init finish");
    View localView = this.zoc.findViewById(2131828206);
    if (localView != null)
    {
      localView.setVisibility(8);
      localView.startAnimation(AnimationUtils.loadAnimation(this.zoc.getContext(), 2131034181));
    }
    AppMethodBeat.o(33772);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment.7
 * JD-Core Version:    0.6.2
 */