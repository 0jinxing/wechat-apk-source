package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.plugin.sport.a.c;
import com.tencent.mm.plugin.sport.a.e;
import com.tencent.mm.protocal.protobuf.aom;
import com.tencent.mm.protocal.protobuf.aon;
import com.tencent.mm.protocal.protobuf.cdo;
import com.tencent.mm.sdk.platformtools.ab;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class l$1
  implements f
{
  l$1(l paraml)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(93699);
    if ((paramm instanceof d))
    {
      g.Rg().b(1734, this.rPM.fur);
      paramString = (d)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Object localObject = paramString.rPs;
        Collections.sort(((aon)localObject).wsF, new l.1.1(this));
        paramm = Calendar.getInstance();
        paramm.setTimeInMillis(((cdo)((aon)localObject).wsF.get(0)).timestamp * 1000L);
        paramm.set(10, 0);
        paramm.set(12, 0);
        paramm.set(13, 0);
        long l = paramm.getTimeInMillis();
        ((PluginSport)g.M(PluginSport.class)).getSportStepStorage();
        m.X(paramString.rPr.wdb, paramString.rPr.wdc);
        ab.i("MicroMsg.Sport.SportStepManager", "delete step item after %s", new Object[] { this.rPM.rPL.format(new Date(l)) });
        paramm = new ArrayList();
        Iterator localIterator = ((aon)localObject).wsF.iterator();
        while (localIterator.hasNext())
        {
          cdo localcdo = (cdo)localIterator.next();
          localObject = new e();
          ((e)localObject).field_step = localcdo.hzv;
          ((e)localObject).field_timestamp = (localcdo.timestamp * 1000L);
          ((e)localObject).field_date = this.rPM.rPL.format(new Date(((e)localObject).field_timestamp));
          paramm.add(localObject);
        }
        ((PluginSport)g.M(PluginSport.class)).getSportStepStorage();
        m.dC(paramm);
        if (paramString.cwm() != null)
          paramString.cwm().wL();
        AppMethodBeat.o(93699);
      }
    }
    while (true)
    {
      return;
      if (paramString.cwm() != null)
        paramString.cwm();
      AppMethodBeat.o(93699);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.l.1
 * JD-Core Version:    0.6.2
 */