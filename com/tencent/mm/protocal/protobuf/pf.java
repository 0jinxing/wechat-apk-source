package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class pf extends com.tencent.mm.bt.a
{
  public String cMC;
  public int kbZ;
  public String kfO;
  public int vWx;
  public String vWy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89048);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cMC != null)
        paramArrayOfObject.e(1, this.cMC);
      if (this.kfO != null)
        paramArrayOfObject.e(2, this.kfO);
      paramArrayOfObject.iz(3, this.kbZ);
      paramArrayOfObject.iz(4, this.vWx);
      if (this.vWy != null)
        paramArrayOfObject.e(5, this.vWy);
      AppMethodBeat.o(89048);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cMC == null)
        break label447;
    label447: for (paramInt = e.a.a.b.b.a.f(1, this.cMC) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kfO != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kfO);
      i = i + e.a.a.b.b.a.bs(3, this.kbZ) + e.a.a.b.b.a.bs(4, this.vWx);
      paramInt = i;
      if (this.vWy != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vWy);
      AppMethodBeat.o(89048);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89048);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        pf localpf = (pf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89048);
          break;
        case 1:
          localpf.cMC = locala.BTU.readString();
          AppMethodBeat.o(89048);
          paramInt = i;
          break;
        case 2:
          localpf.kfO = locala.BTU.readString();
          AppMethodBeat.o(89048);
          paramInt = i;
          break;
        case 3:
          localpf.kbZ = locala.BTU.vd();
          AppMethodBeat.o(89048);
          paramInt = i;
          break;
        case 4:
          localpf.vWx = locala.BTU.vd();
          AppMethodBeat.o(89048);
          paramInt = i;
          break;
        case 5:
          localpf.vWy = locala.BTU.readString();
          AppMethodBeat.o(89048);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89048);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pf
 * JD-Core Version:    0.6.2
 */