package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class gg extends com.tencent.mm.bt.a
{
  public gh vIo;
  public ge vIp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58889);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vIo == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RsaReqData");
        AppMethodBeat.o(58889);
        throw paramArrayOfObject;
      }
      if (this.vIp == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AesReqData");
        AppMethodBeat.o(58889);
        throw paramArrayOfObject;
      }
      if (this.vIo != null)
      {
        paramArrayOfObject.iy(1, this.vIo.computeSize());
        this.vIo.writeFields(paramArrayOfObject);
      }
      if (this.vIp != null)
      {
        paramArrayOfObject.iy(2, this.vIp.computeSize());
        this.vIp.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58889);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vIo == null)
        break label579;
    label579: for (i = e.a.a.a.ix(1, this.vIo.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vIp != null)
        paramInt = i + e.a.a.a.ix(2, this.vIp.computeSize());
      AppMethodBeat.o(58889);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vIo == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RsaReqData");
          AppMethodBeat.o(58889);
          throw paramArrayOfObject;
        }
        if (this.vIp == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AesReqData");
          AppMethodBeat.o(58889);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58889);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gg localgg = (gg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58889);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new gh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgg.vIo = paramArrayOfObject;
          }
          AppMethodBeat.o(58889);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ge();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ge)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgg.vIp = ((ge)localObject1);
          }
          AppMethodBeat.o(58889);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(58889);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gg
 * JD-Core Version:    0.6.2
 */