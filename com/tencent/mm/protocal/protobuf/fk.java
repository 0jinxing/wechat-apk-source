package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class fk extends bsr
{
  public String pMd;
  public String pbn;
  public String vHs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48773);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.pMd != null)
        paramArrayOfObject.e(2, this.pMd);
      if (this.pbn != null)
        paramArrayOfObject.e(3, this.pbn);
      if (this.vHs != null)
        paramArrayOfObject.e(4, this.vHs);
      AppMethodBeat.o(48773);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label512;
    label512: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pMd != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pMd);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pbn);
      paramInt = i;
      if (this.vHs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vHs);
      AppMethodBeat.o(48773);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48773);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fk localfk = (fk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48773);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfk.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(48773);
          paramInt = i;
          break;
        case 2:
          localfk.pMd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48773);
          paramInt = i;
          break;
        case 3:
          localfk.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48773);
          paramInt = i;
          break;
        case 4:
          localfk.vHs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48773);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48773);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fk
 * JD-Core Version:    0.6.2
 */