package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ape extends bsr
{
  public LinkedList<bzk> wtf;

  public ape()
  {
    AppMethodBeat.i(114972);
    this.wtf = new LinkedList();
    AppMethodBeat.o(114972);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114973);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wtf);
      AppMethodBeat.o(114973);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label471;
    label471: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.wtf);
      AppMethodBeat.o(114973);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtf.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114973);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ape localape = (ape)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(114973);
          paramInt = -1;
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
            localape.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(114973);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localape.wtf.add(paramArrayOfObject);
          }
          AppMethodBeat.o(114973);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(114973);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ape
 * JD-Core Version:    0.6.2
 */