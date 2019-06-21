package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cvm extends com.tencent.mm.bt.a
{
  public cvp xrx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63693);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xrx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DownloadInfo");
        AppMethodBeat.o(63693);
        throw paramArrayOfObject;
      }
      if (this.xrx != null)
      {
        paramArrayOfObject.iy(4, this.xrx.computeSize());
        this.xrx.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(63693);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xrx == null)
        break label371;
    label371: for (paramInt = e.a.a.a.ix(4, this.xrx.computeSize()) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(63693);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xrx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DownloadInfo");
          AppMethodBeat.o(63693);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63693);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvm localcvm = (cvm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(63693);
          paramInt = -1;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cvp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvm.xrx = paramArrayOfObject;
          }
          AppMethodBeat.o(63693);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(63693);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvm
 * JD-Core Version:    0.6.2
 */