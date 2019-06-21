package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cch extends btd
{
  public LinkedList<cbf> vKB;
  public int wGG;
  public String wZT;
  public int wZX;
  public int wZY;
  public cbw wZZ;
  public SKBuiltinBuffer_t wZw;
  public int xbC;
  public int xbD;
  public LinkedList<cy> xbE;
  public int xbF;
  public LinkedList<bpx> xbG;
  public int xbH;
  public LinkedList<vd> xbI;

  public cch()
  {
    AppMethodBeat.i(94618);
    this.vKB = new LinkedList();
    this.xbE = new LinkedList();
    this.xbG = new LinkedList();
    this.xbI = new LinkedList();
    AppMethodBeat.o(94618);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94619);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(94619);
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
      paramArrayOfObject.iz(5, this.xbC);
      paramArrayOfObject.iz(6, this.wZX);
      paramArrayOfObject.iz(7, this.wZY);
      if (this.wZZ != null)
      {
        paramArrayOfObject.iy(8, this.wZZ.computeSize());
        this.wZZ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.xbD);
      paramArrayOfObject.e(10, 8, this.xbE);
      if (this.wZw != null)
      {
        paramArrayOfObject.iy(11, this.wZw.computeSize());
        this.wZw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(12, this.xbF);
      paramArrayOfObject.e(13, 8, this.xbG);
      paramArrayOfObject.iz(14, this.xbH);
      paramArrayOfObject.e(15, 8, this.xbI);
      AppMethodBeat.o(94619);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1655;
    label1655: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wZT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wZT);
      i = i + e.a.a.b.b.a.bs(3, this.wGG) + e.a.a.a.c(4, 8, this.vKB) + e.a.a.b.b.a.bs(5, this.xbC) + e.a.a.b.b.a.bs(6, this.wZX) + e.a.a.b.b.a.bs(7, this.wZY);
      paramInt = i;
      if (this.wZZ != null)
        paramInt = i + e.a.a.a.ix(8, this.wZZ.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(9, this.xbD) + e.a.a.a.c(10, 8, this.xbE);
      paramInt = i;
      if (this.wZw != null)
        paramInt = i + e.a.a.a.ix(11, this.wZw.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(12, this.xbF) + e.a.a.a.c(13, 8, this.xbG) + e.a.a.b.b.a.bs(14, this.xbH) + e.a.a.a.c(15, 8, this.xbI);
      AppMethodBeat.o(94619);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vKB.clear();
        this.xbE.clear();
        this.xbG.clear();
        this.xbI.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(94619);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94619);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cch localcch = (cch)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94619);
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
            localcch.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 2:
          localcch.wZT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 3:
          localcch.wGG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94619);
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
            localcch.vKB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 5:
          localcch.xbC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 6:
          localcch.wZX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 7:
          localcch.wZY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcch.wZZ = paramArrayOfObject;
          }
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 9:
          localcch.xbD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcch.xbE.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcch.wZw = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 12:
          localcch.xbF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 13:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcch.xbG.add(localObject1);
          }
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 14:
          localcch.xbH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new vd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcch.xbI.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94619);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94619);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cch
 * JD-Core Version:    0.6.2
 */