package com.tencent.xweb.sys;

import android.webkit.JsResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.h;

public final class c$d extends h
{
  public JsResult APK;

  public c$d(JsResult paramJsResult)
  {
    this.APK = paramJsResult;
  }

  public final void cancel()
  {
    AppMethodBeat.i(84657);
    if (this.APK != null)
      this.APK.cancel();
    AppMethodBeat.o(84657);
  }

  public final void confirm()
  {
    AppMethodBeat.i(84656);
    if (this.APK != null)
      this.APK.confirm();
    AppMethodBeat.o(84656);
  }

  public final void confirmWithResult(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.c.d
 * JD-Core Version:    0.6.2
 */