package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cas extends btd
{
  public String vEA;
  public LinkedList<cbf> vKB;
  public int wGG;
  public String wZT;
  public int wZX;
  public int wZY;
  public cbw wZZ;

  public cas()
  {
    AppMethodBeat.i(94568);
    this.vKB = new LinkedList();
    AppMethodBeat.o(94568);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94569);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(94569);
        throw paramArrayOfObject;
      }
      if (this.wZZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ServerConfig");
        AppMethodBeat.o(94569);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wZT != null)
        paramArrayOfObject.e(2, this.wZT);
      paramArrayOfObject.iz(3, this.wGG);
      paramArrayOfObject.e(4, 8, this.vKB);
      paramArrayOfObject.iz(5, this.wZX);
      if (this.vEA != null)
        paramArrayOfObject.e(6, this.vEA);
      paramArrayOfObject.iz(7, this.wZY);
      if (this.wZZ != null)
      {
        paramArrayOfObject.iy(8, this.wZZ.computeSize());
        this.wZZ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94569);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label994;
    label994: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wZT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wZT);
      i = i + e.a.a.b.b.a.bs(3, this.wGG) + e.a.a.a.c(4, 8, this.vKB) + e.a.a.b.b.a.bs(5, this.wZX);
      paramInt = i;
      if (this.vEA != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vEA);
      i = paramInt + e.a.a.b.b.a.bs(7, this.wZY);
      paramInt = i;
      if (this.wZZ != null)
        paramInt = i + e.a.a.a.ix(8, this.wZZ.computeSize());
      AppMethodBeat.o(94569);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vKB.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(94569);
          throw paramArrayOfObject;
        }
        if (this.wZZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ServerConfig");
          AppMethodBeat.o(94569);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94569);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cas localcas = (cas)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94569);
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
            localcas.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        case 2:
          localcas.wZT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        case 3:
          localcas.wGG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcas.vKB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        case 5:
          localcas.wZX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        case 6:
          localcas.vEA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        case 7:
          localcas.wZY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cbw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcas.wZZ = ((cbw)localObject1);
          }
          AppMethodBeat.o(94569);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94569);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cas
 * JD-Core Version:    0.6.2
 */