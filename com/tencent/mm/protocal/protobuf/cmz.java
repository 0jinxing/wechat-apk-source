package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cmz extends bsr
{
  public int OpCode;
  public SKBuiltinBuffer_t vJT;
  public String vLW;
  public bts vMa;
  public SKBuiltinBuffer_t vMb;
  public int wXN;
  public bts wtZ;
  public String xkw;
  public bts xkx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60072);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      if (this.xkw != null)
        paramArrayOfObject.e(3, this.xkw);
      if (this.vLW != null)
        paramArrayOfObject.e(4, this.vLW);
      if (this.wtZ != null)
      {
        paramArrayOfObject.iy(5, this.wtZ.computeSize());
        this.wtZ.writeFields(paramArrayOfObject);
      }
      if (this.xkx != null)
      {
        paramArrayOfObject.iy(6, this.xkx.computeSize());
        this.xkx.writeFields(paramArrayOfObject);
      }
      if (this.vMa != null)
      {
        paramArrayOfObject.iy(7, this.vMa.computeSize());
        this.vMa.writeFields(paramArrayOfObject);
      }
      if (this.vMb != null)
      {
        paramArrayOfObject.iy(8, this.vMb.computeSize());
        this.vMb.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.wXN);
      if (this.vJT != null)
      {
        paramArrayOfObject.iy(10, this.vJT.computeSize());
        this.vJT.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(60072);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1340;
    label1340: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode);
      paramInt = i;
      if (this.xkw != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xkw);
      i = paramInt;
      if (this.vLW != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLW);
      paramInt = i;
      if (this.wtZ != null)
        paramInt = i + e.a.a.a.ix(5, this.wtZ.computeSize());
      i = paramInt;
      if (this.xkx != null)
        i = paramInt + e.a.a.a.ix(6, this.xkx.computeSize());
      paramInt = i;
      if (this.vMa != null)
        paramInt = i + e.a.a.a.ix(7, this.vMa.computeSize());
      i = paramInt;
      if (this.vMb != null)
        i = paramInt + e.a.a.a.ix(8, this.vMb.computeSize());
      i += e.a.a.b.b.a.bs(9, this.wXN);
      paramInt = i;
      if (this.vJT != null)
        paramInt = i + e.a.a.a.ix(10, this.vJT.computeSize());
      AppMethodBeat.o(60072);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60072);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cmz localcmz = (cmz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60072);
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
            localcmz.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 2:
          localcmz.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 3:
          localcmz.xkw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 4:
          localcmz.vLW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmz.wtZ = paramArrayOfObject;
          }
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmz.xkx = paramArrayOfObject;
          }
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmz.vMa = paramArrayOfObject;
          }
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmz.vMb = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 9:
          localcmz.wXN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcmz.vJT = paramArrayOfObject;
          }
          AppMethodBeat.o(60072);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60072);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmz
 * JD-Core Version:    0.6.2
 */