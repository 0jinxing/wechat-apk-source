package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class btq extends com.tencent.mm.bt.a
{
  public String vJS;
  public float wVA;
  public long wVB;
  public bif wVz;
  public cgv wbo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48960);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJS != null)
        paramArrayOfObject.e(1, this.vJS);
      if (this.wbo != null)
      {
        paramArrayOfObject.iy(2, this.wbo.computeSize());
        this.wbo.writeFields(paramArrayOfObject);
      }
      if (this.wVz != null)
      {
        paramArrayOfObject.iy(3, this.wVz.computeSize());
        this.wVz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.r(4, this.wVA);
      paramArrayOfObject.ai(5, this.wVB);
      AppMethodBeat.o(48960);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vJS == null)
        break label638;
    label638: for (i = e.a.a.b.b.a.f(1, this.vJS) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wbo != null)
        paramInt = i + e.a.a.a.ix(2, this.wbo.computeSize());
      i = paramInt;
      if (this.wVz != null)
        i = paramInt + e.a.a.a.ix(3, this.wVz.computeSize());
      paramInt = i + (e.a.a.b.b.a.fv(4) + 4) + e.a.a.b.b.a.o(5, this.wVB);
      AppMethodBeat.o(48960);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48960);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        btq localbtq = (btq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48960);
          break;
        case 1:
          localbtq.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48960);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtq.wbo = paramArrayOfObject;
          }
          AppMethodBeat.o(48960);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bif();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtq.wVz = paramArrayOfObject;
          }
          AppMethodBeat.o(48960);
          paramInt = i;
          break;
        case 4:
          localbtq.wVA = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(48960);
          paramInt = i;
          break;
        case 5:
          localbtq.wVB = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48960);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48960);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.btq
 * JD-Core Version:    0.6.2
 */