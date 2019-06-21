package org.apache.commons.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.apache.commons.b.b.a;

public final class e
{
  public static String aa(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(116957);
    int i;
    a locala;
    label29: Object localObject;
    if (paramArrayOfObject[0] == null)
    {
      i = 16;
      locala = new a((i + 1) * 3);
      i = 0;
      if (i >= 3)
        break label93;
      if (i > 0)
        locala.emU();
      if (paramArrayOfObject[i] != null)
      {
        localObject = paramArrayOfObject[i];
        if (localObject != null)
          break label81;
        locala.emT();
      }
    }
    while (true)
    {
      i++;
      break label29;
      i = paramArrayOfObject[0].toString().length();
      break;
      label81: locala.awR(localObject.toString());
    }
    label93: paramArrayOfObject = locala.toString();
    AppMethodBeat.o(116957);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.e
 * JD-Core Version:    0.6.2
 */