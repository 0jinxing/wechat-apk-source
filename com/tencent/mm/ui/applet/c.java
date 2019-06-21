package com.tencent.mm.ui.applet;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.b;

public final class c
{
  public static void hH(Context paramContext)
  {
    AppMethodBeat.i(29978);
    new c.a(paramContext, LayoutInflater.from(paramContext).inflate(2130970963, null)).show();
    AppMethodBeat.o(29978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.c
 * JD-Core Version:    0.6.2
 */