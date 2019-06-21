package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelmulti.o.c;
import com.tencent.mm.modelmulti.p;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.messenger.foundation.a.r.a;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import com.tencent.mm.plugin.messenger.foundation.a.u;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.io.IOException;

public final class f
  implements com.tencent.mm.plugin.zero.a.f
{
  private t oqx;

  public final void a(tb paramtb, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(1062);
    r localr = r.a.yv(paramtb.wat);
    if (localr != null);
    while (true)
    {
      try
      {
        localr.a(paramtb, paramArrayOfByte, paramBoolean, this.oqx);
        AppMethodBeat.o(1062);
        return;
      }
      catch (IOException paramtb)
      {
        ab.e("MicroMsg.SyncDoCmdExtensions", "docmd: parse protobuf error, " + paramtb.getMessage());
        paramtb = new RuntimeException("docmd: parse protobuf error");
        AppMethodBeat.o(1062);
        throw paramtb;
      }
      ab.w("MicroMsg.SyncDoCmdExtensions", "SyncDoCmdExtension for cmd id [%s] is null.", new Object[] { Integer.valueOf(paramtb.wat) });
      AppMethodBeat.o(1062);
    }
  }

  public final void ca(Object paramObject)
  {
    AppMethodBeat.i(1061);
    c localc = u.bOt();
    if (localc != null)
      this.oqx = ((t)localc.get());
    if (this.oqx == null)
      this.oqx = new f.a((byte)0);
    if ((paramObject instanceof com.tencent.mm.modelmulti.j))
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().QW(((com.tencent.mm.modelmulti.j)paramObject).TAG);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)g.K(com.tencent.mm.plugin.messenger.foundation.a.h.class)).Pl();
      AppMethodBeat.o(1061);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof String))
      {
        if (paramObject.equals("NetSceneInit"))
        {
          ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().QW((String)paramObject);
          ((com.tencent.mm.plugin.messenger.foundation.a.h)g.K(com.tencent.mm.plugin.messenger.foundation.a.h.class)).Pl();
          AppMethodBeat.o(1061);
        }
      }
      else
      {
        if ((paramObject instanceof o.c))
        {
          ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().QW(paramObject.toString());
          ((com.tencent.mm.plugin.messenger.foundation.a.h)g.K(com.tencent.mm.plugin.messenger.foundation.a.h.class)).Pl();
        }
        AppMethodBeat.o(1061);
      }
    }
  }

  public final void cc(Object paramObject)
  {
    AppMethodBeat.i(1063);
    if ((paramObject instanceof com.tencent.mm.modelmulti.j))
    {
      this.oqx.bOs();
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().QX(((com.tencent.mm.modelmulti.j)paramObject).TAG);
      al localal = g.RS();
      String str = ((com.tencent.mm.modelmulti.j)paramObject).TAG;
      p localp = ((com.tencent.mm.modelmulti.j)paramObject).fIx;
      paramObject = (com.tencent.mm.modelmulti.j)paramObject;
      if ((paramObject.fIF == null) || (paramObject.fIF.vyH.vTR == null))
      {
        paramObject = null;
        localal.aa(new f.b(str, localp, paramObject));
        ((com.tencent.mm.plugin.messenger.foundation.a.h)g.K(com.tencent.mm.plugin.messenger.foundation.a.h.class)).Pm();
        AppMethodBeat.o(1063);
      }
    }
    while (true)
    {
      return;
      paramObject = paramObject.fIF.vyH.vTR.jBw;
      break;
      if (((paramObject instanceof String)) && (paramObject.equals("NetSceneInit")))
      {
        this.oqx.bOs();
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().QX((String)paramObject);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)g.K(com.tencent.mm.plugin.messenger.foundation.a.h.class)).Pm();
        AppMethodBeat.o(1063);
      }
      else
      {
        if ((paramObject instanceof o.c))
        {
          this.oqx.bOs();
          ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().QX(paramObject.toString());
          ((com.tencent.mm.plugin.messenger.foundation.a.h)g.K(com.tencent.mm.plugin.messenger.foundation.a.h.class)).Pm();
        }
        AppMethodBeat.o(1063);
      }
    }
  }

  public final void cd(Object paramObject)
  {
    AppMethodBeat.i(1064);
    if ((paramObject instanceof com.tencent.mm.modelmulti.j))
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().QX(((com.tencent.mm.modelmulti.j)paramObject).TAG);
    AppMethodBeat.o(1064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.f
 * JD-Core Version:    0.6.2
 */