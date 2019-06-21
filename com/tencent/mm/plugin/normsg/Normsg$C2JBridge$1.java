package com.tencent.mm.plugin.normsg;

import android.util.Base64;
import com.tencent.d.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class Normsg$C2JBridge$1
  implements b
{
  Normsg$C2JBridge$1(String[] paramArrayOfString, CountDownLatch paramCountDownLatch)
  {
  }

  public final boolean m(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(10254);
    if (paramInt == 0)
    {
      paramArrayOfByte = Base64.encodeToString(paramArrayOfByte, 2);
      this.oTD[0] = paramArrayOfByte;
      bool = true;
    }
    this.val$latch.countDown();
    AppMethodBeat.o(10254);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.Normsg.C2JBridge.1
 * JD-Core Version:    0.6.2
 */