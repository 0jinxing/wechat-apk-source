package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cgb extends com.tencent.mm.bt.a
{
  public String vEn;
  public String xfb;
  public cxr xfe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114991);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xfb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: WxaUserName");
        AppMethodBeat.o(114991);
        throw paramArrayOfObject;
      }
      if (this.xfb != null)
        paramArrayOfObject.e(1, this.xfb);
      if (this.xfe != null)
      {
        paramArrayOfObject.iy(2, this.xfe.computeSize());
        this.xfe.writeFields(paramArrayOfObject);
      }
      if (this.vEn != null)
        paramArrayOfObject.e(3, this.vEn);
      AppMethodBeat.o(114991);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xfb == null)
        break label501;
    label501: for (i = e.a.a.b.b.a.f(1, this.xfb) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xfe != null)
        paramInt = i + e.a.a.a.ix(2, this.xfe.computeSize());
      i = paramInt;
      if (this.vEn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vEn);
      AppMethodBeat.o(114991);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xfb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: WxaUserName");
          AppMethodBeat.o(114991);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(114991);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgb localcgb = (cgb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114991);
          break;
        case 1:
          localcgb.xfb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114991);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgb.xfe = paramArrayOfObject;
          }
          AppMethodBeat.o(114991);
          paramInt = i;
          break;
        case 3:
          localcgb.vEn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114991);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114991);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgb
 * JD-Core Version:    0.6.2
 */