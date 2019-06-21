package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class mn extends com.tencent.mm.bt.a
{
  public int jCt;
  public ml vQA;
  public mg vQv;
  public mf vQw;
  public long vQx;
  public mm vQy;
  public mp vQz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124300);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCt);
      if (this.vQv != null)
      {
        paramArrayOfObject.iy(2, this.vQv.computeSize());
        this.vQv.writeFields(paramArrayOfObject);
      }
      if (this.vQw != null)
      {
        paramArrayOfObject.iy(3, this.vQw.computeSize());
        this.vQw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(4, this.vQx);
      if (this.vQy != null)
      {
        paramArrayOfObject.iy(5, this.vQy.computeSize());
        this.vQy.writeFields(paramArrayOfObject);
      }
      if (this.vQz != null)
      {
        paramArrayOfObject.iy(6, this.vQz.computeSize());
        this.vQz.writeFields(paramArrayOfObject);
      }
      if (this.vQA != null)
      {
        paramArrayOfObject.iy(7, this.vQA.computeSize());
        this.vQA.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(124300);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.jCt) + 0;
        paramInt = i;
        if (this.vQv != null)
          paramInt = i + e.a.a.a.ix(2, this.vQv.computeSize());
        i = paramInt;
        if (this.vQw != null)
          i = paramInt + e.a.a.a.ix(3, this.vQw.computeSize());
        i += e.a.a.b.b.a.o(4, this.vQx);
        paramInt = i;
        if (this.vQy != null)
          paramInt = i + e.a.a.a.ix(5, this.vQy.computeSize());
        i = paramInt;
        if (this.vQz != null)
          i = paramInt + e.a.a.a.ix(6, this.vQz.computeSize());
        paramInt = i;
        if (this.vQA != null)
          paramInt = i + e.a.a.a.ix(7, this.vQA.computeSize());
        AppMethodBeat.o(124300);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124300);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mn localmn = (mn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124300);
          break;
        case 1:
          localmn.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124300);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmn.vQv = paramArrayOfObject;
          }
          AppMethodBeat.o(124300);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmn.vQw = ((mf)localObject1);
          }
          AppMethodBeat.o(124300);
          paramInt = 0;
          break;
        case 4:
          localmn.vQx = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124300);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmn.vQy = ((mm)localObject1);
          }
          AppMethodBeat.o(124300);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmn.vQz = paramArrayOfObject;
          }
          AppMethodBeat.o(124300);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ml();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmn.vQA = paramArrayOfObject;
          }
          AppMethodBeat.o(124300);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124300);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mn
 * JD-Core Version:    0.6.2
 */