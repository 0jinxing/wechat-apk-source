package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.bo;

abstract class bv$a
{
  private bv$a(bv parambv)
  {
  }

  public void a(bt parambt, Object[] paramArrayOfObject)
  {
    int i = 1;
    int j = i;
    if (paramArrayOfObject != null)
    {
      j = i;
      if (paramArrayOfObject.length > 0)
        j = bo.g(paramArrayOfObject[0], 1);
    }
    parambt.fns = (j + bo.getInt(parambt.fns, 0));
  }

  public abstract boolean a(bt parambt);

  public bt d(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 1;
    int j = i;
    if (paramArrayOfObject != null)
    {
      j = i;
      if (paramArrayOfObject.length > 0)
        j = bo.g(paramArrayOfObject[0], 1);
    }
    paramArrayOfObject = new bt();
    paramArrayOfObject.key = paramInt;
    paramArrayOfObject.fns = String.valueOf(j);
    paramArrayOfObject.eRt = 0L;
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bv.a
 * JD-Core Version:    0.6.2
 */