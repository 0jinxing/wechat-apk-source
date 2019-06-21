package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bto extends com.tencent.mm.bt.a
{
  public btr vCP;
  public String vJS;
  public int wVx;
  public int wVy;
  public cgv wbo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48959);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wVx);
      paramArrayOfObject.iz(2, this.wVy);
      if (this.vCP != null)
      {
        paramArrayOfObject.iy(3, this.vCP.computeSize());
        this.vCP.writeFields(paramArrayOfObject);
      }
      if (this.wbo != null)
      {
        paramArrayOfObject.iy(4, this.wbo.computeSize());
        this.wbo.writeFields(paramArrayOfObject);
      }
      if (this.vJS != null)
        paramArrayOfObject.e(5, this.vJS);
      AppMethodBeat.o(48959);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wVx) + 0 + e.a.a.b.b.a.bs(2, this.wVy);
        i = paramInt;
        if (this.vCP != null)
          i = paramInt + e.a.a.a.ix(3, this.vCP.computeSize());
        paramInt = i;
        if (this.wbo != null)
          paramInt = i + e.a.a.a.ix(4, this.wbo.computeSize());
        i = paramInt;
        if (this.vJS != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.vJS);
        AppMethodBeat.o(48959);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48959);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bto localbto = (bto)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48959);
          break;
        case 1:
          localbto.wVx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48959);
          paramInt = 0;
          break;
        case 2:
          localbto.wVy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48959);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbto.vCP = paramArrayOfObject;
          }
          AppMethodBeat.o(48959);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbto.wbo = paramArrayOfObject;
          }
          AppMethodBeat.o(48959);
          paramInt = 0;
          break;
        case 5:
          localbto.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48959);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48959);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bto
 * JD-Core Version:    0.6.2
 */