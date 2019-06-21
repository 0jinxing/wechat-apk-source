package com.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a extends Handler
{
  private final int bCd = 2001;
  private final int bCe = 2002;
  private final int bCf = 2003;
  private final int bCg = 2004;
  private final int bCh = 2005;
  private final int bCi = 2006;

  public a$a(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = 2005;
    AppMethodBeat.i(118245);
    new StringBuilder("what = ").append(paramMessage.what);
    switch (paramMessage.what)
    {
    case 4:
    case 5:
    default:
    case 1:
    case 2:
    case 3:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      AppMethodBeat.o(118245);
      while (true)
      {
        return;
        if (this.bCc.bBZ == null)
          break;
        this.bCc.bBZ.vR();
        AppMethodBeat.o(118245);
        continue;
        if (this.bCc.bBZ == null)
          break;
        this.bCc.bBZ.vR();
        AppMethodBeat.o(118245);
        continue;
        if (this.bCc.bBZ == null)
          break;
        this.bCc.bBZ.vR();
        AppMethodBeat.o(118245);
        continue;
        if (this.bCc.bBZ != null)
          this.bCc.bBZ.bJ(0, paramMessage.arg1);
        removeMessages(8);
        AppMethodBeat.o(118245);
      }
      if (this.bCc.bBZ != null)
        switch (paramMessage.arg1)
        {
        default:
          i = 2020;
        case 2003:
        case 2006:
        case 2001:
        case 2002:
        case 2004:
        case 2005:
        }
      while (true)
      {
        this.bCc.bBZ.bJ(i, -1);
        removeMessages(8);
        AppMethodBeat.o(118245);
        break;
        i = 2002;
        continue;
        i = 2003;
        continue;
        i = 2000;
        continue;
        i = 2006;
      }
      if (this.bCc.bBZ != null)
        this.bCc.bBZ.bJ(2001, -1);
      removeMessages(8);
      this.bCc.abort();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.a.a.a.a
 * JD-Core Version:    0.6.2
 */