package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class asz extends com.tencent.mm.bt.a
{
  public hj wwG;
  public na wwH;
  public bba wwI;
  public cdp wwJ;
  public buk wwK;
  public td wwL;
  public abx wwM;
  public acu wwN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2542);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wwG != null)
      {
        paramArrayOfObject.iy(1, this.wwG.computeSize());
        this.wwG.writeFields(paramArrayOfObject);
      }
      if (this.wwH != null)
      {
        paramArrayOfObject.iy(2, this.wwH.computeSize());
        this.wwH.writeFields(paramArrayOfObject);
      }
      if (this.wwI != null)
      {
        paramArrayOfObject.iy(3, this.wwI.computeSize());
        this.wwI.writeFields(paramArrayOfObject);
      }
      if (this.wwJ != null)
      {
        paramArrayOfObject.iy(4, this.wwJ.computeSize());
        this.wwJ.writeFields(paramArrayOfObject);
      }
      if (this.wwK != null)
      {
        paramArrayOfObject.iy(6, this.wwK.computeSize());
        this.wwK.writeFields(paramArrayOfObject);
      }
      if (this.wwL != null)
      {
        paramArrayOfObject.iy(7, this.wwL.computeSize());
        this.wwL.writeFields(paramArrayOfObject);
      }
      if (this.wwM != null)
      {
        paramArrayOfObject.iy(8, this.wwM.computeSize());
        this.wwM.writeFields(paramArrayOfObject);
      }
      if (this.wwN != null)
      {
        paramArrayOfObject.iy(9, this.wwN.computeSize());
        this.wwN.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(2542);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wwG == null)
        break label1456;
    label1456: for (paramInt = e.a.a.a.ix(1, this.wwG.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wwH != null)
        i = paramInt + e.a.a.a.ix(2, this.wwH.computeSize());
      paramInt = i;
      if (this.wwI != null)
        paramInt = i + e.a.a.a.ix(3, this.wwI.computeSize());
      i = paramInt;
      if (this.wwJ != null)
        i = paramInt + e.a.a.a.ix(4, this.wwJ.computeSize());
      paramInt = i;
      if (this.wwK != null)
        paramInt = i + e.a.a.a.ix(6, this.wwK.computeSize());
      i = paramInt;
      if (this.wwL != null)
        i = paramInt + e.a.a.a.ix(7, this.wwL.computeSize());
      paramInt = i;
      if (this.wwM != null)
        paramInt = i + e.a.a.a.ix(8, this.wwM.computeSize());
      i = paramInt;
      if (this.wwN != null)
        i = paramInt + e.a.a.a.ix(9, this.wwN.computeSize());
      AppMethodBeat.o(2542);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2542);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        asz localasz = (asz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5:
        default:
          paramInt = -1;
          AppMethodBeat.o(2542);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwG = ((hj)localObject1);
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new na();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((na)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwH = ((na)localObject1);
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bba();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bba)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwI = ((bba)localObject1);
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cdp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwJ = paramArrayOfObject;
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new buk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((buk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwK = ((buk)localObject1);
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new td();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((td)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwL = ((td)localObject1);
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new abx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwM = paramArrayOfObject;
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new acu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((acu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasz.wwN = ((acu)localObject1);
          }
          AppMethodBeat.o(2542);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(2542);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asz
 * JD-Core Version:    0.6.2
 */