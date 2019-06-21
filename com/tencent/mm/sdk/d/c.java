package com.tencent.mm.sdk.d;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c
  implements a
{
  public void enter()
  {
  }

  public void exit()
  {
  }

  public String getName()
  {
    AppMethodBeat.i(52447);
    String str = getClass().getName();
    str = str.substring(str.lastIndexOf('$') + 1);
    AppMethodBeat.o(52447);
    return str;
  }

  public boolean k(Message paramMessage)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.d.c
 * JD-Core Version:    0.6.2
 */