package com.tencent.mm.plugin.webview.ui.tools.game;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.bizui.a.a;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.ab;

public class GameChattingRoomWebViewUI extends WebViewUI
{
  private String jumpUrl;
  private int uCW;
  private int uCX;
  final q.a uCY;
  final q.a uCZ;

  public GameChattingRoomWebViewUI()
  {
    AppMethodBeat.i(8645);
    this.jumpUrl = "";
    this.uCW = 4;
    this.uCX = 5;
    this.uCY = new GameChattingRoomWebViewUI.1(this);
    this.uCZ = new GameChattingRoomWebViewUI.2(this);
    AppMethodBeat.o(8645);
  }

  public final void afL(String paramString)
  {
    AppMethodBeat.i(8646);
    ab.i("MicroMsg.GameChattingRoomWebViewUI", "url = %s", new Object[] { paramString });
    this.jumpUrl = paramString;
    String str1 = getIntent().getStringExtra("action");
    String str2;
    if (str1 != null)
    {
      paramString = getIntent().getStringExtra("app_name");
      if (paramString == null)
      {
        paramString = getString(2131296530);
        str2 = getString(2131298425);
        if (!str1.equals("action_create"))
          break label126;
        a.a(this.mController, getString(2131298803), paramString, str2, this.uCY, this.uCZ);
        AppMethodBeat.o(8646);
      }
    }
    while (true)
    {
      return;
      paramString = getString(2131298418, new Object[] { paramString });
      break;
      label126: if (str1.equals("action_join"))
        a.a(this.mController, getString(2131300858), paramString, str2, this.uCY, this.uCZ);
      AppMethodBeat.o(8646);
    }
  }

  public final boolean afM(String paramString)
  {
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI
 * JD-Core Version:    0.6.2
 */