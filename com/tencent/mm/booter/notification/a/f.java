package com.tencent.mm.booter.notification.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import java.nio.charset.Charset;

public final class f
{
  Context context;
  boolean eeq;
  MediaPlayer eer;

  @SuppressLint({"HandlerLeak"})
  ak ees;
  private ak eet;

  private f()
  {
    AppMethodBeat.i(16033);
    this.eeq = false;
    this.eer = null;
    this.ees = new f.1(this, Looper.getMainLooper());
    this.context = ah.getContext();
    Object localObject2 = ac.eSj + "deviceconfig.cfg";
    ab.i("MicroMsg.ServerConfigInfoStorage", "readConfigFromLocalFile, path: %s, isExist: %s", new Object[] { localObject2, Boolean.valueOf(e.ct((String)localObject2)) });
    if (!e.ct((String)localObject2))
      localObject2 = localObject1;
    while (true)
    {
      q.ku((String)localObject2);
      AppMethodBeat.o(16033);
      return;
      Object localObject3 = e.f((String)localObject2, 0, -1);
      localObject2 = localObject1;
      if (!bo.cb((byte[])localObject3))
      {
        localObject3 = new String((byte[])localObject3, Charset.defaultCharset());
        localObject2 = localObject1;
        if (!bo.isNullOrNil((String)localObject3))
          localObject2 = localObject3;
      }
    }
  }

  public final void jT(String paramString)
  {
    try
    {
      AppMethodBeat.i(16034);
      if (this.eet == null)
      {
        ab.i("MicroMsg.Notification.Tool.Sound", "playSound playHandler == null");
        localObject = d.ek("playSoundThread", 0);
        ((HandlerThread)localObject).start();
        localak = new com/tencent/mm/sdk/platformtools/ak;
        localak.<init>(((HandlerThread)localObject).getLooper());
        this.eet = localak;
      }
      ak localak = this.eet;
      Object localObject = new com/tencent/mm/booter/notification/a/f$2;
      ((f.2)localObject).<init>(this, paramString);
      localak.post((Runnable)localObject);
      AppMethodBeat.o(16034);
      return;
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.f
 * JD-Core Version:    0.6.2
 */