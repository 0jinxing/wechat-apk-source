package com.tencent.mm.plugin.appbrand.widget.sms;

import android.text.method.NumberKeyListener;

final class EditVerifyCodeView$2 extends NumberKeyListener
{
  EditVerifyCodeView$2(EditVerifyCodeView paramEditVerifyCodeView)
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView.2
 * JD-Core Version:    0.6.2
 */