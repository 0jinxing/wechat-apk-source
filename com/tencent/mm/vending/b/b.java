package com.tencent.mm.vending.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.h.d;
import junit.framework.Assert;

public final class b<_Callback>
  implements com.tencent.mm.vending.e.a
{
  private int c;
  public _Callback d;
  private int e;
  private a zXC;
  public d zXD;

  public b(_Callback param_Callback, a parama)
  {
    AppMethodBeat.i(126108);
    this.c = -1;
    Assert.assertNotNull("Callback should not be null!", param_Callback);
    this.e = param_Callback.hashCode();
    this.d = param_Callback;
    this.zXC = parama;
    AppMethodBeat.o(126108);
  }

  public final void dead()
  {
    AppMethodBeat.i(126110);
    Assert.assertNotNull(this.zXC);
    this.zXC.b(this);
    AppMethodBeat.o(126110);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(126109);
    boolean bool;
    if ((paramObject != null) && (paramObject.hashCode() == this.e))
    {
      bool = true;
      AppMethodBeat.o(126109);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126109);
    }
  }

  public final int hashCode()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.b.b
 * JD-Core Version:    0.6.2
 */