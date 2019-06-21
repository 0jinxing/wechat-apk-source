package com.tencent.mm.plugin.brandservice;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;

public class PluginBrandService extends f
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.brandservice.a.c
{
  private h.a jKo;
  private r.c jKp;

  public PluginBrandService()
  {
    AppMethodBeat.i(13807);
    this.jKo = new PluginBrandService.3(this);
    this.jKp = new PluginBrandService.4(this);
    AppMethodBeat.o(13807);
  }

  private void addBrandServiceEvent()
  {
    AppMethodBeat.i(13813);
    com.tencent.mm.sdk.b.a.xxA.c(new PluginBrandService.1(this));
    AppMethodBeat.o(13813);
  }

  private void addPlaceTopChangeListener()
  {
    AppMethodBeat.i(13814);
    com.tencent.mm.sdk.b.a.xxA.b(new PluginBrandService.2(this));
    AppMethodBeat.o(13814);
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(13809);
    addBrandServiceEvent();
    addPlaceTopChangeListener();
    if (paramg.SG())
      pin(new q(d.class));
    AppMethodBeat.o(13809);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(13810);
    com.tencent.mm.bp.c.aks("brandservice");
    if ((paramg.SG()) || (paramg.lQ(":tools")) || (paramg.lQ(":toolsmp")))
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.brandservice.a.b.class, new c());
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.g.axy();
    paramg = a.jKf;
    com.tencent.mm.pluginsdk.cmd.b.a((com.tencent.mm.pluginsdk.cmd.a)new a(), new String[] { a.aVN() });
    AppMethodBeat.o(13810);
  }

  public void installed()
  {
    AppMethodBeat.i(13808);
    alias(com.tencent.mm.plugin.brandservice.a.c.class);
    AppMethodBeat.o(13808);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(13811);
    ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.jKo, Looper.getMainLooper());
    com.tencent.mm.aj.z.aeX().a(this.jKp, Looper.getMainLooper());
    com.tencent.mm.aj.z.aeY().a(this.jKp, Looper.getMainLooper());
    if (s.aVO())
    {
      new com.tencent.mm.plugin.brandservice.ui.timeline.c();
      ab.i("MicroMsg.BizTimeLineMigrateImp", "migrateMainCell");
      int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVm, Integer.valueOf(0))).intValue();
      if ((i & 0x1) == 0)
      {
        ((j)com.tencent.mm.kernel.g.K(j.class)).XR().apb("officialaccounts");
        com.tencent.mm.aj.z.aeX().drK();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVm, Integer.valueOf(i | 0x1));
      }
    }
    AppMethodBeat.o(13811);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(13812);
    ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(this.jKo);
    com.tencent.mm.aj.z.aeX().a(this.jKp);
    com.tencent.mm.aj.z.aeY().a(this.jKp);
    AppMethodBeat.o(13812);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.PluginBrandService
 * JD-Core Version:    0.6.2
 */