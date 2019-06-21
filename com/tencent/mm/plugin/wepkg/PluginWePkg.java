package com.tencent.mm.plugin.wepkg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wepkg.downloader.i;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public class PluginWePkg extends f
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.wepkg.a.a
{
  private com.tencent.mm.plugin.wepkg.utils.c uVp;

  public void configure(g paramg)
  {
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(63347);
    if (paramg.SG())
      com.tencent.mm.plugin.game.commlib.c.a.a(new PluginWePkg.1(this));
    if (paramg.lQ(":tools"));
    while (true)
    {
      try
      {
        b.biO();
        AppMethodBeat.o(63347);
        return;
      }
      catch (Exception paramg)
      {
        ab.printErrStackTrace("MicroMsg.WePkg.PluginWePkg", paramg, "", new Object[0]);
        h.pYm.a(859L, 19L, 1L, false);
      }
      AppMethodBeat.o(63347);
    }
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(63348);
    if (this.uVp == null)
      this.uVp = new com.tencent.mm.plugin.wepkg.utils.c();
    paramc = this.uVp;
    ab.i("MicroMsg.Wepkg.WepkgListener", "wepkg start listen");
    com.tencent.mm.sdk.b.a.xxA.c(paramc.uXX);
    com.tencent.mm.sdk.b.a.xxA.c(paramc.uXW);
    i.bie();
    paramc = ah.getContext();
    if (paramc != null);
    while (true)
    {
      try
      {
        paramc = paramc.getSharedPreferences("we_pkg_sp", 4);
        if (paramc == null)
        {
          ab.e("MicroMsg.Wepkg.WepkgListener", "sp is null");
          AppMethodBeat.o(63348);
          return;
        }
        if (paramc.getBoolean("disable_we_pkg", false))
        {
          ab.i("MicroMsg.Wepkg.WepkgListener", "enable wepkg");
          paramc.edit().putBoolean("disable_we_pkg", false).commit();
        }
        paramc.edit().putInt("white_screen_times", 0).commit();
        AppMethodBeat.o(63348);
        continue;
      }
      catch (Exception paramc)
      {
        ab.e("MicroMsg.Wepkg.WepkgListener", paramc.getMessage());
      }
      AppMethodBeat.o(63348);
    }
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(63349);
    com.tencent.mm.plugin.wepkg.utils.c localc = this.uVp;
    ab.i("MicroMsg.Wepkg.WepkgListener", "wepkg stop listen");
    com.tencent.mm.sdk.b.a.xxA.d(localc.uXX);
    com.tencent.mm.sdk.b.a.xxA.d(localc.uXW);
    i.bgr();
    d.aNR();
    this.uVp = null;
    AppMethodBeat.o(63349);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.PluginWePkg
 * JD-Core Version:    0.6.2
 */