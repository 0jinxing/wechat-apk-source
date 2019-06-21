package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bvg extends com.tencent.mm.bt.a
{
  public long vQd;
  public axy wDI;
  public int wWo;
  public LinkedList<cmg> wWp;
  public String wol;

  public bvg()
  {
    AppMethodBeat.i(124353);
    this.wWp = new LinkedList();
    AppMethodBeat.o(124353);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124354);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wol == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyWord");
        AppMethodBeat.o(124354);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQd);
      if (this.wol != null)
        paramArrayOfObject.e(2, this.wol);
      if (this.wDI != null)
      {
        paramArrayOfObject.iy(3, this.wDI.computeSize());
        this.wDI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wWo);
      paramArrayOfObject.e(5, 8, this.wWp);
      AppMethodBeat.o(124354);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.vQd) + 0;
        paramInt = i;
        if (this.wol != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wol);
        i = paramInt;
        if (this.wDI != null)
          i = paramInt + e.a.a.a.ix(3, this.wDI.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(4, this.wWo) + e.a.a.a.c(5, 8, this.wWp);
        AppMethodBeat.o(124354);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wWp.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wol == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyWord");
          AppMethodBeat.o(124354);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124354);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvg localbvg = (bvg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124354);
          break;
        case 1:
          localbvg.vQd = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124354);
          paramInt = 0;
          break;
        case 2:
          localbvg.wol = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124354);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvg.wDI = paramArrayOfObject;
          }
          AppMethodBeat.o(124354);
          paramInt = 0;
          break;
        case 4:
          localbvg.wWo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124354);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cmg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvg.wWp.add(paramArrayOfObject);
          }
          AppMethodBeat.o(124354);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124354);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvg
 * JD-Core Version:    0.6.2
 */