package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.a;
import com.tencent.mm.emoji.view.EmojiStatusView;
import com.tencent.mm.storage.emotion.EmojiInfo;

public class ChattingEmojiView extends EmojiStatusView
{
  private String cacheKey;
  private EmojiInfo exP;
  protected int vpE;
  protected int vpF;

  public ChattingEmojiView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62470);
    this.vpE = paramContext.getResources().getDimensionPixelSize(2131428381);
    this.vpF = paramContext.getResources().getDimensionPixelSize(2131428379);
    setDefaultImageResource(0);
    AppMethodBeat.o(62470);
  }

  public final void a(EmojiInfo paramEmojiInfo, long paramLong)
  {
    AppMethodBeat.i(62471);
    this.exP = paramEmojiInfo;
    this.cacheKey = String.valueOf(paramLong);
    setImageDrawable(null);
    reload();
    AppMethodBeat.o(62471);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62474);
    super.onMeasure(paramInt1, paramInt2);
    int i;
    int j;
    float f;
    if ((getStatus() != 1) && (this.exP != null))
    {
      paramInt2 = (int)(this.exP.field_width * getEmojiDensityScale());
      i = (int)(this.exP.field_height * getEmojiDensityScale());
      paramInt1 = paramInt2;
      if (paramInt2 <= 0)
        paramInt1 = this.vpE;
      paramInt2 = i;
      if (i <= 0)
        paramInt2 = this.vpE;
      paramInt1 = Math.max(0, paramInt1);
      i = Math.max(0, paramInt2);
      paramInt2 = paramInt1;
      paramInt1 = i;
      i = paramInt2;
      if (paramInt2 <= 0)
        i = this.vpE;
      j = paramInt1;
      if (paramInt1 <= 0)
        j = this.vpE;
      if (j >= this.vpF)
      {
        paramInt1 = j;
        paramInt2 = i;
        if (i >= this.vpF);
      }
      else
      {
        if (i >= j)
          break label244;
        f = this.vpF / i;
        paramInt2 = this.vpF;
        paramInt1 = (int)(j * f);
      }
      label169: if (paramInt2 <= this.vpE)
      {
        i = paramInt1;
        j = paramInt2;
        if (paramInt1 <= this.vpE);
      }
      else
      {
        if (paramInt2 <= paramInt1)
          break label289;
        f = this.vpE / paramInt2;
        j = this.vpE;
        i = (int)(paramInt1 * f);
      }
    }
    while (true)
    {
      setMeasuredDimension(j, i);
      AppMethodBeat.o(62474);
      return;
      paramInt2 = getIntrinsicWidth();
      paramInt1 = getIntrinsicHeight();
      break;
      label244: if (j < i)
      {
        f = this.vpF / j;
        paramInt1 = this.vpF;
        paramInt2 = (int)(i * f);
        break label169;
      }
      paramInt1 = this.vpF;
      paramInt2 = this.vpF;
      break label169;
      label289: if (paramInt1 > paramInt2)
      {
        f = this.vpE / paramInt1;
        i = this.vpE;
        j = (int)(paramInt2 * f);
      }
      else
      {
        j = this.vpE;
        i = this.vpE;
      }
    }
  }

  public final void reload()
  {
    AppMethodBeat.i(62472);
    a locala;
    if (this.exP != null)
    {
      setStatusNotify(0);
      locala = a.exs;
      a.a(this.exP, this, this.cacheKey);
      AppMethodBeat.o(62472);
    }
    while (true)
    {
      return;
      locala = a.exs;
      a.cf(this);
      AppMethodBeat.o(62472);
    }
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(62473);
    super.setImageDrawable(paramDrawable);
    AppMethodBeat.o(62473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView
 * JD-Core Version:    0.6.2
 */