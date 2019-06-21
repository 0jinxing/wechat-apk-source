package com.tencent.mm.plugin.mmsight.model.b;

import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.sdk.g.d;

final class b$1
  implements h
{
  b$1(b paramb)
  {
  }

  public final void a(byte[] paramArrayOfByte, boolean paramBoolean, long paramLong)
  {
    int i = 1;
    AppMethodBeat.i(76691);
    if (b.a(this.oxm) == null)
    {
      b.a(this.oxm, d.ek("remuxer_encode", -2));
      b.a(this.oxm).start();
      b.a(this.oxm, new b.a(this.oxm, b.a(this.oxm).getLooper()));
    }
    Message localMessage;
    byte[] arrayOfByte;
    if (b.b(this.oxm) != null)
    {
      localMessage = Message.obtain();
      localMessage.what = 1;
      if (paramArrayOfByte == null)
        break label170;
      arrayOfByte = j.owk.g(Integer.valueOf(paramArrayOfByte.length));
      if (arrayOfByte != null)
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, arrayOfByte.length);
      localMessage.obj = arrayOfByte;
      if (!paramBoolean)
        break label176;
    }
    while (true)
    {
      localMessage.arg1 = i;
      localMessage.arg2 = ((int)paramLong);
      b.b(this.oxm).sendMessage(localMessage);
      AppMethodBeat.o(76691);
      return;
      label170: arrayOfByte = null;
      break;
      label176: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.b.1
 * JD-Core Version:    0.6.2
 */