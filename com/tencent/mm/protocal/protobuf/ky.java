package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ky extends bsr
{
  public int Scene;
  public int fJT;
  public int vLZ;
  public int vOn;
  public SKBuiltinBuffer_t vOo;
  public int vOp;
  public int vOq;
  public int vOr;
  public int vOs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11723);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vOo == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImageBuffer");
        AppMethodBeat.o(11723);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vOn);
      if (this.vOo != null)
      {
        paramArrayOfObject.iy(3, this.vOo.computeSize());
        this.vOo.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vOp);
      paramArrayOfObject.iz(5, this.vOq);
      paramArrayOfObject.iz(6, this.fJT);
      paramArrayOfObject.iz(7, this.vOr);
      paramArrayOfObject.iz(8, this.vLZ);
      paramArrayOfObject.iz(9, this.vOs);
      paramArrayOfObject.iz(10, this.Scene);
      AppMethodBeat.o(11723);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label922;
    label922: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOn);
      paramInt = i;
      if (this.vOo != null)
        paramInt = i + e.a.a.a.ix(3, this.vOo.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(4, this.vOp) + e.a.a.b.b.a.bs(5, this.vOq) + e.a.a.b.b.a.bs(6, this.fJT) + e.a.a.b.b.a.bs(7, this.vOr) + e.a.a.b.b.a.bs(8, this.vLZ) + e.a.a.b.b.a.bs(9, this.vOs) + e.a.a.b.b.a.bs(10, this.Scene);
      AppMethodBeat.o(11723);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vOo == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImageBuffer");
          AppMethodBeat.o(11723);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11723);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ky localky = (ky)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11723);
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
            localky.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 2:
          localky.vOn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localky.vOo = paramArrayOfObject;
          }
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 4:
          localky.vOp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 5:
          localky.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 6:
          localky.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 7:
          localky.vOr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 8:
          localky.vLZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 9:
          localky.vOs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        case 10:
          localky.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11723);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11723);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ky
 * JD-Core Version:    0.6.2
 */