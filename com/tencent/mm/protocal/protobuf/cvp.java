package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cvp extends com.tencent.mm.bt.a
{
  public String Md5;
  public String vMJ;
  public int xrE;
  public int xrF;
  public cvs xrG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63696);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Md5 == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Md5");
        AppMethodBeat.o(63696);
        throw paramArrayOfObject;
      }
      if (this.vMJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DownloadUrl");
        AppMethodBeat.o(63696);
        throw paramArrayOfObject;
      }
      if (this.Md5 != null)
        paramArrayOfObject.e(1, this.Md5);
      if (this.vMJ != null)
        paramArrayOfObject.e(2, this.vMJ);
      paramArrayOfObject.iz(3, this.xrE);
      paramArrayOfObject.iz(4, this.xrF);
      if (this.xrG != null)
      {
        paramArrayOfObject.iy(5, this.xrG.computeSize());
        this.xrG.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(63696);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Md5 == null)
        break label639;
    label639: for (paramInt = e.a.a.b.b.a.f(1, this.Md5) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vMJ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vMJ);
      i = i + e.a.a.b.b.a.bs(3, this.xrE) + e.a.a.b.b.a.bs(4, this.xrF);
      paramInt = i;
      if (this.xrG != null)
        paramInt = i + e.a.a.a.ix(5, this.xrG.computeSize());
      AppMethodBeat.o(63696);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Md5 == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Md5");
          AppMethodBeat.o(63696);
          throw paramArrayOfObject;
        }
        if (this.vMJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DownloadUrl");
          AppMethodBeat.o(63696);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63696);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvp localcvp = (cvp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63696);
          break;
        case 1:
          localcvp.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63696);
          paramInt = i;
          break;
        case 2:
          localcvp.vMJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63696);
          paramInt = i;
          break;
        case 3:
          localcvp.xrE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(63696);
          paramInt = i;
          break;
        case 4:
          localcvp.xrF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(63696);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cvs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvp.xrG = paramArrayOfObject;
          }
          AppMethodBeat.o(63696);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(63696);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvp
 * JD-Core Version:    0.6.2
 */