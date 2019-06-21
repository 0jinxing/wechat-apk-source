package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class nc extends com.tencent.mm.bt.a
{
  public String vRI;
  public LinkedList<String> vRJ;

  public nc()
  {
    AppMethodBeat.i(48787);
    this.vRJ = new LinkedList();
    AppMethodBeat.o(48787);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48788);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vRI != null)
        paramArrayOfObject.e(1, this.vRI);
      paramArrayOfObject.e(2, 1, this.vRJ);
      AppMethodBeat.o(48788);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vRI == null)
        break label290;
    label290: for (paramInt = e.a.a.b.b.a.f(1, this.vRI) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 1, this.vRJ);
      AppMethodBeat.o(48788);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vRJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48788);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        nc localnc = (nc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(48788);
          paramInt = -1;
          break;
        case 1:
          localnc.vRI = locala.BTU.readString();
          AppMethodBeat.o(48788);
          paramInt = i;
          break;
        case 2:
          localnc.vRJ.add(locala.BTU.readString());
          AppMethodBeat.o(48788);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(48788);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nc
 * JD-Core Version:    0.6.2
 */