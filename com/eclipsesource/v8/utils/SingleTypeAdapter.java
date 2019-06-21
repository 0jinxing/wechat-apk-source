package com.eclipsesource.v8.utils;

public abstract class SingleTypeAdapter
  implements TypeAdapter
{
  private int typeToAdapt;

  public SingleTypeAdapter(int paramInt)
  {
    this.typeToAdapt = paramInt;
  }

  public Object adapt(int paramInt, Object paramObject)
  {
    if (paramInt == this.typeToAdapt);
    for (paramObject = adapt(paramObject); ; paramObject = TypeAdapter.DEFAULT)
      return paramObject;
  }

  public abstract Object adapt(Object paramObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.SingleTypeAdapter
 * JD-Core Version:    0.6.2
 */