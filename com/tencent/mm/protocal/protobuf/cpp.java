package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpp extends bsr
{
  public int vZF;
  public int wOQ;
  public String wPm;
  public int wem;
  public long wen;
  public int xcr;
  public cpx xlM;
  public cpx xlN;
  public long xlQ;
  public int xlR;
  public int xmL;
  public int xmW;
  public LinkedList<bts> xmX;
  public int xmY;

  public cpp()
  {
    AppMethodBeat.i(5249);
    this.xmX = new LinkedList();
    AppMethodBeat.o(5249);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5250);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xlM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PeerId");
        AppMethodBeat.o(5250);
        throw paramArrayOfObject;
      }
      if (this.xlN == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CapInfo");
        AppMethodBeat.o(5250);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wPm != null)
        paramArrayOfObject.e(2, this.wPm);
      paramArrayOfObject.iz(3, this.xmW);
      paramArrayOfObject.e(4, 8, this.xmX);
      if (this.xlM != null)
      {
        paramArrayOfObject.iy(6, this.xlM.computeSize());
        this.xlM.writeFields(paramArrayOfObject);
      }
      if (this.xlN != null)
      {
        paramArrayOfObject.iy(7, this.xlN.computeSize());
        this.xlN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.vZF);
      paramArrayOfObject.iz(9, this.xcr);
      paramArrayOfObject.iz(10, this.wem);
      paramArrayOfObject.ai(11, this.wen);
      paramArrayOfObject.iz(12, this.xmL);
      paramArrayOfObject.ai(13, this.xlQ);
      paramArrayOfObject.iz(14, this.xmY);
      paramArrayOfObject.iz(15, this.wOQ);
      paramArrayOfObject.iz(16, this.xlR);
      AppMethodBeat.o(5250);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1447;
    label1447: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPm != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wPm);
      i = i + e.a.a.b.b.a.bs(3, this.xmW) + e.a.a.a.c(4, 8, this.xmX);
      paramInt = i;
      if (this.xlM != null)
        paramInt = i + e.a.a.a.ix(6, this.xlM.computeSize());
      i = paramInt;
      if (this.xlN != null)
        i = paramInt + e.a.a.a.ix(7, this.xlN.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(8, this.vZF) + e.a.a.b.b.a.bs(9, this.xcr) + e.a.a.b.b.a.bs(10, this.wem) + e.a.a.b.b.a.o(11, this.wen) + e.a.a.b.b.a.bs(12, this.xmL) + e.a.a.b.b.a.o(13, this.xlQ) + e.a.a.b.b.a.bs(14, this.xmY) + e.a.a.b.b.a.bs(15, this.wOQ) + e.a.a.b.b.a.bs(16, this.xlR);
      AppMethodBeat.o(5250);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xmX.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xlM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PeerId");
          AppMethodBeat.o(5250);
          throw paramArrayOfObject;
        }
        if (this.xlN == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CapInfo");
          AppMethodBeat.o(5250);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5250);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpp localcpp = (cpp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5:
        default:
          paramInt = -1;
          AppMethodBeat.o(5250);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpp.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 2:
          localcpp.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 3:
          localcpp.xmW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpp.xmX.add(localObject1);
          }
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpp.xlM = paramArrayOfObject;
          }
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpp.xlN = paramArrayOfObject;
          }
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 8:
          localcpp.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 9:
          localcpp.xcr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 10:
          localcpp.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 11:
          localcpp.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 12:
          localcpp.xmL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 13:
          localcpp.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 14:
          localcpp.xmY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 15:
          localcpp.wOQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        case 16:
          localcpp.xlR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5250);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5250);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpp
 * JD-Core Version:    0.6.2
 */