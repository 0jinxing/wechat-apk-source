package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class als extends bsr
{
  public int OpCode;
  public int Scene;
  public double vNH;
  public double vNI;
  public String wkD;
  public SKBuiltinBuffer_t wpP;
  public int wpR;
  public double wqS;
  public double wqT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113782);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wpP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buff");
        AppMethodBeat.o(113782);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.Scene);
      paramArrayOfObject.iz(3, this.OpCode);
      if (this.wkD != null)
        paramArrayOfObject.e(4, this.wkD);
      if (this.wpP != null)
      {
        paramArrayOfObject.iy(5, this.wpP.computeSize());
        this.wpP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.f(6, this.vNH);
      paramArrayOfObject.f(7, this.vNI);
      paramArrayOfObject.f(8, this.wqS);
      paramArrayOfObject.f(9, this.wqT);
      paramArrayOfObject.iz(10, this.wpR);
      AppMethodBeat.o(113782);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label930;
    label930: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.Scene) + e.a.a.b.b.a.bs(3, this.OpCode);
      paramInt = i;
      if (this.wkD != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wkD);
      i = paramInt;
      if (this.wpP != null)
        i = paramInt + e.a.a.a.ix(5, this.wpP.computeSize());
      paramInt = i + (e.a.a.b.b.a.fv(6) + 8) + (e.a.a.b.b.a.fv(7) + 8) + (e.a.a.b.b.a.fv(8) + 8) + (e.a.a.b.b.a.fv(9) + 8) + e.a.a.b.b.a.bs(10, this.wpR);
      AppMethodBeat.o(113782);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wpP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buff");
          AppMethodBeat.o(113782);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(113782);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        als localals = (als)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113782);
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
            localals.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 2:
          localals.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 3:
          localals.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 4:
          localals.wkD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localals.wpP = paramArrayOfObject;
          }
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 6:
          localals.vNH = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 7:
          localals.vNI = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 8:
          localals.wqS = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 9:
          localals.wqT = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        case 10:
          localals.wpR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113782);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(113782);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.als
 * JD-Core Version:    0.6.2
 */