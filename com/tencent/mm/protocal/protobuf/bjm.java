package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjm extends com.tencent.mm.bt.a
{
  public String title;
  public LinkedList<bjl> wMT;

  public bjm()
  {
    AppMethodBeat.i(48919);
    this.wMT = new LinkedList();
    AppMethodBeat.o(48919);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48920);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      paramArrayOfObject.e(2, 8, this.wMT);
      AppMethodBeat.o(48920);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label375;
    label375: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.wMT);
      AppMethodBeat.o(48920);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wMT.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48920);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjm localbjm = (bjm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(48920);
          paramInt = -1;
          break;
        case 1:
          localbjm.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48920);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bjl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bjl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjm.wMT.add(localObject1);
          }
          AppMethodBeat.o(48920);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(48920);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjm
 * JD-Core Version:    0.6.2
 */