package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class mg extends com.tencent.mm.bt.a
{
  public String jCH;
  public String mZj;
  public mi vPY;
  public bvo vQb;
  public mo vQc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124293);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jCH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(124293);
        throw paramArrayOfObject;
      }
      if (this.vQb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ContactItem");
        AppMethodBeat.o(124293);
        throw paramArrayOfObject;
      }
      if (this.jCH != null)
        paramArrayOfObject.e(1, this.jCH);
      if (this.vPY != null)
      {
        paramArrayOfObject.iy(2, this.vPY.computeSize());
        this.vPY.writeFields(paramArrayOfObject);
      }
      if (this.vQb != null)
      {
        paramArrayOfObject.iy(3, this.vQb.computeSize());
        this.vQb.writeFields(paramArrayOfObject);
      }
      if (this.vQc != null)
      {
        paramArrayOfObject.iy(4, this.vQc.computeSize());
        this.vQc.writeFields(paramArrayOfObject);
      }
      if (this.mZj != null)
        paramArrayOfObject.e(5, this.mZj);
      AppMethodBeat.o(124293);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jCH == null)
        break label859;
    label859: for (paramInt = e.a.a.b.b.a.f(1, this.jCH) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vPY != null)
        i = paramInt + e.a.a.a.ix(2, this.vPY.computeSize());
      paramInt = i;
      if (this.vQb != null)
        paramInt = i + e.a.a.a.ix(3, this.vQb.computeSize());
      i = paramInt;
      if (this.vQc != null)
        i = paramInt + e.a.a.a.ix(4, this.vQc.computeSize());
      paramInt = i;
      if (this.mZj != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.mZj);
      AppMethodBeat.o(124293);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jCH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(124293);
          throw paramArrayOfObject;
        }
        if (this.vQb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ContactItem");
          AppMethodBeat.o(124293);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124293);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mg localmg = (mg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124293);
          break;
        case 1:
          localmg.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124293);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmg.vPY = paramArrayOfObject;
          }
          AppMethodBeat.o(124293);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bvo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmg.vQb = paramArrayOfObject;
          }
          AppMethodBeat.o(124293);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmg.vQc = paramArrayOfObject;
          }
          AppMethodBeat.o(124293);
          paramInt = i;
          break;
        case 5:
          localmg.mZj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124293);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124293);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mg
 * JD-Core Version:    0.6.2
 */