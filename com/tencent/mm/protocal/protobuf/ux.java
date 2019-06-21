package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ux extends com.tencent.mm.bt.a
{
  public bdq wcs;
  public LinkedList<xc> wct;
  public LinkedList<cnv> wcu;
  public String wcv;

  public ux()
  {
    AppMethodBeat.i(48830);
    this.wct = new LinkedList();
    this.wcu = new LinkedList();
    AppMethodBeat.o(48830);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48831);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcs != null)
      {
        paramArrayOfObject.iy(1, this.wcs.computeSize());
        this.wcs.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wct);
      paramArrayOfObject.e(3, 8, this.wcu);
      if (this.wcv != null)
        paramArrayOfObject.e(4, this.wcv);
      AppMethodBeat.o(48831);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcs == null)
        break label674;
    label674: for (paramInt = e.a.a.a.ix(1, this.wcs.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.wct) + e.a.a.a.c(3, 8, this.wcu);
      paramInt = i;
      if (this.wcv != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wcv);
      AppMethodBeat.o(48831);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wct.clear();
        this.wcu.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48831);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ux localux = (ux)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48831);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localux.wcs = paramArrayOfObject;
          }
          AppMethodBeat.o(48831);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localux.wct.add(localObject1);
          }
          AppMethodBeat.o(48831);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cnv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cnv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localux.wcu.add(localObject1);
          }
          AppMethodBeat.o(48831);
          paramInt = i;
          break;
        case 4:
          localux.wcv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48831);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48831);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ux
 * JD-Core Version:    0.6.2
 */