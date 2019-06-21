package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvy extends com.tencent.mm.bt.a
{
  public int vMG;
  public String xrQ;
  public String xrR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96319);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vMG);
      if (this.xrQ != null)
        paramArrayOfObject.e(2, this.xrQ);
      if (this.xrR != null)
        paramArrayOfObject.e(3, this.xrR);
      AppMethodBeat.o(96319);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vMG) + 0;
        paramInt = i;
        if (this.xrQ != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xrQ);
        i = paramInt;
        if (this.xrR != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.xrR);
        AppMethodBeat.o(96319);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96319);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvy localcvy = (cvy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96319);
          break;
        case 1:
          localcvy.vMG = locala.BTU.vd();
          AppMethodBeat.o(96319);
          paramInt = 0;
          break;
        case 2:
          localcvy.xrQ = locala.BTU.readString();
          AppMethodBeat.o(96319);
          paramInt = 0;
          break;
        case 3:
          localcvy.xrR = locala.BTU.readString();
          AppMethodBeat.o(96319);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96319);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvy
 * JD-Core Version:    0.6.2
 */