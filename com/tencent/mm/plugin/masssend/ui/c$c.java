package com.tencent.mm.plugin.masssend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.plugin.masssend.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;

final class c$c
  implements View.OnClickListener
{
  private String fileName;
  private int length;
  private int size;
  private int videoSource;

  public c$c(c paramc, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.fileName = paramString;
    this.videoSource = paramInt1;
    this.length = paramInt3;
    this.size = paramInt2;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22785);
    aw.ZK();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(c.a(this.ooJ));
      AppMethodBeat.o(22785);
      return;
    }
    if (this.videoSource == 2);
    for (boolean bool1 = true; ; bool1 = false)
    {
      o.all();
      boolean bool2 = r.ua(com.tencent.mm.modelvideo.t.uh(this.fileName));
      ab.i("MicroMsg.HistoryAdapter", "video clicked, path:%s, isExport:%b, typeQt:%b", new Object[] { this.fileName, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      a.gkE.a(bool1, bool2, c.a(this.ooJ), this.fileName, this.length, this.size);
      AppMethodBeat.o(22785);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.c.c
 * JD-Core Version:    0.6.2
 */