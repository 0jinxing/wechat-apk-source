package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;

final class f$1
  implements Runnable
{
  f$1(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(52864);
    if (!g.RK())
      AppMethodBeat.o(52864);
    while (true)
    {
      return;
      Object localObject = j.getEmojiStorageMgr().xYn.dvj();
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          EmojiInfo localEmojiInfo = (EmojiInfo)((Iterator)localObject).next();
          if (f.a(this.kTP))
            this.kTP.c(localEmojiInfo, false);
        }
      }
      if (f.a(this.kTP))
        g.RP().Ry().set(ac.a.xJr, Long.valueOf(System.currentTimeMillis()));
      AppMethodBeat.o(52864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.f.1
 * JD-Core Version:    0.6.2
 */