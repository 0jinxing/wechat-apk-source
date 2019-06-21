package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cdb extends com.tencent.mm.bt.a
{
  public int scene;
  public cda xcI;
  public cda xcJ;
  public cda xcK;
  public int xcL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96295);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xcI != null)
      {
        paramArrayOfObject.iy(1, this.xcI.computeSize());
        this.xcI.writeFields(paramArrayOfObject);
      }
      if (this.xcJ != null)
      {
        paramArrayOfObject.iy(2, this.xcJ.computeSize());
        this.xcJ.writeFields(paramArrayOfObject);
      }
      if (this.xcK != null)
      {
        paramArrayOfObject.iy(3, this.xcK.computeSize());
        this.xcK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.scene);
      paramArrayOfObject.iz(5, this.xcL);
      AppMethodBeat.o(96295);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xcI == null)
        break label731;
    label731: for (i = e.a.a.a.ix(1, this.xcI.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xcJ != null)
        paramInt = i + e.a.a.a.ix(2, this.xcJ.computeSize());
      i = paramInt;
      if (this.xcK != null)
        i = paramInt + e.a.a.a.ix(3, this.xcK.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(4, this.scene) + e.a.a.b.b.a.bs(5, this.xcL);
      AppMethodBeat.o(96295);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96295);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cdb localcdb = (cdb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96295);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cda();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdb.xcI = paramArrayOfObject;
          }
          AppMethodBeat.o(96295);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cda();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdb.xcJ = paramArrayOfObject;
          }
          AppMethodBeat.o(96295);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cda();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdb.xcK = paramArrayOfObject;
          }
          AppMethodBeat.o(96295);
          paramInt = i;
          break;
        case 4:
          localcdb.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96295);
          paramInt = i;
          break;
        case 5:
          localcdb.xcL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96295);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96295);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdb
 * JD-Core Version:    0.6.2
 */