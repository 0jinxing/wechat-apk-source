package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;

abstract class r extends y
{
  public r(Context paramContext)
  {
    super(paramContext);
    super.setHorizontallyScrolling(true);
  }

  public final boolean aQP()
  {
    return false;
  }

  public boolean aQT()
  {
    return false;
  }

  public boolean canScrollVertically(int paramInt)
  {
    return false;
  }

  public void setGravity(int paramInt)
  {
    super.setGravity(paramInt & 0xFFFFFFAF & 0xFFFFFFCF | 0x10);
  }

  public final void setInputType(int paramInt)
  {
    super.setInputType(0xFFFDFFFF & paramInt);
  }

  public final void setSingleLine(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.r
 * JD-Core Version:    0.6.2
 */