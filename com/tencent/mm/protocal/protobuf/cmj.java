package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cmj extends com.tencent.mm.bt.a
{
  public String vHl;
  public bku xkm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113793);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xkm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Position");
        AppMethodBeat.o(113793);
        throw paramArrayOfObject;
      }
      if (this.vHl != null)
        paramArrayOfObject.e(1, this.vHl);
      if (this.xkm != null)
      {
        paramArrayOfObject.iy(2, this.xkm.computeSize());
        this.xkm.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(113793);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHl == null)
        break label439;
    label439: for (paramInt = e.a.a.b.b.a.f(1, this.vHl) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xkm != null)
        i = paramInt + e.a.a.a.ix(2, this.xkm.computeSize());
      AppMethodBeat.o(113793);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xkm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Position");
          AppMethodBeat.o(113793);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(113793);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cmj localcmj = (cmj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(113793);
          paramInt = -1;
          break;
        case 1:
          localcmj.vHl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113793);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bku();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bku)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmj.xkm = ((bku)localObject1);
          }
          AppMethodBeat.o(113793);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(113793);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmj
 * JD-Core Version:    0.6.2
 */