package com.tencent.mm.booter.notification;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

public final class c$a
  implements Serializable
{
  public int edE;
  public String userName;

  public final String toString()
  {
    AppMethodBeat.i(15925);
    String str = "[" + this.userName + "(" + this.edE + ")]";
    AppMethodBeat.o(15925);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.c.a
 * JD-Core Version:    0.6.2
 */