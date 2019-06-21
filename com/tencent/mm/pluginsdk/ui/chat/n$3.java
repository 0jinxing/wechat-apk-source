package com.tencent.mm.pluginsdk.ui.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.text.Editable;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.b;
import com.tencent.mm.pluginsdk.ui.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

final class n$3
  implements VoiceInputLayout.b
{
  n$3(n paramn)
  {
  }

  public final void at(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(27974);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(System.currentTimeMillis()) });
    n.w(this.vpC);
    n.l(this.vpC).a(n.i(this.vpC));
    n.m(this.vpC);
    if ((n.s(this.vpC) instanceof Activity))
      ((Activity)n.s(this.vpC)).getWindow().clearFlags(128);
    n.Lm(paramInt1);
    if (paramInt1 == 12)
      n.c(this.vpC, 2131304290);
    while (true)
    {
      n.o(this.vpC).oz(false);
      n.i(this.vpC).setHint(null);
      AppMethodBeat.o(27974);
      return;
      n.c(this.vpC, 2131296906);
    }
  }

  public final void bBC()
  {
    int i = 0;
    AppMethodBeat.i(27969);
    n.o(this.vpC).oz(false);
    n.i(this.vpC).setHint(null);
    TextView localTextView = n.f(this.vpC);
    if ((n.g(this.vpC).size() < 2) || (n.i(this.vpC).getText().length() > 0))
      i = 8;
    localTextView.setVisibility(i);
    AppMethodBeat.o(27969);
  }

  public final void bBD()
  {
    AppMethodBeat.i(27970);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + System.currentTimeMillis());
    n.w(this.vpC);
    n.l(this.vpC).a(n.i(this.vpC));
    n.m(this.vpC);
    if ((n.s(this.vpC) instanceof Activity))
      ((Activity)n.s(this.vpC)).getWindow().clearFlags(128);
    n.Ll(2);
    n.o(this.vpC).oz(false);
    n.i(this.vpC).setHint(null);
    TextView localTextView = n.f(this.vpC);
    if ((n.g(this.vpC).size() < 2) || (n.i(this.vpC).getText().length() > 0));
    for (int i = 8; ; i = 0)
    {
      localTextView.setVisibility(i);
      AppMethodBeat.o(27970);
      return;
    }
  }

  public final void bBE()
  {
    AppMethodBeat.i(27971);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    n.l(this.vpC).a(n.i(this.vpC));
    n.m(this.vpC);
    if ((n.s(this.vpC) instanceof Activity))
      ((Activity)n.s(this.vpC)).getWindow().clearFlags(128);
    n.Ll(3);
    n.o(this.vpC).oz(false);
    n.i(this.vpC).setHint(null);
    AppMethodBeat.o(27971);
  }

  public final void bBF()
  {
    AppMethodBeat.i(27972);
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    n.w(this.vpC);
    n.l(this.vpC).a(n.i(this.vpC));
    n.m(this.vpC);
    if ((n.s(this.vpC) instanceof Activity))
      ((Activity)n.s(this.vpC)).getWindow().clearFlags(128);
    n.Lm(1);
    n.o(this.vpC).oz(false);
    n.i(this.vpC).setHint(null);
    AppMethodBeat.o(27972);
  }

  public final void bBz()
  {
    AppMethodBeat.i(27968);
    n.a(this.vpC, System.currentTimeMillis());
    ab.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", new Object[] { Long.valueOf(n.p(this.vpC)) });
    ab.d("VOICEDEBUG", "Start Record Time = %s", new Object[] { Long.valueOf(n.p(this.vpC)) });
    n.b(this.vpC, false);
    n.c(this.vpC, true);
    n.d(this.vpC, true);
    n.b(this.vpC, 0L);
    n.q(this.vpC);
    n.m(this.vpC);
    n.r(this.vpC).setVisibility(8);
    n.c(this.vpC, false);
    n.l(this.vpC).vjo = 3;
    n.l(this.vpC).b(n.i(this.vpC));
    n.dkP();
    if (n.i(this.vpC) != null)
    {
      if ((n.i(this.vpC).getText() != null) && (n.i(this.vpC).getText().length() > 0))
        n.i(this.vpC).setCursorVisible(true);
      n.i(this.vpC).requestFocus();
      bo.hideVKB(n.h(this.vpC));
    }
    if ((n.s(this.vpC) instanceof Activity))
      ((Activity)n.s(this.vpC)).getWindow().addFlags(128);
    n.t(this.vpC).setVisibility(4);
    n.u(this.vpC).setVisibility(4);
    n.v(this.vpC).setVisibility(8);
    n.i(this.vpC).setHint(this.vpC.getResources().getString(2131304289));
    n.o(this.vpC).oz(true);
    n.f(this.vpC).setVisibility(8);
    this.vpC.Lk(1);
    AppMethodBeat.o(27968);
  }

  public final void c(String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(138174);
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0) && (paramArrayOfString[0].length() > 0))
    {
      if (n.x(this.vpC))
      {
        n.d(this.vpC, false);
        n.y(this.vpC);
      }
      n.l(this.vpC).a(n.i(this.vpC), paramArrayOfString[0], true);
      if (n.i(this.vpC).getText().length() != 0)
      {
        n.i(this.vpC).setCursorVisible(true);
        n.i(this.vpC).requestFocus();
        bo.hideVKB(n.h(this.vpC));
      }
      if ((!n.z(this.vpC)) && (paramArrayOfString[0].length() != 0))
      {
        n.b(this.vpC, true);
        n.b(this.vpC, System.currentTimeMillis());
        ab.d("VOICEDEBUG", "First Text Time = %s Corss Time = %s", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(n.A(this.vpC) - n.p(this.vpC)) });
      }
      n.B(this.vpC).addAll(paramList);
    }
    AppMethodBeat.o(138174);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.n.3
 * JD-Core Version:    0.6.2
 */