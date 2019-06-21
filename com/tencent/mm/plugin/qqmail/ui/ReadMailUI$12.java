package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v.c;

final class ReadMailUI$12
  implements View.OnClickListener
{
  ReadMailUI$12(ReadMailUI paramReadMailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68435);
    ReadMailUI.j(this.pzZ).setVisibility(8);
    ReadMailUI.a(this.pzZ, new v.c());
    AppMethodBeat.o(68435);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.12
 * JD-Core Version:    0.6.2
 */