package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class xl extends bsr
{
  public int ptD;
  public long ptF;
  public int ptw;
  public int ptx;
  public int wdl;
  public int wdm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(50998);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptD);
      paramArrayOfObject.iz(3, this.ptw);
      paramArrayOfObject.iz(4, this.ptx);
      paramArrayOfObject.iz(5, this.wdl);
      paramArrayOfObject.iz(6, this.wdm);
      paramArrayOfObject.ai(7, this.ptF);
      AppMethodBeat.o(50998);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label601;
    label601: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.ptD) + e.a.a.b.b.a.bs(3, this.ptw) + e.a.a.b.b.a.bs(4, this.ptx) + e.a.a.b.b.a.bs(5, this.wdl) + e.a.a.b.b.a.bs(6, this.wdm) + e.a.a.b.b.a.o(7, this.ptF);
      AppMethodBeat.o(50998);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(50998);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xl localxl = (xl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(50998);
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
            localxl.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(50998);
          paramInt = i;
          break;
        case 2:
          localxl.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50998);
          paramInt = i;
          break;
        case 3:
          localxl.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50998);
          paramInt = i;
          break;
        case 4:
          localxl.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50998);
          paramInt = i;
          break;
        case 5:
          localxl.wdl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50998);
          paramInt = i;
          break;
        case 6:
          localxl.wdm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50998);
          paramInt = i;
          break;
        case 7:
          localxl.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(50998);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(50998);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xl
 * JD-Core Version:    0.6.2
 */