package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class rj extends com.tencent.mm.bt.a
{
  public int Scene;
  public int jCt;
  public String nqc;
  public String vYA;
  public String vYB;
  public String vYC;
  public String vYD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(50527);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Scene);
      paramArrayOfObject.iz(2, this.jCt);
      if (this.vYA != null)
        paramArrayOfObject.e(3, this.vYA);
      if (this.vYB != null)
        paramArrayOfObject.e(4, this.vYB);
      if (this.nqc != null)
        paramArrayOfObject.e(5, this.nqc);
      if (this.vYC != null)
        paramArrayOfObject.e(6, this.vYC);
      if (this.vYD != null)
        paramArrayOfObject.e(7, this.vYD);
      AppMethodBeat.o(50527);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.Scene) + 0 + e.a.a.b.b.a.bs(2, this.jCt);
        paramInt = i;
        if (this.vYA != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vYA);
        i = paramInt;
        if (this.vYB != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.vYB);
        int j = i;
        if (this.nqc != null)
          j = i + e.a.a.b.b.a.f(5, this.nqc);
        paramInt = j;
        if (this.vYC != null)
          paramInt = j + e.a.a.b.b.a.f(6, this.vYC);
        i = paramInt;
        if (this.vYD != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.vYD);
        AppMethodBeat.o(50527);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(50527);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        rj localrj = (rj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(50527);
          break;
        case 1:
          localrj.Scene = locala.BTU.vd();
          AppMethodBeat.o(50527);
          paramInt = 0;
          break;
        case 2:
          localrj.jCt = locala.BTU.vd();
          AppMethodBeat.o(50527);
          paramInt = 0;
          break;
        case 3:
          localrj.vYA = locala.BTU.readString();
          AppMethodBeat.o(50527);
          paramInt = 0;
          break;
        case 4:
          localrj.vYB = locala.BTU.readString();
          AppMethodBeat.o(50527);
          paramInt = 0;
          break;
        case 5:
          localrj.nqc = locala.BTU.readString();
          AppMethodBeat.o(50527);
          paramInt = 0;
          break;
        case 6:
          localrj.vYC = locala.BTU.readString();
          AppMethodBeat.o(50527);
          paramInt = 0;
          break;
        case 7:
          localrj.vYD = locala.BTU.readString();
          AppMethodBeat.o(50527);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(50527);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rj
 * JD-Core Version:    0.6.2
 */