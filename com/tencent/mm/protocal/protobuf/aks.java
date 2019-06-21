package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aks extends btd
{
  public int kKI;
  public int kdT;
  public String kdU;
  public int wqk;
  public nv wql;
  public nw wqm;
  public nt wqn;
  public nu wqo;
  public String wqp;
  public int wqq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89096);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(89096);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      paramArrayOfObject.iz(4, this.kKI);
      paramArrayOfObject.iz(5, this.wqk);
      if (this.wql != null)
      {
        paramArrayOfObject.iy(6, this.wql.computeSize());
        this.wql.writeFields(paramArrayOfObject);
      }
      if (this.wqm != null)
      {
        paramArrayOfObject.iy(7, this.wqm.computeSize());
        this.wqm.writeFields(paramArrayOfObject);
      }
      if (this.wqn != null)
      {
        paramArrayOfObject.iy(8, this.wqn.computeSize());
        this.wqn.writeFields(paramArrayOfObject);
      }
      if (this.wqo != null)
      {
        paramArrayOfObject.iy(9, this.wqo.computeSize());
        this.wqo.writeFields(paramArrayOfObject);
      }
      if (this.wqp != null)
        paramArrayOfObject.e(10, this.wqp);
      paramArrayOfObject.iz(11, this.wqq);
      AppMethodBeat.o(89096);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1331;
    label1331: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + e.a.a.b.b.a.bs(4, this.kKI) + e.a.a.b.b.a.bs(5, this.wqk);
      paramInt = i;
      if (this.wql != null)
        paramInt = i + e.a.a.a.ix(6, this.wql.computeSize());
      i = paramInt;
      if (this.wqm != null)
        i = paramInt + e.a.a.a.ix(7, this.wqm.computeSize());
      int j = i;
      if (this.wqn != null)
        j = i + e.a.a.a.ix(8, this.wqn.computeSize());
      paramInt = j;
      if (this.wqo != null)
        paramInt = j + e.a.a.a.ix(9, this.wqo.computeSize());
      i = paramInt;
      if (this.wqp != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wqp);
      paramInt = i + e.a.a.b.b.a.bs(11, this.wqq);
      AppMethodBeat.o(89096);
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
          AppMethodBeat.o(89096);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89096);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aks localaks = (aks)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89096);
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
            localaks.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 2:
          localaks.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 3:
          localaks.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 4:
          localaks.kKI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 5:
          localaks.wqk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new nv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((nv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaks.wql = ((nv)localObject1);
          }
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaks.wqm = paramArrayOfObject;
          }
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaks.wqn = paramArrayOfObject;
          }
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaks.wqo = paramArrayOfObject;
          }
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 10:
          localaks.wqp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        case 11:
          localaks.wqq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89096);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89096);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aks
 * JD-Core Version:    0.6.2
 */