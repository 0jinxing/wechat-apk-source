package com.tencent.xweb.x5;

import android.webkit.JavascriptInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class h$a
{
  private static final AtomicInteger Nj;
  HashMap<Integer, byte[]> ciD;

  static
  {
    AppMethodBeat.i(84841);
    Nj = new AtomicInteger(1);
    AppMethodBeat.o(84841);
  }

  public h$a()
  {
    AppMethodBeat.i(84837);
    this.ciD = new HashMap();
    AppMethodBeat.o(84837);
  }

  @JavascriptInterface
  public final byte[] getNativeBuffer(int paramInt)
  {
    AppMethodBeat.i(84840);
    byte[] arrayOfByte = (byte[])this.ciD.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(84840);
    return arrayOfByte;
  }

  @JavascriptInterface
  public final int getNativeBufferId()
  {
    AppMethodBeat.i(84838);
    int i;
    int k;
    do
    {
      i = Nj.get();
      int j = i + 1;
      k = j;
      if (j > 16777215)
        k = 1;
    }
    while (!Nj.compareAndSet(i, k));
    AppMethodBeat.o(84838);
    return i;
  }

  @JavascriptInterface
  public final void setNativeBuffer(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(84839);
    this.ciD.put(Integer.valueOf(paramInt), paramArrayOfByte);
    AppMethodBeat.o(84839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.h.a
 * JD-Core Version:    0.6.2
 */