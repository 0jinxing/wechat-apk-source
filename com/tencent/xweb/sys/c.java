package com.tencent.xweb.sys;

import android.os.Build.VERSION;
import android.webkit.JsPromptResult;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.g;
import com.tencent.xweb.o;
import org.xwalk.core.Log;

public final class c
{
  public static WebResourceResponse a(o paramo)
  {
    AppMethodBeat.i(84659);
    if (paramo == null)
    {
      paramo = null;
      AppMethodBeat.o(84659);
    }
    while (true)
    {
      return paramo;
      if ((paramo.AMD) && (Build.VERSION.SDK_INT >= 21))
      {
        try
        {
          WebResourceResponse localWebResourceResponse1 = new android/webkit/WebResourceResponse;
          localWebResourceResponse1.<init>(paramo.mMimeType, paramo.mEncoding, paramo.mStatusCode, paramo.mReasonPhrase, paramo.mResponseHeaders, paramo.mInputStream);
          AppMethodBeat.o(84659);
          paramo = localWebResourceResponse1;
        }
        catch (Exception localException)
        {
          Log.e("SysWebDataTrans", "create webkit WebResourceResponse error :" + localException.getMessage());
        }
      }
      else
      {
        WebResourceResponse localWebResourceResponse2 = new WebResourceResponse(paramo.mMimeType, paramo.mEncoding, paramo.mInputStream);
        if (Build.VERSION.SDK_INT >= 21)
        {
          if ((paramo.mStatusCode > 100) && (paramo.mReasonPhrase != null) && (!paramo.mReasonPhrase.isEmpty()))
            localWebResourceResponse2.setStatusCodeAndReasonPhrase(paramo.mStatusCode, paramo.mReasonPhrase);
          localWebResourceResponse2.setResponseHeaders(paramo.mResponseHeaders);
        }
        AppMethodBeat.o(84659);
        paramo = localWebResourceResponse2;
      }
    }
  }

  public static final class c extends g
  {
    public JsPromptResult APJ;

    public c(JsPromptResult paramJsPromptResult)
    {
      this.APJ = paramJsPromptResult;
    }

    public final void cancel()
    {
      AppMethodBeat.i(84655);
      if (this.APJ != null)
        this.APJ.cancel();
      AppMethodBeat.o(84655);
    }

    public final void confirm()
    {
      AppMethodBeat.i(84654);
      if (this.APJ != null)
        this.APJ.confirm();
      AppMethodBeat.o(84654);
    }

    public final void confirmWithResult(String paramString)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.c
 * JD-Core Version:    0.6.2
 */