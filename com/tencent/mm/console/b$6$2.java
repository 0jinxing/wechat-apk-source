package com.tencent.mm.console;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class b$6$2
  implements f
{
  b$6$2(b.6 param6)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(16085);
    ab.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa  NetSceneGetCert onSceneEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 4) && (paramInt2 == -102))
    {
      al.d(new b.6.2.1(this));
      AppMethodBeat.o(16085);
    }
    while (true)
    {
      return;
      Toast.makeText(this.ewp.val$context, "DefaultRSA check pass", 0).show();
      b.D(this.ewp.val$context, "");
      AppMethodBeat.o(16085);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.6.2
 * JD-Core Version:    0.6.2
 */