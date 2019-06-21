package com.tencent.d.e.a;

import android.content.Context;
import com.tencent.d.e.a.a.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d$a
{
  int Atn;
  public long Ato;
  int action;
  Context context;
  int requestType;
  long xzH;

  private d$a(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(114534);
    this.requestType = 0;
    this.Atn = 0;
    this.action = 0;
    this.Ato = (f.AtG * 12L);
    this.xzH = 0L;
    if (paramInt1 < 0)
    {
      paramContext = new IllegalArgumentException("scenes invalid: ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(114534);
      throw paramContext;
    }
    this.context = paramContext.getApplicationContext();
    this.Atn = paramInt1;
    this.action = paramInt2;
    AppMethodBeat.o(114534);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.d.a
 * JD-Core Version:    0.6.2
 */