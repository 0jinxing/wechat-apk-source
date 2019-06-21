package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class b$c
  implements Runnable
{
  boolean sQd = false;

  b$c(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135329);
    if ((!this.sQd) && (!b.q(this.tet)))
    {
      int i;
      int j;
      if (c.cMe().tew.videoDecode(c.cMe().tew.sUU) == 1)
      {
        i = c.cMe().tew.field_remoteImgWidth;
        j = c.cMe().tew.field_remoteImgHeight;
        if (OpenGlRender.taQ != 1)
          break label167;
        if (!b.h(this.tet))
          break label135;
        b.r(this.tet).a(c.cMe().tew.sUU, i, j, OpenGlRender.FLAG_RGBA + OpenGlRender.FLAG_Angle90, false);
      }
      while (true)
      {
        try
        {
          Thread.sleep(20L);
        }
        catch (InterruptedException localInterruptedException)
        {
          ab.printErrStackTrace("MicroMsg.voipcs.VoipCSViewManager", localInterruptedException, "", new Object[0]);
        }
        break;
        label135: b.s(this.tet).a(c.cMe().tew.sUU, i, j, OpenGlRender.FLAG_RGBA + OpenGlRender.FLAG_Angle90, false);
        continue;
        label167: if (b.h(this.tet))
          b.r(this.tet).a(c.cMe().tew.sUU, i, j, OpenGlRender.FLAG_YV12Edge + OpenGlRender.FLAG_Angle90, false);
        else
          b.s(this.tet).a(c.cMe().tew.sUU, i, j, OpenGlRender.FLAG_YV12Edge + OpenGlRender.FLAG_Angle90, false);
      }
    }
    AppMethodBeat.o(135329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.c
 * JD-Core Version:    0.6.2
 */