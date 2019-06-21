package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cwv extends com.tencent.mm.bt.a
{
  public int vMG;
  public LinkedList<om> wco;
  public ex xsA;
  public int xsw;
  public String xsx;
  public String xsy;
  public int xsz;

  public cwv()
  {
    AppMethodBeat.i(96331);
    this.wco = new LinkedList();
    AppMethodBeat.o(96331);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96332);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vMG);
      paramArrayOfObject.iz(2, this.xsw);
      if (this.xsx != null)
        paramArrayOfObject.e(3, this.xsx);
      if (this.xsy != null)
        paramArrayOfObject.e(4, this.xsy);
      paramArrayOfObject.iz(5, this.xsz);
      paramArrayOfObject.e(6, 8, this.wco);
      if (this.xsA != null)
      {
        paramArrayOfObject.iy(7, this.xsA.computeSize());
        this.xsA.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(96332);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vMG) + 0 + e.a.a.b.b.a.bs(2, this.xsw);
        paramInt = i;
        if (this.xsx != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.xsx);
        i = paramInt;
        if (this.xsy != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.xsy);
        i = i + e.a.a.b.b.a.bs(5, this.xsz) + e.a.a.a.c(6, 8, this.wco);
        paramInt = i;
        if (this.xsA != null)
          paramInt = i + e.a.a.a.ix(7, this.xsA.computeSize());
        AppMethodBeat.o(96332);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wco.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96332);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cwv localcwv = (cwv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96332);
          break;
        case 1:
          localcwv.vMG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96332);
          paramInt = 0;
          break;
        case 2:
          localcwv.xsw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96332);
          paramInt = 0;
          break;
        case 3:
          localcwv.xsx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96332);
          paramInt = 0;
          break;
        case 4:
          localcwv.xsy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96332);
          paramInt = 0;
          break;
        case 5:
          localcwv.xsz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96332);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new om();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((om)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcwv.wco.add(localObject1);
          }
          AppMethodBeat.o(96332);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ex();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcwv.xsA = paramArrayOfObject;
          }
          AppMethodBeat.o(96332);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96332);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwv
 * JD-Core Version:    0.6.2
 */