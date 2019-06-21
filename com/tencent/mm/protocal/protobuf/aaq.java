package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aaq extends com.tencent.mm.bt.a
{
  public int jBT;
  public String vRw;
  public int vRx;
  public String vXB;
  public String vXC;
  public String vXD;
  public int vXE;
  public String wfP;
  public String wfQ;
  public int wfR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51389);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vXB != null)
        paramArrayOfObject.e(1, this.vXB);
      if (this.vXC != null)
        paramArrayOfObject.e(2, this.vXC);
      if (this.vXD != null)
        paramArrayOfObject.e(3, this.vXD);
      paramArrayOfObject.iz(4, this.vXE);
      if (this.wfP != null)
        paramArrayOfObject.e(5, this.wfP);
      if (this.vRw != null)
        paramArrayOfObject.e(6, this.vRw);
      paramArrayOfObject.iz(7, this.vRx);
      if (this.wfQ != null)
        paramArrayOfObject.e(8, this.wfQ);
      paramArrayOfObject.iz(9, this.jBT);
      paramArrayOfObject.iz(10, this.wfR);
      AppMethodBeat.o(51389);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vXB == null)
        break label738;
    label738: for (i = e.a.a.b.b.a.f(1, this.vXB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vXC != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vXC);
      i = paramInt;
      if (this.vXD != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vXD);
      i += e.a.a.b.b.a.bs(4, this.vXE);
      paramInt = i;
      if (this.wfP != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wfP);
      i = paramInt;
      if (this.vRw != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vRw);
      i += e.a.a.b.b.a.bs(7, this.vRx);
      paramInt = i;
      if (this.wfQ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wfQ);
      paramInt = paramInt + e.a.a.b.b.a.bs(9, this.jBT) + e.a.a.b.b.a.bs(10, this.wfR);
      AppMethodBeat.o(51389);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51389);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aaq localaaq = (aaq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51389);
          break;
        case 1:
          localaaq.vXB = locala.BTU.readString();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 2:
          localaaq.vXC = locala.BTU.readString();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 3:
          localaaq.vXD = locala.BTU.readString();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 4:
          localaaq.vXE = locala.BTU.vd();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 5:
          localaaq.wfP = locala.BTU.readString();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 6:
          localaaq.vRw = locala.BTU.readString();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 7:
          localaaq.vRx = locala.BTU.vd();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 8:
          localaaq.wfQ = locala.BTU.readString();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 9:
          localaaq.jBT = locala.BTU.vd();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        case 10:
          localaaq.wfR = locala.BTU.vd();
          AppMethodBeat.o(51389);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51389);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aaq
 * JD-Core Version:    0.6.2
 */