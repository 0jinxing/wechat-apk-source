package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpw extends btd
{
  public int wPb;
  public int wem;
  public long wen;
  public LinkedList<coj> xmC;
  public int xnR;
  public LinkedList<coj> xnS;
  public int xnT;
  public LinkedList<coj> xnU;
  public int xnV;
  public int xnW;
  public int xnX;

  public cpw()
  {
    AppMethodBeat.i(5261);
    this.xnS = new LinkedList();
    this.xnU = new LinkedList();
    this.xmC = new LinkedList();
    AppMethodBeat.o(5261);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5262);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5262);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.iz(3, this.xnR);
      paramArrayOfObject.e(4, 8, this.xnS);
      paramArrayOfObject.iz(5, this.xnT);
      paramArrayOfObject.e(6, 8, this.xnU);
      paramArrayOfObject.ai(7, this.wen);
      paramArrayOfObject.iz(8, this.wPb);
      paramArrayOfObject.iz(9, this.xnV);
      paramArrayOfObject.e(10, 8, this.xmC);
      paramArrayOfObject.iz(11, this.xnW);
      paramArrayOfObject.iz(12, this.xnX);
      AppMethodBeat.o(5262);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1193;
    label1193: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.bs(3, this.xnR) + e.a.a.a.c(4, 8, this.xnS) + e.a.a.b.b.a.bs(5, this.xnT) + e.a.a.a.c(6, 8, this.xnU) + e.a.a.b.b.a.o(7, this.wen) + e.a.a.b.b.a.bs(8, this.wPb) + e.a.a.b.b.a.bs(9, this.xnV) + e.a.a.a.c(10, 8, this.xmC) + e.a.a.b.b.a.bs(11, this.xnW) + e.a.a.b.b.a.bs(12, this.xnX);
      AppMethodBeat.o(5262);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xnS.clear();
        this.xnU.clear();
        this.xmC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(5262);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5262);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpw localcpw = (cpw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5262);
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
            localcpw.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 2:
          localcpw.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 3:
          localcpw.xnR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new coj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpw.xnS.add(paramArrayOfObject);
          }
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 5:
          localcpw.xnT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new coj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((coj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpw.xnU.add(localObject1);
          }
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 7:
          localcpw.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 8:
          localcpw.wPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 9:
          localcpw.xnV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new coj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((coj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpw.xmC.add(localObject1);
          }
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 11:
          localcpw.xnW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        case 12:
          localcpw.xnX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5262);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5262);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpw
 * JD-Core Version:    0.6.2
 */