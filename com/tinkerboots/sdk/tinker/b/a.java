package com.tinkerboots.sdk.tinker.b;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.lib.util.c;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class a extends com.tencent.tinker.lib.d.a
{
  public a(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(File paramFile, int paramInt, long paramLong)
  {
    AppMethodBeat.i(65536);
    super.a(paramFile, paramInt, paramLong);
    Looper.getMainLooper();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        AppMethodBeat.i(65535);
        c.jc(a.this.context).dSj();
        AppMethodBeat.o(65535);
        return false;
      }
    });
    AppMethodBeat.o(65536);
  }

  public final void a(File paramFile, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(65539);
    super.a(paramFile, paramInt, paramBoolean);
    if (paramInt == 1)
    {
      paramFile = com.tencent.tinker.lib.e.a.iX(this.context).ABJ;
      if ((paramFile.ABO != null) && ("00000000000000000000000000000000".equals(paramFile.ABO)))
      {
        com.tencent.tinker.lib.util.a.e("Tinker.ServerLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
        ShareTinkerInternals.jr(this.context);
      }
    }
    AppMethodBeat.o(65539);
  }

  public final void a(String paramString1, String paramString2, File paramFile, String paramString3)
  {
    AppMethodBeat.i(65538);
    super.a(paramString1, paramString2, paramFile, paramString3);
    AppMethodBeat.o(65538);
  }

  public final void a(Throwable paramThrowable, int paramInt)
  {
    AppMethodBeat.i(65537);
    super.a(paramThrowable, paramInt);
    AppMethodBeat.o(65537);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.tinker.b.a
 * JD-Core Version:    0.6.2
 */