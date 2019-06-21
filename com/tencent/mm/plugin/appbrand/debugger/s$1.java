package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.k.b;
import com.tencent.mm.plugin.appbrand.t.d.d;
import com.tencent.mm.plugin.appbrand.t.d.d.a;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.plugin.appbrand.t.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;

final class s$1 extends com.tencent.mm.plugin.appbrand.t.a.a
{
  private d hkx = null;

  s$1(s params, URI paramURI, com.tencent.mm.plugin.appbrand.t.b.a parama, Map paramMap, k.b paramb)
  {
    super(paramURI, parama, paramMap, 60000);
  }

  public final void N(int paramInt, String paramString)
  {
    AppMethodBeat.i(101898);
    ab.i("MicroMsg.RemoteDebugSocket", "onClose,reason: %s, errCode = %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    if ((paramInt == -1) || (paramInt == -2) || (paramInt == -3))
      if (!at.isConnected(ah.getContext()))
      {
        this.hky.zJ("network is down");
        paramInt = 1006;
        this.hky.K(paramInt, paramString);
        AppMethodBeat.o(101898);
      }
    while (true)
    {
      return;
      this.hky.zJ(paramString);
      break;
      this.hky.K(paramInt, paramString);
      AppMethodBeat.o(101898);
    }
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(101901);
    if ((paramd.aOt() != d.a.iTr) && (!paramd.aOr()))
    {
      this.hkx = paramd;
      AppMethodBeat.o(101901);
    }
    while (true)
    {
      return;
      if (paramd.aOt() != d.a.iTr)
        break label174;
      if (this.hkx == null)
      {
        AppMethodBeat.o(101901);
      }
      else if (this.hkx.aOq().position() > 10485760)
      {
        ab.e("MicroMsg.RemoteDebugSocket", "Pending Frame exploded");
        this.hkx = null;
        AppMethodBeat.o(101901);
      }
      else
      {
        try
        {
          this.hkx.e(paramd);
          if (!paramd.aOr())
            AppMethodBeat.o(101901);
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.RemoteDebugSocket", localException.getMessage());
        }
      }
    }
    if (this.hkx.aOt() == d.a.iTt)
      m(this.hkx.aOq());
    while (true)
    {
      this.hkx = null;
      label174: AppMethodBeat.o(101901);
      break;
      if (this.hkx.aOt() == d.a.iTs)
        try
        {
          zO(bo.nullAsNil(b.B(this.hkx.aOq())));
        }
        catch (Exception paramd)
        {
          ab.e("MicroMsg.RemoteDebugSocket", paramd.getMessage());
        }
    }
  }

  public final void a(h paramh)
  {
    AppMethodBeat.i(101896);
    ab.d("MicroMsg.RemoteDebugSocket", "onSocketOpen");
    this.hky.azg();
    AppMethodBeat.o(101896);
  }

  public final void m(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(101900);
    this.hky.l(paramByteBuffer);
    AppMethodBeat.o(101900);
  }

  public final void onError(Exception paramException)
  {
    AppMethodBeat.i(101899);
    ab.e("MicroMsg.RemoteDebugSocket", "onSocketError, ex: " + paramException.toString());
    AppMethodBeat.o(101899);
  }

  public final void zO(String paramString)
  {
    AppMethodBeat.i(101897);
    this.hkz.hkv.BU(paramString);
    ab.d("MicroMsg.RemoteDebugSocket", "onSocketMessage, message: %s", new Object[] { paramString });
    this.hky.azh();
    AppMethodBeat.o(101897);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.s.1
 * JD-Core Version:    0.6.2
 */