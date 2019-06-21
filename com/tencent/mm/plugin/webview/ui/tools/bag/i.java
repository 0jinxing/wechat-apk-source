package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ay;

public final class i
{
  static void a(g paramg, Point paramPoint, float paramFloat, e parame)
  {
    AppMethodBeat.i(8178);
    ay.au(ah.getContext(), 2131306071);
    paramg.a(new i.1(parame, paramg, paramPoint, paramFloat));
    AppMethodBeat.o(8178);
  }

  public static void a(g paramg, Point paramPoint, e parame)
  {
    AppMethodBeat.i(8177);
    a(paramg, paramPoint, -1.0F, parame);
    AppMethodBeat.o(8177);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.i
 * JD-Core Version:    0.6.2
 */