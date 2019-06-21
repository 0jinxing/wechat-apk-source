package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class nu extends com.tencent.mm.bt.a
{
  public String vTn;
  public LinkedList<String> vTo;

  public nu()
  {
    AppMethodBeat.i(89028);
    this.vTo = new LinkedList();
    AppMethodBeat.o(89028);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89029);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vTn != null)
        paramArrayOfObject.e(1, this.vTn);
      paramArrayOfObject.e(2, 1, this.vTo);
      AppMethodBeat.o(89029);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vTn == null)
        break label290;
    label290: for (paramInt = e.a.a.b.b.a.f(1, this.vTn) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 1, this.vTo);
      AppMethodBeat.o(89029);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vTo.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89029);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        nu localnu = (nu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(89029);
          paramInt = -1;
          break;
        case 1:
          localnu.vTn = locala.BTU.readString();
          AppMethodBeat.o(89029);
          paramInt = i;
          break;
        case 2:
          localnu.vTo.add(locala.BTU.readString());
          AppMethodBeat.o(89029);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(89029);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nu
 * JD-Core Version:    0.6.2
 */