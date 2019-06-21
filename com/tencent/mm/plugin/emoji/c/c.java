package com.tencent.mm.plugin.emoji.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bh;
import com.tencent.mm.g.a.bh.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;

public final class c extends com.tencent.mm.sdk.b.c<bh>
{
  public c()
  {
    AppMethodBeat.i(52815);
    this.xxI = bh.class.getName().hashCode();
    AppMethodBeat.o(52815);
  }

  private static boolean a(bh parambh)
  {
    AppMethodBeat.i(52816);
    com.tencent.mm.plugin.emoji.e.j localj;
    if (parambh.cuB.cut == 37)
      if ((parambh.cuB.cuu == 5) && (parambh.cuB.cuy == 2))
      {
        localj = com.tencent.mm.plugin.emoji.e.j.bkb();
        ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "delete emoji egg!");
      }
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      com.tencent.mm.vfs.e.deleteFile(g.RP().cachePath + "eggingfo.ini");
      localObject = new com/tencent/mm/vfs/b;
      ((b)localObject).<init>(com.tencent.mm.plugin.emoji.e.j.getDataEmojiPath(), com.tencent.mm.plugin.emoji.e.j.kUd);
      com.tencent.mm.vfs.e.N(com.tencent.mm.vfs.j.w(((b)localObject).mUri), true);
      localj.kUu = null;
      if (parambh.cuB.cuy == 0)
        ab.i("MicroMsg.emoji.EmojiResUpdateOperationListener", "cache res type:%d subType:%d", new Object[] { Integer.valueOf(parambh.cuB.cut), Integer.valueOf(parambh.cuB.cuu) });
      AppMethodBeat.o(52816);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", localException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.c.c
 * JD-Core Version:    0.6.2
 */