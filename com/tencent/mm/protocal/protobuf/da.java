package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class da extends com.tencent.mm.bt.a
{
  public String title;
  public String vFh;
  public LinkedList<cdm> vFi;

  public da()
  {
    AppMethodBeat.i(28308);
    this.vFi = new LinkedList();
    AppMethodBeat.o(28308);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28309);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFh != null)
        paramArrayOfObject.e(1, this.vFh);
      paramArrayOfObject.e(2, 8, this.vFi);
      if (this.title != null)
        paramArrayOfObject.e(3, this.title);
      AppMethodBeat.o(28309);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vFh == null)
        break label447;
    label447: for (paramInt = e.a.a.b.b.a.f(1, this.vFh) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vFi);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.title);
      AppMethodBeat.o(28309);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vFi.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28309);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        da localda = (da)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28309);
          break;
        case 1:
          localda.vFh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28309);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cdm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cdm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localda.vFi.add(localObject1);
          }
          AppMethodBeat.o(28309);
          paramInt = i;
          break;
        case 3:
          localda.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28309);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28309);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.da
 * JD-Core Version:    0.6.2
 */