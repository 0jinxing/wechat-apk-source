package com.google.android.flexbox;

import android.os.Parcelable;

abstract interface FlexItem extends Parcelable
{
  public abstract int getHeight();

  public abstract int getMaxHeight();

  public abstract int getMaxWidth();

  public abstract int getMinHeight();

  public abstract int getMinWidth();

  public abstract int getOrder();

  public abstract int getWidth();

  public abstract float ub();

  public abstract float uc();

  public abstract int ud();

  public abstract boolean ue();

  public abstract float uf();

  public abstract int ug();

  public abstract int uh();

  public abstract int ui();

  public abstract int uj();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.FlexItem
 * JD-Core Version:    0.6.2
 */