package com.tencent.mm.plugin.address.ui;

import android.text.method.NumberKeyListener;

final class AddrEditView$2 extends NumberKeyListener
{
  AddrEditView$2(AddrEditView paramAddrEditView)
  {
  }

  protected final char[] getAcceptedChars()
  {
    return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
  }

  public final int getInputType()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddrEditView.2
 * JD-Core Version:    0.6.2
 */