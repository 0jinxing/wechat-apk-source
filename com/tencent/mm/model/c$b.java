package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$b
  implements Runnable
{
  String cKf;
  String fkn;

  public c$b(String paramString1, String paramString2)
  {
    this.cKf = paramString1;
    this.fkn = paramString2;
  }

  public final void run()
  {
    AppMethodBeat.i(16204);
    if ((bo.isNullOrNil(this.cKf)) || (bo.isNullOrNil(this.fkn)))
      AppMethodBeat.o(16204);
    while (true)
    {
      return;
      ab.d("MicroMsg.AccountStorage", "MoveDataFiles :" + this.cKf + " to :" + this.fkn);
      if (!f.Mn())
      {
        AppMethodBeat.o(16204);
      }
      else if (!this.fkn.substring(0, com.tencent.mm.compatible.util.e.eSn.length()).equals(com.tencent.mm.compatible.util.e.eSn))
      {
        AppMethodBeat.o(16204);
      }
      else
      {
        com.tencent.mm.vfs.e.it(this.cKf + "image/", this.fkn + "image/");
        com.tencent.mm.vfs.e.it(this.cKf + "image2/", this.fkn + "image2/");
        com.tencent.mm.vfs.e.it(this.cKf + "video/", this.fkn + "video/");
        com.tencent.mm.vfs.e.it(this.cKf + "voice/", this.fkn + "voice/");
        com.tencent.mm.vfs.e.it(this.cKf + "voice2/", this.fkn + "voice2/");
        com.tencent.mm.vfs.e.it(this.cKf + "package/", this.fkn + "package/");
        com.tencent.mm.vfs.e.it(this.cKf + "emoji/", this.fkn + "emoji/");
        com.tencent.mm.vfs.e.it(this.cKf + "mailapp/", this.fkn + "mailapp/");
        com.tencent.mm.vfs.e.it(this.cKf + "brandicon/", this.fkn + "brandicon/");
        AppMethodBeat.o(16204);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.b
 * JD-Core Version:    0.6.2
 */