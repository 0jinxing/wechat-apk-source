package com.tencent.mm.plugin.sport;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.a.c;
import com.tencent.mm.plugin.sport.model.a;
import com.tencent.mm.plugin.sport.model.a.3;
import com.tencent.mm.plugin.sport.model.f;
import com.tencent.mm.plugin.sport.model.j;
import com.tencent.mm.plugin.sport.model.l;
import com.tencent.mm.plugin.sport.model.m;
import com.tencent.mm.plugin.sport.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public final class b
  implements com.tencent.mm.plugin.sport.a.b
{
  public final List<com.tencent.mm.plugin.sport.a.e> V(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(93623);
    Object localObject = ((PluginSport)g.M(PluginSport.class)).getSportStepManager();
    ab.i("MicroMsg.Sport.SportStepManager", "getSportItemListByPeriod: begin=%s end=%s", new Object[] { ((l)localObject).rPL.format(new Date(paramLong1)), ((l)localObject).rPL.format(new Date(paramLong2)) });
    ((PluginSport)g.M(PluginSport.class)).getSportStepStorage();
    localObject = m.W(paramLong1, paramLong2);
    AppMethodBeat.o(93623);
    return localObject;
  }

  public final void a(long paramLong1, long paramLong2, c paramc)
  {
    AppMethodBeat.i(93625);
    l locall = ((PluginSport)g.M(PluginSport.class)).getSportStepManager();
    ab.i("MicroMsg.Sport.SportStepManager", "updateSportStepFromServer: begin=%s end=%s", new Object[] { locall.rPL.format(new Date(paramLong1)), locall.rPL.format(new Date(paramLong2)) });
    paramc = new com.tencent.mm.plugin.sport.model.d(paramLong1, paramLong2, paramc);
    g.Rg().a(1734, locall.fur);
    g.Rg().a(paramc, 0);
    AppMethodBeat.o(93625);
  }

  public final void b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    AppMethodBeat.i(93617);
    if (g.RK())
    {
      paramString1 = new f(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, 1);
      g.Rg().a(paramString1, 0);
    }
    AppMethodBeat.o(93617);
  }

  public final void cvX()
  {
    AppMethodBeat.i(93616);
    if (((PluginSport)g.M(PluginSport.class)).getDeviceStepManager() != null)
      ((PluginSport)g.M(PluginSport.class)).getDeviceStepManager().cwd();
    AppMethodBeat.o(93616);
  }

  public final boolean cvY()
  {
    AppMethodBeat.i(93619);
    boolean bool = n.cvY();
    AppMethodBeat.o(93619);
    return bool;
  }

  public final void cvZ()
  {
    AppMethodBeat.i(93620);
    if (ah.bqo())
    {
      ((PluginSport)g.M(PluginSport.class)).getSportFileStorage().reset();
      a locala = ((PluginSport)g.M(PluginSport.class)).getDeviceStepManager();
      com.tencent.mm.sdk.g.d.xDG.b(new a.3(locala), "Sport.clearConfigToPush");
    }
    AppMethodBeat.o(93620);
  }

  public final void cwa()
  {
    AppMethodBeat.i(93622);
    n.cwG();
    AppMethodBeat.o(93622);
  }

  public final com.tencent.mm.plugin.sport.a.e cwb()
  {
    AppMethodBeat.i(93624);
    ((PluginSport)g.M(PluginSport.class)).getSportStepManager();
    ((PluginSport)g.M(PluginSport.class)).getSportStepStorage();
    com.tencent.mm.plugin.sport.a.e locale = m.cwb();
    AppMethodBeat.o(93624);
    return locale;
  }

  public final void cwc()
  {
    AppMethodBeat.i(93626);
    ((PluginSport)g.M(PluginSport.class)).getSportStepManager();
    ab.i("MicroMsg.Sport.SportStepManager", "clearAllSportStep");
    ((PluginSport)g.M(PluginSport.class)).getSportStepStorage();
    m.cwc();
    AppMethodBeat.o(93626);
  }

  public final void d(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(93621);
    al.d(new b.1(this, paramActivity, paramString));
    AppMethodBeat.o(93621);
  }

  public final boolean eU(Context paramContext)
  {
    AppMethodBeat.i(93618);
    boolean bool = n.eU(paramContext);
    AppMethodBeat.o(93618);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.b
 * JD-Core Version:    0.6.2
 */