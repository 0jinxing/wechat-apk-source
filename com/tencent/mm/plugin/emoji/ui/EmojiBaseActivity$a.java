package com.tencent.mm.plugin.emoji.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiBaseActivity$a extends ak
{
  EmojiBaseActivity$a(EmojiBaseActivity paramEmojiBaseActivity, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53297);
    super.handleMessage(paramMessage);
    this.kZm.l(paramMessage);
    AppMethodBeat.o(53297);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity.a
 * JD-Core Version:    0.6.2
 */