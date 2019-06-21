package com.qq.taf.jce.dynamic;

public final class ListField extends JceField
{
  private JceField[] data;

  ListField(JceField[] paramArrayOfJceField, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfJceField;
  }

  public final JceField get(int paramInt)
  {
    return this.data[paramInt];
  }

  public final JceField[] get()
  {
    return this.data;
  }

  public final void set(int paramInt, JceField paramJceField)
  {
    this.data[paramInt] = paramJceField;
  }

  public final void set(JceField[] paramArrayOfJceField)
  {
    this.data = paramArrayOfJceField;
  }

  public final int size()
  {
    return this.data.length;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.ListField
 * JD-Core Version:    0.6.2
 */