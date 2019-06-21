package com.tencent.mm.vending.a;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class b<_Struct, _Item> extends com.tencent.mm.vending.base.b<_Struct, Cursor>
{
  protected _Item JE;
  protected Map<Integer, _Item> kaV = null;
  protected int mCount;
  public b.a zXa;
  protected Cursor zXb = null;

  public b(_Item param_Item)
  {
    this.JE = param_Item;
    this.mCount = -1;
    dLZ();
  }

  private Cursor getCursor()
  {
    if ((this.zXb == null) || (this.zXb.isClosed()))
      Assert.assertNotNull(this.zXb);
    return this.zXb;
  }

  public abstract _Item a(_Item param_Item, Cursor paramCursor);

  public final void bIf()
  {
    if (this.kaV != null)
      this.kaV.clear();
    if (this.zXb != null)
      this.zXb.close();
    this.mCount = -1;
  }

  protected abstract Cursor cuR();

  public final void dLZ()
  {
    if (this.kaV == null)
      this.kaV = new HashMap();
  }

  public final int dMa()
  {
    if (this.mCount < 0)
      this.mCount = getCursor().getCount();
    return this.mCount;
  }

  public void destroyAsynchronous()
  {
    bIf();
  }

  public final _Item getItem(int paramInt)
  {
    Object localObject;
    if (this.kaV != null)
    {
      localObject = this.kaV.get(Integer.valueOf(paramInt));
      if (localObject == null);
    }
    while (true)
    {
      return localObject;
      if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
      {
        localObject = null;
      }
      else if (this.kaV == null)
      {
        localObject = a(this.JE, getCursor());
      }
      else
      {
        localObject = a(null, getCursor());
        this.kaV.put(Integer.valueOf(paramInt), localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.a.b
 * JD-Core Version:    0.6.2
 */