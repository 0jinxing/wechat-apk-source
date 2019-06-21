package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class caj extends bsr
{
  public int Scene;
  public int vFH;
  public brf vFa;
  public long vQE;
  public SKBuiltinBuffer_t wZw;
  public SKBuiltinBuffer_t wZx;
  public int wZy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94559);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.vQE);
      paramArrayOfObject.iz(3, this.Scene);
      if (this.wZw != null)
      {
        paramArrayOfObject.iy(4, this.wZw.computeSize());
        this.wZw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.vFH);
      if (this.wZx != null)
      {
        paramArrayOfObject.iy(6, this.wZx.computeSize());
        this.wZx.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.wZy);
      if (this.vFa != null)
      {
        paramArrayOfObject.iy(8, this.vFa.computeSize());
        this.vFa.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94559);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label989;
    label989: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.vQE) + e.a.a.b.b.a.bs(3, this.Scene);
      paramInt = i;
      if (this.wZw != null)
        paramInt = i + e.a.a.a.ix(4, this.wZw.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(5, this.vFH);
      paramInt = i;
      if (this.wZx != null)
        paramInt = i + e.a.a.a.ix(6, this.wZx.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(7, this.wZy);
      paramInt = i;
      if (this.vFa != null)
        paramInt = i + e.a.a.a.ix(8, this.vFa.computeSize());
      AppMethodBeat.o(94559);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94559);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        caj localcaj = (caj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94559);
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
            localcaj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(94559);
          paramInt = i;
          break;
        case 2:
          localcaj.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94559);
          paramInt = i;
          break;
        case 3:
          localcaj.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94559);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcaj.wZw = paramArrayOfObject;
          }
          AppMethodBeat.o(94559);
          paramInt = i;
          break;
        case 5:
          localcaj.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94559);
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
            localcaj.wZx = paramArrayOfObject;
          }
          AppMethodBeat.o(94559);
          paramInt = i;
          break;
        case 7:
          localcaj.wZy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94559);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new brf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcaj.vFa = paramArrayOfObject;
          }
          AppMethodBeat.o(94559);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94559);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.caj
 * JD-Core Version:    0.6.2
 */