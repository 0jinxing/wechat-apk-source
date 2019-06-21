package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import android.widget.EditText;
import com.tencent.mm.plugin.appbrand.page.u;

public abstract interface aa<Input extends EditText,  extends ab>
{
  public abstract void a(String paramString, Integer paramInteger);

  public abstract boolean aQn();

  public abstract Input aQo();

  public abstract boolean aQr();

  public abstract int aQs();

  public abstract boolean aQt();

  public abstract boolean dr(int paramInt1, int paramInt2);

  public abstract int getInputId();

  public abstract <P extends View,  extends ac> P getInputPanel();

  public abstract void qx(int paramInt);

  public abstract boolean s(u paramu);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.aa
 * JD-Core Version:    0.6.2
 */