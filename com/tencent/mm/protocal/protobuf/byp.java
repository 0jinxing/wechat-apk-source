package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class byp extends bsr
{
  public int fJT;
  public SKBuiltinBuffer_t ptz;
  public int vFE;
  public float vRq;
  public int vZF;
  public int wXO;
  public float wXP;
  public float wXQ;
  public int wrA;
  public int wrB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28646);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(28646);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(2, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wXO);
      paramArrayOfObject.iz(4, this.fJT);
      paramArrayOfObject.r(5, this.wXP);
      paramArrayOfObject.iz(6, this.vZF);
      paramArrayOfObject.iz(7, this.vFE);
      paramArrayOfObject.r(8, this.wXQ);
      paramArrayOfObject.r(9, this.vRq);
      paramArrayOfObject.iz(10, this.wrA);
      paramArrayOfObject.iz(11, this.wrB);
      AppMethodBeat.o(28646);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label973;
    label973: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ptz != null)
        i = paramInt + e.a.a.a.ix(2, this.ptz.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.wXO) + e.a.a.b.b.a.bs(4, this.fJT) + (e.a.a.b.b.a.fv(5) + 4) + e.a.a.b.b.a.bs(6, this.vZF) + e.a.a.b.b.a.bs(7, this.vFE) + (e.a.a.b.b.a.fv(8) + 4) + (e.a.a.b.b.a.fv(9) + 4) + e.a.a.b.b.a.bs(10, this.wrA) + e.a.a.b.b.a.bs(11, this.wrB);
      AppMethodBeat.o(28646);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(28646);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28646);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byp localbyp = (byp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28646);
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
            localbyp.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyp.ptz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 3:
          localbyp.wXO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 4:
          localbyp.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 5:
          localbyp.wXP = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 6:
          localbyp.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 7:
          localbyp.vFE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 8:
          localbyp.wXQ = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 9:
          localbyp.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 10:
          localbyp.wrA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        case 11:
          localbyp.wrB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28646);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28646);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byp
 * JD-Core Version:    0.6.2
 */