package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.ILog;

final class Logger$1
  implements ILog
{
  public final void d(String paramString1, String paramString2)
  {
  }

  public final void e(String paramString1, String paramString2)
  {
  }

  public final void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
  }

  public final void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105542);
    String.format(paramString2, paramArrayOfObject);
    AppMethodBeat.o(105542);
  }

  public final void e(String paramString, Throwable paramThrowable)
  {
  }

  public final void i(String paramString1, String paramString2)
  {
  }

  public final void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
  }

  public final void w(String paramString1, String paramString2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.Logger.1
 * JD-Core Version:    0.6.2
 */