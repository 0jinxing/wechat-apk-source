package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.ke.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class g$36 extends c<ke>
{
  g$36(g paramg)
  {
    AppMethodBeat.i(9087);
    this.xxI = ke.class.getName().hashCode();
    AppMethodBeat.o(9087);
  }

  private boolean a(ke paramke)
  {
    boolean bool1 = false;
    AppMethodBeat.i(9088);
    String str = paramke.cFH.state;
    ab.i("MicroMsg.MsgHandler", "backgroundAudioListener callback in, state:%s", new Object[] { str });
    boolean bool2 = paramke.cFH.cFJ;
    int i = (int)(paramke.cFH.duration / 1000L);
    if (!bool2)
    {
      ab.e("MicroMsg.MsgHandler", "is not from QQMusicPlayer, don't callback!");
      AppMethodBeat.o(9088);
    }
    while (true)
    {
      return bool1;
      try
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("background_audio_state_player_state", str);
        localBundle.putInt("background_audio_state_player_duration", i);
        if (paramke.cFH.cFB != null)
        {
          localBundle.putString("background_audio_state_player_src", paramke.cFH.cFB.fKa);
          localBundle.putString("background_audio_state_player_src_id", paramke.cFH.cFB.fKs);
        }
        localBundle.putInt("background_audio_state_player_err_code", paramke.cFH.errCode);
        str = "";
        if (!TextUtils.isEmpty(paramke.cFH.aIm))
          str = paramke.cFH.aIm;
        localBundle.putString("background_audio_state_player_err_msg", str);
        if (g.k(this.uHd) != null)
        {
          ab.i("MicroMsg.MsgHandler", "onBackgroundAudioStateChange");
          g.k(this.uHd).c(2100, localBundle);
        }
        while (true)
        {
          AppMethodBeat.o(9088);
          bool1 = true;
          break;
          ab.e("MicroMsg.MsgHandler", "backgroundAudioListener callbacker is null");
        }
      }
      catch (Exception paramke)
      {
        ab.e("MicroMsg.MsgHandler", paramke.getMessage());
        AppMethodBeat.o(9088);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.36
 * JD-Core Version:    0.6.2
 */