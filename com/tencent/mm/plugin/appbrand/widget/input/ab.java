package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.autofill.b;

public abstract interface ab
{
  public abstract void N(float paramFloat1, float paramFloat2);

  public abstract void a(View.OnFocusChangeListener paramOnFocusChangeListener);

  public abstract void a(ab.a parama);

  public abstract void a(ab.c paramc);

  public abstract boolean aQP();

  public abstract boolean aQQ();

  public abstract boolean aQT();

  public abstract void aRi();

  public abstract void aRj();

  public abstract void aRk();

  public abstract void addTextChangedListener(TextWatcher paramTextWatcher);

  public abstract void b(View.OnFocusChangeListener paramOnFocusChangeListener);

  public abstract void destroy();

  public abstract b getAutoFillController();

  public abstract Context getContext();

  public abstract int getInputId();

  public abstract View getInputPanel();

  public abstract char getLastKeyPressed();

  public abstract CharSequence getText();

  public abstract View getView();

  public abstract int qI(int paramInt);

  public abstract void setFixed(boolean paramBoolean);

  public abstract void setInputId(int paramInt);

  public abstract void setOnKeyUpPostImeListener(ab.b paramb);

  public abstract void y(u paramu);

  public abstract void z(u paramu);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ab
 * JD-Core Version:    0.6.2
 */