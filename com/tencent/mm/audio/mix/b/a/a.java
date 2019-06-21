package com.tencent.mm.audio.mix.b.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.c;
import com.tencent.mm.audio.mix.b.d;
import com.tencent.mm.audio.mix.h.b;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  implements f
{
  private String appId;
  private String filePath;

  public a(String paramString1, String paramString2)
  {
    this.appId = paramString1;
    this.filePath = paramString2;
  }

  public final void Dp()
  {
    AppMethodBeat.i(137001);
    b.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "runTask, appId:%s", new Object[] { this.appId });
    Object localObject1;
    Object localObject2;
    int i;
    if (TextUtils.isEmpty(this.filePath))
    {
      b.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file task");
      localObject1 = d.Dm().Do();
      if (((ArrayList)localObject1).size() > 0)
      {
        localObject2 = "";
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        i = 0;
        while (localIterator.hasNext())
        {
          localObject1 = (String)localIterator.next();
          c localc = d.Dm().dv((String)localObject1);
          if ((localc == null) || (!localc.cky) || (!localc.ckB))
          {
            int j = d.Dm().dw((String)localObject1);
            if (j < i)
              break label287;
            i = j;
            localObject2 = localObject1;
          }
        }
      }
    }
    label287: 
    while (true)
    {
      break;
      localObject1 = d.Dm().dv((String)localObject2);
      if ((localObject1 != null) && (((c)localObject1).cky) && (!((c)localObject1).ckB))
        ((c)localObject1).du(this.appId);
      b.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", new Object[] { localObject2, Integer.valueOf(i) });
      AppMethodBeat.o(137001);
      while (true)
      {
        return;
        i = d.Dm().dw(this.filePath);
        b.i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", new Object[] { this.filePath, Integer.valueOf(i) });
        localObject2 = d.Dm().dv(this.filePath);
        if ((localObject2 != null) && (((c)localObject2).cky) && (!((c)localObject2).ckB))
          ((c)localObject2).du(this.appId);
        AppMethodBeat.o(137001);
      }
    }
  }

  public final void end()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.a.a
 * JD-Core Version:    0.6.2
 */