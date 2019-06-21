package com.tencent.mm.ui.chatting.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
  implements d
{
  private static final HandlerThread yYE;
  private final Handler bYm;
  private final Handler mMainHandler;
  private AtomicBoolean yYF;
  private f yYG;
  private c yYH;

  static
  {
    AppMethodBeat.i(32491);
    yYE = new HandlerThread("ListDataLoader$Thread");
    AppMethodBeat.o(32491);
  }

  public e(f paramf, c paramc)
  {
    AppMethodBeat.i(32488);
    this.yYF = new AtomicBoolean(false);
    this.mMainHandler = new e.1(this, Looper.getMainLooper());
    this.yYG = paramf;
    this.yYH = paramc;
    if (!yYE.isAlive())
      yYE.start();
    this.bYm = new Handler(yYE.getLooper());
    AppMethodBeat.o(32488);
  }

  public final void a(d.a parama, boolean paramBoolean, d.c paramc)
  {
    AppMethodBeat.i(32489);
    ab.i("MicroMsg.ChattingLoader.ListDataLoader", "[load] mode:%s isBlock:%s thread:%s", new Object[] { parama, Boolean.valueOf(paramBoolean), Long.valueOf(Thread.currentThread().getId()) });
    parama = new e.a(this, parama, paramBoolean, paramc, this.yYF);
    if (paramBoolean)
    {
      parama.run();
      AppMethodBeat.o(32489);
    }
    while (true)
    {
      return;
      this.bYm.post(parama);
      AppMethodBeat.o(32489);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(32490);
    ab.i("MicroMsg.ChattingLoader.ListDataLoader", "[cancel]");
    this.yYF.set(true);
    this.yYF = new AtomicBoolean(false);
    this.bYm.removeCallbacksAndMessages(null);
    this.mMainHandler.removeCallbacksAndMessages(null);
    AppMethodBeat.o(32490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.e
 * JD-Core Version:    0.6.2
 */