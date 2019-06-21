package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class tw extends com.tencent.mm.bt.a
{
  public String cuF;
  public String cuG;
  public int version;
  public int wbk;
  public int wbl;
  public String wbm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28365);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.version);
      paramArrayOfObject.iz(2, this.wbk);
      paramArrayOfObject.iz(3, this.wbl);
      if (this.cuG != null)
        paramArrayOfObject.e(4, this.cuG);
      if (this.wbm != null)
        paramArrayOfObject.e(5, this.wbm);
      if (this.cuF != null)
        paramArrayOfObject.e(6, this.cuF);
      AppMethodBeat.o(28365);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.version) + 0 + e.a.a.b.b.a.bs(2, this.wbk) + e.a.a.b.b.a.bs(3, this.wbl);
        paramInt = i;
        if (this.cuG != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.cuG);
        i = paramInt;
        if (this.wbm != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.wbm);
        paramInt = i;
        if (this.cuF != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.cuF);
        AppMethodBeat.o(28365);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28365);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        tw localtw = (tw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28365);
          break;
        case 1:
          localtw.version = locala.BTU.vd();
          AppMethodBeat.o(28365);
          paramInt = 0;
          break;
        case 2:
          localtw.wbk = locala.BTU.vd();
          AppMethodBeat.o(28365);
          paramInt = 0;
          break;
        case 3:
          localtw.wbl = locala.BTU.vd();
          AppMethodBeat.o(28365);
          paramInt = 0;
          break;
        case 4:
          localtw.cuG = locala.BTU.readString();
          AppMethodBeat.o(28365);
          paramInt = 0;
          break;
        case 5:
          localtw.wbm = locala.BTU.readString();
          AppMethodBeat.o(28365);
          paramInt = 0;
          break;
        case 6:
          localtw.cuF = locala.BTU.readString();
          AppMethodBeat.o(28365);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28365);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.tw
 * JD-Core Version:    0.6.2
 */