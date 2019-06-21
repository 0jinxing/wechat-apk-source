package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zq extends com.tencent.mm.bt.a
{
  public int weH;
  public String weI;
  public String weJ;
  public String weV;
  public String weW;
  public int weX;
  public int weY;
  public String weZ;
  public String wfa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28402);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.weH);
      if (this.weI != null)
        paramArrayOfObject.e(2, this.weI);
      if (this.weV != null)
        paramArrayOfObject.e(3, this.weV);
      if (this.weW != null)
        paramArrayOfObject.e(4, this.weW);
      paramArrayOfObject.iz(5, this.weX);
      paramArrayOfObject.iz(6, this.weY);
      if (this.weZ != null)
        paramArrayOfObject.e(7, this.weZ);
      if (this.weJ != null)
        paramArrayOfObject.e(8, this.weJ);
      if (this.wfa != null)
        paramArrayOfObject.e(9, this.wfa);
      AppMethodBeat.o(28402);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.weH) + 0;
        paramInt = i;
        if (this.weI != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.weI);
        i = paramInt;
        if (this.weV != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.weV);
        paramInt = i;
        if (this.weW != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.weW);
        i = paramInt + e.a.a.b.b.a.bs(5, this.weX) + e.a.a.b.b.a.bs(6, this.weY);
        paramInt = i;
        if (this.weZ != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.weZ);
        i = paramInt;
        if (this.weJ != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.weJ);
        paramInt = i;
        if (this.wfa != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.wfa);
        AppMethodBeat.o(28402);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28402);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        zq localzq = (zq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28402);
          break;
        case 1:
          localzq.weH = locala.BTU.vd();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 2:
          localzq.weI = locala.BTU.readString();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 3:
          localzq.weV = locala.BTU.readString();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 4:
          localzq.weW = locala.BTU.readString();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 5:
          localzq.weX = locala.BTU.vd();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 6:
          localzq.weY = locala.BTU.vd();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 7:
          localzq.weZ = locala.BTU.readString();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 8:
          localzq.weJ = locala.BTU.readString();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        case 9:
          localzq.wfa = locala.BTU.readString();
          AppMethodBeat.o(28402);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28402);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zq
 * JD-Core Version:    0.6.2
 */