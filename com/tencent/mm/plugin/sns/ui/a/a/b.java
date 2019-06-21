package com.tencent.mm.plugin.sns.ui.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.k.c.a;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;

public final class b
{
  public boolean hasInit;
  public a rEQ;
  public c.a rER;
  public int rzl;

  public b()
  {
    AppMethodBeat.i(39948);
    this.rEQ = new a();
    this.rER = null;
    this.rzl = 0;
    this.hasInit = false;
    AppMethodBeat.o(39948);
  }

  private void b(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(39949);
    Object localObject = this.rEQ;
    if (((a)localObject).ryk != null)
    {
      localObject = ((a)localObject).ryk.rNp;
      f.b(paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt)).c((com.tencent.mm.vending.c.a)localObject);
    }
    AppMethodBeat.o(39949);
  }

  private void c(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(39950);
    Object localObject = this.rEQ;
    if (((a)localObject).ryk != null)
    {
      localObject = ((a)localObject).ryk.rNq;
      f.b(paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt)).c((com.tencent.mm.vending.c.a)localObject);
    }
    AppMethodBeat.o(39950);
  }

  public final void d(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(39951);
    if (!this.hasInit)
      AppMethodBeat.o(39951);
    while (true)
    {
      return;
      if (this.rzl == 0)
        b(paramString, paramBoolean1, paramBoolean2, paramInt);
      AppMethodBeat.o(39951);
    }
  }

  public final void e(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(39952);
    if (!this.hasInit)
      AppMethodBeat.o(39952);
    while (true)
    {
      return;
      if (this.rzl == 0)
        c(paramString, paramBoolean1, paramBoolean2, paramInt);
      AppMethodBeat.o(39952);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.a.a.b
 * JD-Core Version:    0.6.2
 */