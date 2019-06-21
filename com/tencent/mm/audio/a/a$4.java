package com.tencent.mm.audio.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.modelvoice.d.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ay.b;
import com.tencent.mm.sdk.platformtools.bo;

final class a$4
  implements d.a
{
  a$4(a parama)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(116455);
    d.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(116454);
        try
        {
          if (q.etd.epP == 1)
            Thread.sleep(300L);
          ab.i("MicroMsg.SceneVoicePlayer", "onCompletion, intOnCompletion: %s, shouldPlayComplete: %s", new Object[] { a.i(a.4.this.coE), Boolean.valueOf(a.j(a.4.this.coE)) });
          Runnable local1 = new com/tencent/mm/audio/a/a$4$1$1;
          local1.<init>(this);
          al.d(local1);
          AppMethodBeat.o(116454);
          return;
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.SceneVoicePlayer", "exception:%s", new Object[] { bo.l(localException) });
            AppMethodBeat.o(116454);
          }
        }
      }
    }
    , "SceneVoice_onCompletion");
    AppMethodBeat.o(116455);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.a.a.4
 * JD-Core Version:    0.6.2
 */