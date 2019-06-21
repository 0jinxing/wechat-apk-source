package com.tencent.mm.sandbox.updater;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sandbox.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.File;

final class c$1 extends ak
{
  c$1(c paramc)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(28856);
    if ((1 == paramMessage.what) && (!c.a(this.xwc)))
    {
      new File(this.xwc.alN()).delete();
      if (paramMessage.arg1 != 0)
        break label91;
      ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "patch ok");
      c.b(this.xwc).b(200, 0, (btd)paramMessage.obj);
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      AppMethodBeat.o(28856);
      return;
      label91: if (paramMessage.arg1 == 3)
        c.b(this.xwc).b(3, -1, (btd)paramMessage.obj);
      else if (paramMessage.arg1 == 4)
        c.b(this.xwc).b(4, -1, (btd)paramMessage.obj);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.c.1
 * JD-Core Version:    0.6.2
 */