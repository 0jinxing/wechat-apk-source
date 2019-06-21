package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aqv extends bsr
{
  public int Scene;
  public String jBB;
  public SKBuiltinBuffer_t vHP;
  public SKBuiltinBuffer_t wlr;
  public String wuI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28515);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: A2Key");
        AppMethodBeat.o(28515);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vHP != null)
      {
        paramArrayOfObject.iy(2, this.vHP.computeSize());
        this.vHP.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      paramArrayOfObject.iz(4, this.Scene);
      if (this.wuI != null)
        paramArrayOfObject.e(5, this.wuI);
      if (this.wlr != null)
      {
        paramArrayOfObject.iy(6, this.wlr.computeSize());
        this.wlr.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28515);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label879;
    label879: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vHP != null)
        paramInt = i + e.a.a.a.ix(2, this.vHP.computeSize());
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jBB);
      i += e.a.a.b.b.a.bs(4, this.Scene);
      paramInt = i;
      if (this.wuI != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wuI);
      i = paramInt;
      if (this.wlr != null)
        i = paramInt + e.a.a.a.ix(6, this.wlr.computeSize());
      AppMethodBeat.o(28515);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: A2Key");
          AppMethodBeat.o(28515);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28515);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aqv localaqv = (aqv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28515);
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
            localaqv.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28515);
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
            localaqv.vHP = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28515);
          paramInt = i;
          break;
        case 3:
          localaqv.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28515);
          paramInt = i;
          break;
        case 4:
          localaqv.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28515);
          paramInt = i;
          break;
        case 5:
          localaqv.wuI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28515);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqv.wlr = paramArrayOfObject;
          }
          AppMethodBeat.o(28515);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28515);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aqv
 * JD-Core Version:    0.6.2
 */