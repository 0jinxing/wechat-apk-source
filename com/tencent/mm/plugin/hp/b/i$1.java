package com.tencent.mm.plugin.hp.b;

import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ij;
import com.tencent.mm.protocal.b.a.b;
import java.util.LinkedList;

final class i$1
  implements Runnable
{
  i$1(String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90614);
    ij localij = new ij();
    b localb = new b();
    localb.title = this.chV;
    localb.bzH = this.ntN;
    localb.vzI = new LinkedList();
    com.tencent.mm.protocal.b.a.a locala = new com.tencent.mm.protocal.b.a.a();
    locala.vzG = this.ntO;
    localb.vzI.add(locala);
    locala = new com.tencent.mm.protocal.b.a.a();
    locala.vzG = this.ntP;
    localb.vzI.add(locala);
    localij.cDv.type = 1;
    localij.cDv.cDw = localb;
    localij.cDv.cDx = this.ntQ;
    localij.cDv.cDy = this.ntR;
    com.tencent.mm.sdk.b.a.xxA.m(localij);
    AppMethodBeat.o(90614);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.i.1
 * JD-Core Version:    0.6.2
 */