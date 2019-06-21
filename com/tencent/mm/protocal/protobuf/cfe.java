package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cfe extends btd
{
  public int vAR;
  public String wZT;
  public int xbC;
  public long xdM;
  public int xeG;
  public LinkedList<cer> xeH;
  public int xeI;
  public int xeJ;

  public cfe()
  {
    AppMethodBeat.i(56549);
    this.xeH = new LinkedList();
    AppMethodBeat.o(56549);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56550);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56550);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wZT != null)
        paramArrayOfObject.e(2, this.wZT);
      paramArrayOfObject.iz(3, this.xeG);
      paramArrayOfObject.e(4, 8, this.xeH);
      paramArrayOfObject.iz(5, this.xeI);
      paramArrayOfObject.iz(6, this.xeJ);
      paramArrayOfObject.iz(7, this.xbC);
      paramArrayOfObject.ai(8, this.xdM);
      paramArrayOfObject.iz(9, this.vAR);
      AppMethodBeat.o(56550);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label861;
    label861: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wZT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wZT);
      paramInt = i + e.a.a.b.b.a.bs(3, this.xeG) + e.a.a.a.c(4, 8, this.xeH) + e.a.a.b.b.a.bs(5, this.xeI) + e.a.a.b.b.a.bs(6, this.xeJ) + e.a.a.b.b.a.bs(7, this.xbC) + e.a.a.b.b.a.o(8, this.xdM) + e.a.a.b.b.a.bs(9, this.vAR);
      AppMethodBeat.o(56550);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xeH.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56550);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56550);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfe localcfe = (cfe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56550);
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
            localcfe.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 2:
          localcfe.wZT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 3:
          localcfe.xeG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cer();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cer)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfe.xeH.add(localObject1);
          }
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 5:
          localcfe.xeI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 6:
          localcfe.xeJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 7:
          localcfe.xbC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 8:
          localcfe.xdM = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        case 9:
          localcfe.vAR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56550);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56550);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfe
 * JD-Core Version:    0.6.2
 */