package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class amy extends bsr
{
  public int fKj;
  public int wrA;
  public int wrB;
  public SKBuiltinBuffer_t wrz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(105146);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wrz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Url");
        AppMethodBeat.o(105146);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.fKj);
      if (this.wrz != null)
      {
        paramArrayOfObject.iy(3, this.wrz.computeSize());
        this.wrz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wrA);
      paramArrayOfObject.iz(5, this.wrB);
      AppMethodBeat.o(105146);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label668;
    label668: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.fKj);
      paramInt = i;
      if (this.wrz != null)
        paramInt = i + e.a.a.a.ix(3, this.wrz.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(4, this.wrA) + e.a.a.b.b.a.bs(5, this.wrB);
      AppMethodBeat.o(105146);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wrz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Url");
          AppMethodBeat.o(105146);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(105146);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        amy localamy = (amy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(105146);
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
            localamy.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(105146);
          paramInt = i;
          break;
        case 2:
          localamy.fKj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(105146);
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
            localamy.wrz = paramArrayOfObject;
          }
          AppMethodBeat.o(105146);
          paramInt = i;
          break;
        case 4:
          localamy.wrA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(105146);
          paramInt = i;
          break;
        case 5:
          localamy.wrB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(105146);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(105146);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.amy
 * JD-Core Version:    0.6.2
 */