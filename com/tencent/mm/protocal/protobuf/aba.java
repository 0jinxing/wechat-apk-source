package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aba extends com.tencent.mm.bt.a
{
  public int jBT;
  public int vEp;
  public int vEq;
  public int vEr;
  public int vEs;
  public String vEv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51401);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vEp);
      paramArrayOfObject.iz(2, this.jBT);
      if (this.vEv != null)
        paramArrayOfObject.e(3, this.vEv);
      paramArrayOfObject.iz(4, this.vEq);
      paramArrayOfObject.iz(5, this.vEr);
      paramArrayOfObject.iz(6, this.vEs);
      AppMethodBeat.o(51401);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vEp) + 0 + e.a.a.b.b.a.bs(2, this.jBT);
        paramInt = i;
        if (this.vEv != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vEv);
        paramInt = paramInt + e.a.a.b.b.a.bs(4, this.vEq) + e.a.a.b.b.a.bs(5, this.vEr) + e.a.a.b.b.a.bs(6, this.vEs);
        AppMethodBeat.o(51401);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51401);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aba localaba = (aba)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51401);
          break;
        case 1:
          localaba.vEp = locala.BTU.vd();
          AppMethodBeat.o(51401);
          paramInt = 0;
          break;
        case 2:
          localaba.jBT = locala.BTU.vd();
          AppMethodBeat.o(51401);
          paramInt = 0;
          break;
        case 3:
          localaba.vEv = locala.BTU.readString();
          AppMethodBeat.o(51401);
          paramInt = 0;
          break;
        case 4:
          localaba.vEq = locala.BTU.vd();
          AppMethodBeat.o(51401);
          paramInt = 0;
          break;
        case 5:
          localaba.vEr = locala.BTU.vd();
          AppMethodBeat.o(51401);
          paramInt = 0;
          break;
        case 6:
          localaba.vEs = locala.BTU.vd();
          AppMethodBeat.o(51401);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51401);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aba
 * JD-Core Version:    0.6.2
 */