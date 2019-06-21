package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.protocal.protobuf.aus;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
{
  public int ulO;
  public int ulP;
  public int ulQ;
  public final List<axc> ulR;
  public int ulS;
  public long ulT;

  private f()
  {
    AppMethodBeat.i(6580);
    this.ulO = 20480;
    this.ulP = 30720;
    this.ulQ = 51200;
    this.ulR = new LinkedList();
    this.ulS = 0;
    this.ulT = 0L;
    AppMethodBeat.o(6580);
  }

  public static void ea(List<aus> paramList)
  {
    AppMethodBeat.i(6581);
    if (bo.ek(paramList))
      AppMethodBeat.o(6581);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        aus localaus = (aus)localIterator.next();
        paramList = g.cYH();
        int i = localaus.wyT;
        long l1 = bo.anT();
        long l2 = localaus.wyU;
        paramList.ulM.A(Integer.valueOf(i), Long.valueOf(l1 + l2));
      }
      g.cYH().cXu();
      AppMethodBeat.o(6581);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.f
 * JD-Core Version:    0.6.2
 */