package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxh extends com.tencent.mm.bt.a
{
  public int scene;
  public String xsI;
  public int xsJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96341);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xsI != null)
        paramArrayOfObject.e(1, this.xsI);
      paramArrayOfObject.iz(2, this.scene);
      paramArrayOfObject.iz(3, this.xsJ);
      AppMethodBeat.o(96341);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xsI == null)
        break label321;
    label321: for (paramInt = e.a.a.b.b.a.f(1, this.xsI) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.scene) + e.a.a.b.b.a.bs(3, this.xsJ);
      AppMethodBeat.o(96341);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96341);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxh localcxh = (cxh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96341);
          break;
        case 1:
          localcxh.xsI = locala.BTU.readString();
          AppMethodBeat.o(96341);
          paramInt = i;
          break;
        case 2:
          localcxh.scene = locala.BTU.vd();
          AppMethodBeat.o(96341);
          paramInt = i;
          break;
        case 3:
          localcxh.xsJ = locala.BTU.vd();
          AppMethodBeat.o(96341);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96341);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxh
 * JD-Core Version:    0.6.2
 */