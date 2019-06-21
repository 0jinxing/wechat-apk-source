package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cdn extends com.tencent.mm.bt.a
{
  public int Timestamp;
  public int jCs;
  public int xdi;
  public int xdj;
  public int xdk;
  public int xdl;
  public int xdm;
  public int xdn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28659);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCs);
      paramArrayOfObject.iz(2, this.Timestamp);
      paramArrayOfObject.iz(3, this.xdi);
      paramArrayOfObject.iz(4, this.xdj);
      paramArrayOfObject.iz(5, this.xdk);
      paramArrayOfObject.iz(6, this.xdl);
      paramArrayOfObject.iz(7, this.xdm);
      paramArrayOfObject.iz(8, this.xdn);
      AppMethodBeat.o(28659);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.jCs) + 0 + e.a.a.b.b.a.bs(2, this.Timestamp) + e.a.a.b.b.a.bs(3, this.xdi) + e.a.a.b.b.a.bs(4, this.xdj) + e.a.a.b.b.a.bs(5, this.xdk) + e.a.a.b.b.a.bs(6, this.xdl) + e.a.a.b.b.a.bs(7, this.xdm) + e.a.a.b.b.a.bs(8, this.xdn);
        AppMethodBeat.o(28659);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28659);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdn localcdn = (cdn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28659);
          break;
        case 1:
          localcdn.jCs = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        case 2:
          localcdn.Timestamp = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        case 3:
          localcdn.xdi = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        case 4:
          localcdn.xdj = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        case 5:
          localcdn.xdk = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        case 6:
          localcdn.xdl = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        case 7:
          localcdn.xdm = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        case 8:
          localcdn.xdn = locala.BTU.vd();
          AppMethodBeat.o(28659);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28659);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdn
 * JD-Core Version:    0.6.2
 */