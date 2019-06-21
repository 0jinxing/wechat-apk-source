package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.d;
import com.tencent.mm.cf.d.b;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

public final class d$a
{
  ImageView cDh;
  ProgressBar cDj;
  Context context;
  View mView;
  TextView ngD;
  FrameLayout yrF;
  WindowManager yrG;
  WindowManager.LayoutParams yrH;
  private ViewGroup.LayoutParams yrI;
  boolean yrZ;
  d.b ysa;
  com.tencent.mm.cf.d.a ysb;
  int ysc;
  ak ysd;

  public d$a(Context paramContext, View paramView)
  {
    AppMethodBeat.i(29985);
    this.yrZ = false;
    this.ysa = new d.a.1(this);
    this.ysc = 0;
    this.ysd = new d.a.4(this);
    if ((this.yrF != null) && (this.yrG != null))
      AppMethodBeat.o(29985);
    while (true)
    {
      return;
      d.dvV().ydM = new WeakReference(this.ysa);
      this.ngD = ((TextView)paramView.findViewById(2131822504));
      this.cDh = ((ImageView)paramView.findViewById(2131820869));
      ((ImageView)paramView.findViewById(2131828351)).setOnClickListener(new d.a.2(this));
      this.cDj = ((ProgressBar)paramView.findViewById(2131828350));
      this.cDj.setVisibility(8);
      this.context = paramContext;
      this.yrH = new WindowManager.LayoutParams();
      this.yrH.height = -2;
      this.yrH.width = -2;
      this.yrG = ((WindowManager)paramContext.getSystemService("window"));
      this.yrH.x = 0;
      this.yrH.y = 0;
      this.yrH.flags = 40;
      this.yrH.type = 2002;
      this.mView = paramView;
      this.ngD.setVisibility(8);
      this.yrH.gravity = 51;
      this.yrH.format = 1;
      this.yrF = new FrameLayout(paramContext);
      this.yrF.setPadding(4, 4, 4, 4);
      this.yrI = new ViewGroup.LayoutParams(-2, -2);
      this.yrF.addView(this.mView, this.yrI);
      paramContext = paramContext.getResources().getDisplayMetrics();
      this.yrF.setOnTouchListener(new d.a.3(this, paramContext));
      AppMethodBeat.o(29985);
    }
  }

  final void dzq()
  {
    AppMethodBeat.i(29987);
    this.ngD.setText(this.ysc);
    this.ysd.sendEmptyMessageDelayed(0, 1000L);
    AppMethodBeat.o(29987);
  }

  final void hJ(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(29986);
    this.cDh.setVisibility(0);
    this.cDj.setVisibility(4);
    if (!this.yrZ)
      bool = true;
    this.yrZ = bool;
    this.cDh.setBackgroundDrawable(paramContext.getResources().getDrawable(2130840489));
    this.ngD.setVisibility(8);
    AppMethodBeat.o(29986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.d.a
 * JD-Core Version:    0.6.2
 */