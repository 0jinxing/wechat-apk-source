package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;

public final class i
{
  private h.a czi;
  private h.b czj;
  AudioManager eoY;
  i.a tYl;
  BroadcastReceiver tYm;

  public i()
  {
    AppMethodBeat.i(26349);
    this.czi = new h.a()
    {
      public final void EA()
      {
        AppMethodBeat.i(26346);
        i.this.tYl.mfO.a(null);
        i.this.tYl.mfO.a(null);
        i.this.b(i.this.tYl);
        AppMethodBeat.o(26346);
      }
    };
    this.czj = new i.2(this);
    this.tYm = new i.3(this);
    this.eoY = ((AudioManager)ah.getContext().getSystemService("audio"));
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
    ah.getContext().registerReceiver(this.tYm, localIntentFilter);
    AppMethodBeat.o(26349);
  }

  private static i.a a(i.a parama)
  {
    AppMethodBeat.i(26351);
    if (parama != null)
    {
      parama.mfO.stop();
      parama.mfO.a(null);
      parama.mfO.a(null);
      parama.tYo.clear();
    }
    AppMethodBeat.o(26351);
    return null;
  }

  final void b(i.a parama)
  {
    AppMethodBeat.i(26352);
    while (true)
      if (parama != null)
        if (parama.tYo.size() > 0)
        {
          bi localbi = (bi)parama.tYo.getLast();
          parama.tYo.removeLast();
          q.M(localbi);
          String str = q.getFullPath(localbi.field_imgPath);
          ab.i("MicroMsg.Wear.WearVoicePlayLogic", "play: msgid=%d, fullpath=%s", new Object[] { Long.valueOf(localbi.field_msgId), str });
          if (!parama.mfO.a(str, true, true, -1))
            continue;
          parama.mfO.a(this.czi);
          parama.mfO.a(this.czj);
          AppMethodBeat.o(26352);
        }
    while (true)
    {
      return;
      a(parama);
      AppMethodBeat.o(26352);
    }
  }

  public final void cUu()
  {
    AppMethodBeat.i(26350);
    a(this.tYl);
    AppMethodBeat.o(26350);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.i
 * JD-Core Version:    0.6.2
 */