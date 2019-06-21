package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bpc extends bsr
{
  public int OpCode;
  public float vRp;
  public float vRq;
  public int wfG;
  public String wfH;
  public String wfI;
  public int wfJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102517);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      paramArrayOfObject.r(3, this.vRp);
      paramArrayOfObject.r(4, this.vRq);
      paramArrayOfObject.iz(5, this.wfG);
      if (this.wfH != null)
        paramArrayOfObject.e(6, this.wfH);
      if (this.wfI != null)
        paramArrayOfObject.e(7, this.wfI);
      paramArrayOfObject.iz(8, this.wfJ);
      AppMethodBeat.o(102517);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label686;
    label686: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4) + e.a.a.b.b.a.bs(5, this.wfG);
      paramInt = i;
      if (this.wfH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wfH);
      i = paramInt;
      if (this.wfI != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wfI);
      paramInt = i + e.a.a.b.b.a.bs(8, this.wfJ);
      AppMethodBeat.o(102517);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102517);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpc localbpc = (bpc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102517);
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
            localbpc.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        case 2:
          localbpc.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        case 3:
          localbpc.vRp = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        case 4:
          localbpc.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        case 5:
          localbpc.wfG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        case 6:
          localbpc.wfH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        case 7:
          localbpc.wfI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        case 8:
          localbpc.wfJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102517);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102517);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpc
 * JD-Core Version:    0.6.2
 */