package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aax extends com.tencent.mm.bt.a
{
  public int vEp;
  public String vEv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51398);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vEp);
      if (this.vEv != null)
        paramArrayOfObject.e(2, this.vEv);
      AppMethodBeat.o(51398);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vEp) + 0;
        paramInt = i;
        if (this.vEv != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vEv);
        AppMethodBeat.o(51398);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51398);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aax localaax = (aax)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(51398);
          paramInt = -1;
          break;
        case 1:
          localaax.vEp = locala.BTU.vd();
          AppMethodBeat.o(51398);
          paramInt = 0;
          break;
        case 2:
          localaax.vEv = locala.BTU.readString();
          AppMethodBeat.o(51398);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(51398);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aax
 * JD-Core Version:    0.6.2
 */