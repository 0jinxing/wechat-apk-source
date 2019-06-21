package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;

public class g extends d
{
  private String kum;

  public g(com.tencent.mm.plugin.choosemsgfile.b.c.g paramg, bi parambi)
  {
    super(paramg, parambi);
  }

  public final void a(View paramView, a parama)
  {
    AppMethodBeat.i(54303);
    b.a(this.kuj.bfy().getContext(), paramView, parama);
    AppMethodBeat.o(54303);
  }

  protected String aan()
  {
    AppMethodBeat.i(54302);
    if (this.kum == null)
    {
      this.kum = o.ahl().c(this.kua.field_imgPath, false, false);
      if ((!bo.isNullOrNil(this.kum)) && (!this.kum.endsWith("hd")) && (e.ct(this.kum + "hd")))
        this.kum += "hd";
    }
    String str = this.kum;
    AppMethodBeat.o(54302);
    return str;
  }

  public final int getType()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.g
 * JD-Core Version:    0.6.2
 */