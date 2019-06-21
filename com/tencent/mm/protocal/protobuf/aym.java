package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aym extends com.tencent.mm.bt.a
{
  public String jBB;
  public int jBT;
  public String jCH;
  public String pXM;
  public String vXm;
  public String vXn;
  public String wlF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73732);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pXM != null)
        paramArrayOfObject.e(1, this.pXM);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      paramArrayOfObject.iz(3, this.jBT);
      if (this.vXm != null)
        paramArrayOfObject.e(4, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(5, this.vXn);
      if (this.jCH != null)
        paramArrayOfObject.e(6, this.jCH);
      if (this.wlF != null)
        paramArrayOfObject.e(7, this.wlF);
      AppMethodBeat.o(73732);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pXM == null)
        break label597;
    label597: for (paramInt = e.a.a.b.b.a.f(1, this.pXM) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
      i += e.a.a.b.b.a.bs(3, this.jBT);
      paramInt = i;
      if (this.vXm != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vXm);
      i = paramInt;
      if (this.vXn != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vXn);
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.jCH);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wlF);
      AppMethodBeat.o(73732);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73732);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aym localaym = (aym)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73732);
          break;
        case 1:
          localaym.pXM = locala.BTU.readString();
          AppMethodBeat.o(73732);
          paramInt = i;
          break;
        case 2:
          localaym.jBB = locala.BTU.readString();
          AppMethodBeat.o(73732);
          paramInt = i;
          break;
        case 3:
          localaym.jBT = locala.BTU.vd();
          AppMethodBeat.o(73732);
          paramInt = i;
          break;
        case 4:
          localaym.vXm = locala.BTU.readString();
          AppMethodBeat.o(73732);
          paramInt = i;
          break;
        case 5:
          localaym.vXn = locala.BTU.readString();
          AppMethodBeat.o(73732);
          paramInt = i;
          break;
        case 6:
          localaym.jCH = locala.BTU.readString();
          AppMethodBeat.o(73732);
          paramInt = i;
          break;
        case 7:
          localaym.wlF = locala.BTU.readString();
          AppMethodBeat.o(73732);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73732);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aym
 * JD-Core Version:    0.6.2
 */