package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cec extends btd
{
  public int vAR;
  public int vQe;
  public LinkedList<cer> xdL;
  public long xdM;
  public int xds;

  public cec()
  {
    AppMethodBeat.i(56510);
    this.xdL = new LinkedList();
    AppMethodBeat.o(56510);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56511);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56511);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.xds);
      paramArrayOfObject.e(3, 8, this.xdL);
      paramArrayOfObject.ai(4, this.xdM);
      paramArrayOfObject.iz(5, this.vQe);
      paramArrayOfObject.iz(6, this.vAR);
      AppMethodBeat.o(56511);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label699;
    label699: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.xds) + e.a.a.a.c(3, 8, this.xdL) + e.a.a.b.b.a.o(4, this.xdM) + e.a.a.b.b.a.bs(5, this.vQe) + e.a.a.b.b.a.bs(6, this.vAR);
      AppMethodBeat.o(56511);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xdL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56511);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56511);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cec localcec = (cec)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56511);
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
            localcec.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56511);
          paramInt = i;
          break;
        case 2:
          localcec.xds = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56511);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cer();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcec.xdL.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56511);
          paramInt = i;
          break;
        case 4:
          localcec.xdM = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56511);
          paramInt = i;
          break;
        case 5:
          localcec.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56511);
          paramInt = i;
          break;
        case 6:
          localcec.vAR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56511);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56511);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cec
 * JD-Core Version:    0.6.2
 */