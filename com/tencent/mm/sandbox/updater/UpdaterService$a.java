package com.tencent.mm.sandbox.updater;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.at;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@JgClassChecked(author=20, fComment="checked", lastDate="20141015", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
final class UpdaterService$a extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(28986);
    if (UpdaterService.dnH() != null)
    {
      paramIntent = UpdaterService.dnH();
      boolean bool = at.isWifi(paramContext);
      if (paramIntent.xxi.size() > 0)
      {
        paramContext = paramIntent.xxi.values().iterator();
        while (paramContext.hasNext())
          ((a)paramContext.next()).pc(bool);
      }
    }
    AppMethodBeat.o(28986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.UpdaterService.a
 * JD-Core Version:    0.6.2
 */