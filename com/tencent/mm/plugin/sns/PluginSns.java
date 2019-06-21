package com.tencent.mm.plugin.sns;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragment;

public class PluginSns extends f
  implements com.tencent.mm.plugin.sns.b.b
{
  l qCd;
  a qCe;
  o qCf;
  com.tencent.mm.plugin.sns.a.a qCg;

  public PluginSns()
  {
    AppMethodBeat.i(35613);
    this.qCd = new l();
    this.qCe = new a();
    this.qCf = new o();
    this.qCg = new com.tencent.mm.plugin.sns.a.a();
    AppMethodBeat.o(35613);
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(35615);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.a(i.class, this.qCd);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.sns.b.c.class, this.qCg);
    com.tencent.mm.plugin.sns.a.a locala = this.qCg;
    locala.a(new com.tencent.mm.plugin.sns.a.a.e());
    locala.a(new com.tencent.mm.plugin.sns.a.a.d());
    locala.a(new com.tencent.mm.plugin.sns.a.a.b());
    locala.a(new com.tencent.mm.plugin.sns.a.a.c());
    if (paramg.SG())
    {
      ab.i("MicroMsg.PluginSns", "PluginSns configure");
      pin(new q(af.class));
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.sns.b.a.class, this.qCe);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.a(m.class, this.qCf);
    }
    AppMethodBeat.o(35615);
  }

  public void dependency()
  {
    AppMethodBeat.i(35614);
    dependsOn(com.tencent.mm.plugin.emoji.b.d.class);
    dependsOn(com.tencent.mm.plugin.normsg.a.class);
    AppMethodBeat.o(35614);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(35616);
    com.tencent.mm.bp.c.aks("sns");
    AppMethodBeat.o(35616);
  }

  public String getAccSnsPath()
  {
    AppMethodBeat.i(35617);
    String str = com.tencent.mm.kernel.g.RP().eJM + "sns/";
    AppMethodBeat.o(35617);
    return str;
  }

  public String getAccSnsTmpPath()
  {
    AppMethodBeat.i(35618);
    String str = com.tencent.mm.kernel.g.RP().eJM + "sns/temp/";
    AppMethodBeat.o(35618);
    return str;
  }

  public MMFragment instantiateAlbumFragment(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(35619);
    paramContext = (MMFragment)Fragment.instantiate(paramContext, SnsAlbumUI.class.getName(), paramBundle);
    AppMethodBeat.o(35619);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.PluginSns
 * JD-Core Version:    0.6.2
 */