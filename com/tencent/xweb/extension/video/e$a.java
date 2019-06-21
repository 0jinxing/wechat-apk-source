package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.ReflectMethod;

public final class e$a
  implements b
{
  ReflectMethod AOF;
  private ReflectMethod AOG;
  private ReflectMethod AOH;
  private ReflectMethod AOI;
  private Object AOJ;
  private ReflectMethod hasEnteredFullscreenMethod;
  private ReflectMethod onHideCustomViewMethod;

  public e$a(Object paramObject)
  {
    AppMethodBeat.i(84632);
    this.AOJ = paramObject;
    this.AOF = new ReflectMethod(paramObject, "init", new Class[] { Activity.class, View.class, View.class, Context.class, String.class });
    this.AOG = new ReflectMethod(paramObject, "evaluteJavascript", new Class[] { Boolean.TYPE, Boolean.TYPE });
    this.AOH = new ReflectMethod(paramObject, "onShowCustomView", new Class[] { View.class, WebChromeClient.CustomViewCallback.class });
    this.onHideCustomViewMethod = new ReflectMethod(paramObject, "onHideCustomView", new Class[0]);
    this.hasEnteredFullscreenMethod = new ReflectMethod(paramObject, "hasEnteredFullscreen", new Class[0]);
    this.AOI = new ReflectMethod(paramObject, "registerJavascriptInterface", new Class[] { Object.class });
    AppMethodBeat.o(84632);
  }

  public final void am(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(84633);
    this.AOG.invoke(new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    AppMethodBeat.o(84633);
  }

  public final void dh(Object paramObject)
  {
    AppMethodBeat.i(84634);
    this.AOI.invoke(new Object[] { paramObject });
    AppMethodBeat.o(84634);
  }

  public final boolean hasEnteredFullscreen()
  {
    AppMethodBeat.i(84637);
    boolean bool = ((Boolean)this.hasEnteredFullscreenMethod.invoke(new Object[0])).booleanValue();
    AppMethodBeat.o(84637);
    return bool;
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(84636);
    this.onHideCustomViewMethod.invoke(new Object[0]);
    AppMethodBeat.o(84636);
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(84635);
    this.AOH.invoke(new Object[] { paramView, paramCustomViewCallback });
    AppMethodBeat.o(84635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.e.a
 * JD-Core Version:    0.6.2
 */