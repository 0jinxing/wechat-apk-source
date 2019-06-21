package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.choosemsgfile.b.c.g;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class h extends d
{
  private String kum;
  private String kuw;

  public h(g paramg, bi parambi)
  {
    super(paramg, parambi);
  }

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(54306);
    b.a(this.kuj.bfy().getContext(), paramView, parama);
    AppMethodBeat.o(54306);
  }

  public final void a(m paramm, int paramInt)
  {
    AppMethodBeat.i(54305);
    super.a(paramm, paramInt);
    paramm.kuK.setVisibility(0);
    paramm.kuL.setVisibility(0);
    paramm = paramm.kuL;
    if (this.kuw == null)
      this.kuw = bo.mK(u.ut(this.kua.field_imgPath).fXd);
    paramm.setText(bo.bc(this.kuw, ""));
    AppMethodBeat.o(54305);
  }

  protected final String aan()
  {
    AppMethodBeat.i(54304);
    if (this.kum == null)
    {
      o.all();
      this.kum = t.ui(this.kua.field_imgPath);
    }
    String str = this.kum;
    AppMethodBeat.o(54304);
    return str;
  }

  public final int getType()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.h
 * JD-Core Version:    0.6.2
 */