package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class atr extends com.tencent.mm.bt.a
{
  public int wxH;
  public atu wxI;
  public att wxJ;
  public ats wxK;
  public atq wxL;
  public atv wxM;
  public atw wxN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28524);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wxH);
      if (this.wxI != null)
      {
        paramArrayOfObject.iy(2, this.wxI.computeSize());
        this.wxI.writeFields(paramArrayOfObject);
      }
      if (this.wxJ != null)
      {
        paramArrayOfObject.iy(3, this.wxJ.computeSize());
        this.wxJ.writeFields(paramArrayOfObject);
      }
      if (this.wxK != null)
      {
        paramArrayOfObject.iy(4, this.wxK.computeSize());
        this.wxK.writeFields(paramArrayOfObject);
      }
      if (this.wxL != null)
      {
        paramArrayOfObject.iy(5, this.wxL.computeSize());
        this.wxL.writeFields(paramArrayOfObject);
      }
      if (this.wxM != null)
      {
        paramArrayOfObject.iy(6, this.wxM.computeSize());
        this.wxM.writeFields(paramArrayOfObject);
      }
      if (this.wxN != null)
      {
        paramArrayOfObject.iy(7, this.wxN.computeSize());
        this.wxN.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28524);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wxH) + 0;
        i = paramInt;
        if (this.wxI != null)
          i = paramInt + e.a.a.a.ix(2, this.wxI.computeSize());
        paramInt = i;
        if (this.wxJ != null)
          paramInt = i + e.a.a.a.ix(3, this.wxJ.computeSize());
        i = paramInt;
        if (this.wxK != null)
          i = paramInt + e.a.a.a.ix(4, this.wxK.computeSize());
        paramInt = i;
        if (this.wxL != null)
          paramInt = i + e.a.a.a.ix(5, this.wxL.computeSize());
        i = paramInt;
        if (this.wxM != null)
          i = paramInt + e.a.a.a.ix(6, this.wxM.computeSize());
        paramInt = i;
        if (this.wxN != null)
          paramInt = i + e.a.a.a.ix(7, this.wxN.computeSize());
        AppMethodBeat.o(28524);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28524);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        atr localatr = (atr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28524);
          break;
        case 1:
          localatr.wxH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28524);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new atu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatr.wxI = ((atu)localObject1);
          }
          AppMethodBeat.o(28524);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new att();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((att)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatr.wxJ = ((att)localObject1);
          }
          AppMethodBeat.o(28524);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ats();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatr.wxK = paramArrayOfObject;
          }
          AppMethodBeat.o(28524);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new atq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatr.wxL = ((atq)localObject1);
          }
          AppMethodBeat.o(28524);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new atv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatr.wxM = ((atv)localObject1);
          }
          AppMethodBeat.o(28524);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new atw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatr.wxN = paramArrayOfObject;
          }
          AppMethodBeat.o(28524);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28524);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atr
 * JD-Core Version:    0.6.2
 */