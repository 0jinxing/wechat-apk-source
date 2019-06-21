package com.tencent.mm.plugin.brandservice.ui.base;

import com.tencent.mm.plugin.brandservice.ui.c.b;
import java.util.List;

public abstract class a extends com.tencent.mm.ui.base.sortview.a
{
  protected c.b jLg;
  protected List<String> jMJ;
  protected int jMK;
  protected int position;

  public a(int paramInt, Object paramObject)
  {
    super(paramInt, paramObject);
  }

  public final c.b aWm()
  {
    return this.jLg;
  }

  public final int aWn()
  {
    return this.jMK;
  }

  public final int getPosition()
  {
    return this.position;
  }

  public final void setPosition(int paramInt)
  {
    this.position = paramInt;
  }

  public final void setReporter(c.b paramb)
  {
    this.jLg = paramb;
  }

  public final void sf(int paramInt)
  {
    this.jMK = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.base.a
 * JD-Core Version:    0.6.2
 */