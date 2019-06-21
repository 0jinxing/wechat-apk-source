package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum bp$b
{
  final int value;

  static
  {
    AppMethodBeat.i(128651);
    ddp = new b("undefined", 0, 0);
    ddq = new b("normal", 1, 1000);
    ddr = new b("plugin", 2, 1001);
    dds = new b("wxstore", 3, 1002);
    ddt = new b("merchant", 4, 1003);
    ddu = new b("wagame", 5, 1004);
    ddv = new b("gift", 6, 1005);
    ddw = new b[] { ddp, ddq, ddr, dds, ddt, ddu, ddv };
    AppMethodBeat.o(128651);
  }

  private bp$b(int paramInt)
  {
    this.value = paramInt;
  }

  public static b gQ(int paramInt)
  {
    b localb;
    switch (paramInt)
    {
    default:
      localb = null;
    case 0:
    case 1000:
    case 1001:
    case 1002:
    case 1003:
    case 1004:
    case 1005:
    }
    while (true)
    {
      return localb;
      localb = ddp;
      continue;
      localb = ddq;
      continue;
      localb = ddr;
      continue;
      localb = dds;
      continue;
      localb = ddt;
      continue;
      localb = ddu;
      continue;
      localb = ddv;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.bp.b
 * JD-Core Version:    0.6.2
 */