package com.tencent.mm.ah;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;

final class c$e
  implements az.a
{
  Bitmap bitmap = null;
  byte[] buf;
  h fro = null;

  public c$e(c paramc, h paramh, byte[] paramArrayOfByte)
  {
    this.fro = paramh;
    this.buf = paramArrayOfByte;
  }

  public final boolean acf()
  {
    boolean bool = true;
    AppMethodBeat.i(77860);
    if ((this.fro == null) || (bo.isNullOrNil(this.fro.getUsername())))
    {
      ab.e("MicroMsg.AvatarService", "SaveAvatar imgFlag info is null");
      com.tencent.mm.plugin.report.service.h.pYm.a(138L, 13L, 1L, true);
      bool = false;
      AppMethodBeat.o(77860);
    }
    while (true)
    {
      return bool;
      if (c.acd() != null)
      {
        this.bitmap = d.m(this.fro.getUsername(), this.buf);
        if (this.bitmap == null)
          com.tencent.mm.plugin.report.service.h.pYm.a(138L, 14L, 1L, true);
      }
      i locali = c.ace();
      if (locali != null)
      {
        this.fro.bJt = -1;
        this.fro.acm();
        locali.b(this.fro);
      }
      AppMethodBeat.o(77860);
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(77861);
    if (bo.isNullOrNil(this.fro.getUsername()))
      AppMethodBeat.o(77861);
    while (true)
    {
      return false;
      d locald = c.acd();
      if ((locald != null) && (this.bitmap != null))
        locald.e(this.fro.getUsername(), this.bitmap);
      this.frl.frd.remove(this.fro.getUsername());
      AppMethodBeat.o(77861);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.c.e
 * JD-Core Version:    0.6.2
 */