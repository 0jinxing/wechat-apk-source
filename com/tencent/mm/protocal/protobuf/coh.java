package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class coh extends bsr
{
  public int vZF;
  public String wPm;
  public int wem;
  public long wen;
  public int xlL;
  public cpx xlM;
  public cpx xlN;
  public String xlO;
  public int xlP;
  public long xlQ;
  public int xlR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5225);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      if (this.wPm != null)
        paramArrayOfObject.e(4, this.wPm);
      paramArrayOfObject.iz(5, this.xlL);
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
      if (this.xlO != null)
        paramArrayOfObject.e(9, this.xlO);
      paramArrayOfObject.iz(10, this.xlP);
      paramArrayOfObject.ai(11, this.xlQ);
      paramArrayOfObject.iz(12, this.xlR);
      AppMethodBeat.o(5225);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1119;
    label1119: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen);
      paramInt = i;
      if (this.wPm != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wPm);
      i = paramInt + e.a.a.b.b.a.bs(5, this.xlL);
      paramInt = i;
      if (this.xlM != null)
        paramInt = i + e.a.a.a.ix(6, this.xlM.computeSize());
      i = paramInt;
      if (this.xlN != null)
        i = paramInt + e.a.a.a.ix(7, this.xlN.computeSize());
      i += e.a.a.b.b.a.bs(8, this.vZF);
      paramInt = i;
      if (this.xlO != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.xlO);
      paramInt = paramInt + e.a.a.b.b.a.bs(10, this.xlP) + e.a.a.b.b.a.o(11, this.xlQ) + e.a.a.b.b.a.bs(12, this.xlR);
      AppMethodBeat.o(5225);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5225);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        coh localcoh = (coh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5225);
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
            localcoh.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 2:
          localcoh.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 3:
          localcoh.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 4:
          localcoh.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 5:
          localcoh.xlL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cpx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcoh.xlM = ((cpx)localObject1);
          }
          AppMethodBeat.o(5225);
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
            localcoh.xlN = paramArrayOfObject;
          }
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 8:
          localcoh.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 9:
          localcoh.xlO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 10:
          localcoh.xlP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 11:
          localcoh.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        case 12:
          localcoh.xlR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5225);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5225);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.coh
 * JD-Core Version:    0.6.2
 */