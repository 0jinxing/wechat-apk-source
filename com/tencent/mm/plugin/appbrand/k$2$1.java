package com.tencent.mm.plugin.appbrand;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.c;
import java.util.HashMap;
import java.util.LinkedList;

final class k$2$1
  implements Runnable
{
  k$2$1(k.2 param2, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86711);
    this.gOL.gOI.gNE.setVisibility(8);
    this.gOL.gOH.gOB.remove(this.gOL.gOI);
    this.gOL.gOH.gOC.put(this.gOL.gOI.mAppId, this.gOL.gOI);
    if (this.gOK != null)
    {
      this.gOL.gOH.i(this.gOK);
      this.gOL.gOH.h(this.gOK);
    }
    this.gOL.gOI.atk();
    if ((this.gOL.gOH.gOF) && (this.gOK != null))
      this.gOK.atl();
    String str1 = this.gOL.gOI.mAppId;
    if (this.gOK == null);
    for (String str2 = "null"; ; str2 = this.gOK.mAppId)
    {
      d.i("MicroMsg.AppBrandRuntimeContainer", "close run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", new Object[] { str1, str2, Boolean.valueOf(this.gOL.gOH.gOF) });
      AppMethodBeat.o(86711);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.2.1
 * JD-Core Version:    0.6.2
 */