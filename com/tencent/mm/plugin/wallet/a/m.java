package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m extends com.tencent.mm.bt.a
{
  public int jkL;
  public String pbo;
  public String tnr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56655);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.tnr != null)
        paramArrayOfObject.e(1, this.tnr);
      paramArrayOfObject.iz(2, this.jkL);
      if (this.pbo != null)
        paramArrayOfObject.e(3, this.pbo);
      AppMethodBeat.o(56655);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.tnr == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.tnr) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jkL);
      paramInt = i;
      if (this.pbo != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pbo);
      AppMethodBeat.o(56655);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56655);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        m localm = (m)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56655);
          break;
        case 1:
          localm.tnr = locala.BTU.readString();
          AppMethodBeat.o(56655);
          paramInt = i;
          break;
        case 2:
          localm.jkL = locala.BTU.vd();
          AppMethodBeat.o(56655);
          paramInt = i;
          break;
        case 3:
          localm.pbo = locala.BTU.readString();
          AppMethodBeat.o(56655);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56655);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.m
 * JD-Core Version:    0.6.2
 */