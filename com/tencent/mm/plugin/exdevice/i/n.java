package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.service.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import junit.framework.Assert;

public final class n extends o.a
{
  private c lxu;

  public n(c paramc)
  {
    AppMethodBeat.i(19754);
    this.lxu = null;
    Assert.assertNotNull(paramc);
    this.lxu = paramc;
    AppMethodBeat.o(19754);
  }

  public final long bpp()
  {
    AppMethodBeat.i(19755);
    ab.i("MicroMsg.exdevice.RemoteExDeviceTaskRequest", "getDeviceId : " + this.lxu.jJa);
    long l = this.lxu.jJa;
    AppMethodBeat.o(19755);
    return l;
  }

  public final byte[] bpq()
  {
    AppMethodBeat.i(19756);
    byte[] arrayOfByte = this.lxu.bot();
    AppMethodBeat.o(19756);
    return arrayOfByte;
  }

  public final int bpr()
  {
    AppMethodBeat.i(19757);
    int i = this.lxu.bor();
    AppMethodBeat.o(19757);
    return i;
  }

  public final int bps()
  {
    return this.lxu.lqB;
  }

  public final int bpt()
  {
    AppMethodBeat.i(19758);
    int i = this.lxu.bos();
    AppMethodBeat.o(19758);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.n
 * JD-Core Version:    0.6.2
 */