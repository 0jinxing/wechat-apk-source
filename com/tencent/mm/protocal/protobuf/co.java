package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class co extends com.tencent.mm.bt.a
{
  public String desc;
  public String gfa;
  public LinkedList<bgc> vEN;

  public co()
  {
    AppMethodBeat.i(80007);
    this.vEN = new LinkedList();
    AppMethodBeat.o(80007);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80008);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.gfa != null)
        paramArrayOfObject.e(1, this.gfa);
      paramArrayOfObject.e(2, 8, this.vEN);
      if (this.desc != null)
        paramArrayOfObject.e(3, this.desc);
      AppMethodBeat.o(80008);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.gfa == null)
        break label437;
    label437: for (paramInt = e.a.a.b.b.a.f(1, this.gfa) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vEN);
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.desc);
      AppMethodBeat.o(80008);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80008);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        co localco = (co)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80008);
          break;
        case 1:
          localco.gfa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80008);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bgc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localco.vEN.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80008);
          paramInt = i;
          break;
        case 3:
          localco.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80008);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80008);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.co
 * JD-Core Version:    0.6.2
 */