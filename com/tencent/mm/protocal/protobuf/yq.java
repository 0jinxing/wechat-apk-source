package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class yq extends com.tencent.mm.bt.a
{
  public String color;
  public int pLQ;
  public String pLR;
  public String pLS;
  public int pLT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48840);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.pLQ);
      if (this.pLR != null)
        paramArrayOfObject.e(2, this.pLR);
      if (this.pLS != null)
        paramArrayOfObject.e(3, this.pLS);
      paramArrayOfObject.iz(4, this.pLT);
      if (this.color != null)
        paramArrayOfObject.e(5, this.color);
      AppMethodBeat.o(48840);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.pLQ) + 0;
        paramInt = i;
        if (this.pLR != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.pLR);
        i = paramInt;
        if (this.pLS != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.pLS);
        i += e.a.a.b.b.a.bs(4, this.pLT);
        paramInt = i;
        if (this.color != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.color);
        AppMethodBeat.o(48840);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48840);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        yq localyq = (yq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48840);
          break;
        case 1:
          localyq.pLQ = locala.BTU.vd();
          AppMethodBeat.o(48840);
          paramInt = 0;
          break;
        case 2:
          localyq.pLR = locala.BTU.readString();
          AppMethodBeat.o(48840);
          paramInt = 0;
          break;
        case 3:
          localyq.pLS = locala.BTU.readString();
          AppMethodBeat.o(48840);
          paramInt = 0;
          break;
        case 4:
          localyq.pLT = locala.BTU.vd();
          AppMethodBeat.o(48840);
          paramInt = 0;
          break;
        case 5:
          localyq.color = locala.BTU.readString();
          AppMethodBeat.o(48840);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48840);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yq
 * JD-Core Version:    0.6.2
 */