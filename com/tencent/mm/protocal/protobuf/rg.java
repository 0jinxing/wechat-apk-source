package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class rg extends com.tencent.mm.bt.a
{
  public b vYw;
  public LinkedList<b> vYx;

  public rg()
  {
    AppMethodBeat.i(96213);
    this.vYx = new LinkedList();
    AppMethodBeat.o(96213);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96214);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vYw != null)
        paramArrayOfObject.c(1, this.vYw);
      paramArrayOfObject.e(2, 6, this.vYx);
      AppMethodBeat.o(96214);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vYw == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.b(1, this.vYw) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 6, this.vYx);
      AppMethodBeat.o(96214);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vYx.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96214);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        rg localrg = (rg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(96214);
          paramInt = -1;
          break;
        case 1:
          localrg.vYw = locala.BTU.emu();
          AppMethodBeat.o(96214);
          paramInt = i;
          break;
        case 2:
          localrg.vYx.add(locala.BTU.emu());
          AppMethodBeat.o(96214);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(96214);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rg
 * JD-Core Version:    0.6.2
 */