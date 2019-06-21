package com.tencent.luggage.bridge.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.luggage.bridge.s;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.a.a;

public class BridgedAndroidWebViewBase extends WebView
  implements s
{
  private static boolean bOT = false;

  public BridgedAndroidWebViewBase(Context paramContext)
  {
    this(paramContext, null);
  }

  public BridgedAndroidWebViewBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BridgedAndroidWebViewBase(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(90754);
    getSettings().setDomStorageEnabled(true);
    getSettings().setJavaScriptEnabled(true);
    if (Build.VERSION.SDK_INT >= 19)
      setWebContentsDebuggingEnabled(true);
    AppMethodBeat.o(90754);
  }

  private boolean bA(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(90758);
    try
    {
      Object localObject = a.ep(a.ep(this).awS("mProvider").object).awS("mWebViewCore").object;
      paramString = Message.obtain(null, 194, paramString);
      a.ep(localObject).u("sendMessage", new Object[] { paramString });
      AppMethodBeat.o(90758);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        d.e(getClass().getName(), "reflectEvalJS, exception = %s", new Object[] { paramString });
        AppMethodBeat.o(90758);
        bool = false;
      }
    }
  }

  @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(90755);
    if (Build.VERSION.SDK_INT < 17)
      AppMethodBeat.o(90755);
    while (true)
    {
      return;
      addJavascriptInterface(paramObject, paramString);
      AppMethodBeat.o(90755);
    }
  }

  public final void by(String paramString)
  {
    AppMethodBeat.i(90756);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      bz(paramString);
      AppMethodBeat.o(90756);
    }
    while (true)
    {
      return;
      post(new BridgedAndroidWebViewBase.1(this, paramString));
      AppMethodBeat.o(90756);
    }
  }

  public final void bz(String paramString)
  {
    AppMethodBeat.i(90757);
    if (TextUtils.isEmpty(paramString))
    {
      d.e("BridgedAndroidWebViewBase", "Empty script");
      AppMethodBeat.o(90757);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 19)
      {
        super.evaluateJavascript(paramString, null);
        AppMethodBeat.o(90757);
      }
      else
      {
        if (bOT)
        {
          if (bA(paramString))
            break label86;
          bOT = false;
        }
        try
        {
          super.loadUrl("javascript:".concat(String.valueOf(paramString)));
          AppMethodBeat.o(90757);
          continue;
          label86: AppMethodBeat.o(90757);
        }
        catch (Exception paramString)
        {
          d.i("BridgedAndroidWebViewBase", "evaluateJavascript failed : %s", new Object[] { paramString });
          AppMethodBeat.o(90757);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.BridgedAndroidWebViewBase
 * JD-Core Version:    0.6.2
 */