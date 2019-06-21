package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bpw extends com.tencent.mm.bt.a
{
  public int Category;
  public int wSb;
  public int wSc;
  public LinkedList<String> wSd;
  public int wSe;

  public bpw()
  {
    AppMethodBeat.i(124334);
    this.wSd = new LinkedList();
    AppMethodBeat.o(124334);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124335);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wSb);
      paramArrayOfObject.iz(2, this.wSc);
      paramArrayOfObject.iz(3, this.Category);
      paramArrayOfObject.e(4, 1, this.wSd);
      paramArrayOfObject.iz(5, this.wSe);
      AppMethodBeat.o(124335);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wSb) + 0 + e.a.a.b.b.a.bs(2, this.wSc) + e.a.a.b.b.a.bs(3, this.Category) + e.a.a.a.c(4, 1, this.wSd) + e.a.a.b.b.a.bs(5, this.wSe);
        AppMethodBeat.o(124335);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wSd.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124335);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bpw localbpw = (bpw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124335);
          break;
        case 1:
          localbpw.wSb = locala.BTU.vd();
          AppMethodBeat.o(124335);
          paramInt = 0;
          break;
        case 2:
          localbpw.wSc = locala.BTU.vd();
          AppMethodBeat.o(124335);
          paramInt = 0;
          break;
        case 3:
          localbpw.Category = locala.BTU.vd();
          AppMethodBeat.o(124335);
          paramInt = 0;
          break;
        case 4:
          localbpw.wSd.add(locala.BTU.readString());
          AppMethodBeat.o(124335);
          paramInt = 0;
          break;
        case 5:
          localbpw.wSe = locala.BTU.vd();
          AppMethodBeat.o(124335);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124335);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpw
 * JD-Core Version:    0.6.2
 */