package com.tencent.mm.protocal.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aaz;
import java.util.LinkedList;

public final class c extends com.tencent.mm.bt.a
{
  public String desc;
  public LinkedList<aar> fjr;
  public long lgR;
  public String title;
  public String vzJ;
  public aaz vzK;

  public c()
  {
    AppMethodBeat.i(111120);
    this.fjr = new LinkedList();
    AppMethodBeat.o(111120);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111121);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      paramArrayOfObject.e(3, 8, this.fjr);
      if (this.vzJ != null)
        paramArrayOfObject.e(4, this.vzJ);
      if (this.vzK != null)
      {
        paramArrayOfObject.iy(5, this.vzK.computeSize());
        this.vzK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.lgR);
      AppMethodBeat.o(111121);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label707;
    label707: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.desc);
      i += e.a.a.a.c(3, 8, this.fjr);
      paramInt = i;
      if (this.vzJ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vzJ);
      i = paramInt;
      if (this.vzK != null)
        i = paramInt + e.a.a.a.ix(5, this.vzK.computeSize());
      paramInt = i + e.a.a.b.b.a.o(6, this.lgR);
      AppMethodBeat.o(111121);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.fjr.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111121);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111121);
          break;
        case 1:
          localc.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111121);
          paramInt = i;
          break;
        case 2:
          localc.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111121);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aar();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aar)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.fjr.add(localObject1);
          }
          AppMethodBeat.o(111121);
          paramInt = i;
          break;
        case 4:
          localc.vzJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111121);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aaz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.vzK = paramArrayOfObject;
          }
          AppMethodBeat.o(111121);
          paramInt = i;
          break;
        case 6:
          localc.lgR = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(111121);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111121);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.b.a.c
 * JD-Core Version:    0.6.2
 */