package com.tencent.luggage.webview.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class a
  implements c
{
  private Context mContext;

  public a(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final WebResourceResponse bG(String paramString)
  {
    AppMethodBeat.i(90943);
    try
    {
      InputStream localInputStream = this.mContext.getAssets().open("LuggageBridge.js");
      paramString = new android/webkit/WebResourceResponse;
      paramString.<init>("application/javascript", "UTF-8", localInputStream);
      AppMethodBeat.o(90943);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(90943);
      }
    }
  }

  public final String yk()
  {
    return "^luggage://bridge$";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.webview.a.a
 * JD-Core Version:    0.6.2
 */