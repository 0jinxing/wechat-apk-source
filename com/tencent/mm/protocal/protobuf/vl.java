package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class vl extends com.tencent.mm.bt.a
{
  public bts wcB;
  public int wcC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60030);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(60030);
        throw paramArrayOfObject;
      }
      if (this.wcB != null)
      {
        paramArrayOfObject.iy(1, this.wcB.computeSize());
        this.wcB.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wcC);
      AppMethodBeat.o(60030);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcB == null)
        break label419;
    label419: for (paramInt = e.a.a.a.ix(1, this.wcB.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wcC);
      AppMethodBeat.o(60030);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(60030);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60030);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        vl localvl = (vl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(60030);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localvl.wcB = ((bts)localObject1);
          }
          AppMethodBeat.o(60030);
          paramInt = i;
          break;
        case 2:
          localvl.wcC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60030);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(60030);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.vl
 * JD-Core Version:    0.6.2
 */