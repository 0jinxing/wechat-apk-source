package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.tencent.mm.storage.ad;

public abstract class ProfileItemView extends FrameLayout
{
  public ad ldh;

  public ProfileItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ProfileItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ProfileItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    LayoutInflater.from(paramContext).inflate(getLayout(), this);
    init();
  }

  public boolean T(ad paramad)
  {
    this.ldh = paramad;
    return cby();
  }

  public abstract boolean cby();

  public abstract int getLayout();

  public abstract void init();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileItemView
 * JD-Core Version:    0.6.2
 */