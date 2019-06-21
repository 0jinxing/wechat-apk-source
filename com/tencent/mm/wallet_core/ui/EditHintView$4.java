package com.tencent.mm.wallet_core.ui;

import android.text.method.NumberKeyListener;

final class EditHintView$4 extends NumberKeyListener
{
  EditHintView$4(EditHintView paramEditHintView)
  {
  }

  protected final char[] getAcceptedChars()
  {
    return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
  }

  public final int getInputType()
  {
    return 18;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView.4
 * JD-Core Version:    0.6.2
 */