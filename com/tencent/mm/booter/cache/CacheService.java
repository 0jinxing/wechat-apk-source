package com.tencent.mm.booter.cache;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CacheService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return a.edm;
  }

  public void onCreate()
  {
    AppMethodBeat.i(15882);
    super.onCreate();
    a.prepare();
    AppMethodBeat.o(15882);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(15883);
    super.onDestroy();
    a.destroy();
    AppMethodBeat.o(15883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.cache.CacheService
 * JD-Core Version:    0.6.2
 */