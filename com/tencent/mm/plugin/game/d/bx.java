package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bx extends com.tencent.mm.bt.a
{
  public cg mZE;
  public String mZj;
  public String mZr;
  public String ncG;
  public String ncH;
  public String ncI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111631);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr != null)
        paramArrayOfObject.e(1, this.mZr);
      if (this.ncG != null)
        paramArrayOfObject.e(2, this.ncG);
      if (this.ncH != null)
        paramArrayOfObject.e(3, this.ncH);
      if (this.ncI != null)
        paramArrayOfObject.e(4, this.ncI);
      if (this.mZE != null)
      {
        paramArrayOfObject.iy(5, this.mZE.computeSize());
        this.mZE.writeFields(paramArrayOfObject);
      }
      if (this.mZj != null)
        paramArrayOfObject.e(6, this.mZj);
      AppMethodBeat.o(111631);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZr == null)
        break label643;
    label643: for (paramInt = e.a.a.b.b.a.f(1, this.mZr) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ncG != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ncG);
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ncH);
      i = paramInt;
      if (this.ncI != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ncI);
      paramInt = i;
      if (this.mZE != null)
        paramInt = i + e.a.a.a.ix(5, this.mZE.computeSize());
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.mZj);
      AppMethodBeat.o(111631);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111631);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bx localbx = (bx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111631);
          break;
        case 1:
          localbx.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111631);
          paramInt = i;
          break;
        case 2:
          localbx.ncG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111631);
          paramInt = i;
          break;
        case 3:
          localbx.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111631);
          paramInt = i;
          break;
        case 4:
          localbx.ncI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111631);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbx.mZE = ((cg)localObject1);
          }
          AppMethodBeat.o(111631);
          paramInt = i;
          break;
        case 6:
          localbx.mZj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111631);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111631);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bx
 * JD-Core Version:    0.6.2
 */