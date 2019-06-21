package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.ui.base.VerticalScrollBar;

public class IPCallAddressScrollbar extends VerticalScrollBar
{
  public IPCallAddressScrollbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void Ky()
  {
    this.nBS = new String[] { "↑", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.nBQ = 1.3F;
    this.nBR = 66;
  }

  public int getToastLayoutId()
  {
    return 2130970675;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAddressScrollbar
 * JD-Core Version:    0.6.2
 */