package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class clc extends bsr
{
  public int fJT;
  public String jBB;
  public SKBuiltinBuffer_t ptz;
  public int vHo;
  public int vHr;
  public int vOq;
  public String xiM;
  public int xiN;
  public int xiO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116807);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(116807);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(3, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vOq);
      if (this.xiM != null)
        paramArrayOfObject.e(5, this.xiM);
      paramArrayOfObject.iz(6, this.fJT);
      paramArrayOfObject.iz(7, this.xiN);
      paramArrayOfObject.iz(8, this.vHr);
      paramArrayOfObject.iz(9, this.xiO);
      paramArrayOfObject.iz(10, this.vHo);
      AppMethodBeat.o(116807);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label938;
    label938: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jBB);
      i = paramInt;
      if (this.ptz != null)
        i = paramInt + e.a.a.a.ix(3, this.ptz.computeSize());
      i += e.a.a.b.b.a.bs(4, this.vOq);
      paramInt = i;
      if (this.xiM != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xiM);
      paramInt = paramInt + e.a.a.b.b.a.bs(6, this.fJT) + e.a.a.b.b.a.bs(7, this.xiN) + e.a.a.b.b.a.bs(8, this.vHr) + e.a.a.b.b.a.bs(9, this.xiO) + e.a.a.b.b.a.bs(10, this.vHo);
      AppMethodBeat.o(116807);
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
          AppMethodBeat.o(116807);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116807);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        clc localclc = (clc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116807);
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
            localclc.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 2:
          localclc.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116807);
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
            localclc.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 4:
          localclc.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 5:
          localclc.xiM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 6:
          localclc.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 7:
          localclc.xiN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 8:
          localclc.vHr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 9:
          localclc.xiO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        case 10:
          localclc.vHo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116807);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116807);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clc
 * JD-Core Version:    0.6.2
 */