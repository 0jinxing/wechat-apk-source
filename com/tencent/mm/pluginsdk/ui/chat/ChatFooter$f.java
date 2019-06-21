package com.tencent.mm.pluginsdk.ui.chat;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.b.a.b;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

public final class ChatFooter$f
  implements TextWatcher
{
  TextWatcher vog;
  private boolean voh;
  private boolean voi;

  public ChatFooter$f(ChatFooter paramChatFooter, TextWatcher paramTextWatcher)
  {
    AppMethodBeat.i(27825);
    this.voh = false;
    this.voi = d.fP(11);
    this.vog = paramTextWatcher;
    AppMethodBeat.o(27825);
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    boolean bool = true;
    AppMethodBeat.i(27826);
    if ((ChatFooter.g(this.vnX)) && (this.voh) && (paramEditable.length() > 0))
    {
      this.voh = false;
      ChatFooter.a(this.vnX).setText(paramEditable.subSequence(0, paramEditable.length() - 1));
      if (ChatFooter.a(this.vnX).length() > 0)
      {
        ChatFooter.h(this.vnX).performClick();
        ab.i("MicroMsg.ChatFooter", "enter button, do send");
      }
      ab.d("VOICEDEBUG", "Last Text Time = " + System.currentTimeMillis());
      AppMethodBeat.o(27826);
      return;
    }
    this.vog.afterTextChanged(paramEditable);
    if (ChatFooter.q(this.vnX) != null)
    {
      if (ChatFooter.a(this.vnX).getLineCount() > 1)
      {
        ChatFooter.q(this.vnX).setVisibility(0);
        ChatFooter.q(this.vnX).setText(paramEditable.length() + "/140");
      }
    }
    else
      label204: if ((paramEditable.length() <= 0) || (paramEditable.toString().trim().length() <= 0))
        break label302;
    while (true)
    {
      ChatFooter.b(this.vnX, bool);
      if (ChatFooter.n(this.vnX) != null)
        ChatFooter.n(this.vnX).setSendButtonEnable(bool);
      ab.d("VOICEDEBUG", "Last Text Time = " + System.currentTimeMillis());
      AppMethodBeat.o(27826);
      break;
      ChatFooter.q(this.vnX).setVisibility(8);
      break label204;
      label302: bool = false;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(27827);
    this.vog.beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    ab.d("VOICEDEBUG", "First Text Time = " + System.currentTimeMillis());
    AppMethodBeat.o(27827);
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(27828);
    if ((ChatFooter.g(this.vnX)) && (paramInt2 == 0) && (paramInt1 == paramCharSequence.length() - 1) && (paramInt3 == 1) && (paramCharSequence.charAt(paramCharSequence.length() - 1) == '\n'))
    {
      ab.i("MicroMsg.ChatFooter", "text changed, enter button");
      this.voh = true;
      AppMethodBeat.o(27828);
    }
    while (true)
    {
      return;
      this.vog.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
      this.vnX.vnk.cTu += 1L;
      this.vnX.vnk.Fm();
      if (this.vnX.vnk.cTr == 0L)
        this.vnX.vnk.Fl();
      AppMethodBeat.o(27828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f
 * JD-Core Version:    0.6.2
 */