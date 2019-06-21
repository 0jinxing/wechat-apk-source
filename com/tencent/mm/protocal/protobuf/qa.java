package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class qa extends com.tencent.mm.bt.a
{
  public int kKS;
  public String kKT;
  public String kKY;
  public String kKZ;
  public String kLL;
  public int vWZ;
  public String vXa;
  public int vXb;
  public String vXc;
  public int vXd;
  public String vXe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94513);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vWZ);
      if (this.kLL != null)
        paramArrayOfObject.e(2, this.kLL);
      if (this.vXa != null)
        paramArrayOfObject.e(3, this.vXa);
      if (this.kKY != null)
        paramArrayOfObject.e(4, this.kKY);
      paramArrayOfObject.iz(5, this.vXb);
      if (this.vXc != null)
        paramArrayOfObject.e(6, this.vXc);
      paramArrayOfObject.iz(7, this.vXd);
      if (this.kKZ != null)
        paramArrayOfObject.e(8, this.kKZ);
      if (this.vXe != null)
        paramArrayOfObject.e(9, this.vXe);
      paramArrayOfObject.iz(10, this.kKS);
      if (this.kKT != null)
        paramArrayOfObject.e(11, this.kKT);
      AppMethodBeat.o(94513);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vWZ) + 0;
        int i = paramInt;
        if (this.kLL != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.kLL);
        paramInt = i;
        if (this.vXa != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vXa);
        i = paramInt;
        if (this.kKY != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.kKY);
        i += e.a.a.b.b.a.bs(5, this.vXb);
        paramInt = i;
        if (this.vXc != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vXc);
        i = paramInt + e.a.a.b.b.a.bs(7, this.vXd);
        paramInt = i;
        if (this.kKZ != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.kKZ);
        i = paramInt;
        if (this.vXe != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.vXe);
        i += e.a.a.b.b.a.bs(10, this.kKS);
        paramInt = i;
        if (this.kKT != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.kKT);
        AppMethodBeat.o(94513);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94513);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        qa localqa = (qa)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94513);
          break;
        case 1:
          localqa.vWZ = locala.BTU.vd();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 2:
          localqa.kLL = locala.BTU.readString();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 3:
          localqa.vXa = locala.BTU.readString();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 4:
          localqa.kKY = locala.BTU.readString();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 5:
          localqa.vXb = locala.BTU.vd();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 6:
          localqa.vXc = locala.BTU.readString();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 7:
          localqa.vXd = locala.BTU.vd();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 8:
          localqa.kKZ = locala.BTU.readString();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 9:
          localqa.vXe = locala.BTU.readString();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 10:
          localqa.kKS = locala.BTU.vd();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        case 11:
          localqa.kKT = locala.BTU.readString();
          AppMethodBeat.o(94513);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94513);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qa
 * JD-Core Version:    0.6.2
 */