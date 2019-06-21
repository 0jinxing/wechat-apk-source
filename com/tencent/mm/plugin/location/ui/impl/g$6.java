package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.location.ui.i.a;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.protocal.protobuf.bku;
import com.tencent.mm.protocal.protobuf.cmj;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class g$6
  implements i.a
{
  g$6(g paramg)
  {
  }

  public final void PX(String paramString)
  {
    AppMethodBeat.i(113675);
    Object localObject = (TrackPoint)this.nQT.nOL.nLY.getViewByItag(paramString);
    if (localObject != null)
    {
      ((TrackPoint)localObject).set2Top();
      this.nQT.nOL.nLY.invalidate();
      localObject = this.nQT.nQG;
      if (bo.isNullOrNil(paramString))
        break label234;
      if ((((m)localObject).nKI == null) || (!paramString.equals(((m)localObject).nKI.vHl)))
        break label150;
      paramString = new com.tencent.mm.plugin.location.model.d(((m)localObject).nKI.xkm.vNH, ((m)localObject).nKI.xkm.vNI);
    }
    while (true)
    {
      if (paramString != null)
        this.nQT.nOL.nLY.getIController().animateTo(paramString.nJu, paramString.nJv);
      AppMethodBeat.o(113675);
      return;
      label150: if ((((m)localObject).nNM != null) && (((m)localObject).nNM.size() > 0))
      {
        Iterator localIterator = ((m)localObject).nNM.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            localObject = (cmj)localIterator.next();
            if (((cmj)localObject).vHl.equals(paramString))
            {
              paramString = new com.tencent.mm.plugin.location.model.d(((cmj)localObject).xkm.vNH, ((cmj)localObject).xkm.vNI);
              break;
            }
          }
      }
      label234: paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.g.6
 * JD-Core Version:    0.6.2
 */