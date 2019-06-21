package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cgt extends com.tencent.mm.bt.a
{
  public float size;
  public String text;
  public btr vCP;
  public String vJS;
  public long xfA;
  public String xfB;
  public int xfC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48969);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.xfA);
      if (this.xfB != null)
        paramArrayOfObject.e(2, this.xfB);
      if (this.text != null)
        paramArrayOfObject.e(3, this.text);
      paramArrayOfObject.r(4, this.size);
      if (this.vCP != null)
      {
        paramArrayOfObject.iy(5, this.vCP.computeSize());
        this.vCP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.xfC);
      if (this.vJS != null)
        paramArrayOfObject.e(7, this.vJS);
      AppMethodBeat.o(48969);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.xfA) + 0;
        paramInt = i;
        if (this.xfB != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xfB);
        i = paramInt;
        if (this.text != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.text);
        i += e.a.a.b.b.a.fv(4) + 4;
        paramInt = i;
        if (this.vCP != null)
          paramInt = i + e.a.a.a.ix(5, this.vCP.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(6, this.xfC);
        paramInt = i;
        if (this.vJS != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vJS);
        AppMethodBeat.o(48969);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48969);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgt localcgt = (cgt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48969);
          break;
        case 1:
          localcgt.xfA = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48969);
          paramInt = 0;
          break;
        case 2:
          localcgt.xfB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48969);
          paramInt = 0;
          break;
        case 3:
          localcgt.text = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48969);
          paramInt = 0;
          break;
        case 4:
          localcgt.size = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(48969);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new btr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((btr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgt.vCP = ((btr)localObject1);
          }
          AppMethodBeat.o(48969);
          paramInt = 0;
          break;
        case 6:
          localcgt.xfC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48969);
          paramInt = 0;
          break;
        case 7:
          localcgt.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48969);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48969);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgt
 * JD-Core Version:    0.6.2
 */