package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.c.g;
import com.tencent.mm.plugin.choosemsgfile.b.d.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public class f extends d
{
  private j.b kul;
  public String kuu;
  private String kuv;

  public f(g paramg, bi parambi, String paramString)
  {
    super(paramg, parambi);
    this.kuu = paramString;
  }

  private j.b bfv()
  {
    AppMethodBeat.i(54295);
    if (this.kul == null)
      this.kul = j.b.me(this.kua.field_content);
    j.b localb = this.kul;
    AppMethodBeat.o(54295);
    return localb;
  }

  public void a(View paramView, a parama)
  {
    AppMethodBeat.i(54300);
    if ((!bfn().gZ(this.kua.field_msgId)) && (!kq()))
      if (isEnable())
      {
        b.f(getContext(), this.kua.field_msgId);
        AppMethodBeat.o(54300);
      }
    while (true)
    {
      return;
      b.I(getContext(), bfn().mMaxCount);
      AppMethodBeat.o(54300);
    }
  }

  public final void a(m paramm, int paramInt)
  {
    AppMethodBeat.i(54299);
    super.a(paramm, paramInt);
    paramm.kuI.setVisibility(0);
    paramm.kuI.setText(getFileName());
    paramm.kuJ.setVisibility(0);
    paramm.kuJ.setText(bo.ga(bfp()));
    paramm = paramm.kuG;
    if (this.kuv == null)
      this.kuv = b.HL(bfo());
    paramm.setBackgroundColor(Color.parseColor(this.kuv));
    AppMethodBeat.o(54299);
  }

  public String bfo()
  {
    AppMethodBeat.i(54296);
    String str;
    if (bfv() != null)
    {
      str = bfv().fgp;
      AppMethodBeat.o(54296);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(54296);
    }
  }

  public int bfp()
  {
    AppMethodBeat.i(54298);
    int i;
    if (bfv() != null)
    {
      i = bfv().fgo;
      AppMethodBeat.o(54298);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(54298);
    }
  }

  public String getFileName()
  {
    AppMethodBeat.i(54297);
    String str;
    if (bfv() != null)
    {
      str = bfv().title;
      AppMethodBeat.o(54297);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(54297);
    }
  }

  public int getType()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.f
 * JD-Core Version:    0.6.2
 */