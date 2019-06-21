package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aur extends com.tencent.mm.bt.a
{
  public String wyN;
  public String wyO;
  public wx wyP;
  public wx wyQ;
  public String wyR;
  public String wyS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48876);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyN != null)
        paramArrayOfObject.e(1, this.wyN);
      if (this.wyO != null)
        paramArrayOfObject.e(2, this.wyO);
      if (this.wyP != null)
      {
        paramArrayOfObject.iy(3, this.wyP.computeSize());
        this.wyP.writeFields(paramArrayOfObject);
      }
      if (this.wyQ != null)
      {
        paramArrayOfObject.iy(4, this.wyQ.computeSize());
        this.wyQ.writeFields(paramArrayOfObject);
      }
      if (this.wyR != null)
        paramArrayOfObject.e(5, this.wyR);
      if (this.wyS != null)
        paramArrayOfObject.e(6, this.wyS);
      AppMethodBeat.o(48876);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyN == null)
        break label736;
    label736: for (i = e.a.a.b.b.a.f(1, this.wyN) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wyO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wyO);
      i = paramInt;
      if (this.wyP != null)
        i = paramInt + e.a.a.a.ix(3, this.wyP.computeSize());
      paramInt = i;
      if (this.wyQ != null)
        paramInt = i + e.a.a.a.ix(4, this.wyQ.computeSize());
      i = paramInt;
      if (this.wyR != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wyR);
      paramInt = i;
      if (this.wyS != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wyS);
      AppMethodBeat.o(48876);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48876);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aur localaur = (aur)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48876);
          break;
        case 1:
          localaur.wyN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48876);
          paramInt = i;
          break;
        case 2:
          localaur.wyO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48876);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new wx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaur.wyP = ((wx)localObject1);
          }
          AppMethodBeat.o(48876);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new wx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((wx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaur.wyQ = ((wx)localObject1);
          }
          AppMethodBeat.o(48876);
          paramInt = i;
          break;
        case 5:
          localaur.wyR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48876);
          paramInt = i;
          break;
        case 6:
          localaur.wyS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48876);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48876);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aur
 * JD-Core Version:    0.6.2
 */