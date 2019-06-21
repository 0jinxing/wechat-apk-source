package com.tencent.liteav.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

class a$1 extends Handler
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(66365);
    if (a.a(this.a) != null)
      switch (paramMessage.what)
      {
      default:
      case 1:
      case 2:
      }
    while (true)
    {
      AppMethodBeat.o(66365);
      while (true)
      {
        return;
        a.a(this.a).a(((Long)paramMessage.obj).longValue());
        AppMethodBeat.o(66365);
      }
      TXCLog.d("TXCStreamRecord", "record complete. errcode = " + paramMessage.arg1 + ", errmsg = " + (String)paramMessage.obj + ", outputPath = " + a.b(this.a).f + ", coverImage = " + a.b(this.a).g);
      if ((paramMessage.arg1 == 0) && (a.b(this.a).g != null) && (!a.b(this.a).g.isEmpty()) && (!b.a(a.b(this.a).f, a.b(this.a).g)))
        TXCLog.e("TXCStreamRecord", "saveVideoThumb error. sourcePath = " + a.b(this.a).f + ", coverImagePath = " + a.b(this.a).g);
      if (paramMessage.arg1 != 0);
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(a.b(this.a).f);
        if (localFile.exists())
          localFile.delete();
        label298: a.a(this.a).a(paramMessage.arg1, (String)paramMessage.obj, a.b(this.a).f, a.b(this.a).g);
      }
      catch (Exception localException)
      {
        break label298;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.a.a.1
 * JD-Core Version:    0.6.2
 */