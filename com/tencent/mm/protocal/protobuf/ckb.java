package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ckb extends bsr
{
  public int Scene;
  public SKBuiltinBuffer_t vLz;
  public String xil;
  public String xim;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(59395);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xil != null)
        paramArrayOfObject.e(2, this.xil);
      if (this.xim != null)
        paramArrayOfObject.e(3, this.xim);
      paramArrayOfObject.iz(4, this.Scene);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(5, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(59395);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label657;
    label657: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xil != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xil);
      i = paramInt;
      if (this.xim != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xim);
      i += e.a.a.b.b.a.bs(4, this.Scene);
      paramInt = i;
      if (this.vLz != null)
        paramInt = i + e.a.a.a.ix(5, this.vLz.computeSize());
      AppMethodBeat.o(59395);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(59395);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ckb localckb = (ckb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(59395);
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
            localckb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(59395);
          paramInt = i;
          break;
        case 2:
          localckb.xil = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59395);
          paramInt = i;
          break;
        case 3:
          localckb.xim = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59395);
          paramInt = i;
          break;
        case 4:
          localckb.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59395);
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
            localckb.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(59395);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(59395);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ckb
 * JD-Core Version:    0.6.2
 */