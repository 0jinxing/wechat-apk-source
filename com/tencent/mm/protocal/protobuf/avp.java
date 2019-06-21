package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class avp extends btd
{
  public LinkedList<String> wzA;
  public String wzB;
  public avi wzj;
  public LinkedList<cmu> wzz;

  public avp()
  {
    AppMethodBeat.i(10205);
    this.wzz = new LinkedList();
    this.wzA = new LinkedList();
    AppMethodBeat.o(10205);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10206);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10206);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wzj != null)
      {
        paramArrayOfObject.iy(2, this.wzj.computeSize());
        this.wzj.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(3, 8, this.wzz);
      paramArrayOfObject.e(4, 1, this.wzA);
      if (this.wzB != null)
        paramArrayOfObject.e(5, this.wzB);
      AppMethodBeat.o(10206);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label808;
    label808: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wzj != null)
        i = paramInt + e.a.a.a.ix(2, this.wzj.computeSize());
      i = i + e.a.a.a.c(3, 8, this.wzz) + e.a.a.a.c(4, 1, this.wzA);
      paramInt = i;
      if (this.wzB != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wzB);
      AppMethodBeat.o(10206);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wzz.clear();
        this.wzA.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(10206);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10206);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avp localavp = (avp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10206);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavp.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(10206);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new avi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavp.wzj = paramArrayOfObject;
          }
          AppMethodBeat.o(10206);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cmu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cmu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavp.wzz.add(localObject1);
          }
          AppMethodBeat.o(10206);
          paramInt = i;
          break;
        case 4:
          localavp.wzA.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(10206);
          paramInt = i;
          break;
        case 5:
          localavp.wzB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10206);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10206);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avp
 * JD-Core Version:    0.6.2
 */