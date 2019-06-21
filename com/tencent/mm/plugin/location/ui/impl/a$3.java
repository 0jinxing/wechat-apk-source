package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.ui.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class a$3
  implements c.a
{
  a$3(a parama)
  {
  }

  public final void b(Addr paramAddr)
  {
    AppMethodBeat.i(113591);
    ab.d("MicroMsg.BaseMapUI", "onGetAddrss  %s", new Object[] { paramAddr.toString() });
    this.nOW.nOH = paramAddr;
    String str = paramAddr.agv();
    this.nOW.nOK.cIK = this.nOW.activity.getResources().getString(2131300970);
    if ((paramAddr.tag != null) && (paramAddr.tag.equals(this.nOW.nOK.nJt)))
      this.nOW.nOK.nJx = str;
    while (true)
    {
      if ((paramAddr.tag != null) && (this.nOW.nON.containsKey(paramAddr.tag)))
      {
        paramAddr = (c)this.nOW.nON.get(paramAddr.tag);
        paramAddr.setText(paramAddr.getPreText() + str);
      }
      AppMethodBeat.o(113591);
      return;
      if (!bo.isNullOrNil(paramAddr.fBg))
        this.nOW.nOL.nOY.setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.a.3
 * JD-Core Version:    0.6.2
 */