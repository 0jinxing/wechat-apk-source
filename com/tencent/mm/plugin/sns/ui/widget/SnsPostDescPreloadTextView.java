package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.PLTextView;
import com.tencent.mm.kiss.widget.textview.c;
import com.tencent.mm.kiss.widget.textview.d;

public class SnsPostDescPreloadTextView extends PLTextView
{
  private static int hitCount = 0;
  private static int missCount = 0;
  private boolean rNf = false;
  private int rNg = 0;

  public SnsPostDescPreloadTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SnsPostDescPreloadTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private int getPostDescWidth()
  {
    AppMethodBeat.i(40516);
    int i;
    if (this.rNg > 0)
    {
      i = this.rNg;
      AppMethodBeat.o(40516);
    }
    while (true)
    {
      return i;
      i = e.cvB().getViewWidth();
      AppMethodBeat.o(40516);
    }
  }

  public final com.tencent.mm.kiss.widget.textview.a.a SQ()
  {
    AppMethodBeat.i(40512);
    this.rNf = true;
    com.tencent.mm.kiss.widget.textview.a.a locala = e.cvB().getTextViewConfig();
    AppMethodBeat.o(40512);
    return locala;
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40517);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(40517);
  }

  public void setMaxLines(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(40513);
    if (getText() == null)
      super.setMaxLines(paramInt);
    if (paramInt < 7)
    {
      if (!this.rNf)
        break label148;
      setConfig(e.cvB().cvC());
      this.rNf = false;
      paramInt = i;
    }
    while (true)
    {
      if (paramInt != 0)
      {
        com.tencent.mm.kiss.widget.textview.f localf1 = c.eNj.a(getConfig(), getText());
        com.tencent.mm.kiss.widget.textview.f localf2 = localf1;
        if (localf1 == null)
        {
          paramInt = getPostDescWidth();
          localf2 = localf1;
          if (paramInt > 0)
            localf2 = d.a(getText(), paramInt, getConfig()).SO();
        }
        if (localf2 != null)
          setTextLayout(localf2);
      }
      AppMethodBeat.o(40513);
      return;
      if (!this.rNf)
      {
        setConfig(e.cvB().getTextViewConfig());
        this.rNf = true;
        paramInt = i;
      }
      else
      {
        label148: paramInt = 0;
      }
    }
  }

  public void setSpecialWidth(int paramInt)
  {
    this.rNg = paramInt;
  }

  public final void v(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(40515);
    Context localContext;
    float f;
    if (paramCharSequence != null)
    {
      localContext = getContext();
      paramCharSequence = paramCharSequence.toString();
      f = getConfig().eOg;
      if (!(getTag() instanceof com.tencent.mm.pluginsdk.ui.d.a))
        break label83;
    }
    label83: for (boolean bool = com.tencent.mm.plugin.sns.e.a.Xu(((com.tencent.mm.pluginsdk.ui.d.a)getTag()).getUserName()); ; bool = false)
    {
      setText(f.a(localContext, paramCharSequence, f, bool), true);
      missCount += 1;
      AppMethodBeat.o(40515);
      return;
    }
  }

  public final void w(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(40514);
    super.w(paramCharSequence);
    hitCount += 1;
    AppMethodBeat.o(40514);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView
 * JD-Core Version:    0.6.2
 */