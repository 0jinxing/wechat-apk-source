package com.tencent.mm.plugin.music.b.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashMap;

final class c$3
  implements Runnable
{
  c$3(c paramc, String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, String paramString3, long paramLong4, long paramLong5, long paramLong6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104818);
    Object localObject1 = this.oJX + "-" + ag.ck(this.oKE);
    while (true)
    {
      synchronized (c.bDq())
      {
        if (!c.bDq().containsKey(localObject1))
          break label307;
        c.a(c.bTo(), (String)localObject1, this.oKH);
        c.a(c.bTp(), (String)localObject1, this.oKI);
        c.a(c.bTq(), (String)localObject1, this.oKJ);
        int i = ((Integer)c.bDq().get(localObject1)).intValue() - 1;
        if (i > 0)
        {
          c.bDq().put(localObject1, Integer.valueOf(i));
          if (!this.oKG)
          {
            c.zt(1);
            c.bTr();
            if (c.Nx().containsKey(localObject1))
            {
              i = ((Integer)c.Nx().get(localObject1)).intValue() - 1;
              if (i <= 0)
                break label335;
              c.Nx().put(localObject1, Integer.valueOf(i));
            }
            if ((!this.oKG) && (!TextUtils.isEmpty(this.oKK)))
            {
              if (!c.bTt().containsKey(this.oKK))
                break label346;
              localObject1 = (c.a)c.bTt().get(this.oKK);
              if (localObject1 != null)
                ((c.a)localObject1).playCount += 1;
              ((c.a)localObject1).oKQ = this.oKL;
              ((c.a)localObject1).fileSize = this.oKM;
              ((c.a)localObject1).duration = this.hTt;
              c.bTt().put(this.oKK, localObject1);
            }
            AppMethodBeat.o(104818);
          }
        }
        else
        {
          c.bDq().remove(localObject1);
        }
      }
      c.bTs();
      continue;
      label307: ab.d("MicroMsg.Audio.AudioReportService", "leonlaudio not exist audioKey, audioId:%s, audioSrc:%s", new Object[] { this.oJX, this.oKE });
      continue;
      label335: c.Nx().remove(localObject2);
      continue;
      label346: c.a locala = new com/tencent/mm/plugin/music/b/a/c$a;
      locala.<init>(this.oKF);
      locala.playCount = 1;
      locala.oKQ = this.oKL;
      locala.fileSize = this.oKM;
      locala.duration = this.hTt;
      c.bTt().put(this.oKK, locala);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.a.c.3
 * JD-Core Version:    0.6.2
 */