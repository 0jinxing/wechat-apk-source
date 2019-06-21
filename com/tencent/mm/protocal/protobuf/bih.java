package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bih extends com.tencent.mm.bt.a
{
  public String vCb;
  public String wLA;
  public int wLB;
  public LinkedList<np> wLC;
  public String wLD;
  public String wLE;
  public String wLy;
  public String wLz;

  public bih()
  {
    AppMethodBeat.i(89114);
    this.wLC = new LinkedList();
    AppMethodBeat.o(89114);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89115);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vCb != null)
        paramArrayOfObject.e(1, this.vCb);
      if (this.wLy != null)
        paramArrayOfObject.e(2, this.wLy);
      if (this.wLz != null)
        paramArrayOfObject.e(3, this.wLz);
      if (this.wLA != null)
        paramArrayOfObject.e(4, this.wLA);
      paramArrayOfObject.iz(5, this.wLB);
      paramArrayOfObject.e(6, 8, this.wLC);
      if (this.wLD != null)
        paramArrayOfObject.e(7, this.wLD);
      if (this.wLE != null)
        paramArrayOfObject.e(8, this.wLE);
      AppMethodBeat.o(89115);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vCb == null)
        break label745;
    label745: for (i = e.a.a.b.b.a.f(1, this.vCb) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wLy != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wLy);
      i = paramInt;
      if (this.wLz != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wLz);
      paramInt = i;
      if (this.wLA != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wLA);
      i = paramInt + e.a.a.b.b.a.bs(5, this.wLB) + e.a.a.a.c(6, 8, this.wLC);
      paramInt = i;
      if (this.wLD != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wLD);
      i = paramInt;
      if (this.wLE != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wLE);
      AppMethodBeat.o(89115);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wLC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89115);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bih localbih = (bih)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89115);
          break;
        case 1:
          localbih.vCb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        case 2:
          localbih.wLy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        case 3:
          localbih.wLz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        case 4:
          localbih.wLA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        case 5:
          localbih.wLB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new np();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((np)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbih.wLC.add(localObject1);
          }
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        case 7:
          localbih.wLD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        case 8:
          localbih.wLE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89115);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89115);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bih
 * JD-Core Version:    0.6.2
 */