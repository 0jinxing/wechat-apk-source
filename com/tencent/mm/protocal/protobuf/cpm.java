package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpm extends btd
{
  public int ehB;
  public int pcX;
  public int wem;
  public long wen;
  public int xmL;
  public String xmT;
  public LinkedList<cqi> xmU;

  public cpm()
  {
    AppMethodBeat.i(5245);
    this.xmU = new LinkedList();
    AppMethodBeat.o(5245);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5246);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5246);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.pcX);
      paramArrayOfObject.iz(6, this.ehB);
      paramArrayOfObject.e(7, 8, this.xmU);
      if (this.xmT != null)
        paramArrayOfObject.e(8, this.xmT);
      paramArrayOfObject.iz(9, this.xmL);
      AppMethodBeat.o(5246);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label836;
    label836: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.pcX) + e.a.a.b.b.a.bs(6, this.ehB) + e.a.a.a.c(7, 8, this.xmU);
      paramInt = i;
      if (this.xmT != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.xmT);
      paramInt += e.a.a.b.b.a.bs(9, this.xmL);
      AppMethodBeat.o(5246);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xmU.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(5246);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5246);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpm localcpm = (cpm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5:
        default:
          paramInt = -1;
          AppMethodBeat.o(5246);
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
            localcpm.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        case 2:
          localcpm.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        case 3:
          localcpm.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        case 4:
          localcpm.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        case 6:
          localcpm.ehB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cqi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cqi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpm.xmU.add(localObject1);
          }
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        case 8:
          localcpm.xmT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        case 9:
          localcpm.xmL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5246);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5246);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpm
 * JD-Core Version:    0.6.2
 */