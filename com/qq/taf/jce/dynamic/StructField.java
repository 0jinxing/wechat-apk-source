package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Comparator;

public class StructField extends JceField
{
  private static final Comparator<JceField> tagComp;
  private JceField[] data;

  static
  {
    AppMethodBeat.i(117011);
    tagComp = new StructField.1();
    AppMethodBeat.o(117011);
  }

  StructField(JceField[] paramArrayOfJceField, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfJceField;
  }

  public JceField[] get()
  {
    return this.data;
  }

  public JceField getFieldByTag(int paramInt)
  {
    AppMethodBeat.i(117013);
    paramInt = Arrays.binarySearch(this.data, JceField.createZero(paramInt), tagComp);
    JceField localJceField;
    if (paramInt >= 0)
    {
      localJceField = this.data[paramInt];
      AppMethodBeat.o(117013);
    }
    while (true)
    {
      return localJceField;
      localJceField = null;
      AppMethodBeat.o(117013);
    }
  }

  public boolean setByTag(int paramInt, JceField paramJceField)
  {
    AppMethodBeat.i(117012);
    paramInt = Arrays.binarySearch(this.data, JceField.createZero(paramInt), tagComp);
    boolean bool;
    if (paramInt >= 0)
    {
      this.data[paramInt] = paramJceField;
      bool = true;
      AppMethodBeat.o(117012);
      return bool;
    }
    int i = -paramInt - 1;
    JceField[] arrayOfJceField = new JceField[this.data.length + 1];
    paramInt = 0;
    label60: if (paramInt >= i)
      arrayOfJceField[i] = paramJceField;
    for (paramInt = i; ; paramInt++)
    {
      if (paramInt >= this.data.length)
      {
        AppMethodBeat.o(117012);
        bool = false;
        break;
        arrayOfJceField[paramInt] = this.data[paramInt];
        paramInt++;
        break label60;
      }
      arrayOfJceField[(paramInt + 1)] = this.data[paramInt];
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.StructField
 * JD-Core Version:    0.6.2
 */