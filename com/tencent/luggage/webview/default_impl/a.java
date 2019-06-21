package com.tencent.luggage.webview.default_impl;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.tencent.luggage.d.k;
import com.tencent.luggage.webview.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class a
  implements com.tencent.luggage.webview.a
{
  private k bPN;
  private DefaultWebView bRJ;
  private Handler bRK;
  private Context mContext;

  public a(Context paramContext)
  {
    AppMethodBeat.i(90930);
    this.bRK = new Handler(Looper.getMainLooper());
    this.mContext = paramContext;
    this.bRJ = new DefaultWebView(paramContext);
    AppMethodBeat.o(90930);
  }

  public final void a(final a.a parama)
  {
    AppMethodBeat.i(90931);
    parama = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(90919);
        a.a(a.this, parama);
        AppMethodBeat.o(90919);
      }
    };
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      parama.run();
      AppMethodBeat.o(90931);
    }
    while (true)
    {
      return;
      this.bRK.post(parama);
      AppMethodBeat.o(90931);
    }
  }

  public void addJavascriptInterface(final Object paramObject, final String paramString)
  {
    AppMethodBeat.i(90940);
    paramObject = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(90921);
        a.a(a.this).addJavascriptInterface(paramObject, paramString);
        AppMethodBeat.o(90921);
      }
    };
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      paramObject.run();
      AppMethodBeat.o(90940);
    }
    while (true)
    {
      return;
      this.bRK.post(paramObject);
      AppMethodBeat.o(90940);
    }
  }

  public final void by(String paramString)
  {
    AppMethodBeat.i(90941);
    paramString = new a.4(this, paramString);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      paramString.run();
      AppMethodBeat.o(90941);
    }
    while (true)
    {
      return;
      this.bRK.post(paramString);
      AppMethodBeat.o(90941);
    }
  }

  public boolean canGoBack()
  {
    AppMethodBeat.i(90938);
    boolean bool = this.bRJ.canGoBack();
    AppMethodBeat.o(90938);
    return bool;
  }

  public void destroy()
  {
    AppMethodBeat.i(90939);
    this.bRJ.destroy();
    AppMethodBeat.o(90939);
  }

  public Context getContext()
  {
    return this.mContext;
  }

  public View getView()
  {
    return this.bRJ;
  }

  public void goBack()
  {
    AppMethodBeat.i(90937);
    this.bRJ.goBack();
    AppMethodBeat.o(90937);
  }

  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(90935);
    this.bRJ.loadData(paramString1, paramString2, paramString3);
    AppMethodBeat.o(90935);
  }

  public void loadUrl(String paramString)
  {
    AppMethodBeat.i(90933);
    paramString = new a.2(this, paramString);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      paramString.run();
      AppMethodBeat.o(90933);
    }
    while (true)
    {
      return;
      this.bRK.post(paramString);
      AppMethodBeat.o(90933);
    }
  }

  public void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(90934);
    this.bRJ.loadUrl(paramString, paramMap);
    AppMethodBeat.o(90934);
  }

  public void setContext(Context paramContext)
  {
    AppMethodBeat.i(90932);
    if ((this.mContext instanceof MutableContextWrapper))
      ((MutableContextWrapper)this.mContext).setBaseContext(paramContext);
    AppMethodBeat.o(90932);
  }

  public void setWebCore(k paramk)
  {
    this.bPN = paramk;
  }

  public void stopLoading()
  {
    AppMethodBeat.i(90936);
    this.bRJ.stopLoading();
    AppMethodBeat.o(90936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.webview.default_impl.a
 * JD-Core Version:    0.6.2
 */