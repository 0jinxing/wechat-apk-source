package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class e$6
  implements Runnable
{
  e$6(e parame, String paramString, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50563);
    Object localObject1 = (h)this.fzs.fyM.remove(this.IN);
    Object localObject2;
    int i;
    if (localObject1 != null)
    {
      localObject2 = new d();
      f.afy();
      i = a.b(((h)localObject1).field_mediaId, (d)localObject2);
      if (i == 0)
        e.a(this.fzu, (d)localObject2, (h)localObject1, false);
    }
    while (true)
    {
      this.fzs.fyL.remove(this.IN);
      AppMethodBeat.o(50563);
      return;
      ab.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", new Object[] { Integer.valueOf(i), ((h)localObject1).field_mediaId });
      continue;
      localObject2 = (h)this.fzs.fzq.remove(this.IN);
      localObject1 = (d)this.fzs.fzr.remove(this.IN);
      if ((localObject2 != null) && (localObject1 != null))
        e.a(this.fzu, (d)localObject1, (h)localObject2, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e.6
 * JD-Core Version:    0.6.2
 */