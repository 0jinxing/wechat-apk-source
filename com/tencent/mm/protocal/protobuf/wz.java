package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class wz extends com.tencent.mm.bt.a
{
  public String kbW;
  public String title;
  public int wcU;
  public LinkedList<tm> wcV;

  public wz()
  {
    AppMethodBeat.i(89063);
    this.wcV = new LinkedList();
    AppMethodBeat.o(89063);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89064);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.kbW != null)
        paramArrayOfObject.e(2, this.kbW);
      paramArrayOfObject.iz(3, this.wcU);
      paramArrayOfObject.e(4, 8, this.wcV);
      AppMethodBeat.o(89064);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label484;
    label484: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kbW != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kbW);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wcU) + e.a.a.a.c(4, 8, this.wcV);
      AppMethodBeat.o(89064);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wcV.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89064);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        wz localwz = (wz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89064);
          break;
        case 1:
          localwz.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89064);
          paramInt = i;
          break;
        case 2:
          localwz.kbW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89064);
          paramInt = i;
          break;
        case 3:
          localwz.wcU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89064);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localwz.wcV.add(paramArrayOfObject);
          }
          AppMethodBeat.o(89064);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89064);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.wz
 * JD-Core Version:    0.6.2
 */