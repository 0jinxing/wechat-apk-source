package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cri extends com.tencent.mm.bt.a
{
  public cre xoZ;
  public cqu xpa;
  public String xpb;
  public String xpc;
  public String xpd;
  public int xpe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102420);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoZ != null)
      {
        paramArrayOfObject.iy(1, this.xoZ.computeSize());
        this.xoZ.writeFields(paramArrayOfObject);
      }
      if (this.xpa != null)
      {
        paramArrayOfObject.iy(2, this.xpa.computeSize());
        this.xpa.writeFields(paramArrayOfObject);
      }
      if (this.xpb != null)
        paramArrayOfObject.e(3, this.xpb);
      if (this.xpc != null)
        paramArrayOfObject.e(4, this.xpc);
      if (this.xpd != null)
        paramArrayOfObject.e(5, this.xpd);
      paramArrayOfObject.iz(6, this.xpe);
      AppMethodBeat.o(102420);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoZ == null)
        break label719;
    label719: for (paramInt = e.a.a.a.ix(1, this.xoZ.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xpa != null)
        i = paramInt + e.a.a.a.ix(2, this.xpa.computeSize());
      paramInt = i;
      if (this.xpb != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xpb);
      i = paramInt;
      if (this.xpc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xpc);
      paramInt = i;
      if (this.xpd != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xpd);
      paramInt += e.a.a.b.b.a.bs(6, this.xpe);
      AppMethodBeat.o(102420);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102420);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cri localcri = (cri)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102420);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cre();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcri.xoZ = paramArrayOfObject;
          }
          AppMethodBeat.o(102420);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cqu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cqu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcri.xpa = ((cqu)localObject1);
          }
          AppMethodBeat.o(102420);
          paramInt = i;
          break;
        case 3:
          localcri.xpb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102420);
          paramInt = i;
          break;
        case 4:
          localcri.xpc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102420);
          paramInt = i;
          break;
        case 5:
          localcri.xpd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102420);
          paramInt = i;
          break;
        case 6:
          localcri.xpe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102420);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102420);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cri
 * JD-Core Version:    0.6.2
 */