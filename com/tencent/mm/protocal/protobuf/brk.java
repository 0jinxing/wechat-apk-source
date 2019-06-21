package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class brk extends bsr
{
  public int vZZ;
  public LinkedList<ks> wTG;
  public int wTH;
  public int wTI;

  public brk()
  {
    AppMethodBeat.i(14742);
    this.wTG = new LinkedList();
    AppMethodBeat.o(14742);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14743);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wTG);
      paramArrayOfObject.iz(3, this.wTH);
      paramArrayOfObject.iz(4, this.wTI);
      paramArrayOfObject.iz(5, this.vZZ);
      AppMethodBeat.o(14743);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label614;
    label614: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.wTG) + e.a.a.b.b.a.bs(3, this.wTH) + e.a.a.b.b.a.bs(4, this.wTI) + e.a.a.b.b.a.bs(5, this.vZZ);
      AppMethodBeat.o(14743);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wTG.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14743);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        brk localbrk = (brk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14743);
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
            localbrk.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(14743);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ks();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbrk.wTG.add(paramArrayOfObject);
          }
          AppMethodBeat.o(14743);
          paramInt = i;
          break;
        case 3:
          localbrk.wTH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14743);
          paramInt = i;
          break;
        case 4:
          localbrk.wTI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14743);
          paramInt = i;
          break;
        case 5:
          localbrk.vZZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14743);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14743);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brk
 * JD-Core Version:    0.6.2
 */