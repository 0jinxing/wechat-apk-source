package com.tencent.mm.plugin.emoji.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiBaseActivity$b extends ak
{
  EmojiBaseActivity$b(EmojiBaseActivity paramEmojiBaseActivity, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53298);
    super.handleMessage(paramMessage);
    this.kZm.m(paramMessage);
    AppMethodBeat.o(53298);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity.b
 * JD-Core Version:    0.6.2
 */