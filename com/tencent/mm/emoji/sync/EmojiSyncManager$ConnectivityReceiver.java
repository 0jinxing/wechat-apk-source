package com.tencent.mm.emoji.sync;

import a.f.b.j;
import a.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.at;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/sync/EmojiSyncManager$ConnectivityReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "plugin-emojisdk_release"})
public final class EmojiSyncManager$ConnectivityReceiver extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(63261);
    j.p(paramContext, "context");
    j.p(paramIntent, "intent");
    if (!at.isConnected(paramContext))
    {
      paramContext = EmojiSyncManager.Pe();
      if (paramContext != null)
      {
        paramContext.stop();
        AppMethodBeat.o(63261);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63261);
      continue;
      if (at.isWifi(paramContext))
      {
        paramContext = EmojiSyncManager.Pe();
        if (paramContext != null)
        {
          paramContext.cg(false);
          AppMethodBeat.o(63261);
        }
        else
        {
          AppMethodBeat.o(63261);
        }
      }
      else
      {
        paramContext = EmojiSyncManager.Pe();
        if (paramContext != null)
        {
          if (!EmojiSyncManager.b(paramContext))
          {
            paramContext = EmojiSyncManager.Pe();
            if (paramContext != null)
            {
              paramContext.stop();
              AppMethodBeat.o(63261);
            }
          }
        }
        else
        {
          AppMethodBeat.o(63261);
          continue;
          AppMethodBeat.o(63261);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.sync.EmojiSyncManager.ConnectivityReceiver
 * JD-Core Version:    0.6.2
 */