package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ank extends bsr
{
  public long bHi;
  public int bNT;
  public int wsg;
  public oo wsh;
  public sq wsi;
  public int wsj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134430);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wsg);
      paramArrayOfObject.iz(3, this.bNT);
      if (this.wsh != null)
      {
        paramArrayOfObject.iy(4, this.wsh.computeSize());
        this.wsh.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(5, this.bHi);
      if (this.wsi != null)
      {
        paramArrayOfObject.iy(6, this.wsi.computeSize());
        this.wsi.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.wsj);
      AppMethodBeat.o(134430);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label831;
    label831: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wsg) + e.a.a.b.b.a.bs(3, this.bNT);
      paramInt = i;
      if (this.wsh != null)
        paramInt = i + e.a.a.a.ix(4, this.wsh.computeSize());
      i = paramInt + e.a.a.b.b.a.o(5, this.bHi);
      paramInt = i;
      if (this.wsi != null)
        paramInt = i + e.a.a.a.ix(6, this.wsi.computeSize());
      paramInt += e.a.a.b.b.a.bs(7, this.wsj);
      AppMethodBeat.o(134430);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134430);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ank localank = (ank)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(134430);
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
            localank.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(134430);
          paramInt = i;
          break;
        case 2:
          localank.wsg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134430);
          paramInt = i;
          break;
        case 3:
          localank.bNT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134430);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new oo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((oo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localank.wsh = ((oo)localObject1);
          }
          AppMethodBeat.o(134430);
          paramInt = i;
          break;
        case 5:
          localank.bHi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(134430);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new sq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localank.wsi = ((sq)localObject1);
          }
          AppMethodBeat.o(134430);
          paramInt = i;
          break;
        case 7:
          localank.wsj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134430);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134430);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ank
 * JD-Core Version:    0.6.2
 */