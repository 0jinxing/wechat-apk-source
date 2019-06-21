package com.tencent.mm.ui.base.sortview;

import android.content.Context;

public abstract class a
{
  protected Object data;
  public int type;
  protected boolean yDq;

  public a(int paramInt, Object paramObject)
  {
    this.type = paramInt;
    this.data = paramObject;
  }

  public abstract void a(Context paramContext, a.a parama, Object[] paramArrayOfObject);

  public abstract a.b aVY();

  public abstract a.a aVZ();

  public final boolean dAG()
  {
    return this.yDq;
  }

  public final Object getData()
  {
    return this.data;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.a
 * JD-Core Version:    0.6.2
 */