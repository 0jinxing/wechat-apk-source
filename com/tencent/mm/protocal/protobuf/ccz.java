package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ccz extends com.tencent.mm.bt.a
{
  public String appName;
  public int bIb;
  public String xcF;
  public boolean xcG;
  public boolean xcH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55723);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xcF != null)
        paramArrayOfObject.e(1, this.xcF);
      if (this.appName != null)
        paramArrayOfObject.e(2, this.appName);
      paramArrayOfObject.iz(3, this.bIb);
      paramArrayOfObject.aO(4, this.xcG);
      paramArrayOfObject.aO(5, this.xcH);
      AppMethodBeat.o(55723);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xcF == null)
        break label423;
    label423: for (paramInt = e.a.a.b.b.a.f(1, this.xcF) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.appName != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.appName);
      paramInt = i + e.a.a.b.b.a.bs(3, this.bIb) + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1);
      AppMethodBeat.o(55723);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55723);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ccz localccz = (ccz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55723);
          break;
        case 1:
          localccz.xcF = locala.BTU.readString();
          AppMethodBeat.o(55723);
          paramInt = i;
          break;
        case 2:
          localccz.appName = locala.BTU.readString();
          AppMethodBeat.o(55723);
          paramInt = i;
          break;
        case 3:
          localccz.bIb = locala.BTU.vd();
          AppMethodBeat.o(55723);
          paramInt = i;
          break;
        case 4:
          localccz.xcG = locala.BTU.ehX();
          AppMethodBeat.o(55723);
          paramInt = i;
          break;
        case 5:
          localccz.xcH = locala.BTU.ehX();
          AppMethodBeat.o(55723);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55723);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccz
 * JD-Core Version:    0.6.2
 */