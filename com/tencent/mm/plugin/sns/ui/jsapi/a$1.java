package com.tencent.mm.plugin.sns.ui.jsapi;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40217);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a.c)))
    {
      paramView = null;
      if (paramView != null)
        break label52;
      ab.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
      AppMethodBeat.o(40217);
    }
    while (true)
    {
      return;
      paramView = (a.c)paramView.getTag();
      break;
      label52: if (a.a(this.rJy) != null)
        a.a(this.rJy).a(paramView);
      AppMethodBeat.o(40217);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.a.1
 * JD-Core Version:    0.6.2
 */