package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class afj extends bsr
{
  public int Scene;
  public int jCt;
  public SKBuiltinBuffer_t vLz;
  public String wmM;
  public int wmN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(845);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.Scene);
      if (this.wmM != null)
        paramArrayOfObject.e(4, this.wmM);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(5, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.wmN);
      AppMethodBeat.o(845);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label699;
    label699: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.Scene);
      paramInt = i;
      if (this.wmM != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wmM);
      i = paramInt;
      if (this.vLz != null)
        i = paramInt + e.a.a.a.ix(5, this.vLz.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(6, this.wmN);
      AppMethodBeat.o(845);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(845);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        afj localafj = (afj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(845);
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
            localafj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(845);
          paramInt = i;
          break;
        case 2:
          localafj.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(845);
          paramInt = i;
          break;
        case 3:
          localafj.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(845);
          paramInt = i;
          break;
        case 4:
          localafj.wmM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(845);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localafj.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(845);
          paramInt = i;
          break;
        case 6:
          localafj.wmN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(845);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(845);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.afj
 * JD-Core Version:    0.6.2
 */