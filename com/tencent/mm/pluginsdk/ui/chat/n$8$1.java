package com.tencent.mm.pluginsdk.ui.chat;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.e.a;
import java.util.ArrayList;

final class n$8$1
  implements RadioGroup.OnCheckedChangeListener
{
  n$8$1(n.8 param8, e.a parama)
  {
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    AppMethodBeat.i(27979);
    n.b(this.vpD.vpC, paramInt);
    n.f(this.vpD.vpC).setText((CharSequence)n.e(this.vpD.vpC).get(n.d(this.vpD.vpC)));
    n.h(this.vpD.vpC).setLangType(((Integer)n.g(this.vpD.vpC).get(n.d(this.vpD.vpC))).intValue());
    this.imH.gud.dismiss();
    this.vpD.vpC.Lk(2);
    AppMethodBeat.o(27979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.n.8.1
 * JD-Core Version:    0.6.2
 */