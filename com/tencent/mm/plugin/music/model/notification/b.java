package com.tencent.mm.plugin.music.model.notification;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  public c hAA;
  public MMMusicPlayerService oMK;
  volatile boolean oMQ = false;

  final void bUr()
  {
    try
    {
      AppMethodBeat.i(104990);
      if ((this.oMK != null) && (this.oMQ))
        AppMethodBeat.o(104990);
      while (true)
      {
        return;
        this.oMQ = true;
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setClass(ah.getContext(), MMMusicPlayerService.class);
        Context localContext = ah.getContext();
        b.2 local2 = new com/tencent/mm/plugin/music/model/notification/b$2;
        local2.<init>(this);
        ab.i("MicroMsg.Music.MMMusicNotificationHelper", "isOk:%b", new Object[] { Boolean.valueOf(localContext.bindService(localIntent, local2, 1)) });
        AppMethodBeat.o(104990);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.b
 * JD-Core Version:    0.6.2
 */