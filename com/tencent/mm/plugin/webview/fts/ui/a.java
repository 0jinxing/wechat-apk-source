package com.tencent.mm.plugin.webview.fts.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.fts.c.c;

public final class a
{
  int JB;
  float hXK;
  float iaA;
  int iaB;
  int iaC;
  Runnable iaD;
  View iaw;
  GestureDetector iay;
  Context mContext;
  a.a ugG;
  a.b ugH;

  public a(Context paramContext, View paramView, a.b paramb)
  {
    AppMethodBeat.i(5822);
    this.ugG = a.a.ugJ;
    this.hXK = 0.0F;
    this.JB = 0;
    this.iaA = 0.0F;
    this.iaB = -1;
    this.iaC = 0;
    this.iaD = new a.1(this);
    this.mContext = paramContext;
    this.ugH = paramb;
    this.iaw = paramView;
    this.iay = new GestureDetector(this.mContext, new a.2(this));
    this.hXK = c.cN(paramContext);
    AppMethodBeat.o(5822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.a
 * JD-Core Version:    0.6.2
 */