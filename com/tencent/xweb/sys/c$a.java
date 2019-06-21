package com.tencent.xweb.sys;

import android.webkit.SslErrorHandler;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.j;

@JgClassChecked(author=30, fComment="checked", lastDate="20171024", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class c$a
  implements j
{
  SslErrorHandler APG;

  public c$a(SslErrorHandler paramSslErrorHandler)
  {
    this.APG = paramSslErrorHandler;
  }

  public final void cancel()
  {
    AppMethodBeat.i(84650);
    this.APG.cancel();
    AppMethodBeat.o(84650);
  }

  public final void proceed()
  {
    AppMethodBeat.i(84649);
    this.APG.proceed();
    AppMethodBeat.o(84649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.c.a
 * JD-Core Version:    0.6.2
 */