package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bcf extends com.tencent.mm.bt.a
{
  public int wGK;
  public int wGL;
  public int wGu;
  public bts wcB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28554);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(28554);
        throw paramArrayOfObject;
      }
      if (this.wcB != null)
      {
        paramArrayOfObject.iy(1, this.wcB.computeSize());
        this.wcB.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wGK);
      paramArrayOfObject.iz(3, this.wGL);
      paramArrayOfObject.iz(4, this.wGu);
      AppMethodBeat.o(28554);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcB == null)
        break label522;
    label522: for (paramInt = e.a.a.a.ix(1, this.wcB.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wGK) + e.a.a.b.b.a.bs(3, this.wGL) + e.a.a.b.b.a.bs(4, this.wGu);
      AppMethodBeat.o(28554);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(28554);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28554);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bcf localbcf = (bcf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28554);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcf.wcB = paramArrayOfObject;
          }
          AppMethodBeat.o(28554);
          paramInt = i;
          break;
        case 2:
          localbcf.wGK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28554);
          paramInt = i;
          break;
        case 3:
          localbcf.wGL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28554);
          paramInt = i;
          break;
        case 4:
          localbcf.wGu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28554);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28554);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bcf
 * JD-Core Version:    0.6.2
 */