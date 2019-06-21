package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cfb extends com.tencent.mm.bt.a
{
  public String Id;
  public String jBB;
  public int pcX;
  public long timeStamp;
  public cea xeA;
  public String xeB;
  public int xeC;
  public int xeD;
  public cei xez;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56547);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Id != null)
        paramArrayOfObject.e(1, this.Id);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      paramArrayOfObject.iz(3, this.pcX);
      if (this.xez != null)
      {
        paramArrayOfObject.iy(4, this.xez.computeSize());
        this.xez.writeFields(paramArrayOfObject);
      }
      if (this.xeA != null)
      {
        paramArrayOfObject.iy(5, this.xeA.computeSize());
        this.xeA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.timeStamp);
      if (this.xeB != null)
        paramArrayOfObject.e(7, this.xeB);
      paramArrayOfObject.iz(8, this.xeC);
      paramArrayOfObject.iz(9, this.xeD);
      AppMethodBeat.o(56547);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Id == null)
        break label864;
    label864: for (paramInt = e.a.a.b.b.a.f(1, this.Id) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
      i += e.a.a.b.b.a.bs(3, this.pcX);
      paramInt = i;
      if (this.xez != null)
        paramInt = i + e.a.a.a.ix(4, this.xez.computeSize());
      i = paramInt;
      if (this.xeA != null)
        i = paramInt + e.a.a.a.ix(5, this.xeA.computeSize());
      i += e.a.a.b.b.a.o(6, this.timeStamp);
      paramInt = i;
      if (this.xeB != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.xeB);
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.xeC) + e.a.a.b.b.a.bs(9, this.xeD);
      AppMethodBeat.o(56547);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56547);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfb localcfb = (cfb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56547);
          break;
        case 1:
          localcfb.Id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 2:
          localcfb.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 3:
          localcfb.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cei();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cei)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfb.xez = ((cei)localObject1);
          }
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cea();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfb.xeA = paramArrayOfObject;
          }
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 6:
          localcfb.timeStamp = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 7:
          localcfb.xeB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 8:
          localcfb.xeC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        case 9:
          localcfb.xeD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56547);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56547);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfb
 * JD-Core Version:    0.6.2
 */