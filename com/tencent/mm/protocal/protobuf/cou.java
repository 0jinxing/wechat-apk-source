package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cou extends btd
{
  public int nwF;
  public int nwL;
  public int nwM;
  public int nwQ;
  public LinkedList<coo> vIO;
  public com.tencent.mm.bt.b wPf;
  public long wen;
  public int xdw;
  public long xeF;
  public int xmA;
  public int xmB;
  public LinkedList<coo> xmC;
  public int xmz;

  public cou()
  {
    AppMethodBeat.i(135448);
    this.vIO = new LinkedList();
    this.xmC = new LinkedList();
    AppMethodBeat.o(135448);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135449);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(135449);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.xeF);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.e(4, 8, this.vIO);
      paramArrayOfObject.iz(5, this.xdw);
      paramArrayOfObject.iz(6, this.nwL);
      paramArrayOfObject.iz(7, this.nwM);
      paramArrayOfObject.iz(8, this.nwF);
      paramArrayOfObject.iz(9, this.nwQ);
      paramArrayOfObject.iz(10, this.xmz);
      paramArrayOfObject.iz(11, this.xmA);
      if (this.wPf != null)
        paramArrayOfObject.c(12, this.wPf);
      paramArrayOfObject.iz(13, this.xmB);
      paramArrayOfObject.e(14, 8, this.xmC);
      AppMethodBeat.o(135449);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1191;
    label1191: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.xeF) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.a.c(4, 8, this.vIO) + e.a.a.b.b.a.bs(5, this.xdw) + e.a.a.b.b.a.bs(6, this.nwL) + e.a.a.b.b.a.bs(7, this.nwM) + e.a.a.b.b.a.bs(8, this.nwF) + e.a.a.b.b.a.bs(9, this.nwQ) + e.a.a.b.b.a.bs(10, this.xmz) + e.a.a.b.b.a.bs(11, this.xmA);
      paramInt = i;
      if (this.wPf != null)
        paramInt = i + e.a.a.b.b.a.b(12, this.wPf);
      paramInt = paramInt + e.a.a.b.b.a.bs(13, this.xmB) + e.a.a.a.c(14, 8, this.xmC);
      AppMethodBeat.o(135449);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vIO.clear();
        this.xmC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(135449);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(135449);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cou localcou = (cou)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135449);
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
            localcou.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 2:
          localcou.xeF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 3:
          localcou.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new coo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcou.vIO.add(paramArrayOfObject);
          }
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 5:
          localcou.xdw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 6:
          localcou.nwL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 7:
          localcou.nwM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 8:
          localcou.nwF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 9:
          localcou.nwQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 10:
          localcou.xmz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 11:
          localcou.xmA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 12:
          localcou.wPf = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 13:
          localcou.xmB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new coo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcou.xmC.add(paramArrayOfObject);
          }
          AppMethodBeat.o(135449);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135449);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cou
 * JD-Core Version:    0.6.2
 */