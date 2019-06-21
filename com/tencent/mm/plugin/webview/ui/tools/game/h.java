package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class h
{
  public static String cMm;
  public static int cSQ;
  public static String uEm;

  public h(Intent paramIntent)
  {
    AppMethodBeat.i(8780);
    if (paramIntent == null)
      AppMethodBeat.o(8780);
    while (true)
    {
      return;
      cMm = bo.nullAsNil(paramIntent.getStringExtra("KPublisherId"));
      uEm = bo.nullAsNil(paramIntent.getStringExtra("geta8key_username"));
      cSQ = bo.h(Integer.valueOf(paramIntent.getIntExtra("geta8key_scene", 0)));
      AppMethodBeat.o(8780);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.h
 * JD-Core Version:    0.6.2
 */