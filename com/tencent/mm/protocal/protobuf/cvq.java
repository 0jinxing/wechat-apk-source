package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cvq extends com.tencent.mm.bt.a
{
  public String wjQ;
  public String wjS;
  public cvp xrx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63697);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wjQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Rid");
        AppMethodBeat.o(63697);
        throw paramArrayOfObject;
      }
      if (this.wjS == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MimeType");
        AppMethodBeat.o(63697);
        throw paramArrayOfObject;
      }
      if (this.xrx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DownloadInfo");
        AppMethodBeat.o(63697);
        throw paramArrayOfObject;
      }
      if (this.wjQ != null)
        paramArrayOfObject.e(1, this.wjQ);
      if (this.wjS != null)
        paramArrayOfObject.e(2, this.wjS);
      if (this.xrx != null)
      {
        paramArrayOfObject.iy(3, this.xrx.computeSize());
        this.xrx.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(63697);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wjQ == null)
        break label598;
    label598: for (i = e.a.a.b.b.a.f(1, this.wjQ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wjS != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wjS);
      i = paramInt;
      if (this.xrx != null)
        i = paramInt + e.a.a.a.ix(3, this.xrx.computeSize());
      AppMethodBeat.o(63697);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wjQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Rid");
          AppMethodBeat.o(63697);
          throw paramArrayOfObject;
        }
        if (this.wjS == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MimeType");
          AppMethodBeat.o(63697);
          throw paramArrayOfObject;
        }
        if (this.xrx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DownloadInfo");
          AppMethodBeat.o(63697);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63697);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cvq localcvq = (cvq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63697);
          break;
        case 1:
          localcvq.wjQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63697);
          paramInt = i;
          break;
        case 2:
          localcvq.wjS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63697);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cvp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cvp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcvq.xrx = ((cvp)localObject1);
          }
          AppMethodBeat.o(63697);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(63697);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvq
 * JD-Core Version:    0.6.2
 */