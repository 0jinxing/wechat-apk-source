package com.tencent.mm.pluginsdk.ui.websearch;

import android.app.Activity;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.List;

final class a$5
  implements VoiceInputLayout.b
{
  a$5(a parama)
  {
  }

  public final void at(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(28250);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(System.currentTimeMillis()) });
    a.d(this.vwd);
    if ((a.j(this.vwd) instanceof Activity))
      ((Activity)a.j(this.vwd)).getWindow().clearFlags(128);
    if (paramInt1 == 12)
      a.a(this.vwd, 2131304290);
    while (true)
    {
      a.e(this.vwd).oz(false);
      a.c(this.vwd).setHint(null);
      AppMethodBeat.o(28250);
      return;
      a.a(this.vwd, 2131296906);
    }
  }

  public final void bBC()
  {
    AppMethodBeat.i(28245);
    a.e(this.vwd).oz(false);
    a.c(this.vwd).setHint(null);
    AppMethodBeat.o(28245);
  }

  public final void bBD()
  {
    AppMethodBeat.i(28246);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + System.currentTimeMillis());
    a.d(this.vwd);
    if ((a.j(this.vwd) instanceof Activity))
      ((Activity)a.j(this.vwd)).getWindow().clearFlags(128);
    a.e(this.vwd).oz(false);
    a.c(this.vwd).setHint(null);
    a.b(this.vwd, 2);
    AppMethodBeat.o(28246);
  }

  public final void bBE()
  {
    AppMethodBeat.i(28247);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    a.d(this.vwd);
    if ((a.j(this.vwd) instanceof Activity))
      ((Activity)a.j(this.vwd)).getWindow().clearFlags(128);
    a.e(this.vwd).oz(false);
    a.c(this.vwd).setHint(null);
    AppMethodBeat.o(28247);
  }

  public final void bBF()
  {
    AppMethodBeat.i(28248);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    a.d(this.vwd);
    if ((a.j(this.vwd) instanceof Activity))
      ((Activity)a.j(this.vwd)).getWindow().clearFlags(128);
    a.e(this.vwd).oz(false);
    a.c(this.vwd).setHint(null);
    a.b(this.vwd, 2);
    AppMethodBeat.o(28248);
  }

  public final void bBz()
  {
    AppMethodBeat.i(28244);
    a.a(this.vwd, System.currentTimeMillis());
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", new Object[] { Long.valueOf(a.g(this.vwd)) });
    ab.d("VOICEDEBUG", "Start Record Time = %s", new Object[] { Long.valueOf(a.g(this.vwd)) });
    a.b(this.vwd, false);
    a.c(this.vwd, true);
    a.d(this.vwd, true);
    a.b(this.vwd, 0L);
    a.h(this.vwd);
    a.d(this.vwd);
    a.i(this.vwd).setVisibility(8);
    a.c(this.vwd, false);
    a locala = this.vwd;
    if (locala.eoY != null)
      locala.eoY.setStreamMute(3, true);
    if ((a.j(this.vwd) instanceof Activity))
      ((Activity)a.j(this.vwd)).getWindow().addFlags(128);
    a.k(this.vwd).setVisibility(4);
    a.l(this.vwd).setVisibility(4);
    a.m(this.vwd).setVisibility(8);
    a.c(this.vwd).setHint(this.vwd.getResources().getString(2131304289));
    a.e(this.vwd).oz(true);
    AppMethodBeat.o(28244);
  }

  public final void c(String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(138175);
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0) && (paramArrayOfString[0].length() > 0))
    {
      if (a.n(this.vwd))
        a.d(this.vwd, false);
      ab.i("MicroMsg.VoiceInputPanel", "onDetected %s", new Object[] { paramArrayOfString[0] });
      a.c(this.vwd).setText(paramArrayOfString[0]);
      if ((!a.o(this.vwd)) && (paramArrayOfString[0].length() != 0))
      {
        a.b(this.vwd, true);
        a.b(this.vwd, System.currentTimeMillis());
        ab.d("VOICEDEBUG", "First Text Time = %s Corss Time = %s", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(a.p(this.vwd) - a.g(this.vwd)) });
      }
      a.q(this.vwd).addAll(paramList);
    }
    AppMethodBeat.o(138175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.websearch.a.5
 * JD-Core Version:    0.6.2
 */