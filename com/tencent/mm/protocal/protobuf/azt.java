package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class azt extends com.tencent.mm.bt.a
{
  public int Scene;
  public String csB;
  public String username;
  public int vMG;
  public int wDA;
  public String wDB;
  public int wDC;
  public int wDz;
  public int wzF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102382);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      if (this.username != null)
        paramArrayOfObject.e(2, this.username);
      paramArrayOfObject.iz(3, this.wzF);
      paramArrayOfObject.iz(4, this.vMG);
      paramArrayOfObject.iz(5, this.Scene);
      paramArrayOfObject.iz(6, this.wDz);
      paramArrayOfObject.iz(7, this.wDA);
      if (this.wDB != null)
        paramArrayOfObject.e(8, this.wDB);
      paramArrayOfObject.iz(9, this.wDC);
      AppMethodBeat.o(102382);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label635;
    label635: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.username != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.username);
      i = i + e.a.a.b.b.a.bs(3, this.wzF) + e.a.a.b.b.a.bs(4, this.vMG) + e.a.a.b.b.a.bs(5, this.Scene) + e.a.a.b.b.a.bs(6, this.wDz) + e.a.a.b.b.a.bs(7, this.wDA);
      paramInt = i;
      if (this.wDB != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wDB);
      paramInt += e.a.a.b.b.a.bs(9, this.wDC);
      AppMethodBeat.o(102382);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102382);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azt localazt = (azt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102382);
          break;
        case 1:
          localazt.csB = locala.BTU.readString();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 2:
          localazt.username = locala.BTU.readString();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 3:
          localazt.wzF = locala.BTU.vd();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 4:
          localazt.vMG = locala.BTU.vd();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 5:
          localazt.Scene = locala.BTU.vd();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 6:
          localazt.wDz = locala.BTU.vd();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 7:
          localazt.wDA = locala.BTU.vd();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 8:
          localazt.wDB = locala.BTU.readString();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        case 9:
          localazt.wDC = locala.BTU.vd();
          AppMethodBeat.o(102382);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102382);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azt
 * JD-Core Version:    0.6.2
 */