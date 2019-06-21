package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.u;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.k;
import java.nio.ByteBuffer;

final class w$1 extends u
{
  w$1(w paramw)
  {
  }

  public final int CC()
  {
    AppMethodBeat.i(86779);
    int i;
    if (this.gQl.gQi != null)
    {
      i = this.gQl.gQi.getNativeBufferId();
      AppMethodBeat.o(86779);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(86779);
    }
  }

  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(86781);
    if (this.gQl.gQi != null)
      this.gQl.gQi.setNativeBuffer(paramInt, paramByteBuffer);
    AppMethodBeat.o(86781);
  }

  public final ByteBuffer gq(int paramInt)
  {
    AppMethodBeat.i(86780);
    ByteBuffer localByteBuffer;
    if (this.gQl.gQi != null)
    {
      localByteBuffer = this.gQl.gQi.getNativeBuffer(paramInt);
      AppMethodBeat.o(86780);
    }
    while (true)
    {
      return localByteBuffer;
      localByteBuffer = null;
      AppMethodBeat.o(86780);
    }
  }

  public final void h(int paramInt, String paramString)
  {
    AppMethodBeat.i(86782);
    this.gQl.gNC.aBx().evaluateJavascript(String.format("typeof WeixinWorker.workerMsgHandler !== 'undefined' && WeixinWorker.workerMsgHandler(%d, %s);", new Object[] { Integer.valueOf(paramInt), paramString }), null);
    AppMethodBeat.o(86782);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.w.1
 * JD-Core Version:    0.6.2
 */