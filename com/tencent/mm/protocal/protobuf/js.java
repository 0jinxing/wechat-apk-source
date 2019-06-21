package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class js extends bsr
{
  public String mac;
  public String vMg;
  public String vMh;
  public long vMi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10160);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vMg != null)
        paramArrayOfObject.e(2, this.vMg);
      if (this.vMh != null)
        paramArrayOfObject.e(3, this.vMh);
      if (this.mac != null)
        paramArrayOfObject.e(4, this.mac);
      paramArrayOfObject.ai(5, this.vMi);
      AppMethodBeat.o(10160);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label571;
    label571: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vMg != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vMg);
      paramInt = i;
      if (this.vMh != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vMh);
      i = paramInt;
      if (this.mac != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mac);
      paramInt = i + e.a.a.b.b.a.o(5, this.vMi);
      AppMethodBeat.o(10160);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10160);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        js localjs = (js)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10160);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjs.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10160);
          paramInt = i;
          break;
        case 2:
          localjs.vMg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10160);
          paramInt = i;
          break;
        case 3:
          localjs.vMh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10160);
          paramInt = i;
          break;
        case 4:
          localjs.mac = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10160);
          paramInt = i;
          break;
        case 5:
          localjs.vMi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(10160);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10160);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.js
 * JD-Core Version:    0.6.2
 */