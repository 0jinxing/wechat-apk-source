package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.a;
import a.f.b.j;
import a.l;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "downX", "", "downY", "isLongPressed", "", "isTouchEnd", "isTouchMoved", "longClickEnable", "getLongClickEnable", "()Z", "setLongClickEnable", "(Z)V", "longPressRunnable", "Ljava/lang/Runnable;", "longPressedTimeout", "", "onClick", "Lkotlin/Function0;", "", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onLongClick", "getOnLongClick", "setOnLongClick", "scrollConsumers", "Ljava/util/HashSet;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollConsumer;", "Lkotlin/collections/HashSet;", "scrollType", "touchSlop", "addScrollConsumer", "consumer", "cancelLongPress", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "getScrollType", "onNestedPreFling", "velocityX", "velocityY", "onNestedPreScroll", "scrollX", "scrollY", "consumed", "", "onStopNestedScroll", "removeScrollConsumer", "trackTouchEvent", "Companion", "plugin-story_release"})
public final class f
{
  private static String TAG;
  public static final f.a soh;
  private float hke;
  private float hkf;
  private final int nfE;
  final Runnable oBn;
  private final int snZ;
  private boolean soa;
  private boolean sob;
  private boolean soc;
  public int sod;
  a<Boolean> soe;
  boolean sof;
  private final HashSet<e> sog;

  static
  {
    AppMethodBeat.i(110737);
    soh = new f.a((byte)0);
    TAG = "MicroMsg.GalleryScrollHelper";
    AppMethodBeat.o(110737);
  }

  public f(Context paramContext)
  {
    AppMethodBeat.i(110736);
    this.sof = true;
    this.oBn = ((Runnable)new f.b(this));
    this.sog = new HashSet();
    paramContext = ViewConfiguration.get(paramContext);
    this.snZ = (ViewConfiguration.getLongPressTimeout() + 100);
    j.o(paramContext, "config");
    this.nfE = paramContext.getScaledTouchSlop();
    AppMethodBeat.o(110736);
  }

  public final void J(MotionEvent paramMotionEvent)
  {
    int i = 1;
    boolean bool = false;
    AppMethodBeat.i(110734);
    j.p(paramMotionEvent, "event");
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(110734);
      while (true)
      {
        return;
        this.hke = paramMotionEvent.getX();
        this.hkf = paramMotionEvent.getY();
        this.soa = false;
        this.sob = false;
        this.soc = false;
        this.sod = 0;
        al.n(this.oBn, this.snZ);
        ab.d(TAG, "downX:" + this.hke + "  downY:" + this.hkf);
        AppMethodBeat.o(110734);
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      float f3 = f1 - this.hke;
      float f4 = f2 - this.hkf;
      if (!this.sob)
      {
        if ((Math.abs(f1 - this.hke) > this.nfE) || (Math.abs(f2 - this.hkf) > this.nfE))
          bool = true;
        this.sob = bool;
      }
      if (this.sob)
      {
        al.af(this.oBn);
        if (this.sod == 0)
        {
          if (Math.abs(f4) <= Math.abs(f3))
            break label334;
          if (f4 >= 0.0F)
            break label329;
        }
      }
      while (true)
      {
        this.sod = i;
        ab.d(TAG, "scrollType " + this.sod + " move: " + f3 + ", " + f4);
        AppMethodBeat.o(110734);
        break;
        label329: i = 2;
        continue;
        label334: if (f3 < 0.0F)
          i = 4;
        else
          i = 8;
      }
      al.af(this.oBn);
      this.sod = 0;
      this.soc = true;
    }
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(110733);
    j.p(parame, "consumer");
    this.sog.add(parame);
    AppMethodBeat.o(110733);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(110735);
    j.p(paramMotionEvent, "event");
    ab.d(TAG, "dispatchTouchEvent " + paramMotionEvent.getAction() + ", " + paramMotionEvent.getX() + ' ' + paramMotionEvent.getY());
    int i = this.sod;
    int j;
    boolean bool2;
    switch (paramMotionEvent.getActionMasked())
    {
    default:
      j = 1;
      if (this.soa)
        bool1 = true;
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (j != 0)
        {
          Iterator localIterator = this.sog.iterator();
          while (true)
          {
            bool2 = bool1;
            if (!localIterator.hasNext())
              break;
            e locale = (e)localIterator.next();
            bool2 = bool1;
            if (bool1)
              break;
            if ((this.sob) && ((locale.cCD() & i) == 0))
              break label264;
            bool1 = locale.a(paramMotionEvent, this.sob, i) | bool1;
          }
        }
      }
      break;
    case 2:
      label195: if (!this.soc);
      break;
    case 1:
    case 3:
    }
    for (i = 0; ; i = 1)
    {
      int k = this.sod;
      ab.d(TAG, "scrollType " + this.sod);
      j = i;
      i = k;
      break;
      i = 15;
      j = 1;
      break;
      AppMethodBeat.o(110735);
      return bool2;
      label264: break label195;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.f
 * JD-Core Version:    0.6.2
 */