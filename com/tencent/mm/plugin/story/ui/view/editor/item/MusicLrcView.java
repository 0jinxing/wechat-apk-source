package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.k.m;
import a.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;
import com.google.android.exoplayer2.q.a;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isRunningShow", "", "()Z", "setRunningShow", "(Z)V", "mFirst", "mScroller", "Landroid/widget/Scroller;", "mXPaused", "value", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "player", "getPlayer", "()Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setPlayer", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V", "rndDuration", "getRndDuration", "()I", "setRndDuration", "(I)V", "scrollFirstDelay", "getScrollFirstDelay", "setScrollFirstDelay", "calculateScrollingLen", "computeScroll", "", "fillText", "list", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcBean;", "Lkotlin/collections/ArrayList;", "hlString", "", "resumeScroll", "setShow", "isShow", "spanForQuery", "", "source", "startScroll", "stopScroll", "plugin-story_release"})
@SuppressLint({"AppCompatCustomView"})
public final class MusicLrcView extends TextView
{
  private Scroller mScroller;
  boolean shY;
  private v sia;
  private int snd;
  int sne;
  boolean snf;
  private int sng;

  public MusicLrcView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, (byte)0);
  }

  public MusicLrcView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110686);
    this.snd = 10000;
    this.sne = (-getWidth());
    this.snf = true;
    AppMethodBeat.o(110686);
  }

  private final CharSequence a(String paramString, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(110684);
    SpannableString localSpannableString = new SpannableString((CharSequence)paramString);
    int i = paramCharSequence.length();
    int m;
    for (int j = 0; ; j = m)
    {
      int k = m.a((CharSequence)paramString, paramCharSequence.toString(), j, false);
      m = j;
      if (k != -1)
      {
        j += k + i;
        if (!isSelected())
          break label119;
      }
      label119: for (m = -16777216; ; m = -1)
      {
        localSpannableString.setSpan(new ForegroundColorSpan(m), k, k + i, 33);
        m = j;
        if (k != -1)
          break;
        paramString = (CharSequence)localSpannableString;
        AppMethodBeat.o(110684);
        return paramString;
      }
    }
  }

  public final void cCC()
  {
    AppMethodBeat.i(110681);
    if (!this.shY)
      AppMethodBeat.o(110681);
    while (true)
    {
      return;
      this.sne = (-getWidth());
      setHorizontallyScrolling(true);
      if (this.mScroller == null)
      {
        this.mScroller = new Scroller(getContext(), (Interpolator)new LinearInterpolator());
        setScroller(this.mScroller);
      }
      TextPaint localTextPaint = getPaint();
      Rect localRect = new Rect();
      Object localObject = getText().toString();
      localTextPaint.getTextBounds((String)localObject, 0, ((String)localObject).length(), localRect);
      if (localRect.width() > 0);
      final int j;
      for (final int i = localRect.width(); ; i = getWidth())
      {
        j = i - this.sne * 3 / 4;
        if (j == 0)
          break label226;
        i = this.snd * j / i;
        if (!this.snf)
          break label196;
        postDelayed((Runnable)new b(this, j, i), this.sng);
        AppMethodBeat.o(110681);
        break;
      }
      label196: localObject = this.mScroller;
      if (localObject == null)
        a.f.b.j.dWJ();
      ((Scroller)localObject).startScroll(this.sne, 0, j, 0, i);
      invalidate();
      label226: AppMethodBeat.o(110681);
    }
  }

  public final void computeScroll()
  {
    AppMethodBeat.i(110685);
    super.computeScroll();
    if (this.mScroller == null)
      AppMethodBeat.o(110685);
    while (true)
    {
      return;
      Scroller localScroller = this.mScroller;
      if (localScroller == null)
        a.f.b.j.dWJ();
      if (localScroller.isFinished())
      {
        this.sne = (-getWidth());
        this.snf = false;
        cCC();
      }
      AppMethodBeat.o(110685);
    }
  }

  public final void f(ArrayList<d> paramArrayList, String paramString)
  {
    AppMethodBeat.i(110682);
    int i;
    Object localObject1;
    if (paramArrayList != null)
    {
      if (!((Collection)paramArrayList).isEmpty())
        i = 1;
      while (i != 0)
      {
        localObject1 = new StringBuilder();
        Object localObject2 = ((Iterable)paramArrayList).iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
          {
            ((StringBuilder)localObject1).append(((d)((Iterator)localObject2).next()).snb).append("  ");
            continue;
            i = 0;
            break;
          }
        if (paramString == null)
          break label230;
        if (((CharSequence)paramString).length() <= 0)
          break label225;
        i = 1;
        if (i == 0)
          break label230;
        localObject2 = ((StringBuilder)localObject1).toString();
        a.f.b.j.o(localObject2, "sb.toString()");
        if (!m.a((CharSequence)localObject2, (CharSequence)paramString, false))
          break label230;
        localObject1 = ((StringBuilder)localObject1).toString();
        a.f.b.j.o(localObject1, "sb.toString()");
      }
    }
    label225: label230: for (paramString = a((String)localObject1, (CharSequence)paramString); ; paramString = (CharSequence)((StringBuilder)localObject1).toString())
    {
      setText(paramString);
      this.snd = (((d)a.a.j.fL((List)paramArrayList)).snc - ((d)a.a.j.fJ((List)paramArrayList)).startTime);
      if (this.snd == 0)
        this.snd = 10000;
      AppMethodBeat.o(110682);
      return;
      i = 0;
      break;
    }
  }

  public final v getPlayer()
  {
    return this.sia;
  }

  public final int getRndDuration()
  {
    return this.snd;
  }

  public final int getScrollFirstDelay()
  {
    return this.sng;
  }

  public final void setPlayer(v paramv)
  {
    AppMethodBeat.i(110679);
    if (paramv != null)
    {
      this.sia = paramv;
      paramv = this.sia;
      if (paramv != null)
      {
        paramv.a((q.a)new MusicLrcView.a(this));
        AppMethodBeat.o(110679);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110679);
    }
  }

  public final void setRndDuration(int paramInt)
  {
    this.snd = paramInt;
  }

  public final void setRunningShow(boolean paramBoolean)
  {
    this.shY = paramBoolean;
  }

  public final void setScrollFirstDelay(int paramInt)
  {
    this.sng = paramInt;
  }

  public final void setShow(boolean paramBoolean)
  {
    AppMethodBeat.i(110680);
    this.shY = paramBoolean;
    if ((!this.shY) && (this.mScroller != null))
    {
      Scroller localScroller = this.mScroller;
      if (localScroller == null)
        a.f.b.j.dWJ();
      localScroller.startScroll(0, 0, 0, 0, 0);
    }
    AppMethodBeat.o(110680);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class b
    implements Runnable
  {
    b(MusicLrcView paramMusicLrcView, int paramInt1, int paramInt2)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(110678);
      Scroller localScroller = MusicLrcView.a(this.snh);
      if (localScroller == null)
        a.f.b.j.dWJ();
      localScroller.startScroll(MusicLrcView.b(this.snh), 0, j, 0, i);
      this.snh.invalidate();
      AppMethodBeat.o(110678);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.MusicLrcView
 * JD-Core Version:    0.6.2
 */