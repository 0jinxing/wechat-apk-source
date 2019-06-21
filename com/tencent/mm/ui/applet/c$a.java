package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$a
{
  private ImageView cDh;
  private View mView;
  FrameLayout yrF;
  WindowManager yrG;
  WindowManager.LayoutParams yrH;
  private ViewGroup.LayoutParams yrI;

  public c$a(Context paramContext, View paramView)
  {
    AppMethodBeat.i(29975);
    if ((this.yrF != null) && (this.yrG != null))
      AppMethodBeat.o(29975);
    while (true)
    {
      return;
      paramView.findViewById(2131828350).setVisibility(8);
      this.cDh = ((ImageView)paramView.findViewById(2131820869));
      ((ImageView)paramView.findViewById(2131828351)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(29972);
          c.a.this.dzo();
          AppMethodBeat.o(29972);
        }
      });
      this.yrH = new WindowManager.LayoutParams();
      this.yrH.height = -2;
      this.yrH.width = -2;
      this.yrG = ((WindowManager)paramContext.getSystemService("window"));
      this.yrH.x = 0;
      this.yrH.y = 0;
      this.yrH.flags = 40;
      this.yrH.type = 2002;
      this.mView = paramView;
      this.yrH.gravity = 51;
      this.yrH.format = 1;
      this.yrF = new FrameLayout(paramContext);
      this.yrF.setPadding(4, 4, 4, 4);
      this.yrI = new ViewGroup.LayoutParams(-2, -2);
      this.yrF.addView(this.mView, this.yrI);
      paramContext = paramContext.getResources().getDisplayMetrics();
      this.yrF.setOnTouchListener(new c.a.2(this, paramContext));
      AppMethodBeat.o(29975);
    }
  }

  public final void dzo()
  {
    AppMethodBeat.i(29977);
    try
    {
      if (this.yrG != null)
      {
        if (this.yrF != null)
          this.yrG.removeView(this.yrF);
        this.yrG = null;
      }
      if (this.yrF != null)
      {
        this.yrF.removeAllViews();
        this.yrF = null;
      }
      this.mView = null;
      AppMethodBeat.o(29977);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(29977);
    }
  }

  public final void show()
  {
    AppMethodBeat.i(29976);
    this.yrG.addView(this.yrF, this.yrH);
    AppMethodBeat.o(29976);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.c.a
 * JD-Core Version:    0.6.2
 */