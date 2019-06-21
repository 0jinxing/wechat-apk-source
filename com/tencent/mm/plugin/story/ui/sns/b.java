package com.tencent.mm.plugin.story.ui.sns;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.i;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.gallery.e;
import com.tencent.mm.plugin.story.ui.view.gallery.f;
import com.tencent.mm.plugin.story.ui.view.gallery.h;
import com.tencent.mm.plugin.story.ui.view.gallery.l.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceDialog;", "Landroid/support/v7/app/AppCompatDialog;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "commentScrolling", "", "galleryScale", "com/tencent/mm/plugin/story/ui/sns/StoryEntranceDialog$galleryScale$1", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceDialog$galleryScale$1;", "galleryScrollHelper", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollHelper;", "hasDispatchCancel", "getMContext", "()Landroid/content/Context;", "setMContext", "mIsActive", "needCancelTouch", "targetView", "Landroid/view/View;", "cancel", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "isLandscape", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setContentView", "view", "setTranslucentStatus", "wrapSheet", "layoutResId", "", "params", "Landroid/view/ViewGroup$LayoutParams;", "Companion", "plugin-story_release"})
public final class b extends i
{
  private static final String TAG = "MicroMsg.StoryEntranceDialog";
  public static final b.a shk;
  private Context mContext;
  private f shf;
  private final b.b shg;
  private boolean shh;
  private boolean shi;
  private boolean shj;
  private View targetView;

  static
  {
    AppMethodBeat.i(110245);
    shk = new b.a((byte)0);
    TAG = "MicroMsg.StoryEntranceDialog";
    AppMethodBeat.o(110245);
  }

  public b(Context paramContext)
  {
    super(paramContext, 2131493175);
    AppMethodBeat.i(110244);
    this.mContext = paramContext;
    this.shg = new b.b(this);
    fA();
    paramContext = getContext();
    j.o(paramContext, "context");
    this.shf = new f(paramContext);
    AppMethodBeat.o(110244);
  }

  private final boolean isLandscape()
  {
    AppMethodBeat.i(110239);
    Resources localResources = this.mContext.getResources();
    j.o(localResources, "mContext.resources");
    boolean bool;
    if (localResources.getConfiguration().orientation == 2)
    {
      bool = true;
      AppMethodBeat.o(110239);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(110239);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(110243);
    if ((this.targetView instanceof a))
    {
      Object localObject = this.targetView;
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.sns.DialogLifeStyle");
        AppMethodBeat.o(110243);
        throw ((Throwable)localObject);
      }
      ((a)localObject).finish();
    }
    super.cancel();
    AppMethodBeat.o(110243);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(110242);
    j.p(paramMotionEvent, "ev");
    boolean bool2;
    switch (paramMotionEvent.getActionMasked())
    {
    case 2:
    default:
      this.shf.J(paramMotionEvent);
      int i = this.shf.sod;
      bool2 = bool1;
      if (i != 1)
      {
        bool2 = bool1;
        if (i != 2)
        {
          if ((this.shi) || (this.shh))
            break;
          bool2 = this.shf.dispatchTouchEvent(paramMotionEvent);
        }
      }
      label104: if ((this.shi) || (bool2))
      {
        if (!this.shj)
        {
          paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
          j.o(paramMotionEvent, "cancelEvent");
          paramMotionEvent.setAction(3);
          super.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.recycle();
          this.shj = true;
        }
        AppMethodBeat.o(110242);
        bool2 = true;
      }
      break;
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      return bool2;
      this.shj = false;
      this.shi = false;
      break;
      bool2 = bool1;
      if (this.shj)
        break label104;
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      j.o(localMotionEvent, "cancelEvent");
      localMotionEvent.setAction(3);
      this.shf.dispatchTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
      this.shj = true;
      bool2 = bool1;
      break label104;
      bool2 = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(110242);
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110240);
    super.onCreate(paramBundle);
    getWindow().setDimAmount(0.0F);
    AppMethodBeat.o(110240);
  }

  public final void setContentView(View paramView)
  {
    AppMethodBeat.i(110241);
    j.p(paramView, "view");
    Window localWindow = getWindow();
    WindowManager.LayoutParams localLayoutParams;
    if (isLandscape())
    {
      if (localWindow == null)
        j.dWJ();
      localWindow.setGravity(5);
      localWindow.setWindowAnimations(2131493530);
      localWindow.getDecorView().setPadding(0, 0, 0, 0);
      localLayoutParams = localWindow.getAttributes();
      if (!isLandscape())
        break label271;
      localLayoutParams.width = -2;
      localLayoutParams.height = -1;
      label75: localWindow.setAttributes(localLayoutParams);
      paramView.findViewById(2131823263).setOnClickListener((View.OnClickListener)new b.c(this));
      super.setContentView(paramView);
      this.targetView = paramView;
      paramView = new h(paramView, (l.b)this.shg);
      this.shf.a((e)paramView);
      paramView = getWindow();
      if (paramView == null)
        j.dWJ();
      paramView.setLayout(-1, -1);
      if (getWindow() != null)
      {
        if (Build.VERSION.SDK_INT < 21)
          break label285;
        paramView = getWindow();
        j.o(paramView, "window");
        paramView = paramView.getDecorView();
        j.o(paramView, "window.decorView");
        paramView.setSystemUiVisibility(1280);
        getWindow().addFlags(-2147483648);
        paramView = getWindow();
        j.o(paramView, "window");
        paramView.setStatusBarColor(0);
      }
    }
    while (true)
    {
      getWindow().setFlags(134217728, 134217728);
      AppMethodBeat.o(110241);
      return;
      if (localWindow == null)
        j.dWJ();
      localWindow.setGravity(80);
      localWindow.setWindowAnimations(2131493110);
      break;
      label271: localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      break label75;
      label285: getWindow().addFlags(67108864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.b
 * JD-Core Version:    0.6.2
 */