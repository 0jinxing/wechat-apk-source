package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cdd extends com.tencent.mm.bt.a
{
  public int fQh;
  public int fQi;
  public int fQj;
  public int fQk;
  public int opType;
  public long timeStamp;
  public String xcN;
  public String xcO;
  public String xcP;
  public String xcQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94628);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xcN == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: StatusDesc1");
        AppMethodBeat.o(94628);
        throw paramArrayOfObject;
      }
      if (this.xcO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: StatusDesc2");
        AppMethodBeat.o(94628);
        throw paramArrayOfObject;
      }
      if (this.xcP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DataFlowSourceInfo");
        AppMethodBeat.o(94628);
        throw paramArrayOfObject;
      }
      if (this.xcQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DataFlowResultInfo");
        AppMethodBeat.o(94628);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.opType);
      paramArrayOfObject.iz(2, this.fQk);
      paramArrayOfObject.iz(3, this.fQh);
      paramArrayOfObject.ai(4, this.timeStamp);
      paramArrayOfObject.iz(5, this.fQi);
      paramArrayOfObject.iz(6, this.fQj);
      if (this.xcN != null)
        paramArrayOfObject.e(7, this.xcN);
      if (this.xcO != null)
        paramArrayOfObject.e(8, this.xcO);
      if (this.xcP != null)
        paramArrayOfObject.e(9, this.xcP);
      if (this.xcQ != null)
        paramArrayOfObject.e(10, this.xcQ);
      AppMethodBeat.o(94628);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.opType) + 0 + e.a.a.b.b.a.bs(2, this.fQk) + e.a.a.b.b.a.bs(3, this.fQh) + e.a.a.b.b.a.o(4, this.timeStamp) + e.a.a.b.b.a.bs(5, this.fQi) + e.a.a.b.b.a.bs(6, this.fQj);
        int i = paramInt;
        if (this.xcN != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.xcN);
        paramInt = i;
        if (this.xcO != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.xcO);
        i = paramInt;
        if (this.xcP != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.xcP);
        paramInt = i;
        if (this.xcQ != null)
          paramInt = i + e.a.a.b.b.a.f(10, this.xcQ);
        AppMethodBeat.o(94628);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xcN == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: StatusDesc1");
          AppMethodBeat.o(94628);
          throw paramArrayOfObject;
        }
        if (this.xcO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: StatusDesc2");
          AppMethodBeat.o(94628);
          throw paramArrayOfObject;
        }
        if (this.xcP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DataFlowSourceInfo");
          AppMethodBeat.o(94628);
          throw paramArrayOfObject;
        }
        if (this.xcQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DataFlowResultInfo");
          AppMethodBeat.o(94628);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94628);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdd localcdd = (cdd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94628);
          break;
        case 1:
          localcdd.opType = locala.BTU.vd();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 2:
          localcdd.fQk = locala.BTU.vd();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 3:
          localcdd.fQh = locala.BTU.vd();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 4:
          localcdd.timeStamp = locala.BTU.ve();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 5:
          localcdd.fQi = locala.BTU.vd();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 6:
          localcdd.fQj = locala.BTU.vd();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 7:
          localcdd.xcN = locala.BTU.readString();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 8:
          localcdd.xcO = locala.BTU.readString();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 9:
          localcdd.xcP = locala.BTU.readString();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        case 10:
          localcdd.xcQ = locala.BTU.readString();
          AppMethodBeat.o(94628);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94628);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdd
 * JD-Core Version:    0.6.2
 */