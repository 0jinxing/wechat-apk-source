package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.menu.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;

public class o
{
  u hTn;
  d irC;
  List<n> irD;
  String mAppId;

  public o(u paramu, List<n> paramList)
  {
    AppMethodBeat.i(87073);
    this.mAppId = paramu.getAppId();
    this.hTn = paramu;
    this.irD = paramList;
    paramu = new d(paramu.mContext);
    this.irC = paramu;
    a(paramu);
    AppMethodBeat.o(87073);
  }

  protected void a(d paramd)
  {
    AppMethodBeat.i(87076);
    paramd = this.hTn.aBl();
    if (paramd != null)
      this.irC.F(paramd, false);
    this.irC.rBl = new o.1(this);
    this.irC.rBm = new o.2(this);
    if (this.hTn.isO)
    {
      paramd = this.irC;
      int i = Color.parseColor("#000000");
      if (paramd.iym != null)
        paramd.iym.setBackgroundColor(i);
      paramd.zQj = Boolean.valueOf(ah.Nw(i));
      if ((paramd.zQj.booleanValue()) && (paramd.zQr != null))
        paramd.zQr.setImageDrawable(paramd.mContext.getResources().getDrawable(2131689917));
    }
    AppMethodBeat.o(87076);
  }

  protected final boolean aJm()
  {
    boolean bool = true;
    AppMethodBeat.i(87074);
    try
    {
      this.irC.cpD();
      AppMethodBeat.o(87074);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandPageActionSheet", "show exception = %s", new Object[] { localException });
        AppMethodBeat.o(87074);
        bool = false;
      }
    }
  }

  protected final boolean aJn()
  {
    boolean bool = true;
    AppMethodBeat.i(87075);
    try
    {
      this.irC.cpE();
      AppMethodBeat.o(87075);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandPageActionSheet", "hide exception = %s", new Object[] { localException });
        AppMethodBeat.o(87075);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.o
 * JD-Core Version:    0.6.2
 */