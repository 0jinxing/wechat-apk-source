package com.tencent.mm.plugin.appbrand.page;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.a;
import com.tencent.mm.ui.MMFragmentActivity.a;
import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.SwipeBackLayout.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView;", "Lme/imid/swipebacklayout/lib/SwipeBackLayout;", "Landroid/content/DialogInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionBar", "Lcom/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar;", "appearAnimation", "Landroid/view/animation/Animation;", "dismissAnimation", "drawStatusBarLayout", "Lcom/tencent/mm/ui/statusbar/DrawStatusBarFrameLayout;", "iconImageView", "Landroid/widget/ImageView;", "negativeButton", "Landroid/content/DialogInterface$OnClickListener;", "getNegativeButton", "()Landroid/content/DialogInterface$OnClickListener;", "setNegativeButton", "(Landroid/content/DialogInterface$OnClickListener;)V", "pageContainer", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageContainer;", "positiveButton", "getPositiveButton", "setPositiveButton", "cancel", "", "cleanup", "dismiss", "dismissWithoutAnimation", "dispatchKeyEventPreIme", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onDetachedFromWindow", "resetStyle", "runtime", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "show", "endAction", "Ljava/lang/Runnable;", "plugin-appbrand-integration_release"})
public final class f extends SwipeBackLayout
  implements DialogInterface
{
  private DialogInterface.OnClickListener iqW;
  private DialogInterface.OnClickListener iqX;
  private Animation iqY;
  Animation iqZ;
  q ira;
  private com.tencent.mm.ui.statusbar.b irb;
  com.tencent.mm.plugin.appbrand.widget.actionbar.b irc;
  ImageView ird;

  public f(final Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(134774);
    at.cr((View)this);
    a((SwipeBackLayout.a)new f.1(this));
    Object localObject1 = new com.tencent.mm.ui.statusbar.b(paramContext);
    ((com.tencent.mm.ui.statusbar.b)localObject1).setClickable(true);
    ((com.tencent.mm.ui.statusbar.b)localObject1).setBackgroundColor(-1);
    ((com.tencent.mm.ui.statusbar.b)localObject1).setWillNotDraw(false);
    ((com.tencent.mm.ui.statusbar.b)localObject1).qM(false);
    ((com.tencent.mm.ui.statusbar.b)localObject1).K(0, true);
    this.irb = ((com.tencent.mm.ui.statusbar.b)localObject1);
    addView((View)this.irb, new ViewGroup.LayoutParams(-1, -1));
    setContentView((View)this.irb);
    localObject1 = new com.tencent.mm.plugin.appbrand.widget.actionbar.b(paramContext);
    ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject1).setFullscreenMode(false);
    ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject1).setBackButtonClickListener((View.OnClickListener)new a(this, paramContext));
    ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject1).setCloseButtonClickListener((View.OnClickListener)new f.b(this, paramContext));
    Object localObject2 = this.irb;
    if (localObject2 == null)
      j.dWJ();
    ((com.tencent.mm.ui.statusbar.b)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, a.de(paramContext)));
    this.irc = ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject1);
    localObject1 = LayoutInflater.from(paramContext).inflate(2130968695, (ViewGroup)this.irb, false);
    ((TextView)((View)localObject1).findViewById(2131821110)).setText(2131296718);
    ((TextView)((View)localObject1).findViewById(2131821173)).setText(2131296717);
    localObject2 = this.irb;
    if (localObject2 == null)
      j.dWJ();
    ((com.tencent.mm.ui.statusbar.b)localObject2).addView((View)localObject1);
    j.o(localObject1, "this");
    localObject2 = ((View)localObject1).getLayoutParams();
    localObject1 = localObject2;
    if (!(localObject2 instanceof ViewGroup.MarginLayoutParams))
      localObject1 = null;
    localObject1 = (ViewGroup.MarginLayoutParams)localObject1;
    if (localObject1 != null)
      ((ViewGroup.MarginLayoutParams)localObject1).topMargin = a.de(paramContext);
    this.ird = ((ImageView)findViewById(2131821109));
    findViewById(2131821173).setOnClickListener((View.OnClickListener)new f.2(this));
    AppMethodBeat.o(134774);
  }

  public final void aJc()
  {
    AppMethodBeat.i(134769);
    setVisibility(8);
    cleanup();
    AppMethodBeat.o(134769);
  }

  public final void cancel()
  {
    AppMethodBeat.i(134770);
    dismiss();
    DialogInterface.OnClickListener localOnClickListener = this.iqX;
    if (localOnClickListener != null)
    {
      localOnClickListener.onClick((DialogInterface)this, -2);
      AppMethodBeat.o(134770);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134770);
    }
  }

  public final void cleanup()
  {
    Object localObject1 = null;
    AppMethodBeat.i(134767);
    Object localObject2 = getAnimation();
    if (localObject2 != null)
      ((Animation)localObject2).cancel();
    localObject2 = getAnimation();
    if (localObject2 != null)
      ((Animation)localObject2).setAnimationListener(null);
    localObject2 = getParent();
    if (!(localObject2 instanceof ViewGroup));
    while (true)
    {
      localObject1 = (ViewGroup)localObject1;
      if (localObject1 != null)
      {
        ((ViewGroup)localObject1).removeView((View)this);
        AppMethodBeat.o(134767);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134767);
      }
      localObject1 = localObject2;
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(134768);
    Animation localAnimation = this.iqY;
    if (localAnimation != null)
      localAnimation.cancel();
    this.iqY = AnimationUtils.loadAnimation(getContext(), MMFragmentActivity.a.ynf);
    localAnimation = this.iqY;
    if (localAnimation == null)
      j.dWJ();
    localAnimation.setAnimationListener((Animation.AnimationListener)new f.c(this));
    localAnimation = this.iqY;
    if (localAnimation == null)
      j.dWJ();
    startAnimation(localAnimation);
    AppMethodBeat.o(134768);
  }

  public final boolean dispatchKeyEventPreIme(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(134773);
    if ((this.iqY != null) || (this.iqZ != null))
      AppMethodBeat.o(134773);
    while (true)
    {
      return bool;
      if ((paramKeyEvent != null) && (paramKeyEvent.getAction() == 0) && (paramKeyEvent.getKeyCode() == 4))
      {
        com.tencent.luggage.g.f.az(getContext());
        dismiss();
        AppMethodBeat.o(134773);
      }
      else
      {
        bool = super.dispatchKeyEventPreIme(paramKeyEvent);
        AppMethodBeat.o(134773);
      }
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(134772);
    boolean bool;
    if ((this.iqY != null) || (this.iqZ != null))
    {
      bool = true;
      AppMethodBeat.o(134772);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(134772);
    }
  }

  public final DialogInterface.OnClickListener getNegativeButton()
  {
    return this.iqX;
  }

  public final DialogInterface.OnClickListener getPositiveButton()
  {
    return this.iqW;
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(134771);
    super.onDetachedFromWindow();
    this.iqW = null;
    this.iqX = null;
    this.iqY = null;
    this.iqZ = null;
    this.ira = null;
    AppMethodBeat.o(134771);
  }

  public final void setNegativeButton(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.iqX = paramOnClickListener;
  }

  public final void setPositiveButton(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.iqW = paramOnClickListener;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$1"})
  static final class a
    implements View.OnClickListener
  {
    a(f paramf, Context paramContext)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(134759);
      this.ire.dismiss();
      AppMethodBeat.o(134759);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.f
 * JD-Core Version:    0.6.2
 */