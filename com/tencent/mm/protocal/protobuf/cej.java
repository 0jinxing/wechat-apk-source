package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cej extends com.tencent.mm.bt.a
{
  public int rTW;
  public int xdZ;
  public long xee;
  public boolean xef;
  public LinkedList<String> xeg;
  public LinkedList<String> xeh;

  public cej()
  {
    AppMethodBeat.i(56525);
    this.xeg = new LinkedList();
    this.xeh = new LinkedList();
    AppMethodBeat.o(56525);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56526);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.xee);
      paramArrayOfObject.iz(2, this.rTW);
      paramArrayOfObject.iz(3, this.xdZ);
      paramArrayOfObject.aO(4, this.xef);
      paramArrayOfObject.e(5, 1, this.xeg);
      paramArrayOfObject.e(6, 1, this.xeh);
      AppMethodBeat.o(56526);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.xee) + 0 + e.a.a.b.b.a.bs(2, this.rTW) + e.a.a.b.b.a.bs(3, this.xdZ) + (e.a.a.b.b.a.fv(4) + 1) + e.a.a.a.c(5, 1, this.xeg) + e.a.a.a.c(6, 1, this.xeh);
        AppMethodBeat.o(56526);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xeg.clear();
        this.xeh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56526);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cej localcej = (cej)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56526);
          break;
        case 1:
          localcej.xee = locala.BTU.ve();
          AppMethodBeat.o(56526);
          paramInt = 0;
          break;
        case 2:
          localcej.rTW = locala.BTU.vd();
          AppMethodBeat.o(56526);
          paramInt = 0;
          break;
        case 3:
          localcej.xdZ = locala.BTU.vd();
          AppMethodBeat.o(56526);
          paramInt = 0;
          break;
        case 4:
          localcej.xef = locala.BTU.ehX();
          AppMethodBeat.o(56526);
          paramInt = 0;
          break;
        case 5:
          localcej.xeg.add(locala.BTU.readString());
          AppMethodBeat.o(56526);
          paramInt = 0;
          break;
        case 6:
          localcej.xeh.add(locala.BTU.readString());
          AppMethodBeat.o(56526);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56526);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cej
 * JD-Core Version:    0.6.2
 */