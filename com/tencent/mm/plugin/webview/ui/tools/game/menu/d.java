package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;

public final class d
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private ViewTreeObserver aaM;
  private Context mContext;
  private View pP;
  private l rBn;
  private e uEI;
  public b.b uEJ;
  private GameMenuView uEK;
  private f uEL;
  private boolean uEM;
  private boolean uEN;
  public boolean uEO;
  public boolean uEP;

  public d(Context paramContext)
  {
    AppMethodBeat.i(8820);
    this.uEM = false;
    this.uEP = false;
    this.mContext = paramContext;
    if ((this.mContext instanceof Activity))
    {
      paramContext = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (paramContext.getChildCount() <= 0)
        break label158;
    }
    label158: for (this.pP = paramContext.getChildAt(0); ; this.pP = paramContext)
    {
      paramContext = this.mContext;
      this.rBn = new l(paramContext);
      this.uEI = new e(paramContext);
      this.uEK = new GameMenuView(paramContext);
      this.uEL = new f(paramContext);
      this.uEK.setAdapter(this.uEL);
      this.uEM = isLandscape();
      this.uEI.setContentView(this.uEK);
      AppMethodBeat.o(8820);
      return;
    }
  }

  @TargetApi(23)
  private void dcd()
  {
    AppMethodBeat.i(8821);
    if ((Build.VERSION.SDK_INT >= 23) && (this.uEI != null))
    {
      this.uEI.getWindow().getDecorView().setSystemUiVisibility(9216);
      this.uEI.getWindow().setStatusBarColor(0);
    }
    AppMethodBeat.o(8821);
  }

  private boolean isLandscape()
  {
    AppMethodBeat.i(8826);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    boolean bool;
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      bool = true;
      AppMethodBeat.o(8826);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8826);
    }
  }

  private boolean isShowing()
  {
    boolean bool = false;
    AppMethodBeat.i(8824);
    if (this.uEI != null)
      if (this.uEI.isShowing())
      {
        bool = true;
        AppMethodBeat.o(8824);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(8824);
      continue;
      AppMethodBeat.o(8824);
    }
  }

  public final void a(b.c paramc)
  {
    AppMethodBeat.i(8825);
    if (this.uEK != null)
      this.uEK.setGameMenuItemSelectedListener(paramc);
    AppMethodBeat.o(8825);
  }

  public final void cpD()
  {
    int i = 0;
    AppMethodBeat.i(8822);
    this.uEM = isLandscape();
    if (this.uEJ != null)
      this.uEJ.a(this.rBn);
    if (this.uEI != null)
    {
      if (this.uEL != null)
        this.uEL.b(this.rBn);
      if (Build.VERSION.SDK_INT >= 21)
        this.uEI.getWindow().addFlags(-2147483648);
      if (this.uEN)
        dcd();
      if (this.uEO)
        this.uEI.getWindow().addFlags(1024);
      if (!this.uEP)
        break label250;
      this.uEI.getWindow().setFlags(8, 8);
      this.uEI.getWindow().addFlags(131200);
      this.uEI.getWindow().getDecorView().setSystemUiVisibility(6);
    }
    while (true)
    {
      if (this.pP != null)
      {
        if (this.aaM == null)
          i = 1;
        this.aaM = this.pP.getViewTreeObserver();
        if (i != 0)
          this.aaM.addOnGlobalLayoutListener(this);
      }
      this.uEI.setOnDismissListener(new d.1(this));
      if (this.uEK != null)
        this.uEK.setDismissListener(new b.a()
        {
          public final void onDismiss()
          {
            AppMethodBeat.i(8818);
            d.this.cpE();
            AppMethodBeat.o(8818);
          }
        });
      this.uEI.show();
      AppMethodBeat.o(8822);
      return;
      label250: this.uEI.getWindow().clearFlags(8);
      this.uEI.getWindow().clearFlags(131072);
      this.uEI.getWindow().clearFlags(128);
      this.uEI.getWindow().getDecorView().setSystemUiVisibility(0);
    }
  }

  public final void cpE()
  {
    AppMethodBeat.i(8823);
    if (this.aaM != null)
    {
      if (!this.aaM.isAlive())
        this.aaM = this.pP.getViewTreeObserver();
      this.aaM.removeGlobalOnLayoutListener(this);
      this.aaM = null;
    }
    if (this.uEI != null)
      this.uEI.dismiss();
    AppMethodBeat.o(8823);
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(8819);
    if (isShowing())
    {
      View localView = this.pP;
      if ((localView == null) || (!localView.isShown()))
      {
        cpE();
        AppMethodBeat.o(8819);
      }
    }
    while (true)
    {
      return;
      if ((isShowing()) && (this.uEM != isLandscape()))
        cpE();
      AppMethodBeat.o(8819);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.d
 * JD-Core Version:    0.6.2
 */