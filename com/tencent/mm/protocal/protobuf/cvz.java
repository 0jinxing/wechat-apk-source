package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvz extends com.tencent.mm.bt.a
{
  public String cEh;
  public String puh;
  public String xrS;
  public String xrT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80212);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xrS != null)
        paramArrayOfObject.e(1, this.xrS);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      if (this.puh != null)
        paramArrayOfObject.e(3, this.puh);
      if (this.xrT != null)
        paramArrayOfObject.e(4, this.xrT);
      AppMethodBeat.o(80212);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xrS == null)
        break label416;
    label416: for (i = e.a.a.b.b.a.f(1, this.xrS) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cEh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cEh);
      i = paramInt;
      if (this.puh != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.puh);
      paramInt = i;
      if (this.xrT != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xrT);
      AppMethodBeat.o(80212);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80212);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvz localcvz = (cvz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80212);
          break;
        case 1:
          localcvz.xrS = locala.BTU.readString();
          AppMethodBeat.o(80212);
          paramInt = i;
          break;
        case 2:
          localcvz.cEh = locala.BTU.readString();
          AppMethodBeat.o(80212);
          paramInt = i;
          break;
        case 3:
          localcvz.puh = locala.BTU.readString();
          AppMethodBeat.o(80212);
          paramInt = i;
          break;
        case 4:
          localcvz.xrT = locala.BTU.readString();
          AppMethodBeat.o(80212);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80212);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvz
 * JD-Core Version:    0.6.2
 */