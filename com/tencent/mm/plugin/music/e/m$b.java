package com.tencent.mm.plugin.music.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class m$b
  implements Runnable
{
  List<String> oMi;

  private m$b(m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104839);
    Object localObject = com.tencent.mm.plugin.music.h.b.K(this.oMh.bTQ());
    int i = m.a(this.oMh);
    int j = 0;
    int k = 0;
    while (j < this.oMi.size())
    {
      if (((String)this.oMi.get(j)).equals(localObject))
      {
        i = j;
        k = 1;
      }
      j++;
    }
    if (k == 0)
      AppMethodBeat.o(104839);
    while (true)
    {
      return;
      for (j = i + 1; j < this.oMi.size(); j++)
        m.b(this.oMh).add(this.oMi.get(j));
      for (j = 0; j < i; j++)
        m.b(this.oMh).add(this.oMi.get(j));
      ab.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask currentMusicSize=%d currentMusicIndex=%d", new Object[] { Integer.valueOf(m.b(this.oMh).size()), Integer.valueOf(m.a(this.oMh)) });
      localObject = new ke();
      ((ke)localObject).cFH.action = 5;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(104839);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.e.m.b
 * JD-Core Version:    0.6.2
 */