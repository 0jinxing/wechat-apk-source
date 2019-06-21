package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpd extends bsr
{
  public String ndF;
  public int wOQ;
  public String wPm;
  public int wem;
  public long wen;
  public long xlQ;
  public cqf xmK;
  public int xmL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5234);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xmK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReportData");
        AppMethodBeat.o(5234);
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
      if (this.ndF != null)
        paramArrayOfObject.e(6, this.ndF);
      if (this.xmK != null)
      {
        paramArrayOfObject.iy(8, this.xmK.computeSize());
        this.xmK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.xmL);
      paramArrayOfObject.ai(10, this.xlQ);
      paramArrayOfObject.iz(11, this.wOQ);
      AppMethodBeat.o(5234);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label919;
    label919: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPm != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wPm);
      i = i + e.a.a.b.b.a.bs(3, this.wem) + e.a.a.b.b.a.o(4, this.wen);
      paramInt = i;
      if (this.ndF != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.ndF);
      i = paramInt;
      if (this.xmK != null)
        i = paramInt + e.a.a.a.ix(8, this.xmK.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(9, this.xmL) + e.a.a.b.b.a.o(10, this.xlQ) + e.a.a.b.b.a.bs(11, this.wOQ);
      AppMethodBeat.o(5234);
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
          AppMethodBeat.o(5234);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5234);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpd localcpd = (cpd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5:
        case 7:
        default:
          paramInt = -1;
          AppMethodBeat.o(5234);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpd.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 2:
          localcpd.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 3:
          localcpd.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 4:
          localcpd.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 6:
          localcpd.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpd.xmK = paramArrayOfObject;
          }
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 9:
          localcpd.xmL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 10:
          localcpd.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        case 11:
          localcpd.wOQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5234);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5234);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpd
 * JD-Core Version:    0.6.2
 */