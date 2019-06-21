package com.tencent.mm.ui.i;

import android.content.Context;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.f.a.f;

final class a$1 extends ak
{
  a$1(a parama)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(80340);
    String str;
    Context localContext;
    a locala;
    if (paramMessage.what == 1000)
    {
      str = (String)paramMessage.obj;
      if (str == null)
        break label147;
      localContext = this.zLa.context;
      locala = this.zLa;
      if (localContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0)
        break label130;
      f.L(localContext, "Error", "Application requires permission to access the Internet");
    }
    while (true)
    {
      if (paramMessage.what == 1010)
      {
        paramMessage = (a.c)paramMessage.obj;
        locala = this.zLa;
        locala.zKX = false;
        if (paramMessage == a.c.zLe)
        {
          locala.zKV = null;
          a.a(null);
        }
        if (locala.zKZ != null)
          locala.zKZ.b(paramMessage);
      }
      AppMethodBeat.o(80340);
      return;
      label130: new b(localContext, str, locala).show();
      continue;
      label147: this.zLa.c(a.c.zLe);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.a.1
 * JD-Core Version:    0.6.2
 */