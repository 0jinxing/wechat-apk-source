package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bbn extends com.tencent.mm.bt.a
{
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  public String guW;
  public String jBB;
  public int jCt;
  public String vXm;
  public String vXn;
  public int wGb;
  public int wGc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28551);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.guN);
      if (this.guP != null)
        paramArrayOfObject.e(4, this.guP);
      if (this.guO != null)
        paramArrayOfObject.e(5, this.guO);
      if (this.guQ != null)
        paramArrayOfObject.e(6, this.guQ);
      paramArrayOfObject.iz(7, this.wGb);
      paramArrayOfObject.iz(8, this.wGc);
      if (this.guW != null)
        paramArrayOfObject.e(9, this.guW);
      if (this.vXm != null)
        paramArrayOfObject.e(10, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(11, this.vXn);
      AppMethodBeat.o(28551);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label818;
    label818: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.guN);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.guP);
      i = paramInt;
      if (this.guO != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.guO);
      paramInt = i;
      if (this.guQ != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.guQ);
      i = paramInt + e.a.a.b.b.a.bs(7, this.wGb) + e.a.a.b.b.a.bs(8, this.wGc);
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.guW);
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vXn);
      AppMethodBeat.o(28551);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28551);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbn localbbn = (bbn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28551);
          break;
        case 1:
          localbbn.jBB = locala.BTU.readString();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 2:
          localbbn.jCt = locala.BTU.vd();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 3:
          localbbn.guN = locala.BTU.vd();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 4:
          localbbn.guP = locala.BTU.readString();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 5:
          localbbn.guO = locala.BTU.readString();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 6:
          localbbn.guQ = locala.BTU.readString();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 7:
          localbbn.wGb = locala.BTU.vd();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 8:
          localbbn.wGc = locala.BTU.vd();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 9:
          localbbn.guW = locala.BTU.readString();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 10:
          localbbn.vXm = locala.BTU.readString();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        case 11:
          localbbn.vXn = locala.BTU.readString();
          AppMethodBeat.o(28551);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28551);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbn
 * JD-Core Version:    0.6.2
 */