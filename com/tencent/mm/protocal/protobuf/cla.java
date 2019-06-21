package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cla extends bsr
{
  public String jBB;
  public int ptw;
  public int ptx;
  public SKBuiltinBuffer_t ptz;
  public int wpi;
  public String xiK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80201);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(80201);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptw);
      paramArrayOfObject.iz(3, this.ptx);
      paramArrayOfObject.iz(4, this.wpi);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(5, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      if (this.xiK != null)
        paramArrayOfObject.e(6, this.xiK);
      if (this.jBB != null)
        paramArrayOfObject.e(7, this.jBB);
      AppMethodBeat.o(80201);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label798;
    label798: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptw) + e.a.a.b.b.a.bs(3, this.ptx) + e.a.a.b.b.a.bs(4, this.wpi);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(5, this.ptz.computeSize());
      i = paramInt;
      if (this.xiK != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.xiK);
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.jBB);
      AppMethodBeat.o(80201);
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
          AppMethodBeat.o(80201);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80201);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cla localcla = (cla)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80201);
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
            localcla.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80201);
          paramInt = i;
          break;
        case 2:
          localcla.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80201);
          paramInt = i;
          break;
        case 3:
          localcla.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80201);
          paramInt = i;
          break;
        case 4:
          localcla.wpi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80201);
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
            localcla.ptz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80201);
          paramInt = i;
          break;
        case 6:
          localcla.xiK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80201);
          paramInt = i;
          break;
        case 7:
          localcla.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80201);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80201);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cla
 * JD-Core Version:    0.6.2
 */