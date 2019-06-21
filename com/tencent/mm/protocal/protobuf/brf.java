package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class brf extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t wTA;
  public SKBuiltinBuffer_t wTB;
  public SKBuiltinBuffer_t wTC;
  public SKBuiltinBuffer_t wTD;
  public int wTz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94553);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wTz);
      if (this.wTA != null)
      {
        paramArrayOfObject.iy(2, this.wTA.computeSize());
        this.wTA.writeFields(paramArrayOfObject);
      }
      if (this.wTB != null)
      {
        paramArrayOfObject.iy(3, this.wTB.computeSize());
        this.wTB.writeFields(paramArrayOfObject);
      }
      if (this.wTC != null)
      {
        paramArrayOfObject.iy(4, this.wTC.computeSize());
        this.wTC.writeFields(paramArrayOfObject);
      }
      if (this.wTD != null)
      {
        paramArrayOfObject.iy(5, this.wTD.computeSize());
        this.wTD.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94553);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wTz) + 0;
        paramInt = i;
        if (this.wTA != null)
          paramInt = i + e.a.a.a.ix(2, this.wTA.computeSize());
        i = paramInt;
        if (this.wTB != null)
          i = paramInt + e.a.a.a.ix(3, this.wTB.computeSize());
        paramInt = i;
        if (this.wTC != null)
          paramInt = i + e.a.a.a.ix(4, this.wTC.computeSize());
        i = paramInt;
        if (this.wTD != null)
          i = paramInt + e.a.a.a.ix(5, this.wTD.computeSize());
        AppMethodBeat.o(94553);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94553);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        brf localbrf = (brf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94553);
          break;
        case 1:
          localbrf.wTz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94553);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbrf.wTA = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94553);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbrf.wTB = paramArrayOfObject;
          }
          AppMethodBeat.o(94553);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbrf.wTC = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94553);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbrf.wTD = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94553);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94553);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brf
 * JD-Core Version:    0.6.2
 */