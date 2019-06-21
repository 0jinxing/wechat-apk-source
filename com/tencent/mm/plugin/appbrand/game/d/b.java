package com.tencent.mm.plugin.appbrand.game.d;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.l;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;
import java.util.LinkedList;

public final class b extends WebView
{
  private MBRuntime bSv;
  boolean hrA;
  public View hrB;
  private LinkedList<String> hrC;
  private boolean hrD;

  public b(MBRuntime paramMBRuntime, Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(130165);
    this.hrA = false;
    this.hrD = false;
    this.bSv = paramMBRuntime;
    getSettings().setJavaScriptEnabled(true);
    this.hrB = new a(getContext());
    this.hrB.setOnClickListener(new b.1(this));
    setWebViewClient(new b.2(this));
    loadUrl("wagame://WAGameVConsole.html");
    setTranslationY(100000.0F);
    setVisibility(8);
    AppMethodBeat.o(130165);
  }

  private void Av(String paramString)
  {
    AppMethodBeat.i(130168);
    paramString = l.Ej(paramString);
    if (Build.VERSION.SDK_INT >= 19)
    {
      evaluateJavascript("console._log('" + paramString + "')", null);
      AppMethodBeat.o(130168);
    }
    while (true)
    {
      return;
      loadUrl("javascript:console._log('" + paramString + "')");
      AppMethodBeat.o(130168);
    }
  }

  final int getDisplayHeight()
  {
    AppMethodBeat.i(130166);
    int i = (int)(this.bSv.getSystemDisplayHeight() * getContext().getResources().getDisplayMetrics().density);
    AppMethodBeat.o(130166);
    return i + 1;
  }

  public final void log(String paramString)
  {
    AppMethodBeat.i(130167);
    if (this.hrD)
    {
      Av(paramString);
      AppMethodBeat.o(130167);
    }
    while (true)
    {
      return;
      if (this.hrC == null)
        this.hrC = new LinkedList();
      this.hrC.add(paramString);
      AppMethodBeat.o(130167);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.b
 * JD-Core Version:    0.6.2
 */