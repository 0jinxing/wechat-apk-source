package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class IntField extends NumberField
{
  private int data;

  IntField(int paramInt1, int paramInt2)
  {
    super(paramInt2);
    this.data = paramInt1;
  }

  public int get()
  {
    return this.data;
  }

  public Number getNumber()
  {
    AppMethodBeat.i(117007);
    int i = this.data;
    AppMethodBeat.o(117007);
    return Integer.valueOf(i);
  }

  public void set(int paramInt)
  {
    this.data = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.IntField
 * JD-Core Version:    0.6.2
 */