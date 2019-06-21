package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ap$1
  implements View.OnClickListener
{
  ap$1(ap paramap)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39049);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof ap.c)))
    {
      paramView = null;
      if (paramView != null)
        break label52;
      ab.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
      AppMethodBeat.o(39049);
    }
    while (true)
    {
      return;
      paramView = (ap.c)paramView.getTag();
      break;
      label52: if (ap.a(this.rtM) != null)
        ap.a(this.rtM).a(paramView);
      AppMethodBeat.o(39049);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ap.1
 * JD-Core Version:    0.6.2
 */