package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class a$2
  implements View.OnLongClickListener
{
  private Context context;
  private g mgf;
  private b pKV;
  private aar pKW;
  private String path;

  a$2(a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(24339);
    if (paramView != null)
    {
      this.context = paramView.getContext();
      this.pKV = ((b)paramView.getTag());
      this.mgf = this.pKV.mnW;
      this.pKW = this.pKV.cAv;
    }
    paramView = new gh();
    paramView.cAH.type = 2;
    paramView.cAH.cAJ = this.pKV.cAv;
    com.tencent.mm.sdk.b.a.xxA.m(paramView);
    this.path = paramView.cAI.path;
    if (!e.ct(this.path))
    {
      ab.w("MicroMsg.ImageViewWrapper", "file not exists");
      AppMethodBeat.o(24339);
    }
    while (true)
    {
      return true;
      if (this.pKU.hPs == null)
        this.pKU.hPs = new j(this.context);
      this.pKU.hPs.rBl = new a.2.1(this);
      this.pKU.hPs.rBm = new a.2.2(this);
      this.pKU.hPs.cuu();
      AppMethodBeat.o(24339);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.a.2
 * JD-Core Version:    0.6.2
 */