package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.view.SmileySubGrid;

public class EmojiDetailGridView extends SmileySubGrid
{
  private String kWz;
  private EmojiDetailScrollView lac;
  private volatile boolean lad = true;

  public EmojiDetailGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public int getLongTouchTime()
  {
    return 200;
  }

  public String getProductId()
  {
    return this.kWz;
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53367);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, -2147483648));
    AppMethodBeat.o(53367);
  }

  public void setEmojiDetailScrollView(EmojiDetailScrollView paramEmojiDetailScrollView)
  {
    this.lac = paramEmojiDetailScrollView;
  }

  public void setProductId(String paramString)
  {
    this.kWz = paramString;
  }

  public void setScrollEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(53368);
    if (this.lac != null)
      this.lac.setScrollEnable(paramBoolean);
    AppMethodBeat.o(53368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiDetailGridView
 * JD-Core Version:    0.6.2
 */