package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.masssend.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.vfs.e;

final class c$a
  implements View.OnClickListener
{
  private String fileName;
  private int ooe;

  public c$a(c paramc, String paramString, int paramInt)
  {
    this.fileName = paramString;
    this.ooe = paramInt;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22783);
    ab.v("MicroMsg.HistoryAdapter", "image clicked:" + this.fileName);
    aw.ZK();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      t.hO(c.a(this.ooJ));
      AppMethodBeat.o(22783);
    }
    while (true)
    {
      return;
      paramView = new StringBuilder();
      aw.ZK();
      String str = com.tencent.mm.model.c.XW() + this.fileName;
      if ((str == null) || (str.equals("")) || (!e.ct(str)))
      {
        ab.d("MicroMsg.HistoryAdapter", "showImg : imgPath is null");
        AppMethodBeat.o(22783);
      }
      else
      {
        paramView = new Intent();
        paramView.putExtra("key_compress_type", this.ooe);
        paramView.putExtra("key_favorite", false);
        paramView.putExtra("key_image_path", str);
        a.gkE.d(c.a(this.ooJ), paramView);
        AppMethodBeat.o(22783);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.c.a
 * JD-Core Version:    0.6.2
 */