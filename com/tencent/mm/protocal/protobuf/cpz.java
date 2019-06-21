package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpz extends bsr
{
  public String wPm;
  public int wem;
  public long wen;
  public long xlQ;
  public cqf xmK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5265);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xmK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReportData");
        AppMethodBeat.o(5265);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wPm != null)
        paramArrayOfObject.e(2, this.wPm);
      paramArrayOfObject.iz(3, this.wem);
      paramArrayOfObject.ai(4, this.wen);
      if (this.xmK != null)
      {
        paramArrayOfObject.iy(5, this.xmK.computeSize());
        this.xmK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.xlQ);
      AppMethodBeat.o(5265);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label747;
    label747: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPm != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wPm);
      i = i + e.a.a.b.b.a.bs(3, this.wem) + e.a.a.b.b.a.o(4, this.wen);
      paramInt = i;
      if (this.xmK != null)
        paramInt = i + e.a.a.a.ix(5, this.xmK.computeSize());
      paramInt += e.a.a.b.b.a.o(6, this.xlQ);
      AppMethodBeat.o(5265);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xmK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReportData");
          AppMethodBeat.o(5265);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5265);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpz localcpz = (cpz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5265);
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
            localcpz.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5265);
          paramInt = i;
          break;
        case 2:
          localcpz.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5265);
          paramInt = i;
          break;
        case 3:
          localcpz.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5265);
          paramInt = i;
          break;
        case 4:
          localcpz.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5265);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cqf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cqf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpz.xmK = ((cqf)localObject1);
          }
          AppMethodBeat.o(5265);
          paramInt = i;
          break;
        case 6:
          localcpz.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5265);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5265);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpz
 * JD-Core Version:    0.6.2
 */