package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.pluginsdk.g.a.b.e;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.pluginsdk.g.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class d extends n.a<c>
{
  public d(c paramc)
  {
    super(paramc);
  }

  public final m a(com.tencent.mm.pluginsdk.g.a.c.j paramj)
  {
    AppMethodBeat.i(79505);
    c localc = (c)awh();
    String str1 = i.aiX(localc.vdC);
    String str2 = localc.cvZ;
    if ((localc.ufy) && (bo.nullAsNil(g.cz(i.aiX(localc.vdC))).equals(str2)))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "file already cached and valid, send complete status");
      paramj = new m(localc, a.ek(str1));
      AppMethodBeat.o(79505);
    }
    while (true)
    {
      return paramj;
      if ((!bo.cb(((c)awh()).veh)) && (a.D(i.aiX(((c)awh()).vdC), ((c)awh()).veh)) && (bo.nullAsNil(g.cz(i.aiX(((c)awh()).vdC))).equals(((c)awh()).cvZ)))
      {
        paramj = new m((l)awh(), a.ek(i.aiX(((c)awh()).vdC)));
        AppMethodBeat.o(79505);
      }
      else
      {
        paramj = super.a(paramj);
        ab.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: network get over, received response = ".concat(String.valueOf(paramj)), new Object[] { localc.vdC });
        if (paramj == null)
        {
          paramj = new m("CheckResUpdate", dib(), getURL(), getFilePath(), 0L, "", new e());
          AppMethodBeat.o(79505);
        }
        else
        {
          if (paramj.status == 2)
          {
            if ((!bo.isNullOrNil(((c)awh()).cvZ)) && (((c)awh()).cvZ.equals(g.cz(getFilePath()))))
              ab.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file valid, md5 ok", new Object[] { localc.vdC });
          }
          else
          {
            AppMethodBeat.o(79505);
            continue;
          }
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file invalid, md5 not match", new Object[] { localc.vdC });
          paramj = new m("CheckResUpdate", dib(), getURL(), getFilePath(), paramj.aHW, paramj.bqF, new com.tencent.mm.pluginsdk.g.a.b.c());
          AppMethodBeat.o(79505);
        }
      }
    }
  }

  public final String awa()
  {
    return "CheckResUpdate";
  }

  public final boolean awg()
  {
    AppMethodBeat.i(79504);
    boolean bool;
    if (super.awg())
    {
      j.z(((c)awh()).vdK, 12L);
      bool = true;
      AppMethodBeat.o(79504);
    }
    while (true)
    {
      return bool;
      j.z(((c)awh()).vdK, 27L);
      bool = false;
      AppMethodBeat.o(79504);
    }
  }

  public final boolean gh(long paramLong)
  {
    AppMethodBeat.i(79503);
    boolean bool;
    if ((((c)awh()).fileSize > 0L) && (((c)awh()).fileSize != a.ek(getFilePath()) + paramLong))
    {
      bool = false;
      AppMethodBeat.o(79503);
    }
    while (true)
    {
      return bool;
      bool = super.gh(paramLong);
      AppMethodBeat.o(79503);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.d
 * JD-Core Version:    0.6.2
 */