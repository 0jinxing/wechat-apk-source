package com.tencent.mm.plugin.emojicapture.proxy;

import a.l;
import android.content.Context;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bo.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.service.MMService;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureService;", "Lcom/tencent/mm/service/MMService;", "()V", "TAG", "", "onCreate", "", "onDestroy", "Companion", "plugin-emojicapture_release"})
public final class EmojiCaptureService extends MMService
{
  public static final a lkO;
  private final String TAG = "MicroMsg.EmojiCaptureService";

  static
  {
    AppMethodBeat.i(2842);
    lkO = new a((byte)0);
    AppMethodBeat.o(2842);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(2840);
    super.onCreate();
    ab.i(this.TAG, "onCreate: ");
    if (com.tencent.mm.compatible.util.d.iW(26))
      startForeground(-2564, a.bt(ah.getContext(), "reminder_channel_id").as(a.bWV()).e((CharSequence)ah.getContext().getString(2131305882)).build());
    Object localObject = EmojiCaptureProxy.lkM;
    EmojiCaptureProxy.a.bnL();
    localObject = EmojiCaptureProxy.lkM;
    localObject = EmojiCaptureProxy.access$getInstance$cp().getServerProxy();
    if (localObject != null)
    {
      ((com.tencent.mm.remoteservice.d)localObject).connect((Runnable)b.lkP);
      AppMethodBeat.o(2840);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2840);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(2841);
    super.onDestroy();
    ab.i(this.TAG, "onDestroy: ");
    dqz();
    EmojiCaptureProxy.a locala = EmojiCaptureProxy.lkM;
    EmojiCaptureProxy.a.bnM();
    AppMethodBeat.o(2841);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureService$Companion;", "", "()V", "NOTIFY_ID", "", "plugin-emojicapture_release"})
  public static final class a
  {
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class b
    implements Runnable
  {
    public static final b lkP;

    static
    {
      AppMethodBeat.i(2839);
      lkP = new b();
      AppMethodBeat.o(2839);
    }

    public final void run()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureService
 * JD-Core Version:    0.6.2
 */