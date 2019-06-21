package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.DialogInterface;
import android.view.View;

public abstract interface j extends DialogInterface
{
  public abstract void a(k paramk);

  public abstract boolean aKP();

  public abstract View getContentView();

  public abstract int getPosition();

  public abstract boolean isCancelable();

  public abstract void onCancel();

  public abstract void pF(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.j
 * JD-Core Version:    0.6.2
 */