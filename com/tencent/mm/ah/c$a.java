package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;

final class c$a
  implements az.a
{
  h fro;
  byte[] frp;
  boolean frq;
  byte[] frr;

  public c$a(c paramc, h paramh, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.fro = paramh;
    this.frp = paramArrayOfByte;
    this.frq = paramBoolean;
  }

  public final boolean acf()
  {
    AppMethodBeat.i(77854);
    byte[] arrayOfByte;
    boolean bool;
    if (this.frq)
    {
      ab.i("MicroMsg.AvatarService", "DecryptAvatar: decrypt");
      com.tencent.mm.plugin.report.service.h.pYm.k(138L, 51L, 1L);
      arrayOfByte = UtilsJni.DecryptAvatar(this.frp);
      if (bo.cb(arrayOfByte))
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(138L, 52L, 1L);
        ab.i("MicroMsg.AvatarService", "DecryptAvatar: decrypt output empty");
        AppMethodBeat.o(77854);
        bool = false;
        return bool;
      }
    }
    else
    {
      arrayOfByte = this.frp;
    }
    while (true)
    {
      if (r.bU(arrayOfByte))
      {
        ab.i("MicroMsg.AvatarService", "DecryptAvatar: hevc to pic");
        com.tencent.mm.plugin.report.service.h.pYm.k(138L, 53L, 1L);
        this.frr = ((com.tencent.mm.plugin.emoji.b.c)g.K(com.tencent.mm.plugin.emoji.b.c.class)).aE(arrayOfByte);
        if (!bo.cb(this.frr))
          break label171;
        com.tencent.mm.plugin.report.service.h.pYm.k(138L, 54L, 1L);
        ab.i("MicroMsg.AvatarService", "DecryptAvatar: output is empty");
        AppMethodBeat.o(77854);
        bool = false;
        break;
      }
      this.frr = arrayOfByte;
      label171: bool = true;
      AppMethodBeat.o(77854);
      break;
    }
  }

  public final boolean acg()
  {
    boolean bool = true;
    AppMethodBeat.i(77855);
    if (!bo.cb(this.frr))
    {
      ab.i("MicroMsg.AvatarService", "DecryptAvatar: post to save length is %s", new Object[] { Integer.valueOf(this.frr.length) });
      this.frl.a(new c.e(this.frl, this.fro, this.frr));
      AppMethodBeat.o(77855);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.AvatarService", "DecryptAvatar: onPostExecute output is empty");
      AppMethodBeat.o(77855);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.c.a
 * JD-Core Version:    0.6.2
 */