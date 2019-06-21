package com.tencent.mm.bj;

import android.graphics.Point;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class h$a extends ak
{
  private Point fYS = null;

  public h$a(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(50946);
    byte[] arrayOfByte;
    long l;
    int i;
    int j;
    if (paramMessage.what == h.access$100())
    {
      arrayOfByte = (byte[])paramMessage.obj;
      if (paramMessage.arg1 != 1)
        break label161;
      l = paramMessage.arg2;
      if (h.a(this.fYR) != null)
      {
        this.fYS = h.b(this.fYR).alJ();
        if (h.c(this.fYR) == null)
          break label166;
        i = h.c(this.fYR).getInteger("width");
        j = h.c(this.fYR).getInteger("height");
      }
    }
    while (true)
    {
      h.a(this.fYR).a(arrayOfByte, i, j, this.fYS.x, this.fYS.y, bool, l, h.b(this.fYR).alK());
      b.fXS.g(arrayOfByte);
      AppMethodBeat.o(50946);
      return;
      label161: bool = false;
      break;
      label166: j = 0;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.h.a
 * JD-Core Version:    0.6.2
 */