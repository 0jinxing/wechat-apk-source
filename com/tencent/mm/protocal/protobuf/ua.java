package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ua extends com.tencent.mm.bt.a
{
  public String vYA;
  public LinkedList<Integer> wbp;

  public ua()
  {
    AppMethodBeat.i(28366);
    this.wbp = new LinkedList();
    AppMethodBeat.o(28366);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28367);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vYA != null)
        paramArrayOfObject.e(1, this.vYA);
      paramArrayOfObject.e(2, 2, this.wbp);
      AppMethodBeat.o(28367);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vYA == null)
        break label301;
    label301: for (paramInt = e.a.a.b.b.a.f(1, this.vYA) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 2, this.wbp);
      AppMethodBeat.o(28367);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wbp.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28367);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ua localua = (ua)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28367);
          paramInt = -1;
          break;
        case 1:
          localua.vYA = locala.BTU.readString();
          AppMethodBeat.o(28367);
          paramInt = i;
          break;
        case 2:
          localua.wbp.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(28367);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28367);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ua
 * JD-Core Version:    0.6.2
 */