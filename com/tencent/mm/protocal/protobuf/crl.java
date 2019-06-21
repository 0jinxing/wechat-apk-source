package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class crl extends com.tencent.mm.bt.a
{
  public String username;
  public String xoP;
  public cql xoU;
  public String xpf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102423);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_request");
        AppMethodBeat.o(102423);
        throw paramArrayOfObject;
      }
      if (this.xoU != null)
      {
        paramArrayOfObject.iy(1, this.xoU.computeSize());
        this.xoU.writeFields(paramArrayOfObject);
      }
      if (this.username != null)
        paramArrayOfObject.e(2, this.username);
      if (this.xoP != null)
        paramArrayOfObject.e(3, this.xoP);
      if (this.xpf != null)
        paramArrayOfObject.e(4, this.xpf);
      AppMethodBeat.o(102423);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoU == null)
        break label564;
    label564: for (paramInt = e.a.a.a.ix(1, this.xoU.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.username != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.username);
      paramInt = i;
      if (this.xoP != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xoP);
      i = paramInt;
      if (this.xpf != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xpf);
      AppMethodBeat.o(102423);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xoU == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: base_request");
          AppMethodBeat.o(102423);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102423);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crl localcrl = (crl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102423);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cql();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrl.xoU = paramArrayOfObject;
          }
          AppMethodBeat.o(102423);
          paramInt = i;
          break;
        case 2:
          localcrl.username = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102423);
          paramInt = i;
          break;
        case 3:
          localcrl.xoP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102423);
          paramInt = i;
          break;
        case 4:
          localcrl.xpf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102423);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102423);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crl
 * JD-Core Version:    0.6.2
 */