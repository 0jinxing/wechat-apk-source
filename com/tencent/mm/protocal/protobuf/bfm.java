package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bfm extends com.tencent.mm.bt.a
{
  public int vPb;
  public int vZF;
  public int wJq;
  public String wJr;
  public String wJs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28564);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vPb);
      if (this.wJs != null)
        paramArrayOfObject.e(3, this.wJs);
      paramArrayOfObject.iz(4, this.wJq);
      paramArrayOfObject.iz(5, this.vZF);
      if (this.wJr != null)
        paramArrayOfObject.e(6, this.wJr);
      AppMethodBeat.o(28564);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vPb) + 0;
        paramInt = i;
        if (this.wJs != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.wJs);
        i = paramInt + e.a.a.b.b.a.bs(4, this.wJq) + e.a.a.b.b.a.bs(5, this.vZF);
        paramInt = i;
        if (this.wJr != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wJr);
        AppMethodBeat.o(28564);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28564);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bfm localbfm = (bfm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 2:
        default:
          AppMethodBeat.o(28564);
          paramInt = -1;
          break;
        case 1:
          localbfm.vPb = locala.BTU.vd();
          AppMethodBeat.o(28564);
          paramInt = 0;
          break;
        case 3:
          localbfm.wJs = locala.BTU.readString();
          AppMethodBeat.o(28564);
          paramInt = 0;
          break;
        case 4:
          localbfm.wJq = locala.BTU.vd();
          AppMethodBeat.o(28564);
          paramInt = 0;
          break;
        case 5:
          localbfm.vZF = locala.BTU.vd();
          AppMethodBeat.o(28564);
          paramInt = 0;
          break;
        case 6:
          localbfm.wJr = locala.BTU.readString();
          AppMethodBeat.o(28564);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28564);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfm
 * JD-Core Version:    0.6.2
 */