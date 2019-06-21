package com.tencent.mm.plugin.recharge.ui.form;

import android.text.method.NumberKeyListener;

final class MallFormView$6 extends NumberKeyListener
{
  MallFormView$6(MallFormView paramMallFormView)
  {
  }

  protected final char[] getAcceptedChars()
  {
    return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 45 };
  }

  public final int getInputType()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.MallFormView.6
 * JD-Core Version:    0.6.2
 */