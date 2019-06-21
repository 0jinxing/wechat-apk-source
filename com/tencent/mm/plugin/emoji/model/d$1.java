package com.tencent.mm.plugin.emoji.model;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.f.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.c;

final class d$1
  implements Runnable
{
  d$1(d paramd, String paramString)
  {
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(53031);
    c localc = j.getEmojiStorageMgr().xYp;
    Object localObject = this.kUJ;
    long l1;
    long l2;
    if (com.tencent.mm.plugin.emoji.h.b.JX((String)localObject))
    {
      l1 = localc.yaX.getLong("274544".concat(String.valueOf(localObject)), 0L);
      l2 = System.currentTimeMillis();
      if (l2 - l1 < 86400000L);
    }
    label149: 
    while (true)
    {
      if (i != 0)
      {
        j.bki();
        localObject = this.kUJ;
        if (bo.isNullOrNil((String)localObject))
        {
          ab.w("MicroMsg.emoji.EmojiMgrImpl", "doSceneGetEmotionDesc get emotion desc faild.");
          AppMethodBeat.o(53031);
        }
      }
      while (true)
      {
        return;
        if ((!localc.aqh((String)localObject)) && (l2 - l1 >= 3600000L))
          break label149;
        i = 0;
        break;
        localObject = new k((String)localObject);
        g.RO().eJo.a((m)localObject, 0);
        AppMethodBeat.o(53031);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.d.1
 * JD-Core Version:    0.6.2
 */