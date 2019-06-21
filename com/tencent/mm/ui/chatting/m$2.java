package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.n.b;

final class m$2
  implements n.b
{
  m$2(Context paramContext)
  {
  }

  public final void a(TextView paramTextView, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30598);
    ad localad;
    if (paramTextView != null)
    {
      aw.ZK();
      localad = c.XM().aoO(paramMenuItem.getTitle());
      if ((localad == null) || ((int)localad.ewQ <= 0))
      {
        paramTextView.setText(paramMenuItem.getTitle());
        AppMethodBeat.o(30598);
      }
    }
    while (true)
    {
      return;
      paramTextView.setText(j.b(this.val$context, localad.Oi()));
      AppMethodBeat.o(30598);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.2
 * JD-Core Version:    0.6.2
 */