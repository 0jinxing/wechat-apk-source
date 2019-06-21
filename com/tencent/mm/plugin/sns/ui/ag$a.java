package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.sdk.g.b.a;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

final class ag$a extends com.tencent.mm.plugin.sns.model.h<String, Integer, Boolean>
{
  private ProgressDialog ehJ;
  private ax rkO;
  private List<com.tencent.mm.plugin.sns.data.h> rlX;

  public ag$a(ax paramax, List<com.tencent.mm.plugin.sns.data.h> paramList)
  {
    AppMethodBeat.i(38484);
    this.ehJ = null;
    this.rkO = paramList;
    Object localObject;
    this.rlX = localObject;
    paramList = paramax.crP;
    paramax.crP.getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(paramList, paramax.crP.getString(2131296966), false, new ag.a.1(this, paramax));
    AppMethodBeat.o(38484);
  }

  public final a cin()
  {
    AppMethodBeat.i(38485);
    a locala = af.cns();
    AppMethodBeat.o(38485);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag.a
 * JD-Core Version:    0.6.2
 */