package com.qq.taf.jce.dynamic;

public final class MapField extends JceField
{
  private JceField[] keys;
  private JceField[] values;

  MapField(JceField[] paramArrayOfJceField1, JceField[] paramArrayOfJceField2, int paramInt)
  {
    super(paramInt);
    this.keys = paramArrayOfJceField1;
    this.values = paramArrayOfJceField2;
  }

  public final JceField getKey(int paramInt)
  {
    return this.keys[paramInt];
  }

  public final JceField[] getKeys()
  {
    return this.keys;
  }

  public final JceField getValue(int paramInt)
  {
    return this.values[paramInt];
  }

  public final JceField[] getValues()
  {
    return this.values;
  }

  public final void setKey(int paramInt, JceField paramJceField)
  {
    this.keys[paramInt] = paramJceField;
  }

  public final void setValue(int paramInt, JceField paramJceField)
  {
    this.values[paramInt] = paramJceField;
  }

  public final int size()
  {
    return this.keys.length;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.MapField
 * JD-Core Version:    0.6.2
 */