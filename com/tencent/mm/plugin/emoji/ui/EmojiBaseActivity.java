package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.ui.MMActivity;

public abstract class EmojiBaseActivity extends MMActivity
{
  private EmojiBaseActivity.a kZk;
  EmojiBaseActivity.b kZl;
  private HandlerThread mHandlerThread;

  public final void blo()
  {
    if (this.kZl != null)
      this.kZl.removeMessages(131074);
  }

  public final void dS(int paramInt1, int paramInt2)
  {
    if (this.kZl != null)
      this.kZl.sendEmptyMessageDelayed(paramInt1, paramInt2);
  }

  public abstract void l(Message paramMessage);

  public abstract void m(Message paramMessage);

  public final void n(Message paramMessage)
  {
    if (this.kZl != null)
      this.kZl.sendMessage(paramMessage);
  }

  public final void o(Message paramMessage)
  {
    if (this.kZk != null)
      this.kZk.sendMessage(paramMessage);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mHandlerThread = d.anM("EmojiBaseActivity_handlerThread");
    this.mHandlerThread.start();
    this.kZk = new EmojiBaseActivity.a(this, this.mHandlerThread.getLooper());
    this.kZl = new EmojiBaseActivity.b(this, getMainLooper());
  }

  public void onDestroy()
  {
    super.onDestroy();
    if ((this.kZk != null) && (this.kZk.getLooper() != null))
      this.kZk.getLooper().quit();
    this.mHandlerThread = null;
    this.kZk = null;
    this.kZl = null;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity
 * JD-Core Version:    0.6.2
 */