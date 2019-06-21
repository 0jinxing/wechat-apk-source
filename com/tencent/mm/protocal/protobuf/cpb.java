package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cpb extends bsr
{
  public long wOP;
  public long wen;
  public long xeF;
  public int xmD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135458);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.xeF);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.ai(4, this.wOP);
      paramArrayOfObject.iz(5, this.xmD);
      AppMethodBeat.o(135458);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label507;
    label507: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.xeF) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.o(4, this.wOP) + e.a.a.b.b.a.bs(5, this.xmD);
      AppMethodBeat.o(135458);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135458);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpb localcpb = (cpb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135458);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(135458);
          paramInt = i;
          break;
        case 2:
          localcpb.xeF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135458);
          paramInt = i;
          break;
        case 3:
          localcpb.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135458);
          paramInt = i;
          break;
        case 4:
          localcpb.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135458);
          paramInt = i;
          break;
        case 5:
          localcpb.xmD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135458);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135458);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpb
 * JD-Core Version:    0.6.2
 */