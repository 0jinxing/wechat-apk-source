package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cbt extends com.tencent.mm.bt.a
{
  public cbf wZu;
  public bts xbf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94599);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wZu == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SnsObject");
        AppMethodBeat.o(94599);
        throw paramArrayOfObject;
      }
      if (this.wZu != null)
      {
        paramArrayOfObject.iy(1, this.wZu.computeSize());
        this.wZu.writeFields(paramArrayOfObject);
      }
      if (this.xbf != null)
      {
        paramArrayOfObject.iy(2, this.xbf.computeSize());
        this.xbf.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94599);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wZu == null)
        break label530;
    label530: for (paramInt = e.a.a.a.ix(1, this.wZu.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xbf != null)
        i = paramInt + e.a.a.a.ix(2, this.xbf.computeSize());
      AppMethodBeat.o(94599);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wZu == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SnsObject");
          AppMethodBeat.o(94599);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94599);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cbt localcbt = (cbt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(94599);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbt.wZu = paramArrayOfObject;
          }
          AppMethodBeat.o(94599);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbt.xbf = paramArrayOfObject;
          }
          AppMethodBeat.o(94599);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(94599);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbt
 * JD-Core Version:    0.6.2
 */