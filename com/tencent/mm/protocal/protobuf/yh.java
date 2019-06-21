package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class yh extends com.tencent.mm.bt.a
{
  public String Md5;
  public int jBv;
  public LinkedList<axm> jBw;

  public yh()
  {
    AppMethodBeat.i(62537);
    this.jBw = new LinkedList();
    AppMethodBeat.o(62537);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62538);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Md5 != null)
        paramArrayOfObject.e(1, this.Md5);
      paramArrayOfObject.iz(2, this.jBv);
      paramArrayOfObject.e(3, 8, this.jBw);
      AppMethodBeat.o(62538);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Md5 == null)
        break label422;
    label422: for (paramInt = e.a.a.b.b.a.f(1, this.Md5) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jBv) + e.a.a.a.c(3, 8, this.jBw);
      AppMethodBeat.o(62538);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jBw.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62538);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        yh localyh = (yh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62538);
          break;
        case 1:
          localyh.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62538);
          paramInt = i;
          break;
        case 2:
          localyh.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62538);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((axm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localyh.jBw.add(localObject1);
          }
          AppMethodBeat.o(62538);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62538);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yh
 * JD-Core Version:    0.6.2
 */