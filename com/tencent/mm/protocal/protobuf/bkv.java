package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bkv extends com.tencent.mm.bt.a
{
  public civ wNQ;
  public int wpw;
  public String wpx;
  public String wpy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28572);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wpw);
      if (this.wpx != null)
        paramArrayOfObject.e(2, this.wpx);
      if (this.wpy != null)
        paramArrayOfObject.e(3, this.wpy);
      if (this.wNQ != null)
      {
        paramArrayOfObject.iy(4, this.wNQ.computeSize());
        this.wNQ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28572);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wpw) + 0;
        paramInt = i;
        if (this.wpx != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wpx);
        i = paramInt;
        if (this.wpy != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wpy);
        paramInt = i;
        if (this.wNQ != null)
          paramInt = i + e.a.a.a.ix(4, this.wNQ.computeSize());
        AppMethodBeat.o(28572);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28572);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bkv localbkv = (bkv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28572);
          break;
        case 1:
          localbkv.wpw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28572);
          paramInt = 0;
          break;
        case 2:
          localbkv.wpx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28572);
          paramInt = 0;
          break;
        case 3:
          localbkv.wpy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28572);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new civ();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkv.wNQ = paramArrayOfObject;
          }
          AppMethodBeat.o(28572);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28572);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkv
 * JD-Core Version:    0.6.2
 */