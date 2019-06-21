package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class r
  implements f
{
  Context context;
  com.tencent.mm.ui.base.p mzU;
  ap ppI;
  h qhf;
  String url;

  public r(Context paramContext)
  {
    AppMethodBeat.i(81364);
    this.ppI = new ap(new r.1(this), false);
    this.context = paramContext;
    AppMethodBeat.o(81364);
  }

  final void c(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(81365);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("geta8key_session_id", paramInt);
    localIntent.putExtra("geta8key_cookie", paramArrayOfByte);
    c.gkE.i(localIntent, this.context);
    AppMethodBeat.o(81365);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81366);
    this.ppI.stopTimer();
    if (this.mzU != null)
      this.mzU.dismiss();
    g.Rg().b(233, this);
    paramString = (h)paramm;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = paramString.aiT();
      if ((paramm == null) || (paramm.length() == 0))
      {
        c(this.url, paramString.ajb(), paramString.ajc());
        AppMethodBeat.o(81366);
      }
    }
    while (true)
    {
      return;
      c(paramm, paramString.ajb(), paramString.ajc());
      AppMethodBeat.o(81366);
      continue;
      ab.e("MicroMsg.scanner.ViewMMURL", "getA8Key fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
      c(this.url, paramString.ajb(), paramString.ajc());
      AppMethodBeat.o(81366);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.r
 * JD-Core Version:    0.6.2
 */