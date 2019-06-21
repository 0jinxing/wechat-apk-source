package com.tencent.mm.plugin.masssend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$d
  implements View.OnClickListener
{
  private String id;

  public c$d(c paramc, String paramString)
  {
    this.id = paramString;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22786);
    ab.v("MicroMsg.HistoryAdapter", "voice clicked:" + this.id);
    if (c.b(this.ooJ) != null)
    {
      c.a(this.ooJ, c.b(this.ooJ).Qw(this.id));
      this.ooJ.notifyDataSetChanged();
    }
    AppMethodBeat.o(22786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.c.d
 * JD-Core Version:    0.6.2
 */