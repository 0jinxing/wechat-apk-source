package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cw extends com.tencent.mm.bt.a
{
  public String Label;
  public String jBB;
  public int ndr;
  public long nds;
  public boolean ndt;
  public int ndu;
  public String ndv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111663);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(111663);
        throw paramArrayOfObject;
      }
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      paramArrayOfObject.iz(2, this.ndr);
      paramArrayOfObject.ai(3, this.nds);
      if (this.Label != null)
        paramArrayOfObject.e(4, this.Label);
      paramArrayOfObject.aO(5, this.ndt);
      paramArrayOfObject.iz(6, this.ndu);
      if (this.ndv != null)
        paramArrayOfObject.e(7, this.ndv);
      AppMethodBeat.o(111663);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label589;
    label589: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ndr) + e.a.a.b.b.a.o(3, this.nds);
      paramInt = i;
      if (this.Label != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Label);
      i = paramInt + (e.a.a.b.b.a.fv(5) + 1) + e.a.a.b.b.a.bs(6, this.ndu);
      paramInt = i;
      if (this.ndv != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.ndv);
      AppMethodBeat.o(111663);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(111663);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111663);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cw localcw = (cw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111663);
          break;
        case 1:
          localcw.jBB = locala.BTU.readString();
          AppMethodBeat.o(111663);
          paramInt = i;
          break;
        case 2:
          localcw.ndr = locala.BTU.vd();
          AppMethodBeat.o(111663);
          paramInt = i;
          break;
        case 3:
          localcw.nds = locala.BTU.ve();
          AppMethodBeat.o(111663);
          paramInt = i;
          break;
        case 4:
          localcw.Label = locala.BTU.readString();
          AppMethodBeat.o(111663);
          paramInt = i;
          break;
        case 5:
          localcw.ndt = locala.BTU.ehX();
          AppMethodBeat.o(111663);
          paramInt = i;
          break;
        case 6:
          localcw.ndu = locala.BTU.vd();
          AppMethodBeat.o(111663);
          paramInt = i;
          break;
        case 7:
          localcw.ndv = locala.BTU.readString();
          AppMethodBeat.o(111663);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111663);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cw
 * JD-Core Version:    0.6.2
 */