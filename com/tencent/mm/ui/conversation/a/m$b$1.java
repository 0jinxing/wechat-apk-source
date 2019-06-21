package com.tencent.mm.ui.conversation.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;

final class m$b$1
  implements View.OnClickListener
{
  m$b$1(m.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34690);
    paramView = (m.b)paramView.getTag();
    ab.i("MicroMsg.MassSightBanner", "on click, massSendId %d, failed %B", new Object[] { Long.valueOf(paramView.zwG), Boolean.valueOf(paramView.zwH) });
    if (paramView.zwH)
      u.fV(paramView.zwG);
    AppMethodBeat.o(34690);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.m.b.1
 * JD-Core Version:    0.6.2
 */