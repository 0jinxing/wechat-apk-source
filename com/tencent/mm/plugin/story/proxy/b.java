package com.tencent.mm.plugin.story.proxy;

import a.f.b.j;
import a.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.plugin.story.api.m;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/StoryHintProxy;", "Lcom/tencent/mm/plugin/story/api/IStoryHintProxy;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "MSG_HANDLE_SINGLE_TAB", "", "animator", "Lcom/tencent/mm/plugin/story/animation/SwingAnimator;", "avatarRight", "", "avatarTop", "badgeBgPaint", "Landroid/graphics/Paint;", "badgeRadius", "blueHintDrawable", "Landroid/graphics/drawable/Drawable;", "defaultHintColor", "doubleClickListener", "Lcom/tencent/mm/plugin/story/api/IStoryHintProxy$OnDoubleClickListener;", "hintHeight", "hintMarginEnd", "hintMarginTop", "hintWidth", "host", "Landroid/view/View;", "mClickListener", "Landroid/view/View$OnClickListener;", "mHandler", "com/tencent/mm/plugin/story/proxy/StoryHintProxy$mHandler$1", "Lcom/tencent/mm/plugin/story/proxy/StoryHintProxy$mHandler$1;", "mOriginalClickListener", "originAvatarSize", "pageType", "showStoryHint", "", "userName", "", "weakContext", "Ljava/lang/ref/WeakReference;", "whiteHintDrawable", "checkConfigEnableAnimation", "checkDrawable", "highLight", "getDoubleClickListener", "goStoryGallery", "init", "", "onDrawWithHint", "canvas", "Landroid/graphics/Canvas;", "hintHighLight", "hintBgColor", "onMeasureWithHint", "", "measureWidth", "measureHeight", "performDoubleClick", "report", "setOnClickListener", "listener", "setOnDoubleClickListener", "setShowStoryHint", "show", "setUserNameAndPageNumber", "setWeakContext", "showNoStoryAnimation", "simpleShake", "updateDot", "Companion", "plugin-story_release"})
public final class b
  implements com.tencent.mm.plugin.story.api.i
{
  private static final String TAG = "MicroMsg.StoryHintProxy";
  public static final b.a saS;
  private final Context context;
  private View.OnClickListener lDG;
  private int pageType;
  private int saA;
  private Drawable saB;
  private Drawable saC;
  private int saD;
  private int saE;
  private int saF;
  private float saG;
  private float saH;
  private float saI;
  private Paint saJ;
  private View saK;
  private final com.tencent.mm.plugin.story.a.b saL;
  private int saM;
  private WeakReference<Context> saN;
  private final int saO;
  private final b.b saP;
  private com.tencent.mm.plugin.story.api.i.a saQ;
  private final View.OnClickListener saR;
  private boolean say;
  private int saz;
  private String userName;

  static
  {
    AppMethodBeat.i(109734);
    saS = new b.a((byte)0);
    TAG = "MicroMsg.StoryHintProxy";
    AppMethodBeat.o(109734);
  }

  public b(Context paramContext)
  {
    AppMethodBeat.i(109733);
    this.context = paramContext;
    this.pageType = -1;
    this.saL = new com.tencent.mm.plugin.story.a.b();
    this.saM = -1;
    this.saP = new b.b(this);
    this.saR = ((View.OnClickListener)new b.c(this));
    AppMethodBeat.o(109733);
  }

  private final void IF()
  {
    AppMethodBeat.i(109730);
    Object localObject = h.scu;
    localObject = h.cAs();
    if (this.say);
    for (long l = 1L; ; l = 0L)
    {
      ((ar)localObject).bH(l);
      localObject = h.scu;
      ar localar = h.cAs();
      localObject = com.tencent.mm.plugin.story.g.i.scv;
      localar.bG(com.tencent.mm.plugin.story.g.i.a.Fb(this.pageType));
      AppMethodBeat.o(109730);
      return;
    }
  }

  private void czK()
  {
    AppMethodBeat.i(109731);
    if (this.saK != null)
    {
      Object localObject1 = this.saL.rQu;
      if (localObject1 == null)
        j.dWJ();
      ((AnimatorSet)localObject1).cancel();
      localObject1 = this.saL;
      Object localObject2 = this.saK;
      if (localObject2 == null)
        j.dWJ();
      ((com.tencent.mm.plugin.story.a.b)localObject1).ec((View)localObject2);
      localObject1 = this.saL;
      localObject2 = ((com.tencent.mm.plugin.story.a.a)localObject1).rQu;
      if (localObject2 == null)
        j.dWJ();
      Iterator localIterator = ((AnimatorSet)localObject2).getChildAnimations().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (Animator)localIterator.next();
        if ((localObject2 instanceof ValueAnimator))
        {
          ((ValueAnimator)localObject2).setRepeatCount(((com.tencent.mm.plugin.story.a.a)localObject1).rQv);
          ((ValueAnimator)localObject2).setRepeatMode(((com.tencent.mm.plugin.story.a.a)localObject1).rQw);
        }
      }
      localObject2 = ((com.tencent.mm.plugin.story.a.a)localObject1).rQu;
      if (localObject2 == null)
        j.dWJ();
      ((AnimatorSet)localObject2).setDuration(((com.tencent.mm.plugin.story.a.a)localObject1).mDuration);
      localObject1 = ((com.tencent.mm.plugin.story.a.a)localObject1).rQu;
      if (localObject1 == null)
        j.dWJ();
      ((AnimatorSet)localObject1).start();
      al.n((Runnable)new b.d(this), 150L);
    }
    AppMethodBeat.o(109731);
  }

  public final void a(Canvas paramCanvas, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(109728);
    j.p(paramCanvas, "canvas");
    if (!n.isShowStoryCheck())
      AppMethodBeat.o(109728);
    while (true)
    {
      return;
      View localView = this.saK;
      if (localView != null)
      {
        int i = (localView.getWidth() - this.saF) / 2;
        if (localView.getWidth() > this.saF)
        {
          this.saH = (this.saF + i);
          this.saG = i;
        }
        if (this.say)
        {
          localObject = this.saJ;
          if (localObject != null)
            ((Paint)localObject).setColor(paramInt);
          localObject = this.saJ;
          if (localObject != null)
            paramCanvas.drawCircle(localView.getWidth() - this.saI, this.saI, this.saI, (Paint)localObject);
          if (!paramBoolean)
            break label285;
          if (this.saB == null)
          {
            localObject = g.M(e.class);
            j.o(localObject, "plugin(IPluginStory::class.java)");
            localObject = ((e)localObject).getStoryUIFactory().ls(true);
            this.saB = ((Drawable)localObject);
            j.o(localObject, "drawable");
            this.saE = ((Drawable)localObject).getBounds().right;
            this.saD = ((Drawable)localObject).getBounds().bottom;
          }
        }
        for (Object localObject = this.saB; ; localObject = this.saC)
        {
          paramCanvas.save();
          paramCanvas.translate(localView.getWidth() - this.saE - this.saz, this.saA);
          if (localObject != null)
            ((Drawable)localObject).draw(paramCanvas);
          paramCanvas.restore();
          AppMethodBeat.o(109728);
          break;
          label285: if (this.saC == null)
          {
            localObject = g.M(e.class);
            j.o(localObject, "plugin(IPluginStory::class.java)");
            localObject = ((e)localObject).getStoryUIFactory().ls(false);
            this.saC = ((Drawable)localObject);
            j.o(localObject, "drawable");
            this.saE = ((Drawable)localObject).getBounds().right;
            this.saD = ((Drawable)localObject).getBounds().bottom;
          }
        }
      }
      AppMethodBeat.o(109728);
    }
  }

  public final void aR(View paramView)
  {
    AppMethodBeat.i(109727);
    j.p(paramView, "host");
    this.saK = paramView;
    this.saz = com.tencent.mm.bz.a.fromDPToPix(this.context, 2);
    this.saA = com.tencent.mm.bz.a.fromDPToPix(this.context, 2);
    this.saI = com.tencent.mm.bz.a.fromDPToPix(this.context, 6);
    paramView.setOnClickListener(this.saR);
    this.saF = paramView.getResources().getDimensionPixelSize(2131427850);
    this.saJ = new Paint();
    paramView = this.saJ;
    if (paramView != null)
      paramView.setAntiAlias(true);
    paramView = this.saJ;
    if (paramView != null)
      paramView.setAlpha(0);
    paramView = this.saJ;
    if (paramView != null)
      paramView.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC));
    paramView = ah.getContext();
    j.o(paramView, "MMApplicationContext.getContext()");
    this.saM = paramView.getResources().getColor(2131690544);
    AppMethodBeat.o(109727);
  }

  public final View.OnClickListener cwV()
  {
    return this.saR;
  }

  public final void dk(String paramString, int paramInt)
  {
    this.userName = paramString;
    this.pageType = paramInt;
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (paramOnClickListener != this.saR)
      this.lDG = paramOnClickListener;
  }

  public final void setOnDoubleClickListener(com.tencent.mm.plugin.story.api.i.a parama)
  {
    this.saQ = parama;
  }

  public final void setShowStoryHint(boolean paramBoolean)
  {
    AppMethodBeat.i(109729);
    if (com.tencent.mm.plugin.sns.e.a.Xv(this.userName))
      paramBoolean = false;
    if (this.say != paramBoolean)
    {
      this.say = paramBoolean;
      View localView = this.saK;
      if (localView != null)
      {
        localView.invalidate();
        AppMethodBeat.o(109729);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109729);
    }
  }

  public final void setWeakContext(Context paramContext)
  {
    AppMethodBeat.i(109732);
    j.p(paramContext, "context");
    this.saN = new WeakReference(paramContext);
    AppMethodBeat.o(109732);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.b
 * JD-Core Version:    0.6.2
 */