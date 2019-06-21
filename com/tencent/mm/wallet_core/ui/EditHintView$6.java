package com.tencent.mm.wallet_core.ui;

import android.text.method.NumberKeyListener;

final class EditHintView$6 extends NumberKeyListener
{
  EditHintView$6(EditHintView paramEditHintView)
  {
  }

  protected final char[] getAcceptedChars()
  {
    return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 120, 88 };
  }

  public final int getInputType()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.EditHintView.6
 * JD-Core Version:    0.6.2
 */