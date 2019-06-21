package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

class StructField$1
  implements Comparator<JceField>
{
  public int compare(JceField paramJceField1, JceField paramJceField2)
  {
    AppMethodBeat.i(117009);
    int i = paramJceField1.getTag();
    int j = paramJceField2.getTag();
    AppMethodBeat.o(117009);
    return i - j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.StructField.1
 * JD-Core Version:    0.6.2
 */