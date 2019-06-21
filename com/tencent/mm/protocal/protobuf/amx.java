package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class amx extends btd
{
  public int nbk;
  public bmx wrx;
  public bmv wry;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73712);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(73712);
        throw paramArrayOfObject;
      }
      if (this.wrx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QQGroup");
        AppMethodBeat.o(73712);
        throw paramArrayOfObject;
      }
      if (this.wry == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QQFriend");
        AppMethodBeat.o(73712);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.nbk);
      if (this.wrx != null)
      {
        paramArrayOfObject.iy(3, this.wrx.computeSize());
        this.wrx.writeFields(paramArrayOfObject);
      }
      if (this.wry != null)
      {
        paramArrayOfObject.iy(4, this.wry.computeSize());
        this.wry.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(73712);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label833;
    label833: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.nbk);
      paramInt = i;
      if (this.wrx != null)
        paramInt = i + e.a.a.a.ix(3, this.wrx.computeSize());
      i = paramInt;
      if (this.wry != null)
        i = paramInt + e.a.a.a.ix(4, this.wry.computeSize());
      AppMethodBeat.o(73712);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(73712);
          throw paramArrayOfObject;
        }
        if (this.wrx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QQGroup");
          AppMethodBeat.o(73712);
          throw paramArrayOfObject;
        }
        if (this.wry == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QQFriend");
          AppMethodBeat.o(73712);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73712);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        amx localamx = (amx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73712);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localamx.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(73712);
          paramInt = i;
          break;
        case 2:
          localamx.nbk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73712);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bmx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bmx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localamx.wrx = ((bmx)localObject1);
          }
          AppMethodBeat.o(73712);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bmv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localamx.wry = paramArrayOfObject;
          }
          AppMethodBeat.o(73712);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73712);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.amx
 * JD-Core Version:    0.6.2
 */