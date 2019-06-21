package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public final class d
{
  private static int yrY = 0;

  public static void hI(Context paramContext)
  {
    AppMethodBeat.i(29988);
    if (yrY > 0)
      AppMethodBeat.o(29988);
    while (true)
    {
      return;
      paramContext = new d.a(paramContext, LayoutInflater.from(paramContext).inflate(2130970963, null));
      paramContext.yrG.addView(paramContext.yrF, paramContext.yrH);
      yrY += 1;
      AppMethodBeat.o(29988);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.d
 * JD-Core Version:    0.6.2
 */