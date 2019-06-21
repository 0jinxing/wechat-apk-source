package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.c;
import com.tencent.xweb.x5.a.a.a.a.b;

final class a$c extends b
{
  private a$c(a parama)
  {
  }

  public final Object onMiscCallBack(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(8672);
    Object localObject = this.uDk.uDe.onMiscCallBack(paramString, paramBundle);
    if (localObject != null)
    {
      AppMethodBeat.o(8672);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = super.onMiscCallBack(paramString, paramBundle);
      AppMethodBeat.o(8672);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.a.c
 * JD-Core Version:    0.6.2
 */