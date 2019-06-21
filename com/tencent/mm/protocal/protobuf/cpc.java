package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cpc extends btd
{
  public long wen;
  public long xeF;
  public int xmD;
  public int xmE;
  public int xmF;
  public int xmG;
  public com.tencent.mm.bt.b xmH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135459);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(135459);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.xeF);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.xmD);
      paramArrayOfObject.iz(5, this.xmE);
      paramArrayOfObject.iz(6, this.xmF);
      paramArrayOfObject.iz(7, this.xmG);
      if (this.xmH != null)
        paramArrayOfObject.c(8, this.xmH);
      AppMethodBeat.o(135459);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label712;
    label712: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.xeF) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.xmD) + e.a.a.b.b.a.bs(5, this.xmE) + e.a.a.b.b.a.bs(6, this.xmF) + e.a.a.b.b.a.bs(7, this.xmG);
      paramInt = i;
      if (this.xmH != null)
        paramInt = i + e.a.a.b.b.a.b(8, this.xmH);
      AppMethodBeat.o(135459);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(135459);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(135459);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpc localcpc = (cpc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135459);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpc.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        case 2:
          localcpc.xeF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        case 3:
          localcpc.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        case 4:
          localcpc.xmD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        case 5:
          localcpc.xmE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        case 6:
          localcpc.xmF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        case 7:
          localcpc.xmG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        case 8:
          localcpc.xmH = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(135459);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135459);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpc
 * JD-Core Version:    0.6.2
 */