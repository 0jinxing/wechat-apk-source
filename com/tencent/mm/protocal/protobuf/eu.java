package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class eu extends com.tencent.mm.bt.a
{
  public long jVD;
  public int jVE;
  public String url;
  public String vGE;
  public int vGF;
  public int vGG;
  public long vGH;
  public int vGI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11691);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vGE != null)
        paramArrayOfObject.e(1, this.vGE);
      paramArrayOfObject.ai(2, this.jVD);
      paramArrayOfObject.iz(3, this.jVE);
      paramArrayOfObject.iz(4, this.vGF);
      paramArrayOfObject.iz(5, this.vGG);
      paramArrayOfObject.ai(6, this.vGH);
      paramArrayOfObject.iz(7, this.vGI);
      if (this.url != null)
        paramArrayOfObject.e(8, this.url);
      AppMethodBeat.o(11691);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vGE == null)
        break label582;
    label582: for (paramInt = e.a.a.b.b.a.f(1, this.vGE) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.jVD) + e.a.a.b.b.a.bs(3, this.jVE) + e.a.a.b.b.a.bs(4, this.vGF) + e.a.a.b.b.a.bs(5, this.vGG) + e.a.a.b.b.a.o(6, this.vGH) + e.a.a.b.b.a.bs(7, this.vGI);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.url);
      AppMethodBeat.o(11691);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11691);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        eu localeu = (eu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11691);
          break;
        case 1:
          localeu.vGE = locala.BTU.readString();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        case 2:
          localeu.jVD = locala.BTU.ve();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        case 3:
          localeu.jVE = locala.BTU.vd();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        case 4:
          localeu.vGF = locala.BTU.vd();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        case 5:
          localeu.vGG = locala.BTU.vd();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        case 6:
          localeu.vGH = locala.BTU.ve();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        case 7:
          localeu.vGI = locala.BTU.vd();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        case 8:
          localeu.url = locala.BTU.readString();
          AppMethodBeat.o(11691);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11691);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.eu
 * JD-Core Version:    0.6.2
 */