package com.tencent.mm.plugin.cloudvoip.cloudvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.a.a;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j;
import com.tencent.mm.sdk.platformtools.ab;

public class PluginCloudVoice extends f
  implements c, a
{
  private static final String[] kyY = { "confService", "marsbridgenetwork", "marsbridgexlog" };

  public void configure(g paramg)
  {
    AppMethodBeat.i(135464);
    super.configure(paramg);
    ab.i("MicroMsg.OpenVoice.PluginCloudVoice", "hy: PluginCloudVoice configure");
    AppMethodBeat.o(135464);
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(135463);
    ab.i("MicroMsg.OpenVoice.PluginCloudVoice", "hy: PluginCloudVoice execute");
    AppMethodBeat.o(135463);
  }

  public void onAccountInitialized(e.c paramc)
  {
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(135465);
    ab.i("MicroMsg.OpenVoice.PluginCloudVoice", "hy: account release. uninit openvoice so");
    j localj = j.kzW;
    localj.R(localj.kAy);
    AppMethodBeat.o(135465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.PluginCloudVoice
 * JD-Core Version:    0.6.2
 */