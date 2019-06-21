package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$e
{
  long bFv;
  boolean bFw = y.bIR;

  private n$e(n paramn)
  {
  }

  private void reset()
  {
    this.bFv = 0L;
    this.bFw = y.bIR;
  }

  final void aW(boolean paramBoolean)
  {
    AppMethodBeat.i(55683);
    StringBuilder localStringBuilder;
    if ((this.bFw ^ paramBoolean))
    {
      if (!this.bFw)
        break label156;
      paramBoolean = false;
      this.bFw = paramBoolean;
      this.bFx.bEX.wo();
      this.bFx.bEX.wq();
      this.bFx.bEU.aW(this.bFw);
      this.bFx.wd();
      if (y.bIM)
      {
        localStringBuilder = new StringBuilder("vehicle mode: ");
        if (!this.bFw)
          break label161;
      }
    }
    label156: label161: for (String str = "enable"; ; str = "disable")
    {
      str = str;
      o.s("filter_input_log_" + y.bIT, str);
      o.s("filter_output_log_" + y.bIT, str);
      AppMethodBeat.o(55683);
      return;
      paramBoolean = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.b.a.a.n.e
 * JD-Core Version:    0.6.2
 */