package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cim extends bsr
{
  public String vIk;
  public String wbq;
  public atr xhs;
  public int xht;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28672);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wbq != null)
        paramArrayOfObject.e(2, this.wbq);
      if (this.vIk != null)
        paramArrayOfObject.e(3, this.vIk);
      if (this.xhs != null)
      {
        paramArrayOfObject.iy(4, this.xhs.computeSize());
        this.xhs.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.xht);
      AppMethodBeat.o(28672);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label668;
    label668: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wbq != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wbq);
      i = paramInt;
      if (this.vIk != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vIk);
      paramInt = i;
      if (this.xhs != null)
        paramInt = i + e.a.a.a.ix(4, this.xhs.computeSize());
      paramInt += e.a.a.b.b.a.bs(5, this.xht);
      AppMethodBeat.o(28672);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28672);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cim localcim = (cim)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28672);
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
            localcim.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28672);
          paramInt = i;
          break;
        case 2:
          localcim.wbq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28672);
          paramInt = i;
          break;
        case 3:
          localcim.vIk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28672);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new atr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcim.xhs = ((atr)localObject1);
          }
          AppMethodBeat.o(28672);
          paramInt = i;
          break;
        case 5:
          localcim.xht = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28672);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28672);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cim
 * JD-Core Version:    0.6.2
 */