package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cat extends com.tencent.mm.bt.a
{
  public int jCt;
  public String ncM;
  public int pcX;
  public int vFH;
  public String vHl;
  public String wCW;
  public int wGu;
  public int wZF;
  public int wZG;
  public int wZH;
  public long wZI;
  public long wZJ;
  public int wZL;
  public String xaa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94570);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHl != null)
        paramArrayOfObject.e(1, this.vHl);
      if (this.wCW != null)
        paramArrayOfObject.e(2, this.wCW);
      paramArrayOfObject.iz(3, this.vFH);
      paramArrayOfObject.iz(4, this.jCt);
      if (this.ncM != null)
        paramArrayOfObject.e(5, this.ncM);
      paramArrayOfObject.iz(6, this.pcX);
      paramArrayOfObject.iz(7, this.wZG);
      paramArrayOfObject.iz(8, this.wZF);
      if (this.xaa != null)
        paramArrayOfObject.e(9, this.xaa);
      paramArrayOfObject.iz(10, this.wZH);
      paramArrayOfObject.ai(11, this.wZI);
      paramArrayOfObject.ai(12, this.wZJ);
      paramArrayOfObject.iz(13, this.wGu);
      paramArrayOfObject.iz(14, this.wZL);
      AppMethodBeat.o(94570);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHl == null)
        break label890;
    label890: for (paramInt = e.a.a.b.b.a.f(1, this.vHl) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wCW != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wCW);
      i = i + e.a.a.b.b.a.bs(3, this.vFH) + e.a.a.b.b.a.bs(4, this.jCt);
      paramInt = i;
      if (this.ncM != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ncM);
      i = paramInt + e.a.a.b.b.a.bs(6, this.pcX) + e.a.a.b.b.a.bs(7, this.wZG) + e.a.a.b.b.a.bs(8, this.wZF);
      paramInt = i;
      if (this.xaa != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.xaa);
      paramInt = paramInt + e.a.a.b.b.a.bs(10, this.wZH) + e.a.a.b.b.a.o(11, this.wZI) + e.a.a.b.b.a.o(12, this.wZJ) + e.a.a.b.b.a.bs(13, this.wGu) + e.a.a.b.b.a.bs(14, this.wZL);
      AppMethodBeat.o(94570);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94570);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cat localcat = (cat)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94570);
          break;
        case 1:
          localcat.vHl = locala.BTU.readString();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 2:
          localcat.wCW = locala.BTU.readString();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 3:
          localcat.vFH = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 4:
          localcat.jCt = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 5:
          localcat.ncM = locala.BTU.readString();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 6:
          localcat.pcX = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 7:
          localcat.wZG = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 8:
          localcat.wZF = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 9:
          localcat.xaa = locala.BTU.readString();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 10:
          localcat.wZH = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 11:
          localcat.wZI = locala.BTU.ve();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 12:
          localcat.wZJ = locala.BTU.ve();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 13:
          localcat.wGu = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        case 14:
          localcat.wZL = locala.BTU.vd();
          AppMethodBeat.o(94570);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94570);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cat
 * JD-Core Version:    0.6.2
 */