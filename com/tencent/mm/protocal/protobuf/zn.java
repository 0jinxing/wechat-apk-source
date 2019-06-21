package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class zn extends btd
{
  public zq weL;
  public zk weM;
  public zl weN;
  public String weO;
  public int weP;
  public int weQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28398);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28398);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.weL != null)
      {
        paramArrayOfObject.iy(2, this.weL.computeSize());
        this.weL.writeFields(paramArrayOfObject);
      }
      if (this.weM != null)
      {
        paramArrayOfObject.iy(3, this.weM.computeSize());
        this.weM.writeFields(paramArrayOfObject);
      }
      if (this.weN != null)
      {
        paramArrayOfObject.iy(4, this.weN.computeSize());
        this.weN.writeFields(paramArrayOfObject);
      }
      if (this.weO != null)
        paramArrayOfObject.e(5, this.weO);
      paramArrayOfObject.iz(6, this.weP);
      paramArrayOfObject.iz(7, this.weQ);
      AppMethodBeat.o(28398);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1020;
    label1020: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.weL != null)
        paramInt = i + e.a.a.a.ix(2, this.weL.computeSize());
      i = paramInt;
      if (this.weM != null)
        i = paramInt + e.a.a.a.ix(3, this.weM.computeSize());
      paramInt = i;
      if (this.weN != null)
        paramInt = i + e.a.a.a.ix(4, this.weN.computeSize());
      i = paramInt;
      if (this.weO != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.weO);
      paramInt = i + e.a.a.b.b.a.bs(6, this.weP) + e.a.a.b.b.a.bs(7, this.weQ);
      AppMethodBeat.o(28398);
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
          AppMethodBeat.o(28398);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28398);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        zn localzn = (zn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28398);
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
            localzn.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28398);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new zq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((zq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localzn.weL = ((zq)localObject1);
          }
          AppMethodBeat.o(28398);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new zk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localzn.weM = paramArrayOfObject;
          }
          AppMethodBeat.o(28398);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new zl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localzn.weN = paramArrayOfObject;
          }
          AppMethodBeat.o(28398);
          paramInt = i;
          break;
        case 5:
          localzn.weO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28398);
          paramInt = i;
          break;
        case 6:
          localzn.weP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28398);
          paramInt = i;
          break;
        case 7:
          localzn.weQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28398);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28398);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zn
 * JD-Core Version:    0.6.2
 */