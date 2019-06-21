package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ce extends bsr
{
  public String Url;
  public int vAM;
  public String vAN;
  public String vEn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28302);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vEn != null)
        paramArrayOfObject.e(2, this.vEn);
      if (this.Url != null)
        paramArrayOfObject.e(3, this.Url);
      paramArrayOfObject.iz(4, this.vAM);
      if (this.vAN != null)
        paramArrayOfObject.e(5, this.vAN);
      AppMethodBeat.o(28302);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label570;
    label570: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vEn != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vEn);
      i = paramInt;
      if (this.Url != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Url);
      i += e.a.a.b.b.a.bs(4, this.vAM);
      paramInt = i;
      if (this.vAN != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vAN);
      AppMethodBeat.o(28302);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28302);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ce localce = (ce)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28302);
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
            localce.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28302);
          paramInt = i;
          break;
        case 2:
          localce.vEn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28302);
          paramInt = i;
          break;
        case 3:
          localce.Url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28302);
          paramInt = i;
          break;
        case 4:
          localce.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28302);
          paramInt = i;
          break;
        case 5:
          localce.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28302);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28302);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ce
 * JD-Core Version:    0.6.2
 */