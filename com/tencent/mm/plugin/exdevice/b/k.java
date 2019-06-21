package com.tencent.mm.plugin.exdevice.b;

import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;

public final class k
  implements com.tencent.mm.ai.f
{
  public static k lqI = null;
  private final HashMap<Long, k.e> lqH;
  public HashMap<String, Integer> lqJ;
  public ak mHandler;

  private k()
  {
    AppMethodBeat.i(19064);
    this.lqH = new HashMap();
    this.mHandler = null;
    this.lqJ = new HashMap();
    this.mHandler = new k.a(this, aw.RS().oAl.getLooper());
    AppMethodBeat.o(19064);
  }

  public static k bow()
  {
    AppMethodBeat.i(19063);
    k localk;
    if (lqI != null)
    {
      localk = lqI;
      AppMethodBeat.o(19063);
    }
    while (true)
    {
      return localk;
      localk = new k();
      lqI = localk;
      AppMethodBeat.o(19063);
    }
  }

  public final void b(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19065);
    paramArrayOfByte = new f(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mHandler.obtainMessage(1, paramInt1, 0, paramArrayOfByte).sendToTarget();
    AppMethodBeat.o(19065);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(19066);
    ab.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "******onSceneEnd******\r\n errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    k.b localb = new k.b((byte)0);
    localb.lqz = paramInt2;
    localb.lqL = paramInt1;
    localb.hxN = paramString;
    localb.lqM = paramm;
    this.mHandler.obtainMessage(2, localb).sendToTarget();
    AppMethodBeat.o(19066);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.k
 * JD-Core Version:    0.6.2
 */