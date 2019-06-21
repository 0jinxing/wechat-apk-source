package com.tencent.mm.plugin.selectcontact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.selectcontact.a.a;
import com.tencent.mm.ui.contact.s;

public class PluginSelectContact extends f
  implements com.tencent.mm.kernel.api.bucket.c, a
{
  private com.tencent.mm.sdk.b.c qjs;

  public PluginSelectContact()
  {
    AppMethodBeat.i(105152);
    this.qjs = new PluginSelectContact.1(this);
    AppMethodBeat.o(105152);
  }

  public void configure(g paramg)
  {
    AppMethodBeat.i(105154);
    paramg.SG();
    AppMethodBeat.o(105154);
  }

  public void dependency()
  {
  }

  public void execute(g paramg)
  {
    AppMethodBeat.i(105155);
    paramg.SG();
    AppMethodBeat.o(105155);
  }

  public void installed()
  {
    AppMethodBeat.i(105153);
    alias(PluginSelectContact.class);
    AppMethodBeat.o(105153);
  }

  public String name()
  {
    return "plugin-selectcontact";
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(105156);
    s.init();
    this.qjs.dnU();
    AppMethodBeat.o(105156);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(105157);
    this.qjs.dead();
    AppMethodBeat.o(105157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.selectcontact.PluginSelectContact
 * JD-Core Version:    0.6.2
 */