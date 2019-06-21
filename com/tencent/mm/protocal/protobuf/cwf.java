package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cwf extends com.tencent.mm.bt.a
{
  public int Scene;
  public int vMG;
  public int wDA;
  public String wDB;
  public int wDz;
  public int wzF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96320);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wzF);
      paramArrayOfObject.iz(2, this.vMG);
      paramArrayOfObject.iz(3, this.Scene);
      if (this.wDB != null)
        paramArrayOfObject.e(4, this.wDB);
      paramArrayOfObject.iz(5, this.wDA);
      paramArrayOfObject.iz(6, this.wDz);
      AppMethodBeat.o(96320);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wzF) + 0 + e.a.a.b.b.a.bs(2, this.vMG) + e.a.a.b.b.a.bs(3, this.Scene);
        paramInt = i;
        if (this.wDB != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wDB);
        paramInt = paramInt + e.a.a.b.b.a.bs(5, this.wDA) + e.a.a.b.b.a.bs(6, this.wDz);
        AppMethodBeat.o(96320);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96320);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cwf localcwf = (cwf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96320);
          break;
        case 1:
          localcwf.wzF = locala.BTU.vd();
          AppMethodBeat.o(96320);
          paramInt = 0;
          break;
        case 2:
          localcwf.vMG = locala.BTU.vd();
          AppMethodBeat.o(96320);
          paramInt = 0;
          break;
        case 3:
          localcwf.Scene = locala.BTU.vd();
          AppMethodBeat.o(96320);
          paramInt = 0;
          break;
        case 4:
          localcwf.wDB = locala.BTU.readString();
          AppMethodBeat.o(96320);
          paramInt = 0;
          break;
        case 5:
          localcwf.wDA = locala.BTU.vd();
          AppMethodBeat.o(96320);
          paramInt = 0;
          break;
        case 6:
          localcwf.wDz = locala.BTU.vd();
          AppMethodBeat.o(96320);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96320);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwf
 * JD-Core Version:    0.6.2
 */