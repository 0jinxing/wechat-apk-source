package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.b;
import com.tencent.mm.protocal.protobuf.chx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class m$c
  implements g.b
{
  private m$c(m paramm)
  {
  }

  public final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(1749);
    if (this.sEW.sET.containsKey(paramString))
    {
      chx localchx = (chx)this.sEW.sET.get(paramString);
      localchx.xhj = paramd.field_recvedBytes;
      localchx.xhk = m.aa(localchx.xhj, paramd.field_fileLength);
      localchx.xha = paramd.field_fileLength;
      this.sEW.sET.put(paramString, localchx);
      ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "VideoPreloadCallback onFinish %s %d %s", new Object[] { paramString, Long.valueOf(localchx.xhk), bo.b(localchx.xhj, 100.0D) });
    }
    AppMethodBeat.o(1749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.m.c
 * JD-Core Version:    0.6.2
 */