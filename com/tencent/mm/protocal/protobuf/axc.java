package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class axc extends com.tencent.mm.bt.a
{
  public int jBv;
  public int wBd;
  public b wBe;
  public int wBl;
  public int wBm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70483);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wBd);
      if (this.wBe != null)
        paramArrayOfObject.c(2, this.wBe);
      paramArrayOfObject.iz(3, this.wBl);
      paramArrayOfObject.iz(4, this.jBv);
      paramArrayOfObject.iz(5, this.wBm);
      AppMethodBeat.o(70483);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wBd) + 0;
        paramInt = i;
        if (this.wBe != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.wBe);
        paramInt = paramInt + e.a.a.b.b.a.bs(3, this.wBl) + e.a.a.b.b.a.bs(4, this.jBv) + e.a.a.b.b.a.bs(5, this.wBm);
        AppMethodBeat.o(70483);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(70483);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axc localaxc = (axc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(70483);
          break;
        case 1:
          localaxc.wBd = locala.BTU.vd();
          AppMethodBeat.o(70483);
          paramInt = 0;
          break;
        case 2:
          localaxc.wBe = locala.BTU.emu();
          AppMethodBeat.o(70483);
          paramInt = 0;
          break;
        case 3:
          localaxc.wBl = locala.BTU.vd();
          AppMethodBeat.o(70483);
          paramInt = 0;
          break;
        case 4:
          localaxc.jBv = locala.BTU.vd();
          AppMethodBeat.o(70483);
          paramInt = 0;
          break;
        case 5:
          localaxc.wBm = locala.BTU.vd();
          AppMethodBeat.o(70483);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(70483);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axc
 * JD-Core Version:    0.6.2
 */