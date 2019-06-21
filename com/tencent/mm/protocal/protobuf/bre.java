package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class bre extends com.tencent.mm.bt.a
{
  public int jCt;
  public int lvf;
  public int wOI;
  public String wTy;
  public b wcJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(118282);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wTy != null)
        paramArrayOfObject.e(1, this.wTy);
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.lvf);
      paramArrayOfObject.iz(4, this.wOI);
      if (this.wcJ != null)
        paramArrayOfObject.c(5, this.wcJ);
      AppMethodBeat.o(118282);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wTy == null)
        break label427;
    label427: for (paramInt = e.a.a.b.b.a.f(1, this.wTy) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.lvf) + e.a.a.b.b.a.bs(4, this.wOI);
      paramInt = i;
      if (this.wcJ != null)
        paramInt = i + e.a.a.b.b.a.b(5, this.wcJ);
      AppMethodBeat.o(118282);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(118282);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bre localbre = (bre)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(118282);
          break;
        case 1:
          localbre.wTy = locala.BTU.readString();
          AppMethodBeat.o(118282);
          paramInt = i;
          break;
        case 2:
          localbre.jCt = locala.BTU.vd();
          AppMethodBeat.o(118282);
          paramInt = i;
          break;
        case 3:
          localbre.lvf = locala.BTU.vd();
          AppMethodBeat.o(118282);
          paramInt = i;
          break;
        case 4:
          localbre.wOI = locala.BTU.vd();
          AppMethodBeat.o(118282);
          paramInt = i;
          break;
        case 5:
          localbre.wcJ = locala.BTU.emu();
          AppMethodBeat.o(118282);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(118282);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bre
 * JD-Core Version:    0.6.2
 */