package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;

public class AlphabetScrollBar extends VerticalScrollBar
{
  public AlphabetScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void Ky()
  {
    this.nBS = new String[] { "↑", "☆", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.nBQ = 1.6F;
    this.nBR = 79;
  }

  protected int getToastLayoutId()
  {
    return 2130970675;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.AlphabetScrollBar
 * JD-Core Version:    0.6.2
 */