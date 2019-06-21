package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import android.content.Context;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.h;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryOverScrollConsumer;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollConsumer;", "()V", "currScrollType", "", "downX", "", "downY", "galleryView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;", "getGalleryView", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;", "setGalleryView", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;)V", "totalScrollY", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "isTouchMoved", "scrollType", "getScrollDirection", "showExitHint", "", "Companion", "plugin-story_release"})
public final class d extends e
{
  private static final String TAG = "MicroMsg.GalleryOverScrollConsumer";
  public static final d.a snS;
  private float hke;
  private float hkf;
  private int rCb;
  l seu;
  private int snR;

  static
  {
    AppMethodBeat.i(110725);
    snS = new d.a((byte)0);
    TAG = "MicroMsg.GalleryOverScrollConsumer";
    AppMethodBeat.o(110725);
  }

  public final boolean a(MotionEvent paramMotionEvent, boolean paramBoolean, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(110724);
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
      AppMethodBeat.o(110724);
      return bool2;
      this.hke = paramMotionEvent.getX();
      this.hkf = paramMotionEvent.getY();
      continue;
      if (paramBoolean)
      {
        this.snR = paramInt;
        if (paramInt == 1);
        for (paramBoolean = bool1; ; paramBoolean = false)
        {
          float f = paramMotionEvent.getY() - this.hkf;
          if (f > 0.0F)
            break label314;
          paramMotionEvent = this.seu;
          if (paramMotionEvent == null)
            break label157;
          this.rCb = (-(int)f);
          paramMotionEvent.animate().cancel();
          paramMotionEvent.setTranslationY(f / 2.0F);
          bool2 = paramBoolean;
          break;
        }
        label157: bool2 = paramBoolean;
        continue;
        if ((this.rCb > 0) && (this.snR == 1))
        {
          paramMotionEvent = this.seu;
          if (paramMotionEvent != null)
          {
            paramMotionEvent = paramMotionEvent.animate();
            if (paramMotionEvent != null)
            {
              paramMotionEvent = paramMotionEvent.translationY(0.0F);
              if (paramMotionEvent != null)
                paramMotionEvent.start();
            }
          }
          this.snR = 0;
          Context localContext = ah.getContext();
          Object localObject = localContext.getSystemService("vibrator");
          paramMotionEvent = localObject;
          if (!(localObject instanceof Vibrator))
            paramMotionEvent = null;
          paramMotionEvent = (Vibrator)paramMotionEvent;
          if (paramMotionEvent != null)
            paramMotionEvent.vibrate(10L);
          h.bN(localContext, localContext.getString(2131303925));
        }
        this.rCb = 0;
        continue;
        ab.i(TAG, "LogStory: touch cancel");
        this.snR = 0;
        paramMotionEvent = this.seu;
        if (paramMotionEvent != null)
          paramMotionEvent.setTranslationY(0.0F);
        this.rCb = 0;
        continue;
        label314: bool2 = paramBoolean;
      }
    }
  }

  public final int cCD()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.d
 * JD-Core Version:    0.6.2
 */